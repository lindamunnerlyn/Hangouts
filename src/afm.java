// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.concurrent.Executor;

final class afm
    implements Executor
{

    final Handler a;
    final agb b;

    afm(agb agb, Handler handler)
    {
        b = agb;
        a = handler;
        super();
    }

    public void execute(Runnable runnable)
    {
        a.post(runnable);
    }
}
