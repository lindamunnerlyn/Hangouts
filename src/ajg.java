// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ajg
{

    private boolean a;
    private final beb b = (new bec()).a("businessfeatures").b("Module that hosts the business features promo.").a(true).a();

    public ajg()
    {
        a = false;
        a = g.a(g.nS, "babel_enable_call_me_maybe", true);
    }

    public beb[] a()
    {
        return (new beb[] {
            b
        });
    }

    public cqv[] a(Context context)
    {
        if (a)
        {
            return (cqv[])b.a(context, cqv, new ajj());
        } else
        {
            return null;
        }
    }
}
