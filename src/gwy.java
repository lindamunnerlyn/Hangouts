// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public class gwy
{

    private volatile qd a;

    public gwy()
    {
    }

    public String a()
    {
        qd qd1;
        for (qd1 = a; qd1 == null || SystemClock.elapsedRealtime() >= qd1.A;)
        {
            return null;
        }

        return qd1.z;
    }
}
