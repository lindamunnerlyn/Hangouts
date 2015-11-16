// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

final class gto extends FilterInputStream
{

    private int a;
    private final byte b[] = new byte[8];
    private final ByteBuffer c;

    protected gto(InputStream inputstream)
    {
        super(inputstream);
        a = 0;
        c = ByteBuffer.wrap(b);
    }

    private void a(byte abyte0[], int i)
    {
        if (read(abyte0, 0, i) != i)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public int a()
    {
        return a;
    }

    public String a(int i, Charset charset)
    {
        byte abyte0[] = new byte[i];
        a(abyte0, abyte0.length);
        return new String(abyte0, charset);
    }

    public void a(long l)
    {
        l -= a;
        if (l < 0L)
        {
            throw new IOException();
        }
        if (skip(l) != l)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public void a(ByteOrder byteorder)
    {
        c.order(byteorder);
    }

    public ByteOrder b()
    {
        return c.order();
    }

    public short c()
    {
        a(b, 2);
        c.rewind();
        return c.getShort();
    }

    public int d()
    {
        return c() & 0xffff;
    }

    public int e()
    {
        a(b, 4);
        c.rewind();
        return c.getInt();
    }

    public long f()
    {
        return (long)e() & 0xffffffffL;
    }

    public int read()
    {
        int j = in.read();
        int k = a;
        int i;
        if (j >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a = i + k;
        return j;
    }

    public int read(byte abyte0[])
    {
        int i = in.read(abyte0);
        a = a + Math.max(i, 0);
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = in.read(abyte0, i, j);
        a = a + Math.max(i, 0);
        return i;
    }

    public long skip(long l)
    {
        l = in.skip(l);
        a = (int)((long)a + l);
        return l;
    }
}
