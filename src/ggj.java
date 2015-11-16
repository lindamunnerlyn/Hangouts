// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ggj
{

    private final Map a = new ConcurrentHashMap();

    public ggj()
    {
    }

    public ggi a(String s)
    {
        ggi ggi2 = (ggi)a.get(s);
        ggi ggi1 = ggi2;
        if (ggi2 == null)
        {
            ggi1 = new ggi(s);
            a(ggi1);
        }
        return ggi1;
    }

    public void a(ggi ggi1)
    {
        a.put(ggi1.a(), ggi1);
    }
}
