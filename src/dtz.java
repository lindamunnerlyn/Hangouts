// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.telecom.AudioState;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dtz extends Connection
{

    private static final IntentFilter a = new IntentFilter("com.google.android.intent.action.CALL_STATE_BUTTON_TOUCHED");
    private final Handler b;
    private final List c;
    private final dvk d;
    private final String e;
    private final dtq f;
    private dtr g;
    private dun h;
    private boolean i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private StringBuilder o;
    private String p;
    private BroadcastReceiver q;
    private dub r;
    private boolean s;
    private boolean t;
    private duh u;
    private dtx v;

    public dtz(dvk dvk1)
    {
        this(dvk1, null);
    }

    dtz(dvk dvk1, String s1)
    {
        b = new Handler();
        c = new ArrayList();
        o = new StringBuilder();
        p = "";
        d = dvk1;
        String s2 = s1;
        if (s1 == null)
        {
            new gkh();
            s2 = gkh.a();
        }
        e = s2;
        setInitializing();
        setAddress(dvk1.h().getAddress(), 1);
        setConnectionCapabilities(66);
        f = new dtq(e);
        f.a(new int[] {
            200
        });
    }

    static dtq a(dtz dtz1)
    {
        return dtz1.f;
    }

    static dtr b(dtz dtz1)
    {
        return dtz1.g;
    }

    static void c(dtz dtz1)
    {
        String s1 = String.valueOf(dtz1.g);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 43)).append("TeleConnection.performManualHandoff, call: ").append(s1).toString());
        if (!dun.a(dtz1.d()))
        {
            ebw.e("Babel_telephony", "TeleConnection.performManualHandoff, manual handoff not allowed");
        } else
        if (dtz1.g != null)
        {
            dtz1.g.c();
            return;
        }
    }

    private void x()
    {
        TeleConnectionService teleconnectionservice = d();
        boolean flag;
        if (g != null && getState() == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && q == null)
        {
            ebw.e("Babel_telephony", "TeleConnection.updateHandoffReceiver, registering receiver");
            q = new duc(this);
            teleconnectionservice.registerReceiver(q, a);
        } else
        if (!flag && q != null)
        {
            ebw.e("Babel_telephony", "updateHandoffReceiver, unregistering receiver");
            teleconnectionservice.unregisterReceiver(q);
            q = null;
            return;
        }
    }

    dtq a()
    {
        return f;
    }

    void a(int i1, long l1)
    {
        StringBuilder stringbuilder = o;
        String s1;
        if (i1 == 2)
        {
            s1 = "w";
        } else
        {
            s1 = "c";
        }
        stringbuilder.append(s1);
        o.append(l1);
    }

    void a(dtr dtr1)
    {
        b(dtr1);
    }

    void a(dub dub1)
    {
        r = dub1;
    }

    public void a(dud dud1)
    {
        c.add(dud1);
    }

    void a(duh duh)
    {
        u = duh;
    }

    void a(dun dun1)
    {
        String s1 = String.valueOf(h);
        String s2 = String.valueOf(dun1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 38 + String.valueOf(s2).length())).append("TeleConnection.setPendingHandoff, ").append(s1).append(" -> ").append(s2).toString());
        h = dun1;
        if (h != null)
        {
            i = true;
        }
    }

    void a(String s1)
    {
        j = s1;
    }

    public void a(boolean flag)
    {
        s = flag;
    }

    void b()
    {
        d.a(1);
    }

    void b(dtr dtr1)
    {
        String s1 = String.valueOf(g);
        String s2 = String.valueOf(dtr1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 28 + String.valueOf(s2).length())).append("TeleConnection.setCall, ").append(s1).append(" -> ").append(s2).toString());
        if (g != null)
        {
            g.a(null);
        }
        g = dtr1;
        if (g != null)
        {
            g.a(this);
            if (u != null)
            {
                g.a(u);
            }
        }
        x();
    }

    public void b(dud dud1)
    {
        c.remove(dud1);
    }

    void b(String s1)
    {
        k = s1;
    }

    public void b(boolean flag)
    {
        t = flag;
    }

    void c()
    {
        d.a(2);
    }

    void c(String s1)
    {
        l = s1;
    }

    public TeleConnectionService d()
    {
        return d.j();
    }

    void d(String s1)
    {
        m = s1;
    }

    ConnectionRequest e()
    {
        return d.i();
    }

    void e(String s1)
    {
        n = s1;
    }

    public dvk f()
    {
        return d;
    }

    public boolean g()
    {
        return d.k();
    }

    public dvh h()
    {
        return d.b();
    }

    public String i()
    {
        return e;
    }

    public dtr j()
    {
        return g;
    }

    dun k()
    {
        return h;
    }

    public boolean l()
    {
        return i;
    }

    public String m()
    {
        return j;
    }

    public String n()
    {
        return k;
    }

    public String o()
    {
        return l;
    }

    public void onAbort()
    {
        ebw.e("Babel_telephony", "TeleConnection.onAbort");
        if (g != null)
        {
            g.i();
        }
    }

    public void onAnswer()
    {
        ebw.e("Babel_telephony", "TeleConnection.onAnswer");
        if (g != null)
        {
            g.l();
        }
    }

    public void onAudioStateChanged(AudioState audiostate)
    {
        String s1 = String.valueOf(audiostate);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 43)).append("TeleConnection.onAudioStateChanged, state: ").append(s1).toString());
        if (g != null)
        {
            g.a(audiostate);
        }
    }

    public void onDisconnect()
    {
        ebw.e("Babel_telephony", "TeleConnection.onDisconnect");
        if (h != null)
        {
            h.e();
        } else
        {
            if (g != null)
            {
                g.g();
                return;
            }
            if (r != null)
            {
                r.a();
                return;
            }
        }
    }

    public void onHold()
    {
        ebw.e("Babel_telephony", "TeleConnection.onHold");
        if (g != null)
        {
            g.j();
        }
    }

    public void onPlayDtmfTone(char c1)
    {
        Object obj = String.valueOf(ebw.b(String.valueOf(c1)));
        if (((String) (obj)).length() != 0)
        {
            obj = "TeleConnection.onPlayDtmfTone, c: ".concat(((String) (obj)));
        } else
        {
            obj = new String("TeleConnection.onPlayDtmfTone, c: ");
        }
        ebw.e("Babel_telephony", ((String) (obj)));
        if (g != null)
        {
            g.a(c1);
        }
        obj = ebw.s;
    }

    public void onPostDialContinue(boolean flag)
    {
        ebw.e("Babel_telephony", (new StringBuilder(49)).append("TeleConnection.onPostDialContinue, proceed: ").append(flag).toString());
        if (g != null)
        {
            g.b(flag);
        }
    }

    public void onReject()
    {
        ebw.e("Babel_telephony", "TeleConnection.onReject");
        if (g != null)
        {
            g.m();
        }
    }

    public void onSeparate()
    {
        ebw.e("Babel_telephony", "TeleConnection.onSeparate");
        if (g != null)
        {
            g.h();
        }
    }

    public void onStateChanged(int i1)
    {
        if (i1 == 6)
        {
            dua dua1 = new dua(this);
            b.postDelayed(dua1, 15000L);
        }
        ebw.e("Babel_telephony", "TeleConnection.onStateChanged");
        if (g != null)
        {
            g.a(i1);
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((dud)iterator.next()).a(this, i1)) { }
        x();
    }

    public void onStopDtmfTone()
    {
        ebw.e("Babel_telephony", "TeleConnection.onStopDtmfTone");
        if (g != null)
        {
            g.f();
        }
    }

    public void onUnhold()
    {
        ebw.e("Babel_telephony", "TeleConnection.onUnhold");
        if (g != null)
        {
            g.k();
        }
    }

    public String p()
    {
        return m;
    }

    public String q()
    {
        return n;
    }

    public duh r()
    {
        return u;
    }

    public String s()
    {
        return o.toString();
    }

    public boolean t()
    {
        return s;
    }

    public String toString()
    {
        String s1 = String.valueOf(e);
        if (s1.length() != 0)
        {
            return "connection: ".concat(s1);
        } else
        {
            return new String("connection: ");
        }
    }

    public boolean u()
    {
        return t;
    }

    public void v()
    {
        ebw.e("Babel_telephony", "TeleConnection.startConnectingSound");
        if (v == null)
        {
            v = dtx.a(d(), g());
        }
    }

    public void w()
    {
        ebw.e("Babel_telephony", "TeleConnection.stopConnectingSound");
        if (v != null)
        {
            v.a();
            v = null;
        }
    }

}
