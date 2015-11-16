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

public final class dxh extends Connection
{

    private static final IntentFilter a = new IntentFilter("com.google.android.intent.action.CALL_STATE_BUTTON_TOUCHED");
    private static int b = 0;
    private final Handler c;
    private final List d;
    private final dyt e;
    private final String f;
    private final dwy g;
    private dwz h;
    private dxv i;
    private boolean j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private StringBuilder p;
    private String q;
    private BroadcastReceiver r;
    private dxj s;
    private boolean t;
    private boolean u;
    private dxp v;
    private dxf w;
    private int x;

    public dxh(dyt dyt1)
    {
        this(dyt1, null);
    }

    dxh(dyt dyt1, String s1)
    {
        c = new Handler();
        d = new ArrayList();
        p = new StringBuilder();
        q = "";
        e = dyt1;
        String s2 = s1;
        if (s1 == null)
        {
            new gnj();
            s2 = gnj.a();
        }
        f = s2;
        setInitializing();
        setAddress(dyt1.h().getAddress(), 1);
        setConnectionCapabilities(66);
        g = new dwy(f);
        g.a(new int[] {
            200
        });
        b++;
        x = b;
    }

    static dwy a(dxh dxh1)
    {
        return dxh1.g;
    }

    static dwz b(dxh dxh1)
    {
        return dxh1.h;
    }

