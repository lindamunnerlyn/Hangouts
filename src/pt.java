// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;

public class pt
    implements oi
{

    boolean a;
    private final pu b;
    private final DrawerLayout c;
    private px d;
    private Drawable e;
    private boolean f;
    private final int g;
    private final int h;
    private boolean i;

    public pt(Activity activity, DrawerLayout drawerlayout, int j, int k)
    {
        this(activity, drawerlayout, j, k, (byte)0);
    }

    private pt(Activity activity, DrawerLayout drawerlayout, int j, int k, byte byte0)
    {
        a = true;
        i = false;
        if (activity instanceof pv)
        {
            b = ((pv)activity).b();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            b = new qa(activity);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            b = new pz(activity);
        } else
        {
            b = new py(activity);
        }
        c = drawerlayout;
        g = j;
        h = k;
        d = new pw(activity, b.b());
        e = d();
    }

    public void a()
    {
        if (c.e())
        {
            d.a(1.0F);
        } else
        {
            d.a(0.0F);
        }
        if (a)
        {
            Drawable drawable = (Drawable)d;
            int j;
            if (c.e())
            {
                j = h;
            } else
            {
                j = g;
            }
            a(drawable, j);
        }
    }

    public void a(int j)
    {
    }

    void a(Drawable drawable, int j)
    {
        if (!i && !b.c())
        {
            i = true;
        }
        b.a(drawable, j);
    }

    public void a(View view)
    {
        d.a(1.0F);
        if (a)
        {
            b(h);
        }
    }

    public void a(View view, float f1)
    {
        d.a(Math.min(1.0F, Math.max(0.0F, f1)));
    }

    public boolean a(MenuItem menuitem)
    {
        if (menuitem != null && menuitem.getItemId() == 0x102002c && a)
        {
            c();
            return true;
        } else
        {
            return false;
        }
    }

    public void b()
    {
        if (!f)
        {
            e = d();
        }
        a();
    }

    void b(int j)
    {
        b.a(j);
    }

    public void b(View view)
    {
        d.a(0.0F);
        if (a)
        {
            b(g);
        }
    }

    void c()
    {
        if (c.f())
        {
            c.d();
            return;
        } else
        {
            c.c();
            return;
        }
    }

    Drawable d()
    {
        return b.a();
    }
}
