// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class bje
{

    final bjc a;
    private final Set b = new HashSet();
    private final Map c = new HashMap();
    private int d;
    private boolean e;

    bje(bjc bjc1)
    {
        a = bjc1;
        super();
        d = 0;
        e = false;
    }

    private void b()
    {
        if (e && d == c.size())
        {
            a.a(c, true, true);
            c.clear();
            b.clear();
            d = 0;
        }
    }

    public void a()
    {
        e = true;
        b();
    }

    public void a(String s)
    {
        b.add(s);
        d = d + 1;
    }

    public boolean a(String s, long l)
    {
        if (b.remove(s))
        {
            c.put(s, Long.valueOf(l));
            b();
            return true;
        } else
        {
            return false;
        }
    }
}
