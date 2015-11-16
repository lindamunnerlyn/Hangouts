// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.CountDownLatch;

public final class duj
    implements fyf, fyg, fyi
{

    public static duj d;
    final CountDownLatch a = new CountDownLatch(1);
    final fyc b;
    final fzd c;
    private final Context e;

    public duj(Context context)
    {
        e = context;
        b = ((fyd)hgx.a(context, fyd)).a(((fze)hgx.a(context, fze)).a()).a(this).a(this).a();
        b.a();
        c = (fzd)hgx.a(context, fzd);
    }

    public void a()
    {
        ebw.e("Babel_telephony", "TeleFeedbackSender.onConnected");
        a.countDown();
    }

    public void a(int i)
    {
        ebw.e("Babel_telephony", (new StringBuilder(59)).append("TeleFeedbackSender.onConnectionSuspended, code: ").append(i).toString());
    }

    public void a(fsn fsn1)
    {
        fsn1 = String.valueOf((fsn)fsn1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(fsn1).length() + 29)).append("TeleFeedbackSender.onResult: ").append(fsn1).toString());
        b.b();
    }

    public void a(fyb fyb)
    {
        fyb = String.valueOf(fyb);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(fyb).length() + 47)).append("TeleFeedbackSender.onConnectionFailed, result: ").append(fyb).toString());
        a.countDown();
    }

    public void a(fzf fzf)
    {
        long l = g.a(e, "babel_telephony_feedback_api_timeout_millis", 5000);
        String s = String.valueOf(fzf);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 79)).append("TeleFeedbackSender.sendFeedback, options: ").append(s).append(", timeoutMillis: ").append(l).toString());
        (new duk(this, l, fzf)).execute(new Void[0]);
    }
}
