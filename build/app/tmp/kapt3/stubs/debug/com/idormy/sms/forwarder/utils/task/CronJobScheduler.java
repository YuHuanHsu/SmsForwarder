package com.idormy.sms.forwarder.utils.task;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/task/CronJobScheduler;", "", "()V", "Companion", "app_debug"})
public final class CronJobScheduler {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.task.CronJobScheduler.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    public CronJobScheduler() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/idormy/sms/forwarder/utils/task/CronJobScheduler$Companion;", "", "()V", "TAG", "", "cancelTask", "", "taskId", "", "scheduleTask", "task", "Lcom/idormy/sms/forwarder/database/entity/Task;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void scheduleTask(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.database.entity.Task task) {
        }
        
        public final void cancelTask(long taskId) {
        }
    }
}