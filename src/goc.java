// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class goc
{

    private static final hij a = new hij(".login.accountsource");

    public goc()
    {
    }

    public static gms a(Context context)
    {
        return new gnj(context);
    }

    static gnh a(gms gms)
    {
        return new gnh(gms);
    }

    public static gnc[] a(Context context, fxq fxq)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            return (new gnc[] {
                new goi(fxq)
            });
        } else
        {
            return (new gnc[] {
                new goj(context)
            });
        }
    }

    public static hig[] a()
    {
        hij hij1 = hig.a;
        return new hig[0];
    }

    public static gnd b(Context context)
    {
        return new goe(context);
    }

    public static gta[] b()
    {
        hij hij1 = gta.a;
        return new gta[0];
    }

}
