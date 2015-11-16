// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.util.List;

public final class hjg extends hjm
{

    private hjr c;
    private hjr d;
    private hjr e;
    private hjr f;
    private hjr g;

    public hjg()
    {
    }

    static void a(fsn fsn1, boolean flag)
    {
        b(fsn1, flag);
    }

    private static void b(fsn fsn1, boolean flag)
    {
        if (fsn1 instanceof hje)
        {
            ((hje)fsn1).a(flag);
        }
    }

    public void a()
    {
        b(e);
        for (int i = 0; i < a.size(); i++)
        {
            fsn fsn1 = (fsn)a.get(i);
            if (fsn1 instanceof hjc)
            {
                ((hjc)fsn1).a();
            }
        }

    }

    public void a(Activity activity)
    {
        c = a(((hjr) (new hjh(this, activity))));
    }

    public void a(Bundle bundle)
    {
        d = a(((hjr) (new hji(this, bundle))));
    }

    public void a(View view, Bundle bundle)
    {
        e = a(((hjr) (new hjl(this, bundle, view))));
    }

    public void a(boolean flag)
    {
        if (g != null)
        {
            b(g);
        }
        if (!flag)
        {
            g = a(((hjr) (new hjj(this, flag))));
        } else
        {
            int i = 0;
            while (i < a.size()) 
            {
                b((fsn)a.get(i), flag);
                i++;
            }
        }
    }

    public void b(Bundle bundle)
    {
        f = a(new hjk(this, bundle));
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