    static void c(dxh dxh1)
    {
        String s1 = String.valueOf(dxh1.h);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 43)).append("TeleConnection.performManualHandoff, call: ").append(s1).toString());
        if (!dxv.a(dxh1.d()))
        {
            eev.e("Babel_telephony", "TeleConnection.performManualHandoff, manual handoff not allowed");
        } else
        if (dxh1.h != null)
        {
            dxh1.h.c();
            return;
        }
    }

    private void x()
    {
        TeleConnectionService teleconnectionservice = d();
        boolean flag;
        if (h != null && getState() == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && r == null)
        {
            eev.e("Babel_telephony", "TeleConnection.updateHandoffReceiver, registering receiver");
            r = new dxk(this);
            teleconnectionservice.registerReceiver(r, a);
        } else
        if (!flag && r != null)
        {
            eev.e("Babel_telephony", "updateHandoffReceiver, unregistering receiver");
            teleconnectionservice.unregisterReceiver(r);
            r = null;
            return;
        }
    }

    dwy a()
    {
        return g;
    }

    void a(int i1, long l1)
    {
        StringBuilder stringbuilder = p;
        String s1;
        if (i1 == 2)
        {
            s1 = "w";
        } else
        {
            s1 = "c";
        }
        stringbuilder.append(s1);
        p.append(l1);
    }

    void a(dwz dwz1)
    {
        b(dwz1);
    }

    void a(dxj dxj1)
    {
        s = dxj1;
    }

    public void a(dxl dxl1)
    {
        d.add(dxl1);
    }

    void a(dxp dxp)
    {
        v = dxp;
    }

    void a(dxv dxv1)
    {
        String s1 = String.valueOf(i);
        String s2 = String.valueOf(dxv1);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 38 + String.valueOf(s2).length())).append("TeleConnection.setPendingHandoff, ").append(s1).append(" -> ").append(s2).toString());
        i = dxv1;
        if (i != null)
        {
            j = true;
        }
    }

    void a(String s1)
    {
        k = s1;
    }

    public void a(boolean flag)
    {
        t = flag;
    }

    void b()
    {
        e.a(1);
    }

    void b(dwz dwz1)
    {
        String s1 = String.valueOf(h);
        String s2 = String.valueOf(dwz1);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 28 + String.valueOf(s2).length())).append("TeleConnection.setCall, ").append(s1).append(" -> ").append(s2).toString());
        if (h != null)
        {
            h.a(null);
        }
        h = dwz1;
        if (h != null)
        {
            h.a(this);
            if (v != null)
            {
                h.a(v);
            }
        }
        x();
    }

    public void b(dxl dxl1)
    {
        d.remove(dxl1);
    }

    void b(String s1)
    {
        l = s1;
    }

    public void b(boolean flag)
    {
        u = flag;
    }

    void c()
    {
        e.a(2);
    }

    void c(String s1)
    {
        m = s1;
    }

    public TeleConnectionService d()
    {
        return e.j();
    }

    void d(String s1)
    {
        n = s1;
    }

    ConnectionRequest e()
    {
        return e.i();
    }

    void e(String s1)
    {
        o = s1;
    }

    public dyt f()
    {
        return e;
    }

    public boolean g()
    {
        return e.k();
    }

    public dyq h()
    {
        return e.b();
    }

    public String i()
    {
        return f;
    }

    public dwz j()
    {
        return h;
    }

    dxv k()
    {
        return i;
    }

    public boolean l()
    {
        return j;
    }

    public String m()
    {
        return k;
    }

    public String n()
    {
        return l;
    }

    public String o()
    {
        return m;
    }

    public void onAbort()
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 22)).append("TeleConnection.onAbort").append(s1).toString());
        if (h != null)
        {
            h.i();
        }
    }

    public void onAnswer()
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 23)).append("TeleConnection.onAnswer").append(s1).toString());
        if (h != null)
        {
            h.l();
        }
    }

    public void onAudioStateChanged(AudioState audiostate)
    {
        String s1 = String.valueOf(audiostate);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 43)).append("TeleConnection.onAudioStateChanged, state: ").append(s1).toString());
        if (h != null)
        {
            h.a(audiostate);
        }
    }

    public void onDisconnect()
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 27)).append("TeleConnection.onDisconnect").append(s1).toString());
        if (i != null)
        {
            i.e();
        } else
        {
            if (h != null)
            {
                h.g();
                return;
            }
            if (s != null)
            {
                s.a();
                return;
            }
        }
    }

    public void onHold()
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 21)).append("TeleConnection.onHold").append(s1).toString());
        if (h != null)
        {
            h.j();
        }
    }

    public void onPlayDtmfTone(char c1)
    {
        Object obj = String.valueOf(eev.b(String.valueOf(c1)));
        if (((String) (obj)).length() != 0)
        {
            obj = "TeleConnection.onPlayDtmfTone, c: ".concat(((String) (obj)));
        } else
        {
            obj = new String("TeleConnection.onPlayDtmfTone, c: ");
        }
        eev.e("Babel_telephony", ((String) (obj)));
        if (h != null)
        {
            h.a(c1);
        }
        obj = eev.s;
    }

    public void onPostDialContinue(boolean flag)
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 49)).append("TeleConnection.onPostDialContinue, proceed: ").append(flag).append(s1).toString());
        if (h != null)
        {
            h.b(flag);
        }
    }

    public void onReject()
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 23)).append("TeleConnection.onReject").append(s1).toString());
        if (h != null)
        {
            h.m();
        }
    }

    public void onSeparate()
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 25)).append("TeleConnection.onSeparate").append(s1).toString());
        if (h != null)
        {
            h.h();
        }
    }

    public void onStateChanged(int i1)
    {
        if (i1 == 6)
        {
            dxi dxi1 = new dxi(this);
            c.postDelayed(dxi1, 15000L);
        }
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 29)).append("TeleConnection.onStateChanged").append(s1).toString());
        if (h != null)
        {
            h.a(i1);
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((dxl)iterator.next()).a(this, i1)) { }
        x();
    }

    public void onStopDtmfTone()
    {
        eev.e("Babel_telephony", "TeleConnection.onStopDtmfTone");
        if (h != null)
        {
            h.f();
        }
    }

    public void onUnhold()
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 23)).append("TeleConnection.onUnhold").append(s1).toString());
        if (h != null)
        {
            h.k();
        }
    }

    public String p()
    {
        return n;
    }

    public String q()
    {
        return o;
    }

    public dxp r()
    {
        return v;
    }

    public String s()
    {
        return p.toString();
    }

    public boolean t()
    {
        return t;
    }

    public String toString()
    {
        int i1 = x;
        String s1 = String.valueOf(Connection.stateToString(getState()));
        return (new StringBuilder(String.valueOf(s1).length() + 33)).append(" connection: ").append(i1).append(" ,state: ").append(s1).toString();
    }

    public boolean u()
    {
        return u;
    }

    public void v()
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 35)).append("TeleConnection.startConnectingSound").append(s1).toString());
        if (w == null)
        {
            Object obj = d();
            boolean flag = g();
            eev.e("Babel_telephony", "TeleConnectingSoundPlayer.startConnectingSoundIfNecessary");
            int i1;
            if (flag)
            {
                i1 = g.a(((Context) (obj)), "babel_connecting_sound_incoming_delay_millis", 0);
            } else
            {
                i1 = g.a(((Context) (obj)), "babel_connecting_sound_outgoing_delay_millis", -1);
            }
            if (i1 < 0)
            {
                eev.e("Babel_telephony", "TeleConnectingSoundPlayer.startConnectingSoundIfNecessary, disabled");
                obj = null;
            } else
            {
                obj = new dxf(((Context) (obj)), i1);
                ((dxf) (obj)).a();
            }
            w = ((dxf) (obj));
        }
    }

    public void w()
    {
        String s1 = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 34)).append("TeleConnection.stopConnectingSound").append(s1).toString());
        if (w != null)
        {
            w.b();
            w = null;
        }
    }

}
