// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bem extends ctf
{

    public bem()
    {
    }

    public ctg a()
    {
        return new bel();
    }

    public boolean a(Context context)
    {
        aoa aoa = dcn.e(((gqu)hlp.a(context, gqu)).a());
        if (aoa == null)
        {
            return false;
        }
        if (g.c(aoa))
        {
            aoc.b(context, aoa);
            return false;
        }
        return !aoc.c(context, aoa);
    }

    public int b()
    {
        return ctl.g;
    }

    public int c()
    {
        return h.hm;
    }
}
