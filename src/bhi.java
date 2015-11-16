// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class bhi
{

    boolean a;
    boolean b;
    BaseAdapter c;
    final bhg d;

    public bhi(bhg bhg, boolean flag, BaseAdapter baseadapter)
    {
        d = bhg;
        super();
        a = false;
        b = flag;
        c = baseadapter;
    }

    public View a(View view, ViewGroup viewgroup)
    {
        return null;
    }

    public boolean a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public int c()
    {
        int i;
label0:
        {
            int j = c.getCount();
            i = j;
            if (!b)
            {
                break label0;
            }
            if (j == 0)
            {
                i = j;
                if (!a)
                {
                    break label0;
                }
            }
            i = j + 1;
        }
        return i;
    }

    public BaseAdapter d()
    {
        return c;
    }

    public void e()
    {
    }
}
