// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;

final class bxh extends ebd
    implements ebq
{

    final bxg a;

    public bxh(bxg bxg1, hjm hjm, int i)
    {
        a = bxg1;
        super(hjm, i, bxg.a());
    }

    public void a(csw csw1)
    {
        bxg.a(a, csw1.d());
    }

    protected void a(boolean flag)
    {
        if (flag)
        {
            bxg.b().a(this);
            return;
        } else
        {
            bxg.b().b(this);
            return;
        }
    }

    protected void c()
    {
        bxg.a(a, 0L);
        if (bxg.a(a) != null)
        {
            TextView textview = bxg.a(a);
            byte byte0;
            if (bxg.b(a).e() == null)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            textview.setVisibility(byte0);
        }
    }

    public void d()
    {
        bxg.c(a);
    }
}
