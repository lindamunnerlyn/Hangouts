// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class cqb extends cqv
{

    private boolean a;

    public cqb(boolean flag)
    {
        a = flag;
    }

    public cqw a()
    {
        return cqa.a(a);
    }

    public boolean a(Context context)
    {
        ani ani = dbf.e(((gmo)hgx.a(context, gmo)).a());
        context = (cpt)hgx.b(context, cpt);
        return context != null && context.b(ani);
    }

    public int b()
    {
        return crb.e;
    }

    public int c()
    {
        return h.ja;
    }
}
