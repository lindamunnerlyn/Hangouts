// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class gjj
{

    private final Map a = new ConcurrentHashMap();

    public gjj()
    {
    }

    public gji a(String s)
    {
        gji gji2 = (gji)a.get(s);
        gji gji1 = gji2;
        if (gji2 == null)
        {
            gji1 = new gji(s);
            a(gji1);
        }
        return gji1;
    }

    public void a(gji gji1)
    {
        a.put(gji1.a(), gji1);
    }
}
