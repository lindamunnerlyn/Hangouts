// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FileOutputStream;
import java.io.OutputStream;

public final class cbu
{

    final cbw a;
    boolean b;
    final cbs c;

    cbu(cbs cbs1, cbw cbw1)
    {
        c = cbs1;
        super();
        a = cbw1;
    }

    public OutputStream a()
    {
        cbs cbs1 = c;
        cbs1;
        JVM INSTR monitorenter ;
        if (a.d != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        cbs1;
        JVM INSTR monitorexit ;
        throw exception;
        cbv cbv1 = new cbv(this, new FileOutputStream(a.b(0)));
        cbs1;
        JVM INSTR monitorexit ;
        return cbv1;
    }

    public void b()
    {
        if (b)
        {
            cbs.a(c, this, false);
            c.c(a.a);
            return;
        } else
        {
            cbs.a(c, this, true);
            return;
        }
    }

    public void c()
    {
        cbs.a(c, this, false);
    }
}
