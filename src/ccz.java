// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FileOutputStream;
import java.io.OutputStream;

public final class ccz
{

    final cdb a;
    boolean b;
    final ccx c;

    ccz(ccx ccx1, cdb cdb1)
    {
        c = ccx1;
        super();
        a = cdb1;
    }

    public OutputStream a()
    {
        ccx ccx1 = c;
        ccx1;
        JVM INSTR monitorenter ;
        if (a.d != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        ccx1;
        JVM INSTR monitorexit ;
        throw exception;
        cda cda1 = new cda(this, new FileOutputStream(a.b(0)));
        ccx1;
        JVM INSTR monitorexit ;
        return cda1;
    }

    public void b()
    {
        if (b)
        {
            ccx.a(c, this, false);
            c.c(a.a);
            return;
        } else
        {
            ccx.a(c, this, true);
            return;
        }
    }

    public void c()
    {
        ccx.a(c, this, false);
    }
}
