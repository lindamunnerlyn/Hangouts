// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import java.util.ArrayList;
import java.util.List;

public final class dcs
{

    public dcs()
    {
    }

    public static void a(boolean flag)
    {
        dup dup1 = (dup)hlp.a(g.nU, dup);
        aoa aoa2 = dcn.C();
        dcn.a(Boolean.valueOf(flag));
        dup1.b(flag);
        if (flag)
        {
            aoa aoa1 = dcn.l();
            dur.c(aoa1);
            if (aoa1.o())
            {
                dcn.d(true);
            }
        } else
        {
            dur.a(aoa2);
            dcn.d(false);
        }
        SmsReceiver.a();
    }

    public static boolean a()
    {
        Context context;
        boolean flag2;
        flag2 = true;
        context = g.nU;
        if (dcn.B() == null)
        {
            dcn.a(Boolean.valueOf(((dup)hlp.a(context, dup)).f()));
        }
        if (eey.d()) goto _L2; else goto _L1
_L1:
        if (g.a(dcn.B(), false))
        {
            a(false);
            boolean flag;
            if (!g.a(dcn.B(), false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g.d(flag);
        }
_L4:
        return g.a(dcn.B(), false);
_L2:
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            cjf cjf1 = (cjf)hlp.a(context, cjf);
            ArrayList arraylist = new ArrayList();
            arraylist.add("android.permission.READ_SMS");
            arraylist.add("android.permission.RECEIVE_SMS");
            arraylist.add("android.permission.SEND_SMS");
            arraylist.add("android.permission.RECEIVE_MMS");
            boolean flag1;
            if (cjf1.a(arraylist))
            {
                String s = android.provider.Telephony.Sms.getDefaultSmsPackage(context);
                flag1 = context.getPackageName().equals(s);
            } else
            {
                flag1 = false;
            }
            if (g.a(dcn.B(), false) != flag1)
            {
                a(flag1);
                if (g.a(dcn.B(), false) == flag1)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                g.d(flag1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
