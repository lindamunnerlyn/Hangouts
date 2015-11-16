// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.concurrent.TimeUnit;

public class czb extends cxr
{

    private static final SparseBooleanArray i;
    private static final long serialVersionUID = 1L;
    private String g;
    private String h;

    private czb(hyf hyf1)
    {
        super(hyf1.apiHeader);
        g = null;
        h = null;
        hyf1 = hyf1.a.a;
        if (hyf1 == null) goto _L2; else goto _L1
_L1:
        g = ((idr) (hyf1)).h;
        hyf1 = ((idr) (hyf1)).r;
        if (hyf1 == null) goto _L2; else goto _L3
_L3:
        int j;
        int k;
        hyf1 = ((iea) (hyf1)).c;
        k = hyf1.length;
        j = 0;
_L8:
        if (j >= k) goto _L2; else goto _L4
_L4:
        String s;
        int l;
        Object obj = hyf1[j];
        s = ((ieb) (obj)).d;
        l = g.a(((ieb) (obj)).a, 0);
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

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (hyf)kws.mergeFrom(new hyf(), abyte0);
        if (a(((hyf) (abyte0)).apiHeader))
        {
            return new cyd(((hyf) (abyte0)).apiHeader);
        } else
        {
            return new czb(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        if (cxr.a)
        {
            dgk = g;
            String s = h;
            eev.b("Babel", (new StringBuilder(String.valueOf(dgk).length() + 85 + String.valueOf(s).length())).append("GetVideoDataResponse.processResponse: retrieved video with id ").append(dgk).append(" and has stream url of ").append(s).toString());
        }
        if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(h))
        {
            long l = TimeUnit.DAYS.toMillis(20L);
            long l1 = System.currentTimeMillis();
            aow1.a(g, h, l + l1);
            aoq.c(aow1);
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
