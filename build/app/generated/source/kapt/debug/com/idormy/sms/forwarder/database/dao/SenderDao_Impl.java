package com.idormy.sms.forwarder.database.dao;

import android.database.Cursor;
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
import com.idormy.sms.forwarder.database.entity.Sender;
import com.idormy.sms.forwarder.database.ext.ConvertersDate;
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
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SenderDao_Impl implements SenderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Sender> __insertionAdapterOfSender;

  private final ConvertersDate __convertersDate = new ConvertersDate();

  private final EntityDeletionOrUpdateAdapter<Sender> __deletionAdapterOfSender;

  private final EntityDeletionOrUpdateAdapter<Sender> __updateAdapterOfSender;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public SenderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSender = new EntityInsertionAdapter<Sender>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Sender` (`id`,`type`,`name`,`json_setting`,`status`,`time`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Sender value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getType());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getJsonSetting() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getJsonSetting());
        }
        stmt.bindLong(5, value.getStatus());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
      }
    };
    this.__deletionAdapterOfSender = new EntityDeletionOrUpdateAdapter<Sender>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Sender` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Sender value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfSender = new EntityDeletionOrUpdateAdapter<Sender>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Sender` SET `id` = ?,`type` = ?,`name` = ?,`json_setting` = ?,`status` = ?,`time` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Sender value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getType());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getJsonSetting() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getJsonSetting());
        }
        stmt.bindLong(5, value.getStatus());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Sender where id=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Sender";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Sender sender) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSender.insert(sender);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable delete(final Sender sender) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSender.handle(sender);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void update(final Sender sender) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSender.handle(sender);
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
  public Single<Sender> get(final long id) {
    final String _sql = "SELECT * FROM Sender where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<Sender>() {
      @Override
      public Sender call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfJsonSetting = CursorUtil.getColumnIndexOrThrow(_cursor, "json_setting");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final Sender _result;
          if(_cursor.moveToFirst()) {
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
            _result = new Sender(_tmpId,_tmpType,_tmpName,_tmpJsonSetting,_tmpStatus,_tmpTime);
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
  public Sender getOne(final long id) {
    final String _sql = "SELECT * FROM Sender where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfJsonSetting = CursorUtil.getColumnIndexOrThrow(_cursor, "json_setting");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final Sender _result;
      if(_cursor.moveToFirst()) {
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
        _result = new Sender(_tmpId,_tmpType,_tmpName,_tmpJsonSetting,_tmpStatus,_tmpTime);
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
  public List<Sender> getByIds(final List<Long> ids) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM Sender WHERE id IN (");
    final int _inputSize = ids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (Long _item : ids) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfJsonSetting = CursorUtil.getColumnIndexOrThrow(_cursor, "json_setting");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final List<Sender> _result = new ArrayList<Sender>(_cursor.getCount());
      while(_cursor.moveToNext()) {
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
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Single<Integer> count(final String type, final int status) {
    final String _sql = "SELECT count(*) FROM Sender where type=? and status=?";
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
  public PagingSource<Integer, Sender> pagingSource(final int status) {
    final String _sql = "SELECT * FROM Sender where status=? ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, status);
    return new LimitOffsetPagingSource<Sender>(_statement, __db, "Sender") {
      @Override
      protected List<Sender> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
        final int _cursorIndexOfJsonSetting = CursorUtil.getColumnIndexOrThrow(cursor, "json_setting");
        final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(cursor, "status");
        final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(cursor, "time");
        final List<Sender> _result = new ArrayList<Sender>(cursor.getCount());
        while(cursor.moveToNext()) {
          final Sender _item;
          final long _tmpId;
          _tmpId = cursor.getLong(_cursorIndexOfId);
          final int _tmpType;
          _tmpType = cursor.getInt(_cursorIndexOfType);
          final String _tmpName;
          if (cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = cursor.getString(_cursorIndexOfName);
          }
          final String _tmpJsonSetting;
          if (cursor.isNull(_cursorIndexOfJsonSetting)) {
            _tmpJsonSetting = null;
          } else {
            _tmpJsonSetting = cursor.getString(_cursorIndexOfJsonSetting);
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
          _item = new Sender(_tmpId,_tmpType,_tmpName,_tmpJsonSetting,_tmpStatus,_tmpTime);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public Single<List<Sender>> getAll() {
    final String _sql = "SELECT * FROM Sender ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<Sender>>() {
      @Override
      public List<Sender> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfJsonSetting = CursorUtil.getColumnIndexOrThrow(_cursor, "json_setting");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final List<Sender> _result = new ArrayList<Sender>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Sender _item;
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
            _item = new Sender(_tmpId,_tmpType,_tmpName,_tmpJsonSetting,_tmpStatus,_tmpTime);
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
  public Flow<Long> getOnCount() {
    final String _sql = "SELECT COUNT(id) FROM Sender WHERE status = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Sender"}, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
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
    _stringBuilder.append("UPDATE Sender SET status=");
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
  public List<Sender> getAllRaw(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
      try {
        final List<Sender> _result = new ArrayList<Sender>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final Sender _item;
          _item = __entityCursorConverter_comIdormySmsForwarderDatabaseEntitySender(_cursor);
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

  private Sender __entityCursorConverter_comIdormySmsForwarderDatabaseEntitySender(Cursor cursor) {
    final Sender _entity;
    final int _cursorIndexOfId = CursorUtil.getColumnIndex(cursor, "id");
    final int _cursorIndexOfType = CursorUtil.getColumnIndex(cursor, "type");
    final int _cursorIndexOfName = CursorUtil.getColumnIndex(cursor, "name");
    final int _cursorIndexOfJsonSetting = CursorUtil.getColumnIndex(cursor, "json_setting");
    final int _cursorIndexOfStatus = CursorUtil.getColumnIndex(cursor, "status");
    final int _cursorIndexOfTime = CursorUtil.getColumnIndex(cursor, "time");
    final long _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = 0;
    } else {
      _tmpId = cursor.getLong(_cursorIndexOfId);
    }
    final int _tmpType;
    if (_cursorIndexOfType == -1) {
      _tmpType = 0;
    } else {
      _tmpType = cursor.getInt(_cursorIndexOfType);
    }
    final String _tmpName;
    if (_cursorIndexOfName == -1) {
      _tmpName = null;
    } else {
      if (cursor.isNull(_cursorIndexOfName)) {
        _tmpName = null;
      } else {
        _tmpName = cursor.getString(_cursorIndexOfName);
      }
    }
    final String _tmpJsonSetting;
    if (_cursorIndexOfJsonSetting == -1) {
      _tmpJsonSetting = null;
    } else {
      if (cursor.isNull(_cursorIndexOfJsonSetting)) {
        _tmpJsonSetting = null;
      } else {
        _tmpJsonSetting = cursor.getString(_cursorIndexOfJsonSetting);
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
    _entity = new Sender(_tmpId,_tmpType,_tmpName,_tmpJsonSetting,_tmpStatus,_tmpTime);
    return _entity;
  }
}
