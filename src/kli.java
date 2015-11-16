// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public abstract class kli
    implements kmy
{

    public int a;

    public kli()
    {
        a = 0;
    }

    public byte[] a()
    {
        byte abyte0[];
        try
        {
            abyte0 = new byte[m()];
            kls kls1 = kls.a(abyte0);
            a(kls1);
            kls1.h();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ioexception);
        }
        return abyte0;
    }

    knq b()
    {
        return new knq();
    }
}
