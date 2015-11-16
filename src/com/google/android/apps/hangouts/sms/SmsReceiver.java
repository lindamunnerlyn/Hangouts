// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.gsm.SmsMessage;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.NoConfirmationSmsSendService;
import dcn;
import eev;
import g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.hangouts.sms:
//            MmsWapPushReceiver, AbortSmsReceiver, AbortMmsWapPushReceiver

public final class SmsReceiver extends BroadcastReceiver
{

    private static Pattern a[];

    public SmsReceiver()
    {
    }

    public static void a()
    {
        boolean flag = false;
        boolean flag1 = false;
        Context context;
        PackageManager packagemanager;
        boolean flag2;
        boolean flag3;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag3 = dcn.i();
            flag2 = false;
            flag = true;
        } else
        {
label0:
            {
                if (!dcn.i())
                {
                    flag1 = flag;
                    if (!dcn.j())
                    {
                        break label0;
                    }
                }
                flag1 = true;
            }
            flag = dcn.j();
            flag2 = flag;
            flag3 = flag1;
            flag1 = flag;
        }
        context = g.nU;
        packagemanager = context.getPackageManager();
        if (flag3)
        {
            eev.a("Babel_SMS", "Enabling SMS message receiving");
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/sms/SmsReceiver), 1, 1);
        } else
        {
            eev.a("Babel_SMS", "Disabling SMS message receiving");
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/sms/SmsReceiver), 2, 1);
        }
        if (flag2)
        {
            eev.a("Babel_SMS", "Enabling MMS message receiving");
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/sms/MmsWapPushReceiver), 1, 1);
        } else
        {
            eev.a("Babel_SMS", "Disabling MMS message receiving");
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/sms/MmsWapPushReceiver), 2, 1);
            eev.a("Babel_SMS", "Disabling MMS message receiving");
        }
        if (flag1)
        {
            eev.a("Babel_SMS", "Enabling SMS/MMS broadcast abort");
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/sms/AbortSmsReceiver), 1, 1);
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/sms/AbortMmsWapPushReceiver), 1, 1);
        } else
        {
            eev.a("Babel_SMS", "Disabling SMS/MMS broadcast abort");
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/sms/AbortSmsReceiver), 2, 1);
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/sms/AbortMmsWapPushReceiver), 2, 1);
        }
        if (flag)
        {
            eev.a("Babel_SMS", "Enabling respond via message intent");
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/service/NoConfirmationSmsSendService), 1, 1);
            return;
        } else
        {
            eev.a("Babel_SMS", "Disabling respond via message intent");
            packagemanager.setComponentEnabledSetting(new ComponentName(context, com/google/android/apps/hangouts/service/NoConfirmationSmsSendService), 2, 1);
            return;
        }
    }

    public static boolean a(Intent intent)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        intent = intent.getExtras();
        flag = flag1;
        if (intent == null) goto _L2; else goto _L1
_L1:
        intent = ((Intent) ((Object[])intent.get("pdus")));
        flag = flag1;
        if (intent.length <= 0) goto _L2; else goto _L3
_L3:
        intent = SmsMessage.createFromPdu((byte[])intent[0]);
        flag = flag1;
        if (intent == null) goto _L2; else goto _L4
_L4:
        String s;
        String as[];
        int i;
        try
        {
            intent = intent.getMessageBody();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            eev.e("Babel_SMS", "SmsReceiver: failed to get message body ", intent);
            intent = null;
        }
        flag = flag1;
        if (intent == null) goto _L2; else goto _L5
_L5:
        Pattern apattern[];
        int j;
        int k;
        if (a == null)
        {
            s = g.a(g.nU, "babel_sms_ignore_message_regex", "VZWNMN:\\d+\n//wma::\\d+\\s//.*\nActivate:dt=\\d+\n//ANDROID:.*//CM\n\\S+\\.attwireless\\.net:\\d+\\?.*\nvvm\\.mobile\\.att\\.net:\\d+\\?.*\n");
            if (s != null)
            {
                as = s.split("\n");
                if (as.length != 0)
                {
                    a = new Pattern[as.length];
                    for (i = 0; i < as.length; i++)
                    {
                        a[i] = Pattern.compile(as[i]);
                    }

                }
            }
        }
        apattern = a;
        k = apattern.length;
        j = 0;
_L10:
        flag = flag1;
        if (j >= k) goto _L2; else goto _L6
_L6:
        if (!apattern[j].matcher(intent).matches()) goto _L8; else goto _L7
_L7:
        flag = true;
_L2:
        return flag;
_L8:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onReceive(Context context, Intent intent)
    {
        if (android.os.Build.VERSION.SDK_INT < 19 && dcn.j() && !a(intent))
        {
            RealTimeChatService.c(intent);
        }
    }
}
