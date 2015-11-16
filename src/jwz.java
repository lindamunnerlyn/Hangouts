// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jwz extends jxb
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final jxb a;

    jwz(jxb jxb1)
    {
        a = jxb1;
    }

    public jxb a()
    {
        return a.a();
    }

    public jxb b()
    {
        return this;
    }

    public jxb c()
    {
        return a.c().a();
    }

    public int compare(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == null)
        {
            return 1;
        }
        if (obj1 == null)
        {
            return -1;
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
        if (obj instanceof jwz)
        {
            obj = (jwz)obj;
            return a.equals(((jwz) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a.hashCode() ^ 0xc9177248;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 12)).append(s).append(".nullsLast()").toString();
    }
}
