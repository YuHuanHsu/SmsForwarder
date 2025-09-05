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
import com.idormy.sms.forwarder.database.entity.Frpc;
import com.idormy.sms.forwarder.database.ext.ConvertersDate;
import io.reactivex.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FrpcDao_Impl implements FrpcDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Frpc> __insertionAdapterOfFrpc;

  private final ConvertersDate __convertersDate = new ConvertersDate();

  private final EntityDeletionOrUpdateAdapter<Frpc> __deletionAdapterOfFrpc;

  private final EntityDeletionOrUpdateAdapter<Frpc> __updateAdapterOfFrpc;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public FrpcDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFrpc = new EntityInsertionAdapter<Frpc>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Frpc` (`uid`,`name`,`config`,`autorun`,`time`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Frpc value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUid());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getConfig() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getConfig());
        }
        stmt.bindLong(4, value.getAutorun());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
      }
    };
    this.__deletionAdapterOfFrpc = new EntityDeletionOrUpdateAdapter<Frpc>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Frpc` WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Frpc value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUid());
        }
      }
    };
    this.__updateAdapterOfFrpc = new EntityDeletionOrUpdateAdapter<Frpc>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Frpc` SET `uid` = ?,`name` = ?,`config` = ?,`autorun` = ?,`time` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Frpc value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUid());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getConfig() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getConfig());
        }
        stmt.bindLong(4, value.getAutorun());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getTime());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        if (value.getUid() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUid());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Frpc where uid=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Frpc";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Frpc frpc) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFrpc.insert(frpc);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Frpc frpc) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfFrpc.handle(frpc);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Frpc frpc) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfFrpc.handle(frpc);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final String uid) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    if (uid == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, uid);
    }
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
  public Single<Frpc> get(final String uid) {
    final String _sql = "SELECT * FROM Frpc where uid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (uid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, uid);
    }
    return RxRoom.createSingle(new Callable<Frpc>() {
      @Override
      public Frpc call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfConfig = CursorUtil.getColumnIndexOrThrow(_cursor, "config");
          final int _cursorIndexOfAutorun = CursorUtil.getColumnIndexOrThrow(_cursor, "autorun");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final Frpc _result;
          if(_cursor.moveToFirst()) {
            _result = new Frpc();
            final String _tmpUid;
            if (_cursor.isNull(_cursorIndexOfUid)) {
              _tmpUid = null;
            } else {
              _tmpUid = _cursor.getString(_cursorIndexOfUid);
            }
            _result.setUid(_tmpUid);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _result.setName(_tmpName);
            final String _tmpConfig;
            if (_cursor.isNull(_cursorIndexOfConfig)) {
              _tmpConfig = null;
            } else {
              _tmpConfig = _cursor.getString(_cursorIndexOfConfig);
            }
            _result.setConfig(_tmpConfig);
            final int _tmpAutorun;
            _tmpAutorun = _cursor.getInt(_cursorIndexOfAutorun);
            _result.setAutorun(_tmpAutorun);
            final Date _tmpTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTime);
            }
            _tmpTime = __convertersDate.fromTimestamp(_tmp);
            _result.setTime(_tmpTime);
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
  public Frpc getOne(final String uid) {
    final String _sql = "SELECT * FROM Frpc where uid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (uid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, uid);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfConfig = CursorUtil.getColumnIndexOrThrow(_cursor, "config");
      final int _cursorIndexOfAutorun = CursorUtil.getColumnIndexOrThrow(_cursor, "autorun");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final Frpc _result;
      if(_cursor.moveToFirst()) {
        _result = new Frpc();
        final String _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getString(_cursorIndexOfUid);
        }
        _result.setUid(_tmpUid);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _result.setName(_tmpName);
        final String _tmpConfig;
        if (_cursor.isNull(_cursorIndexOfConfig)) {
          _tmpConfig = null;
        } else {
          _tmpConfig = _cursor.getString(_cursorIndexOfConfig);
        }
        _result.setConfig(_tmpConfig);
        final int _tmpAutorun;
        _tmpAutorun = _cursor.getInt(_cursorIndexOfAutorun);
        _result.setAutorun(_tmpAutorun);
        final Date _tmpTime;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTime);
        }
        _tmpTime = __convertersDate.fromTimestamp(_tmp);
        _result.setTime(_tmpTime);
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
  public List<Frpc> getAutorun() {
    final String _sql = "SELECT * FROM Frpc where autorun=1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfConfig = CursorUtil.getColumnIndexOrThrow(_cursor, "config");
      final int _cursorIndexOfAutorun = CursorUtil.getColumnIndexOrThrow(_cursor, "autorun");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final List<Frpc> _result = new ArrayList<Frpc>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Frpc _item;
        _item = new Frpc();
        final String _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getString(_cursorIndexOfUid);
        }
        _item.setUid(_tmpUid);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item.setName(_tmpName);
        final String _tmpConfig;
        if (_cursor.isNull(_cursorIndexOfConfig)) {
          _tmpConfig = null;
        } else {
          _tmpConfig = _cursor.getString(_cursorIndexOfConfig);
        }
        _item.setConfig(_tmpConfig);
        final int _tmpAutorun;
        _tmpAutorun = _cursor.getInt(_cursorIndexOfAutorun);
        _item.setAutorun(_tmpAutorun);
        final Date _tmpTime;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTime);
        }
        _tmpTime = __convertersDate.fromTimestamp(_tmp);
        _item.setTime(_tmpTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Frpc> getByUids(final List<String> uids) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM Frpc WHERE uid IN (");
    final int _inputSize = uids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : uids) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfConfig = CursorUtil.getColumnIndexOrThrow(_cursor, "config");
      final int _cursorIndexOfAutorun = CursorUtil.getColumnIndexOrThrow(_cursor, "autorun");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final List<Frpc> _result = new ArrayList<Frpc>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Frpc _item_1;
        _item_1 = new Frpc();
        final String _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getString(_cursorIndexOfUid);
        }
        _item_1.setUid(_tmpUid);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item_1.setName(_tmpName);
        final String _tmpConfig;
        if (_cursor.isNull(_cursorIndexOfConfig)) {
          _tmpConfig = null;
        } else {
          _tmpConfig = _cursor.getString(_cursorIndexOfConfig);
        }
        _item_1.setConfig(_tmpConfig);
        final int _tmpAutorun;
        _tmpAutorun = _cursor.getInt(_cursorIndexOfAutorun);
        _item_1.setAutorun(_tmpAutorun);
        final Date _tmpTime;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTime);
        }
        _tmpTime = __convertersDate.fromTimestamp(_tmp);
        _item_1.setTime(_tmpTime);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public PagingSource<Integer, Frpc> pagingSource() {
    final String _sql = "SELECT * FROM Frpc ORDER BY time DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<Frpc>(_statement, __db, "Frpc") {
      @Override
      protected List<Frpc> convertRows(Cursor cursor) {
        final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(cursor, "uid");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
        final int _cursorIndexOfConfig = CursorUtil.getColumnIndexOrThrow(cursor, "config");
        final int _cursorIndexOfAutorun = CursorUtil.getColumnIndexOrThrow(cursor, "autorun");
        final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(cursor, "time");
        final List<Frpc> _result = new ArrayList<Frpc>(cursor.getCount());
        while(cursor.moveToNext()) {
          final Frpc _item;
          _item = new Frpc();
          final String _tmpUid;
          if (cursor.isNull(_cursorIndexOfUid)) {
            _tmpUid = null;
          } else {
            _tmpUid = cursor.getString(_cursorIndexOfUid);
          }
          _item.setUid(_tmpUid);
          final String _tmpName;
          if (cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = cursor.getString(_cursorIndexOfName);
          }
          _item.setName(_tmpName);
          final String _tmpConfig;
          if (cursor.isNull(_cursorIndexOfConfig)) {
            _tmpConfig = null;
          } else {
            _tmpConfig = cursor.getString(_cursorIndexOfConfig);
          }
          _item.setConfig(_tmpConfig);
          final int _tmpAutorun;
          _tmpAutorun = cursor.getInt(_cursorIndexOfAutorun);
          _item.setAutorun(_tmpAutorun);
          final Date _tmpTime;
          final Long _tmp;
          if (cursor.isNull(_cursorIndexOfTime)) {
            _tmp = null;
          } else {
            _tmp = cursor.getLong(_cursorIndexOfTime);
          }
          _tmpTime = __convertersDate.fromTimestamp(_tmp);
          _item.setTime(_tmpTime);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public Single<List<Frpc>> getAll() {
    final String _sql = "SELECT * FROM Frpc ORDER BY time DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<Frpc>>() {
      @Override
      public List<Frpc> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfConfig = CursorUtil.getColumnIndexOrThrow(_cursor, "config");
          final int _cursorIndexOfAutorun = CursorUtil.getColumnIndexOrThrow(_cursor, "autorun");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final List<Frpc> _result = new ArrayList<Frpc>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Frpc _item;
            _item = new Frpc();
            final String _tmpUid;
            if (_cursor.isNull(_cursorIndexOfUid)) {
              _tmpUid = null;
            } else {
              _tmpUid = _cursor.getString(_cursorIndexOfUid);
            }
            _item.setUid(_tmpUid);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item.setName(_tmpName);
            final String _tmpConfig;
            if (_cursor.isNull(_cursorIndexOfConfig)) {
              _tmpConfig = null;
            } else {
              _tmpConfig = _cursor.getString(_cursorIndexOfConfig);
            }
            _item.setConfig(_tmpConfig);
            final int _tmpAutorun;
            _tmpAutorun = _cursor.getInt(_cursorIndexOfAutorun);
            _item.setAutorun(_tmpAutorun);
            final Date _tmpTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTime);
            }
            _tmpTime = __convertersDate.fromTimestamp(_tmp);
            _item.setTime(_tmpTime);
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
  public List<Frpc> getAllRaw(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
      try {
        final List<Frpc> _result = new ArrayList<Frpc>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final Frpc _item;
          _item = __entityCursorConverter_comIdormySmsForwarderDatabaseEntityFrpc(_cursor);
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

  private Frpc __entityCursorConverter_comIdormySmsForwarderDatabaseEntityFrpc(Cursor cursor) {
    final Frpc _entity;
    final int _cursorIndexOfUid = CursorUtil.getColumnIndex(cursor, "uid");
    final int _cursorIndexOfName = CursorUtil.getColumnIndex(cursor, "name");
    final int _cursorIndexOfConfig = CursorUtil.getColumnIndex(cursor, "config");
    final int _cursorIndexOfAutorun = CursorUtil.getColumnIndex(cursor, "autorun");
    final int _cursorIndexOfTime = CursorUtil.getColumnIndex(cursor, "time");
    _entity = new Frpc();
    if (_cursorIndexOfUid != -1) {
      final String _tmpUid;
      if (cursor.isNull(_cursorIndexOfUid)) {
        _tmpUid = null;
      } else {
        _tmpUid = cursor.getString(_cursorIndexOfUid);
      }
      _entity.setUid(_tmpUid);
    }
    if (_cursorIndexOfName != -1) {
      final String _tmpName;
      if (cursor.isNull(_cursorIndexOfName)) {
        _tmpName = null;
      } else {
        _tmpName = cursor.getString(_cursorIndexOfName);
      }
      _entity.setName(_tmpName);
    }
    if (_cursorIndexOfConfig != -1) {
      final String _tmpConfig;
      if (cursor.isNull(_cursorIndexOfConfig)) {
        _tmpConfig = null;
      } else {
        _tmpConfig = cursor.getString(_cursorIndexOfConfig);
      }
      _entity.setConfig(_tmpConfig);
    }
    if (_cursorIndexOfAutorun != -1) {
      final int _tmpAutorun;
      _tmpAutorun = cursor.getInt(_cursorIndexOfAutorun);
      _entity.setAutorun(_tmpAutorun);
    }
    if (_cursorIndexOfTime != -1) {
      final Date _tmpTime;
      final Long _tmp;
      if (cursor.isNull(_cursorIndexOfTime)) {
        _tmp = null;
      } else {
        _tmp = cursor.getLong(_cursorIndexOfTime);
      }
      _tmpTime = __convertersDate.fromTimestamp(_tmp);
      _entity.setTime(_tmpTime);
    }
    return _entity;
  }
}
