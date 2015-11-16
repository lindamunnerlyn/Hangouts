// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import ani;
import bka;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import dan;
import dbf;
import dcx;
import dkz;
import ebw;
import g;
import gnf;
import gxa;
import gxd;
import hgx;

public class PackageReplacedReceiver extends BroadcastReceiver
{

    private static final boolean a = false;

    public PackageReplacedReceiver()
    {
    }

    private static void a(Context context)
    {
        SmsReceiver.a();
        dcx.i();
        if (((dan)hgx.a(context, dan)).a(context))
        {
            context = dbf.d();
            int j = context.length;
            for (int i = 0; i < j; i++)
            {
                ani ani1 = dbf.e(context[i]);
                if (ani1 != null && !ani1.q() && ani1.X() == 0)
                {
                    RealTimeChatService.e(ani1.h());
                }
            }

        }
    }

    public static void a(String s, String s1)
    {
        Context context;
        boolean flag;
        boolean flag2;
        if (a)
        {
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 41 + String.valueOf(s1).length())).append("handlePackageChanged action:").append(s).append(" packageName:").append(s1).toString());
        }
        context = g.nS;
        flag = "com.google.android.gms".equals(s1);
        flag2 = context.getPackageName().equals(s1);
        if (!flag || !"android.intent.action.PACKAGE_CHANGED".equals(s)) goto _L2; else goto _L1
_L1:
        g.a(true, true, false);
_L4:
        return;
_L2:
        int i;
        if (flag)
        {
            ebw.f("Babel", "Gms package replaced. Will trigger a restart of babel");
            int j;
            int k;
            boolean flag1;
            if (g.f(context).getBoolean("gms_core_valid", false))
            {
                ebw.c("Babel", "Skip forced warm sync since previous gmscore is valid.");
                i = 1;
            } else
            {
                i = 0;
            }
            bka.b(true);
            ebw.a("Babel", "Clearing account states after gmscore upgraded");
            dbf.v();
        } else
        {
            i = 0;
        }
        if ("android.intent.action.BOOT_COMPLETED".equals(s))
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!g.a(flag1, true))
        {
            ebw.f("Babel", "GmsCore check failed during package upgrade");
            return;
        }
        if (a)
        {
            ebw.b("Babel", "[PackageReplaced] sign-in to accounts");
        }
        try
        {
            ((gxa)hgx.a(context, gxa)).a((new gxd()).c());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            ebw.d("Babel", "Account refresh failed", s1);
        }
        j = i;
        if (flag2)
        {
            if (s.equals("android.intent.action.PACKAGE_REMOVED"))
            {
                j = 1;
            } else
            {
                a(context);
                j = i;
            }
        }
        dkz.b();
        dkz.a();
        dbf.r();
        if (j == 0)
        {
            ebw.c("Babel", "Force warm sync for all signed in accounts after package upgrades");
            s = dbf.c(true);
            j = s.length;
            i = 0;
            while (i < j) 
            {
                k = s[i];
                if (dbf.e(k) != null)
                {
                    RealTimeChatService.a(k, false, false, 0, false);
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onReceive(Context context, Intent intent)
    {
        if (a)
        {
            String s = String.valueOf(intent);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 24)).append("PackageReplacedReceiver ").append(s).toString());
        }
        String s1 = intent.getData().getSchemeSpecificPart();
        boolean flag = "com.google.android.gms".equals(s1);
        for (boolean flag1 = context.getPackageName().equals(s1); !flag && !flag1 || !flag && "android.intent.action.PACKAGE_CHANGED".equals(intent.getAction());)
        {
            return;
        }

        RealTimeChatService.a(intent.getAction(), s1);
    }

    static 
    {
        hik hik = ebw.j;
    }
}
