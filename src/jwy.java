// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jwy extends jxb
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final jxb a;

    jwy(jxb jxb1)
    {
        a = jxb1;
    }

    public jxb a()
    {
        return this;
    }

    public jxb b()
    {
        return a.b();
    }

    public jxb c()
    {
        return a.c().b();
    }

    public int compare(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == null)
        {
            return -1;
        }
        if (obj1 == null)
        {
            return 1;
        } else
        {
            return a.compare(obj, obj1);
        }
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof jwy)
        {
            obj = (jwy)obj;
            return a.equals(((jwy) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a.hashCode() ^ 0x39153a74;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 13)).append(s).append(".nullsFirst()").toString();
    }
}
