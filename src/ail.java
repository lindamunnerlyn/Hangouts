// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ail
{

    List a;
    List b;

    ail()
    {
        a = new ArrayList();
        b = new ArrayList();
    }

    public aik a()
    {
        return new aik(this);
    }

    public ail a(aik aik1)
    {
label0:
        {
            List list = aik1.a();
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
            aik1 = aik1.c();
            if (!aik1.isEmpty())
            {
                if (!b.isEmpty())
                {
                    break label0;
                }
                b = aik1;
            }
            return this;
        }
        b.addAll(aik1);
        return this;
    }

    public ail a(aim aim)
    {
        b.add(aim);
        return this;
    }

    public ail a(ais ais1)
    {
        a.add(ais1);
        return this;
    }

    public ail a(Iterable iterable)
    {
        ais ais1;
        for (iterable = iterable.iterator(); iterable.hasNext(); a.add(ais1))
        {
            ais1 = (ais)iterable.next();
        }

        return this;
    }
}
