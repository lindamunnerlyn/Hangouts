// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;

final class ktq extends kuz
{

    private static final long serialVersionUID = 1L;
    private final int c;
    private final int d;

    ktq(byte abyte0[], int i, int j)
    {
        super(abyte0);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Offset too small: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Length too small: ").append(i).toString());
        }
        if ((long)i + (long)j > (long)abyte0.length)
        {
            throw new IllegalArgumentException((new StringBuilder(48)).append("Offset+Length too large: ").append(i).append("+").append(j).toString());
        } else
        {
            c = i;
            d = j;
            return;
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public byte a(int i)
    {
        if (i < 0)
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder(28)).append("Index too small: ").append(i).toString());
        }
        if (i >= a())
        {
            int j = a();
            throw new ArrayIndexOutOfBoundsException((new StringBuilder(41)).append("Index too large: ").append(i).append(", ").append(j).toString());
        } else
        {
            return b[c + i];
        }
    }

    public int a()
    {
        return d;
    }

    protected void a(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(b, b() + i, abyte0, j, k);
    }

    protected int b()
    {
        return c;
    }

    public ktt c()
    {
        return new ktr(this);
    }

    public Iterator iterator()
    {
        return c();
    }

    Object writeReplace()
    {
        return new kuz(e());
    }
}
