// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;

public final class ist extends Enum
    implements joj
{

    public static final ist a;
    private static final ist b[];

    private ist(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static ist valueOf(String s)
    {
        return (ist)Enum.valueOf(ist, s);
    }

    public static ist[] values()
    {
        return (ist[])b.clone();
    }

    public Object a()
    {
        java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(1);
        if (scheduledexecutorservice == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return scheduledexecutorservice;
        }
    }

    static 
    {
        a = new ist("INSTANCE");
        b = (new ist[] {
            a
        });
    }
}
