// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.WeakReference;

public abstract class gyv
{

    WeakReference a;
    private Object b;
    private boolean c;

    public gyv()
    {
        c = false;
    }

    public abstract Object a();

    final void a(int i)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (20 > i) goto _L2; else goto _L1
_L1:
        b = obj;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = a.get();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final Object b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            c = true;
            gyw.a(this);
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        Object obj1;
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj1 = g.e(a());
        b = obj1;
        a = new WeakReference(b);
        this;
        JVM INSTR monitorexit ;
        return obj1;
_L2:
        obj = a.get();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final int hashCode()
    {
        return super.hashCode();
    }
}
