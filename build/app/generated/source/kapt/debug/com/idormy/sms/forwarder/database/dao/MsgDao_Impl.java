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
import com.idormy.sms.forwarder.database.entity.LogsDetail;
import com.idormy.sms.forwarder.database.entity.Msg;
import com.idormy.sms.forwarder.database.entity.MsgAndLogs;
import com.idormy.sms.forwarder.database.ext.ConvertersDate;
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
public final class MsgDao_Impl implements MsgDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Msg> __insertionAdapterOfMsg;

  private final ConvertersDate __convertersDate = new ConvertersDate();

  private final EntityDeletionOrUpdateAdapter<Msg> __deletionAdapterOfMsg;

  private final EntityDeletionOrUpdateAdapter<Msg> __updateAdapterOfMsg;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTimeAgo;

  public MsgDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMsg = new EntityInsertionAdapter<Msg>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Msg` (`id`,`type`,`from`,`content`,`sim_slot`,`sim_info`,`sub_id`,`call_type`,`time`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Msg value) {
        stmt.bindLong(1, value.getId());
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        if (value.getFrom() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFrom());
        }
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
        stmt.bindLong(5, value.getSimSlot());
        if (value.getSimInfo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSimInfo());
        }
        stmt.bindLong(7, value.getSubId());
        stmt.bindLong(8, value.getCallType());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp);
        }
      }
    };
    this.__deletionAdapterOfMsg = new EntityDeletionOrUpdateAdapter<Msg>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Msg` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Msg value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfMsg = new EntityDeletionOrUpdateAdapter<Msg>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Msg` SET `id` = ?,`type` = ?,`from` = ?,`content` = ?,`sim_slot` = ?,`sim_info` = ?,`sub_id` = ?,`call_type` = ?,`time` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Msg value) {
        stmt.bindLong(1, value.getId());
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        if (value.getFrom() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFrom());
        }
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
        stmt.bindLong(5, value.getSimSlot());
        if (value.getSimInfo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSimInfo());
        }
        stmt.bindLong(7, value.getSubId());
        stmt.bindLong(8, value.getCallType());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp);
        }
        stmt.bindLong(10, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Msg where id=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Msg";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTimeAgo = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Msg where time<?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Msg msg, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfMsg.insertAndReturnId(msg);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Completable delete(final Msg msg) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMsg.handle(msg);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final Msg msg) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMsg.handle(msg);
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
  public void deleteTimeAgo(final long time) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTimeAgo.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, time);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTimeAgo.release(_stmt);
    }
  }

  @Override
  public Single<Msg> get(final long id) {
    final String _sql = "SELECT * FROM Msg where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<Msg>() {
      @Override
      public Msg call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "from");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfSimSlot = CursorUtil.getColumnIndexOrThrow(_cursor, "sim_slot");
          final int _cursorIndexOfSimInfo = CursorUtil.getColumnIndexOrThrow(_cursor, "sim_info");
          final int _cursorIndexOfSubId = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_id");
          final int _cursorIndexOfCallType = CursorUtil.getColumnIndexOrThrow(_cursor, "call_type");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final Msg _result;
          if(_cursor.moveToFirst()) {
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
            _result = new Msg(_tmpId,_tmpType,_tmpFrom,_tmpContent,_tmpSimSlot,_tmpSimInfo,_tmpSubId,_tmpCallType,_tmpTime);
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
  public Single<Integer> count(final String type) {
    final String _sql = "SELECT count(*) FROM Msg where type=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
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
  public PagingSource<Integer, MsgAndLogs> pagingSource(final String type) {
    final String _sql = "SELECT * FROM Msg WHERE type = ? ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    return new LimitOffsetPagingSource<MsgAndLogs>(_statement, __db, "LogsDetail", "Msg") {
      @Override
      protected List<MsgAndLogs> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
        final int _cursorIndexOfFrom = CursorUtil.getColumnIndexOrThrow(cursor, "from");
        final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(cursor, "content");
        final int _cursorIndexOfSimSlot = CursorUtil.getColumnIndexOrThrow(cursor, "sim_slot");
        final int _cursorIndexOfSimInfo = CursorUtil.getColumnIndexOrThrow(cursor, "sim_info");
        final int _cursorIndexOfSubId = CursorUtil.getColumnIndexOrThrow(cursor, "sub_id");
        final int _cursorIndexOfCallType = CursorUtil.getColumnIndexOrThrow(cursor, "call_type");
        final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(cursor, "time");
        final LongSparseArray<ArrayList<LogsDetail>> _collectionLogsList = new LongSparseArray<ArrayList<LogsDetail>>();
        while (cursor.moveToNext()) {
          final long _tmpKey = cursor.getLong(_cursorIndexOfId);
          ArrayList<LogsDetail> _tmpLogsListCollection = _collectionLogsList.get(_tmpKey);
          if (_tmpLogsListCollection == null) {
            _tmpLogsListCollection = new ArrayList<LogsDetail>();
            _collectionLogsList.put(_tmpKey, _tmpLogsListCollection);
          }
        }
        cursor.moveToPosition(-1);
        __fetchRelationshipLogsDetailAscomIdormySmsForwarderDatabaseEntityLogsDetail(_collectionLogsList);
        final List<MsgAndLogs> _result = new ArrayList<MsgAndLogs>(cursor.getCount());
        while(cursor.moveToNext()) {
          final MsgAndLogs _item;
          final Msg _tmpMsg;
          final long _tmpId;
          _tmpId = cursor.getLong(_cursorIndexOfId);
          final String _tmpType;
          if (cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = cursor.getString(_cursorIndexOfType);
          }
          final String _tmpFrom;
          if (cursor.isNull(_cursorIndexOfFrom)) {
            _tmpFrom = null;
          } else {
            _tmpFrom = cursor.getString(_cursorIndexOfFrom);
          }
          final String _tmpContent;
          if (cursor.isNull(_cursorIndexOfContent)) {
            _tmpContent = null;
          } else {
            _tmpContent = cursor.getString(_cursorIndexOfContent);
          }
          final int _tmpSimSlot;
          _tmpSimSlot = cursor.getInt(_cursorIndexOfSimSlot);
          final String _tmpSimInfo;
          if (cursor.isNull(_cursorIndexOfSimInfo)) {
            _tmpSimInfo = null;
          } else {
            _tmpSimInfo = cursor.getString(_cursorIndexOfSimInfo);
          }
          final int _tmpSubId;
          _tmpSubId = cursor.getInt(_cursorIndexOfSubId);
          final int _tmpCallType;
          _tmpCallType = cursor.getInt(_cursorIndexOfCallType);
          final Date _tmpTime;
          final Long _tmp;
          if (cursor.isNull(_cursorIndexOfTime)) {
            _tmp = null;
          } else {
            _tmp = cursor.getLong(_cursorIndexOfTime);
          }
          _tmpTime = __convertersDate.fromTimestamp(_tmp);
          _tmpMsg = new Msg(_tmpId,_tmpType,_tmpFrom,_tmpContent,_tmpSimSlot,_tmpSimInfo,_tmpSubId,_tmpCallType,_tmpTime);
          ArrayList<LogsDetail> _tmpLogsListCollection_1 = null;
          final long _tmpKey_1 = cursor.getLong(_cursorIndexOfId);
          _tmpLogsListCollection_1 = _collectionLogsList.get(_tmpKey_1);
          if (_tmpLogsListCollection_1 == null) {
            _tmpLogsListCollection_1 = new ArrayList<LogsDetail>();
          }
          _item = new MsgAndLogs(_tmpMsg,_tmpLogsListCollection_1);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public int deleteAll(final SupportSQLiteQuery sql) {
    final SupportSQLiteQuery _internalQuery = sql;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }

  @Override
  public PagingSource<Integer, MsgAndLogs> pagingSource(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return new LimitOffsetPagingSource<MsgAndLogs>(_internalQuery, __db, "LogsDetail", "Msg") {
      @Override
      protected List<MsgAndLogs> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndex(cursor, "id");
        final int _cursorIndexOfType = CursorUtil.getColumnIndex(cursor, "type");
        final int _cursorIndexOfFrom = CursorUtil.getColumnIndex(cursor, "from");
        final int _cursorIndexOfContent = CursorUtil.getColumnIndex(cursor, "content");
        final int _cursorIndexOfSimSlot = CursorUtil.getColumnIndex(cursor, "sim_slot");
        final int _cursorIndexOfSimInfo = CursorUtil.getColumnIndex(cursor, "sim_info");
        final int _cursorIndexOfSubId = CursorUtil.getColumnIndex(cursor, "sub_id");
        final int _cursorIndexOfCallType = CursorUtil.getColumnIndex(cursor, "call_type");
        final int _cursorIndexOfTime = CursorUtil.getColumnIndex(cursor, "time");
        final LongSparseArray<ArrayList<LogsDetail>> _collectionLogsList = new LongSparseArray<ArrayList<LogsDetail>>();
        while (cursor.moveToNext()) {
          final long _tmpKey = cursor.getLong(_cursorIndexOfId);
          ArrayList<LogsDetail> _tmpLogsListCollection = _collectionLogsList.get(_tmpKey);
          if (_tmpLogsListCollection == null) {
            _tmpLogsListCollection = new ArrayList<LogsDetail>();
            _collectionLogsList.put(_tmpKey, _tmpLogsListCollection);
          }
        }
        cursor.moveToPosition(-1);
        __fetchRelationshipLogsDetailAscomIdormySmsForwarderDatabaseEntityLogsDetail(_collectionLogsList);
        final List<MsgAndLogs> _result = new ArrayList<MsgAndLogs>(cursor.getCount());
        while(cursor.moveToNext()) {
          final MsgAndLogs _item;
          final Msg _tmpMsg;
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
          final String _tmpFrom;
          if (_cursorIndexOfFrom == -1) {
            _tmpFrom = null;
          } else {
            if (cursor.isNull(_cursorIndexOfFrom)) {
              _tmpFrom = null;
            } else {
              _tmpFrom = cursor.getString(_cursorIndexOfFrom);
            }
          }
          final String _tmpContent;
          if (_cursorIndexOfContent == -1) {
            _tmpContent = null;
          } else {
            if (cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = cursor.getString(_cursorIndexOfContent);
            }
          }
          final int _tmpSimSlot;
          if (_cursorIndexOfSimSlot == -1) {
            _tmpSimSlot = 0;
          } else {
            _tmpSimSlot = cursor.getInt(_cursorIndexOfSimSlot);
          }
          final String _tmpSimInfo;
          if (_cursorIndexOfSimInfo == -1) {
            _tmpSimInfo = null;
          } else {
            if (cursor.isNull(_cursorIndexOfSimInfo)) {
              _tmpSimInfo = null;
            } else {
              _tmpSimInfo = cursor.getString(_cursorIndexOfSimInfo);
            }
          }
          final int _tmpSubId;
          if (_cursorIndexOfSubId == -1) {
            _tmpSubId = 0;
          } else {
            _tmpSubId = cursor.getInt(_cursorIndexOfSubId);
          }
          final int _tmpCallType;
          if (_cursorIndexOfCallType == -1) {
            _tmpCallType = 0;
          } else {
            _tmpCallType = cursor.getInt(_cursorIndexOfCallType);
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
          _tmpMsg = new Msg(_tmpId,_tmpType,_tmpFrom,_tmpContent,_tmpSimSlot,_tmpSimInfo,_tmpSubId,_tmpCallType,_tmpTime);
          ArrayList<LogsDetail> _tmpLogsListCollection_1 = null;
          final long _tmpKey_1 = cursor.getLong(_cursorIndexOfId);
          _tmpLogsListCollection_1 = _collectionLogsList.get(_tmpKey_1);
          if (_tmpLogsListCollection_1 == null) {
            _tmpLogsListCollection_1 = new ArrayList<LogsDetail>();
          }
          _item = new MsgAndLogs(_tmpMsg,_tmpLogsListCollection_1);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipLogsDetailAscomIdormySmsForwarderDatabaseEntityLogsDetail(
      final LongSparseArray<ArrayList<LogsDetail>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<LogsDetail>> _tmpInnerMap = new LongSparseArray<ArrayList<LogsDetail>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipLogsDetailAscomIdormySmsForwarderDatabaseEntityLogsDetail(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<LogsDetail>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipLogsDetailAscomIdormySmsForwarderDatabaseEntityLogsDetail(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`type`,`msg_id`,`rule_id`,`sender_id`,`forward_status`,`forward_response`,`time`,`rule_filed`,`rule_check`,`rule_value`,`rule_sim_slot`,`sender_type`,`sender_name` FROM `LogsDetail` WHERE `msg_id` IN (");
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
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "msg_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfType = 1;
      final int _cursorIndexOfMsgId = 2;
      final int _cursorIndexOfRuleId = 3;
      final int _cursorIndexOfSenderId = 4;
      final int _cursorIndexOfForwardStatus = 5;
      final int _cursorIndexOfForwardResponse = 6;
      final int _cursorIndexOfTime = 7;
      final int _cursorIndexOfRuleFiled = 8;
      final int _cursorIndexOfRuleCheck = 9;
      final int _cursorIndexOfRuleValue = 10;
      final int _cursorIndexOfRuleSimSlot = 11;
      final int _cursorIndexOfSenderType = 12;
      final int _cursorIndexOfSenderName = 13;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<LogsDetail> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final LogsDetail _item_1;
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
          final String _tmpRuleFiled;
          if (_cursor.isNull(_cursorIndexOfRuleFiled)) {
            _tmpRuleFiled = null;
          } else {
            _tmpRuleFiled = _cursor.getString(_cursorIndexOfRuleFiled);
          }
          final String _tmpRuleCheck;
          if (_cursor.isNull(_cursorIndexOfRuleCheck)) {
            _tmpRuleCheck = null;
          } else {
            _tmpRuleCheck = _cursor.getString(_cursorIndexOfRuleCheck);
          }
          final String _tmpRuleValue;
          if (_cursor.isNull(_cursorIndexOfRuleValue)) {
            _tmpRuleValue = null;
          } else {
            _tmpRuleValue = _cursor.getString(_cursorIndexOfRuleValue);
          }
          final String _tmpRuleSimSlot;
          if (_cursor.isNull(_cursorIndexOfRuleSimSlot)) {
            _tmpRuleSimSlot = null;
          } else {
            _tmpRuleSimSlot = _cursor.getString(_cursorIndexOfRuleSimSlot);
          }
          final int _tmpSenderType;
          _tmpSenderType = _cursor.getInt(_cursorIndexOfSenderType);
          final String _tmpSenderName;
          if (_cursor.isNull(_cursorIndexOfSenderName)) {
            _tmpSenderName = null;
          } else {
            _tmpSenderName = _cursor.getString(_cursorIndexOfSenderName);
          }
          _item_1 = new LogsDetail(_tmpId,_tmpType,_tmpMsgId,_tmpRuleId,_tmpSenderId,_tmpForwardStatus,_tmpForwardResponse,_tmpTime,_tmpRuleFiled,_tmpRuleCheck,_tmpRuleValue,_tmpRuleSimSlot,_tmpSenderType,_tmpSenderName);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
