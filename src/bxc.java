// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bxc
{

    private boolean a;
    private final beb b = (new bec()).a("lastseen").b("Module that hosts the last seen feature.").a(true).a();

    public bxc()
    {
        a = false;
        a = g.a(g.nS, "babel_enable_last_seen_r2", true);
    }

    public egv a(Context context)
    {
        if (a)
        {
            return (egv)b.a(context, new bxb());
        } else
        {
            return null;
        }
    }

    public beb[] a()
    {
        return (new beb[] {
            b
        });
    }

    public cqv[] b(Context context)
    {
        if (a)
        {
            return (cqv[])b.a(context, cqv, new bxf());
        } else
        {
            return null;
        }
    }
}
