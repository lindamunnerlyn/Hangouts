// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class si extends ContextWrapper
{

    private int a;
    private android.content.res.Resources.Theme b;
    private LayoutInflater c;

    public si(Context context, int i)
    {
        super(context);
        a = i;
    }

    private void b()
    {
        boolean flag;
        if (b == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null)
            {
                b.setTo(theme);
            }
        }
        b.applyStyle(a, true);
    }

    public int a()
    {
        return a;
    }

    public Object getSystemService(String s)
    {
        if ("layout_inflater".equals(s))
        {
            if (c == null)
            {
                c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return c;
        } else
        {
            return getBaseContext().getSystemService(s);
        }
    }

    public android.content.res.Resources.Theme getTheme()
    {
        if (b != null)
        {
            return b;
        }
        if (a == 0)
        {
            a = g.bL;
        }
        b();
        return b;
    }

    public void setTheme(int i)
    {
        if (a != i)
        {
            a = i;
            b();
        }
    }
}
