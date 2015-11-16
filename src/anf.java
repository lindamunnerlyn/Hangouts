// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class anf
{

    public static final String a = ang.getName();
    public static final String b = hcb.getName();
    public static final String c = aoc.getName();
    public static final String d = gre.getName();
    private static ane e;

    public static void a(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new ane();
        }
        hlp1.a(aoc, new aoc(context));
    }

    public static void a(hlp hlp1)
    {
        if (e == null)
        {
            e = new ane();
        }
        hlp1.a(ang, new ang[] {
            new ard()
        });
    }

    public static void b(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new ane();
        }
        hlp1.a(gre, new gre[] {
            (gre)hlp.a(context, aoc)
        });
    }

    public static void b(hlp hlp1)
    {
        if (e == null)
        {
            e = new ane();
        }
        hlp1.a(hcb, new hcb[] {
            (hcb)hlp1.a(aoc)
        });
    }

}
