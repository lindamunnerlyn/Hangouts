// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class kg extends kf
{

    static Field b;
    static boolean c = false;

    kg()
    {
    }

    public void a(View view, hp hp1)
    {
        if (hp1 == null)
        {
            hp1 = null;
        } else
        {
            hp1 = ((hp) (hp1.a()));
        }
        view.setAccessibilityDelegate((android.view.View.AccessibilityDelegate)hp1);
    }

    public boolean a(View view, int i)
    {
        return view.canScrollHorizontally(i);
    }

    public boolean b(View view)
    {
        if (!c)
        {
            if (b == null)
            {
                try
                {
                    Field field = android/view/View.getDeclaredField("mAccessibilityDelegate");
                    b = field;
                    field.setAccessible(true);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    c = true;
                    return false;
                }
            }
            try
            {
                view = ((View) (b.get(view)));
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                c = true;
                return false;
            }
            if (view != null)
            {
                return true;
            }
        }
        return false;
    }

    public boolean b(View view, int i)
    {
        return view.canScrollVertically(i);
    }

    public lr p(View view)
    {
        if (a == null)
        {
            a = new WeakHashMap();
        }
        lr lr2 = (lr)a.get(view);
        lr lr1 = lr2;
        if (lr2 == null)
        {
            lr1 = new lr(view);
            a.put(view, lr1);
        }
        return lr1;
    }

}
