// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class fzh extends fzj
{

    final fzg a;

    fzh(fzg fzg1)
    {
        a = fzg1;
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
            return a.a();
        } else
        {
            return a.a(obj, obj.hashCode());
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
