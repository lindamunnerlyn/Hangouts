// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Map;

public abstract class jlb extends jlr
    implements Map
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];

    jlb()
    {
    }

    public static jlb a(Object obj, Object obj1)
    {
        return new jqj(obj, obj1);
    }

    public static jlb e()
    {
        return jkp.a;
    }

    public abstract jlb a();

    public jmi f()
    {
        return a().d();
    }

    public jle g()
    {
        return f();
    }

    public Collection values()
    {
        return f();
    }

    Object writeReplace()
    {
        return new jld(this);
    }

}
