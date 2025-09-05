package com.idormy.sms.forwarder.database.dao;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.idormy.sms.forwarder.database.entity.Rule;
import com.idormy.sms.forwarder.database.entity.Sender;
import com.idormy.sms.forwarder.database.ext.ConvertersDate;
import com.idormy.sms.forwarder.database.ext.ConvertersSenderList;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RuleDao_Impl implements RuleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Rule> __insertionAdapterOfRule;

  private final ConvertersDate __convertersDate = new ConvertersDate();

  private final ConvertersSenderList __convertersSenderList = new ConvertersSenderList();

  private final EntityDeletionOrUpdateAdapter<Rule> __deletionAdapterOfRule;

  private final EntityDeletionOrUpdateAdapter<Rule> __updateAdapterOfRule;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public RuleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRule = new EntityInsertionAdapter<Rule>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Rule` (`id`,`type`,`filed`,`check`,`value`,`sender_id`,`sms_template`,`regex_replace`,`sim_slot`,`status`,`time`,`sender_list`,`sender_logic`,`silent_period_start`,`silent_period_end`,`silent_day_of_week`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Rule value) {
        stmt.bindLong(1, value.getId());
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        if (value.getFiled() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFiled());
        }
        if (value.getCheck() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCheck());
        }
        if (value.getValue() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getValue());
        }
        stmt.bindLong(6, value.getSenderId());
        if (value.getSmsTemplate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSmsTemplate());
        }
        if (value.getRegexReplace() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getRegexReplace());
        }
        if (value.getSimSlot() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSimSlot());
        }
        stmt.bindLong(10, value.getStatus());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp);
        }
        final String _tmp_1 = __convertersSenderList.objectToString(value.getSenderList());
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_1);
        }
        if (value.getSenderLogic() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getSenderLogic());
        }
        stmt.bindLong(14, value.getSilentPeriodStart());
        stmt.bindLong(15, value.getSilentPeriodEnd());
        if (value.getSilentDayOfWeek() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getSilentDayOfWeek());
        }
      }
    };
    this.__deletionAdapterOfRule = new EntityDeletionOrUpdateAdapter<Rule>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Rule` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Rule value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfRule = new EntityDeletionOrUpdateAdapter<Rule>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Rule` SET `id` = ?,`type` = ?,`filed` = ?,`check` = ?,`value` = ?,`sender_id` = ?,`sms_template` = ?,`regex_replace` = ?,`sim_slot` = ?,`status` = ?,`time` = ?,`sender_list` = ?,`sender_logic` = ?,`silent_period_start` = ?,`silent_period_end` = ?,`silent_day_of_week` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Rule value) {
        stmt.bindLong(1, value.getId());
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        if (value.getFiled() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFiled());
        }
        if (value.getCheck() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCheck());
        }
        if (value.getValue() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getValue());
        }
        stmt.bindLong(6, value.getSenderId());
        if (value.getSmsTemplate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSmsTemplate());
        }
        if (value.getRegexReplace() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getRegexReplace());
        }
        if (value.getSimSlot() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSimSlot());
        }
        stmt.bindLong(10, value.getStatus());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp);
        }
        final String _tmp_1 = __convertersSenderList.objectToString(value.getSenderList());
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_1);
        }
        if (value.getSenderLogic() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getSenderLogic());
        }
        stmt.bindLong(14, value.getSilentPeriodStart());
        stmt.bindLong(15, value.getSilentPeriodEnd());
        if (value.getSilentDayOfWeek() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getSilentDayOfWeek());
        }
        stmt.bindLong(17, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Rule where id=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Rule";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Rule rule) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRule.insert(rule);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable delete(final Rule rule) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRule.handle(rule);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void update(final Rule rule) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfRule.handle(rule);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Single<Rule> get(final long id) {
    final String _sql = "SELECT * FROM Rule where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<Rule>() {
      @Override
      public Rule call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfFiled = CursorUtil.getColumnIndexOrThrow(_cursor, "filed");
          final int _cursorIndexOfCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "check");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_id");
          final int _cursorIndexOfSmsTemplate = CursorUtil.getColumnIndexOrThrow(_cursor, "sms_template");
          final int _cursorIndexOfRegexReplace = CursorUtil.getColumnIndexOrThrow(_cursor, "regex_replace");
          final int _cursorIndexOfSimSlot = CursorUtil.getColumnIndexOrThrow(_cursor, "sim_slot");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfSenderList = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_list");
          final int _cursorIndexOfSenderLogic = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_logic");
          final int _cursorIndexOfSilentPeriodStart = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_period_start");
          final int _cursorIndexOfSilentPeriodEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_period_end");
          final int _cursorIndexOfSilentDayOfWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_day_of_week");
          final Rule _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpFiled;
            if (_cursor.isNull(_cursorIndexOfFiled)) {
              _tmpFiled = null;
            } else {
              _tmpFiled = _cursor.getString(_cursorIndexOfFiled);
            }
            final String _tmpCheck;
            if (_cursor.isNull(_cursorIndexOfCheck)) {
              _tmpCheck = null;
            } else {
              _tmpCheck = _cursor.getString(_cursorIndexOfCheck);
            }
            final String _tmpValue;
            if (_cursor.isNull(_cursorIndexOfValue)) {
              _tmpValue = null;
            } else {
              _tmpValue = _cursor.getString(_cursorIndexOfValue);
            }
            final long _tmpSenderId;
            _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
            final String _tmpSmsTemplate;
            if (_cursor.isNull(_cursorIndexOfSmsTemplate)) {
              _tmpSmsTemplate = null;
            } else {
              _tmpSmsTemplate = _cursor.getString(_cursorIndexOfSmsTemplate);
            }
            final String _tmpRegexReplace;
            if (_cursor.isNull(_cursorIndexOfRegexReplace)) {
              _tmpRegexReplace = null;
            } else {
              _tmpRegexReplace = _cursor.getString(_cursorIndexOfRegexReplace);
            }
            final String _tmpSimSlot;
            if (_cursor.isNull(_cursorIndexOfSimSlot)) {
              _tmpSimSlot = null;
            } else {
              _tmpSimSlot = _cursor.getString(_cursorIndexOfSimSlot);
            }
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final Date _tmpTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTime);
            }
            _tmpTime = __convertersDate.fromTimestamp(_tmp);
            final List<Sender> _tmpSenderList;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfSenderList)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfSenderList);
            }
            _tmpSenderList = __convertersSenderList.stringToObject(_tmp_1);
            final String _tmpSenderLogic;
            if (_cursor.isNull(_cursorIndexOfSenderLogic)) {
              _tmpSenderLogic = null;
            } else {
              _tmpSenderLogic = _cursor.getString(_cursorIndexOfSenderLogic);
            }
            final int _tmpSilentPeriodStart;
            _tmpSilentPeriodStart = _cursor.getInt(_cursorIndexOfSilentPeriodStart);
            final int _tmpSilentPeriodEnd;
            _tmpSilentPeriodEnd = _cursor.getInt(_cursorIndexOfSilentPeriodEnd);
            final String _tmpSilentDayOfWeek;
            if (_cursor.isNull(_cursorIndexOfSilentDayOfWeek)) {
              _tmpSilentDayOfWeek = null;
            } else {
              _tmpSilentDayOfWeek = _cursor.getString(_cursorIndexOfSilentDayOfWeek);
            }
            _result = new Rule(_tmpId,_tmpType,_tmpFiled,_tmpCheck,_tmpValue,_tmpSenderId,_tmpSmsTemplate,_tmpRegexReplace,_tmpSimSlot,_tmpStatus,_tmpTime,_tmpSenderList,_tmpSenderLogic,_tmpSilentPeriodStart,_tmpSilentPeriodEnd,_tmpSilentDayOfWeek);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Rule getOne(final long id) {
    final String _sql = "SELECT * FROM Rule where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfFiled = CursorUtil.getColumnIndexOrThrow(_cursor, "filed");
      final int _cursorIndexOfCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "check");
      final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
      final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_id");
      final int _cursorIndexOfSmsTemplate = CursorUtil.getColumnIndexOrThrow(_cursor, "sms_template");
      final int _cursorIndexOfRegexReplace = CursorUtil.getColumnIndexOrThrow(_cursor, "regex_replace");
      final int _cursorIndexOfSimSlot = CursorUtil.getColumnIndexOrThrow(_cursor, "sim_slot");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfSenderList = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_list");
      final int _cursorIndexOfSenderLogic = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_logic");
      final int _cursorIndexOfSilentPeriodStart = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_period_start");
      final int _cursorIndexOfSilentPeriodEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_period_end");
      final int _cursorIndexOfSilentDayOfWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_day_of_week");
      final Rule _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final String _tmpFiled;
        if (_cursor.isNull(_cursorIndexOfFiled)) {
          _tmpFiled = null;
        } else {
          _tmpFiled = _cursor.getString(_cursorIndexOfFiled);
        }
        final String _tmpCheck;
        if (_cursor.isNull(_cursorIndexOfCheck)) {
          _tmpCheck = null;
        } else {
          _tmpCheck = _cursor.getString(_cursorIndexOfCheck);
        }
        final String _tmpValue;
        if (_cursor.isNull(_cursorIndexOfValue)) {
          _tmpValue = null;
        } else {
          _tmpValue = _cursor.getString(_cursorIndexOfValue);
        }
        final long _tmpSenderId;
        _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
        final String _tmpSmsTemplate;
        if (_cursor.isNull(_cursorIndexOfSmsTemplate)) {
          _tmpSmsTemplate = null;
        } else {
          _tmpSmsTemplate = _cursor.getString(_cursorIndexOfSmsTemplate);
        }
        final String _tmpRegexReplace;
        if (_cursor.isNull(_cursorIndexOfRegexReplace)) {
          _tmpRegexReplace = null;
        } else {
          _tmpRegexReplace = _cursor.getString(_cursorIndexOfRegexReplace);
        }
        final String _tmpSimSlot;
        if (_cursor.isNull(_cursorIndexOfSimSlot)) {
          _tmpSimSlot = null;
        } else {
          _tmpSimSlot = _cursor.getString(_cursorIndexOfSimSlot);
        }
        final int _tmpStatus;
        _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        final Date _tmpTime;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTime);
        }
        _tmpTime = __convertersDate.fromTimestamp(_tmp);
        final List<Sender> _tmpSenderList;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfSenderList)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfSenderList);
        }
        _tmpSenderList = __convertersSenderList.stringToObject(_tmp_1);
        final String _tmpSenderLogic;
        if (_cursor.isNull(_cursorIndexOfSenderLogic)) {
          _tmpSenderLogic = null;
        } else {
          _tmpSenderLogic = _cursor.getString(_cursorIndexOfSenderLogic);
        }
        final int _tmpSilentPeriodStart;
        _tmpSilentPeriodStart = _cursor.getInt(_cursorIndexOfSilentPeriodStart);
        final int _tmpSilentPeriodEnd;
        _tmpSilentPeriodEnd = _cursor.getInt(_cursorIndexOfSilentPeriodEnd);
        final String _tmpSilentDayOfWeek;
        if (_cursor.isNull(_cursorIndexOfSilentDayOfWeek)) {
          _tmpSilentDayOfWeek = null;
        } else {
          _tmpSilentDayOfWeek = _cursor.getString(_cursorIndexOfSilentDayOfWeek);
        }
        _result = new Rule(_tmpId,_tmpType,_tmpFiled,_tmpCheck,_tmpValue,_tmpSenderId,_tmpSmsTemplate,_tmpRegexReplace,_tmpSimSlot,_tmpStatus,_tmpTime,_tmpSenderList,_tmpSenderLogic,_tmpSilentPeriodStart,_tmpSilentPeriodEnd,_tmpSilentDayOfWeek);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Single<Integer> count(final String type, final int status) {
    final String _sql = "SELECT count(*) FROM Rule where type=? and status=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, status);
    return RxRoom.createSingle(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public PagingSource<Integer, Rule> pagingSource(final String type) {
    final String _sql = "SELECT * FROM Rule where type=? ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    return new LimitOffsetPagingSource<Rule>(_statement, __db, "Rule") {
      @Override
      protected List<Rule> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
        final int _cursorIndexOfFiled = CursorUtil.getColumnIndexOrThrow(cursor, "filed");
        final int _cursorIndexOfCheck = CursorUtil.getColumnIndexOrThrow(cursor, "check");
        final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(cursor, "value");
        final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(cursor, "sender_id");
        final int _cursorIndexOfSmsTemplate = CursorUtil.getColumnIndexOrThrow(cursor, "sms_template");
        final int _cursorIndexOfRegexReplace = CursorUtil.getColumnIndexOrThrow(cursor, "regex_replace");
        final int _cursorIndexOfSimSlot = CursorUtil.getColumnIndexOrThrow(cursor, "sim_slot");
        final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(cursor, "status");
        final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(cursor, "time");
        final int _cursorIndexOfSenderList = CursorUtil.getColumnIndexOrThrow(cursor, "sender_list");
        final int _cursorIndexOfSenderLogic = CursorUtil.getColumnIndexOrThrow(cursor, "sender_logic");
        final int _cursorIndexOfSilentPeriodStart = CursorUtil.getColumnIndexOrThrow(cursor, "silent_period_start");
        final int _cursorIndexOfSilentPeriodEnd = CursorUtil.getColumnIndexOrThrow(cursor, "silent_period_end");
        final int _cursorIndexOfSilentDayOfWeek = CursorUtil.getColumnIndexOrThrow(cursor, "silent_day_of_week");
        final List<Rule> _result = new ArrayList<Rule>(cursor.getCount());
        while(cursor.moveToNext()) {
          final Rule _item;
          final long _tmpId;
          _tmpId = cursor.getLong(_cursorIndexOfId);
          final String _tmpType;
          if (cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = cursor.getString(_cursorIndexOfType);
          }
          final String _tmpFiled;
          if (cursor.isNull(_cursorIndexOfFiled)) {
            _tmpFiled = null;
          } else {
            _tmpFiled = cursor.getString(_cursorIndexOfFiled);
          }
          final String _tmpCheck;
          if (cursor.isNull(_cursorIndexOfCheck)) {
            _tmpCheck = null;
          } else {
            _tmpCheck = cursor.getString(_cursorIndexOfCheck);
          }
          final String _tmpValue;
          if (cursor.isNull(_cursorIndexOfValue)) {
            _tmpValue = null;
          } else {
            _tmpValue = cursor.getString(_cursorIndexOfValue);
          }
          final long _tmpSenderId;
          _tmpSenderId = cursor.getLong(_cursorIndexOfSenderId);
          final String _tmpSmsTemplate;
          if (cursor.isNull(_cursorIndexOfSmsTemplate)) {
            _tmpSmsTemplate = null;
          } else {
            _tmpSmsTemplate = cursor.getString(_cursorIndexOfSmsTemplate);
          }
          final String _tmpRegexReplace;
          if (cursor.isNull(_cursorIndexOfRegexReplace)) {
            _tmpRegexReplace = null;
          } else {
            _tmpRegexReplace = cursor.getString(_cursorIndexOfRegexReplace);
          }
          final String _tmpSimSlot;
          if (cursor.isNull(_cursorIndexOfSimSlot)) {
            _tmpSimSlot = null;
          } else {
            _tmpSimSlot = cursor.getString(_cursorIndexOfSimSlot);
          }
          final int _tmpStatus;
          _tmpStatus = cursor.getInt(_cursorIndexOfStatus);
          final Date _tmpTime;
          final Long _tmp;
          if (cursor.isNull(_cursorIndexOfTime)) {
            _tmp = null;
          } else {
            _tmp = cursor.getLong(_cursorIndexOfTime);
          }
          _tmpTime = __convertersDate.fromTimestamp(_tmp);
          final List<Sender> _tmpSenderList;
          final String _tmp_1;
          if (cursor.isNull(_cursorIndexOfSenderList)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = cursor.getString(_cursorIndexOfSenderList);
          }
          _tmpSenderList = __convertersSenderList.stringToObject(_tmp_1);
          final String _tmpSenderLogic;
          if (cursor.isNull(_cursorIndexOfSenderLogic)) {
            _tmpSenderLogic = null;
          } else {
            _tmpSenderLogic = cursor.getString(_cursorIndexOfSenderLogic);
          }
          final int _tmpSilentPeriodStart;
          _tmpSilentPeriodStart = cursor.getInt(_cursorIndexOfSilentPeriodStart);
          final int _tmpSilentPeriodEnd;
          _tmpSilentPeriodEnd = cursor.getInt(_cursorIndexOfSilentPeriodEnd);
          final String _tmpSilentDayOfWeek;
          if (cursor.isNull(_cursorIndexOfSilentDayOfWeek)) {
            _tmpSilentDayOfWeek = null;
          } else {
            _tmpSilentDayOfWeek = cursor.getString(_cursorIndexOfSilentDayOfWeek);
          }
          _item = new Rule(_tmpId,_tmpType,_tmpFiled,_tmpCheck,_tmpValue,_tmpSenderId,_tmpSmsTemplate,_tmpRegexReplace,_tmpSimSlot,_tmpStatus,_tmpTime,_tmpSenderList,_tmpSenderLogic,_tmpSilentPeriodStart,_tmpSilentPeriodEnd,_tmpSilentDayOfWeek);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public List<Rule> getRuleList(final String type, final int status, final String simSlot) {
    final String _sql = "SELECT * FROM Rule where type=? and status=? and (sim_slot='ALL' or sim_slot=?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, status);
    _argIndex = 3;
    if (simSlot == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, simSlot);
    }
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
      try {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
        final int _cursorIndexOfFiled = CursorUtil.getColumnIndexOrThrow(_cursor, "filed");
        final int _cursorIndexOfCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "check");
        final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
        final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_id");
        final int _cursorIndexOfSmsTemplate = CursorUtil.getColumnIndexOrThrow(_cursor, "sms_template");
        final int _cursorIndexOfRegexReplace = CursorUtil.getColumnIndexOrThrow(_cursor, "regex_replace");
        final int _cursorIndexOfSimSlot = CursorUtil.getColumnIndexOrThrow(_cursor, "sim_slot");
        final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
        final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
        final int _cursorIndexOfSenderList = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_list");
        final int _cursorIndexOfSenderLogic = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_logic");
        final int _cursorIndexOfSilentPeriodStart = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_period_start");
        final int _cursorIndexOfSilentPeriodEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_period_end");
        final int _cursorIndexOfSilentDayOfWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_day_of_week");
        final List<Rule> _result = new ArrayList<Rule>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final Rule _item;
          final long _tmpId;
          _tmpId = _cursor.getLong(_cursorIndexOfId);
          final String _tmpType;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _cursor.getString(_cursorIndexOfType);
          }
          final String _tmpFiled;
          if (_cursor.isNull(_cursorIndexOfFiled)) {
            _tmpFiled = null;
          } else {
            _tmpFiled = _cursor.getString(_cursorIndexOfFiled);
          }
          final String _tmpCheck;
          if (_cursor.isNull(_cursorIndexOfCheck)) {
            _tmpCheck = null;
          } else {
            _tmpCheck = _cursor.getString(_cursorIndexOfCheck);
          }
          final String _tmpValue;
          if (_cursor.isNull(_cursorIndexOfValue)) {
            _tmpValue = null;
          } else {
            _tmpValue = _cursor.getString(_cursorIndexOfValue);
          }
          final long _tmpSenderId;
          _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
          final String _tmpSmsTemplate;
          if (_cursor.isNull(_cursorIndexOfSmsTemplate)) {
            _tmpSmsTemplate = null;
          } else {
            _tmpSmsTemplate = _cursor.getString(_cursorIndexOfSmsTemplate);
          }
          final String _tmpRegexReplace;
          if (_cursor.isNull(_cursorIndexOfRegexReplace)) {
            _tmpRegexReplace = null;
          } else {
            _tmpRegexReplace = _cursor.getString(_cursorIndexOfRegexReplace);
          }
          final String _tmpSimSlot;
          if (_cursor.isNull(_cursorIndexOfSimSlot)) {
            _tmpSimSlot = null;
          } else {
            _tmpSimSlot = _cursor.getString(_cursorIndexOfSimSlot);
          }
          final int _tmpStatus;
          _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
          final Date _tmpTime;
          final Long _tmp;
          if (_cursor.isNull(_cursorIndexOfTime)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getLong(_cursorIndexOfTime);
          }
          _tmpTime = __convertersDate.fromTimestamp(_tmp);
          final List<Sender> _tmpSenderList;
          final String _tmp_1;
          if (_cursor.isNull(_cursorIndexOfSenderList)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getString(_cursorIndexOfSenderList);
          }
          _tmpSenderList = __convertersSenderList.stringToObject(_tmp_1);
          final String _tmpSenderLogic;
          if (_cursor.isNull(_cursorIndexOfSenderLogic)) {
            _tmpSenderLogic = null;
          } else {
            _tmpSenderLogic = _cursor.getString(_cursorIndexOfSenderLogic);
          }
          final int _tmpSilentPeriodStart;
          _tmpSilentPeriodStart = _cursor.getInt(_cursorIndexOfSilentPeriodStart);
          final int _tmpSilentPeriodEnd;
          _tmpSilentPeriodEnd = _cursor.getInt(_cursorIndexOfSilentPeriodEnd);
          final String _tmpSilentDayOfWeek;
          if (_cursor.isNull(_cursorIndexOfSilentDayOfWeek)) {
            _tmpSilentDayOfWeek = null;
          } else {
            _tmpSilentDayOfWeek = _cursor.getString(_cursorIndexOfSilentDayOfWeek);
          }
          _item = new Rule(_tmpId,_tmpType,_tmpFiled,_tmpCheck,_tmpValue,_tmpSenderId,_tmpSmsTemplate,_tmpRegexReplace,_tmpSimSlot,_tmpStatus,_tmpTime,_tmpSenderList,_tmpSenderLogic,_tmpSilentPeriodStart,_tmpSilentPeriodEnd,_tmpSilentDayOfWeek);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<Rule>> getAll() {
    final String _sql = "SELECT * FROM Rule ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<Rule>>() {
      @Override
      public List<Rule> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfFiled = CursorUtil.getColumnIndexOrThrow(_cursor, "filed");
          final int _cursorIndexOfCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "check");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_id");
          final int _cursorIndexOfSmsTemplate = CursorUtil.getColumnIndexOrThrow(_cursor, "sms_template");
          final int _cursorIndexOfRegexReplace = CursorUtil.getColumnIndexOrThrow(_cursor, "regex_replace");
          final int _cursorIndexOfSimSlot = CursorUtil.getColumnIndexOrThrow(_cursor, "sim_slot");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfSenderList = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_list");
          final int _cursorIndexOfSenderLogic = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_logic");
          final int _cursorIndexOfSilentPeriodStart = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_period_start");
          final int _cursorIndexOfSilentPeriodEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_period_end");
          final int _cursorIndexOfSilentDayOfWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "silent_day_of_week");
          final List<Rule> _result = new ArrayList<Rule>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Rule _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpFiled;
            if (_cursor.isNull(_cursorIndexOfFiled)) {
              _tmpFiled = null;
            } else {
              _tmpFiled = _cursor.getString(_cursorIndexOfFiled);
            }
            final String _tmpCheck;
            if (_cursor.isNull(_cursorIndexOfCheck)) {
              _tmpCheck = null;
            } else {
              _tmpCheck = _cursor.getString(_cursorIndexOfCheck);
            }
            final String _tmpValue;
            if (_cursor.isNull(_cursorIndexOfValue)) {
              _tmpValue = null;
            } else {
              _tmpValue = _cursor.getString(_cursorIndexOfValue);
            }
            final long _tmpSenderId;
            _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
            final String _tmpSmsTemplate;
            if (_cursor.isNull(_cursorIndexOfSmsTemplate)) {
              _tmpSmsTemplate = null;
            } else {
              _tmpSmsTemplate = _cursor.getString(_cursorIndexOfSmsTemplate);
            }
            final String _tmpRegexReplace;
            if (_cursor.isNull(_cursorIndexOfRegexReplace)) {
              _tmpRegexReplace = null;
            } else {
              _tmpRegexReplace = _cursor.getString(_cursorIndexOfRegexReplace);
            }
            final String _tmpSimSlot;
            if (_cursor.isNull(_cursorIndexOfSimSlot)) {
              _tmpSimSlot = null;
            } else {
              _tmpSimSlot = _cursor.getString(_cursorIndexOfSimSlot);
            }
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final Date _tmpTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTime);
            }
            _tmpTime = __convertersDate.fromTimestamp(_tmp);
            final List<Sender> _tmpSenderList;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfSenderList)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfSenderList);
            }
            _tmpSenderList = __convertersSenderList.stringToObject(_tmp_1);
            final String _tmpSenderLogic;
            if (_cursor.isNull(_cursorIndexOfSenderLogic)) {
              _tmpSenderLogic = null;
            } else {
              _tmpSenderLogic = _cursor.getString(_cursorIndexOfSenderLogic);
            }
            final int _tmpSilentPeriodStart;
            _tmpSilentPeriodStart = _cursor.getInt(_cursorIndexOfSilentPeriodStart);
            final int _tmpSilentPeriodEnd;
            _tmpSilentPeriodEnd = _cursor.getInt(_cursorIndexOfSilentPeriodEnd);
            final String _tmpSilentDayOfWeek;
            if (_cursor.isNull(_cursorIndexOfSilentDayOfWeek)) {
              _tmpSilentDayOfWeek = null;
            } else {
              _tmpSilentDayOfWeek = _cursor.getString(_cursorIndexOfSilentDayOfWeek);
            }
            _item = new Rule(_tmpId,_tmpType,_tmpFiled,_tmpCheck,_tmpValue,_tmpSenderId,_tmpSmsTemplate,_tmpRegexReplace,_tmpSimSlot,_tmpStatus,_tmpTime,_tmpSenderList,_tmpSenderLogic,_tmpSilentPeriodStart,_tmpSilentPeriodEnd,_tmpSilentDayOfWeek);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public void updateStatusByIds(final List<Long> ids, final int status) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("UPDATE Rule SET status=");
    _stringBuilder.append("?");
    _stringBuilder.append(" WHERE id IN (");
    final int _inputSize = ids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, status);
    _argIndex = 2;
    for (Long _item : ids) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Rule> getAllRaw(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
      try {
        final List<Rule> _result = new ArrayList<Rule>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final Rule _item;
          _item = __entityCursorConverter_comIdormySmsForwarderDatabaseEntityRule(_cursor);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
      }
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private Rule __entityCursorConverter_comIdormySmsForwarderDatabaseEntityRule(Cursor cursor) {
    final Rule _entity;
    final int _cursorIndexOfId = CursorUtil.getColumnIndex(cursor, "id");
    final int _cursorIndexOfType = CursorUtil.getColumnIndex(cursor, "type");
    final int _cursorIndexOfFiled = CursorUtil.getColumnIndex(cursor, "filed");
    final int _cursorIndexOfCheck = CursorUtil.getColumnIndex(cursor, "check");
    final int _cursorIndexOfValue = CursorUtil.getColumnIndex(cursor, "value");
    final int _cursorIndexOfSenderId = CursorUtil.getColumnIndex(cursor, "sender_id");
    final int _cursorIndexOfSmsTemplate = CursorUtil.getColumnIndex(cursor, "sms_template");
    final int _cursorIndexOfRegexReplace = CursorUtil.getColumnIndex(cursor, "regex_replace");
    final int _cursorIndexOfSimSlot = CursorUtil.getColumnIndex(cursor, "sim_slot");
    final int _cursorIndexOfStatus = CursorUtil.getColumnIndex(cursor, "status");
    final int _cursorIndexOfTime = CursorUtil.getColumnIndex(cursor, "time");
    final int _cursorIndexOfSenderList = CursorUtil.getColumnIndex(cursor, "sender_list");
    final int _cursorIndexOfSenderLogic = CursorUtil.getColumnIndex(cursor, "sender_logic");
    final int _cursorIndexOfSilentPeriodStart = CursorUtil.getColumnIndex(cursor, "silent_period_start");
    final int _cursorIndexOfSilentPeriodEnd = CursorUtil.getColumnIndex(cursor, "silent_period_end");
    final int _cursorIndexOfSilentDayOfWeek = CursorUtil.getColumnIndex(cursor, "silent_day_of_week");
    final long _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = 0;
    } else {
      _tmpId = cursor.getLong(_cursorIndexOfId);
    }
    final String _tmpType;
    if (_cursorIndexOfType == -1) {
      _tmpType = null;
    } else {
      if (cursor.isNull(_cursorIndexOfType)) {
        _tmpType = null;
      } else {
        _tmpType = cursor.getString(_cursorIndexOfType);
      }
    }
    final String _tmpFiled;
    if (_cursorIndexOfFiled == -1) {
      _tmpFiled = null;
    } else {
      if (cursor.isNull(_cursorIndexOfFiled)) {
        _tmpFiled = null;
      } else {
        _tmpFiled = cursor.getString(_cursorIndexOfFiled);
      }
    }
    final String _tmpCheck;
    if (_cursorIndexOfCheck == -1) {
      _tmpCheck = null;
    } else {
      if (cursor.isNull(_cursorIndexOfCheck)) {
        _tmpCheck = null;
      } else {
        _tmpCheck = cursor.getString(_cursorIndexOfCheck);
      }
    }
    final String _tmpValue;
    if (_cursorIndexOfValue == -1) {
      _tmpValue = null;
    } else {
      if (cursor.isNull(_cursorIndexOfValue)) {
        _tmpValue = null;
      } else {
        _tmpValue = cursor.getString(_cursorIndexOfValue);
      }
    }
    final long _tmpSenderId;
    if (_cursorIndexOfSenderId == -1) {
      _tmpSenderId = 0;
    } else {
      _tmpSenderId = cursor.getLong(_cursorIndexOfSenderId);
    }
    final String _tmpSmsTemplate;
    if (_cursorIndexOfSmsTemplate == -1) {
      _tmpSmsTemplate = null;
    } else {
      if (cursor.isNull(_cursorIndexOfSmsTemplate)) {
        _tmpSmsTemplate = null;
      } else {
        _tmpSmsTemplate = cursor.getString(_cursorIndexOfSmsTemplate);
      }
    }
    final String _tmpRegexReplace;
    if (_cursorIndexOfRegexReplace == -1) {
      _tmpRegexReplace = null;
    } else {
      if (cursor.isNull(_cursorIndexOfRegexReplace)) {
        _tmpRegexReplace = null;
      } else {
        _tmpRegexReplace = cursor.getString(_cursorIndexOfRegexReplace);
      }
    }
    final String _tmpSimSlot;
    if (_cursorIndexOfSimSlot == -1) {
      _tmpSimSlot = null;
    } else {
      if (cursor.isNull(_cursorIndexOfSimSlot)) {
        _tmpSimSlot = null;
      } else {
        _tmpSimSlot = cursor.getString(_cursorIndexOfSimSlot);
      }
    }
    final int _tmpStatus;
    if (_cursorIndexOfStatus == -1) {
      _tmpStatus = 0;
    } else {
      _tmpStatus = cursor.getInt(_cursorIndexOfStatus);
    }
    final Date _tmpTime;
    if (_cursorIndexOfTime == -1) {
      _tmpTime = null;
    } else {
      final Long _tmp;
      if (cursor.isNull(_cursorIndexOfTime)) {
        _tmp = null;
      } else {
        _tmp = cursor.getLong(_cursorIndexOfTime);
      }
      _tmpTime = __convertersDate.fromTimestamp(_tmp);
    }
    final List<Sender> _tmpSenderList;
    if (_cursorIndexOfSenderList == -1) {
      _tmpSenderList = null;
    } else {
      final String _tmp_1;
      if (cursor.isNull(_cursorIndexOfSenderList)) {
        _tmp_1 = null;
      } else {
        _tmp_1 = cursor.getString(_cursorIndexOfSenderList);
      }
      _tmpSenderList = __convertersSenderList.stringToObject(_tmp_1);
    }
    final String _tmpSenderLogic;
    if (_cursorIndexOfSenderLogic == -1) {
      _tmpSenderLogic = null;
    } else {
      if (cursor.isNull(_cursorIndexOfSenderLogic)) {
        _tmpSenderLogic = null;
      } else {
        _tmpSenderLogic = cursor.getString(_cursorIndexOfSenderLogic);
      }
    }
    final int _tmpSilentPeriodStart;
    if (_cursorIndexOfSilentPeriodStart == -1) {
      _tmpSilentPeriodStart = 0;
    } else {
      _tmpSilentPeriodStart = cursor.getInt(_cursorIndexOfSilentPeriodStart);
    }
    final int _tmpSilentPeriodEnd;
    if (_cursorIndexOfSilentPeriodEnd == -1) {
      _tmpSilentPeriodEnd = 0;
    } else {
      _tmpSilentPeriodEnd = cursor.getInt(_cursorIndexOfSilentPeriodEnd);
    }
    final String _tmpSilentDayOfWeek;
    if (_cursorIndexOfSilentDayOfWeek == -1) {
      _tmpSilentDayOfWeek = null;
    } else {
      if (cursor.isNull(_cursorIndexOfSilentDayOfWeek)) {
        _tmpSilentDayOfWeek = null;
      } else {
        _tmpSilentDayOfWeek = cursor.getString(_cursorIndexOfSilentDayOfWeek);
      }
    }
    _entity = new Rule(_tmpId,_tmpType,_tmpFiled,_tmpCheck,_tmpValue,_tmpSenderId,_tmpSmsTemplate,_tmpRegexReplace,_tmpSimSlot,_tmpStatus,_tmpTime,_tmpSenderList,_tmpSenderLogic,_tmpSilentPeriodStart,_tmpSilentPeriodEnd,_tmpSilentDayOfWeek);
    return _entity;
  }
}
