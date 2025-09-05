package com.idormy.sms.forwarder.utils.task;

import java.lang.System;

/**
 * 自动任务条件工具类
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/task/ConditionUtils;", "", "()V", "Companion", "app_debug"})
public final class ConditionUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.task.ConditionUtils.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    private ConditionUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/idormy/sms/forwarder/utils/task/ConditionUtils$Companion;", "", "()V", "TAG", "", "calculateDistance", "", "lat1", "lon1", "lat2", "lon2", "checkCondition", "", "taskId", "", "conditionList", "", "Lcom/idormy/sms/forwarder/entity/TaskSetting;", "beginIndex", "", "endIndex", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean checkCondition(long taskId, @org.jetbrains.annotations.NotNull
        java.util.List<com.idormy.sms.forwarder.entity.TaskSetting> conditionList, int beginIndex, int endIndex) {
            return false;
        }
        
        public final double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
            return 0.0;
        }
    }
}