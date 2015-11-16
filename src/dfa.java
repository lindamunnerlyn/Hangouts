// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class dfa
{

    private static final boolean a = false;
    public final ani b;
    public final dfb c = new dfb();
    private String d;

    public dfa(ani ani)
    {
        b = ani;
    }

    public void a()
    {
    }

    public void a(String s)
    {
        d = s;
    }

    public boolean a(dbn dbn1)
    {
        return a(dbn1, 0, null);
    }

    public boolean a(dbn dbn1, int i, dkb dkb)
    {
        List list = j();
        if (list.isEmpty())
        {
            return false;
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((dko)iterator.next()).b(d)) { }
        if (a)
        {
            int k = list.size();
            String s = String.valueOf(getClass().getSimpleName());
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 76)).append("sendRequestsToServer: sending ").append(k).append(" requests from executing operation ").append(s).toString());
        }
        dbn1.a(list, i, dkb);
        return true;
    }

    public int b()
    {
        return 1;
    }

    public Object c()
    {
        return null;
    }

    public List j()
    {
        return c.c();
    }

    static 
    {
        hik hik = ebw.n;
    }
}
