// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class guo extends kxy
{

    public guo(ByteBuffer bytebuffer)
    {
        super(bytebuffer);
    }

    public static boolean a(ByteBuffer bytebuffer)
    {
        if (bytebuffer.capacity() < 3)
        {
            return false;
        }
        byte abyte0[] = new byte[3];
        ((ByteBuffer)bytebuffer.rewind()).get(abyte0).rewind();
        bytebuffer.rewind();
        return abyte0[0] == 71 && abyte0[1] == 73 && abyte0[2] == 70;
    }
}
