// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class hst
    implements htb
{

    private final htb a;
    private final int b;
    private final Level c;
    private final Logger d;

    public hst(htb htb1, Logger logger, Level level, int i)
    {
        a = htb1;
        d = logger;
        c = level;
        b = i;
    }

    public void writeTo(OutputStream outputstream)
    {
        hss hss1 = new hss(outputstream, d, c, b);
        a.writeTo(hss1);
        hss1.a.close();
        outputstream.flush();
        return;
        outputstream;
        hss1.a.close();
        throw outputstream;
    }
}
