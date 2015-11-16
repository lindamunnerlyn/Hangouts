// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;

final class jjv extends jph
{

    final jju a;

    jjv(jju jju1)
    {
        a = jju1;
        super();
    }

    Map a()
    {
        return a;
    }

    public boolean contains(Object obj)
    {
        return jkm.a(a.a.entrySet(), obj);
    }

    public Iterator iterator()
    {
        return new jjw(a);
    }

    public boolean remove(Object obj)
    {
        if (!contains(obj))
        {
            return false;
        } else
        {
            obj = (java.util.Map.Entry)obj;
            jjt.a(a.b, ((java.util.Map.Entry) (obj)).getKey());
            return true;
        }
    }
}
