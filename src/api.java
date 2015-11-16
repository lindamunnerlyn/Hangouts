// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class api
{

    public static final String a = apj.getName();
    private static apg b;

    public static void a(Context context, hgx hgx1)
    {
        if (b == null)
        {
            b = new apg();
        }
        hgx1.a(apj, b.a(context));
    }

}
