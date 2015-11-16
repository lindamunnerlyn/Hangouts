// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.NoSuchElementException;

final class klo
    implements klq
{

    final kln a;
    private int b;
    private final int c;

    klo(kln kln1)
    {
        a = kln1;
        super();
        b = kln1.b();
        c = b + kln1.a();
    }

    public byte a()
    {
        if (b >= c)
        {
            throw new NoSuchElementException();
        } else
        {
            byte abyte0[] = a.b;
            int i = b;
            b = i + 1;
            return abyte0[i];
        }
    }

    public boolean hasNext()
    {
        return b < c;
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
