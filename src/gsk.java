// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gsk
{

    private static final hnb a = new hnb(".login.accountsource");

    public gsk()
    {
    }

    public static gqz a(Context context)
    {
        return new grq(context);
    }

    static gro a(gqz gqz)
    {
        return new gro(gqz);
    }

    public static grj[] a(Context context, fzu fzu)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            return (new grj[] {
                new gsq(fzu)
            });
        } else
        {
            return (new grj[] {
                new gsr(context)
            });
        }
    }

    public static hmy[] a()
    {
        hnb hnb1 = hmy.a;
        return new hmy[0];
    }

    public static grk b(Context context)
    {
        return new gsm(context);
    }

    public static gxm[] b()
    {
        hnb hnb1 = gxm.a;
        return new gxm[0];
    }

}
