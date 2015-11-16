// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ddb
{

    public static final String a = ang.getName();
    public static final String b = bwl.getName();
    public static final String c = deu.getName();
    public static final String d = dcz.getName();
    private static dda e;

    public static void a(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new dda();
        }
        hlp1.a(ang, new ang[] {
            (ang)hlp.a(context, dcz)
        });
    }

    public static void b(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new dda();
        }
        hlp1.a(bwl, new bwl[] {
            (bwl)hlp.a(context, dcz)
        });
    }

    public static void c(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new dda();
        }
        hlp1.a(deu, new deu[] {
            (deu)hlp.a(context, dcz)
        });
    }

    public static void d(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new dda();
        }
        hlp1.a(dcz, new dcz(context));
    }

}
