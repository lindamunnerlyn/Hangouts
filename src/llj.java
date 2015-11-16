// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class llj extends llh
{

    private final byte d[];
    private final Charset e;

    public llj(String s)
    {
        this(s, "text/plain");
    }

    private llj(String s, String s1)
    {
        super(s1);
        if (s == null)
        {
            throw new IllegalArgumentException("Text may not be null");
        } else
        {
            s1 = Charset.forName("US-ASCII");
            d = s.getBytes(s1.name());
            e = s1;
            return;
        }
    }

    public void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(d);
        byte abyte0[] = new byte[4096];
        do
        {
            int i = bytearrayinputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                outputstream.flush();
                return;
            }
        } while (true);
    }

    public String b()
    {
        return e.name();
    }

    public String c()
    {
        return "8bit";
    }

    public long d()
    {
        return (long)d.length;
    }

    public String e()
    {
        return null;
    }
}
