// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

public final class kan extends Enum
    implements Executor
{

    public static final kan a;
    private static final kan b[];

    private kan(String s)
    {
        super(s, 0);
    }

    public static kan valueOf(String s)
    {
        return (kan)Enum.valueOf(kan, s);
    }

    public static kan[] values()
    {
        return (kan[])b.clone();
    }

    public void execute(Runnable runnable)
    {
        runnable.run();
    }

    public String toString()
    {
        return "MoreExecutors.directExecutor()";
    }

    static 
    {
        a = new kan("INSTANCE");
        b = (new kan[] {
            a
        });
    }
}
