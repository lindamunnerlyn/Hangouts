// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jxo extends jxb
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final jxb a;

    jxo(jxb jxb1)
    {
        a = (jxb)n.b(jxb1);
    }

    public jxb c()
    {
        return a;
    }

    public int compare(Object obj, Object obj1)
    {
        return a.compare(obj1, obj);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof jxo)
        {
            obj = (jxo)obj;
            return a.equals(((jxo) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return -a.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 10)).append(s).append(".reverse()").toString();
    }
}
