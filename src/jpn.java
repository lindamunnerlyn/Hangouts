// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jpn extends jpp
    implements Serializable
{

    static final jpn a = new jpn();
    private static final long serialVersionUID = 0L;

    private jpn()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    public jpp a()
    {
        return jqf.a;
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        n.b(obj);
        n.b(obj1);
        return ((Comparable) (obj)).compareTo(obj1);
    }

    public String toString()
    {
        return "Ordering.natural()";
    }

}
