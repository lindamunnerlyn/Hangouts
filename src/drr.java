// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.SmsManager;

public final class drr
{

    public static final String a = bvs.getName();
    public static final String b = dqy.getName();
    public static final String c = drf.getName();
    public static final String d = drw.getName();
    private static drq e;

    public static void a(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new drq();
        }
        hgx1.a(bvs, new bvs[] {
            (bvs)hgx.a(context, drw)
        });
    }

    public static void a(hgx hgx1)
    {
        if (e == null)
        {
            e = new drq();
        }
        hgx1.a(dqy, new dqy(SmsManager.getDefault()));
    }

    public static void b(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new drq();
        }
        hgx1.a(drw, new drw(context));
    }

    public static void b(hgx hgx1)
    {
        if (e == null)
        {
            e = new drq();
        }
        hgx1.a(drf, new drf(SmsManager.getDefault()));
    }

}
