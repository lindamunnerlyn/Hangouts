// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class gqn
{

    private final Context a;
    private String b;
    gqo c;
    int d;
    private int e;
    private boolean f;
    private boolean g;
    private int h;

    public gqn(Context context, String s)
    {
        d = grl.c;
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

    public gqn(String s)
    {
        this(null, s);
    }

    public grk a()
    {
        return null;
    }

    public grk a(Context context)
    {
        return null;
    }

    void a(int j)
    {
        e = j;
    }

    void a(gqo gqo)
    {
        c = gqo;
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
        g.a(flag);
        if (context == null)
        {
            context = a;
        }
        if (g && h == 0)
        {
            h = grj.a(context).a();
        }
    }

    public Context d()
    {
        g.c(a, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
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
        g.a(flag);
        if (context == null)
        {
            context = a;
        }
        if (h != 0)
        {
            grj.a(context).a(h);
        }
    }

    Context e()
    {
        return a;
    }

    public gqn f()
    {
        f = true;
        return this;
    }

    public boolean g()
    {
        return f;
    }

    public String h()
    {
        return b;
    }

    int i()
    {
        return e;
    }
}
