// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class bvd
    implements buh
{

    private static final boolean a = false;
    private final bnk b = bnk.a();
    private final bvf c = new bvf(this);
    private final bvg d = new bvg(this);
    private final List e = new CopyOnWriteArrayList();
    private bui f;
    private gdi g;
    private jhc h;

    bvd()
    {
        f = bui.e;
        g = null;
        b.a(c);
    }

    static bui a(bvd bvd1, bui bui1)
    {
        bvd1.f = bui1;
        return bui1;
    }

    static gdi a(bvd bvd1)
    {
        return bvd1.g;
    }

    static gdi a(bvd bvd1, gdi gdi1)
    {
        bvd1.g = gdi1;
        return gdi1;
    }

    static jhc a(bvd bvd1, jhc jhc1)
    {
        bvd1.h = jhc1;
        return jhc1;
    }

    static jhc b(bvd bvd1)
    {
        return bvd1.h;
    }

    static bui c(bvd bvd1)
    {
        return bvd1.f;
    }

    static List d(bvd bvd1)
    {
        return bvd1.e;
    }

    static boolean d()
    {
        return a;
    }

    static bnk e(bvd bvd1)
    {
        return bvd1.b;
    }

    static bvg f(bvd bvd1)
    {
        return bvd1.d;
    }

    public bui a()
    {
        return f;
    }

    public void a(bug bug)
    {
        e.add(bug);
    }

    public void a(boolean flag)
    {
        if (g == null || h == null)
        {
            return;
        }
        jhc jhc1 = new jhc();
        jhc1.a = h.a;
        jhf jhf1;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        jhc1.u = Integer.valueOf(byte0);
        jhf1 = new jhf();
        jhf1.c = (new jhc[] {
            jhc1
        });
        g.b(jhf1, new bve(this, flag));
    }

    public void b(bug bug)
    {
        e.remove(bug);
    }

    public boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (h != null)
        {
            flag = flag1;
            if (g.a(h.b, 0) == 2)
            {
                flag = true;
            }
        }
        return flag;
    }

    public String c()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h.A;
        }
    }

    static 
    {
        hnc hnc = eev.f;
    }
}
