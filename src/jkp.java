// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

final class jkp extends jlb
{

    static final jkp a = new jkp();

    private jkp()
    {
    }

    public jlb a()
    {
        return this;
    }

    public jmi b()
    {
        return jmi.g();
    }

    jmi c()
    {
        throw new AssertionError("should never be called");
    }

    public jmi d()
    {
        return jmi.g();
    }

    public Set entrySet()
    {
        return b();
    }

    public Object get(Object obj)
    {
        return null;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Set keySet()
    {
        return d();
    }

    Object readResolve()
    {
        return a;
    }

    public int size()
    {
        return 0;
    }

}
