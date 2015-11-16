// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kvj
    implements ktt
{

    int a;
    final kvh b;
    private final kvi c;
    private ktt d;

    kvj(kvh kvh1)
    {
        b = kvh1;
        super();
        c = new kvi(kvh1);
        d = c.a().c();
        a = kvh1.a();
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
