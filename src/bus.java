// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bus
{

    private final ber a = (new bes()).a("knocking").b("Module that enables responding to knocks").a(true).a();

    public bus()
    {
    }

    public buh a(Context context)
    {
        if (a.a(context))
        {
            return new bvd();
        } else
        {
            return null;
        }
    }

    public ber[] a()
    {
        return (new ber[] {
            a
        });
    }

    public buf b(Context context)
    {
        if (a.a(context))
        {
            return new bum(context);
        } else
        {
            return null;
        }
    }

    public bsq[] c(Context context)
    {
        return (bsq[])a.a(context, bsq, new bsq[] {
            new but(this), new buu(this)
        });
    }
}
