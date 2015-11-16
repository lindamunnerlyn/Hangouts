// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kng
    implements klq
{

    int a;
    final kne b;
    private final knf c;
    private klq d;

    kng(kne kne1)
    {
        b = kne1;
        super();
        c = new knf(kne1);
        d = c.a().c();
        a = kne1.a();
    }

    public byte a()
    {
        if (!d.hasNext())
        {
            d = c.a().c();
        }
        a = a - 1;
        return d.a();
    }

    public boolean hasNext()
    {
        return a > 0;
    }

    public Object next()
    {
        return Byte.valueOf(a());
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
