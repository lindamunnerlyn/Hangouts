// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class bnl extends gde
{

    final bnd a;

    bnl(bnd bnd1)
    {
        a = bnd1;
        super();
    }

    public List a()
    {
        LinkedList linkedlist = new LinkedList();
        for (Iterator iterator = bof.a().b().iterator(); iterator.hasNext(); linkedlist.add((boh)iterator.next())) { }
        return linkedlist;
    }

    public void a(int i)
    {
        if (a.q != null)
        {
            a.q.a(i);
        }
        super.a(i);
    }

    public void a(gcg gcg)
    {
        if (a.q == null) goto _L2; else goto _L1
_L1:
        a.q.x();
        if (!a.q.w()) goto _L4; else goto _L3
_L3:
        bnd bnd1 = a;
        gbh.a(bnd1.q.w());
        Object obj1 = bnd1.q.u();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new ArrayList();
        }
        List list = bnd1.q.v();
        obj1 = list;
        if (list == null)
        {
            obj1 = new ArrayList();
        }
        bnd.a(((List) (obj)), ((List) (obj1)));
        bnd1.q.D();
_L2:
        super.a(gcg);
        return;
_L4:
        if (bnd.a(a))
        {
            ebw.e("Babel_calls", "No one in hangout, will leave on timeout.");
            long l = g.a(a.c, "babel_lonely_hangout_timeout_ms", djk.t);
            a.p.postDelayed(a.b, l);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void a(gho gho1, fyb fyb)
    {
        boolean flag = false;
        if (a.q != null) goto _L2; else goto _L1
_L1:
        super.a(gho1, fyb);
_L3:
        return;
_L2:
        int i;
        int j;
        if (fyb instanceof ghq)
        {
            if (gho1.l())
            {
                a.q.a((ghs)gho1);
                i = 0;
            } else
            if (gho1.j())
            {
                a.q.K();
                i = 0;
            } else
            {
                if (gho1.g())
                {
                    break MISSING_BLOCK_LABEL_351;
                }
                a.q.a(gho1);
                i = 1;
            }
        } else
        if ((fyb instanceof ghn) && !gho1.l())
        {
            if (gho1.k())
            {
                a.q.a(gho1);
                i = 1;
            } else
            if (gho1.i())
            {
                a.q.b(gho1);
                i = 0;
            } else
            {
                if (!gho1.j())
                {
                    break MISSING_BLOCK_LABEL_351;
                }
                a.q.K();
                i = 0;
            }
        } else
        {
            if (!(fyb instanceof ghr))
            {
                break MISSING_BLOCK_LABEL_351;
            }
            ghr ghr1 = (ghr)fyb;
            if (!gho1.g())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            a.q.a(gho1, ghr1.b());
            j = 0;
            flag = i;
            i = j;
        }
_L5:
        super.a(gho1, fyb);
        j = a.q.J();
        if (i == 0 || j != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        gho1 = bof.a().b().iterator();
        while (gho1.hasNext()) 
        {
            ((boh)gho1.next()).c();
        }
          goto _L3
        if (!flag || j != 0) goto _L3; else goto _L4
_L4:
        gho1 = bof.a().b().iterator();
        while (gho1.hasNext()) 
        {
            ((boh)gho1.next()).i();
        }
          goto _L3
        i = 0;
          goto _L5
    }

    public void a(String s)
    {
        if (a.q != null)
        {
            a.q.s();
            if (a.q.e().g() == null)
            {
                a.q.a(s);
            }
        }
        super.a(s);
    }

    public void a(String s, int i, String s1, String s2)
    {
        if (a.q != null)
        {
            a.q.a(s, i, s2);
        }
        super.a(s, i, s1, s2);
    }

    public void a(String s, boolean flag, String s1, boolean flag1, boolean flag2)
    {
        if (a.q != null)
        {
            if (s != null)
            {
                a.q.b(s);
            }
            a.q.b(flag);
            a.q.c(s1);
            a.q.c(flag1);
            a.q.d(flag2);
        }
        super.a(s, flag, s1, flag1, flag2);
    }

    public void b(String s)
    {
        if (a.q != null)
        {
            a.q.b(s);
            a.z();
        }
        super.b(s);
    }

    public void c(String s)
    {
        if (a.q != null)
        {
            a.q.e(s);
        }
        super.c(s);
    }
}
