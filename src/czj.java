// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class czj extends cxr
{

    private static final long serialVersionUID = 1L;
    private final Map g = new HashMap();

    private czj(hyj hyj1)
    {
        super(hyj1.apiHeader);
        hyj1 = hyj1.a.a;
        int j = hyj1.length;
        for (int i = 0; i < j; i++)
        {
            String s = hyj1[i];
            Object obj = ((ipk) (s)).c;
            s = ((ipk) (s)).a.c;
            obj = new anp(s, ((iph) (obj)).a, ((iph) (obj)).e);
            g.put(s, obj);
        }

    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (hyj)kws.mergeFrom(new hyj(), abyte0);
        if (a(((hyj) (abyte0)).apiHeader))
        {
            return new cyd(((hyj) (abyte0)).apiHeader);
        } else
        {
            return new czj(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        if (!g.isEmpty())
        {
            aow1.a(g);
        }
        aow1.a();
        aow1.n();
        anp anp1;
        for (dgk = g.values().iterator(); dgk.hasNext(); aow1.c(anp1.a, anp1.b, anp1.c, anp1.d))
        {
            anp1 = (anp)dgk.next();
        }

        break MISSING_BLOCK_LABEL_98;
        dgk;
        aow1.c();
        throw dgk;
        aow1.b();
        aow1.c();
        return;
    }
}
