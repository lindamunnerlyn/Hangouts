// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.SmsManager;

public final class duk
{

    public static final String a = bwl.getName();
    public static final String b = dts.getName();
    public static final String c = dtz.getName();
    public static final String d = dup.getName();
    private static duj e;

    public static void a(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new duj();
        }
        hlp1.a(bwl, new bwl[] {
            (bwl)hlp.a(context, dup)
        });
    }

    public static void a(hlp hlp1)
    {
        if (e == null)
        {
            e = new duj();
        }
        hlp1.a(dts, new dts(SmsManager.getDefault()));
    }

    public static void b(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new duj();
        }
        hlp1.a(dup, new dup(context));
    }

    public static void b(hlp hlp1)
    {
        if (e == null)
        {
            e = new duj();
        }
        hlp1.a(dtz, new dtz(SmsManager.getDefault()));
    }

}
