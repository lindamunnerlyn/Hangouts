// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dqf
{

    public static final String a = beb.getName();
    public static final String b = dqd.getName();
    private static dqe c;

    public static void a(Context context, hgx hgx1)
    {
        if (c == null)
        {
            c = new dqe();
        }
        hgx1.a(dqd, c.a(context));
    }

    public static void a(hgx hgx1)
    {
        if (c == null)
        {
            c = new dqe();
        }
        hgx1.a(beb, c.a());
    }

}
