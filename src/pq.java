// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;

public abstract class pq
{

    public pq()
    {
    }

    public vt a(vu vu)
    {
        return null;
    }

    public abstract void a();

    public void a(float f1)
    {
        if (f1 != 0.0F)
        {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        } else
        {
            return;
        }
    }

    public abstract void a(int k);

    public void a(Configuration configuration)
    {
    }

    public void a(Drawable drawable)
    {
    }

    public abstract void a(View view);

    public abstract void a(CharSequence charsequence);

    public abstract void a(ps ps);

    public abstract void a(boolean flag);

    public boolean a(int k, KeyEvent keyevent)
    {
        return false;
    }

    public abstract void b();

    public void b(int k)
    {
    }

    public abstract void b(CharSequence charsequence);

    public void b(boolean flag)
    {
    }

    public abstract View c();

    public void c(int k)
    {
    }

    public void c(CharSequence charsequence)
    {
    }

    public void c(boolean flag)
    {
    }

    public abstract int d();

    public void d(boolean flag)
    {
    }

    public abstract void e();

    public abstract void f();

    public Context g()
    {
        return null;
    }

    public void h()
    {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public boolean i()
    {
        return false;
    }

    public boolean j()
    {
        return false;
    }
}
