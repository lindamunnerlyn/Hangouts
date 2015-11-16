// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

public class gte
    implements gtm, hma, hor, hou, hoy
{

    gtl a;
    private gtz b;
    private final SparseArray c;
    private guh d;

    public gte(hof hof1)
    {
        this(hof1, (byte)0);
    }

    public gte(hof hof1, byte byte0)
    {
        c = new SparseArray();
        hof1.a(this);
    }

    static void a(gte gte1, int i, gtb gtb1)
    {
        gte1 = (gtd)gte1.c.get(i);
        if (gte1 != null)
        {
            gte1.a(gtb1.b, gtb1.c);
        }
    }

    public final void G_()
    {
        a.a(this);
        b.a(new gtf(this));
    }

    public gte a(int i, gtd gtd1)
    {
        if (c.get(i) != null)
        {
            gtd1 = String.valueOf("Cannot register more than one handler for a given  id: ");
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(gtd1).length() + 11)).append(gtd1).append(i).toString());
        } else
        {
            c.put(i, gtd1);
            return this;
        }
    }

    public final gte a(hlp hlp1)
    {
        hlp1.a(gte, this);
        return this;
    }

    public final void a()
    {
        a.b(this);
    }

    public void a(int i, Intent intent)
    {
        b.a(i);
        if (intent == null)
        {
            throw new NullPointerException("Intent must not be null!");
        }
        if ((gtd)c.get(i) == null)
        {
            throw new IllegalStateException((new StringBuilder(124)).append("You must register a result handler for request code").append(i).append(" before starting an activity for result with that request code").toString());
        } else
        {
            i = b.b(i);
            a.a(i, intent);
            return;
        }
    }

    public final void a(Context context, hlp hlp1, Bundle bundle)
    {
        a = (gtl)hlp1.a(gtl);
        d = (guh)hlp1.a(guh);
        b = (gtz)hlp1.a(gtz);
    }

    public final boolean a(gtb gtb1)
    {
        return b.a(gtb1.a, new gtg(this, gtb1));
    }
}
