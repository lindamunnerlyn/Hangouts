// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class emb extends emg
{

    final emy a;
    final ely b;
    private int i;

    emb(ely ely1, emy emy1, emy emy2)
    {
        b = ely1;
        a = emy2;
        super(emy1);
        i = 5;
    }

    protected enh a(Status status)
    {
        return status;
    }

    protected void a(emw emw)
    {
        if (ely.a().c() || i <= 0)
        {
            try
            {
                Thread.sleep(100L);
            }
            // Misplaced declaration of an exception variable
            catch (emw emw)
            {
                Thread.currentThread().interrupt();
            }
            a.d();
            return;
        } else
        {
            i = i - 1;
            ely.b().schedule(new emc(this, this), 100L, TimeUnit.MILLISECONDS);
            return;
        }
    }
}
