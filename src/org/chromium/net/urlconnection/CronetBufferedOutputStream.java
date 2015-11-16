// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net.urlconnection;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;

// Referenced classes of package org.chromium.net.urlconnection:
//            CronetOutputStream, CronetHttpURLConnection

final class CronetBufferedOutputStream extends CronetOutputStream
{

    private final int a;
    private final CronetHttpURLConnection b;
    private ByteBuffer c;
    private boolean d;

    CronetBufferedOutputStream(CronetHttpURLConnection cronethttpurlconnection)
    {
        d = false;
        if (cronethttpurlconnection == null)
        {
            throw new NullPointerException();
        } else
        {
            b = cronethttpurlconnection;
            a = -1;
            c = ByteBuffer.allocate(16384);
            return;
        }
    }

    CronetBufferedOutputStream(CronetHttpURLConnection cronethttpurlconnection, long l)
    {
        d = false;
        if (cronethttpurlconnection == null)
        {
            throw new NullPointerException("Argument connection cannot be null.");
        }
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("Content length < 0.");
        } else
        {
            b = cronethttpurlconnection;
            a = (int)l;
            c = ByteBuffer.allocate(a);
            return;
        }
    }

    private void a(int i)
    {
        if (a != -1 && c.position() + i > a)
        {
            throw new ProtocolException((new StringBuilder("exceeded content-length limit of ")).append(a).append(" bytes").toString());
        }
        if (d)
        {
            throw new IllegalStateException("Cannot write after being connected.");
        }
        while (a != -1 || c.limit() - c.position() > i) 
        {
            return;
        }
        ByteBuffer bytebuffer = ByteBuffer.allocate(Math.max(c.capacity() << 1, c.capacity() + i));
        c.flip();
        bytebuffer.put(c);
        c = bytebuffer;
    }

    public long a()
    {
        if (a == -1)
        {
            return (long)c.position();
        } else
        {
            return (long)a;
        }
    }

    public void a(UploadDataSink uploaddatasink)
    {
        c.position(0);
        uploaddatasink.a();
    }

    public void a(UploadDataSink uploaddatasink, ByteBuffer bytebuffer)
    {
        int i = bytebuffer.capacity() - bytebuffer.position();
        if (i < c.limit() - c.position())
        {
            bytebuffer.put(c.array(), c.position(), i);
            c.position(i + c.position());
        } else
        {
            bytebuffer.put(c);
        }
        uploaddatasink.a(false);
    }

    void b()
    {
        d = true;
        if (c.position() < a)
        {
            throw new ProtocolException("Content received is less than Content-Length");
        } else
        {
            c.flip();
            return;
        }
    }

    void c()
    {
    }

    public void write(int i)
    {
        a(1);
        c.put((byte)i);
    }

    public void write(byte abyte0[], int i, int j)
    {
        a(j);
        c.put(abyte0, i, j);
    }
}
