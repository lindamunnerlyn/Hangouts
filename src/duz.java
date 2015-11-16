// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telecom.ConnectionRequest;
import android.telecom.DisconnectCause;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;

final class duz
    implements dwk
{

    final Handler a = new Handler();
    private final Context b;
    private final dvc c;
    private final due d;
    private final dtz e;
    private final duy f;
    private final long g = System.currentTimeMillis();
    private dwh h;
    private bnk i;

    duz(Context context, dvc dvc1, TeleConnectionService teleconnectionservice, ConnectionRequest connectionrequest, due due1)
    {
        b = context;
        c = dvc1;
        d = due1;
        e = new dtz(new dvk(teleconnectionservice, connectionrequest, new dvh(teleconnectionservice, dvx.a(teleconnectionservice)), true));
        e.c();
        f = duy.a(connectionrequest.getExtras());
        e.a(f.e);
        e.b(f.g);
    }

    private void a(int j)
    {
        ebw.e("Babel_telephony", (new StringBuilder(82)).append("TeleIncomingWifiCallRequest.sendIncomingHangoutInviteResponse, status: ").append(j).toString());
        jed jed1 = new jed();
        jed1.a = Long.valueOf(f.c);
        jed1.b = f.a.g();
        jed1.g = Integer.valueOf(j);
        jeg jeg1 = new jeg();
        jeg1.a = Long.valueOf(g * 1000L);
        jeg1.b = Long.valueOf(System.currentTimeMillis() - g);
        jed1.h = jeg1;
        RealTimeChatService.a(dbf.e(f.f), jed1);
    }

    private void e()
    {
        ceu ceu = g.a(e.f().f(), g.p(), false, null, null, 0);
        bnd.a().a(f.a, false, null, null, true, ceu, 86, 1, false, SystemClock.elapsedRealtime(), g.a(e), null, e.i());
        h.a(bnd.a().t(), bof.a());
    }

    private void f()
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallRequest.cleanupRequest");
        if (i != null)
        {
            bnd.a().b(i);
            i = null;
        }
        a.removeCallbacksAndMessages(null);
        h = null;
        c.a(this);
    }

    dtz a()
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest");
        boolean flag = g.a(b, f.f, f.a);
        if (d != null && d.a(e.e(), true))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest, call is duplicate");
            e.setDisconnected(new DisconnectCause(4));
            g.a(b, f.f, f.b, 2337);
            f();
        } else
        if (!flag)
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest, pending invite was cancelled");
            e.setDisconnected(new DisconnectCause(5));
            g.a(b, f.f, f.b, 2336);
            f();
        } else
        {
            h = new dwh(b, this, null, true);
            e.a(h);
            e.setRinging();
            e.b(f.a.a());
            if (!bnd.a().n())
            {
                e();
            }
            g.a(b, e);
            g.a(b, f.f, f.b, 2336);
        }
        return e;
    }

    boolean a(boy boy1, int j)
    {
        if (f.a.equals(boy1))
        {
            if (h != null)
            {
                h.b(j);
            }
            f();
            return true;
        } else
        {
            return false;
        }
    }

    public void b()
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallRequest.onAnswer");
        if (h.n() == null && bnd.a().n())
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallRequest.onAnswer, exiting existing hangout");
            gbh.a(i);
            i = new dva(this);
            bnd.a().a(i);
            bnd.a().t().c(1006);
            return;
        } else
        {
            d();
            return;
        }
    }

    public void c()
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallRequest.onReject");
        a(2);
        f();
        if (bnd.a().t() != null)
        {
            bnd.a().t().c(1011);
        }
    }

    void d()
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallRequest.performAnswer, answering call");
        a(1);
        if (h.n() == null)
        {
            e();
        }
        bnd.a().x();
        e.setActive();
        e.v();
        f();
    }
}
