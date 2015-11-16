// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class cyx extends cxr
{

    private static final long serialVersionUID = 1L;
    private List g;
    private byte h[];
    private boolean i;
    private List j;
    private byte k[];
    private boolean l;
    private List m;
    private transient jak n;
    private byte o[];
    private boolean p;
    private List q;
    private byte r[];
    private boolean s;
    private List t;
    private byte u[];
    private boolean v;

    private cyx(jai jai1)
    {
label0:
        {
            boolean flag1 = false;
            super(jai1.responseHeader, -1L);
            boolean flag;
            if (jai1.c == null || g.a(jai1.c.a, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = flag;
            if (!i)
            {
                h = jai1.c.b;
                g = g.a(jai1.c.c);
            } else
            {
                h = null;
                g = null;
            }
            if (jai1.d == null || g.a(jai1.d.a, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = flag;
            if (!l)
            {
                k = jai1.d.b;
                j = g.a(jai1.d.c);
            } else
            {
                k = null;
                j = null;
            }
            if (jai1.e == null || g.a(jai1.e.a, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p = flag;
            if (!p)
            {
                o = jai1.e.b;
                m = g.a(jai1.e.c);
            } else
            {
                o = null;
                m = null;
            }
            n = jai1.e;
            if (jai1.f == null || g.a(jai1.f.a, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s = flag;
            if (!s)
            {
                r = jai1.f.b;
                q = g.a(jai1.f.c);
            } else
            {
                r = null;
                q = null;
            }
            if (jai1.h != null)
            {
                flag = flag1;
                if (!g.a(jai1.h.a, false))
                {
                    break label0;
                }
            }
            flag = true;
        }
        v = flag;
        if (!v)
        {
            u = jai1.h.b;
            t = g.a(jai1.h.c);
        } else
        {
            u = null;
            t = null;
        }
        if (cxr.a)
        {
            jai1 = String.valueOf(jai1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jai1).length() + 34)).append("GetSuggestedEntitiesResponse from:").append(jai1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jai)kws.mergeFrom(new jai(), abyte0);
        if (a(((jai) (abyte0)).responseHeader))
        {
            return new cyd(((jai) (abyte0)).responseHeader);
        } else
        {
            return new cyx(abyte0);
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        n = (jak)kws.mergeFrom(new jak(), (byte[])objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(kws.toByteArray(n));
    }

    public void a(aow aow1, dgk dgk)
    {
        Object obj1;
        int i1;
        i1 = 0;
        super.a(aow1, dgk);
        aow1.f().h();
        obj1 = n.c;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        dgk = null;
_L26:
        Object obj;
        if (dgk != null && dgk.size() > 0 && (bwe)hlp.b(g.nU, bwe) != null)
        {
            dgk = g.nU;
        }
        obj = ((gqz)hlp.a(g.nU, gqz)).b(aow1.f().h());
        aow1.a();
        if (i) goto _L4; else goto _L3
_L3:
        aow1.b(g, 3);
        aoc.a(((grd) (obj)), "hash_pinned", h);
        if (!cxr.a) goto _L6; else goto _L5
_L5:
        i1 = g.size();
        eev.b("Babel", (new StringBuilder(23)).append("Pinned size:").append(i1).toString());
        dgk = String.valueOf(Arrays.toString(h));
        if (dgk.length() == 0) goto _L8; else goto _L7
_L7:
        dgk = "Set hash for pinned:".concat(dgk);
_L28:
        eev.b("Babel", dgk);
_L6:
        if (l) goto _L10; else goto _L9
_L9:
        aow1.b(j, 0);
        aoc.a(((grd) (obj)), "hash_favorites", k);
        if (!cxr.a) goto _L12; else goto _L11
_L11:
        i1 = j.size();
        eev.b("Babel", (new StringBuilder(26)).append("Favorites size:").append(i1).toString());
        dgk = String.valueOf(Arrays.toString(k));
        if (dgk.length() == 0) goto _L14; else goto _L13
_L13:
        dgk = "Set hash for favorites:".concat(dgk);
_L29:
        eev.b("Babel", dgk);
_L12:
        if (p) goto _L16; else goto _L15
_L15:
        aow1.b(m, 1);
        aoc.a(((grd) (obj)), "hash_people_you_hangout_with", o);
        if (!cxr.a) goto _L18; else goto _L17
_L17:
        i1 = m.size();
        eev.b("Babel", (new StringBuilder(42)).append("Contacts you hangout with size:").append(i1).toString());
        dgk = String.valueOf(Arrays.toString(o));
        if (dgk.length() == 0) goto _L20; else goto _L19
_L19:
        dgk = "Set hash for people you hangout with:".concat(dgk);
_L30:
        eev.b("Babel", dgk);
_L18:
        if (s)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        aow1.b(q, 2);
        aoc.a(((grd) (obj)), "hash_other_people_on_hangout", r);
        if (!cxr.a) goto _L22; else goto _L21
_L21:
        i1 = q.size();
        eev.b("Babel", (new StringBuilder(43)).append("Other contacts on hangouts size:").append(i1).toString());
        dgk = String.valueOf(Arrays.toString(r));
        if (dgk.length() == 0) goto _L24; else goto _L23
_L23:
        dgk = "Set hash for other contacts on hangouts:".concat(dgk);
_L31:
        eev.b("Babel", dgk);
_L22:
        if (v)
        {
            break MISSING_BLOCK_LABEL_841;
        }
        aow1.o();
        for (dgk = t.iterator(); dgk.hasNext(); aow1.a(((cfz) (obj1)).b.a, ((cfz) (obj1)).e, ((cfz) (obj1)).h))
        {
            obj1 = (cfz)dgk.next();
        }

        break MISSING_BLOCK_LABEL_723;
        dgk;
        aow1.c();
        throw dgk;
_L2:
        int k1;
        obj = new ArrayList();
        k1 = obj1.length;
_L27:
        dgk = ((dgk) (obj));
        if (i1 >= k1) goto _L26; else goto _L25
_L25:
        ((List) (obj)).add(((jaj) (obj1[i1])).a);
        i1++;
          goto _L27
          goto _L26
_L8:
        dgk = new String("Set hash for pinned:");
          goto _L28
_L4:
        eev.a("Babel", "Hash matched for pinned. Skip updating");
          goto _L6
_L14:
        dgk = new String("Set hash for favorites:");
          goto _L29
_L10:
        eev.a("Babel", "Hash matched for favorites. Skip updating");
          goto _L12
_L20:
        dgk = new String("Set hash for people you hangout with:");
          goto _L30
_L16:
        eev.a("Babel", "Hash matched for people you hangout with. Skip updating");
          goto _L18
_L24:
        dgk = new String("Set hash for other contacts on hangouts:");
          goto _L31
        eev.a("Babel", "Hash matched for other contacts on hangouts. Skip updating");
          goto _L22
        aoc.a(((grd) (obj)), "hash_dismissed_contacts", u);
        if (!cxr.a) goto _L33; else goto _L32
_L32:
        int j1 = t.size();
        eev.b("Babel", (new StringBuilder(35)).append("Dismissed contacts size:").append(j1).toString());
        dgk = String.valueOf(Arrays.toString(u));
        if (dgk.length() == 0) goto _L35; else goto _L34
_L34:
        dgk = "Set hash for dismissed contacts:".concat(dgk);
_L36:
        eev.b("Babel", dgk);
_L33:
        aow1.b();
        ((grd) (obj)).d();
        aow1.c();
        return;
_L35:
        dgk = new String("Set hash for dismissed contacts:");
          goto _L36
        eev.a("Babel", "Hash matched for dismissed contacts. Skip updating");
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
