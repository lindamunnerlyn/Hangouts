// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfs
    implements joj
{

    private static final Object a = new Object();
    private final joj b;
    private volatile Object c;

    private lfs(joj joj1)
    {
        c = a;
        b = joj1;
    }

    public static joj a(joj joj1)
    {
        if (joj1 == null)
        {
            throw new NullPointerException();
        } else
        {
            return new lfs(joj1);
        }
    }

    public Object a()
    {
        Object obj;
        obj = c;
        if (obj != a)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = c;
        obj = obj1;
        if (obj1 == a)
        {
            obj = b.a();
            c = obj;
        }
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        return obj;
    }

}
