// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bdw extends cqv
{

    public bdw()
    {
    }

    public cqw a()
    {
        return new bdv();
    }

    public boolean a(Context context)
    {
        ani ani = dbf.e(((gmo)hgx.a(context, gmo)).a());
        if (ani == null)
        {
            return false;
        }
        if (g.d(ani))
        {
            ank.b(context, ani);
            return false;
        }
        return !ank.c(context, ani);
    }

    public int b()
    {
        return crb.g;
    }

    public int c()
    {
        return h.hG;
    }
}
