// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.io.OutputStream;

public final class jyr
{

    static final byte a[] = new byte[8192];
    private static final OutputStream b = new jys();

    public static long a(InputStream inputstream, OutputStream outputstream)
    {
        n.b(inputstream);
        n.b(outputstream);
        byte abyte0[] = new byte[8192];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

}
