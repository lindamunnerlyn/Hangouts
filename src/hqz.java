// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class hqz extends FilterInputStream
{

    final hqy a;
    private long b;

    public hqz(hqy hqy1, InputStream inputstream)
    {
        a = hqy1;
        super(inputstream);
        b = 0L;
    }

    private void a()
    {
        long l;
        for (l = a.getContentLength(); l == -1L || b == 0L || b >= l;)
        {
            return;
        }

        long l1 = b;
        throw new IOException((new StringBuilder(102)).append("Connection closed prematurely: bytesRead = ").append(l1).append(", Content-Length = ").append(l).toString());
    }

    public int read()
    {
        int i = in.read();
        if (i == -1)
        {
            a();
            return i;
        } else
        {
            b = b + 1L;
            return i;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = in.read(abyte0, i, j);
        if (i == -1)
        {
            a();
            return i;
        } else
        {
            b = b + (long)i;
            return i;
        }
    }
}
