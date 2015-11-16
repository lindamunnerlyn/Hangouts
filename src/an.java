// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public final class an
{

    private final ao a;

    an(ao ao1)
    {
        a = ao1;
    }

    public View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        return a.d.a(view, s1, context, attributeset);
    }

    public ap a()
    {
        return a.k();
    }

    public List a(List list)
    {
        if (a.d.f == null)
        {
            return null;
        } else
        {
            list.addAll(a.d.f);
            return list;
        }
    }

    public void a(Configuration configuration)
    {
        a.d.a(configuration);
    }

    public void a(Parcelable parcelable, List list)
    {
        a.d.a(parcelable, list);
    }

    public void a(hm hm)
    {
        a.a(hm);
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a.a(s1, filedescriptor, printwriter, as);
    }

    public void a(boolean flag)
    {
        a.a(flag);
    }

    public boolean a(Menu menu)
    {
        return a.d.a(menu);
    }

    public boolean a(Menu menu, MenuInflater menuinflater)
    {
        return a.d.a(menu, menuinflater);
    }

    public boolean a(MenuItem menuitem)
    {
        return a.d.a(menuitem);
    }

    public bq b()
    {
        return a.l();
    }

    public void b(Menu menu)
    {
        a.d.b(menu);
    }

    public boolean b(MenuItem menuitem)
    {
        return a.d.b(menuitem);
    }

    public int c()
    {
        java.util.ArrayList arraylist = a.d.f;
        if (arraylist == null)
        {
            return 0;
        } else
        {
            return arraylist.size();
        }
    }

    public void d()
    {
        a.d.a(a, a, null);
    }

    public void e()
    {
        a.d.noteStateNotSaved();
    }

    public Parcelable f()
    {
        return a.d.i();
    }

    public List g()
    {
        return a.d.h();
    }

    public void h()
    {
        a.d.j();
    }

    public void i()
    {
        a.d.k();
    }

    public void j()
    {
        a.d.l();
    }

    public void k()
    {
        a.d.m();
    }

    public void l()
    {
        a.d.n();
    }

    public void m()
    {
        a.d.o();
    }

    public void n()
    {
        a.d.p();
    }

    public void o()
    {
        a.d.r();
    }

    public void p()
    {
        a.d.s();
    }

    public boolean q()
    {
        return a.d.g();
    }

    public void r()
    {
        a.m();
    }

    public void s()
    {
        a.n();
    }

    public void t()
    {
        a.o();
    }

    public hm u()
    {
        return a.p();
    }
}
