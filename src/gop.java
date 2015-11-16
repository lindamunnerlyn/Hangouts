// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class gop
    implements gon
{

    private static final Charset a = Charset.forName("UTF-8");

    public gop()
    {
    }

    private static long a(String s)
    {
        g.e(s);
        g.a(s, "name can not be empty.");
        long l;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes(a));
            l = ByteBuffer.wrap(messagedigest.digest()).getLong();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return l;
    }

    protected abstract void a(lgm lgm1);

    public void a(lgm lgm1, String s)
    {
        if (s != null && !s.trim().isEmpty())
        {
            lgm1.b = Long.valueOf(a(s));
        }
        a(lgm1);
    }

}
