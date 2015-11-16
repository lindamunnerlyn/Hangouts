// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public abstract class aux extends auy
{

    public boolean a;
    private final dvi d;

    public aux(View view, Object obj, dvi dvi1)
    {
        super(view, h.fH, obj);
        d = dvi1;
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

    public abstract dvg b();

    protected void c()
    {
    }

    protected void d()
    {
    }

    public dvh e()
    {
        return new dvh(b.getContext());
    }
}
