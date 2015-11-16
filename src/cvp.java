// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cvp extends cvy
{

    private static final long serialVersionUID = 1L;
    public final List g;
    private final List j;
    private final long k;

    private cvp(iqf iqf1)
    {
        super(iqf1.responseHeader, g.a(iqf1.b.c, 0L), g.a(iqf1.b.n, 0L), iqf1.b.d);
        j = dae.a(iqf1.a);
        k = g.a(iqf1.b.n, 0L);
        if (iqf1.b.h != null)
        {
            g = g.a(iqf1.b.h.b, null);
        } else
        {
            g = null;
        }
        if (cvn.a)
        {
            iqf1 = String.valueOf(iqf1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iqf1).length() + 21)).append("AddUserResponse from:").append(iqf1).toString());
        }
    }

    private void a(aoe aoe1, String s)
    {
        ArrayList arraylist = new ArrayList(j.size());
        Iterator iterator = j.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dae dae1 = (dae)iterator.next();
            if (dae1.b == 4)
            {
                arraylist.add(g.a(dae1.a.a, dae1.a.b, dae1.a.c, dae1.a.d, null, null, dae1.a.e, null, null, Boolean.valueOf(false)));
                flag = true;
            }
        } while (true);
        if (!flag)
        {
            return;
        } else
        {
            any.a(aoe1, s, arraylist);
            return;
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iqf)kop.mergeFrom(new iqf(), abyte0);
        if (g.a(((iqf) (abyte0)).responseHeader.a, 0) != 4) goto _L2; else goto _L1
_L1:
        Iterator iterator = dae.a(((iqf) (abyte0)).a).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        if (((dae)iterator.next()).b != 4) goto _L5; else goto _L4
_L4:
        boolean flag = true;
_L7:
        if (flag)
        {
            ((iqf) (abyte0)).responseHeader.a = Integer.valueOf(1);
            abyte0.b = new isv();
            long l = System.currentTimeMillis() * 1000L;
            ((iqf) (abyte0)).b.c = Long.valueOf(l);
            ((iqf) (abyte0)).b.n = Long.valueOf(l + 0x141dd76000L);
            return new cvp(abyte0);
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        if (a(((iqf) (abyte0)).responseHeader))
        {
            return new cvz(((iqf) (abyte0)).responseHeader);
        } else
        {
            return new cvp(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        long l;
        super.a(aoe1, dfb);
        if (any.a || cvn.a)
        {
            dfb = String.valueOf("processAddUserResponse ClientContactError Count: ");
            int i = j.size();
            ebw.b("Babel", (new StringBuilder(String.valueOf(dfb).length() + 11)).append(dfb).append(i).toString());
        }
        dfb = ((cts)b).c;
        l = ((cts)b).b;
        aoe1.a();
        if (dfb != null) goto _L2; else goto _L1
_L1:
        String s = String.valueOf("attempt to process invite response for a nonexistant conversation id [");
        ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(dfb).length())).append(s).append(dfb).append("]").toString());
_L3:
        aoe1.b();
        aoe1.c();
        any.c(aoe1, dfb);
        any.d(aoe1);
        a(aoe1, ((String) (dfb)));
        return;
_L2:
        if (g != null)
        {
            for (Iterator iterator = g.iterator(); iterator.hasNext(); aoe1.a(dfb, (cey)iterator.next(), true)) { }
        }
        break MISSING_BLOCK_LABEL_241;
        Exception exception;
        exception;
        aoe1.c();
        any.c(aoe1, dfb);
        any.d(aoe1);
        a(aoe1, ((String) (dfb)));
        throw exception;
        aoe1.a(dfb, l, d, k);
        if (j.size() > 0)
        {
            any.a(aoe1, j, dfb, String.valueOf(d), d, k);
        }
          goto _L3
    }
}
