// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

public class cef
    implements aqb
{

    final ced a;

    public cef(ced ced1)
    {
        a = ced1;
        super();
        synchronized (ced1.w)
        {
            ced1.w.add(this);
        }
        return;
        ced1;
        set;
        JVM INSTR monitorexit ;
        throw ced1;
    }

    public void a(ebh ebh, eab eab, boolean flag, apw apw, boolean flag1)
    {
        synchronized (a.w)
        {
            a.w.remove(this);
        }
        ced.a(a);
        return;
        eab;
        ebh;
        JVM INSTR monitorexit ;
        throw eab;
    }
}
