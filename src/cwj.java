// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cwj extends cvn
{

    private static final long serialVersionUID = 1L;
    public byte g[];
    public List h;

    private cwj(itw itw1)
    {
        super(itw1.responseHeader, -1L);
        h = new ArrayList();
        g = itw1.b;
        itk aitk[] = itw1.a;
        int j = aitk.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = aitk[i].a.b;
            h.add(s1);
        }

        if (ebw.a("Babel", 3))
        {
            String s = String.valueOf("GetFavoritesResponse debugUrl: ");
            itw1 = String.valueOf(itw1.responseHeader.c);
            if (itw1.length() != 0)
            {
                itw1 = s.concat(itw1);
            } else
            {
                itw1 = new String(s);
            }
            ebw.d("Babel", itw1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (itw)kop.mergeFrom(new itw(), abyte0);
        if (a(((itw) (abyte0)).responseHeader))
        {
            return new cvz(((itw) (abyte0)).responseHeader);
        } else
        {
            return new cwj(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        dfb = new ArrayList(h.size());
        aoe1.a();
        Iterator iterator = h.iterator();
_L2:
        ceu ceu;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_85;
            }
            ceu = aoe1.N((String)iterator.next());
        } while (ceu == null);
        dfb.add(ceu);
        if (true) goto _L2; else goto _L1
_L1:
        dfb;
        aoe1.c();
        throw dfb;
        aoe1.b(dfb, 3);
        aoe1.b();
        aoe1.c();
        ank.b(g.nS, aoe1.f().h(), "hash_pinned");
        return;
    }
}
