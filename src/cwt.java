// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class cwt extends cvn
{

    private static final long serialVersionUID = 1L;
    private List g;
    private byte h[];
    private boolean i;
    private List j;
    private byte k[];
    private boolean l;
    private List m;
    private transient iuf n;
    private byte o[];
    private boolean p;
    private List q;
    private byte r[];
    private boolean s;
    private List t;
    private byte u[];
    private boolean v;

    private cwt(iud iud1)
    {
label0:
        {
            boolean flag1 = false;
            super(iud1.responseHeader, -1L);
            boolean flag;
            if (iud1.c == null || g.a(iud1.c.a, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = flag;
            if (!i)
            {
                h = iud1.c.b;
                g = g.a(iud1.c.c);
            } else
            {
                h = null;
                g = null;
            }
            if (iud1.d == null || g.a(iud1.d.a, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = flag;
            if (!l)
            {
                k = iud1.d.b;
                j = g.a(iud1.d.c);
            } else
            {
                k = null;
                j = null;
            }
            if (iud1.e == null || g.a(iud1.e.a, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p = flag;
            if (!p)
            {
                o = iud1.e.b;
                m = g.a(iud1.e.c);
            } else
            {
                o = null;
                m = null;
            }
            n = iud1.e;
            if (iud1.f == null || g.a(iud1.f.a, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s = flag;
            if (!s)
            {
                r = iud1.f.b;
                q = g.a(iud1.f.c);
            } else
            {
                r = null;
                q = null;
            }
            if (iud1.h != null)
            {
                flag = flag1;
                if (!g.a(iud1.h.a, false))
                {
                    break label0;
                }
            }
            flag = true;
        }
        v = flag;
        if (!v)
        {
            u = iud1.h.b;
            t = g.a(iud1.h.c);
        } else
        {
            u = null;
            t = null;
        }
        if (cvn.a)
        {
            iud1 = String.valueOf(iud1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iud1).length() + 34)).append("GetSuggestedEntitiesResponse from:").append(iud1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iud)kop.mergeFrom(new iud(), abyte0);
        if (a(((iud) (abyte0)).responseHeader))
        {
            return new cvz(((iud) (abyte0)).responseHeader);
        } else
        {
            return new cwt(abyte0);
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        n = (iuf)kop.mergeFrom(new iuf(), (byte[])objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(kop.toByteArray(n));
    }

    public void a(aoe aoe1, dfb dfb)
    {
        Object obj1;
        int i1;
        i1 = 0;
        super.a(aoe1, dfb);
        aoe1.f().h();
        obj1 = n.c;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        dfb = null;
_L26:
        Object obj;
        if (dfb != null && dfb.size() > 0 && (bvr)hgx.b(g.nS, bvr) != null)
        {
            dfb = g.nS;
        }
        obj = ((gms)hgx.a(g.nS, gms)).b(aoe1.f().h());
        aoe1.a();
        if (i) goto _L4; else goto _L3
_L3:
        aoe1.b(g, 3);
        ank.a(((gmw) (obj)), "hash_pinned", h);
        if (!cvn.a) goto _L6; else goto _L5
_L5:
        i1 = g.size();
        ebw.b("Babel", (new StringBuilder(23)).append("Pinned size:").append(i1).toString());
        dfb = String.valueOf(Arrays.toString(h));
        if (dfb.length() == 0) goto _L8; else goto _L7
_L7:
        dfb = "Set hash for pinned:".concat(dfb);
_L28:
        ebw.b("Babel", dfb);
_L6:
        if (l) goto _L10; else goto _L9
_L9:
        aoe1.b(j, 0);
        ank.a(((gmw) (obj)), "hash_favorites", k);
        if (!cvn.a) goto _L12; else goto _L11
_L11:
        i1 = j.size();
        ebw.b("Babel", (new StringBuilder(26)).append("Favorites size:").append(i1).toString());
        dfb = String.valueOf(Arrays.toString(k));
        if (dfb.length() == 0) goto _L14; else goto _L13
_L13:
        dfb = "Set hash for favorites:".concat(dfb);
_L29:
        ebw.b("Babel", dfb);
_L12:
        if (p) goto _L16; else goto _L15
_L15:
        aoe1.b(m, 1);
        ank.a(((gmw) (obj)), "hash_people_you_hangout_with", o);
        if (!cvn.a) goto _L18; else goto _L17
_L17:
        i1 = m.size();
        ebw.b("Babel", (new StringBuilder(42)).append("Contacts you hangout with size:").append(i1).toString());
        dfb = String.valueOf(Arrays.toString(o));
        if (dfb.length() == 0) goto _L20; else goto _L19
_L19:
        dfb = "Set hash for people you hangout with:".concat(dfb);
_L30:
        ebw.b("Babel", dfb);
_L18:
        if (s)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        aoe1.b(q, 2);
        ank.a(((gmw) (obj)), "hash_other_people_on_hangout", r);
        if (!cvn.a) goto _L22; else goto _L21
_L21:
        i1 = q.size();
        ebw.b("Babel", (new StringBuilder(43)).append("Other contacts on hangouts size:").append(i1).toString());
        dfb = String.valueOf(Arrays.toString(r));
        if (dfb.length() == 0) goto _L24; else goto _L23
_L23:
        dfb = "Set hash for other contacts on hangouts:".concat(dfb);
_L31:
        ebw.b("Babel", dfb);
_L22:
        if (v)
        {
            break MISSING_BLOCK_LABEL_841;
        }
        aoe1.o();
        for (dfb = t.iterator(); dfb.hasNext(); aoe1.a(((ceu) (obj1)).b.a, ((ceu) (obj1)).e, ((ceu) (obj1)).h))
        {
            obj1 = (ceu)dfb.next();
        }

        break MISSING_BLOCK_LABEL_723;
        dfb;
        aoe1.c();
        throw dfb;
_L2:
        int k1;
        obj = new ArrayList();
        k1 = obj1.length;
_L27:
        dfb = ((dfb) (obj));
        if (i1 >= k1) goto _L26; else goto _L25
_L25:
        ((List) (obj)).add(((iue) (obj1[i1])).a);
        i1++;
          goto _L27
          goto _L26
_L8:
        dfb = new String("Set hash for pinned:");
          goto _L28
_L4:
        ebw.a("Babel", "Hash matched for pinned. Skip updating");
          goto _L6
_L14:
        dfb = new String("Set hash for favorites:");
          goto _L29
_L10:
        ebw.a("Babel", "Hash matched for favorites. Skip updating");
          goto _L12
_L20:
        dfb = new String("Set hash for people you hangout with:");
          goto _L30
_L16:
        ebw.a("Babel", "Hash matched for people you hangout with. Skip updating");
          goto _L18
_L24:
        dfb = new String("Set hash for other contacts on hangouts:");
          goto _L31
        ebw.a("Babel", "Hash matched for other contacts on hangouts. Skip updating");
          goto _L22
        ank.a(((gmw) (obj)), "hash_dismissed_contacts", u);
        if (!cvn.a) goto _L33; else goto _L32
_L32:
        int j1 = t.size();
        ebw.b("Babel", (new StringBuilder(35)).append("Dismissed contacts size:").append(j1).toString());
        dfb = String.valueOf(Arrays.toString(u));
        if (dfb.length() == 0) goto _L35; else goto _L34
_L34:
        dfb = "Set hash for dismissed contacts:".concat(dfb);
_L36:
        ebw.b("Babel", dfb);
_L33:
        aoe1.b();
        ((gmw) (obj)).d();
        aoe1.c();
        return;
_L35:
        dfb = new String("Set hash for dismissed contacts:");
          goto _L36
        ebw.a("Babel", "Hash matched for dismissed contacts. Skip updating");
          goto _L33
    }

    public List k()
    {
        return j;
    }

    public List l()
    {
        return m;
    }
}
