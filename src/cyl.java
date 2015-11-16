// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cyl extends cvn
{

    private static final long serialVersionUID = 1L;
    private String g[];

    private cyl(izk izk1)
    {
        super(izk1.responseHeader, -1L);
        g = new String[izk1.a.length];
        for (int i = 0; i < g.length; i++)
        {
            g[i] = izk1.a[i].b;
        }

        if (ebw.a("Babel", 3))
        {
            String s = String.valueOf("UndismissSuggestedContactsResponse debugUrl: ");
            izk1 = String.valueOf(izk1.responseHeader.c);
            if (izk1.length() != 0)
            {
                izk1 = s.concat(izk1);
            } else
            {
                izk1 = new String(s);
            }
            ebw.d("Babel", izk1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (izk)kop.mergeFrom(new izk(), abyte0);
        if (a(((izk) (abyte0)).responseHeader))
        {
            return new cvz(((izk) (abyte0)).responseHeader);
        } else
        {
            return new cyl(abyte0);
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
        aoe1.G(dfb[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        aoe1.b();
        aoe1.c();
        ank.b(g.nS, aoe1.f().h(), "hash_dismissed_contacts");
        RealTimeChatService.a(aoe1.f().h(), true);
        return;
        dfb;
        aoe1.c();
        throw dfb;
    }
}
