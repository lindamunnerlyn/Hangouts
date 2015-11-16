// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class dxs extends AsyncTask
{

    final long a;
    final gbt b;
    final dxr c;

    dxs(dxr dxr1, long l, gbt gbt)
    {
        c = dxr1;
        a = l;
        b = gbt;
        super();
    }

    private transient Void a()
    {
        try
        {
            c.a.await(a, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            eev.e("Babel_telephony", "TeleFeedbackSender.sendFeedback, exception", interruptedexception);
        }
        return null;
    }

    public Object doInBackground(Object aobj[])
    {
        return a();
    }

    public void onPostExecute(Object obj)
    {
        if (c.b.c())
        {
            eev.e("Babel_telephony", "TeleFeedbackSender.sendFeedback, calling startFeedback");
            c.c.a(c.b).a(b).a(c);
            return;
        } else
        {
            eev.e("Babel_telephony", "TeleFeedbackSender.sendFeedback, API not connected, skipping");
            return;
        }
    }
}
