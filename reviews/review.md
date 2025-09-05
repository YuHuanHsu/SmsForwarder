# Review Summary – Stories 1.1 & 1.2

This document records the gaps I found while inspecting the current repository against the acceptance criteria for
**Story 1.1 – 扩展 TelegramSetting 数据模型** and **Story 1.2 – 增强 TelegramUtils 发送逻辑**.  It also suggests
straight‑forward actions to close each gap.

## 1.1 Extend TelegramSetting

| Gap | Reason | Suggested Fix |
|------|--------|---------------|
| **Room entity does not expose new columns** | `TelegramSetting` now has `messageThreadId` and `chatType`, but the *Sender* entity's `jsonSetting` only serialises the whole object. The Room schema lacks corresponding column updates that might be required if we later persist separate fields. | Add the two fields to the `Sender` table via a migration or keep them embedded in the JSON.  If you plan to query on them, create a new column with a compatible migration.
| **No backward‑compatibility migration** | Existing JSON stored in the database omits the new keys.  `Gson` ignores missing fields, so this is technically safe, but if you change the default values or add non‑nullable fields it will break. | Ensure defaults are nullable or provide a JSON schema migration function that fills missing values.
| **`TelegramSetting.getMethodCheckId()` & `getProxyTypeCheckId()` not updated** | These still reference old radio groups and do not handle the new `chatType` or `messageThreadId` logic. | Update these getters to include defaults for the new fields and to map `chatType` to UI IDs.
| **`isForumGroup()` / `isChannel()` missing** | The story lists these helper methods but they are absent in the current source. | Implement in `TelegramSetting.kt` with simple string comparisons.
| **No unit tests added** | The story promises 100 % coverage of new methods, but the repo’s test folder has no related tests. | Create `TelegramSettingTest.kt` with scenarios for default values, JSON round‑trip, and helper methods.

## 1.2 Improve TelegramUtils Send Logic

| Gap | Reason | Suggested Fix |
|------|--------|---------------|
| **`TelegramUtils.sendMsg` missing thread_id handling** | The current implementation builds a form body with only `chat_id` and `text`. | Extend the body to include `message_thread_id` when `TelegramSetting.chatType == "forum"` and a non‑null `messageThreadId`.
| **No detection of channel vs. group** | There is no logic to parse an `@channel` username or distinguish numeric IDs. | Add a helper `detectChatType()` that sets `chatType` accordingly or throws an exception for unsupported formats.
| **Error handling is minimal** | The method only logs exceptions without propagating errors to the caller. | Wrap the HTTP call in a try/catch that throws a custom `TelegramException` with the API error message.
| **No logging of request/response** | Debugging is difficult without seeing the payload. | Log the constructed URL, request body, response code, and body using Android's `Log` or a custom logger.
| **Missing unit tests** | No test file exists to verify success/failure scenarios, thread_id usage, or channel sending. | Add `TelegramUtilsTest.kt` that mocks `OkHttpClient`, verifies correct parameters, and checks error handling.
| **No Kotlin‑style companion for defaults** | The story references constants like `CHAT_TYPE_FORUM` but they are undefined. | Define these constants in `TelegramUtils` or `TelegramSetting` and use them consistently.

## Next Steps

1. Update the **data model** (`TelegramSetting.kt`) with new properties, getters, and helper methods.
2. Add **Room migration** or keep data in JSON if no queries will use the new values.
3. Extend **TelegramUtils** (`TelegramUtils.kt`) to build requests with optional `message_thread_id`, detect chat type, and provide robust error handling and logging.
3. Create **unit test suites** for both classes to meet the AC of 100 % coverage.
4. Run `./gradlew test` (or equivalent) to ensure all existing tests pass.
5. Commit the changes, update the CI configuration if needed, and re‑run the test suite.

Feel free to adjust the migration strategy or UI mapping based on how aggressive you want the query‑able fields to be.

