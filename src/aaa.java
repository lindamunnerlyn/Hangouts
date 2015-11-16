// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public final class aaa
    implements tp
{

    ta a;
    public te b;
    final Toolbar c;

    public aaa(Toolbar toolbar)
    {
        c = toolbar;
        super();
    }

    public void a(Context context, ta ta1)
    {
        if (a != null && b != null)
        {
            a.b(b);
        }
        a = ta1;
    }

    public void a(ta ta1, boolean flag)
    {
    }

    public boolean a(tu tu)
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

    public boolean b(te te1)
    {
        Toolbar.a(c);
        if (c.a.getParent() != c)
        {
            c.addView(c.a);
        }
        c.b = te1.getActionView();
        b = te1;
        if (c.b.getParent() != c)
        {
            aab aab1 = c.r();
            aab1.a = 0x800003 | c.c & 0x70;
            aab1.b = 2;
            c.b.setLayoutParams(aab1);
            c.addView(c.b);
        }
        c.t();
        c.requestLayout();
        te1.e(true);
        if (c.b instanceof vv)
        {
            ((vv)c.b).a();
        }
        return true;
    }

    public boolean c(te te1)
    {
        if (c.b instanceof vv)
        {
            ((vv)c.b).b();
        }
        c.removeView(c.b);
        c.removeView(c.a);
        c.b = null;
        c.u();
        b = null;
        c.requestLayout();
        te1.e(false);
        return true;
    }
}
