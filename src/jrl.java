// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Comparator;

final class jrl extends jxb
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Comparator a;

    jrl(Comparator comparator)
    {
        a = (Comparator)n.b(comparator);
    }

    public int compare(Object obj, Object obj1)
    {
        return a.compare(obj, obj1);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof jrl)
        {
            obj = (jrl)obj;
            return a.equals(((jrl) (obj)).a);
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
        return a.toString();
    }
}
