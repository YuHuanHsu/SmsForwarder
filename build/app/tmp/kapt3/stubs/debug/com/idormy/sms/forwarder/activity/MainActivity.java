package com.idormy.sms.forwarder.activity;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "unused", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010%\u001a\u00020&J\u0014\u0010\'\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u0010)\u001a\u00020\u0006H\u0002J\b\u0010*\u001a\u00020&H\u0002J\b\u0010+\u001a\u00020&H\u0002J\u0012\u0010,\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u00020&H\u0002J\u0006\u00101\u001a\u00020\u0014J\b\u00102\u001a\u00020&H\u0017J\u0012\u00103\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0010\u00104\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0006H\u0016J\u0006\u00105\u001a\u00020&J\u0012\u00106\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u000108H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u001dR\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001bX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/idormy/sms/forwarder/activity/MainActivity;", "Lcom/idormy/sms/forwarder/core/BaseActivity;", "Lcom/idormy/sms/forwarder/databinding/ActivityMainBinding;", "Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter$OnItemSelectedListener;", "()V", "POS_ABOUT", "", "POS_APPS", "POS_CLIENT", "POS_FRPC", "POS_HELP", "POS_LOG", "POS_RULE", "POS_SENDER", "POS_SERVER", "POS_SETTING", "POS_TASK", "TAG", "", "isSupportSlideBack", "", "()Z", "mAdapter", "Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter;", "mLLMenu", "Landroid/widget/LinearLayout;", "mMenuIcons", "", "Landroid/graphics/drawable/Drawable;", "[Landroid/graphics/drawable/Drawable;", "mMenuTitles", "[Ljava/lang/String;", "mSlidingRootNav", "Lcom/yarolegovich/slidingrootnav/SlidingRootNav;", "mTabLayout", "Lcom/google/android/material/tabs/TabLayout;", "needToAppListFragment", "closeMenu", "", "createItemFor", "Lcom/idormy/sms/forwarder/adapter/menu/DrawerItem;", "position", "downloadFrpcLib", "initData", "initSlidingMenu", "savedInstanceState", "Landroid/os/Bundle;", "initTab", "initViews", "isMenuOpen", "onBackPressed", "onCreate", "onItemSelected", "openMenu", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "app_debug"})
public final class MainActivity extends com.idormy.sms.forwarder.core.BaseActivity<com.idormy.sms.forwarder.databinding.ActivityMainBinding> implements com.idormy.sms.forwarder.adapter.menu.DrawerAdapter.OnItemSelectedListener {
    private final java.lang.String TAG = null;
    private final int POS_LOG = 0;
    private final int POS_RULE = 1;
    private final int POS_SENDER = 2;
    private final int POS_SETTING = 3;
    private final int POS_TASK = 5;
    private final int POS_SERVER = 6;
    private final int POS_CLIENT = 7;
    private final int POS_FRPC = 8;
    private final int POS_APPS = 9;
    private final int POS_HELP = 11;
    private final int POS_ABOUT = 12;
    private boolean needToAppListFragment = false;
    private com.google.android.material.tabs.TabLayout mTabLayout;
    private com.yarolegovich.slidingrootnav.SlidingRootNav mSlidingRootNav;
    private android.widget.LinearLayout mLLMenu;
    private java.lang.String[] mMenuTitles;
    private android.graphics.drawable.Drawable[] mMenuIcons;
    private com.idormy.sms.forwarder.adapter.menu.DrawerAdapter mAdapter;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.ActivityMainBinding viewBindingInflate(@org.jetbrains.annotations.Nullable
    android.view.LayoutInflater inflater) {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected boolean isSupportSlideBack() {
        return false;
    }
    
    private final void initViews() {
    }
    
    private final void initTab() {
    }
    
    private final void initData() {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onBackPressed() {
    }
    
    public final void openMenu() {
    }
    
    public final void closeMenu() {
    }
    
    public final boolean isMenuOpen() {
        return false;
    }
    
    private final void initSlidingMenu(android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onItemSelected(int position) {
    }
    
    private final com.idormy.sms.forwarder.adapter.menu.DrawerItem<?> createItemFor(int position) {
        return null;
    }
    
    private final void downloadFrpcLib() {
    }
}