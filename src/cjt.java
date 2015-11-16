// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class cjt
{

    public static final String a = hmd.getName();
    public static final String b = cjf.getName();
    public static final String c = hmq.getName();
    private static cjs d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new cjs();
        }
        hlp1.a(cjf, new cjj(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new cjs();
        }
        hlp1.a(hmd, new hmd[] {
            new cjp()
        });
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new cjs();
        }
        hlp1.a(hmq, new hmq[] {
            new cjp()
        });
    }

}
