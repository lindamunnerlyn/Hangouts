// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.view.menu.ActionMenuItemView;

public final class st extends yg
{

    final ActionMenuItemView a;

    public st(ActionMenuItemView actionmenuitemview)
    {
        a = actionmenuitemview;
        super(actionmenuitemview);
    }

    public yc a()
    {
        if (a.c != null)
        {
            return a.c.a();
        } else
        {
            return null;
        }
    }

    protected boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a.b != null)
        {
            flag = flag1;
            if (a.b.a(a.a))
            {
                yc yc1 = a();
                flag = flag1;
                if (yc1 != null)
                {
                    flag = flag1;
                    if (yc1.n())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
