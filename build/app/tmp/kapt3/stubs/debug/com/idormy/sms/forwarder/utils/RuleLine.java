package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0000J\u0010\u0010\u001d\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\u0000J\u0010\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000J\b\u0010 \u001a\u00020\u0003H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/idormy/sms/forwarder/utils/RuleLine;", "", "line", "", "lineNum", "", "beforeRuleLine", "(Ljava/lang/String;ILcom/idormy/sms/forwarder/utils/RuleLine;)V", "check", "childRuleLine", "conjunction", "getConjunction", "()Ljava/lang/String;", "setConjunction", "(Ljava/lang/String;)V", "field", "headSpaceNum", "nextRuleLine", "parentRuleLine", "sure", "value", "checkMsg", "", "msg", "Lcom/idormy/sms/forwarder/entity/MsgInfo;", "checkValue", "msgValue", "getChildRuleLine", "getNextRuleLine", "setChildRuleLine", "", "setNextRuleLine", "toString", "Companion", "app_debug"})
public final class RuleLine {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.RuleLine.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CONJUNCTION_AND = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CONJUNCTION_OR = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FILED_PHONE_NUM = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FILED_MSG_CONTENT = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FILED_PACKAGE_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FILED_UID = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FILED_INFORM_TITLE = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FILED_INFORM_CONTENT = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FILED_SIM_SLOT_INFO = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FILED_CALL_TYPE = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SURE_YES = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SURE_NOT = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHECK_EQUALS = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHECK_CONTAIN = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHECK_NOT_CONTAIN = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHECK_START_WITH = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHECK_END_WITH = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHECK_REGEX = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> CONJUNCTION_LIST = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> FILED_LIST = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> SURE_LIST = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> CHECK_LIST = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "RuleLine";
    private static boolean START_LOG = true;
    private int headSpaceNum = 0;
    private com.idormy.sms.forwarder.utils.RuleLine beforeRuleLine;
    private com.idormy.sms.forwarder.utils.RuleLine nextRuleLine;
    private com.idormy.sms.forwarder.utils.RuleLine parentRuleLine;
    private com.idormy.sms.forwarder.utils.RuleLine childRuleLine;
    @org.jetbrains.annotations.NotNull
    private java.lang.String conjunction;
    private java.lang.String field;
    private java.lang.String sure;
    private java.lang.String check;
    private java.lang.String value;
    
    public RuleLine(@org.jetbrains.annotations.NotNull
    java.lang.String line, int lineNum, @org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.utils.RuleLine beforeRuleLine) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConjunction() {
        return null;
    }
    
    public final void setConjunction(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean checkMsg(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.entity.MsgInfo msg) {
        return false;
    }
    
    private final boolean checkValue(java.lang.String msgValue) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.idormy.sms.forwarder.utils.RuleLine getNextRuleLine() {
        return null;
    }
    
    public final void setNextRuleLine(@org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.utils.RuleLine nextRuleLine) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.idormy.sms.forwarder.utils.RuleLine getChildRuleLine() {
        return null;
    }
    
    public final void setChildRuleLine(@org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.utils.RuleLine childRuleLine) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0004J\u000e\u00109\u001a\u0002072\u0006\u00109\u001a\u00020.R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000eR\u0011\u0010#\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0011\u0010\'\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0011\u0010)\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0011\u0010+\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u000e\u0010-\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u000eR\u0011\u00101\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0006R\u0011\u00103\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0006R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/idormy/sms/forwarder/utils/RuleLine$Companion;", "", "()V", "CHECK_CONTAIN", "", "getCHECK_CONTAIN", "()Ljava/lang/String;", "CHECK_END_WITH", "getCHECK_END_WITH", "CHECK_EQUALS", "getCHECK_EQUALS", "CHECK_LIST", "", "getCHECK_LIST", "()Ljava/util/List;", "CHECK_NOT_CONTAIN", "getCHECK_NOT_CONTAIN", "CHECK_REGEX", "getCHECK_REGEX", "CHECK_START_WITH", "getCHECK_START_WITH", "CONJUNCTION_AND", "getCONJUNCTION_AND", "CONJUNCTION_LIST", "getCONJUNCTION_LIST", "CONJUNCTION_OR", "getCONJUNCTION_OR", "FILED_CALL_TYPE", "getFILED_CALL_TYPE", "FILED_INFORM_CONTENT", "getFILED_INFORM_CONTENT", "FILED_INFORM_TITLE", "getFILED_INFORM_TITLE", "FILED_LIST", "getFILED_LIST", "FILED_MSG_CONTENT", "getFILED_MSG_CONTENT", "FILED_PACKAGE_NAME", "getFILED_PACKAGE_NAME", "FILED_PHONE_NUM", "getFILED_PHONE_NUM", "FILED_SIM_SLOT_INFO", "getFILED_SIM_SLOT_INFO", "FILED_UID", "getFILED_UID", "START_LOG", "", "SURE_LIST", "getSURE_LIST", "SURE_NOT", "getSURE_NOT", "SURE_YES", "getSURE_YES", "TAG", "logg", "", "msg", "startLog", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCONJUNCTION_AND() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCONJUNCTION_OR() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFILED_PHONE_NUM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFILED_MSG_CONTENT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFILED_PACKAGE_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFILED_UID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFILED_INFORM_TITLE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFILED_INFORM_CONTENT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFILED_SIM_SLOT_INFO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFILED_CALL_TYPE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSURE_YES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSURE_NOT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCHECK_EQUALS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCHECK_CONTAIN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCHECK_NOT_CONTAIN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCHECK_START_WITH() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCHECK_END_WITH() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCHECK_REGEX() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getCONJUNCTION_LIST() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getFILED_LIST() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getSURE_LIST() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getCHECK_LIST() {
            return null;
        }
        
        public final void startLog(boolean startLog) {
        }
        
        public final void logg(@org.jetbrains.annotations.Nullable
        java.lang.String msg) {
        }
    }
}