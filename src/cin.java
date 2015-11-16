// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class cin
{

    public static final String a = hhl.getName();
    public static final String b = chz.getName();
    public static final String c = hhy.getName();
    private static cim d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new cim();
        }
        hgx1.a(chz, new cid(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new cim();
        }
        hgx1.a(hhl, new hhl[] {
            new cij()
        });
    }

    public static void b(hgx hgx1)
    {
        if (d == null)
        {
            d = new cim();
        }
        hgx1.a(hhy, new hhy[] {
            new cij()
        });
    }

}
