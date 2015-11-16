// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bcz
{

    public static final String a = gxq.getName();
    public static final String b = egm.getName();
    private static bcx c;

    public static void a(Context context, hgx hgx1)
    {
        if (c == null)
        {
            c = new bcx();
        }
        hgx1.a(gxq, new gxq[] {
            new bda(context)
        });
    }

    public static void a(hgx hgx1)
    {
        if (c == null)
        {
            c = new bcx();
        }
        hgx1.a(egm, c.a());
    }

}
