// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gvk
{

    public static final String a = gvb.getName();
    public static final String b = gsz.getName();
    public static final String c = gus.getName();
    public static final String d = hig.getName();
    private static gvj e;

    public static void a(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new gvj();
        }
        hgx1.a(gvb, gvj.a(context));
    }

    public static void a(hgx hgx1)
    {
        if (e == null)
        {
            e = new gvj();
        }
        hgx1.a(gsz, new gsz[] {
            new gva()
        });
    }

    public static void b(hgx hgx1)
    {
        if (e == null)
        {
            e = new gvj();
        }
        hgx1.a(gus, new gus[] {
            new guq()
        });
    }

    public static void c(hgx hgx1)
    {
        if (e == null)
        {
            e = new gvj();
        }
        hij hij = hig.a;
        hgx1.a(hig, new hig[0]);
    }

}
