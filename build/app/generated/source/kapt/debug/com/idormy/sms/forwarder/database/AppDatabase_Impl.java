package com.idormy.sms.forwarder.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.room.util.ViewInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.idormy.sms.forwarder.database.dao.FrpcDao;
import com.idormy.sms.forwarder.database.dao.FrpcDao_Impl;
import com.idormy.sms.forwarder.database.dao.LogsDao;
import com.idormy.sms.forwarder.database.dao.LogsDao_Impl;
import com.idormy.sms.forwarder.database.dao.MsgDao;
import com.idormy.sms.forwarder.database.dao.MsgDao_Impl;
import com.idormy.sms.forwarder.database.dao.RuleDao;
import com.idormy.sms.forwarder.database.dao.RuleDao_Impl;
import com.idormy.sms.forwarder.database.dao.SenderDao;
import com.idormy.sms.forwarder.database.dao.SenderDao_Impl;
import com.idormy.sms.forwarder.database.dao.TaskDao;
import com.idormy.sms.forwarder.database.dao.TaskDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile FrpcDao _frpcDao;

  private volatile MsgDao _msgDao;

  private volatile LogsDao _logsDao;

  private volatile RuleDao _ruleDao;

  private volatile SenderDao _senderDao;

  private volatile TaskDao _taskDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(20) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Frpc` (`uid` TEXT NOT NULL, `name` TEXT NOT NULL, `config` TEXT NOT NULL, `autorun` INTEGER NOT NULL DEFAULT 0, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Msg` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL DEFAULT 'sms', `from` TEXT NOT NULL DEFAULT '', `content` TEXT NOT NULL DEFAULT '', `sim_slot` INTEGER NOT NULL DEFAULT -1, `sim_info` TEXT NOT NULL DEFAULT '', `sub_id` INTEGER NOT NULL DEFAULT 0, `call_type` INTEGER NOT NULL DEFAULT 0, `time` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Msg_id` ON `Msg` (`id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Logs` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL DEFAULT 'sms', `msg_id` INTEGER NOT NULL DEFAULT 0, `rule_id` INTEGER NOT NULL DEFAULT 0, `sender_id` INTEGER NOT NULL DEFAULT 0, `forward_status` INTEGER NOT NULL DEFAULT 1, `forward_response` TEXT NOT NULL DEFAULT '', `time` INTEGER NOT NULL, FOREIGN KEY(`msg_id`) REFERENCES `Msg`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`rule_id`) REFERENCES `Rule`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`sender_id`) REFERENCES `Sender`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Logs_id` ON `Logs` (`id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Logs_msg_id` ON `Logs` (`msg_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Logs_rule_id` ON `Logs` (`rule_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Logs_sender_id` ON `Logs` (`sender_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Rule` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL DEFAULT 'sms', `filed` TEXT NOT NULL DEFAULT 'transpond_all', `check` TEXT NOT NULL DEFAULT 'is', `value` TEXT NOT NULL DEFAULT '', `sender_id` INTEGER NOT NULL DEFAULT 0, `sms_template` TEXT NOT NULL DEFAULT '', `regex_replace` TEXT NOT NULL DEFAULT '', `sim_slot` TEXT NOT NULL DEFAULT 'ALL', `status` INTEGER NOT NULL DEFAULT 1, `time` INTEGER NOT NULL, `sender_list` TEXT NOT NULL DEFAULT '', `sender_logic` TEXT NOT NULL DEFAULT 'ALL', `silent_period_start` INTEGER NOT NULL DEFAULT 0, `silent_period_end` INTEGER NOT NULL DEFAULT 0, `silent_day_of_week` TEXT NOT NULL DEFAULT '', FOREIGN KEY(`sender_id`) REFERENCES `Sender`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Rule_id` ON `Rule` (`id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Rule_sender_id` ON `Rule` (`sender_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Rule_sender_list` ON `Rule` (`sender_list`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Sender` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` INTEGER NOT NULL DEFAULT 1, `name` TEXT NOT NULL DEFAULT '', `json_setting` TEXT NOT NULL DEFAULT '', `status` INTEGER NOT NULL DEFAULT 1, `time` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Task` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` INTEGER NOT NULL DEFAULT 1, `name` TEXT NOT NULL DEFAULT '', `description` TEXT NOT NULL DEFAULT '', `conditions` TEXT NOT NULL DEFAULT '', `actions` TEXT NOT NULL DEFAULT '', `status` INTEGER NOT NULL DEFAULT 1, `last_exec_time` INTEGER NOT NULL, `next_exec_time` INTEGER NOT NULL)");
        _db.execSQL("CREATE VIEW `LogsDetail` AS SELECT LOGS.id,LOGS.type,LOGS.msg_id,LOGS.rule_id,LOGS.sender_id,LOGS.forward_status,LOGS.forward_response,LOGS.TIME,Rule.filed AS rule_filed,Rule.`check` AS rule_check,Rule.value AS rule_value,Rule.sim_slot AS rule_sim_slot,Sender.type AS sender_type,Sender.NAME AS sender_name FROM LOGS  LEFT JOIN Rule ON LOGS.rule_id = Rule.id LEFT JOIN Sender ON LOGS.sender_id = Sender.id");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ac6426932a68ca3ac7e8b1047b7efd53')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Frpc`");
        _db.execSQL("DROP TABLE IF EXISTS `Msg`");
        _db.execSQL("DROP TABLE IF EXISTS `Logs`");
        _db.execSQL("DROP TABLE IF EXISTS `Rule`");
        _db.execSQL("DROP TABLE IF EXISTS `Sender`");
        _db.execSQL("DROP TABLE IF EXISTS `Task`");
        _db.execSQL("DROP VIEW IF EXISTS `LogsDetail`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFrpc = new HashMap<String, TableInfo.Column>(5);
        _columnsFrpc.put("uid", new TableInfo.Column("uid", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFrpc.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFrpc.put("config", new TableInfo.Column("config", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFrpc.put("autorun", new TableInfo.Column("autorun", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsFrpc.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFrpc = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFrpc = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFrpc = new TableInfo("Frpc", _columnsFrpc, _foreignKeysFrpc, _indicesFrpc);
        final TableInfo _existingFrpc = TableInfo.read(_db, "Frpc");
        if (! _infoFrpc.equals(_existingFrpc)) {
          return new RoomOpenHelper.ValidationResult(false, "Frpc(com.idormy.sms.forwarder.database.entity.Frpc).\n"
                  + " Expected:\n" + _infoFrpc + "\n"
                  + " Found:\n" + _existingFrpc);
        }
        final HashMap<String, TableInfo.Column> _columnsMsg = new HashMap<String, TableInfo.Column>(9);
        _columnsMsg.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMsg.put("type", new TableInfo.Column("type", "TEXT", true, 0, "'sms'", TableInfo.CREATED_FROM_ENTITY));
        _columnsMsg.put("from", new TableInfo.Column("from", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsMsg.put("content", new TableInfo.Column("content", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsMsg.put("sim_slot", new TableInfo.Column("sim_slot", "INTEGER", true, 0, "-1", TableInfo.CREATED_FROM_ENTITY));
        _columnsMsg.put("sim_info", new TableInfo.Column("sim_info", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsMsg.put("sub_id", new TableInfo.Column("sub_id", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsMsg.put("call_type", new TableInfo.Column("call_type", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsMsg.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMsg = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMsg = new HashSet<TableInfo.Index>(1);
        _indicesMsg.add(new TableInfo.Index("index_Msg_id", true, Arrays.asList("id"), Arrays.asList("ASC")));
        final TableInfo _infoMsg = new TableInfo("Msg", _columnsMsg, _foreignKeysMsg, _indicesMsg);
        final TableInfo _existingMsg = TableInfo.read(_db, "Msg");
        if (! _infoMsg.equals(_existingMsg)) {
          return new RoomOpenHelper.ValidationResult(false, "Msg(com.idormy.sms.forwarder.database.entity.Msg).\n"
                  + " Expected:\n" + _infoMsg + "\n"
                  + " Found:\n" + _existingMsg);
        }
        final HashMap<String, TableInfo.Column> _columnsLogs = new HashMap<String, TableInfo.Column>(8);
        _columnsLogs.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLogs.put("type", new TableInfo.Column("type", "TEXT", true, 0, "'sms'", TableInfo.CREATED_FROM_ENTITY));
        _columnsLogs.put("msg_id", new TableInfo.Column("msg_id", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsLogs.put("rule_id", new TableInfo.Column("rule_id", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsLogs.put("sender_id", new TableInfo.Column("sender_id", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsLogs.put("forward_status", new TableInfo.Column("forward_status", "INTEGER", true, 0, "1", TableInfo.CREATED_FROM_ENTITY));
        _columnsLogs.put("forward_response", new TableInfo.Column("forward_response", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsLogs.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLogs = new HashSet<TableInfo.ForeignKey>(3);
        _foreignKeysLogs.add(new TableInfo.ForeignKey("Msg", "CASCADE", "CASCADE",Arrays.asList("msg_id"), Arrays.asList("id")));
        _foreignKeysLogs.add(new TableInfo.ForeignKey("Rule", "CASCADE", "CASCADE",Arrays.asList("rule_id"), Arrays.asList("id")));
        _foreignKeysLogs.add(new TableInfo.ForeignKey("Sender", "CASCADE", "CASCADE",Arrays.asList("sender_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesLogs = new HashSet<TableInfo.Index>(4);
        _indicesLogs.add(new TableInfo.Index("index_Logs_id", true, Arrays.asList("id"), Arrays.asList("ASC")));
        _indicesLogs.add(new TableInfo.Index("index_Logs_msg_id", false, Arrays.asList("msg_id"), Arrays.asList("ASC")));
        _indicesLogs.add(new TableInfo.Index("index_Logs_rule_id", false, Arrays.asList("rule_id"), Arrays.asList("ASC")));
        _indicesLogs.add(new TableInfo.Index("index_Logs_sender_id", false, Arrays.asList("sender_id"), Arrays.asList("ASC")));
        final TableInfo _infoLogs = new TableInfo("Logs", _columnsLogs, _foreignKeysLogs, _indicesLogs);
        final TableInfo _existingLogs = TableInfo.read(_db, "Logs");
        if (! _infoLogs.equals(_existingLogs)) {
          return new RoomOpenHelper.ValidationResult(false, "Logs(com.idormy.sms.forwarder.database.entity.Logs).\n"
                  + " Expected:\n" + _infoLogs + "\n"
                  + " Found:\n" + _existingLogs);
        }
        final HashMap<String, TableInfo.Column> _columnsRule = new HashMap<String, TableInfo.Column>(16);
        _columnsRule.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("type", new TableInfo.Column("type", "TEXT", true, 0, "'sms'", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("filed", new TableInfo.Column("filed", "TEXT", true, 0, "'transpond_all'", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("check", new TableInfo.Column("check", "TEXT", true, 0, "'is'", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("value", new TableInfo.Column("value", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("sender_id", new TableInfo.Column("sender_id", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("sms_template", new TableInfo.Column("sms_template", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("regex_replace", new TableInfo.Column("regex_replace", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("sim_slot", new TableInfo.Column("sim_slot", "TEXT", true, 0, "'ALL'", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("status", new TableInfo.Column("status", "INTEGER", true, 0, "1", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("sender_list", new TableInfo.Column("sender_list", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("sender_logic", new TableInfo.Column("sender_logic", "TEXT", true, 0, "'ALL'", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("silent_period_start", new TableInfo.Column("silent_period_start", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("silent_period_end", new TableInfo.Column("silent_period_end", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsRule.put("silent_day_of_week", new TableInfo.Column("silent_day_of_week", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRule = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysRule.add(new TableInfo.ForeignKey("Sender", "CASCADE", "CASCADE",Arrays.asList("sender_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesRule = new HashSet<TableInfo.Index>(3);
        _indicesRule.add(new TableInfo.Index("index_Rule_id", true, Arrays.asList("id"), Arrays.asList("ASC")));
        _indicesRule.add(new TableInfo.Index("index_Rule_sender_id", false, Arrays.asList("sender_id"), Arrays.asList("ASC")));
        _indicesRule.add(new TableInfo.Index("index_Rule_sender_list", false, Arrays.asList("sender_list"), Arrays.asList("ASC")));
        final TableInfo _infoRule = new TableInfo("Rule", _columnsRule, _foreignKeysRule, _indicesRule);
        final TableInfo _existingRule = TableInfo.read(_db, "Rule");
        if (! _infoRule.equals(_existingRule)) {
          return new RoomOpenHelper.ValidationResult(false, "Rule(com.idormy.sms.forwarder.database.entity.Rule).\n"
                  + " Expected:\n" + _infoRule + "\n"
                  + " Found:\n" + _existingRule);
        }
        final HashMap<String, TableInfo.Column> _columnsSender = new HashMap<String, TableInfo.Column>(6);
        _columnsSender.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSender.put("type", new TableInfo.Column("type", "INTEGER", true, 0, "1", TableInfo.CREATED_FROM_ENTITY));
        _columnsSender.put("name", new TableInfo.Column("name", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsSender.put("json_setting", new TableInfo.Column("json_setting", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsSender.put("status", new TableInfo.Column("status", "INTEGER", true, 0, "1", TableInfo.CREATED_FROM_ENTITY));
        _columnsSender.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSender = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSender = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSender = new TableInfo("Sender", _columnsSender, _foreignKeysSender, _indicesSender);
        final TableInfo _existingSender = TableInfo.read(_db, "Sender");
        if (! _infoSender.equals(_existingSender)) {
          return new RoomOpenHelper.ValidationResult(false, "Sender(com.idormy.sms.forwarder.database.entity.Sender).\n"
                  + " Expected:\n" + _infoSender + "\n"
                  + " Found:\n" + _existingSender);
        }
        final HashMap<String, TableInfo.Column> _columnsTask = new HashMap<String, TableInfo.Column>(9);
        _columnsTask.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTask.put("type", new TableInfo.Column("type", "INTEGER", true, 0, "1", TableInfo.CREATED_FROM_ENTITY));
        _columnsTask.put("name", new TableInfo.Column("name", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsTask.put("description", new TableInfo.Column("description", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsTask.put("conditions", new TableInfo.Column("conditions", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsTask.put("actions", new TableInfo.Column("actions", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        _columnsTask.put("status", new TableInfo.Column("status", "INTEGER", true, 0, "1", TableInfo.CREATED_FROM_ENTITY));
        _columnsTask.put("last_exec_time", new TableInfo.Column("last_exec_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTask.put("next_exec_time", new TableInfo.Column("next_exec_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTask = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTask = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTask = new TableInfo("Task", _columnsTask, _foreignKeysTask, _indicesTask);
        final TableInfo _existingTask = TableInfo.read(_db, "Task");
        if (! _infoTask.equals(_existingTask)) {
          return new RoomOpenHelper.ValidationResult(false, "Task(com.idormy.sms.forwarder.database.entity.Task).\n"
                  + " Expected:\n" + _infoTask + "\n"
                  + " Found:\n" + _existingTask);
        }
        final ViewInfo _infoLogsDetail = new ViewInfo("LogsDetail", "CREATE VIEW `LogsDetail` AS SELECT LOGS.id,LOGS.type,LOGS.msg_id,LOGS.rule_id,LOGS.sender_id,LOGS.forward_status,LOGS.forward_response,LOGS.TIME,Rule.filed AS rule_filed,Rule.`check` AS rule_check,Rule.value AS rule_value,Rule.sim_slot AS rule_sim_slot,Sender.type AS sender_type,Sender.NAME AS sender_name FROM LOGS  LEFT JOIN Rule ON LOGS.rule_id = Rule.id LEFT JOIN Sender ON LOGS.sender_id = Sender.id");
        final ViewInfo _existingLogsDetail = ViewInfo.read(_db, "LogsDetail");
        if (! _infoLogsDetail.equals(_existingLogsDetail)) {
          return new RoomOpenHelper.ValidationResult(false, "LogsDetail(com.idormy.sms.forwarder.database.entity.LogsDetail).\n"
                  + " Expected:\n" + _infoLogsDetail + "\n"
                  + " Found:\n" + _existingLogsDetail);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ac6426932a68ca3ac7e8b1047b7efd53", "5cfc1bfc7a57c8e71708e3b165d25d85");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(1);
    HashSet<String> _tables = new HashSet<String>(3);
    _tables.add("LOGS");
    _tables.add("Rule");
    _tables.add("Sender");
    _viewTables.put("logsdetail", _tables);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Frpc","Msg","Logs","Rule","Sender","Task");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `Frpc`");
      _db.execSQL("DELETE FROM `Msg`");
      _db.execSQL("DELETE FROM `Logs`");
      _db.execSQL("DELETE FROM `Rule`");
      _db.execSQL("DELETE FROM `Sender`");
      _db.execSQL("DELETE FROM `Task`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(FrpcDao.class, FrpcDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MsgDao.class, MsgDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LogsDao.class, LogsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RuleDao.class, RuleDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SenderDao.class, SenderDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TaskDao.class, TaskDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public FrpcDao frpcDao() {
    if (_frpcDao != null) {
      return _frpcDao;
    } else {
      synchronized(this) {
        if(_frpcDao == null) {
          _frpcDao = new FrpcDao_Impl(this);
        }
        return _frpcDao;
      }
    }
  }

  @Override
  public MsgDao msgDao() {
    if (_msgDao != null) {
      return _msgDao;
    } else {
      synchronized(this) {
        if(_msgDao == null) {
          _msgDao = new MsgDao_Impl(this);
        }
        return _msgDao;
      }
    }
  }

  @Override
  public LogsDao logsDao() {
    if (_logsDao != null) {
      return _logsDao;
    } else {
      synchronized(this) {
        if(_logsDao == null) {
          _logsDao = new LogsDao_Impl(this);
        }
        return _logsDao;
      }
    }
  }

  @Override
  public RuleDao ruleDao() {
    if (_ruleDao != null) {
      return _ruleDao;
    } else {
      synchronized(this) {
        if(_ruleDao == null) {
          _ruleDao = new RuleDao_Impl(this);
        }
        return _ruleDao;
      }
    }
  }

  @Override
  public SenderDao senderDao() {
    if (_senderDao != null) {
      return _senderDao;
    } else {
      synchronized(this) {
        if(_senderDao == null) {
          _senderDao = new SenderDao_Impl(this);
        }
        return _senderDao;
      }
    }
  }

  @Override
  public TaskDao taskDao() {
    if (_taskDao != null) {
      return _taskDao;
    } else {
      synchronized(this) {
        if(_taskDao == null) {
          _taskDao = new TaskDao_Impl(this);
        }
        return _taskDao;
      }
    }
  }
}
