// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class dcf extends dfa
{

    public String a;
    private String d;
    private final boolean e;
    private int f;
    private final aik g;
    private int h;
    private int i;
    private final aob j;
    private final boolean k;
    private final String l;

    public dcf(ani ani1, String s, aik aik1, aob aob, boolean flag, boolean flag1, int i1, 
            String s1)
    {
        super(ani1);
        d = s;
        g = aik1;
        j = aob;
        e = flag;
        i = 1;
        k = flag1;
        h = i1;
        l = s1;
    }

    public void a()
    {
        java.util.ArrayList arraylist = g.a(g.nS, g);
        java.util.ArrayList arraylist1 = g.a(g);
        if (arraylist.size() > 100)
        {
            i = 4;
            return;
        }
        Object obj = arraylist.iterator();
        int i1 = 0;
        boolean flag = false;
        boolean flag1 = false;
        while (((Iterator) (obj)).hasNext()) 
        {
            ceu ceu1 = (ceu)((Iterator) (obj)).next();
            boolean flag2;
            if (ceu1.a == cfa.d)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            flag2 = flag1 | flag2;
            if (ceu1.a == cfa.c || ceu1.a == cfa.b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag |= flag1;
            i1 = ceu1.i() | i1;
            flag1 = flag2;
        }
        if (flag && (flag1 || i1))
        {
            i = 2;
            return;
        }
        Object obj1;
        if (k || arraylist.size() > 1 || arraylist1.size() > 0)
        {
            i1 = 2;
        } else
        {
            i1 = 1;
        }
        f = i1;
        obj1 = null;
        obj = obj1;
        if (f == 1)
        {
            ais ais1 = g.a(0);
            obj = obj1;
            if (ais1 != null)
            {
                obj = ais1.b().c();
            }
        }
        a = any.a(new aoe(g.nS, b.h()), false, d, arraylist, arraylist1, ((List) (obj)), j, f, h, true, c, l);
    }

    public int b()
    {
        return i;
    }

    public Object c()
    {
        return new dcg(a, b, f, e);
    }
}
