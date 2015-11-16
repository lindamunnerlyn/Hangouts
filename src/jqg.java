// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jqg extends jpp
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final jpp a;

    jqg(jpp jpp1)
    {
        a = (jpp)n.b(jpp1);
    }

    public jpp a()
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
        if (obj instanceof jqg)
        {
            obj = (jqg)obj;
            return a.equals(((jqg) (obj)).a);
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
        return (new StringBuilder()).append(a).append(".reverse()").toString();
    }
}
