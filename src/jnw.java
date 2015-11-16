// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class jnw
    implements Serializable
{

    private static final long serialVersionUID = 0xa60d052d8237f63L;
    public final Object a;
    public final Object b;

    private jnw(Object obj, Object obj1)
    {
        a = obj;
        b = obj1;
    }

    public static jnw a(Object obj, Object obj1)
    {
        return new jnw(obj, obj1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof jnw)
        {
            obj = (jnw)obj;
            flag = flag1;
            if (n.a(a, ((jnw) (obj)).a))
            {
                flag = flag1;
                if (n.a(b, ((jnw) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i * 31 + j;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length())).append("(").append(s).append(", ").append(s1).append(")").toString();
    }
}
