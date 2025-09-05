package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0007\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/idormy/sms/forwarder/utils/RuleLineUtils;", "", "()V", "START_LOG", "", "TAG", "", "checkRuleLines", "msg", "Lcom/idormy/sms/forwarder/entity/MsgInfo;", "ruleLines", "checkRuleTree", "currentRuleLine", "Lcom/idormy/sms/forwarder/utils/RuleLine;", "generateRuleTree", "line", "lineNum", "", "parentRuleLine", "logg", "", "main", "args", "", "([Ljava/lang/String;)V", "startLog", "app_debug"})
public final class RuleLineUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.RuleLineUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "RuleLineUtils";
    private static boolean START_LOG = false;
    
    private RuleLineUtils() {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @kotlin.jvm.JvmStatic
    public static final void main(@org.jetbrains.annotations.NotNull
    java.lang.String[] args) throws java.lang.Exception {
    }
    
    public final void startLog(boolean startLog) {
    }
    
    private final void logg(java.lang.String msg) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final boolean checkRuleLines(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.entity.MsgInfo msg, @org.jetbrains.annotations.Nullable
    java.lang.String ruleLines) throws java.lang.Exception {
        return false;
    }
    
    /**
     * 使用规则树判断消息是否命中规则
     * Rule节点是否命中取决于：该节点是否命中、该节点子结点（如果有的话）是否命中、该节点下节点（如果有的话）是否命中
     * 递归检查
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final boolean checkRuleTree(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.entity.MsgInfo msg, @org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.utils.RuleLine currentRuleLine) throws java.lang.Exception {
        return false;
    }
    
    /**
     * 生成规则树
     * 一行代表一个规则
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final com.idormy.sms.forwarder.utils.RuleLine generateRuleTree(@org.jetbrains.annotations.NotNull
    java.lang.String line, int lineNum, @org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.utils.RuleLine parentRuleLine) throws java.lang.Exception {
        return null;
    }
}