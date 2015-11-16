// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.LinkedList;

public abstract class fcq
{

    fcp a;
    Bundle b;
    LinkedList c;
    private final fda d = new fcr(this);

    public fcq()
    {
    }

    private void a(int i)
    {
        for (; !c.isEmpty() && ((fcv)c.getLast()).a() >= i; c.removeLast()) { }
    }

    private void a(Bundle bundle, fcv fcv1)
    {
        if (a != null)
        {
            fcv1.b();
            return;
        }
        if (c == null)
        {
            c = new LinkedList();
        }
        c.add(fcv1);
        if (bundle != null)
        {
            if (b == null)
            {
                b = (Bundle)bundle.clone();
            } else
            {
                b.putAll(bundle);
            }
        }
        a(d);
    }

    public fcp a()
    {
        return a;
    }

    public void a(Bundle bundle)
    {
        a(null, ((fcv) (new fcs(this, null))));
    }

    public abstract void a(fda fda);

    public void b()
    {
        a(null, new fcu(this));
    }

    public void c()
    {
        if (a != null)
        {
            a.b();
            return;
        } else
        {
            a(5);
            return;
        }
    }

    public void d()
    {
        if (a != null)
        {
            a.c();
            return;
        } else
        {
            a(1);
            return;
        }
    }
}
