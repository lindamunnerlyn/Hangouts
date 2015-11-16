// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class cwy extends cvn
{

    private static final long serialVersionUID = 1L;
    private final Set g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final String p;

    cwy(kwm kwm1)
    {
        HashSet hashset = new HashSet(kwm1.j.length);
        kwr akwr[] = kwm1.j;
        int j1 = akwr.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            kwr kwr1 = akwr[i1];
            if (kwr1.a != null)
            {
                hashset.add(kwr1.a);
            }
        }

        g = hashset;
        h = g.a(kwm1.b, false);
        i = g.a(kwm1.c, false);
        j = g.a(kwm1.g, false);
        k = g.a(kwm1.k, false);
        a(kwm1);
        if (kwm1.a != null)
        {
            p = kwm1.a.c;
            return;
        } else
        {
            p = null;
            return;
        }
    }

    private void a(kwm kwm1)
    {
        kws akws[];
        int i1;
        int j1;
        if (kwm1.h == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        akws = kwm1.h;
        j1 = akws.length;
        i1 = 0;
_L4:
label0:
        {
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_171;
            }
            kwm1 = akws[i1];
            if (g.a(((kws) (kwm1)).a, 0) == 1)
            {
                break label0;
            } else
            {
                i1++;
                continue; /* Loop/switch isn't completed */
            }
        }
_L2:
        if (kwm1 != null)
        {
            l = g.a(((kws) (kwm1)).b, false);
            if (!l && ((kws) (kwm1)).c != null && g.a(((kws) (kwm1)).c.a, false) && ((kws) (kwm1)).c.b != null)
            {
                m = true;
                kwm1 = ((kws) (kwm1)).c.b;
                j1 = kwm1.length;
                i1 = 0;
                do
                {
                    if (i1 >= j1)
                    {
                        break;
                    }
                    int k1 = g.a(((kwu) (kwm1[i1])).a, 0);
                    if (k1 == 2)
                    {
                        n = true;
                    } else
                    if (k1 == 1)
                    {
                        o = true;
                    }
                    i1++;
                } while (true);
            }
        }
        return;
        kwm1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static cvn parseFrom(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (kwm)kop.mergeFrom(new kwm(), abyte0);
            if (abyte0 != null)
            {
                return new cwy(abyte0);
            }
        }
        return null;
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        dbf.a(aoe1.f(), k(), l(), m(), o(), p(), q(), r(), s(), n());
        for (dfb = hgx.c(g.nS, cwz).iterator(); dfb.hasNext(); ((gms)hgx.a(g.nS, gms)).b(aoe1.f().h()).d())
        {
            dfb.next();
        }

        aoe1 = ((gms)hgx.a(g.nS, gms)).b(aoe1.f().h());
        aoe1.c("use_tycho_branding", n());
        aoe1.d();
    }

    public boolean k()
    {
        return h;
    }

    public boolean l()
    {
        return i;
    }

    public boolean m()
    {
        return j;
    }

    public boolean n()
    {
        return k;
    }

    public String o()
    {
        return p;
    }

    public boolean p()
    {
        return l;
    }

    public boolean q()
    {
        return m;
    }

    public boolean r()
    {
        return n;
    }

    public boolean s()
    {
        return o;
    }
}
