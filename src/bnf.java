// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class bnf extends gjm
{

    final bnd a;

    bnf(bnd bnd1)
    {
        a = bnd1;
        super();
    }

    public void a(int i)
    {
        a.p.removeCallbacks(a.b);
        if (a.q != null)
        {
            bnz.a(a.c, a.q.e(), i, false);
            gcg gcg1 = a.q.r();
            a.a(gcg1);
        }
        bnd bnd1 = a;
        bnd1.l = null;
        bnd1.m = true;
        bnd1.n = true;
        bnd1.f = null;
        bnd1.h = null;
        bnd1.k.clear();
        bnd1.d.clear();
        bnd1.o = null;
        bnd1.j = null;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bnk)iterator.next()).a(i)) { }
    }

    public void a(gjq gjq)
    {
        a.f = gjq;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bnk)iterator.next()).a(gjq)) { }
    }

    public void a(gjr gjr1)
    {
        if (a.k.containsKey(gjr1.a()))
        {
            Object obj = String.valueOf(gjr1.toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "Map dup: already has participant: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Map dup: already has participant: ");
            }
            ebw.g("Babel_calls", ((String) (obj)));
            String s;
            Object obj1;
            for (obj = a.k.entrySet().iterator(); ((Iterator) (obj)).hasNext(); ebw.g("Babel_calls", (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(obj1).length())).append("Map dup: key=").append(s).append(" value=").append(((String) (obj1))).toString()))
            {
                obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                s = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = String.valueOf(((gjr)((java.util.Map.Entry) (obj1)).getValue()).toString());
            }

            gbh.a("Map dup: already has participant");
        }
        if (gjr1.g())
        {
            a.o = gjr1;
        }
        a.k.put(gjr1.a(), gjr1);
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bnk)iterator.next()).a(gjr1)) { }
    }

    public void a(gjs gjs)
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bnk)iterator.next()).a(gjs)) { }
    }

    public void a(jdh jdh1)
    {
        Object obj1;
        boolean flag;
        obj1 = null;
        flag = false;
        g.b(2677);
        if (a.q != null) goto _L2; else goto _L1
_L1:
        g.b(2011);
_L5:
        return;
_L2:
        Object obj3;
        ani ani;
        gcg gcg1;
        android.content.Context context = g.nS;
        ani = a.q.l();
        if (dbf.g(ani))
        {
            g.b(2589);
        }
        gcg1 = a.q.r();
        int i = gcg1.q();
        if (i == 19 || i == 26)
        {
            g.b(2012);
            return;
        }
        obj3 = a;
        if (((bnd) (obj3)).i != null) goto _L4; else goto _L3
_L3:
        Object obj = null;
_L13:
        jdh1.l = ((ioi) (obj));
        if (jdh1.k != null)
        {
            obj = a.q.V();
            int j;
            int k;
            if (obj == null)
            {
                obj = obj1;
            } else
            {
                obj = ((ceu) (obj)).f();
            }
            if (obj != null)
            {
                obj3 = jdh1.k.c;
                Object obj2 = obj3;
                if (obj3 == null)
                {
                    obj2 = new ioj();
                    jdh1.k.c = ((ioj) (obj2));
                }
                obj2.b = new iok();
                ((ioj) (obj2)).b.a = ((String) (obj));
            }
        }
        RealTimeChatService.a(ani, gcg1.h(), jdh1);
        if (!gcg1.d())
        {
            g.b(2177);
        } else
        {
            g.b(2176);
            if (g.d(ani))
            {
                jdh1 = g.a(g.nS, "babel_hangout_upload_end_causes", "6,10,29,47").split(",");
                String s = Integer.toString(gcg1.t());
                if (Arrays.asList(jdh1).contains(s))
                {
                    a.q.f("");
                }
            }
        }
        if (a.q.T())
        {
            RealTimeChatService.p(ani, a.q.U());
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        obj = new ioi();
        k = ((bnd) (obj3)).i.b;
        j = ((flag) ? 1 : 0);
        k;
        JVM INSTR tableswitch 0 17: default 364
    //                   0 465
    //                   1 471
    //                   2 465
    //                   3 465
    //                   4 465
    //                   5 465
    //                   6 477
    //                   7 453
    //                   8 396
    //                   9 459
    //                   10 364
    //                   11 364
    //                   12 364
    //                   13 364
    //                   14 364
    //                   15 364
    //                   16 364
    //                   17 396;
           goto _L6 _L7 _L8 _L7 _L7 _L7 _L7 _L9 _L10 _L11 _L12 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L11
_L9:
        break MISSING_BLOCK_LABEL_477;
_L11:
        break; /* Loop/switch isn't completed */
_L6:
        ebw.f("Babel_calls", (new StringBuilder(54)).append("Unknown connectivity manager network type: ").append(k).toString());
        j = ((flag) ? 1 : 0);
_L14:
        obj.a = Integer.valueOf(j);
        obj.b = Integer.valueOf(((bnd) (obj3)).i.c);
        obj.c = Long.valueOf(((bnd) (obj3)).i.d);
        obj.d = Long.valueOf(((bnd) (obj3)).i.e);
          goto _L13
_L10:
        j = 4;
          goto _L14
_L12:
        j = 1;
          goto _L14
_L7:
        j = 5;
          goto _L14
_L8:
        j = 2;
          goto _L14
        j = 3;
          goto _L14
    }

    public void b(gjr gjr1)
    {
        gbh.a(a.k.containsKey(gjr1.a()));
        if (gjr1.g())
        {
            a.o = null;
        }
        a.k.remove(gjr1.a());
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bnk)iterator.next()).b(gjr1)) { }
    }

    public void c(gjr gjr1)
    {
        gbh.a(a.k.containsKey(gjr1.a()));
        a.k.put(gjr1.a(), gjr1);
        if (gjr1.k())
        {
            a.l = gjr1;
        }
        if (gjr1.g())
        {
            a.m = gjr1.d();
            a.o = gjr1;
        }
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bnk)iterator.next()).c(gjr1)) { }
    }

    public void d(gjr gjr1)
    {
        a.l = gjr1;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bnk)iterator.next()).d(gjr1)) { }
    }
}
