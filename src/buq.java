// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class buq extends gdp
{

    final bum a;

    buq(bum bum1)
    {
        a = bum1;
        super();
    }

    public void a()
    {
        bum.a(a, true);
        Iterator iterator = bum.b(a).b().values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            jhh jhh1 = (jhh)iterator.next();
            if (g.a(jhh1.q, 0) == 10)
            {
                bum.c(a).put(jhh1.b, jhh1);
            }
        } while (true);
        bum.a(a, bum.b(a).a());
        gdv.b("Expected non-null", bum.d(a));
        bum.e(a);
        eev.c("Babel", String.format("Found %d pending knocks on collection synced", new Object[] {
            Integer.valueOf(bum.c(a).size())
        }));
        bum.f(a);
    }

    public void a(kws kws)
    {
        kws = (jhh)kws;
        if (!bum.g(a)) goto _L2; else goto _L1
_L1:
        String s = ((jhh) (kws)).b;
        g.a(((jhh) (kws)).q, 0);
        JVM INSTR tableswitch 10 12: default 56
    //                   10 57
    //                   11 125
    //                   12 98;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        eev.c("Babel", String.format("New knocker (%s)", new Object[] {
            s
        }));
        bum.c(a).put(s, kws);
        bum.f(a);
        return;
_L5:
        eev.c("Babel", String.format("Knock accepted (%s)", new Object[] {
            s
        }));
        bum.b(a, kws);
        return;
_L4:
        eev.c("Babel", String.format("Knock rejected (%s)", new Object[] {
            s
        }));
        bum.c(a, kws);
        return;
    }

    public void a(kws kws, kws kws1)
    {
        String s;
        int i;
        int j;
        kws = (jhh)kws;
        kws1 = (jhh)kws1;
        s = ((jhh) (kws1)).b;
        i = g.a(((jhh) (kws1)).q, 0);
        j = g.a(((jhh) (kws)).q, 0);
        if (bum.d(a) != null && TextUtils.equals(s, bum.d(a).b))
        {
            bum.a(a, kws1);
            bum.e(a);
        }
        i;
        JVM INSTR tableswitch 10 12: default 108
    //                   10 132
    //                   11 199
    //                   12 162;
           goto _L1 _L2 _L3 _L4
_L1:
        if (bum.c(a).remove(s) != null)
        {
            bum.f(a);
        }
_L6:
        return;
_L2:
        if (j != 10)
        {
            bum.c(a).put(s, kws1);
            bum.f(a);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == 10)
        {
            bum.c(a).remove(s);
            bum.f(a);
            bum.b(a, kws1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (j == 10)
        {
            bum.c(a).remove(s);
            bum.f(a);
            bum.c(a, kws1);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void b(kws kws)
    {
        kws = ((jhh)kws).b;
        if (bum.d(a) != null && TextUtils.equals(kws, bum.d(a).b))
        {
            bum.a(a, null);
            bum.e(a);
        }
        if (bum.c(a).remove(kws) != null)
        {
            bum.f(a);
        }
    }
}
