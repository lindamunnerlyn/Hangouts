// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jkl extends jpp
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final jgt a;
    final jpp b;

    jkl(jgt jgt1, jpp jpp1)
    {
        a = (jgt)n.b(jgt1);
        b = (jpp)n.b(jpp1);
    }

    public int compare(Object obj, Object obj1)
    {
        return b.compare(a.a(obj), a.a(obj1));
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof jkl)
            {
                if (!a.equals(((jkl) (obj = (jkl)obj)).a) || !b.equals(((jkl) (obj)).b))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return n.a(new Object[] {
            a, b
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(".onResultOf(").append(a).append(")").toString();
    }
}
