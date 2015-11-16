// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.nio.ByteBuffer;

public final class hkn extends InputStream
{

    private final ByteBuffer a;
    private int b;

    public hkn(ByteBuffer bytebuffer)
    {
        b = 0;
        a = bytebuffer;
    }

    public int available()
    {
        return a.remaining();
    }

    public void mark(int i)
    {
        b = a.position();
    }

    public boolean markSupported()
    {
        return true;
    }

    public int read()
    {
        if (!a.hasRemaining())
        {
            return -1;
        } else
        {
            return a.get() & 0xff;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (a.hasRemaining())
        {
            j = Math.min(a.remaining(), j);
            a.get(abyte0, i, j);
            return j;
        } else
        {
            return -1;
        }
    }

    public void reset()
    {
        a.position(b);
    }

    public long skip(long l)
    {
        int i = (int)Math.min(l, a.remaining());
        a.position(a.position() + i);
        return (long)i;
    }
}
