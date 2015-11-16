// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class hsr extends FilterInputStream
{

    private final hsq a;

    public hsr(InputStream inputstream, Logger logger, Level level, int i)
    {
        super(inputstream);
        a = new hsq(logger, level, i);
    }

    public void close()
    {
        a.close();
        super.close();
    }

    public int read()
    {
        int i = super.read();
        a.write(i);
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        j = super.read(abyte0, i, j);
        if (j > 0)
        {
            a.write(abyte0, i, j);
        }
        return j;
    }
}
