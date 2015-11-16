// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;

final class dun
    implements dts
{

    boolean a;
    private final Context b;
    private final dtz c;
    private final duq d;
    private final dtr e;
    private dtr f;
    private dtz g;
    private int h;
    private int i;
    private int j;
    private DisconnectCause k;
    private boolean l;
    private Handler m;
    private final Runnable n = new duo(this);

    private dun(Context context, dtz dtz1, duq duq1, int i1)
    {
        i = 1;
        j = 1;
        m = new Handler();
        b = context;
        c = dtz1;
        d = duq1;
        h = i1;
        e = dtz1.j();
        e.a(this);
        i = dtz1.getState();
        dtz1.a(this);
        e.b();
    }

    private void a(int i1)
    {
        if (c.getState() == i1) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 1 6: default 52
    //                   1 52
    //                   2 53
    //                   3 61
    //                   4 69
    //                   5 77
    //                   6 85;
           goto _L2 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        return;
_L3:
        c.setRinging();
        return;
_L4:
        c.setDialing();
        return;
_L5:
        c.setActive();
        return;
_L6:
        c.setOnHold();
        return;
_L7:
        gbh.b(k);
        c.setDisconnected(k);
        c.destroy();
        c.b(null);
        return;
    }

    static void a(Context context, dtz dtz1, int i1)
    {
        ebw.e("Babel_telephony", (new StringBuilder(64)).append("TeleHandoffController.handoffWifiToCellular, reason: ").append(i1).toString());
        if (dtz1.k() != null)
        {
            if (i1 == 3)
            {
                ebw.e("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, notify handoff about network loss.");
                context = dtz1.k();
                if (((dun) (context)).h != 3)
                {
                    context.h = 3;
                    if (((dun) (context)).f != null)
                    {
                        context.a(true, 0);
                    }
                }
            }
            ebw.e("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, handoff pending, skipping");
            return;
        } else
        {
            dur dur1 = new dur(context, (TelecomManager)dtz1.d().getSystemService("telecom"));
            dur1.a(new dun(context, dtz1, dur1, i1));
            dur1.a();
            return;
        }
    }

    static boolean a(Context context)
    {
        return g.a(context).a("babel_manual_handoff_allowed", false);
    }

    static void b(Context context, dtz dtz1, int i1)
    {
        ebw.e("Babel_telephony", (new StringBuilder(64)).append("TeleHandoffController.handoffCellularToWifi, reason: ").append(i1).toString());
        if (dtz1.k() != null)
        {
            ebw.e("Babel_telephony", "TeleHandoffController.handoffCellularToWifi, handoff pending, skipping");
            return;
        } else
        {
            dum dum1 = new dum(context, bof.a(), bnd.a());
            dum1.a(new dun(context, dtz1, dum1, i1));
            dum1.a();
            return;
        }
    }

    dtz a()
    {
        return c;
    }

    void a(dtr dtr1)
    {
        String s = String.valueOf(dtr1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 52)).append("TeleHandoffController.onHandoffStarted, theNewCall: ").append(s).toString());
        int i1 = g.a(b, "babel_handoff_timeout_millis", 30000);
        m.postDelayed(n, i1);
        f = dtr1;
        f.a(this);
        g = new dtz(e.a().f(), e.a().i());
        g.setDialing();
        g.b(f);
        if (h == 3)
        {
            a(true, 0);
            return;
        } else
        {
            h();
            return;
        }
    }

    public final void a(dtr dtr1, int i1)
    {
        ebw.e("Babel_telephony", "TeleHandoffController.onTeleCallStateChanged");
        if (i1 == 6) goto _L2; else goto _L1
_L1:
        if (dtr1 != e) goto _L4; else goto _L3
_L3:
        i = i1;
_L6:
        h();
_L2:
        return;
_L4:
        if (dtr1 == f)
        {
            j = i1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(dtr dtr1, DisconnectCause disconnectcause)
    {
        ebw.e("Babel_telephony", "TeleHandoffController.onDisconnected");
        if (dtr1 != e) goto _L2; else goto _L1
_L1:
        i = 6;
_L4:
        k = disconnectcause;
        h();
        return;
_L2:
        if (dtr1 == f)
        {
            j = 6;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(boolean flag, int i1)
    {
        if (!l)
        {
            l = true;
            ebw.e("Babel_telephony", String.format("TeleHandoffController.onHandoffComplete(%b, %s)", new Object[] {
                Boolean.valueOf(flag), Integer.valueOf(i1)
            }));
            e.b(this);
            if (f != null)
            {
                f.b(this);
                if (!flag)
                {
                    f.a(h, i1);
                }
            }
            if (g != null)
            {
                if (flag && !TextUtils.isEmpty(g.m()))
                {
                    c.a(g.m());
                }
                g.b(null);
                g = null;
            }
            c.a(null);
            m.removeCallbacks(n);
            if (flag)
            {
                dtr dtr1 = f;
                dtr1.a(true);
                m.postDelayed(new dup(this, dtr1), 1000L);
                c.b(f);
                a(j);
                e.a(h, i1);
                return;
            }
            a(i);
            e.b();
            if (h == 3)
            {
                e.a(h, i1);
                return;
            }
        }
    }

    int b()
    {
        return i;
    }

    int c()
    {
        return j;
    }

    boolean d()
    {
        return a;
    }

    void e()
    {
        ebw.e("Babel_telephony", "TeleHandoffController.cancelHandoffAndEndCall");
        if (f != null)
        {
            f.g();
        }
        if (e != null)
        {
            e.g();
        }
        a(false, 219);
    }

    boolean f()
    {
        if (!g.p(b))
        {
            ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, no permissions.");
            return false;
        }
        ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible");
        if (l)
        {
            ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff is already complete");
            return false;
        }
        if (e.a().u())
        {
            ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff not allowed for LTE fallback calls");
            return false;
        }
        alw alw1 = g.a(b);
        switch (h)
        {
        default:
            int i1 = h;
            ebw.e("Babel_telephony", (new StringBuilder(76)).append("TeleHandoffController.isHandoffPossible, unknown handoff reason: ").append(i1).toString());
            return false;

        case 2: // '\002'
            if (!a(b))
            {
                ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, manual handoff not allowed");
                return false;
            }
            break;

        case 3: // '\003'
            if (e.d() == 2)
            {
                if (!alw1.a("babel_handoff_on_wifi_loss_allowed", true))
                {
                    ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff on wifi loss not allowed");
                    return false;
                }
                break;
            }
            if (!alw1.a("babel_handoff_on_cell_loss_allowed", true))
            {
                ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff on cell loss not allowed");
                return false;
            }
            break;

        case 1: // '\001'
            if (ebz.j(e.a().f().c()))
            {
                ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, emergency call, handoff for network optimization not allowed");
                return false;
            }
            if (c.t())
            {
                ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, network optimizing handoff disabled when calling network was choosen manually");
                return false;
            }
            if (e.d() == 2)
            {
                if (!alw1.a("babel_wifi_network_optimizing_handoff_allowed", true))
                {
                    ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff for wifi network optimization not allowed");
                    return false;
                }
                break;
            }
            if (!alw1.a("babel_cell_network_optimizing_handoff_allowed", true))
            {
                ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff for cell network optimization not allowed");
                return false;
            }
            break;
        }
        dvh dvh1 = e.a().h();
        if (dvh1.e() == 2 && !alw1.a("babel_international_handoff_allowed", false))
        {
            ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff while international not allowed");
            return false;
        }
        if (dvh1.a() != 1 && !alw1.a("babel_roaming_handoff_allowed", true))
        {
            ebw.e("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff while roaming not allowed");
            return false;
        } else
        {
            return true;
        }
    }

    boolean g()
    {
        return l;
    }

    void h()
    {
        String s = String.valueOf(Connection.stateToString(i));
        String s1 = String.valueOf(Connection.stateToString(j));
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 74 + String.valueOf(s1).length())).append("TeleHandoffController.checkHandoffComplete, oldCallState: ").append(s).append(", newCallState: ").append(s1).toString());
        d.b();
    }
}
