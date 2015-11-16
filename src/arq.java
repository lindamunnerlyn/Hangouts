// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

public abstract class arq
{

    final arp a;
    private boolean b;
    private boolean c;
    private final int d;
    private final int e;
    private Cursor f;
    private int g;

    public arq(arp arp1, int j, int k, boolean flag, boolean flag1)
    {
        a = arp1;
        super();
        d = j;
        e = k;
        c = flag1;
        b = flag;
        f();
    }

    private void f()
    {
        int j;
label0:
        {
            int k = g();
            j = k;
            if (!b)
            {
                break label0;
            }
            if (!c)
            {
                j = k;
                if (k <= 0)
                {
                    break label0;
                }
            }
            j = k + 1;
        }
        g = j;
    }

    private int g()
    {
        if (f != null && !f.isClosed())
        {
            return f.getCount();
        } else
        {
            return 0;
        }
    }

    private boolean h()
    {
        for (Iterator iterator = a.c.iterator(); iterator.hasNext();)
        {
            if ((arq)iterator.next() == this)
            {
                return true;
            }
        }

        return false;
    }

    private int i()
    {
        Iterator iterator = a.c.iterator();
        arq arq1;
        for (int j = 0; iterator.hasNext(); j = arq1.c() + j)
        {
            arq1 = (arq)iterator.next();
            if (arq1 == this)
            {
                return j;
            }
        }

        return -1;
    }

    public int a(int j)
    {
        int k = j;
        if (b)
        {
            k = j - 1;
        }
        if (k == -1)
        {
            return d;
        } else
        {
            return e;
        }
    }

    public void a(Cursor cursor)
    {
        if (f == cursor)
        {
            return;
        }
        boolean flag = h();
        int k = i();
        if (!flag)
        {
            f = cursor;
            return;
        }
        flag = a();
        int l = g;
        f = cursor;
        f();
        boolean flag1 = a();
        int i1 = g;
        a.d = a.d + (i1 - l);
        int j;
        if (flag && flag1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i1 > l)
        {
            a.a(k + j, l - j);
            a.b(k + l, i1 - l);
            return;
        }
        if (l > i1)
        {
            a.a(k + j, i1 - j);
            ((yz) (a)).a.c(k + i1, l - i1);
            return;
        } else
        {
            a.a(k + j, i1 - j);
            return;
        }
    }

    public abstract void a(zs zs);

    public void a(zs zs, int j)
    {
        int k = j;
        if (b)
        {
            k = j - 1;
        }
        if (k == -1)
        {
            a(zs);
            return;
        }
        if (!f.moveToPosition(k))
        {
            throw new IllegalStateException((new StringBuilder(44)).append("Couldn't move cursor to position ").append(k).toString());
        } else
        {
            a(zs, f);
            return;
        }
    }

    public abstract void a(zs zs, Cursor cursor);

    public void a(boolean flag)
    {
        if (b != flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        boolean flag1 = a();
        b = flag;
        if (flag1 == a())
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i();
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        g = g - 1;
        if (h())
        {
            arp arp1 = a;
            arp1.d = arp1.d - 1;
            ((yz) (a)).a.c(j, 1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        g = g + 1;
        if (h())
        {
            arp arp2 = a;
            arp2.d = arp2.d + 1;
            ((yz) (a)).a.b(j, 1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean a()
    {
        return b && (c || g() > 0);
    }

    public boolean b()
    {
        return g == 0;
    }

    public int c()
    {
        return g;
    }

    public boolean d()
    {
        return f != null;
    }

    public Cursor e()
    {
        return f;
    }
}
