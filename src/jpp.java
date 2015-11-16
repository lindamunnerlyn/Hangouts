// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

public abstract class jpp
    implements Comparator
{

    protected jpp()
    {
    }

    public static jpp a(Comparator comparator)
    {
        if (comparator instanceof jpp)
        {
            return (jpp)comparator;
        } else
        {
            return new jkn(comparator);
        }
    }

    public static jpp b()
    {
        return jpn.a;
    }

    public jpp a()
    {
        return new jqg(this);
    }

    public jpp a(jgt jgt)
    {
        return new jkl(jgt, this);
    }

    jpp c()
    {
        return a(jpc.a());
    }

    public abstract int compare(Object obj, Object obj1);
}
