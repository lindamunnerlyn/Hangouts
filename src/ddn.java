// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class ddn extends dgj
{

    public String a;
    private String e;
    private final boolean f;
    private int g;
    private final aid h;
    private int i;
    private int j;
    private final aot k;
    private final boolean l;
    private final String m;

    public ddn(aoa aoa, String s, aid aid1, aot aot, boolean flag, boolean flag1, int i1, 
            String s1)
    {
        super(aoa);
        e = s;
        h = aid1;
        k = aot;
        f = flag;
        j = 1;
        l = flag1;
        i = i1;
        m = s1;
    }

    public void a()
    {
        Object obj = super.b.b;
        java.util.ArrayList arraylist = g.a(g.nU, h);
        obj = super.b.b;
        java.util.ArrayList arraylist1 = g.a(h);
        if (arraylist.size() > 100)
        {
            j = 4;
            return;
        }
        obj = arraylist.iterator();
        int i1 = 0;
        boolean flag = false;
        boolean flag1 = false;
        while (((Iterator) (obj)).hasNext()) 
        {
            cfz cfz1 = (cfz)((Iterator) (obj)).next();
            boolean flag2;
            if (cfz1.a == cgf.d)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            flag2 = flag1 | flag2;
            if (cfz1.a == cgf.c || cfz1.a == cgf.b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag |= flag1;
            i1 = cfz1.i() | i1;
            flag1 = flag2;
        }
        if (flag && (flag1 || i1))
        {
            j = 2;
            return;
        }
        Object obj1;
        if (l || arraylist.size() > 1 || arraylist1.size() > 0)
        {
            i1 = 2;
        } else
        {
            i1 = 1;
        }
        g = i1;
        obj1 = null;
        obj = obj1;
        if (g == 1)
        {
            ail ail1 = h.a(0);
            obj = obj1;
            if (ail1 != null)
            {
                obj = ail1.b().c();
            }
        }
        a = aoq.a(new aow(g.nU, super.b.a), false, e, arraylist, arraylist1, ((List) (obj)), k, g, i, true, super.c, m);
    }

    public int b()
    {
        return j;
    }

    public Object c()
    {
        return new ddo(a, super.b.b, g, f);
    }
}
