// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cxt extends cyc
{

    private static final long serialVersionUID = 1L;
    public final List g;
    private final List j;
    private final long k;

    private cxt(iwk iwk1)
    {
        super(iwk1.responseHeader, g.a(iwk1.b.c, 0L), g.a(iwk1.b.n, 0L), iwk1.b.d);
        j = dbk.a(iwk1.a);
        k = g.a(iwk1.b.n, 0L);
        if (iwk1.b.h != null)
        {
            g = g.a(iwk1.b.h.b, null);
        } else
        {
            g = null;
        }
        if (cxr.a)
        {
            iwk1 = String.valueOf(iwk1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(iwk1).length() + 21)).append("AddUserResponse from:").append(iwk1).toString());
        }
    }

    private void a(aow aow1, String s)
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
            dbk dbk1 = (dbk)iterator.next();
            if (dbk1.b == 4)
            {
                arraylist.add(g.a(dbk1.a.a, dbk1.a.b, dbk1.a.c, dbk1.a.d, null, null, dbk1.a.e, null, null, Boolean.valueOf(false)));
                flag = true;
            }
        } while (true);
        if (!flag)
        {
            return;
        } else
        {
            aoq.a(aow1, s, arraylist);
            return;
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (iwk)kws.mergeFrom(new iwk(), abyte0);
        if (g.a(((iwk) (abyte0)).responseHeader.a, 0) != 4) goto _L2; else goto _L1
_L1:
        Iterator iterator = dbk.a(((iwk) (abyte0)).a).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        if (((dbk)iterator.next()).b != 4) goto _L5; else goto _L4
_L4:
        boolean flag = true;
_L7:
        if (flag)
        {
            ((iwk) (abyte0)).responseHeader.a = Integer.valueOf(1);
            abyte0.b = new iza();
            long l = System.currentTimeMillis() * 1000L;
            ((iwk) (abyte0)).b.c = Long.valueOf(l);
            ((iwk) (abyte0)).b.n = Long.valueOf(l + 0x141dd76000L);
            return new cxt(abyte0);
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        if (a(((iwk) (abyte0)).responseHeader))
        {
            return new cyd(((iwk) (abyte0)).responseHeader);
        } else
        {
            return new cxt(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        long l;
        super.a(aow1, dgk);
        if (aoq.a || cxr.a)
        {
            dgk = String.valueOf("processAddUserResponse ClientContactError Count: ");
            int i = j.size();
            eev.b("Babel", (new StringBuilder(String.valueOf(dgk).length() + 11)).append(dgk).append(i).toString());
        }
        dgk = ((cvw)b).c;
        l = ((cvw)b).b;
        aow1.a();
        if (dgk != null) goto _L2; else goto _L1
_L1:
        String s = String.valueOf("attempt to process invite response for a nonexistant conversation id [");
        eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(dgk).length())).append(s).append(dgk).append("]").toString());
_L3:
        aow1.b();
        aow1.c();
        aoq.c(aow1, dgk);
        aoq.d(aow1);
        a(aow1, ((String) (dgk)));
        return;
_L2:
        if (g != null)
        {
            for (Iterator iterator = g.iterator(); iterator.hasNext(); aow1.a(dgk, (cgd)iterator.next(), true)) { }
        }
        break MISSING_BLOCK_LABEL_241;
        Exception exception;
        exception;
        aow1.c();
        aoq.c(aow1, dgk);
        aoq.d(aow1);
        a(aow1, ((String) (dgk)));
        throw exception;
        aow1.a(dgk, l, d, k);
        if (j.size() > 0)
        {
            aoq.a(aow1, j, dgk, String.valueOf(d), d, k);
        }
          goto _L3
    }
}
