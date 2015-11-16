// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class cym extends cvn
{

    private static final long serialVersionUID = 1L;
    public int g;
    public byte h[];
    public Map i;

    private cym(izn izn1)
    {
        int j;
        j = 0;
        super(izn1.responseHeader, -1L);
        if (izn1.a == null) goto _L2; else goto _L1
_L1:
        g.a(izn1.a, 0);
        JVM INSTR tableswitch 0 1: default 52
    //                   0 168
    //                   1 178;
           goto _L3 _L4 _L5
_L3:
        String s = String.valueOf(izn1.a);
        ebw.g("Babel", (new StringBuilder(String.valueOf(s).length() + 57)).append("Unexpected error code for UpdateFavoriteContactResponse: ").append(s).toString());
_L2:
        h = izn1.c;
        i = new HashMap();
        itk aitk[] = izn1.b;
        for (int k = aitk.length; j < k; j++)
        {
            itk itk1 = aitk[j];
            String s2 = itk1.a.b;
            i.put(s2, itk1.c);
        }

        break; /* Loop/switch isn't completed */
_L4:
        g = cyn.a;
        continue; /* Loop/switch isn't completed */
_L5:
        g = cyn.b;
        if (true) goto _L2; else goto _L6
_L6:
        if (ebw.a("Babel", 3))
        {
            String s1 = String.valueOf("UpdateFavoriteContactResponse debugUrl: ");
            izn1 = String.valueOf(izn1.responseHeader.c);
            if (izn1.length() != 0)
            {
                izn1 = s1.concat(izn1);
            } else
            {
                izn1 = new String(s1);
            }
            ebw.d("Babel", izn1);
        }
        return;
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (izn)kop.mergeFrom(new izn(), abyte0);
        if (a(((izn) (abyte0)).responseHeader))
        {
            return new cvz(((izn) (abyte0)).responseHeader);
        } else
        {
            return new cym(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        aoe1.a();
        cvj cvj1;
        Iterator iterator;
        dfb = aoe1.q();
        cvj1 = (cvj)b;
        iterator = cvj1.s().iterator();
_L3:
        ceu ceu;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_114;
            }
            ceu = aoe1.N((String)iterator.next());
        } while (ceu == null);
        if (!cvj1.r()) goto _L2; else goto _L1
_L1:
        dfb.remove(ceu);
          goto _L3
        dfb;
        aoe1.c();
        throw dfb;
_L2:
        if (dfb.contains(ceu)) goto _L3; else goto _L4
_L4:
        dfb.add(0, ceu);
          goto _L3
        aoe1.b(dfb, 3);
        aoe1.b();
        aoe1.c();
        ank.b(g.nS, aoe1.f().h(), "hash_pinned");
        return;
    }
}
