// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import java.util.ArrayList;
import java.util.List;

public final class dbj
{

    public dbj()
    {
    }

    public static void a(boolean flag)
    {
        drw drw1 = (drw)hgx.a(g.nS, drw);
        ani ani2 = dbf.C();
        dbf.a(Boolean.valueOf(flag));
        drw1.b(flag);
        if (flag)
        {
            ani ani1 = dbf.l();
            dry.c(ani1);
            if (ani1.q())
            {
                dbf.d(true);
            }
        } else
        {
            dry.a(ani2);
            dbf.d(false);
        }
        SmsReceiver.a();
    }

    public static boolean a()
    {
        Context context;
        boolean flag2;
        flag2 = true;
        context = g.nS;
        if (dbf.B() == null)
        {
            dbf.a(Boolean.valueOf(((drw)hgx.a(context, drw)).e()));
        }
        if (ebz.d()) goto _L2; else goto _L1
_L1:
        if (g.a(dbf.B(), false))
        {
            a(false);
            boolean flag;
            if (!g.a(dbf.B(), false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g.b(flag);
        }
_L4:
        return g.a(dbf.B(), false);
_L2:
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            chz chz1 = (chz)hgx.a(context, chz);
            ArrayList arraylist = new ArrayList();
            arraylist.add("android.permission.READ_SMS");
            arraylist.add("android.permission.RECEIVE_SMS");
            arraylist.add("android.permission.SEND_SMS");
            arraylist.add("android.permission.RECEIVE_MMS");
            boolean flag1;
            if (chz1.a(arraylist))
            {
                String s = android.provider.Telephony.Sms.getDefaultSmsPackage(context);
                flag1 = context.getPackageName().equals(s);
            } else
            {
                flag1 = false;
            }
            if (g.a(dbf.B(), false) != flag1)
            {
                a(flag1);
                if (g.a(dbf.B(), false) == flag1)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                g.b(flag1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
