// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net.urlconnection;

import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package org.chromium.net.urlconnection:
//            CronetHttpURLConnection

class CronetInputStream extends InputStream
{

    private final CronetHttpURLConnection a;
    private boolean b;
    private ByteBuffer c;

    public CronetInputStream(CronetHttpURLConnection cronethttpurlconnection)
    {
        a = cronethttpurlconnection;
    }

    private void b()
    {
        if (!b && !c())
        {
            if (c == null)
            {
                c = ByteBuffer.allocateDirect(32768);
            }
            c.clear();
            a.a(c);
        }
    }

    private boolean c()
    {
        return c != null && c.hasRemaining();
    }

    void a()
    {
        b = true;
        c = null;
    }

    public int read()
    {
        b();
        if (c())
        {
            return c.get() & 0xff;
        } else
        {
            return -1;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (i < 0 || j < 0 || i + j > abyte0.length)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j == 0)
        {
            return 0;
        }
        b();
        if (c())
        {
            j = Math.min(c.limit() - c.position(), j);
            c.get(abyte0, i, j);
            return j;
        } else
        {
            return -1;
        }
    }
}
