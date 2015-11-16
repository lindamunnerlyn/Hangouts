// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public class gsm
{

    private volatile qb a;

    public gsm()
    {
    }

    public String a()
    {
        qb qb1;
        for (qb1 = a; qb1 == null || SystemClock.elapsedRealtime() >= qb1.A;)
        {
            return null;
        }

        return qb1.z;
    }
}
