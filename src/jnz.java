// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Collection;

final class jnz
    implements Serializable, jnx
{

    private static final long serialVersionUID = 0L;
    private final Collection a;

    jnz(Collection collection)
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
        if (obj instanceof jnz)
        {
            obj = (jnz)obj;
            return a.equals(((jnz) (obj)).a);
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
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 15)).append("Predicates.in(").append(s).append(")").toString();
    }
}
