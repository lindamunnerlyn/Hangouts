// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class vz extends ye
{

    final vu a;
    final vy b;

    vz(vy vy1, View view, vu vu1)
    {
        b = vy1;
        a = vu1;
        super(view);
    }

    public ya a()
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
