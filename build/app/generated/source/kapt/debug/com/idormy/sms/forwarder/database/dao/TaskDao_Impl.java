package com.idormy.sms.forwarder.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
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
import com.idormy.sms.forwarder.database.entity.Task;
import com.idormy.sms.forwarder.database.ext.ConvertersDate;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Task> __insertionAdapterOfTask;

  private final ConvertersDate __convertersDate = new ConvertersDate();

  private final EntityDeletionOrUpdateAdapter<Task> __updateAdapterOfTask;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfUpdateExecTime;

  private final SharedSQLiteStatement __preparedStmtOfUpdateStatus;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTask = new EntityInsertionAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Task` (`id`,`type`,`name`,`description`,`conditions`,`actions`,`status`,`last_exec_time`,`next_exec_time`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getType());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getConditions() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getConditions());
        }
        if (value.getActions() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getActions());
        }
        stmt.bindLong(7, value.getStatus());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getLastExecTime());
        if (_tmp == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp);
        }
        final Long _tmp_1 = __convertersDate.dateToTimestamp(value.getNextExecTime());
        if (_tmp_1 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp_1);
        }
      }
    };
    this.__updateAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Task` SET `id` = ?,`type` = ?,`name` = ?,`description` = ?,`conditions` = ?,`actions` = ?,`status` = ?,`last_exec_time` = ?,`next_exec_time` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getType());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getConditions() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getConditions());
        }
        if (value.getActions() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getActions());
        }
        stmt.bindLong(7, value.getStatus());
        final Long _tmp = __convertersDate.dateToTimestamp(value.getLastExecTime());
        if (_tmp == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp);
        }
        final Long _tmp_1 = __convertersDate.dateToTimestamp(value.getNextExecTime());
        if (_tmp_1 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp_1);
        }
        stmt.bindLong(10, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Task WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Task";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateExecTime = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Task SET last_exec_time = ?, next_exec_time = ?, status = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Task SET status = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final Task task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTask.insertAndReturnId(task);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Task task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTask.handle(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final long taskId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, taskId);
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
  public void updateExecTime(final long taskId, final Date lastExecTime, final Date nextExecTime,
      final int status) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateExecTime.acquire();
    int _argIndex = 1;
    final Long _tmp = __convertersDate.dateToTimestamp(lastExecTime);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1 = __convertersDate.dateToTimestamp(nextExecTime);
    if (_tmp_1 == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, _tmp_1);
    }
    _argIndex = 3;
    _stmt.bindLong(_argIndex, status);
    _argIndex = 4;
    _stmt.bindLong(_argIndex, taskId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateExecTime.release(_stmt);
    }
  }

  @Override
  public void updateStatus(final long id, final int status) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateStatus.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, status);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateStatus.release(_stmt);
    }
  }

  @Override
  public Single<Task> get(final long id) {
    final String _sql = "SELECT * FROM Task where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<Task>() {
      @Override
      public Task call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfConditions = CursorUtil.getColumnIndexOrThrow(_cursor, "conditions");
          final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(_cursor, "actions");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfLastExecTime = CursorUtil.getColumnIndexOrThrow(_cursor, "last_exec_time");
          final int _cursorIndexOfNextExecTime = CursorUtil.getColumnIndexOrThrow(_cursor, "next_exec_time");
          final Task _result;
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
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpConditions;
            if (_cursor.isNull(_cursorIndexOfConditions)) {
              _tmpConditions = null;
            } else {
              _tmpConditions = _cursor.getString(_cursorIndexOfConditions);
            }
            final String _tmpActions;
            if (_cursor.isNull(_cursorIndexOfActions)) {
              _tmpActions = null;
            } else {
              _tmpActions = _cursor.getString(_cursorIndexOfActions);
            }
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final Date _tmpLastExecTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfLastExecTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfLastExecTime);
            }
            _tmpLastExecTime = __convertersDate.fromTimestamp(_tmp);
            final Date _tmpNextExecTime;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfNextExecTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfNextExecTime);
            }
            _tmpNextExecTime = __convertersDate.fromTimestamp(_tmp_1);
            _result = new Task(_tmpId,_tmpType,_tmpName,_tmpDescription,_tmpConditions,_tmpActions,_tmpStatus,_tmpLastExecTime,_tmpNextExecTime);
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
  public Object getOne(final long id, final Continuation<? super Task> continuation) {
    final String _sql = "SELECT * FROM Task where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Task>() {
      @Override
      public Task call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfConditions = CursorUtil.getColumnIndexOrThrow(_cursor, "conditions");
          final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(_cursor, "actions");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfLastExecTime = CursorUtil.getColumnIndexOrThrow(_cursor, "last_exec_time");
          final int _cursorIndexOfNextExecTime = CursorUtil.getColumnIndexOrThrow(_cursor, "next_exec_time");
          final Task _result;
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
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpConditions;
            if (_cursor.isNull(_cursorIndexOfConditions)) {
              _tmpConditions = null;
            } else {
              _tmpConditions = _cursor.getString(_cursorIndexOfConditions);
            }
            final String _tmpActions;
            if (_cursor.isNull(_cursorIndexOfActions)) {
              _tmpActions = null;
            } else {
              _tmpActions = _cursor.getString(_cursorIndexOfActions);
            }
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final Date _tmpLastExecTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfLastExecTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfLastExecTime);
            }
            _tmpLastExecTime = __convertersDate.fromTimestamp(_tmp);
            final Date _tmpNextExecTime;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfNextExecTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfNextExecTime);
            }
            _tmpNextExecTime = __convertersDate.fromTimestamp(_tmp_1);
            _result = new Task(_tmpId,_tmpType,_tmpName,_tmpDescription,_tmpConditions,_tmpActions,_tmpStatus,_tmpLastExecTime,_tmpNextExecTime);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, Task> pagingSourceFixed() {
    final String _sql = "SELECT * FROM Task where type < 1000 ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<Task>(_statement, __db, "Task") {
      @Override
      protected List<Task> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
        final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(cursor, "description");
        final int _cursorIndexOfConditions = CursorUtil.getColumnIndexOrThrow(cursor, "conditions");
        final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(cursor, "actions");
        final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(cursor, "status");
        final int _cursorIndexOfLastExecTime = CursorUtil.getColumnIndexOrThrow(cursor, "last_exec_time");
        final int _cursorIndexOfNextExecTime = CursorUtil.getColumnIndexOrThrow(cursor, "next_exec_time");
        final List<Task> _result = new ArrayList<Task>(cursor.getCount());
        while(cursor.moveToNext()) {
          final Task _item;
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
          final String _tmpDescription;
          if (cursor.isNull(_cursorIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = cursor.getString(_cursorIndexOfDescription);
          }
          final String _tmpConditions;
          if (cursor.isNull(_cursorIndexOfConditions)) {
            _tmpConditions = null;
          } else {
            _tmpConditions = cursor.getString(_cursorIndexOfConditions);
          }
          final String _tmpActions;
          if (cursor.isNull(_cursorIndexOfActions)) {
            _tmpActions = null;
          } else {
            _tmpActions = cursor.getString(_cursorIndexOfActions);
          }
          final int _tmpStatus;
          _tmpStatus = cursor.getInt(_cursorIndexOfStatus);
          final Date _tmpLastExecTime;
          final Long _tmp;
          if (cursor.isNull(_cursorIndexOfLastExecTime)) {
            _tmp = null;
          } else {
            _tmp = cursor.getLong(_cursorIndexOfLastExecTime);
          }
          _tmpLastExecTime = __convertersDate.fromTimestamp(_tmp);
          final Date _tmpNextExecTime;
          final Long _tmp_1;
          if (cursor.isNull(_cursorIndexOfNextExecTime)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = cursor.getLong(_cursorIndexOfNextExecTime);
          }
          _tmpNextExecTime = __convertersDate.fromTimestamp(_tmp_1);
          _item = new Task(_tmpId,_tmpType,_tmpName,_tmpDescription,_tmpConditions,_tmpActions,_tmpStatus,_tmpLastExecTime,_tmpNextExecTime);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public PagingSource<Integer, Task> pagingSourceMine() {
    final String _sql = "SELECT * FROM Task where type >= 1000 ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<Task>(_statement, __db, "Task") {
      @Override
      protected List<Task> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
        final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(cursor, "description");
        final int _cursorIndexOfConditions = CursorUtil.getColumnIndexOrThrow(cursor, "conditions");
        final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(cursor, "actions");
        final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(cursor, "status");
        final int _cursorIndexOfLastExecTime = CursorUtil.getColumnIndexOrThrow(cursor, "last_exec_time");
        final int _cursorIndexOfNextExecTime = CursorUtil.getColumnIndexOrThrow(cursor, "next_exec_time");
        final List<Task> _result = new ArrayList<Task>(cursor.getCount());
        while(cursor.moveToNext()) {
          final Task _item;
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
          final String _tmpDescription;
          if (cursor.isNull(_cursorIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = cursor.getString(_cursorIndexOfDescription);
          }
          final String _tmpConditions;
          if (cursor.isNull(_cursorIndexOfConditions)) {
            _tmpConditions = null;
          } else {
            _tmpConditions = cursor.getString(_cursorIndexOfConditions);
          }
          final String _tmpActions;
          if (cursor.isNull(_cursorIndexOfActions)) {
            _tmpActions = null;
          } else {
            _tmpActions = cursor.getString(_cursorIndexOfActions);
          }
          final int _tmpStatus;
          _tmpStatus = cursor.getInt(_cursorIndexOfStatus);
          final Date _tmpLastExecTime;
          final Long _tmp;
          if (cursor.isNull(_cursorIndexOfLastExecTime)) {
            _tmp = null;
          } else {
            _tmp = cursor.getLong(_cursorIndexOfLastExecTime);
          }
          _tmpLastExecTime = __convertersDate.fromTimestamp(_tmp);
          final Date _tmpNextExecTime;
          final Long _tmp_1;
          if (cursor.isNull(_cursorIndexOfNextExecTime)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = cursor.getLong(_cursorIndexOfNextExecTime);
          }
          _tmpNextExecTime = __convertersDate.fromTimestamp(_tmp_1);
          _item = new Task(_tmpId,_tmpType,_tmpName,_tmpDescription,_tmpConditions,_tmpActions,_tmpStatus,_tmpLastExecTime,_tmpNextExecTime);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public Single<List<Task>> getAll() {
    final String _sql = "SELECT * FROM Task ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<Task>>() {
      @Override
      public List<Task> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfConditions = CursorUtil.getColumnIndexOrThrow(_cursor, "conditions");
          final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(_cursor, "actions");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfLastExecTime = CursorUtil.getColumnIndexOrThrow(_cursor, "last_exec_time");
          final int _cursorIndexOfNextExecTime = CursorUtil.getColumnIndexOrThrow(_cursor, "next_exec_time");
          final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Task _item;
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
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpConditions;
            if (_cursor.isNull(_cursorIndexOfConditions)) {
              _tmpConditions = null;
            } else {
              _tmpConditions = _cursor.getString(_cursorIndexOfConditions);
            }
            final String _tmpActions;
            if (_cursor.isNull(_cursorIndexOfActions)) {
              _tmpActions = null;
            } else {
              _tmpActions = _cursor.getString(_cursorIndexOfActions);
            }
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final Date _tmpLastExecTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfLastExecTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfLastExecTime);
            }
            _tmpLastExecTime = __convertersDate.fromTimestamp(_tmp);
            final Date _tmpNextExecTime;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfNextExecTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfNextExecTime);
            }
            _tmpNextExecTime = __convertersDate.fromTimestamp(_tmp_1);
            _item = new Task(_tmpId,_tmpType,_tmpName,_tmpDescription,_tmpConditions,_tmpActions,_tmpStatus,_tmpLastExecTime,_tmpNextExecTime);
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
  public List<Task> getByType(final int taskType) {
    final String _sql = "SELECT * FROM Task WHERE status = 1 AND type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, taskType);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfConditions = CursorUtil.getColumnIndexOrThrow(_cursor, "conditions");
      final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(_cursor, "actions");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfLastExecTime = CursorUtil.getColumnIndexOrThrow(_cursor, "last_exec_time");
      final int _cursorIndexOfNextExecTime = CursorUtil.getColumnIndexOrThrow(_cursor, "next_exec_time");
      final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Task _item;
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
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpConditions;
        if (_cursor.isNull(_cursorIndexOfConditions)) {
          _tmpConditions = null;
        } else {
          _tmpConditions = _cursor.getString(_cursorIndexOfConditions);
        }
        final String _tmpActions;
        if (_cursor.isNull(_cursorIndexOfActions)) {
          _tmpActions = null;
        } else {
          _tmpActions = _cursor.getString(_cursorIndexOfActions);
        }
        final int _tmpStatus;
        _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        final Date _tmpLastExecTime;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfLastExecTime)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfLastExecTime);
        }
        _tmpLastExecTime = __convertersDate.fromTimestamp(_tmp);
        final Date _tmpNextExecTime;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfNextExecTime)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfNextExecTime);
        }
        _tmpNextExecTime = __convertersDate.fromTimestamp(_tmp_1);
        _item = new Task(_tmpId,_tmpType,_tmpName,_tmpDescription,_tmpConditions,_tmpActions,_tmpStatus,_tmpLastExecTime,_tmpNextExecTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public void updateStatusByIds(final List<Long> ids, final int status) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("UPDATE Task SET status=");
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
  public List<Task> getAllRaw(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
      try {
        final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final Task _item;
          _item = __entityCursorConverter_comIdormySmsForwarderDatabaseEntityTask(_cursor);
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

  private Task __entityCursorConverter_comIdormySmsForwarderDatabaseEntityTask(Cursor cursor) {
    final Task _entity;
    final int _cursorIndexOfId = CursorUtil.getColumnIndex(cursor, "id");
    final int _cursorIndexOfType = CursorUtil.getColumnIndex(cursor, "type");
    final int _cursorIndexOfName = CursorUtil.getColumnIndex(cursor, "name");
    final int _cursorIndexOfDescription = CursorUtil.getColumnIndex(cursor, "description");
    final int _cursorIndexOfConditions = CursorUtil.getColumnIndex(cursor, "conditions");
    final int _cursorIndexOfActions = CursorUtil.getColumnIndex(cursor, "actions");
    final int _cursorIndexOfStatus = CursorUtil.getColumnIndex(cursor, "status");
    final int _cursorIndexOfLastExecTime = CursorUtil.getColumnIndex(cursor, "last_exec_time");
    final int _cursorIndexOfNextExecTime = CursorUtil.getColumnIndex(cursor, "next_exec_time");
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
    final String _tmpDescription;
    if (_cursorIndexOfDescription == -1) {
      _tmpDescription = null;
    } else {
      if (cursor.isNull(_cursorIndexOfDescription)) {
        _tmpDescription = null;
      } else {
        _tmpDescription = cursor.getString(_cursorIndexOfDescription);
      }
    }
    final String _tmpConditions;
    if (_cursorIndexOfConditions == -1) {
      _tmpConditions = null;
    } else {
      if (cursor.isNull(_cursorIndexOfConditions)) {
        _tmpConditions = null;
      } else {
        _tmpConditions = cursor.getString(_cursorIndexOfConditions);
      }
    }
    final String _tmpActions;
    if (_cursorIndexOfActions == -1) {
      _tmpActions = null;
    } else {
      if (cursor.isNull(_cursorIndexOfActions)) {
        _tmpActions = null;
      } else {
        _tmpActions = cursor.getString(_cursorIndexOfActions);
      }
    }
    final int _tmpStatus;
    if (_cursorIndexOfStatus == -1) {
      _tmpStatus = 0;
    } else {
      _tmpStatus = cursor.getInt(_cursorIndexOfStatus);
    }
    final Date _tmpLastExecTime;
    if (_cursorIndexOfLastExecTime == -1) {
      _tmpLastExecTime = null;
    } else {
      final Long _tmp;
      if (cursor.isNull(_cursorIndexOfLastExecTime)) {
        _tmp = null;
      } else {
        _tmp = cursor.getLong(_cursorIndexOfLastExecTime);
      }
      _tmpLastExecTime = __convertersDate.fromTimestamp(_tmp);
    }
    final Date _tmpNextExecTime;
    if (_cursorIndexOfNextExecTime == -1) {
      _tmpNextExecTime = null;
    } else {
      final Long _tmp_1;
      if (cursor.isNull(_cursorIndexOfNextExecTime)) {
        _tmp_1 = null;
      } else {
        _tmp_1 = cursor.getLong(_cursorIndexOfNextExecTime);
      }
      _tmpNextExecTime = __convertersDate.fromTimestamp(_tmp_1);
    }
    _entity = new Task(_tmpId,_tmpType,_tmpName,_tmpDescription,_tmpConditions,_tmpActions,_tmpStatus,_tmpLastExecTime,_tmpNextExecTime);
    return _entity;
  }
}
