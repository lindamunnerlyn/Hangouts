// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class crf
{

    private final beb a = (new bec()).a("promoframework").b("Module that hosts the promo/OOB framework.").a(true).a();
    private crj b;

    public crf()
    {
    }

    public crd a(Context context)
    {
        return (crd)a.a(context, new crh());
    }

    public beb[] a()
    {
        return (new beb[] {
            a
        });
    }

    public crj b()
    {
        if (b == null)
        {
            b = new crj();
        }
        return b;
    }
}
