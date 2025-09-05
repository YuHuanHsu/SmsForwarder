package com.idormy.sms.forwarder.database.dao;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
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
import com.idormy.sms.forwarder.database.entity.Logs;
import com.idormy.sms.forwarder.database.entity.LogsAndRuleAndSender;
import com.idormy.sms.forwarder.database.entity.Msg;
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
import java.lang.Object;
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
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LogsDao_Impl implements LogsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Logs> __insertionAdapterOfLogs;

  private final ConvertersDate __convertersDate = new ConvertersDate();

  private final EntityDeletionOrUpdateAdapter<Logs> __deletionAdapterOfLogs;

  private final EntityDeletionOrUpdateAdapter<Logs> __updateAdapterOfLogs;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll_1;

  private final SharedSQLiteStatement __preparedStmtOfUpdateStatus;

  private final SharedSQLiteStatement __preparedStmtOfUpdateResponse;

  private final ConvertersSenderList __convertersSenderList = new ConvertersSenderList();

  public LogsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLogs = new EntityInsertionAdapter<Logs>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Logs` (`id`,`type`,`msg_id`,`rule_id`,`sender_id`,`forward_status`,`forward_response`,`time`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Logs value) {
        stmt.bindLong(1, value.getId());
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        stmt.bindLong(3, value.getMsgId());
        stmt.bindLong(4, value.getRuleId());
        stmt.bindLong(5, value.getSenderId());
        stmt.bindLong(6, value.getForwardStatus());
        if (value.getForwardResponse() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getForwardResponse());
        }
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp);
        }
      }
    };
    this.__deletionAdapterOfLogs = new EntityDeletionOrUpdateAdapter<Logs>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Logs` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Logs value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfLogs = new EntityDeletionOrUpdateAdapter<Logs>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Logs` SET `id` = ?,`type` = ?,`msg_id` = ?,`rule_id` = ?,`sender_id` = ?,`forward_status` = ?,`forward_response` = ?,`time` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Logs value) {
        stmt.bindLong(1, value.getId());
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        stmt.bindLong(3, value.getMsgId());
        stmt.bindLong(4, value.getRuleId());
        stmt.bindLong(5, value.getSenderId());
        stmt.bindLong(6, value.getForwardStatus());
        if (value.getForwardResponse() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getForwardResponse());
        }
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp);
        }
        stmt.bindLong(9, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Logs where id=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Logs where type=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll_1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Logs";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Logs SET forward_status=?,forward_response=CASE WHEN (trim(forward_response) = '' or trim(forward_response) = 'ok') THEN ? ELSE forward_response || '\n"
                + "--------------------\n"
                + "' || ? END where id=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateResponse = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Logs SET forward_response=CASE WHEN (trim(forward_response) = '' or trim(forward_response) = 'ok') THEN ? ELSE forward_response || '\n"
                + "' || ? END where id=?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Logs logs, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfLogs.insertAndReturnId(logs);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Completable delete(final Logs logs) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfLogs.handle(logs);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final Logs logs) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfLogs.handle(logs);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
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
  public Completable deleteAll(final String type) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        int _argIndex = 1;
        if (type == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, type);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    });
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll_1.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll_1.release(_stmt);
    }
  }

  @Override
  public int updateStatus(final long id, final int status, final String response) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateStatus.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, status);
    _argIndex = 2;
    if (response == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, response);
    }
    _argIndex = 3;
    if (response == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, response);
    }
    _argIndex = 4;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateStatus.release(_stmt);
    }
  }

  @Override
  public int updateResponse(final long id, final String response) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateResponse.acquire();
    int _argIndex = 1;
    if (response == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, response);
    }
    _argIndex = 2;
    if (response == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, response);
    }
    _argIndex = 3;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateResponse.release(_stmt);
    }
  }

  @Override
  public Single<Logs> get(final long id) {
    final String _sql = "SELECT * FROM Logs where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<Logs>() {
      @Override
      public Logs call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfMsgId = CursorUtil.getColumnIndexOrThrow(_cursor, "msg_id");
          final int _cursorIndexOfRuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "rule_id");
          final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_id");
          final int _cursorIndexOfForwardStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "forward_status");
          final int _cursorIndexOfForwardResponse = CursorUtil.getColumnIndexOrThrow(_cursor, "forward_response");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final Logs _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final long _tmpMsgId;
            _tmpMsgId = _cursor.getLong(_cursorIndexOfMsgId);
            final long _tmpRuleId;
            _tmpRuleId = _cursor.getLong(_cursorIndexOfRuleId);
            final long _tmpSenderId;
            _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
            final int _tmpForwardStatus;
            _tmpForwardStatus = _cursor.getInt(_cursorIndexOfForwardStatus);
            final String _tmpForwardResponse;
            if (_cursor.isNull(_cursorIndexOfForwardResponse)) {
              _tmpForwardResponse = null;
            } else {
              _tmpForwardResponse = _cursor.getString(_cursorIndexOfForwardResponse);
            }
            final Date _tmpTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTime);
            }
            _tmpTime = __convertersDate.fromTimestamp(_tmp);
            _result = new Logs(_tmpId,_tmpType,_tmpMsgId,_tmpRuleId,_tmpSenderId,_tmpForwardStatus,_tmpForwardResponse,_tmpTime);
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
  public LogsAndRuleAndSender getOne(final long id) {
    final String _sql = "SELECT * FROM Logs where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
        final int _cursorIndexOfMsgId = CursorUtil.getColumnIndexOrThrow(_cursor, "msg_id");
        final int _cursorIndexOfRuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "rule_id");
        final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "sender_id");
        final int _cursorIndexOfForwardStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "forward_status");
        final int _cursorIndexOfForwardResponse = CursorUtil.getColumnIndexOrThrow(_cursor, "forward_response");
        final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
        final LongSparseArray<Msg> _collectionMsg = new LongSparseArray<Msg>();
        final LongSparseArray<Rule> _collectionRule = new LongSparseArray<Rule>();
        final LongSparseArray<Sender> _collectionSender = new LongSparseArray<Sender>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfMsgId);
          _collectionMsg.put(_tmpKey, null);
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfRuleId);
          _collectionRule.put(_tmpKey_1, null);
          final long _tmpKey_2 = _cursor.getLong(_cursorIndexOfSenderId);
          _collectionSender.put(_tmpKey_2, null);
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipMsgAscomIdormySmsForwarderDatabaseEntityMsg(_collectionMsg);
        __fetchRelationshipRuleAscomIdormySmsForwarderDatabaseEntityRule(_collectionRule);
        __fetchRelationshipSenderAscomIdormySmsForwarderDatabaseEntitySender(_collectionSender);
        final LogsAndRuleAndSender _result;
        if(_cursor.moveToFirst()) {
          final Logs _tmpLogs;
          final long _tmpId;
          _tmpId = _cursor.getLong(_cursorIndexOfId);
          final String _tmpType;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _cursor.getString(_cursorIndexOfType);
          }
          final long _tmpMsgId;
          _tmpMsgId = _cursor.getLong(_cursorIndexOfMsgId);
          final long _tmpRuleId;
          _tmpRuleId = _cursor.getLong(_cursorIndexOfRuleId);
          final long _tmpSenderId;
          _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
          final int _tmpForwardStatus;
          _tmpForwardStatus = _cursor.getInt(_cursorIndexOfForwardStatus);
          final String _tmpForwardResponse;
          if (_cursor.isNull(_cursorIndexOfForwardResponse)) {
            _tmpForwardResponse = null;
          } else {
            _tmpForwardResponse = _cursor.getString(_cursorIndexOfForwardResponse);
          }
          final Date _tmpTime;
          final Long _tmp;
          if (_cursor.isNull(_cursorIndexOfTime)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getLong(_cursorIndexOfTime);
          }
          _tmpTime = __convertersDate.fromTimestamp(_tmp);
          _tmpLogs = new Logs(_tmpId,_tmpType,_tmpMsgId,_tmpRuleId,_tmpSenderId,_tmpForwardStatus,_tmpForwardResponse,_tmpTime);
          Msg _tmpMsg = null;
          final long _tmpKey_3 = _cursor.getLong(_cursorIndexOfMsgId);
          _tmpMsg = _collectionMsg.get(_tmpKey_3);
          Rule _tmpRule = null;
          final long _tmpKey_4 = _cursor.getLong(_cursorIndexOfRuleId);
          _tmpRule = _collectionRule.get(_tmpKey_4);
          Sender _tmpSender = null;
          final long _tmpKey_5 = _cursor.getLong(_cursorIndexOfSenderId);
          _tmpSender = _collectionSender.get(_tmpKey_5);
          _result = new LogsAndRuleAndSender(_tmpLogs,_tmpMsg,_tmpRule,_tmpSender);
        } else {
          _result = null;
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
  public Single<Integer> count(final String type, final int forwardStatus) {
    final String _sql = "SELECT count(*) FROM Logs where type=? and forward_status=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, forwardStatus);
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
  public PagingSource<Integer, LogsAndRuleAndSender> pagingSource(final String type) {
    final String _sql = "SELECT * FROM Logs WHERE type = ? ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    return new LimitOffsetPagingSource<LogsAndRuleAndSender>(_statement, __db, "Msg", "Rule", "Sender", "Logs") {
      @Override
      protected List<LogsAndRuleAndSender> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
        final int _cursorIndexOfMsgId = CursorUtil.getColumnIndexOrThrow(cursor, "msg_id");
        final int _cursorIndexOfRuleId = CursorUtil.getColumnIndexOrThrow(cursor, "rule_id");
        final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(cursor, "sender_id");
        final int _cursorIndexOfForwardStatus = CursorUtil.getColumnIndexOrThrow(cursor, "forward_status");
        final int _cursorIndexOfForwardResponse = CursorUtil.getColumnIndexOrThrow(cursor, "forward_response");
        final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(cursor, "time");
        final LongSparseArray<Msg> _collectionMsg = new LongSparseArray<Msg>();
        final LongSparseArray<Rule> _collectionRule = new LongSparseArray<Rule>();
        final LongSparseArray<Sender> _collectionSender = new LongSparseArray<Sender>();
        while (cursor.moveToNext()) {
          final long _tmpKey = cursor.getLong(_cursorIndexOfMsgId);
          _collectionMsg.put(_tmpKey, null);
          final long _tmpKey_1 = cursor.getLong(_cursorIndexOfRuleId);
          _collectionRule.put(_tmpKey_1, null);
          final long _tmpKey_2 = cursor.getLong(_cursorIndexOfSenderId);
          _collectionSender.put(_tmpKey_2, null);
        }
        cursor.moveToPosition(-1);
        __fetchRelationshipMsgAscomIdormySmsForwarderDatabaseEntityMsg(_collectionMsg);
        __fetchRelationshipRuleAscomIdormySmsForwarderDatabaseEntityRule(_collectionRule);
        __fetchRelationshipSenderAscomIdormySmsForwarderDatabaseEntitySender(_collectionSender);
        final List<LogsAndRuleAndSender> _result = new ArrayList<LogsAndRuleAndSender>(cursor.getCount());
        while(cursor.moveToNext()) {
          final LogsAndRuleAndSender _item;
          final Logs _tmpLogs;
          final long _tmpId;
          _tmpId = cursor.getLong(_cursorIndexOfId);
          final String _tmpType;
          if (cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = cursor.getString(_cursorIndexOfType);
          }
          final long _tmpMsgId;
          _tmpMsgId = cursor.getLong(_cursorIndexOfMsgId);
          final long _tmpRuleId;
          _tmpRuleId = cursor.getLong(_cursorIndexOfRuleId);
          final long _tmpSenderId;
          _tmpSenderId = cursor.getLong(_cursorIndexOfSenderId);
          final int _tmpForwardStatus;
          _tmpForwardStatus = cursor.getInt(_cursorIndexOfForwardStatus);
          final String _tmpForwardResponse;
          if (cursor.isNull(_cursorIndexOfForwardResponse)) {
            _tmpForwardResponse = null;
          } else {
            _tmpForwardResponse = cursor.getString(_cursorIndexOfForwardResponse);
          }
          final Date _tmpTime;
          final Long _tmp;
          if (cursor.isNull(_cursorIndexOfTime)) {
            _tmp = null;
          } else {
            _tmp = cursor.getLong(_cursorIndexOfTime);
          }
          _tmpTime = __convertersDate.fromTimestamp(_tmp);
          _tmpLogs = new Logs(_tmpId,_tmpType,_tmpMsgId,_tmpRuleId,_tmpSenderId,_tmpForwardStatus,_tmpForwardResponse,_tmpTime);
          Msg _tmpMsg = null;
          final long _tmpKey_3 = cursor.getLong(_cursorIndexOfMsgId);
          _tmpMsg = _collectionMsg.get(_tmpKey_3);
          Rule _tmpRule = null;
          final long _tmpKey_4 = cursor.getLong(_cursorIndexOfRuleId);
          _tmpRule = _collectionRule.get(_tmpKey_4);
          Sender _tmpSender = null;
          final long _tmpKey_5 = cursor.getLong(_cursorIndexOfSenderId);
          _tmpSender = _collectionSender.get(_tmpKey_5);
          _item = new LogsAndRuleAndSender(_tmpLogs,_tmpMsg,_tmpRule,_tmpSender);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public List<Logs> getLogsRaw(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
      try {
        final List<Logs> _result = new ArrayList<Logs>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final Logs _item;
          _item = __entityCursorConverter_comIdormySmsForwarderDatabaseEntityLogs(_cursor);
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

  private void __fetchRelationshipMsgAscomIdormySmsForwarderDatabaseEntityMsg(
      final LongSparseArray<Msg> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<Msg> _tmpInnerMap = new LongSparseArray<Msg>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), null);
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipMsgAscomIdormySmsForwarderDatabaseEntityMsg(_tmpInnerMap);
          _map.putAll(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<Msg>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipMsgAscomIdormySmsForwarderDatabaseEntityMsg(_tmpInnerMap);
        _map.putAll(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`type`,`from`,`content`,`sim_slot`,`sim_info`,`sub_id`,`call_type`,`time` FROM `Msg` WHERE `id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfType = 1;
      final int _cursorIndexOfFrom = 2;
      final int _cursorIndexOfContent = 3;
      final int _cursorIndexOfSimSlot = 4;
      final int _cursorIndexOfSimInfo = 5;
      final int _cursorIndexOfSubId = 6;
      final int _cursorIndexOfCallType = 7;
      final int _cursorIndexOfTime = 8;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        if (_map.containsKey(_tmpKey)) {
          final Msg _item_1;
          final long _tmpId;
          _tmpId = _cursor.getLong(_cursorIndexOfId);
          final String _tmpType;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _cursor.getString(_cursorIndexOfType);
          }
          final String _tmpFrom;
          if (_cursor.isNull(_cursorIndexOfFrom)) {
            _tmpFrom = null;
          } else {
            _tmpFrom = _cursor.getString(_cursorIndexOfFrom);
          }
          final String _tmpContent;
          if (_cursor.isNull(_cursorIndexOfContent)) {
            _tmpContent = null;
          } else {
            _tmpContent = _cursor.getString(_cursorIndexOfContent);
          }
          final int _tmpSimSlot;
          _tmpSimSlot = _cursor.getInt(_cursorIndexOfSimSlot);
          final String _tmpSimInfo;
          if (_cursor.isNull(_cursorIndexOfSimInfo)) {
            _tmpSimInfo = null;
          } else {
            _tmpSimInfo = _cursor.getString(_cursorIndexOfSimInfo);
          }
          final int _tmpSubId;
          _tmpSubId = _cursor.getInt(_cursorIndexOfSubId);
          final int _tmpCallType;
          _tmpCallType = _cursor.getInt(_cursorIndexOfCallType);
          final Date _tmpTime;
          final Long _tmp;
          if (_cursor.isNull(_cursorIndexOfTime)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getLong(_cursorIndexOfTime);
          }
          _tmpTime = __convertersDate.fromTimestamp(_tmp);
          _item_1 = new Msg(_tmpId,_tmpType,_tmpFrom,_tmpContent,_tmpSimSlot,_tmpSimInfo,_tmpSubId,_tmpCallType,_tmpTime);
          _map.put(_tmpKey, _item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipRuleAscomIdormySmsForwarderDatabaseEntityRule(
      final LongSparseArray<Rule> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<Rule> _tmpInnerMap = new LongSparseArray<Rule>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), null);
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipRuleAscomIdormySmsForwarderDatabaseEntityRule(_tmpInnerMap);
          _map.putAll(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<Rule>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipRuleAscomIdormySmsForwarderDatabaseEntityRule(_tmpInnerMap);
        _map.putAll(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`type`,`filed`,`check`,`value`,`sender_id`,`sms_template`,`regex_replace`,`sim_slot`,`status`,`time`,`sender_list`,`sender_logic`,`silent_period_start`,`silent_period_end`,`silent_day_of_week` FROM `Rule` WHERE `id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfType = 1;
      final int _cursorIndexOfFiled = 2;
      final int _cursorIndexOfCheck = 3;
      final int _cursorIndexOfValue = 4;
      final int _cursorIndexOfSenderId = 5;
      final int _cursorIndexOfSmsTemplate = 6;
      final int _cursorIndexOfRegexReplace = 7;
      final int _cursorIndexOfSimSlot = 8;
      final int _cursorIndexOfStatus = 9;
      final int _cursorIndexOfTime = 10;
      final int _cursorIndexOfSenderList = 11;
      final int _cursorIndexOfSenderLogic = 12;
      final int _cursorIndexOfSilentPeriodStart = 13;
      final int _cursorIndexOfSilentPeriodEnd = 14;
      final int _cursorIndexOfSilentDayOfWeek = 15;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        if (_map.containsKey(_tmpKey)) {
          final Rule _item_1;
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
          _item_1 = new Rule(_tmpId,_tmpType,_tmpFiled,_tmpCheck,_tmpValue,_tmpSenderId,_tmpSmsTemplate,_tmpRegexReplace,_tmpSimSlot,_tmpStatus,_tmpTime,_tmpSenderList,_tmpSenderLogic,_tmpSilentPeriodStart,_tmpSilentPeriodEnd,_tmpSilentDayOfWeek);
          _map.put(_tmpKey, _item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipSenderAscomIdormySmsForwarderDatabaseEntitySender(
      final LongSparseArray<Sender> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<Sender> _tmpInnerMap = new LongSparseArray<Sender>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), null);
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipSenderAscomIdormySmsForwarderDatabaseEntitySender(_tmpInnerMap);
          _map.putAll(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<Sender>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipSenderAscomIdormySmsForwarderDatabaseEntitySender(_tmpInnerMap);
        _map.putAll(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`type`,`name`,`json_setting`,`status`,`time` FROM `Sender` WHERE `id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfType = 1;
      final int _cursorIndexOfName = 2;
      final int _cursorIndexOfJsonSetting = 3;
      final int _cursorIndexOfStatus = 4;
      final int _cursorIndexOfTime = 5;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        if (_map.containsKey(_tmpKey)) {
          final Sender _item_1;
          final long _tmpId;
          _tmpId = _cursor.getLong(_cursorIndexOfId);
          final int _tmpType;
          _tmpType = _cursor.getInt(_cursorIndexOfType);
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final String _tmpJsonSetting;
          if (_cursor.isNull(_cursorIndexOfJsonSetting)) {
            _tmpJsonSetting = null;
          } else {
            _tmpJsonSetting = _cursor.getString(_cursorIndexOfJsonSetting);
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
          _item_1 = new Sender(_tmpId,_tmpType,_tmpName,_tmpJsonSetting,_tmpStatus,_tmpTime);
          _map.put(_tmpKey, _item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private Logs __entityCursorConverter_comIdormySmsForwarderDatabaseEntityLogs(Cursor cursor) {
    final Logs _entity;
    final int _cursorIndexOfId = CursorUtil.getColumnIndex(cursor, "id");
    final int _cursorIndexOfType = CursorUtil.getColumnIndex(cursor, "type");
    final int _cursorIndexOfMsgId = CursorUtil.getColumnIndex(cursor, "msg_id");
    final int _cursorIndexOfRuleId = CursorUtil.getColumnIndex(cursor, "rule_id");
    final int _cursorIndexOfSenderId = CursorUtil.getColumnIndex(cursor, "sender_id");
    final int _cursorIndexOfForwardStatus = CursorUtil.getColumnIndex(cursor, "forward_status");
    final int _cursorIndexOfForwardResponse = CursorUtil.getColumnIndex(cursor, "forward_response");
    final int _cursorIndexOfTime = CursorUtil.getColumnIndex(cursor, "time");
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
    final long _tmpMsgId;
    if (_cursorIndexOfMsgId == -1) {
      _tmpMsgId = 0;
    } else {
      _tmpMsgId = cursor.getLong(_cursorIndexOfMsgId);
    }
    final long _tmpRuleId;
    if (_cursorIndexOfRuleId == -1) {
      _tmpRuleId = 0;
    } else {
      _tmpRuleId = cursor.getLong(_cursorIndexOfRuleId);
    }
    final long _tmpSenderId;
    if (_cursorIndexOfSenderId == -1) {
      _tmpSenderId = 0;
    } else {
      _tmpSenderId = cursor.getLong(_cursorIndexOfSenderId);
    }
    final int _tmpForwardStatus;
    if (_cursorIndexOfForwardStatus == -1) {
      _tmpForwardStatus = 0;
    } else {
      _tmpForwardStatus = cursor.getInt(_cursorIndexOfForwardStatus);
    }
    final String _tmpForwardResponse;
    if (_cursorIndexOfForwardResponse == -1) {
      _tmpForwardResponse = null;
    } else {
      if (cursor.isNull(_cursorIndexOfForwardResponse)) {
        _tmpForwardResponse = null;
      } else {
        _tmpForwardResponse = cursor.getString(_cursorIndexOfForwardResponse);
      }
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
    _entity = new Logs(_tmpId,_tmpType,_tmpMsgId,_tmpRuleId,_tmpSenderId,_tmpForwardStatus,_tmpForwardResponse,_tmpTime);
    return _entity;
  }
}
