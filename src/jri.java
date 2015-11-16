// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class jri extends jqq
    implements jwl
{

    private static final long serialVersionUID = 0x67226fd4cd0928d8L;

    protected jri(Map map)
    {
        super(map);
    }

    abstract Set a();

    public Set a(Object obj)
    {
        return (Set)super.b(obj);
    }

    public boolean a(Object obj, Object obj1)
    {
        return super.a(obj, obj1);
    }

    public Collection b(Object obj)
    {
        return a(obj);
    }

    public Map b()
    {
        return super.b();
    }

    Collection c()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}
