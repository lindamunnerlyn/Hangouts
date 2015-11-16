// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class ls
    implements ma
{

    WeakHashMap a;

    ls()
    {
        a = null;
    }

    private void d(lr lr1, View view)
    {
        Runnable runnable = null;
        if (a != null)
        {
            runnable = (Runnable)a.get(view);
        }
        Object obj = runnable;
        if (runnable == null)
        {
            obj = new lt(this, lr1, view);
            if (a == null)
            {
                a = new WeakHashMap();
            }
            a.put(view, obj);
        }
        view.removeCallbacks(((Runnable) (obj)));
        view.post(((Runnable) (obj)));
    }

    public long a(View view)
    {
        return 0L;
    }

    public void a(View view, long l)
    {
    }

    public void a(View view, Interpolator interpolator)
    {
    }

    public void a(View view, mg mg)
    {
    }

    public void a(lr lr1, View view)
    {
        d(lr1, view);
    }

    public void a(lr lr1, View view, float f)
    {
        d(lr1, view);
    }

    public void a(lr lr1, View view, me me1)
    {
        view.setTag(0x7e000000, me1);
    }

    public void b(View view, long l)
    {
    }

    public void b(lr lr1, View view)
    {
        if (a != null)
        {
            Runnable runnable = (Runnable)a.get(view);
            if (runnable != null)
            {
                view.removeCallbacks(runnable);
            }
        }
        c(lr1, view);
    }

    public void b(lr lr1, View view, float f)
    {
        d(lr1, view);
    }

    void c(lr lr1, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof me)
        {
            obj = (me)obj;
        } else
        {
            obj = null;
        }
        runnable = lr.a(lr1);
        lr1 = lr.b(lr1);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((me) (obj)).a(view);
            ((me) (obj)).b(view);
        }
        if (lr1 != null)
        {
            lr1.run();
        }
        if (a != null)
        {
            a.remove(view);
        }
    }

    public void c(lr lr1, View view, float f)
    {
        d(lr1, view);
    }
}
