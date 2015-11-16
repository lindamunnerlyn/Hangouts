// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class isu
    implements joj
{

    private final joj a;
    private final joj b;

    public isu(joj joj1, joj joj2)
    {
        a = joj1;
        b = joj2;
    }

    public Object a()
    {
        return new iso((ScheduledExecutorService)a.a(), (Set)b.a());
    }
}
