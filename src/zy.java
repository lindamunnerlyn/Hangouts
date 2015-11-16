// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public final class zy
    implements tn
{

    sy a;
    public tc b;
    final Toolbar c;

    public zy(Toolbar toolbar)
    {
        c = toolbar;
        super();
    }

    public void a(Context context, sy sy1)
    {
        if (a != null && b != null)
        {
            a.b(b);
        }
        a = sy1;
    }

    public void a(sy sy1, boolean flag)
    {
    }

    public boolean a(ts ts)
    {
        return false;
    }

    public void b(boolean flag)
    {
        boolean flag2 = false;
        if (b == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (a == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = a.size();
        i = 0;
_L9:
        flag1 = flag2;
        if (i >= j) goto _L4; else goto _L5
_L5:
        if (a.getItem(i) != b) goto _L7; else goto _L6
_L6:
        flag1 = true;
_L4:
        if (!flag1)
        {
            c(b);
        }
_L2:
        return;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(tc tc1)
    {
        Toolbar.b(c);
        if (Toolbar.c(c).getParent() != c)
        {
            c.addView(Toolbar.c(c));
        }
        c.a = tc1.getActionView();
        b = tc1;
        if (c.a.getParent() != c)
        {
            zz zz1 = c.r();
            zz1.a = 0x800003 | Toolbar.d(c) & 0x70;
            zz1.b = 2;
            c.a.setLayoutParams(zz1);
            c.addView(c.a);
        }
        c.t();
        c.requestLayout();
        tc1.e(true);
        if (c.a instanceof vt)
        {
            ((vt)c.a).a();
        }
        return true;
    }

    public boolean c(tc tc1)
    {
        if (c.a instanceof vt)
        {
            ((vt)c.a).b();
        }
        c.removeView(c.a);
        c.removeView(Toolbar.c(c));
        c.a = null;
        c.u();
        b = null;
        c.requestLayout();
        tc1.e(false);
        return true;
    }
}
