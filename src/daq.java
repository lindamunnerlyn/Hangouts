// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class daq extends cxr
{

    private static final long serialVersionUID = 1L;
    public int g;
    public byte h[];
    public Map i;

    private daq(jfs jfs1)
    {
        int j;
        j = 0;
        super(jfs1.responseHeader, -1L);
        if (jfs1.a == null) goto _L2; else goto _L1
_L1:
        g.a(jfs1.a, 0);
        JVM INSTR tableswitch 0 1: default 52
    //                   0 168
    //                   1 178;
           goto _L3 _L4 _L5
_L3:
        String s = String.valueOf(jfs1.a);
        eev.g("Babel", (new StringBuilder(String.valueOf(s).length() + 57)).append("Unexpected error code for UpdateFavoriteContactResponse: ").append(s).toString());
_L2:
        h = jfs1.c;
        i = new HashMap();
        izp aizp[] = jfs1.b;
        for (int k = aizp.length; j < k; j++)
        {
            izp izp1 = aizp[j];
            String s2 = izp1.a.b;
            i.put(s2, izp1.c);
        }

        break; /* Loop/switch isn't completed */
_L4:
        g = dar.a;
        continue; /* Loop/switch isn't completed */
_L5:
        g = dar.b;
        if (true) goto _L2; else goto _L6
_L6:
        if (eev.a("Babel", 3))
        {
            String s1 = String.valueOf("UpdateFavoriteContactResponse debugUrl: ");
            jfs1 = String.valueOf(jfs1.responseHeader.c);
            if (jfs1.length() != 0)
            {
                jfs1 = s1.concat(jfs1);
            } else
            {
                jfs1 = new String(s1);
            }
            eev.d("Babel", jfs1);
        }
        return;
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jfs)kws.mergeFrom(new jfs(), abyte0);
        if (a(((jfs) (abyte0)).responseHeader))
        {
            return new cyd(((jfs) (abyte0)).responseHeader);
        } else
        {
            return new daq(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        aow1.a();
        cxn cxn1;
        Iterator iterator;
        dgk = aow1.q();
        cxn1 = (cxn)b;
        iterator = cxn1.r().iterator();
_L3:
        cfz cfz;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_114;
            }
            cfz = aow1.N((String)iterator.next());
        } while (cfz == null);
        if (!cxn1.q()) goto _L2; else goto _L1
_L1:
        dgk.remove(cfz);
          goto _L3
        dgk;
        aow1.c();
        throw dgk;
_L2:
        if (dgk.contains(cfz)) goto _L3; else goto _L4
_L4:
        dgk.add(0, cfz);
          goto _L3
        aow1.b(dgk, 3);
        aow1.b();
        aow1.c();
        aoc.b(g.nU, aow1.f().h(), "hash_pinned");
        return;
    }
}
