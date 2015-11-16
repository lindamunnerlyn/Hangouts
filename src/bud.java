// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class bud extends gbb
{

    final btz a;

    bud(btz btz1)
    {
        a = btz1;
        super();
    }

    public void a()
    {
        btz.a(a, true);
        Iterator iterator = btz.b(a).b().values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            jba jba1 = (jba)iterator.next();
            if (g.a(jba1.q, 0) == 10)
            {
                btz.c(a).put(jba1.b, jba1);
            }
        } while (true);
        btz.a(a, btz.b(a).a());
        gbh.b(btz.d(a));
        btz.e(a);
        ebw.c("Babel", String.format("Found %d pending knocks on collection synced", new Object[] {
            Integer.valueOf(btz.c(a).size())
        }));
        btz.f(a);
    }

    public void a(kop kop)
    {
        kop = (jba)kop;
        if (!btz.g(a)) goto _L2; else goto _L1
_L1:
        String s = ((jba) (kop)).b;
        g.a(((jba) (kop)).q, 0);
        JVM INSTR tableswitch 10 12: default 56
    //                   10 57
    //                   11 125
    //                   12 98;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        ebw.c("Babel", String.format("New knocker (%s)", new Object[] {
            s
        }));
        btz.c(a).put(s, kop);
        btz.f(a);
        return;
_L5:
        ebw.c("Babel", String.format("Knock accepted (%s)", new Object[] {
            s
        }));
        btz.b(a, kop);
        return;
_L4:
        ebw.c("Babel", String.format("Knock rejected (%s)", new Object[] {
            s
        }));
        btz.c(a, kop);
        return;
    }

    public void a(kop kop, kop kop1)
    {
        String s;
        int i;
        int j;
        kop = (jba)kop;
        kop1 = (jba)kop1;
        s = ((jba) (kop1)).b;
        i = g.a(((jba) (kop1)).q, 0);
        j = g.a(((jba) (kop)).q, 0);
        if (btz.d(a) != null && TextUtils.equals(s, btz.d(a).b))
        {
            btz.a(a, kop1);
            btz.e(a);
        }
        i;
        JVM INSTR tableswitch 10 12: default 108
    //                   10 132
    //                   11 199
    //                   12 162;
           goto _L1 _L2 _L3 _L4
_L1:
        if (btz.c(a).remove(s) != null)
        {
            btz.f(a);
        }
_L6:
        return;
_L2:
        if (j != 10)
        {
            btz.c(a).put(s, kop1);
            btz.f(a);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == 10)
        {
            btz.c(a).remove(s);
            btz.f(a);
            btz.b(a, kop1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (j == 10)
        {
            btz.c(a).remove(s);
            btz.f(a);
            btz.c(a, kop1);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void b(kop kop)
    {
        kop = ((jba)kop).b;
        if (btz.d(a) != null && TextUtils.equals(kop, btz.d(a).b))
        {
            btz.a(a, null);
            btz.e(a);
        }
        if (btz.c(a).remove(kop) != null)
        {
            btz.f(a);
        }
    }
}
