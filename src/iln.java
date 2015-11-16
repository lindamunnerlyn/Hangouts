// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iln
    implements kxx
{

    private final kxx a;

    public iln(kxx kxx1)
    {
        a = kxx1;
    }

    public Object a()
    {
        java.util.concurrent.Executor executor = ili.b((jsl)a.a());
        if (executor == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return executor;
        }
    }
}
