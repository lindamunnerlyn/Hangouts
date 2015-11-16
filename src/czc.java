// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class czc extends cxr
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

    czc(lep lep1)
    {
        HashSet hashset = new HashSet(lep1.j.length);
        leu aleu[] = lep1.j;
        int j1 = aleu.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            leu leu1 = aleu[i1];
            if (leu1.a != null)
            {
                hashset.add(leu1.a);
            }
        }

        g = hashset;
        h = g.a(lep1.b, false);
        i = g.a(lep1.c, false);
        j = g.a(lep1.g, false);
        k = g.a(lep1.k, false);
        a(lep1);
        if (lep1.a != null)
        {
            p = lep1.a.c;
            return;
        } else
        {
            p = null;
            return;
        }
    }

    private void a(lep lep1)
    {
        lev alev[];
        int i1;
        int j1;
        if (lep1.h == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        alev = lep1.h;
        j1 = alev.length;
        i1 = 0;
_L4:
label0:
        {
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_171;
            }
            lep1 = alev[i1];
            if (g.a(((lev) (lep1)).a, 0) == 1)
            {
                break label0;
            } else
            {
                i1++;
                continue; /* Loop/switch isn't completed */
            }
        }
_L2:
        if (lep1 != null)
        {
            l = g.a(((lev) (lep1)).b, false);
            if (!l && ((lev) (lep1)).c != null && g.a(((lev) (lep1)).c.a, false) && ((lev) (lep1)).c.b != null)
            {
                m = true;
                lep1 = ((lev) (lep1)).c.b;
                j1 = lep1.length;
                i1 = 0;
                do
                {
                    if (i1 >= j1)
                    {
                        break;
                    }
                    int k1 = g.a(((lex) (lep1[i1])).a, 0);
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
        lep1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static cxr parseFrom(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (lep)kws.mergeFrom(new lep(), abyte0);
            if (abyte0 != null)
            {
                return new czc(abyte0);
            }
        }
        return null;
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        dcn.a(aow1.f(), k(), l(), m(), o(), p(), q(), r(), s(), n());
        for (dgk = hlp.c(g.nU, czd).iterator(); dgk.hasNext(); ((gqz)hlp.a(g.nU, gqz)).b(aow1.f().h()).d())
        {
            dgk.next();
        }

        aow1 = ((gqz)hlp.a(g.nU, gqz)).b(aow1.f().h());
        aow1.c("use_tycho_branding", n());
        aow1.d();
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
