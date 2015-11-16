// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.NoSuchElementException;

final class kmx
    implements klq
{

    final kmw a;
    private int b;
    private final int c;

    kmx(kmw kmw1)
    {
        a = kmw1;
        super();
        b = 0;
        c = kmw1.a();
    }

    public byte a()
    {
        byte byte0;
        byte abyte0[];
        int i;
        try
        {
            abyte0 = a.b;
            i = b;
            b = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new NoSuchElementException(arrayindexoutofboundsexception.getMessage());
        }
        byte0 = abyte0[i];
        return byte0;
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
