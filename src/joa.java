// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class joa
    implements Serializable, jnx
{

    private static final long serialVersionUID = 0L;
    private final Object a;

    joa(Object obj)
    {
        a = obj;
    }

    public boolean a(Object obj)
    {
        return a.equals(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof joa)
        {
            obj = (joa)obj;
            return a.equals(((joa) (obj)).a);
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
        return (new StringBuilder(String.valueOf(s).length() + 20)).append("Predicates.equalTo(").append(s).append(")").toString();
    }
}
