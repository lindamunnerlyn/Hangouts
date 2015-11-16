// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jsx extends jsv
{

    private final transient jso a;
    private final transient java.util.Map.Entry b[];

    jsx(jso jso, java.util.Map.Entry aentry[])
    {
        a = jso;
        b = aentry;
    }

    public jyh a()
    {
        return f().a();
    }

    jso b()
    {
        return a;
    }

    jsh g()
    {
        return new jxd(this, b);
    }

    public Iterator iterator()
    {
        return a();
    }
}
