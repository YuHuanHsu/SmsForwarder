package com.idormy.sms.forwarder.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.idormy.sms.forwarder.database.ext.ConvertersDate.class})
@androidx.room.Database(entities = {com.idormy.sms.forwarder.database.entity.Frpc.class, com.idormy.sms.forwarder.database.entity.Msg.class, com.idormy.sms.forwarder.database.entity.Logs.class, com.idormy.sms.forwarder.database.entity.Rule.class, com.idormy.sms.forwarder.database.entity.Sender.class, com.idormy.sms.forwarder.database.entity.Task.class}, views = {com.idormy.sms.forwarder.database.entity.LogsDetail.class}, version = 20, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/idormy/sms/forwarder/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "frpcDao", "Lcom/idormy/sms/forwarder/database/dao/FrpcDao;", "logsDao", "Lcom/idormy/sms/forwarder/database/dao/LogsDao;", "msgDao", "Lcom/idormy/sms/forwarder/database/dao/MsgDao;", "ruleDao", "Lcom/idormy/sms/forwarder/database/dao/RuleDao;", "senderDao", "Lcom/idormy/sms/forwarder/database/dao/SenderDao;", "taskDao", "Lcom/idormy/sms/forwarder/database/dao/TaskDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.database.AppDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.idormy.sms.forwarder.database.AppDatabase instance;
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    private static final androidx.room.migration.Migration MIGRATION_3_4 = null;
    private static final androidx.room.migration.Migration MIGRATION_4_5 = null;
    private static final androidx.room.migration.Migration MIGRATION_5_6 = null;
    private static final androidx.room.migration.Migration MIGRATION_6_7 = null;
    private static final androidx.room.migration.Migration MIGRATION_7_8 = null;
    private static final androidx.room.migration.Migration MIGRATION_8_9 = null;
    private static final androidx.room.migration.Migration MIGRATION_9_10 = null;
    private static final androidx.room.migration.Migration MIGRATION_10_11 = null;
    private static final androidx.room.migration.Migration MIGRATION_11_12 = null;
    private static final androidx.room.migration.Migration MIGRATION_12_13 = null;
    private static final androidx.room.migration.Migration MIGRATION_13_14 = null;
    private static final androidx.room.migration.Migration MIGRATION_14_15 = null;
    private static final androidx.room.migration.Migration MIGRATION_15_16 = null;
    private static final androidx.room.migration.Migration MIGRATION_16_17 = null;
    private static final androidx.room.migration.Migration MIGRATION_17_18 = null;
    private static final androidx.room.migration.Migration MIGRATION_18_19 = null;
    private static final androidx.room.migration.Migration MIGRATION_19_20 = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.idormy.sms.forwarder.database.dao.FrpcDao frpcDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.idormy.sms.forwarder.database.dao.MsgDao msgDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.idormy.sms.forwarder.database.dao.LogsDao logsDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.idormy.sms.forwarder.database.dao.RuleDao ruleDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.idormy.sms.forwarder.database.dao.SenderDao senderDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.idormy.sms.forwarder.database.dao.TaskDao taskDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/idormy/sms/forwarder/database/AppDatabase$Companion;", "", "()V", "MIGRATION_10_11", "Landroidx/room/migration/Migration;", "MIGRATION_11_12", "MIGRATION_12_13", "MIGRATION_13_14", "MIGRATION_14_15", "MIGRATION_15_16", "MIGRATION_16_17", "MIGRATION_17_18", "MIGRATION_18_19", "MIGRATION_19_20", "MIGRATION_1_2", "MIGRATION_2_3", "MIGRATION_3_4", "MIGRATION_4_5", "MIGRATION_5_6", "MIGRATION_6_7", "MIGRATION_7_8", "MIGRATION_8_9", "MIGRATION_9_10", "instance", "Lcom/idormy/sms/forwarder/database/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.idormy.sms.forwarder.database.AppDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final com.idormy.sms.forwarder.database.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}