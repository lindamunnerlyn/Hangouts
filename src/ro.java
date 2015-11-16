// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Window;

final class ro
    implements tq
{

    final rc a;

    ro(rc rc1)
    {
        a = rc1;
        super();
    }

    public void a(ta ta1, boolean flag)
    {
label0:
        {
            ta ta2 = ta1.r();
            rc rc1;
            boolean flag1;
            if (ta2 != ta1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            rc1 = a;
            if (flag1)
            {
                ta1 = ta2;
            }
            ta1 = rc1.a(ta1);
            if (ta1 != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                a.a(((rn) (ta1)).a, ta1, ta2);
                a.a(ta1, true);
            }
            return;
        }
        a.a(ta1, flag);
    }

    public boolean a(ta ta1)
    {
        if (ta1 == null && a.h)
        {
            android.view.Window.Callback callback = ((qu) (a)).b.getCallback();
            if (callback != null && !((qu) (a)).n)
            {
                callback.onMenuOpened(108, ta1);
            }
        }
        return true;
    }
}
