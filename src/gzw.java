// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public final class gzw
{

    private static final int a;
    private final byte b[];
    private final long c;

    private gzw(byte abyte0[], long l)
    {
        if (abyte0 == null || abyte0.length != a)
        {
            throw new IllegalArgumentException("Incorrect fingerprint size");
        } else
        {
            b = abyte0;
            c = l;
            return;
        }
    }

    public static gzw a(InputStream inputstream)
    {
        Object obj1;
        byte abyte0[];
        abyte0 = new byte[8192];
        obj1 = null;
        Object obj;
        obj = MessageDigest.getInstance("SHA-1");
        obj = new DigestInputStream(new BufferedInputStream(inputstream, 8192), ((MessageDigest) (obj)));
        long l = 0L;
_L2:
        inputstream = ((InputStream) (obj));
        int i = ((DigestInputStream) (obj)).read(abyte0);
        if (i >= 0)
        {
            l += i;
        } else
        {
            ((DigestInputStream) (obj)).close();
            return new gzw(((DigestInputStream) (obj)).getMessageDigest().digest(), l);
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        inputstream = null;
_L6:
        throw new IllegalStateException(((Throwable) (obj1)));
        obj1;
        obj = inputstream;
        inputstream = ((InputStream) (obj1));
_L4:
        if (obj != null)
        {
            ((DigestInputStream) (obj)).close();
        }
        throw inputstream;
        inputstream;
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        inputstream = ((InputStream) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = String.valueOf(s.substring(0, 32));
        if (s.length() != 0)
        {
            return "cs_01_".concat(s);
        } else
        {
            return new String("cs_01_");
        }
    }

    public String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < a; i++)
        {
            byte byte0 = b[i];
            stringbuilder.append(Integer.toHexString(byte0 >> 4 & 0xf));
            stringbuilder.append(Integer.toHexString(byte0 & 0xf));
        }

        return stringbuilder.toString();
    }

    public long b()
    {
        return c;
    }

    public byte[] c()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof gzw))
        {
            return false;
        } else
        {
            obj = (gzw)obj;
            return Arrays.equals(b, ((gzw) (obj)).b);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(b);
    }

    static 
    {
        try
        {
            a = MessageDigest.getInstance("SHA-1").getDigestLength();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new IllegalStateException(nosuchalgorithmexception);
        }
    }
}
