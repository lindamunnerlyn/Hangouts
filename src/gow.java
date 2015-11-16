// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

public class gow
    implements fsn, gpe, hhi, hjx, hka
{

    private gpo a;
    private final SparseArray b;
    private gpd c;
    private gpw d;

    public gow(hjm hjm1)
    {
        this(hjm1, (byte)0);
    }

    public gow(hjm hjm1, byte byte0)
    {
        b = new SparseArray();
        hjm1.a(this);
    }

    static gpd a(gow gow1)
    {
        return gow1.c;
    }

    static void a(gow gow1, int i, got got1)
    {
        gow1 = (gov)gow1.b.get(i);
        if (gow1 != null)
        {
            gow1.a(got1.b, got1.c);
        }
    }

    public final void E_()
    {
        c.a(this);
        a.a(new gox(this));
    }

    public gow a(int i, gov gov1)
    {
        if (b.get(i) != null)
        {
            gov1 = String.valueOf("Cannot register more than one handler for a given  id: ");
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(gov1).length() + 11)).append(gov1).append(i).toString());
        } else
        {
            b.put(i, gov1);
            return this;
        }
    }

    public final gow a(hgx hgx1)
    {
        hgx1.a(gow, this);
        return this;
    }

    public final void a()
    {
        c.b(this);
    }

    public void a(int i, Intent intent)
    {
        a.a(i);
        if (intent == null)
        {
            throw new NullPointerException("Intent must not be null!");
        }
        if ((gov)b.get(i) == null)
        {
            throw new IllegalStateException((new StringBuilder(124)).append("You must register a result handler for request code").append(i).append(" before starting an activity for result with that request code").toString());
        } else
        {
            i = a.b(i);
            c.a(i, intent);
            return;
        }
    }

    public final void a(Context context, hgx hgx1, Bundle bundle)
    {
        c = (gpd)hgx1.a(gpd);
        d = (gpw)hgx1.a(gpw);
        a = (gpo)hgx1.a(gpo);
    }

    public final boolean a(got got1)
    {
        return a.a(got1.a, new goy(this, got1));
    }
}
