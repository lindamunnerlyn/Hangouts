// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jqb extends jlw
{

    final jqa a;

    jqb(jqa jqa1)
    {
        a = jqa1;
        super();
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
        return new jpr(this, jqa.a(a));
    }

    public Iterator iterator()
    {
        return a();
    }
}
