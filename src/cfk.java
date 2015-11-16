// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

public class cfk
    implements aqs
{

    final cfi a;

    public cfk(cfi cfi1)
    {
        a = cfi1;
        super();
        synchronized (cfi1.w)
        {
            cfi1.w.add(this);
        }
        return;
        cfi1;
        set;
        JVM INSTR monitorexit ;
        throw cfi1;
    }

    public void a(eef eef, edf edf, boolean flag, aqn aqn, boolean flag1)
    {
        synchronized (a.w)
        {
            a.w.remove(this);
        }
        cfi.a(a);
        return;
        edf;
        eef;
        JVM INSTR monitorexit ;
        throw edf;
    }
}
