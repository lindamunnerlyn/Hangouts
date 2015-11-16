// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class aie
{

    List a;
    List b;

    aie()
    {
        a = new ArrayList();
        b = new ArrayList();
    }

    public aid a()
    {
        return new aid(this);
    }

    public aie a(aid aid1)
    {
label0:
        {
            List list = aid1.a();
            if (!list.isEmpty())
            {
                if (a.isEmpty())
                {
                    a = list;
                } else
                {
                    a.addAll(list);
                }
            }
            aid1 = aid1.c();
            if (!aid1.isEmpty())
            {
                if (!b.isEmpty())
                {
                    break label0;
                }
                b = aid1;
            }
            return this;
        }
        b.addAll(aid1);
        return this;
    }

    public aie a(aif aif)
    {
        b.add(aif);
        return this;
    }

    public aie a(ail ail1)
    {
        a.add(ail1);
        return this;
    }

    public aie a(Iterable iterable)
    {
        ail ail1;
        for (iterable = iterable.iterator(); iterable.hasNext(); a.add(ail1))
        {
            ail1 = (ail)iterable.next();
        }

        return this;
    }
}
