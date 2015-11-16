// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public abstract class ebd
    implements ebc, fsn, hjx, hka
{

    private static final ebe a;
    private final int b;
    private final int c;
    private boolean d;
    private boolean e;
    private String f;

    public ebd(hjm hjm1, int i, int j)
    {
        boolean flag = true;
        super();
        d = true;
        if (i == -1)
        {
            flag = false;
        }
        g.a(flag);
        c = i;
        b = j;
        hjm1.a(this);
    }

    private void d()
    {
        if (!e && !d && f != null)
        {
            a.a(c, f, this, b);
            e = true;
            a(true);
        }
    }

    private void f()
    {
        if (e)
        {
            a.a(this);
            e = false;
            a(false);
        }
    }

    public void E_()
    {
        d = false;
        d();
    }

    public void a()
    {
        d = true;
        f();
    }

    public void a(String s)
    {
        if (TextUtils.equals(f, s))
        {
            return;
        } else
        {
            f();
            f = s;
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
        return f;
    }

    static 
    {
        a = ebe.a;
    }
}
