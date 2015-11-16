// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

public abstract class qt
{

    qt()
    {
    }

    static qt a(Context context, Window window, qs qs)
    {
        int j = android.os.Build.VERSION.SDK_INT;
        if (j >= 23)
        {
            return new ra(context, window, qs);
        }
        if (j >= 14)
        {
            return new qy(context, window, qs);
        }
        if (j >= 11)
        {
            return new qx(context, window, qs);
        } else
        {
            return new rc(context, window, qs);
        }
    }

    public abstract pq a();

    public abstract void a(int j);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void a(CharSequence charsequence);

    public abstract MenuInflater b();

    public abstract void b(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract boolean b(int j);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract pw h();

    public abstract void i();
}
