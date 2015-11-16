// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.LinkedList;

public abstract class ezs
{

    ezr a;
    Bundle b;
    LinkedList c;
    private final fac d = new ezt(this);

    public ezs()
    {
    }

    private void a(int i)
    {
        for (; !c.isEmpty() && ((ezx)c.getLast()).a() >= i; c.removeLast()) { }
    }

    private void a(Bundle bundle, ezx ezx1)
    {
        if (a != null)
        {
            ezx1.b();
            return;
        }
        if (c == null)
        {
            c = new LinkedList();
        }
        c.add(ezx1);
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

    public ezr a()
    {
        return a;
    }

    public void a(Bundle bundle)
    {
        a(null, ((ezx) (new ezu(this, null))));
    }

    public abstract void a(fac fac);

    public void b()
    {
        a(null, new ezw(this));
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
