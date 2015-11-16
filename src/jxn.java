// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jxn extends jxb
    implements Serializable
{

    static final jxn a = new jxn();
    private static final long serialVersionUID = 0L;

    private jxn()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    public jxb c()
    {
        return jwx.a;
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        n.b(obj);
        if (obj == obj1)
        {
            return 0;
        } else
        {
            return ((Comparable) (obj1)).compareTo(obj);
        }
    }

    public String toString()
    {
        return "Ordering.natural().reverse()";
    }

}
