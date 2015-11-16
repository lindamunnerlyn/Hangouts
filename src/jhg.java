// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jhg
    implements Serializable, jhd
{

    private static final long serialVersionUID = 0L;
    private final Object a;

    jhg(Object obj)
    {
        a = obj;
    }

    public boolean a(Object obj)
    {
        return a.equals(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof jhg)
        {
            obj = (jhg)obj;
            return a.equals(((jhg) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Predicates.equalTo(")).append(a).append(")").toString();
    }
}
