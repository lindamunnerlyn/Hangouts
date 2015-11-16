// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class kmn
{

    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b = Charset.forName("ISO-8859-1");
    public static final byte c[];
    public static final ByteBuffer d;
    public static final klr e;

    static boolean a()
    {
        return false;
    }

    static 
    {
        byte abyte0[] = new byte[0];
        c = abyte0;
        d = ByteBuffer.wrap(abyte0);
        abyte0 = c;
        e = klr.a(abyte0, 0, abyte0.length);
    }
}
