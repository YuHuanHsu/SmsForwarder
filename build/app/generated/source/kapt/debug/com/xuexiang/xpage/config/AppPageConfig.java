package com.xuexiang.xpage.config;

import com.xuexiang.xpage.enums.CoreAnim;
import com.xuexiang.xpage.model.PageInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>这是PageConfigProcessor自动生成的类，用以自动进行页面的注册。</p>
 * <p><a href="mailto:xuexiangjys@163.com">Contact me.</a></p>
 *
 * @author xuexiang 
 * @date 2025-09-04 17:21:18
 */
public class AppPageConfig {
  private static AppPageConfig sInstance;

  private List<PageInfo> mPages;

  private AppPageConfig() {
    mPages = new ArrayList<>();
    mPages.add(new PageInfo("XPageWebViewFragment", "com.idormy.sms.forwarder.core.webview.XPageWebViewFragment", "{\"com.xuexiang.xuidemo.base.webview.key_url\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("发送通道", "com.idormy.sms.forwarder.fragment.SendersFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Frp内网穿透·编辑配置", "com.idormy.sms.forwarder.fragment.FrpcEditFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Markdown", "com.idormy.sms.forwarder.fragment.MarkdownFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("应用列表", "com.idormy.sms.forwarder.fragment.AppListFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("转发日志", "com.idormy.sms.forwarder.fragment.LogsFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("主动控制·客户端", "com.idormy.sms.forwarder.fragment.ClientFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("主动控制·服务端", "com.idormy.sms.forwarder.fragment.ServerFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("自动任务", "com.idormy.sms.forwarder.fragment.TasksFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Frp内网穿透", "com.idormy.sms.forwarder.fragment.FrpcFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("转发规则", "com.idormy.sms.forwarder.fragment.RulesFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("通用设置", "com.idormy.sms.forwarder.fragment.SettingsFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Gotify", "com.idormy.sms.forwarder.fragment.senders.GotifyFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("企业微信群机器人", "com.idormy.sms.forwarder.fragment.senders.WeworkRobotFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Server酱·Turbo", "com.idormy.sms.forwarder.fragment.senders.ServerchanFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Webhook", "com.idormy.sms.forwarder.fragment.senders.WebhookFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Telegram机器人", "com.idormy.sms.forwarder.fragment.senders.TelegramFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("企业微信应用", "com.idormy.sms.forwarder.fragment.senders.WeworkAgentFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("钉钉群机器人", "com.idormy.sms.forwarder.fragment.senders.DingtalkGroupRobotFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Socket", "com.idormy.sms.forwarder.fragment.senders.SocketFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Bark", "com.idormy.sms.forwarder.fragment.senders.BarkFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("短信", "com.idormy.sms.forwarder.fragment.senders.SmsFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("钉钉企业机器人", "com.idormy.sms.forwarder.fragment.senders.DingtalkInnerRobotFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Email", "com.idormy.sms.forwarder.fragment.senders.EmailFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("PushPlus", "com.idormy.sms.forwarder.fragment.senders.PushplusFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("飞书群机器人", "com.idormy.sms.forwarder.fragment.senders.FeishuFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("URL Scheme", "com.idormy.sms.forwarder.fragment.senders.UrlSchemeFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("飞书企业应用", "com.idormy.sms.forwarder.fragment.senders.FeishuAppFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Cleaner", "com.idormy.sms.forwarder.fragment.action.CleanerFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Rule", "com.idormy.sms.forwarder.fragment.action.RuleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Frpc", "com.idormy.sms.forwarder.fragment.action.FrpcFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Settings", "com.idormy.sms.forwarder.fragment.action.SettingsFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("HttpServer", "com.idormy.sms.forwarder.fragment.action.HttpServerFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Alarm", "com.idormy.sms.forwarder.fragment.action.AlarmFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Notification", "com.idormy.sms.forwarder.fragment.action.NotificationFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Resend", "com.idormy.sms.forwarder.fragment.action.ResendFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Sender", "com.idormy.sms.forwarder.fragment.action.SenderFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SendSms", "com.idormy.sms.forwarder.fragment.action.SendSmsFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Task", "com.idormy.sms.forwarder.fragment.action.TaskActionFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ServiceProtocolFragment", "com.idormy.sms.forwarder.fragment.ServiceProtocolFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Charge", "com.idormy.sms.forwarder.fragment.condition.ChargeFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Msg", "com.idormy.sms.forwarder.fragment.condition.MsgFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Sim", "com.idormy.sms.forwarder.fragment.condition.SimFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("LockScreen", "com.idormy.sms.forwarder.fragment.condition.LockScreenFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Bluetooth", "com.idormy.sms.forwarder.fragment.condition.BluetoothFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Battery", "com.idormy.sms.forwarder.fragment.condition.BatteryFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ToAddress", "com.idormy.sms.forwarder.fragment.condition.ToAddressFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Cron", "com.idormy.sms.forwarder.fragment.condition.CronFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Network", "com.idormy.sms.forwarder.fragment.condition.NetworkFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("LeaveAddress", "com.idormy.sms.forwarder.fragment.condition.LeaveAddressFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("转发规则·编辑器", "com.idormy.sms.forwarder.fragment.RulesEditFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("自动任务·编辑器", "com.idormy.sms.forwarder.fragment.TasksEditFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("关于软件", "com.idormy.sms.forwarder.fragment.AboutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Logcat", "com.idormy.sms.forwarder.fragment.LogcatFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("远程查话簿", "com.idormy.sms.forwarder.fragment.client.ContactQueryFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("远程加话簿", "com.idormy.sms.forwarder.fragment.client.ContactAddFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("远程查通话", "com.idormy.sms.forwarder.fragment.client.CallQueryFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("远程发短信", "com.idormy.sms.forwarder.fragment.client.SmsSendFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("远程找手机", "com.idormy.sms.forwarder.fragment.client.LocationFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("远程查短信", "com.idormy.sms.forwarder.fragment.client.SmsQueryFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("远程查电量", "com.idormy.sms.forwarder.fragment.client.BatteryQueryFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("远程WOL", "com.idormy.sms.forwarder.fragment.client.WolSendFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("一键换新机", "com.idormy.sms.forwarder.fragment.client.CloneFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
  }

  public static AppPageConfig getInstance() {
    if (sInstance == null) {
        synchronized (AppPageConfig.class) {
            if (sInstance == null) {
                sInstance = new AppPageConfig();
            }
        }
    }
    return sInstance;
  }

  public List<PageInfo> getPages() {
    return mPages;
  }
}
