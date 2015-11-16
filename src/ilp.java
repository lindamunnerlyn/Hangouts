// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ilp
    implements kxx
{

    private final kxx a;

    public ilp(kxx kxx1)
    {
        a = kxx1;
    }

    public Object a()
    {
        java.util.concurrent.Executor executor = ili.a((jsl)a.a());
        if (executor == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return executor;
        }
    }
}
