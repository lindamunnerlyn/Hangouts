// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.AbstractHttpContent;
import java.io.OutputStream;

final class giu extends AbstractHttpContent
{

    private final byte a[];

    protected giu(byte abyte0[])
    {
        super("application/x-protobuf");
        a = abyte0;
    }

    public void writeTo(OutputStream outputstream)
    {
        outputstream.write(a);
        outputstream.flush();
    }
}
