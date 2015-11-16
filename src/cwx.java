// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.concurrent.TimeUnit;

public class cwx extends cvn
{

    private static final SparseBooleanArray i;
    private static final long serialVersionUID = 1L;
    private String g;
    private String h;

    private cwx(htb htb1)
    {
        super(htb1.apiHeader);
        g = null;
        h = null;
        htb1 = htb1.a.a;
        if (htb1 == null) goto _L2; else goto _L1
_L1:
        g = ((hyn) (htb1)).h;
        htb1 = ((hyn) (htb1)).r;
        if (htb1 == null) goto _L2; else goto _L3
_L3:
        int j;
        int k;
        htb1 = ((hyw) (htb1)).c;
        k = htb1.length;
        j = 0;
_L8:
        if (j >= k) goto _L2; else goto _L4
_L4:
        String s;
        int l;
        Object obj = htb1[j];
        s = ((hyx) (obj)).d;
        l = g.a(((hyx) (obj)).a, 0);
        if (TextUtils.isEmpty(s) || !g.a(Boolean.valueOf(i.get(l, false)), false)) goto _L6; else goto _L5
_L5:
        h = s;
_L2:
        return;
_L6:
        j++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (htb)kop.mergeFrom(new htb(), abyte0);
        if (a(((htb) (abyte0)).apiHeader))
        {
            return new cvz(((htb) (abyte0)).apiHeader);
        } else
        {
            return new cwx(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        if (cvn.a)
        {
            dfb = g;
            String s = h;
            ebw.b("Babel", (new StringBuilder(String.valueOf(dfb).length() + 85 + String.valueOf(s).length())).append("GetVideoDataResponse.processResponse: retrieved video with id ").append(dfb).append(" and has stream url of ").append(s).toString());
        }
        if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(h))
        {
            long l = TimeUnit.DAYS.toMillis(20L);
            long l1 = System.currentTimeMillis();
            aoe1.a(g, h, l + l1);
            any.c(aoe1);
        }
    }

    static 
    {
        SparseBooleanArray sparsebooleanarray = new SparseBooleanArray();
        i = sparsebooleanarray;
        sparsebooleanarray.put(18, true);
        i.put(22, true);
        i.put(36, true);
    }
}
