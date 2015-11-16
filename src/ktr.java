// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.NoSuchElementException;

final class ktr
    implements ktt
{

    final ktq a;
    private int b;
    private final int c;

    ktr(ktq ktq1)
    {
        a = ktq1;
        super();
        b = ktq1.b();
        c = b + ktq1.a();
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
