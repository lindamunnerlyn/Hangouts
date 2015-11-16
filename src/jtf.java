// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class jtf
{

    jwl a;
    Comparator b;
    Comparator c;

    public jtf()
    {
        g.c(8, "expectedKeys");
        this((new jwo(8)).b().a());
    }

    private jtf(jwl jwl1)
    {
        a = jwl1;
    }

    public jte a()
    {
        if (c != null)
        {
            for (Iterator iterator = a.b().values().iterator(); iterator.hasNext(); Collections.sort((List)(Collection)iterator.next(), c)) { }
        }
        if (b != null)
        {
            g.c(8, "expectedKeys");
            jwl jwl1 = (new jwo(8)).b().a();
            java.util.Map.Entry entry;
            for (Iterator iterator1 = jxb.a(b).d().a(a.b().entrySet()).iterator(); iterator1.hasNext(); jwl1.a(entry.getKey(), (Iterable)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator1.next();
            }

            a = jwl1;
        }
        Object obj = a;
        if (obj instanceof jte)
        {
            return (jte)obj;
        }
        if (((jwl) (obj)).j())
        {
            return jrq.a;
        }
        if (obj instanceof jsn)
        {
            return (jsn)obj;
        }
        jsq jsq1 = new jsq(((jwl) (obj)).b().size());
        obj = ((jwl) (obj)).b().entrySet().iterator();
        int i = 0;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            jsh jsh1 = jsh.a((Collection)entry1.getValue());
            if (!jsh1.isEmpty())
            {
                jsq1.a(entry1.getKey(), jsh1);
                i = jsh1.size() + i;
            }
        } while (true);
        return new jsn(jsq1.a(), i);
    }

    public jtf a(Object obj, Object obj1)
    {
        g.f(obj, obj1);
        a.a(obj, obj1);
        return this;
    }
}
