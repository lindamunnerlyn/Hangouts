// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bcj
{

    public static final String a = ber.getName();
    public static final String b = bcf.getName();
    private static bch c;

    public static void a(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new bch();
        }
        hlp1.a(bcf, c.a(context));
    }

    public static void a(hlp hlp1)
    {
        if (c == null)
        {
            c = new bch();
        }
        hlp1.a(ber, c.a());
    }

}
