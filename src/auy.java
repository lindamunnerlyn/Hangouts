// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public abstract class auy
{

    public ViewGroup b;
    public Object c;

    public auy(View view, int i, Object obj)
    {
        b = (ViewGroup)view.findViewById(i);
        c = obj;
        c();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            d();
        }
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        b.setVisibility(i);
    }

    public abstract boolean a();

    public abstract void c();

    public abstract void d();
}
