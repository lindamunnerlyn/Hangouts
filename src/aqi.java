// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;

final class aqi extends efq
{

    private final Map a = new gz();
    private final Map b = new gz();

    aqi()
    {
    }

    public int a(String s)
    {
        return g.a((Integer)a.get(s), 0);
    }

    public void a(String s, int i)
    {
        a.put(s, Integer.valueOf(i));
    }

    public void a(String s, List list)
    {
        b.put(s, list);
    }

    public boolean b(String s)
    {
        return a.containsKey(s);
    }

    public List c(String s)
    {
        return (List)b.get(s);
    }
}
