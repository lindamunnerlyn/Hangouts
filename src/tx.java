// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class tx
    implements me
{

    int a;
    final tw b;
    private boolean c;

    protected tx(tw tw1)
    {
        b = tw1;
        super();
        c = false;
    }

    public tx a(lr lr, int i)
    {
        b.f = lr;
        a = i;
        return this;
    }

    public void a(View view)
    {
        tw.a(b);
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
            tw.a(b, a);
            return;
        }
    }

    public void c(View view)
    {
        c = true;
    }
}
