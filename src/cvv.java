// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvv extends cvn
{

    private static final long serialVersionUID = 1L;
    private String g[];

    private cvv(isi isi1)
    {
        super(isi1.responseHeader, -1L);
        g = new String[isi1.a.length];
        for (int i = 0; i < g.length; i++)
        {
            g[i] = isi1.a[i].b;
        }

        if (ebw.a("Babel", 3))
        {
            String s = String.valueOf("DismissSuggestedContactsResponse debugUrl: ");
            isi1 = String.valueOf(isi1.responseHeader.c);
            if (isi1.length() != 0)
            {
                isi1 = s.concat(isi1);
            } else
            {
                isi1 = new String(s);
            }
            ebw.d("Babel", isi1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (isi)kop.mergeFrom(new isi(), abyte0);
        if (a(((isi) (abyte0)).responseHeader))
        {
            return new cvz(((isi) (abyte0)).responseHeader);
        } else
        {
            return new cvv(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        aoe1.a();
        int j;
        dfb = g;
        j = dfb.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        aoe1.M(dfb[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        aoe1.b();
        aoe1.c();
        ank.b(g.nS, aoe1.f().h(), "hash_people_you_hangout_with");
        ank.b(g.nS, aoe1.f().h(), "hash_favorites");
        return;
        dfb;
        aoe1.c();
        throw dfb;
    }
}
