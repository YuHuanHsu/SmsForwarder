package com.idormy.sms.forwarder.adapter.spinner;

import java.lang.System;

@kotlin.Suppress(names = {"unused", "NAME_SHADOWING", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\'B\u0017\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0013\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0015J$\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0014\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00002\b\b\u0001\u0010\u001e\u001a\u00020\nJ\u0012\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010 \u001a\u00020\fJ\u0012\u0010!\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\"\u001a\u00020\u000eJ\u0014\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00002\b\b\u0001\u0010$\u001a\u00020\nJ\u0012\u0010%\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010&\u001a\u00020\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/idormy/sms/forwarder/adapter/spinner/FrpcSpinnerAdapter;", "T", "Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;", "Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerFilter;", "data", "", "(Ljava/util/List;)V", "", "([Ljava/lang/Object;)V", "mBackgroundSelector", "", "mFilterColor", "", "mIsFilterKey", "", "mTextColor", "mTextSize", "", "getEditSpinnerFilter", "getItemSource", "position", "(I)Ljava/lang/Object;", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "onFilter", "keyword", "setBackgroundSelector", "backgroundSelector", "setFilterColor", "filterColor", "setIsFilterKey", "isFilterKey", "setTextColor", "textColor", "setTextSize", "textSize", "ViewHolder", "app_debug"})
public final class FrpcSpinnerAdapter<T extends java.lang.Object> extends com.xuexiang.xui.widget.spinner.editspinner.BaseEditSpinnerAdapter<T> implements com.xuexiang.xui.widget.spinner.editspinner.EditSpinnerFilter {
    
    /**
     * 选项的文字颜色
     */
    private int mTextColor = 0;
    
    /**
     * 选项的文字大小
     */
    private float mTextSize = 0.0F;
    
    /**
     * 背景颜色
     */
    private int mBackgroundSelector = 0;
    
    /**
     * 过滤关键词的选中颜色
     */
    private java.lang.String mFilterColor = "#F15C58";
    private boolean mIsFilterKey = false;
    
    /**
     * 构造方法
     *
     * @param data 选项数据
     */
    public FrpcSpinnerAdapter(@org.jetbrains.annotations.Nullable
    java.util.List<? extends T> data) {
        super(null);
    }
    
    /**
     * 构造方法
     *
     * @param data 选项数据
     */
    public FrpcSpinnerAdapter(@org.jetbrains.annotations.Nullable
    T[] data) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.xuexiang.xui.widget.spinner.editspinner.EditSpinnerFilter getEditSpinnerFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable
    android.view.View convertView, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override
    public boolean onFilter(@org.jetbrains.annotations.NotNull
    java.lang.String keyword) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.spinner.FrpcSpinnerAdapter<?> setTextColor(@androidx.annotation.ColorInt
    int textColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.spinner.FrpcSpinnerAdapter<?> setTextSize(float textSize) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.spinner.FrpcSpinnerAdapter<?> setBackgroundSelector(@androidx.annotation.DrawableRes
    int backgroundSelector) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.spinner.FrpcSpinnerAdapter<?> setFilterColor(@org.jetbrains.annotations.NotNull
    java.lang.String filterColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.spinner.FrpcSpinnerAdapter<?> setIsFilterKey(boolean isFilterKey) {
        return null;
    }
    
    public final T getItemSource(int position) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ObsoleteSdkInt"})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/spinner/FrpcSpinnerAdapter$ViewHolder;", "", "convertView", "Landroid/view/View;", "textColor", "", "textSize", "", "backgroundSelector", "(Landroid/view/View;IFI)V", "iconView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "statusView", "getStatusView", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "app_debug"})
    static final class ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView iconView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView statusView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView titleView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View convertView, @androidx.annotation.ColorInt
        int textColor, float textSize, @androidx.annotation.DrawableRes
        int backgroundSelector) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getIconView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getStatusView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTitleView() {
            return null;
        }
    }
}