// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class hnx
    implements hof
{

    private final hof a;
    private final int b;
    private final Level c;
    private final Logger d;

    public hnx(hof hof1, Logger logger, Level level, int i)
    {
        a = hof1;
        d = logger;
        c = level;
        b = i;
    }

    public void writeTo(OutputStream outputstream)
    {
        hnw hnw1 = new hnw(outputstream, d, c, b);
        a.writeTo(hnw1);
        hnw1.a.close();
        outputstream.flush();
        return;
        outputstream;
        hnw1.a.close();
        throw outputstream;
    }
}
