// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jxg extends jsv
{

    final jxf a;

    jxg(jxf jxf1)
    {
        a = jxf1;
        super();
    }

    boolean I_()
    {
        return true;
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
        return new jxh(this);
    }

    public int hashCode()
    {
        return jxe.c(a.b);
    }

    public Iterator iterator()
    {
        return a();
    }
}
