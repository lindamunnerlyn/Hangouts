// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dcc
{

    public static final String a = gap.getName();
    private static dcb b;

    public static void a(Context context, hgx hgx1)
    {
        if (b == null)
        {
            b = new dcb();
        }
        hgx1.a(gap, new dbm(context));
    }

}
