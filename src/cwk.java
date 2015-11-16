// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public class cwk extends cvn
{

    private static final long serialVersionUID = 1L;
    private final Map g = new HashMap();

    private cwk(izu izu1)
    {
        super(izu1.responseHeader, -1L);
        izu1 = izu1.a;
        int j = izu1.length;
        for (int i = 0; i < j; i++)
        {
            String s = izu1[i];
            Object obj = ((izr) (s)).a;
            if (((izr) (s)).b != null && obj != null && ((izs) (obj)).b != null)
            {
                s = ((izr) (s)).b;
                obj = ((izs) (obj)).b;
                g.put(obj, s);
            }
        }

    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (izu)kop.mergeFrom(new izu(), abyte0);
        if (a(((izu) (abyte0)).responseHeader))
        {
            return new cvz(((izu) (abyte0)).responseHeader);
        } else
        {
            return new cwk(abyte0);
        }
    }

    public Map k()
    {
        return g;
    }
}
