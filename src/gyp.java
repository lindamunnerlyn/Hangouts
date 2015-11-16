// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class gyp extends FilterOutputStream
{

    private final ByteBuffer a = ByteBuffer.allocate(4);

    public gyp(OutputStream outputstream)
    {
        super(outputstream);
    }

    public gyp a(int i)
    {
        a.rewind();
        a.putInt(i);
        out.write(a.array());
        return this;
    }

    public gyp a(gyq gyq1)
    {
        a((int)gyq1.a());
        a((int)gyq1.b());
        return this;
    }

    public gyp a(ByteOrder byteorder)
    {
        a.order(byteorder);
        return this;
    }

    public gyp a(short word0)
    {
        a.rewind();
        a.putShort(word0);
        out.write(a.array(), 0, 2);
        return this;
    }
}
