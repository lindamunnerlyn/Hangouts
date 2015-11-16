// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.TextView;

final class byd extends csw
    implements eeo
{

    final byc a;

    public byd(byc byc1, Context context, hof hof, int i)
    {
        a = byc1;
        super(context, hof, i, byc.a());
    }

    public void a(cuz cuz1)
    {
        byc.a(a, cuz1.d());
    }

    protected void a(boolean flag)
    {
        if (flag)
        {
            byc.b().a(this);
            return;
        } else
        {
            byc.b().b(this);
            return;
        }
    }

    protected void c()
    {
        byc.a(a, 0L);
        if (byc.a(a) != null)
        {
            TextView textview = byc.a(a);
            byte byte0;
            if (byc.b(a).e() == null)
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
        byc.c(a);
    }
}
