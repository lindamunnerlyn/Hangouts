// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public final class bln extends auy
{

    public bln(View view, blp blp1)
    {
        super(view, h.dU, blp1);
    }

    protected boolean a()
    {
        return ((blp)c).C() && ((blp)c).w();
    }

    protected void c()
    {
        b.setOnClickListener(new blo(this));
    }

    protected void d()
    {
        ((blp)c).b(((blp)c).s());
    }
}
