// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class wb
    implements to
{

    final vu a;

    wb(vu vu1)
    {
        a = vu1;
        super();
    }

    public void a(sy sy1, boolean flag)
    {
        if (sy1 instanceof ts)
        {
            ((ts)sy1).r().a(false);
        }
        to to1 = a.a();
        if (to1 != null)
        {
            to1.a(sy1, flag);
        }
    }

    public boolean a(sy sy1)
    {
        if (sy1 == null)
        {
            return false;
        }
        a.l = ((ts)sy1).getItem().getItemId();
        to to1 = a.a();
        if (to1 != null)
        {
            return to1.a(sy1);
        } else
        {
            return false;
        }
    }
}
