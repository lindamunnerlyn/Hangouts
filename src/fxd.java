// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class fxd extends fxf
{

    final fxc a;

    fxd(fxc fxc1)
    {
        a = fxc1;
        super();
    }

    protected int a()
    {
        return a.g;
    }

    protected int a(Object obj)
    {
        if (obj == null)
        {
            return fxc.a(a);
        } else
        {
            return fxc.a(a, obj, obj.hashCode());
        }
    }

    protected Object a(int i)
    {
        return a.f[i];
    }

    protected Map b()
    {
        throw new UnsupportedOperationException("not a map");
    }

    protected void b(int i)
    {
        a.a(i);
    }

    protected void c()
    {
        a.clear();
    }
}
