// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class lli extends llh
{

    private final File d;
    private final String e;
    private final String f;

    public lli(File file)
    {
        this(file, "application/octet-stream", (byte)0);
    }

    private lli(File file, String s)
    {
        this(file, s, ((String) (null)));
    }

    private lli(File file, String s, byte byte0)
    {
        this(file, s);
    }

    private lli(File file, String s, String s1)
    {
        super(s);
        if (file == null)
        {
            throw new IllegalArgumentException("File may not be null");
        } else
        {
            d = file;
            e = file.getName();
            f = null;
            return;
        }
    }

    public void a(OutputStream outputstream)
    {
        FileInputStream fileinputstream;
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        fileinputstream = new FileInputStream(d);
        byte abyte0[] = new byte[4096];
_L1:
        int i = fileinputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        outputstream;
        fileinputstream.close();
        throw outputstream;
        outputstream.flush();
        fileinputstream.close();
        return;
    }

    public String b()
    {
        return f;
    }

    public String c()
    {
        return "binary";
    }

    public long d()
    {
        return d.length();
    }

    public String e()
    {
        return e;
    }
}
