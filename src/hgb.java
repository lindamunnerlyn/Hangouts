// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class hgb
    implements ReadableByteChannel
{

    private final hfy a;
    private final ReadableByteChannel b;

    public hgb(ReadableByteChannel readablebytechannel, hfx hfx, long l)
    {
        this(readablebytechannel, new hfy(hfx, l));
    }

    private hgb(ReadableByteChannel readablebytechannel, hfy hfy1)
    {
        b = readablebytechannel;
        a = hfy1;
    }

    public void close()
    {
        b.close();
    }

    public boolean isOpen()
    {
        return b.isOpen();
    }

    public int read(ByteBuffer bytebuffer)
    {
        int i = b.read(bytebuffer);
        if (i >= 0)
        {
            a.b(i);
        }
        return i;
    }
}
