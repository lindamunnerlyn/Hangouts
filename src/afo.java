// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.concurrent.Executor;

final class afo
    implements Executor
{

    final Handler a;
    final agd b;

    afo(agd agd, Handler handler)
    {
        b = agd;
        a = handler;
        super();
    }

    public void execute(Runnable runnable)
    {
        a.post(runnable);
    }
}
