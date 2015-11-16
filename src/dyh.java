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

final class dyh
    implements dzu
{

    final Handler a = new Handler();
    private final Context b;
    private final dyk c;
    private final dxm d;
    private final dxh e;
    private final dyg f;
    private final long g = System.currentTimeMillis();
    private dzr h;
    private bns i;

    dyh(Context context, dyk dyk1, TeleConnectionService teleconnectionservice, ConnectionRequest connectionrequest, dxm dxm1)
    {
        b = context;
        c = dyk1;
        d = dxm1;
        e = new dxh(new dyt(teleconnectionservice, connectionrequest, new dyq(teleconnectionservice, dzg.a(teleconnectionservice)), true));
        e.c();
        f = dyg.a(connectionrequest.getExtras());
        e.a(f.e);
        e.b(f.g);
    }

    private void a(int j)
    {
        eev.e("Babel_telephony", (new StringBuilder(82)).append("TeleIncomingWifiCallRequest.sendIncomingHangoutInviteResponse, status: ").append(j).toString());
        jkp jkp1 = new jkp();
        jkp1.a = Long.valueOf(f.c);
        jkp1.b = f.a.g();
        jkp1.g = Integer.valueOf(j);
        jks jks1 = new jks();
        jks1.a = Long.valueOf(g * 1000L);
        jks1.b = Long.valueOf(System.currentTimeMillis() - g);
        jkp1.h = jks1;
        RealTimeChatService.a(dcn.e(f.f), jkp1);
    }

    private void e()
    {
        cfz cfz = g.a(e.f().f(), g.o(), false, null, null, 0);
        bnk.a().a(f.a, false, null, null, true, cfz, 86, 1, false, SystemClock.elapsedRealtime(), g.a(e), null, e.i());
        h.a(bnk.a().s(), boo.a());
    }

    private void f()
    {
        eev.e("Babel_telephony", "TeleIncomingWifiCallRequest.cleanupRequest");
        if (i != null)
        {
            bnk.a().b(i);
            i = null;
        }
        a.removeCallbacksAndMessages(null);
        h = null;
        c.a(this);
    }

    dxh a()
    {
        eev.e("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest");
        boolean flag = g.a(b, f.f, f.a);
        if (d != null && d.a(e.e(), true))
        {
            eev.e("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest, call is duplicate");
            e.setDisconnected(new DisconnectCause(4));
            g.a(b, f.f, f.b, 2337);
            f();
        } else
        if (!flag)
        {
            eev.e("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest, pending invite was cancelled");
            e.setDisconnected(new DisconnectCause(5));
            g.a(b, f.f, f.b, 2336);
            f();
        } else
        {
            h = new dzr(b, this, null, true);
            e.a(h);
            e.setRinging();
            e.b(f.a.a());
            if (!bnk.a().m())
            {
                e();
            }
            g.a(b, e);
            g.a(b, f.f, f.b, 2336);
        }
        return e;
    }

    boolean a(bph bph1, int j)
    {
        if (f.a.equals(bph1))
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
        eev.e("Babel_telephony", "TeleIncomingWifiCallRequest.onAnswer");
        if (h.n() == null && bnk.a().m())
        {
            eev.e("Babel_telephony", "TeleIncomingWifiCallRequest.onAnswer, exiting existing hangout");
            gdv.a("Expected null", i);
            i = new dyi(this);
            bnk.a().a(i);
            bnk.a().s().c(1006);
            return;
        } else
        {
            d();
            return;
        }
    }

    public void c()
    {
        eev.e("Babel_telephony", "TeleIncomingWifiCallRequest.onReject");
        a(2);
        f();
        if (bnk.a().s() != null)
        {
            bnk.a().s().c(1011);
        }
    }

    void d()
    {
        eev.e("Babel_telephony", "TeleIncomingWifiCallRequest.performAnswer, answering call");
        a(1);
        if (h.n() == null)
        {
            e();
        }
        bnk.a().v();
        e.setActive();
        e.v();
        f();
    }
}
