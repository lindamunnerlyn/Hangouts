// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;

abstract class qu extends qt
{

    final Context a;
    final Window b;
    final android.view.Window.Callback c;
    final android.view.Window.Callback d;
    final qs e;
    pq f;
    MenuInflater g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    CharSequence m;
    boolean n;

    qu(Context context, Window window, qs qs)
    {
        a = context;
        b = window;
        e = qs;
        c = b.getCallback();
        if (c instanceof qw)
        {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        } else
        {
            d = a(c);
            b.setCallback(d);
            return;
        }
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new qw(this, callback);
    }

    public pq a()
    {
        j();
        return f;
    }

    abstract vt a(vu vu);

    public void a(Bundle bundle)
    {
        bundle = a.obtainStyledAttributes(rq.bK);
        if (!bundle.hasValue(rq.bO))
        {
            bundle.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (!bundle.getBoolean(rq.bX, false)) goto _L2; else goto _L1
_L1:
        b(1);
_L4:
        if (bundle.getBoolean(rq.bP, false))
        {
            b(109);
        }
        if (bundle.getBoolean(rq.bQ, false))
        {
            b(10);
        }
        k = bundle.getBoolean(rq.bM, false);
        bundle.recycle();
        return;
_L2:
        if (bundle.getBoolean(rq.bO, false))
        {
            b(108);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(CharSequence charsequence)
    {
        m = charsequence;
        b(charsequence);
    }

    abstract boolean a(int i1, KeyEvent keyevent);

    abstract boolean a(KeyEvent keyevent);

    public MenuInflater b()
    {
        if (g == null)
        {
            j();
            Context context;
            if (f != null)
            {
                context = f.g();
            } else
            {
                context = a;
            }
            g = new sm(context);
        }
        return g;
    }

    abstract void b(CharSequence charsequence);

    abstract void c(int i1);

    abstract boolean d(int i1);

    public final void g()
    {
        n = true;
    }

    public final pw h()
    {
        return new qv(this);
    }

    abstract void j();

    final Context k()
    {
        Context context = null;
        Object obj = a();
        if (obj != null)
        {
            context = ((pq) (obj)).g();
        }
        obj = context;
        if (context == null)
        {
            obj = a;
        }
        return ((Context) (obj));
    }

    public boolean l()
    {
        return false;
    }
}
