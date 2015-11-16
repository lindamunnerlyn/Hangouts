// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class guy
{

    private final Context a;
    private String b;
    private int c;
    private boolean d;
    guz e;
    int f;
    private boolean g;
    private int h;

    public guy(Context context, String s)
    {
        f = gvw.c;
        if (context != null)
        {
            context = context.getApplicationContext();
        } else
        {
            context = null;
        }
        a = context;
        b = s;
        if (s == null)
        {
            throw new IllegalArgumentException("BackgroundTask tag cannot be null.");
        } else
        {
            return;
        }
    }

    public guy(String s)
    {
        this(null, s);
    }

    public gvv a()
    {
        return null;
    }

    public gvv a(Context context)
    {
        return null;
    }

    void a(int j)
    {
        c = j;
    }

    void a(guz guz)
    {
        e = guz;
    }

    public String b(Context context)
    {
        return null;
    }

    void c(Context context)
    {
        boolean flag;
        if (context != null || a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.c(flag);
        if (context == null)
        {
            context = a;
        }
        if (g && h == 0)
        {
            h = gvu.a(context).a();
        }
    }

    public Context d()
    {
        g.d(a, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        return e();
    }

    void d(Context context)
    {
        boolean flag;
        if (context != null || a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.c(flag);
        if (context == null)
        {
            context = a;
        }
        if (h != 0)
        {
            gvu.a(context).a(h);
        }
    }

    Context e()
    {
        return a;
    }

    public guy f()
    {
        d = true;
        return this;
    }

    public boolean g()
    {
        return d;
    }

    public void g_()
    {
    }

    public String h()
    {
        return b;
    }

    int i()
    {
        return c;
    }
}
