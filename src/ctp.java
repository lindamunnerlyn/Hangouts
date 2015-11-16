// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ctp
{

    private final ber a = (new bes()).a("promoframework").b("Module that hosts the promo/OOB framework.").a(true).a();
    private ctt b;

    public ctp()
    {
    }

    public ctn a(Context context)
    {
        return (ctn)a.a(context, new ctr());
    }

    public ber[] a()
    {
        return (new ber[] {
            a
        });
    }

    public ctt b()
    {
        if (b == null)
        {
            b = new ctt();
        }
        return b;
    }
}
