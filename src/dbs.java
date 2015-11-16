// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dbs
{

    public static final String a = amo.getName();
    public static final String b = bvs.getName();
    public static final String c = ddm.getName();
    public static final String d = dbq.getName();
    private static dbr e;

    public static void a(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new dbr();
        }
        hgx1.a(amo, new amo[] {
            (amo)hgx.a(context, dbq)
        });
    }

    public static void b(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new dbr();
        }
        hgx1.a(bvs, new bvs[] {
            (bvs)hgx.a(context, dbq)
        });
    }

    public static void c(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new dbr();
        }
        hgx1.a(ddm, new ddm[] {
            (ddm)hgx.a(context, dbq)
        });
    }

    public static void d(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new dbr();
        }
        hgx1.a(dbq, new dbq(context));
    }

}
