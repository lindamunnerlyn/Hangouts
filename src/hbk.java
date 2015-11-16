// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class hbk
    implements ReadableByteChannel
{

    private final hbh a;
    private final ReadableByteChannel b;

    public hbk(ReadableByteChannel readablebytechannel, hbg hbg, long l)
    {
        this(readablebytechannel, new hbh(hbg, l));
    }

    private hbk(ReadableByteChannel readablebytechannel, hbh hbh1)
    {
        b = readablebytechannel;
        a = hbh1;
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
