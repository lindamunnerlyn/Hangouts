// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class guc extends FilterOutputStream
{

    private final ByteBuffer a = ByteBuffer.allocate(4);

    public guc(OutputStream outputstream)
    {
        super(outputstream);
    }

    public guc a(int i)
    {
        a.rewind();
        a.putInt(i);
        out.write(a.array());
        return this;
    }

    public guc a(gud gud1)
    {
        a((int)gud1.a());
        a((int)gud1.b());
        return this;
    }

    public guc a(ByteOrder byteorder)
    {
        a.order(byteorder);
        return this;
    }

    public guc a(short word0)
    {
        a.rewind();
        a.putShort(word0);
        out.write(a.array(), 0, 2);
        return this;
    }
}
