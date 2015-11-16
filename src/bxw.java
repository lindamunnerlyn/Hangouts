// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bxw extends csw
    implements eeo
{

    final bxv a;

    public bxw(bxv bxv1, Context context, hof hof, int i)
    {
        a = bxv1;
        super(context, hof, i, cvc.f.j);
    }

    public void a(cuz cuz1)
    {
        bxv.a(a, cuz1.d());
    }

    protected void a(boolean flag)
    {
        if (flag)
        {
            bxv.a().a(this);
            return;
        } else
        {
            bxv.a().b(this);
            return;
        }
    }

    protected void c()
    {
        bxv.a(a, 0L);
    }

    public void d()
    {
        bxv.a(a);
    }
}
