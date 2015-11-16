// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net.urlconnection;

import java.io.IOException;
import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;

// Referenced classes of package org.chromium.net.urlconnection:
//            CronetOutputStream, MessageLoop, CronetHttpURLConnection

final class CronetChunkedOutputStream extends CronetOutputStream
{

    private final CronetHttpURLConnection a;
    private final MessageLoop b;
    private final ByteBuffer c;
    private long d;
    private boolean e;
    private boolean f;

    CronetChunkedOutputStream(CronetHttpURLConnection cronethttpurlconnection, int i, MessageLoop messageloop)
    {
        e = false;
        f = false;
        if (cronethttpurlconnection == null)
        {
            throw new NullPointerException();
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        } else
        {
            c = ByteBuffer.allocate(i);
            a = cronethttpurlconnection;
            b = messageloop;
            d = 0L;
            return;
        }
    }

    private void d()
    {
        if (f)
        {
            throw new IOException("Stream has been closed.");
        } else
        {
            return;
        }
    }

    public long a()
    {
        return -1L;
    }

    public void a(UploadDataSink uploaddatasink)
    {
        uploaddatasink.a(new HttpRetryException("Cannot retry streamed Http body", -1));
    }

    public void a(UploadDataSink uploaddatasink, ByteBuffer bytebuffer)
    {
        int i = bytebuffer.capacity() - bytebuffer.position();
        if (i < c.position())
        {
            bytebuffer.put(c.array(), 0, i);
            c.position(i);
            c.compact();
            uploaddatasink.a(false);
            return;
        } else
        {
            c.flip();
            bytebuffer.put(c);
            c.clear();
            b.b();
            uploaddatasink.a(e);
            return;
        }
    }

    void b()
    {
    }

    void c()
    {
    }

    public void close()
    {
        if (!e)
        {
            e = true;
            b.a();
        }
        f = true;
    }

    public void write(int i)
    {
        d();
        for (; c.position() == c.limit(); b.a()) { }
        c.put((byte)i);
        d = d + 1L;
    }

    public void write(byte abyte0[], int i, int j)
    {
        d();
        if (abyte0.length - i < j || i < 0 || j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j == 0)
        {
            return;
        }
        int l;
        for (int k = j; k > 0; k -= l)
        {
            if (c.position() == c.limit())
            {
                b.a();
            }
            l = Math.min(k, c.limit() - c.position());
            c.put(abyte0, (i + j) - k, l);
        }

        d = d + (long)j;
    }
}
