// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gqm
{

    public static final String a = hhl.getName();
    public static final String b = grf.getName();
    public static final String c = gqp.getName();
    public static final String d = hhy.getName();
    public static final String e = hig.getName();
    private static gql f;

    public static void a(Context context, hgx hgx1)
    {
        if (f == null)
        {
            f = new gql();
        }
        hgx1.a(grf, new grf(context));
    }

    public static void a(hgx hgx1)
    {
        if (f == null)
        {
            f = new gql();
        }
        hgx1.a(hhl, new hhl[] {
            new gqs()
        });
    }

    public static void b(Context context, hgx hgx1)
    {
        if (f == null)
        {
            f = new gql();
        }
        hgx1.a(gqp, new gqz(context));
    }

    public static void b(hgx hgx1)
    {
        if (f == null)
        {
            f = new gql();
        }
        hgx1.a(hhy, new hhy[] {
            new gqs()
        });
    }

    public static void c(Context context, hgx hgx1)
    {
        if (f == null)
        {
            f = new gql();
        }
        context = hig.a;
        hgx1.a(hig, new hig[0]);
    }

}
