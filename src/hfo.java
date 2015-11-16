// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class hfo
{

    static qd a = null;
    private static final long b = hpt.a("picasasync.metrics.time");
    private static final ThreadLocal c = new hfp();

    public static void a()
    {
        Object obj = (ArrayList)c.get();
        int i = ((ArrayList) (obj)).size();
        if (i > 0)
        {
            obj = (qd)((ArrayList) (obj)).get(i - 1);
            obj.C = (int)((long)((qd) (obj)).C + 1L);
        }
    }

    public static void a(long l)
    {
        Object obj = (ArrayList)c.get();
        int i = ((ArrayList) (obj)).size();
        if (i > 0)
        {
            obj = (qd)((ArrayList) (obj)).get(i - 1);
            obj.B = ((qd) (obj)).B + l;
        }
    }

}
