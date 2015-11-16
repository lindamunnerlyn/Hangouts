// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cyn extends cxr
{

    private static final long serialVersionUID = 1L;
    public byte g[];
    public List h;

    private cyn(jab jab1)
    {
        super(jab1.responseHeader, -1L);
        h = new ArrayList();
        g = jab1.b;
        izp aizp[] = jab1.a;
        int j = aizp.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = aizp[i].a.b;
            h.add(s1);
        }

        if (eev.a("Babel", 3))
        {
            String s = String.valueOf("GetFavoritesResponse debugUrl: ");
            jab1 = String.valueOf(jab1.responseHeader.c);
            if (jab1.length() != 0)
            {
                jab1 = s.concat(jab1);
            } else
            {
                jab1 = new String(s);
            }
            eev.d("Babel", jab1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jab)kws.mergeFrom(new jab(), abyte0);
        if (a(((jab) (abyte0)).responseHeader))
        {
            return new cyd(((jab) (abyte0)).responseHeader);
        } else
        {
            return new cyn(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        dgk = new ArrayList(h.size());
        aow1.a();
        Iterator iterator = h.iterator();
_L2:
        cfz cfz;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_85;
            }
            cfz = aow1.N((String)iterator.next());
        } while (cfz == null);
        dgk.add(cfz);
        if (true) goto _L2; else goto _L1
_L1:
        dgk;
        aow1.c();
        throw dgk;
        aow1.b(dgk, 3);
        aow1.b();
        aow1.c();
        aoc.b(g.nU, aow1.f().h(), "hash_pinned");
        return;
    }
}
