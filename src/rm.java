// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Window;

final class rm
    implements to
{

    final ra a;

    rm(ra ra1)
    {
        a = ra1;
        super();
    }

    public void a(sy sy1, boolean flag)
    {
label0:
        {
            sy sy2 = sy1.r();
            ra ra1;
            boolean flag1;
            if (sy2 != sy1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ra1 = a;
            if (flag1)
            {
                sy1 = sy2;
            }
            sy1 = ra1.a(sy1);
            if (sy1 != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                a.a(((rl) (sy1)).a, sy1, sy2);
                a.a(sy1, true);
            }
            return;
        }
        a.a(sy1, flag);
    }

    public boolean a(sy sy1)
    {
        if (sy1 == null && a.h)
        {
            android.view.Window.Callback callback = ((qs) (a)).b.getCallback();
            if (callback != null && !((qs) (a)).n)
            {
                callback.onMenuOpened(108, sy1);
            }
        }
        return true;
    }
}
