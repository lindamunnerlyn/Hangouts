// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jpv extends jlw
{

    final jpu a;

    jpv(jpu jpu1)
    {
        a = jpu1;
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
        return new jpw(this);
    }

    public int hashCode()
    {
        return jps.b(a.a);
    }

    public Iterator iterator()
    {
        return a();
    }
}
