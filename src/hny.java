// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.util.List;

public final class hny extends hof
{

    private hok c;
    private hok d;
    private hok e;
    private hok f;
    private hok g;

    public hny()
    {
    }

    static void a(hoy hoy1, boolean flag)
    {
        b(hoy1, flag);
    }

    private static void b(hoy hoy1, boolean flag)
    {
        if (hoy1 instanceof hnw)
        {
            ((hnw)hoy1).a(flag);
        }
    }

    public void a()
    {
        b(e);
        for (int i = 0; i < a.size(); i++)
        {
            hoy hoy1 = (hoy)a.get(i);
            if (hoy1 instanceof hnu)
            {
                ((hnu)hoy1).a();
            }
        }

    }

    public void a(Activity activity)
    {
        c = a(((hok) (new hnz(this, activity))));
    }

    public void a(Bundle bundle)
    {
        d = a(((hok) (new hoa(this, bundle))));
    }

    public void a(View view, Bundle bundle)
    {
        e = a(((hok) (new hod(this, bundle, view))));
    }

    public void a(boolean flag)
    {
        if (g != null)
        {
            b(g);
        }
        if (!flag)
        {
            g = a(((hok) (new hob(this, flag))));
        } else
        {
            int i = 0;
            while (i < a.size()) 
            {
                b((hoy)a.get(i), flag);
                i++;
            }
        }
    }

    public void b(Bundle bundle)
    {
        f = a(new hoc(this, bundle));
    }

    public void c()
    {
        super.c();
        b(d);
        b(f);
    }

    public void d()
    {
        b(c);
    }
}
