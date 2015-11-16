// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public abstract class ktm
    implements kvc
{

    public ktm()
    {
    }

    public abstract ktm a();

    public ktm a(ktu ktu1)
    {
        return a(ktu1, kty.a());
    }

    public abstract ktm a(ktu ktu1, kty kty1);

    public ktm a(byte abyte0[])
    {
        return a(abyte0, abyte0.length);
    }

    public ktm a(byte abyte0[], int i)
    {
        try
        {
            abyte0 = ktu.a(abyte0, 0, i);
            a(((ktu) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", abyte0);
        }
        return this;
    }

    public kvc b(ktu ktu1, kty kty1)
    {
        return a(ktu1, kty1);
    }

    public kvc b(byte abyte0[])
    {
        return a(abyte0);
    }

    public Object clone()
    {
        return a();
    }
}
