package com.idormy.sms.forwarder.core;

import java.lang.System;

/**
 * @author xuexiang
 * @since 2018/12/29 下午12:41
 */
@kotlin.Suppress(names = {"unused", "MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0004J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J$\u0010\f\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u0011J6\u0010\f\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00112\u0010\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0011J8\u0010\f\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u001e\u0010\f\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J&\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J@\u0010\u0019\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J@\u0010\u0019\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J8\u0010\u0019\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J8\u0010\u0019\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J,\u0010\u001e\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020 J@\u0010\u001e\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001f\u001a\u00020 J@\u0010\u001e\u001a\u0004\u0018\u00010\r\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0017\u00a8\u0006#"}, d2 = {"Lcom/idormy/sms/forwarder/core/BaseSimpleListFragment;", "Lcom/xuexiang/xpage/base/XPageSimpleListFragment;", "()V", "initPage", "", "initTitle", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onPause", "onResume", "openNewPage", "Landroidx/fragment/app/Fragment;", "T", "Lcom/xuexiang/xpage/base/XPageFragment;", "clazz", "Ljava/lang/Class;", "containActivityClazz", "Lcom/xuexiang/xpage/base/XPageActivity;", "key", "", "value", "", "pageName", "openPage", "option", "Lcom/xuexiang/xpage/core/PageOption;", "addToBackStack", "", "openPageForResult", "requestCode", "", "serializeObject", "object", "app_debug"})
public abstract class BaseSimpleListFragment extends com.xuexiang.xpage.base.XPageSimpleListFragment {
    
    public BaseSimpleListFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initPage() {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.xuexiang.xui.widget.actionbar.TitleBar initTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    /**
     * 打开一个新的页面【建议只在主tab页使用】
     *
     * @param clazz 页面的类
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openNewPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz) {
        return null;
    }
    
    /**
     * 打开一个新的页面【建议只在主tab页使用】
     *
     * @param pageName 页面名
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openNewPage(@org.jetbrains.annotations.Nullable
    java.lang.String pageName) {
        return null;
    }
    
    /**
     * 打开一个新的页面【建议只在主tab页使用】
     *
     * @param clazz                页面的类
     * @param containActivityClazz 页面容器
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openNewPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull
    java.lang.Class<? extends com.xuexiang.xpage.base.XPageActivity> containActivityClazz) {
        return null;
    }
    
    /**
     * 打开一个新的页面【建议只在主tab页使用】
     *
     * @param clazz 页面的类
     * @param key   入参的键
     * @param value 入参的值
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openNewPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, @org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Object value) {
        return null;
    }
    
    private final androidx.fragment.app.Fragment openPage(com.xuexiang.xpage.core.PageOption option, java.lang.String key, java.lang.Object value) {
        return null;
    }
    
    /**
     * 打开页面
     *
     * @param clazz          页面的类
     * @param addToBackStack 是否加入回退栈
     * @param key            入参的键
     * @param value          入参的值
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, boolean addToBackStack, @org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value) {
        return null;
    }
    
    /**
     * 打开页面
     *
     * @param clazz 页面的类
     * @param key   入参的键
     * @param value 入参的值
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, @org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Object value) {
        return null;
    }
    
    /**
     * 打开页面
     *
     * @param clazz          页面的类
     * @param addToBackStack 是否加入回退栈
     * @param key            入参的键
     * @param value          入参的值
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, boolean addToBackStack, @org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Object value) {
        return null;
    }
    
    /**
     * 打开页面
     *
     * @param clazz 页面的类
     * @param key   入参的键
     * @param value 入参的值
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, @org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value) {
        return null;
    }
    
    /**
     * 打开页面,需要结果返回
     *
     * @param clazz       页面的类
     * @param key         入参的键
     * @param value       入参的值
     * @param requestCode 请求码
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openPageForResult(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, @org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Object value, int requestCode) {
        return null;
    }
    
    /**
     * 打开页面,需要结果返回
     *
     * @param clazz       页面的类
     * @param key         入参的键
     * @param value       入参的值
     * @param requestCode 请求码
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openPageForResult(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, @org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value, int requestCode) {
        return null;
    }
    
    /**
     * 打开页面,需要结果返回
     *
     * @param clazz       页面的类
     * @param requestCode 请求码
     * @param <T>
     * @return
     *   </T>
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openPageForResult(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, int requestCode) {
        return null;
    }
    
    /**
     * 序列化对象
     *
     * @param object 需要序列化的对象
     * @return 序列化结果
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String serializeObject(@org.jetbrains.annotations.Nullable
    java.lang.Object object) {
        return null;
    }
}