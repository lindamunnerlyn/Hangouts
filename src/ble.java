// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public final class ble extends auh
{

    public ble(View view, blg blg1)
    {
        super(view, h.em, blg1);
    }

    protected boolean a()
    {
        return ((blg)c).B() && ((blg)c).v();
    }

    protected void c()
    {
        b.setOnClickListener(new blf(this));
    }

    protected void d()
    {
        ((blg)c).b(((blg)c).s());
    }
}
