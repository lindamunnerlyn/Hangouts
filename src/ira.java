// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ira
    implements joj
{

    private final joj a;

    public ira(joj joj1)
    {
        a = joj1;
    }

    public Object a()
    {
        java.util.concurrent.Executor executor = iqv.a((kal)a.a());
        if (executor == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return executor;
        }
    }
}
