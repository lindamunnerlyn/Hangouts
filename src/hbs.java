// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hbs
{

    public static final String a = hbn.getName();
    private static hbr b;

    public static void a(Context context, hgx hgx1)
    {
        if (b == null)
        {
            b = new hbr();
        }
        hgx1.a(hbn, new hbq(context));
    }

}
