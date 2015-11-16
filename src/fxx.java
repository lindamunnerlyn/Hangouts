// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fxx
{

    public static final String a = fxo.getName();
    public static final String b = fxq.getName();
    private static fxw c;

    public static void a(Context context, hgx hgx1)
    {
        if (c == null)
        {
            c = new fxw();
        }
        hgx1.a(fxq, new fxv(context));
    }

    public static void a(hgx hgx1)
    {
        if (c == null)
        {
            c = new fxw();
        }
        hgx1.a(fxo, new fxu());
    }

}
