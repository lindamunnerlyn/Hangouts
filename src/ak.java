// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

final class ak extends ao
{

    final ai a;

    public ak(ai ai1)
    {
        a = ai1;
        super(ai1);
    }

    public View a(int i)
    {
        return a.findViewById(i);
    }

    public void a(ad ad1)
    {
        a.a(ad1);
    }

    public void a(ad ad1, Intent intent, int i)
    {
        a.a(ad1, intent, i);
    }

    public void a(ad ad1, String as[], int i)
    {
        ai ai1 = a;
        if (i == -1)
        {
            p.a(ai1, as, i);
            return;
        }
        if ((i & 0xffffff00) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
        } else
        {
            ai1.i = true;
            p.a(ai1, as, (ad1.p + 1 << 8) + (i & 0xff));
            return;
        }
    }

    public void a(String s, PrintWriter printwriter, String as[])
    {
        a.dump(s, null, printwriter, as);
    }

    public boolean a()
    {
        Window window = a.getWindow();
        return window != null && window.peekDecorView() != null;
    }

    public boolean a(String s)
    {
        ai ai1 = a;
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            return ai1.shouldShowRequestPermissionRationale(s);
        } else
        {
            return false;
        }
    }

    public boolean b()
    {
        return !a.isFinishing();
    }

    public LayoutInflater c()
    {
        return a.getLayoutInflater().cloneInContext(a);
    }

    public void d()
    {
        a.q_();
    }

    public boolean e()
    {
        return a.getWindow() != null;
    }

    public int f()
    {
        Window window = a.getWindow();
        if (window == null)
        {
            return 0;
        } else
        {
            return window.getAttributes().windowAnimations;
        }
    }

    public Object g()
    {
        return a;
    }
}
