// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Arrays;

final class jrj extends jxb
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final jnn a;
    final jxb b;

    jrj(jnn jnn1, jxb jxb1)
    {
        a = (jnn)n.b(jnn1);
        b = (jxb)n.b(jxb1);
    }

    public int compare(Object obj, Object obj1)
    {
        return b.compare(a.a(obj), a.a(obj1));
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof jrj)
            {
                if (!a.equals(((jrj) (obj = (jrj)obj)).a) || !b.equals(((jrj) (obj)).b))
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
        return Arrays.hashCode(new Object[] {
            a, b
        });
    }

    public String toString()
    {
        String s = String.valueOf(b);
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 13 + String.valueOf(s1).length())).append(s).append(".onResultOf(").append(s1).append(")").toString();
    }
}
