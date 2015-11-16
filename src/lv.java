// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class lv
    implements me
{

    lr a;

    lv(lr lr1)
    {
        a = lr1;
    }

    public void a(View view)
    {
        if (lr.d(a) >= 0)
        {
            kb.d(view, 2);
        }
        if (lr.a(a) != null)
        {
            lr.a(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof me)
        {
            obj = (me)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((me) (obj)).a(view);
        }
    }

    public void b(View view)
    {
        if (lr.d(a) >= 0)
        {
            kb.d(view, lr.d(a));
            lr.c(a);
        }
        if (lr.b(a) != null)
        {
            lr.b(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof me)
        {
            obj = (me)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((me) (obj)).b(view);
        }
    }

    public void c(View view)
    {
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof me)
        {
            obj = (me)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((me) (obj)).c(view);
        }
    }
}
