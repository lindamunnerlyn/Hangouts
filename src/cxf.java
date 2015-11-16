// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class cxf extends cvn
{

    private static final long serialVersionUID = 1L;
    private final Map g = new HashMap();

    private cxf(htf htf1)
    {
        super(htf1.apiHeader);
        htf1 = htf1.a.a;
        int j = htf1.length;
        for (int i = 0; i < j; i++)
        {
            String s = htf1[i];
            Object obj = ((ikg) (s)).c;
            s = ((ikg) (s)).a.c;
            obj = new amx(s, ((ikd) (obj)).a, ((ikd) (obj)).e);
            g.put(s, obj);
        }

    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (htf)kop.mergeFrom(new htf(), abyte0);
        if (a(((htf) (abyte0)).apiHeader))
        {
            return new cvz(((htf) (abyte0)).apiHeader);
        } else
        {
            return new cxf(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        if (!g.isEmpty())
        {
            aoe1.a(g);
        }
        aoe1.a();
        aoe1.n();
        amx amx1;
        for (dfb = g.values().iterator(); dfb.hasNext(); aoe1.c(amx1.a, amx1.b, amx1.c, amx1.d))
        {
            amx1 = (amx)dfb.next();
        }

        break MISSING_BLOCK_LABEL_98;
        dfb;
        aoe1.c();
        throw dfb;
        aoe1.b();
        aoe1.c();
        return;
    }
}
