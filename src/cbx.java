// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.InputStream;

public final class cbx
    implements Closeable
{

    final cbs a;
    private final String b;
    private final long c;
    private final InputStream d[];

    cbx(cbs cbs1, String s, long l, InputStream ainputstream[])
    {
        a = cbs1;
        super();
        b = s;
        c = l;
        d = ainputstream;
    }

    public InputStream a()
    {
        return d[0];
    }

    public void close()
    {
        InputStream ainputstream[] = d;
        int j = ainputstream.length;
        for (int i = 0; i < j; i++)
        {
            cbs.a(ainputstream[i]);
        }

    }
}
