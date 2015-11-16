// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class duk extends AsyncTask
{

    final long a;
    final fzf b;
    final duj c;

    duk(duj duj1, long l, fzf fzf)
    {
        c = duj1;
        a = l;
        b = fzf;
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
            ebw.e("Babel_telephony", "TeleFeedbackSender.sendFeedback, exception", interruptedexception);
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
            ebw.e("Babel_telephony", "TeleFeedbackSender.sendFeedback, calling startFeedback");
            c.c.a(c.b).a(b).a(c);
            return;
        } else
        {
            ebw.e("Babel_telephony", "TeleFeedbackSender.sendFeedback, API not connected, skipping");
            return;
        }
    }
}
