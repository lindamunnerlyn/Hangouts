// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net.urlconnection;

import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;

// Referenced classes of package org.chromium.net.urlconnection:
//            CronetOutputStream, MessageLoop, CronetHttpURLConnection

final class CronetFixedModeOutputStream extends CronetOutputStream
{

    private static int a = 2048;
    private final CronetHttpURLConnection b;
    private final MessageLoop c;
    private final long d;
    private final ByteBuffer e;
    private long f;

    CronetFixedModeOutputStream(CronetHttpURLConnection cronethttpurlconnection, long l, MessageLoop messageloop)
    {
        if (cronethttpurlconnection == null)
        {
            throw new NullPointerException();
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        } else
        {
            d = l;
            e = ByteBuffer.allocate((int)Math.min(d, a));
            b = cronethttpurlconnection;
            c = messageloop;
            f = 0L;
            return;
        }
    }

    private void a(int i)
    {
        if (f + (long)i > d)
        {
            throw new ProtocolException((new StringBuilder("expected ")).append(d - f).append(" bytes but received ").append(i).toString());
        } else
        {
            return;
        }
    }

    public long a()
    {
        return d;
    }

    public void a(UploadDataSink uploaddatasink)
    {
        uploaddatasink.a(new HttpRetryException("Cannot retry streamed Http body", -1));
    }

    public void a(UploadDataSink uploaddatasink, ByteBuffer bytebuffer)
    {
        int i = bytebuffer.capacity() - bytebuffer.position();
        if (i < e.position())
        {
            bytebuffer.put(e.array(), 0, i);
            e.position(i);
            e.compact();
        } else
        {
            e.flip();
            bytebuffer.put(e);
            e.clear();
            c.b();
        }
        uploaddatasink.a(false);
    }

    void b()
    {
    }

    void c()
    {
        if (f < d)
        {
            throw new ProtocolException("Content received is less than Content-Length.");
        } else
        {
            return;
        }
    }

    public void write(int i)
    {
        a(1);
        for (; e.position() == e.limit(); c.a()) { }
        e.put((byte)i);
        f = f + 1L;
        if (f == d)
        {
            c.a();
        }
    }

    public void write(byte abyte0[], int i, int j)
    {
        if (abyte0.length - i < j || i < 0 || j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        a(j);
        if (j != 0)
        {
            int l;
            for (int k = j; k > 0; k -= l)
            {
                if (e.position() == e.limit())
                {
                    c.a();
                }
                l = Math.min(k, e.limit() - e.position());
                e.put(abyte0, (i + j) - k, l);
            }

            f = f + (long)j;
            if (f == d)
            {
                c.a();
                return;
            }
        }
    }

}
