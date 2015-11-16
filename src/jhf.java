// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Collection;

final class jhf
    implements Serializable, jhd
{

    private static final long serialVersionUID = 0L;
    private final Collection a;

    jhf(Collection collection)
    {
        a = (Collection)n.b(collection);
    }

    public boolean a(Object obj)
    {
        boolean flag;
        try
        {
            flag = a.contains(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof jhf)
        {
            obj = (jhf)obj;
            return a.equals(((jhf) (obj)).a);
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
        return (new StringBuilder("Predicates.in(")).append(a).append(")").toString();
    }
}
