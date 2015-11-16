// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public class cyg extends cxr
{

    private static final long serialVersionUID = 1L;
    private String g;
    private String h;
    private long i;

    private cyg(hyn hyn1)
    {
        int j;
        j = 0;
        super(hyn1.apiHeader);
        g = null;
        h = null;
        i = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10L);
        hyn1 = hyn1.a.b;
        if (hyn1 == null || hyn1.length <= 0) goto _L2; else goto _L1
_L1:
        hyn1 = hyn1[0];
        if (hyn1 == null || g.a(((kmc) (hyn1)).d.a, 0) != 3) goto _L2; else goto _L3
_L3:
        kku kku1 = ((kmc) (hyn1)).b;
        if (kku1 == null || kku1.a == null) goto _L2; else goto _L4
_L4:
        h = kku1.a;
        hyn1 = ((kmc) (hyn1)).d.d;
        if (g.a(((kgb) (hyn1)).a, 0) != 3) goto _L2; else goto _L5
_L5:
        hyn1 = ((kgb) (hyn1)).c;
        if (hyn1 == null) goto _L2; else goto _L6
_L6:
        hyn1 = ((kgc) (hyn1)).b;
        if (hyn1 == null || hyn1.length <= 0) goto _L2; else goto _L7
_L7:
        int k = hyn1.length;
_L13:
        if (j >= k) goto _L2; else goto _L8
_L8:
        kku1 = hyn1[j];
        if (kku1 == null || ((kgd) (kku1)).b == null) goto _L10; else goto _L9
_L9:
        g = ((kgd) (kku1)).b;
        try
        {
            hyn1 = Uri.parse(g).getQueryParameter("expire");
        }
        // Misplaced declaration of an exception variable
        catch (hyn hyn1)
        {
            hyn1 = String.valueOf(hyn1.getClass().getCanonicalName());
            String s = g;
            eev.f("Babel", (new StringBuilder(String.valueOf(hyn1).length() + 42 + String.valueOf(s).length())).append(hyn1).append(" exception while parsing audio url. url = ").append(s).toString());
            return;
        }
        if (hyn1 == null) goto _L2; else goto _L11
_L11:
        i = Long.parseLong(hyn1) * 1000L;
_L2:
        return;
_L10:
        j++;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (hyn)kws.mergeFrom(new hyn(), abyte0);
        if (a(((hyn) (abyte0)).apiHeader))
        {
            return new cyd(((hyn) (abyte0)).apiHeader);
        } else
        {
            return new cyg(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        if (cxr.a)
        {
            dgk = h;
            String s = g;
            long l = i;
            eev.b("Babel", (new StringBuilder(String.valueOf(dgk).length() + 121 + String.valueOf(s).length())).append("GetAudioDataResponse.processResponse: retrieved audio with id ").append(dgk).append(" with stream url of ").append(s).append(" and expiration of ").append(l).toString());
        }
        if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(g))
        {
            aow1.a(h, g, i);
            aoq.d(aow1, aow1.ac(h));
        }
    }
}
