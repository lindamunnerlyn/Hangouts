// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class gdw
{

    public static final gdw a = new gdw();
    private Set b;
    private final Object c = new Object();

    public gdw()
    {
        b = new HashSet();
    }

    public void a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((gdx)iterator.next()).h()) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(int i)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((gdx)iterator.next()).b(i)) { }
        break MISSING_BLOCK_LABEL_49;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(gdx gdx1)
    {
        synchronized (c)
        {
            b.add(gdx1);
        }
        return;
        gdx1;
        obj;
        JVM INSTR monitorexit ;
        throw gdx1;
    }

}
