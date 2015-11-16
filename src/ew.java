// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

final class ew extends fc
{

    final eu a;

    ew(eu eu1)
    {
        a = eu1;
        super();
    }

    public Object call()
    {
        eu.a(a).set(true);
        Process.setThreadPriority(10);
        return eu.a(a, a.a());
    }
}
