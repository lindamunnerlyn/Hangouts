// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public abstract class ktl
    implements kvb
{

    public int a;

    public ktl()
    {
        a = 0;
    }

    public byte[] a()
    {
        byte abyte0[];
        try
        {
            abyte0 = new byte[n()];
            ktv ktv1 = ktv.a(abyte0);
            a(ktv1);
            ktv1.h();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ioexception);
        }
        return abyte0;
    }

    kvt b()
    {
        return new kvt();
    }
}
