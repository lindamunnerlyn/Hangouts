// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public abstract class aug extends auh
{

    public boolean a;
    private final dsp d;

    public aug(View view, Object obj, dsp dsp1)
    {
        super(view, h.fZ, obj);
        d = dsp1;
    }

    public void a(boolean flag)
    {
        if (flag && !a)
        {
            d();
            a = true;
            d.a(b());
        } else
        if (!flag && a)
        {
            d.b(b());
            a = false;
            return;
        }
    }

    public abstract dsn b();

    protected void c()
    {
    }

    protected void d()
    {
    }

    public dso e()
    {
        return new dso(b.getContext());
    }
}
