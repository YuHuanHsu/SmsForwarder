package com.idormy.sms.forwarder.core;

import java.lang.System;

/**
 * 基础fragment，使用XPage框架搭建
 *
 *
 * 具体使用参见：https://github.com/xuexiangjys/XPage/wiki
 *
 * @author xuexiang
 * @since 2018/5/25 下午3:44
 */
@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate", "EmptyMethod"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0001\u0010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020\u001eH\u0014J\b\u0010&\u001a\u00020\u001eH\u0014J\n\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u001eH\u0016J\b\u0010-\u001a\u00020\u001eH\u0016J\b\u0010.\u001a\u00020\u001eH\u0016J \u0010/\u001a\u0004\u0018\u000100\"\b\b\u0001\u0010\u0014*\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u001401J2\u0010/\u001a\u0004\u0018\u000100\"\n\b\u0001\u0010\u0014*\u0004\u0018\u00010\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u0014012\u000e\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020301J4\u0010/\u001a\u0004\u0018\u000100\"\n\b\u0001\u0010\u0014*\u0004\u0018\u00010\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u0014012\u0006\u00104\u001a\u00020\u00162\b\u00105\u001a\u0004\u0018\u000106J\u001a\u0010/\u001a\u0004\u0018\u000100\"\b\b\u0001\u0010\u0014*\u00020\u00032\u0006\u00107\u001a\u00020\u0016J&\u00108\u001a\u0004\u0018\u0001002\u0006\u00109\u001a\u00020:2\b\u00104\u001a\u0004\u0018\u00010\u00162\b\u00105\u001a\u0004\u0018\u000106H\u0002J@\u00108\u001a\u0004\u0018\u000100\"\n\b\u0001\u0010\u0014*\u0004\u0018\u00010\u00032\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u0001012\u0006\u0010;\u001a\u00020<2\b\u00104\u001a\u0004\u0018\u00010\u00162\b\u00105\u001a\u0004\u0018\u000106J@\u00108\u001a\u0004\u0018\u000100\"\n\b\u0001\u0010\u0014*\u0004\u0018\u00010\u00032\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u0001012\u0006\u0010;\u001a\u00020<2\b\u00104\u001a\u0004\u0018\u00010\u00162\b\u00105\u001a\u0004\u0018\u00010\u0016J8\u00108\u001a\u0004\u0018\u000100\"\n\b\u0001\u0010\u0014*\u0004\u0018\u00010\u00032\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u0001012\b\u00104\u001a\u0004\u0018\u00010\u00162\b\u00105\u001a\u0004\u0018\u000106J8\u00108\u001a\u0004\u0018\u000100\"\n\b\u0001\u0010\u0014*\u0004\u0018\u00010\u00032\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u0001012\b\u00104\u001a\u0004\u0018\u00010\u00162\b\u00105\u001a\u0004\u0018\u00010\u0016J,\u0010=\u001a\u0004\u0018\u000100\"\n\b\u0001\u0010\u0014*\u0004\u0018\u00010\u00032\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u0001012\u0006\u0010>\u001a\u00020?J@\u0010=\u001a\u0004\u0018\u000100\"\n\b\u0001\u0010\u0014*\u0004\u0018\u00010\u00032\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u0001012\b\u00104\u001a\u0004\u0018\u00010\u00162\b\u00105\u001a\u0004\u0018\u0001062\u0006\u0010>\u001a\u00020?J@\u0010=\u001a\u0004\u0018\u000100\"\n\b\u0001\u0010\u0014*\u0004\u0018\u00010\u00032\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u0001012\b\u00104\u001a\u0004\u0018\u00010\u00162\b\u00105\u001a\u0004\u0018\u00010\u00162\u0006\u0010>\u001a\u00020?J\u0010\u0010@\u001a\u00020\u00162\b\u0010A\u001a\u0004\u0018\u000106J\u001d\u0010B\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H$\u00a2\u0006\u0002\u0010CR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000@DX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006D"}, d2 = {"Lcom/idormy/sms/forwarder/core/BaseFragment;", "Binding", "Landroidx/viewbinding/ViewBinding;", "Lcom/xuexiang/xpage/base/XPageFragment;", "()V", "activity", "Landroid/app/Activity;", "<set-?>", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "mIProgressLoader", "Lcom/xuexiang/xhttp2/subsciber/impl/IProgressLoader;", "progressLoader", "getProgressLoader", "()Lcom/xuexiang/xhttp2/subsciber/impl/IProgressLoader;", "deserializeObject", "T", "input", "", "clazz", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "getContext", "Landroid/content/Context;", "message", "hideCurrentPageSoftInput", "", "inflateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initListeners", "initPage", "initTitle", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDestroyView", "onPause", "onResume", "openNewPage", "Landroidx/fragment/app/Fragment;", "Ljava/lang/Class;", "containActivityClazz", "Lcom/xuexiang/xpage/base/XPageActivity;", "key", "value", "", "pageName", "openPage", "option", "Lcom/xuexiang/xpage/core/PageOption;", "addToBackStack", "", "openPageForResult", "requestCode", "", "serializeObject", "object", "viewBindingInflate", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;", "app_debug"})
public abstract class BaseFragment<Binding extends androidx.viewbinding.ViewBinding> extends com.xuexiang.xpage.base.XPageFragment {
    private com.xuexiang.xhttp2.subsciber.impl.IProgressLoader mIProgressLoader;
    
    /**
     * ViewBinding
     */
    @org.jetbrains.annotations.Nullable
    private Binding binding;
    private android.app.Activity activity;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final Binding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.Nullable
    Binding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.view.View inflateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    /**
     * 构建ViewBinding
     *
     * @param inflater  inflater
     * @param container 容器
     * @return ViewBinding
     */
    protected abstract Binding viewBindingInflate(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container);
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override
    protected void initPage() {
    }
    
    @org.jetbrains.annotations.Nullable
    protected com.xuexiang.xui.widget.actionbar.TitleBar initTitle() {
        return null;
    }
    
    @java.lang.Override
    protected void initListeners() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.xuexiang.xhttp2.subsciber.impl.IProgressLoader getProgressLoader() {
        return null;
    }
    
    /**
     * 获取进度条加载者
     *
     * @param message 提示信息
     * @return 进度条加载者
     */
    @org.jetbrains.annotations.Nullable
    public final com.xuexiang.xhttp2.subsciber.impl.IProgressLoader getProgressLoader(@org.jetbrains.annotations.Nullable
    java.lang.String message) {
        return null;
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
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
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openNewPage(@org.jetbrains.annotations.NotNull
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
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openNewPage(@org.jetbrains.annotations.NotNull
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
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openNewPage(@org.jetbrains.annotations.NotNull
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
    public final <T extends com.xuexiang.xpage.base.XPageFragment>androidx.fragment.app.Fragment openNewPage(@org.jetbrains.annotations.NotNull
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull
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
    
    /**
     * 反序列化对象
     *
     * @param input 反序列化的内容
     * @param clazz 类型
     * @return 反序列化结果
     */
    public final <T extends java.lang.Object>T deserializeObject(@org.jetbrains.annotations.Nullable
    java.lang.String input, @org.jetbrains.annotations.Nullable
    java.lang.reflect.Type clazz) {
        return null;
    }
    
    @java.lang.Override
    protected void hideCurrentPageSoftInput() {
    }
}