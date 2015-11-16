// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class tv
    implements me
{

    int a;
    final tu b;
    private boolean c;

    protected tv(tu tu1)
    {
        b = tu1;
        super();
        c = false;
    }

    public tv a(lr lr, int i)
    {
        b.f = lr;
        a = i;
        return this;
    }

    public void a(View view)
    {
        tu.a(b);
        c = false;
    }

    public void b(View view)
    {
        if (c)
        {
            return;
        } else
        {
            b.f = null;
            tu.a(b, a);
            return;
        }
    }

    public void c(View view)
    {
        c = true;
    }
}
