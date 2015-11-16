// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;

public final class imq extends Enum
    implements kxx
{

    public static final imq a;
    private static final imq b[];

    private imq(String s)
    {
        super(s, 0);
    }

    public static kxx b()
    {
        return a;
    }

    public static imq valueOf(String s)
    {
        return (imq)Enum.valueOf(imq, s);
    }

    public static imq[] values()
    {
        return (imq[])b.clone();
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
        a = new imq("INSTANCE");
        b = (new imq[] {
            a
        });
    }
}
