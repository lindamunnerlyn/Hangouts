// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ale
{

    public static final String a = alj.getName();
    public static final String b = hcb.getName();
    public static final String c = deu.getName();
    public static final String d = alf.getName();
    public static final String e = gre.getName();
    private static ald f;

    public static void a(Context context, hlp hlp1)
    {
        if (f == null)
        {
            f = new ald();
        }
        hlp1.a(alj, new alj(context, hlp1));
    }

    public static void a(hlp hlp1)
    {
        if (f == null)
        {
            f = new ald();
        }
        hlp1.a(hcb, new hcb[] {
            (hcb)hlp1.b(alj)
        });
    }

    public static void b(Context context, hlp hlp1)
    {
        if (f == null)
        {
            f = new ald();
        }
        hlp1.a(deu, new deu[] {
            (deu)hlp.b(context, alf)
        });
    }

    public static void c(Context context, hlp hlp1)
    {
        if (f == null)
        {
            f = new ald();
        }
        hlp1.a(alf, new alf(context));
    }

    public static void d(Context context, hlp hlp1)
    {
        if (f == null)
        {
            f = new ald();
        }
        hlp1.a(gre, new gre[] {
            (gre)hlp.b(context, alf)
        });
    }

}
