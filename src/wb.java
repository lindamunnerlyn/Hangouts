// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class wb extends yg
{

    final vw a;
    final wa b;

    wb(wa wa1, View view, vw vw1)
    {
        b = wa1;
        a = vw1;
        super(view);
    }

    public yc a()
    {
        if (b.a.h == null)
        {
            return null;
        } else
        {
            return b.a.h.d();
        }
    }

    public boolean b()
    {
        b.a.e();
        return true;
    }

    public boolean c()
    {
        if (b.a.j != null)
        {
            return false;
        } else
        {
            b.a.f();
            return true;
        }
    }
}
