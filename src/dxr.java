// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.CountDownLatch;

public final class dxr
    implements gat, gau, gaw
{

    public static dxr d;
    final CountDownLatch a = new CountDownLatch(1);
    final gaq b;
    final gbr c;
    private final Context e;

    public dxr(Context context)
    {
        e = context;
        b = ((gar)hlp.a(context, gar)).a(((gbs)hlp.a(context, gbs)).a()).a(this).a(this).a();
        b.a();
        c = (gbr)hlp.a(context, gbr);
    }

    public void a()
    {
        eev.e("Babel_telephony", "TeleFeedbackSender.onConnected");
        a.countDown();
    }

    public void a(int i)
    {
        eev.e("Babel_telephony", (new StringBuilder(59)).append("TeleFeedbackSender.onConnectionSuspended, code: ").append(i).toString());
    }

    public void a(fuu fuu1)
    {
        fuu1 = String.valueOf((fuu)fuu1);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(fuu1).length() + 29)).append("TeleFeedbackSender.onResult: ").append(fuu1).toString());
        b.b();
    }

    public void a(gap gap)
    {
        gap = String.valueOf(gap);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(gap).length() + 47)).append("TeleFeedbackSender.onConnectionFailed, result: ").append(gap).toString());
        a.countDown();
    }

    public void a(gbt gbt)
    {
        long l = g.a(e, "babel_telephony_feedback_api_timeout_millis", 5000);
        String s = String.valueOf(gbt);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 79)).append("TeleFeedbackSender.sendFeedback, options: ").append(s).append(", timeoutMillis: ").append(l).toString());
        (new dxs(this, l, gbt)).execute(new Void[0]);
    }
}
