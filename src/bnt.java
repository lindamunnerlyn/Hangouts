// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class bnt extends gfs
{

    final bnk a;

    bnt(bnk bnk1)
    {
        a = bnk1;
        super();
    }

    public List a()
    {
        LinkedList linkedlist = new LinkedList();
        for (Iterator iterator = boo.a().b().iterator(); iterator.hasNext(); linkedlist.add((boq)iterator.next())) { }
        return linkedlist;
    }

    public void a(int i)
    {
        if (a.r != null)
        {
            a.r.a(i);
        }
        super.a(i);
    }

    public void a(geu geu)
    {
        if (a.r == null) goto _L2; else goto _L1
_L1:
        a.r.w();
        if (!a.r.v()) goto _L4; else goto _L3
_L3:
        bnk bnk1 = a;
        gdv.a("Expected condition to be true", bnk1.r.v());
        Object obj1 = bnk1.r.t();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new ArrayList();
        }
        List list = bnk1.r.u();
        obj1 = list;
        if (list == null)
        {
            obj1 = new ArrayList();
        }
        bnk.a(((List) (obj)), ((List) (obj1)));
        bnk1.r.C();
_L2:
        super.a(geu);
        return;
_L4:
        if (bnk.a(a))
        {
            eev.e("Babel_calls", "No one in hangout, will leave on timeout.");
            long l = g.a(a.c, "babel_lonely_hangout_timeout_ms", dlb.t);
            a.q.postDelayed(a.b, l);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void a(gkq gkq1, gap gap)
    {
        boolean flag = false;
        if (a.r != null) goto _L2; else goto _L1
_L1:
        super.a(gkq1, gap);
_L3:
        return;
_L2:
        int i;
        int j;
        if (gap instanceof gks)
        {
            if (gkq1.k())
            {
                a.r.a((gku)gkq1);
                i = 0;
            } else
            if (gkq1.i())
            {
                a.r.J();
                i = 0;
            } else
            {
                if (gkq1.f())
                {
                    break MISSING_BLOCK_LABEL_351;
                }
                a.r.a(gkq1);
                i = 1;
            }
        } else
        if ((gap instanceof gkp) && !gkq1.k())
        {
            if (gkq1.j())
            {
                a.r.a(gkq1);
                i = 1;
            } else
            if (gkq1.h())
            {
                a.r.b(gkq1);
                i = 0;
            } else
            {
                if (!gkq1.i())
                {
                    break MISSING_BLOCK_LABEL_351;
                }
                a.r.J();
                i = 0;
            }
        } else
        {
            if (!(gap instanceof gkt))
            {
                break MISSING_BLOCK_LABEL_351;
            }
            gkt gkt1 = (gkt)gap;
            if (!gkq1.f())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            a.r.a(gkq1, gkt1.b());
            j = 0;
            flag = i;
            i = j;
        }
_L5:
        super.a(gkq1, gap);
        j = a.r.I();
        if (i == 0 || j != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        gkq1 = boo.a().b().iterator();
        while (gkq1.hasNext()) 
        {
            ((boq)gkq1.next()).c();
        }
          goto _L3
        if (!flag || j != 0) goto _L3; else goto _L4
_L4:
        gkq1 = boo.a().b().iterator();
        while (gkq1.hasNext()) 
        {
            ((boq)gkq1.next()).i();
        }
          goto _L3
        i = 0;
          goto _L5
    }

    public void a(String s)
    {
        if (a.r != null)
        {
            a.r.r();
            if (a.r.e().g() == null)
            {
                a.r.a(s);
            }
        }
        super.a(s);
    }

    public void a(String s, int i, String s1, String s2)
    {
        if (a.r != null)
        {
            a.r.a(s, i, s2);
        }
        super.a(s, i, s1, s2);
    }

    public void a(String s, boolean flag, String s1, boolean flag1)
    {
        if (a.r != null)
        {
            if (s != null)
            {
                a.r.b(s);
            }
            a.r.b(flag);
            a.r.c(s1);
            a.r.c(flag1);
        }
        super.a(s, flag, s1, flag1);
    }

    public void b(String s)
    {
        if (a.r != null)
        {
            a.r.b(s);
            a.x();
        }
        super.b(s);
    }

    public void c(String s)
    {
        if (a.r != null)
        {
            a.r.e(s);
        }
        super.c(s);
    }
}
