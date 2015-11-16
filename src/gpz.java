// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashMap;

final class gpz
{

    int a;
    private LinkedHashMap b;

    public gpz(int i)
    {
        a = i;
        b = new gqa(this, (i << 2) / 3 + 1);
    }

    public Object a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = b.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    public void a(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        b.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }
}
