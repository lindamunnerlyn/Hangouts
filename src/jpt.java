// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jpt extends jlw
{

    final jps a;

    jpt(jps jps1)
    {
        a = jps1;
        super();
    }

    boolean H_()
    {
        return true;
    }

    public jqy a()
    {
        return b().a();
    }

    jlr d()
    {
        return a;
    }

    jlk f()
    {
        return new jpr(this, jps.a(a));
    }

    public int hashCode()
    {
        return jps.b(a);
    }

    public Iterator iterator()
    {
        return a();
    }
}
