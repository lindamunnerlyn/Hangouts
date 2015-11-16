// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import java.util.Map;

public final class isv
{

    private final Activity a;
    private itc b;
    private itc c;
    private boolean d;

    public isv(Activity activity)
    {
        a = activity;
    }

    public void a()
    {
        b = its.b();
        itc itc1 = null;
        Intent intent = a.getIntent();
        if (intent.hasExtra("tracing_intent_id"))
        {
            int i1 = intent.getIntExtra("tracing_intent_id", -1);
            itc1 = (itc)itp.a.remove(Integer.valueOf(i1));
        }
        if (itc1 != null)
        {
            its.a(itc1);
            c = itc1;
        } else
        {
            g.N(a).a("Intent");
            c = its.b();
        }
        d = false;
    }

    public void b()
    {
        its.a(b);
        b = null;
    }

    public void c()
    {
        b = its.b();
        if (c != null && !d)
        {
            its.a(c);
            return;
        } else
        {
            g.N(a).a(a.getClass(), "onStart");
            c = its.b();
            d = false;
            return;
        }
    }

    public void d()
    {
        its.a(b);
        b = null;
    }

    public void e()
    {
        b = its.b();
        if (c != null && !d)
        {
            its.a(c);
            return;
        } else
        {
            g.N(a).a(a.getClass(), "onResume");
            c = its.b();
            d = false;
            return;
        }
    }

    public void f()
    {
        its.a(b);
        b = null;
    }

    public void g()
    {
        b = its.b();
        its.a(c);
    }

    public void h()
    {
        c = null;
        its.a(b);
        b = null;
    }

    public void i()
    {
        b = its.b();
        g.N(a).a(a.getClass(), "onPause");
        c = its.b();
        d = true;
    }

    public void j()
    {
        its.a(b);
        b = null;
    }

    public void k()
    {
        n.b(c, "onStop called before onPause");
        b = its.b();
        its.a(c);
    }

    public void l()
    {
        its.a(b);
        b = null;
    }

    public void m()
    {
        n.b(c, "onDestroy called before onPause");
        b = its.b();
        its.a(c);
    }

    public void n()
    {
        its.a(b);
        b = null;
    }
}
