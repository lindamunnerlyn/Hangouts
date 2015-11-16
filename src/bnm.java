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

final class bnm extends gmo
{

    final bnk a;

    bnm(bnk bnk1)
    {
        a = bnk1;
        super();
    }

    public void a(int i)
    {
        a.q.removeCallbacks(a.b);
        if (a.r != null)
        {
            boi.a(a.c, a.r.e(), i, false);
            geu geu1 = a.r.q();
            a.a(geu1);
        }
        bnk bnk1 = a;
        if (bnk1.p != null)
        {
            bnk1.p.b();
        }
        bnk1.p = null;
        bnk1.l = null;
        bnk1.m = true;
        bnk1.n = true;
        bnk1.f = null;
        bnk1.h = null;
        bnk1.k.clear();
        bnk1.d.clear();
        bnk1.o = null;
        bnk1.j = null;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).a(i)) { }
    }

    public void a(gms gms)
    {
        a.f = gms;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).a(gms)) { }
    }

    public void a(gmt gmt1)
    {
        if (a.k.containsKey(gmt1.a()))
        {
            Object obj = String.valueOf(gmt1.toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "Map dup: already has participant: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Map dup: already has participant: ");
            }
            eev.g("Babel_calls", ((String) (obj)));
            String s;
            Object obj1;
            for (obj = a.k.entrySet().iterator(); ((Iterator) (obj)).hasNext(); eev.g("Babel_calls", (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(obj1).length())).append("Map dup: key=").append(s).append(" value=").append(((String) (obj1))).toString()))
            {
                obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                s = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = String.valueOf(((gmt)((java.util.Map.Entry) (obj1)).getValue()).toString());
            }

            gdv.a("Map dup: already has participant");
        }
        if (gmt1.g())
        {
            a.o = gmt1;
        }
        a.k.put(gmt1.a(), gmt1);
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).a(gmt1)) { }
    }

    public void a(gmu gmu)
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).a(gmu)) { }
    }

    public void a(itz itz)
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).a(itz)) { }
    }

    public void a(jjt jjt1)
    {
        Object obj2;
        boolean flag;
        flag = false;
        obj2 = null;
        g.b(2677);
        if (a.r != null) goto _L2; else goto _L1
_L1:
        g.b(2011);
_L5:
        return;
_L2:
        Object obj1;
        aoa aoa;
        geu geu1;
        android.content.Context context = g.nU;
        aoa = a.r.k();
        if (dcn.f(aoa))
        {
            g.b(2589);
        }
        geu1 = a.r.q();
        int i = geu1.p();
        if (i == 19 || i == 26)
        {
            g.b(2012);
            return;
        }
        obj1 = a;
        if (((bnk) (obj1)).i != null) goto _L4; else goto _L3
_L3:
        Object obj = null;
_L13:
        jjt1.l = ((iun) (obj));
        if (jjt1.k != null)
        {
            obj = a.r.U();
            int j;
            int k;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((cfz) (obj)).f();
            }
            if (obj != null)
            {
                iuo iuo1 = jjt1.k.c;
                obj1 = iuo1;
                if (iuo1 == null)
                {
                    obj1 = new iuo();
                    jjt1.k.c = ((iuo) (obj1));
                }
                obj1.b = new iup();
                ((iuo) (obj1)).b.a = ((String) (obj));
            }
        }
        if (jjt1.f == null)
        {
            obj = obj2;
        } else
        {
            obj = jjt1.f.a;
        }
        RealTimeChatService.a(aoa, ((String) (obj)), jjt1);
        if (!geu1.d())
        {
            g.b(2177);
        } else
        {
            g.b(2176);
            if (g.c(aoa))
            {
                jjt1 = g.a(g.nU, "babel_hangout_upload_end_causes", "6,10,29,47").split(",");
                String s = Integer.toString(geu1.s());
                if (Arrays.asList(jjt1).contains(s))
                {
                    a.r.f("");
                }
            }
        }
        if (a.r.S())
        {
            RealTimeChatService.p(aoa, a.r.T());
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        obj = new iun();
        k = ((bnk) (obj1)).i.b;
        j = ((flag) ? 1 : 0);
        k;
        JVM INSTR tableswitch 0 17: default 368
    //                   0 466
    //                   1 472
    //                   2 466
    //                   3 466
    //                   4 466
    //                   5 466
    //                   6 478
    //                   7 454
    //                   8 400
    //                   9 460
    //                   10 368
    //                   11 368
    //                   12 368
    //                   13 368
    //                   14 368
    //                   15 368
    //                   16 368
    //                   17 400;
           goto _L6 _L7 _L8 _L7 _L7 _L7 _L7 _L9 _L10 _L11 _L12 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L11
_L9:
        break MISSING_BLOCK_LABEL_478;
_L11:
        break; /* Loop/switch isn't completed */
_L6:
        eev.f("Babel_calls", (new StringBuilder(54)).append("Unknown connectivity manager network type: ").append(k).toString());
        j = ((flag) ? 1 : 0);
_L14:
        obj.a = Integer.valueOf(j);
        obj.b = Integer.valueOf(((bnk) (obj1)).i.c);
        obj.c = Long.valueOf(((bnk) (obj1)).i.d);
        obj.d = Long.valueOf(((bnk) (obj1)).i.e);
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

    public void b(gmt gmt1)
    {
        gdv.a("Expected condition to be true", a.k.containsKey(gmt1.a()));
        if (gmt1.g())
        {
            a.o = null;
        }
        a.k.remove(gmt1.a());
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).b(gmt1)) { }
    }

    public void c(gmt gmt1)
    {
        gdv.a("Expected condition to be true", a.k.containsKey(gmt1.a()));
        a.k.put(gmt1.a(), gmt1);
        if (gmt1.k())
        {
            a.l = gmt1;
        }
        if (gmt1.g())
        {
            a.m = gmt1.d();
            a.o = gmt1;
        }
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).c(gmt1)) { }
    }

    public void d(gmt gmt1)
    {
        a.l = gmt1;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).d(gmt1)) { }
    }
}
