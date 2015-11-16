// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public abstract class csw
    implements csv, hor, hou, hoy
{

    private final csy a;
    final int b;
    final gqz c;
    private final int d;
    private boolean e;
    private boolean f;
    private String g;
    private grf h;

    public csw(Context context, hof hof1, int i, int j)
    {
        e = true;
        h = new csx(this);
        c = (gqz)hlp.a(context, gqz);
        a = (csy)hlp.a(context, csy);
        g.c(c.c(i));
        b = i;
        d = j;
        hof1.a(this);
    }

    private void d()
    {
        if (c.c(b) && !f && !e && g != null)
        {
            a.a(b, g, this, d);
            f = true;
            a(true);
            c.a(h);
        }
    }

    public void G_()
    {
        e = false;
        d();
    }

    public void a()
    {
        e = true;
        f();
    }

    public void a(String s)
    {
        if (TextUtils.equals(g, s))
        {
            return;
        } else
        {
            f();
            g = s;
            c();
            d();
            return;
        }
    }

    public void a(boolean flag)
    {
    }

    public abstract void c();

    public String e()
    {
        return g;
    }

    void f()
    {
        if (f)
        {
            a.a(this);
            f = false;
            a(false);
            c.b(h);
        }
    }
}
