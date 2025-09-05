package com.idormy.sms.forwarder.widget;

import java.lang.System;

/**
 * Material风格的上拉加载
 *
 * @author xuexiang
 * @since 2019-08-03 11:14
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0017J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0017J \u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0017J0\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0017J \u0010#\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0017J \u0010$\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0017J \u0010%\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'H\u0017J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000fH\u0016J\u0014\u0010+\u001a\u00020\r2\n\u0010,\u001a\u00020-\"\u00020\u0011H\u0016\u00a8\u0006."}, d2 = {"Lcom/idormy/sms/forwarder/widget/MaterialFooter;", "Landroid/widget/ProgressBar;", "Lcom/scwang/smartrefresh/layout/api/RefreshFooter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getSpinnerStyle", "Lcom/scwang/smartrefresh/layout/constant/SpinnerStyle;", "getView", "Landroid/view/View;", "initView", "", "isSupportHorizontalDrag", "", "onFinish", "", "refreshLayout", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "success", "onHorizontalDrag", "percentX", "", "offsetX", "offsetMax", "onInitialized", "kernel", "Lcom/scwang/smartrefresh/layout/api/RefreshKernel;", "height", "maxDragHeight", "onMoving", "isDragging", "percent", "offset", "onReleased", "onStartAnimator", "onStateChanged", "oldState", "Lcom/scwang/smartrefresh/layout/constant/RefreshState;", "newState", "setNoMoreData", "noMoreData", "setPrimaryColors", "colors", "", "app_debug"})
public final class MaterialFooter extends android.widget.ProgressBar implements com.scwang.smartrefresh.layout.api.RefreshFooter {
    
    @kotlin.jvm.JvmOverloads
    public MaterialFooter(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public MaterialFooter(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    private final void initView() {
    }
    
    @java.lang.Override
    public boolean setNoMoreData(boolean noMoreData) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override
    public void onStartAnimator(@org.jetbrains.annotations.NotNull
    com.scwang.smartrefresh.layout.api.RefreshLayout refreshLayout, int height, int maxDragHeight) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override
    public int onFinish(@org.jetbrains.annotations.NotNull
    com.scwang.smartrefresh.layout.api.RefreshLayout refreshLayout, boolean success) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override
    public void onStateChanged(@org.jetbrains.annotations.NotNull
    com.scwang.smartrefresh.layout.api.RefreshLayout refreshLayout, @org.jetbrains.annotations.NotNull
    com.scwang.smartrefresh.layout.constant.RefreshState oldState, @org.jetbrains.annotations.NotNull
    com.scwang.smartrefresh.layout.constant.RefreshState newState) {
    }
    
    @java.lang.Override
    public void setPrimaryColors(@org.jetbrains.annotations.NotNull
    int... colors) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override
    public void onInitialized(@org.jetbrains.annotations.NotNull
    com.scwang.smartrefresh.layout.api.RefreshKernel kernel, int height, int maxDragHeight) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override
    public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override
    public void onReleased(@org.jetbrains.annotations.NotNull
    com.scwang.smartrefresh.layout.api.RefreshLayout refreshLayout, int height, int maxDragHeight) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {
    }
    
    @java.lang.Override
    public boolean isSupportHorizontalDrag() {
        return false;
    }
}