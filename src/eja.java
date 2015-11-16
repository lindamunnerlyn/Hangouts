// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class eja extends ejf
{

    final ejx a;
    final eix b;
    private int i;

    eja(eix eix1, ejx ejx1, ejx ejx2)
    {
        b = eix1;
        a = ejx2;
        super(ejx1);
        i = 5;
    }

    protected ekg a(Status status)
    {
        return status;
    }

    protected void a(ejv ejv)
    {
        if (eix.a().c() || i <= 0)
        {
            try
            {
                Thread.sleep(100L);
            }
            // Misplaced declaration of an exception variable
            catch (ejv ejv)
            {
                Thread.currentThread().interrupt();
            }
            a.d();
            return;
        } else
        {
            i = i - 1;
            eix.b().schedule(new ejb(this, this), 100L, TimeUnit.MILLISECONDS);
            return;
        }
    }
}
