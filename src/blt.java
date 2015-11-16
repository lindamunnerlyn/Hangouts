// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class blt
{

    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final int f;
    public View g;

    public blt(String s, String s1, boolean flag, boolean flag1, int i)
    {
        a = s;
        b = s1;
        c = flag;
        d = flag1;
        f = i;
        g = null;
        e = true;
    }

    public void a()
    {
        if (g != null)
        {
            g.setEnabled(e);
            View view = g;
            float f1;
            if (e)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.4F;
            }
            view.setAlpha(f1);
        }
    }

    public void a(boolean flag)
    {
        e = flag;
        a();
    }
}
