// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

public final class jsm extends Enum
    implements Executor
{

    public static final jsm a;
    private static final jsm b[];

    private jsm(String s)
    {
        super(s, 0);
    }

    public static jsm valueOf(String s)
    {
        return (jsm)Enum.valueOf(jsm, s);
    }

    public static jsm[] values()
    {
        return (jsm[])b.clone();
    }

    public void execute(Runnable runnable)
    {
        runnable.run();
    }

    static 
    {
        a = new jsm("INSTANCE");
        b = (new jsm[] {
            a
        });
    }
}
