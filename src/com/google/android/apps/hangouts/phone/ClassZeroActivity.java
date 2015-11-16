// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.view.Window;
import ani;
import ckf;
import ckg;
import ckh;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dbf;
import ebw;
import gbh;
import gmo;
import gng;
import hhg;
import java.util.ArrayList;
import l;

public class ClassZeroActivity extends hhg
{

    private static final boolean c = false;
    private final gmo d;
    private SmsMessage e;
    private boolean f;
    private long g;
    private AlertDialog h;
    private ArrayList i;
    private ani j;
    private Handler k;
    private final android.content.DialogInterface.OnClickListener l = new ckf(this);
    private final android.content.DialogInterface.OnClickListener m = new ckg(this);

    public ClassZeroActivity()
    {
        d = (new gng(this, b)).a(a);
        e = null;
        f = false;
        g = 0L;
        h = null;
        i = null;
        k = new ckh(this);
    }

    public static AlertDialog a(ClassZeroActivity classzeroactivity)
    {
        return classzeroactivity.h;
    }

    private void a(SmsMessage smsmessage)
    {
        String s = smsmessage.getMessageBody();
        e = smsmessage;
        smsmessage = s.toString();
        h = (new android.app.AlertDialog.Builder(this, 2)).setMessage(smsmessage).setPositiveButton(l.jR, m).setNegativeButton(0x1040000, l).setCancelable(false).show();
        g = SystemClock.uptimeMillis() + 0x493e0L;
    }

    private boolean a(Intent intent)
    {
        byte abyte0[] = intent.getByteArrayExtra("pdu");
        intent.getStringExtra("format");
        intent = SmsMessage.createFromPdu(abyte0);
        if (TextUtils.isEmpty(intent.getMessageBody()))
        {
            if (i.size() == 0)
            {
                finish();
            }
            return false;
        } else
        {
            i.add(intent);
            return true;
        }
    }

    public static boolean a(ClassZeroActivity classzeroactivity, boolean flag)
    {
        classzeroactivity.f = flag;
        return flag;
    }

    public static void b(ClassZeroActivity classzeroactivity)
    {
        RealTimeChatService.a(classzeroactivity.j, classzeroactivity.e.getPdu(), classzeroactivity.f);
    }

    public static void c(ClassZeroActivity classzeroactivity)
    {
        if (classzeroactivity.i.size() > 0)
        {
            classzeroactivity.i.remove(0);
        }
        if (classzeroactivity.i.size() == 0)
        {
            classzeroactivity.finish();
            return;
        } else
        {
            classzeroactivity.a((SmsMessage)classzeroactivity.i.get(0));
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawableResource(com.google.android.apps.hangouts.R.drawable.d);
        j = dbf.e(d.a());
        if (i == null)
        {
            i = new ArrayList();
        }
        if (a(getIntent()))
        {
            boolean flag;
            if (i.size() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            if (i.size() == 1)
            {
                a((SmsMessage)i.get(0));
            }
            if (bundle != null)
            {
                g = bundle.getLong("timer_fire", g);
                return;
            }
        }
    }

    protected void onNewIntent(Intent intent)
    {
        a(intent);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putLong("timer_fire", g);
        if (c)
        {
            bundle = String.valueOf(Long.toString(g));
            String s = String.valueOf(toString());
            (new StringBuilder(String.valueOf(bundle).length() + 28 + String.valueOf(s).length())).append("onSaveInstanceState time = ").append(bundle).append(" ").append(s);
        }
    }

    protected void onStart()
    {
        super.onStart();
        long l1 = SystemClock.uptimeMillis();
        if (g <= l1)
        {
            k.sendEmptyMessage(1);
        } else
        {
            k.sendEmptyMessageAtTime(1, g);
            if (c)
            {
                String s = String.valueOf(Long.toString(g));
                String s1 = String.valueOf(toString());
                (new StringBuilder(String.valueOf(s).length() + 18 + String.valueOf(s1).length())).append("onRestart time = ").append(s).append(" ").append(s1);
                return;
            }
        }
    }

    protected void onStop()
    {
        super.onStop();
        k.removeMessages(1);
        if (c)
        {
            String s = String.valueOf(Long.toString(g));
            String s1 = String.valueOf(toString());
            (new StringBuilder(String.valueOf(s).length() + 15 + String.valueOf(s1).length())).append("onStop time = ").append(s).append(" ").append(s1);
        }
    }

    static 
    {
        hik hik = ebw.j;
    }
}
