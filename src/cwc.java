// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public class cwc extends cvn
{

    private static final long serialVersionUID = 1L;
    private String g;
    private String h;
    private long i;

    private cwc(htj htj1)
    {
        int j;
        j = 0;
        super(htj1.apiHeader);
        g = null;
        h = null;
        i = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10L);
        htj1 = htj1.a.b;
        if (htj1 == null || htj1.length <= 0) goto _L2; else goto _L1
_L1:
        htj1 = htj1[0];
        if (htj1 == null || g.a(((kdz) (htj1)).d.a, 0) != 3) goto _L2; else goto _L3
_L3:
        kcr kcr1 = ((kdz) (htj1)).b;
        if (kcr1 == null || kcr1.a == null) goto _L2; else goto _L4
_L4:
        h = kcr1.a;
        htj1 = ((kdz) (htj1)).d.d;
        if (g.a(((jxy) (htj1)).a, 0) != 3) goto _L2; else goto _L5
_L5:
        htj1 = ((jxy) (htj1)).c;
        if (htj1 == null) goto _L2; else goto _L6
_L6:
        htj1 = ((jxz) (htj1)).b;
        if (htj1 == null || htj1.length <= 0) goto _L2; else goto _L7
_L7:
        int k = htj1.length;
_L13:
        if (j >= k) goto _L2; else goto _L8
_L8:
        kcr1 = htj1[j];
        if (kcr1 == null || ((jya) (kcr1)).b == null) goto _L10; else goto _L9
_L9:
        g = ((jya) (kcr1)).b;
        try
        {
            htj1 = Uri.parse(g).getQueryParameter("expire");
        }
        // Misplaced declaration of an exception variable
        catch (htj htj1)
        {
            htj1 = String.valueOf(htj1.getClass().getCanonicalName());
            String s = g;
            ebw.f("Babel", (new StringBuilder(String.valueOf(htj1).length() + 42 + String.valueOf(s).length())).append(htj1).append(" exception while parsing audio url. url = ").append(s).toString());
            return;
        }
        if (htj1 == null) goto _L2; else goto _L11
_L11:
        i = Long.parseLong(htj1) * 1000L;
_L2:
        return;
_L10:
        j++;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (htj)kop.mergeFrom(new htj(), abyte0);
        if (a(((htj) (abyte0)).apiHeader))
        {
            return new cvz(((htj) (abyte0)).apiHeader);
        } else
        {
            return new cwc(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        if (cvn.a)
        {
            dfb = h;
            String s = g;
            long l = i;
            ebw.b("Babel", (new StringBuilder(String.valueOf(dfb).length() + 121 + String.valueOf(s).length())).append("GetAudioDataResponse.processResponse: retrieved audio with id ").append(dfb).append(" with stream url of ").append(s).append(" and expiration of ").append(l).toString());
        }
        if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(g))
        {
            aoe1.a(h, g, i);
            any.d(aoe1, aoe1.ad(h));
        }
    }
}
