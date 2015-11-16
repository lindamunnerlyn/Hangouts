// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class bju
    implements Runnable
{

    final bjq a;

    bju(bjq bjq1)
    {
        a = bjq1;
        super();
    }

    public void run()
    {
        if (bjq.a(a) != null)
        {
            bjq.a(a).a();
        }
        bjq.h(a).postDelayed(bjq.g(a), 50L);
    }
}
