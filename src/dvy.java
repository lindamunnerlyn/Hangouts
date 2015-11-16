// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import com.google.android.apps.hangouts.telephony.ui.TeleSetupActivity;

public final class dvy
    implements dha, dvp, dxu, dyd, dyj, dyq, dyt, gmq
{

    private final Context a;
    private final dtz b;
    private final dwe c;
    private final dym d;
    private final int e;
    private final Handler f;
    private final Runnable g;
    private hhw h;
    private gwt i;
    private int j;
    private ad k;
    private String l;
    private boolean m;
    private boolean n;
    private boolean o;
    private ani p;
    private dxy q;
    private dxv r;
    private dvn s;
    private dxj t;
    private dxg u;
    private dwc v;
    private dwd w;
    private duh x;
    private boolean y;

    dvy(Context context, dtz dtz1, dwe dwe1)
    {
        f = g.y();
        g = new dvz(this);
        j = 1;
        gbh.b(dtz1);
        a = context;
        b = dtz1;
        c = dwe1;
        d = null;
        e = 1;
    }

    public dvy(Context context, dym dym1, boolean flag)
    {
        f = g.y();
        g = new dvz(this);
        j = 1;
        a = context;
        b = null;
        c = null;
        d = dym1;
        int i1;
        if (flag)
        {
            i1 = 3;
        } else
        {
            i1 = 2;
        }
        e = i1;
    }

    static Runnable a(dvy dvy1)
    {
        return dvy1.g;
    }

    private static String a(int i1)
    {
        switch (i1)
        {
        default:
            return (new StringBuilder(25)).append("STEP_UNKNOWN: ").append(i1).toString();

        case 1: // '\001'
            return "STEP_START";

        case 2: // '\002'
            return "STEP_CHOOSE_ACCOUNT";

        case 3: // '\003'
            return "STEP_SETUP_ACCOUNT";

        case 4: // '\004'
            return "STEP_UPDATE_GOOGLE_VOICE_STATUS";

        case 5: // '\005'
            return "STEP_GOOGLE_VOICE_TOS";

        case 6: // '\006'
            return "STEP_GET_PROXY_NUMBER";

        case 7: // '\007'
            return "STEP_END";
        }
    }

    private void a(ad ad1, String s1)
    {
        if (h == null)
        {
            k = ad1;
            l = s1;
            m();
            return;
        }
        k = null;
        l = null;
        Object obj = h.t_();
        ad ad2 = ((ap) (obj)).a(0x1020002);
        if (ad2 != null && s1.equals(ad2.getTag()))
        {
            ad1 = String.valueOf(s1);
            if (ad1.length() != 0)
            {
                ad1 = "TeleSetupController.showFragment, already displaying fragment: ".concat(ad1);
            } else
            {
                ad1 = new String("TeleSetupController.showFragment, already displaying fragment: ");
            }
            ebw.e("Babel_telephony", ad1);
            return;
        }
        String s2 = String.valueOf(ad1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s2).length() + 51 + String.valueOf(s1).length())).append("TeleSetupController.showFragment, fragment: ").append(s2).append(", tag: ").append(s1).toString());
        obj = ((ap) (obj)).a();
        if (ad2 != null)
        {
            ((bg) (obj)).a(0x10a0000, 0x10a0001);
        }
        ((bg) (obj)).b(0x1020002, ad1, s1);
        ((bg) (obj)).b();
    }

    static void a(dvy dvy1, int i1)
    {
        dvy1.d(i1);
    }

    private void a(boolean flag)
    {
label0:
        {
            o = flag;
            if (l())
            {
                if (!flag)
                {
                    break label0;
                }
                b.c();
                b.v();
            }
            return;
        }
        b.b();
        b.w();
    }

    static Handler b(dvy dvy1)
    {
        return dvy1.f;
    }

    private void b(int i1)
    {
        ebw.e("Babel_telephony", (new StringBuilder(62)).append("TeleSetupController.finishSetupWithResult, result: ").append(i1).toString());
        if (m) goto _L2; else goto _L1
_L1:
        m = true;
        e;
        JVM INSTR tableswitch 1 3: default 68
    //                   1 290
    //                   2 407
    //                   3 407;
           goto _L3 _L4 _L5 _L5
_L3:
        i1 = e;
        gbh.a((new StringBuilder(33)).append("Unknown start reason: ").append(i1).toString());
_L2:
        if (h != null)
        {
            h.finish();
            h = null;
        }
        if (t != null)
        {
            t.d();
            t = null;
        }
        if (u != null)
        {
            u.c();
            u = null;
        }
        if (v != null)
        {
            v.a();
            v = null;
        }
        if (w != null)
        {
            w.a();
            w = null;
        }
        if (q != null)
        {
            q.d();
            q = null;
        }
        if (r != null)
        {
            r.e();
            r = null;
        }
        if (s != null)
        {
            s.e();
            s = null;
        }
        ((duf)hgx.a(a, duf)).b(this);
        k = null;
        l = null;
        f.removeCallbacks(g);
        return;
_L4:
        if (i1 == 3)
        {
            b.w();
            c.b();
        } else
        if (i1 == 1)
        {
            gbh.b(p);
            gbh.a(Integer.valueOf(b.f().a()), Integer.valueOf(2));
            b.a(x);
            c.a(p);
        } else
        {
            gbh.a(Integer.valueOf(b.f().a()), Integer.valueOf(1));
            b.w();
            c.a();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d.a();
        if (true) goto _L2; else goto _L6
_L6:
    }

    static void b(dvy dvy1, int i1)
    {
        ebw.e("Babel_telephony", (new StringBuilder(83)).append("TeleSetupController.performWifiChooserWithRoamingStatus, roamingStatus: ").append(i1).toString());
        if (i1 != 3)
        {
            dvy1.b.f().a(new dvh(dvy1.a, i1));
        }
        dvy1.v = new dwc(dvy1);
        dtt.a(dvy1.a, dvy1.v);
    }

    private void c(int i1)
    {
        dye dye1 = null;
        if (h != null)
        {
            dye1 = (dye)h.t_().a("progress");
        }
        if (dye1 == null)
        {
            a(dye.a(a.getString(g.pt), a.getString(i1)), "progress");
            return;
        } else
        {
            dye1.a(a.getString(i1));
            return;
        }
    }

    static void c(dvy dvy1)
    {
        dvy1.n();
    }

    static dxv d(dvy dvy1)
    {
        return dvy1.r;
    }

    private void d(int i1)
    {
        int j1 = g.pB;
        dyb dyb1 = null;
        if (h != null)
        {
            dyb1 = (dyb)h.t_().a("message");
        }
        if (dyb1 == null)
        {
            a(dyb.a(a.getString(j1), a.getString(i1)), "message");
            return;
        } else
        {
            dyb1.a(a.getString(j1));
            dyb1.b(a.getString(i1));
            return;
        }
    }

    static dxv e(dvy dvy1)
    {
        dvy1.r = null;
        return null;
    }

    static dxy f(dvy dvy1)
    {
        return dvy1.q;
    }

    static dxy g(dvy dvy1)
    {
        dvy1.q = null;
        return null;
    }

    static boolean h(dvy dvy1)
    {
        return dvy1.l();
    }

    static void i(dvy dvy1)
    {
        dvy1.a(false);
    }

    private boolean l()
    {
        return e == 1;
    }

    private void m()
    {
        boolean flag;
        if (!m)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "Create UI after callback invoked.");
        if (!n)
        {
            n = true;
            Intent intent = TeleSetupActivity.a(a, this);
            if (l())
            {
                intent.addFlags(0x50008000);
            }
            if (l())
            {
                u = new dxg(a, this, intent);
                dxf dxf1 = b.d().a();
                if (dxf1.a(this))
                {
                    t = dxf1.a(intent, u);
                }
                if (t == null)
                {
                    ebw.g("Babel_telephony", "TeleSetupController.createSetupActivity, unable to show dialog on top of in-call UI");
                    u.a();
                    return;
                } else
                {
                    ebw.e("Babel_telephony", "TeleSetupController.createSetupActivity, wifi call waiting for dialog");
                    return;
                }
            } else
            {
                a.startActivity(intent);
                return;
            }
        } else
        {
            ebw.e("Babel_telephony", "TeleSetupController.createSetupActivity, creation already in progress.");
            return;
        }
    }

    private void n()
    {
        if (l())
        {
            a(false);
            k();
            return;
        } else
        {
            d(g.pA);
            return;
        }
    }

    private void o()
    {
        ebw.e("Babel_telephony", "TeleSetupController.loginToAccount");
        c(g.pu);
        int i1 = g.a(a, "babel_wifi_call_account_setup_timeout", 20000);
        f.postDelayed(g, i1);
        ((duf)hgx.a(a, duf)).a(this);
        i.a("active-hangouts-account").b(this);
        i.a((new gxe()).a().a(p.h()));
    }

    private void p()
    {
        if (l())
        {
            Object obj = b.f();
            if (((dvk) (obj)).p() && g.j(a))
            {
                int i1 = p.h();
                obj = ((dvk) (obj)).d();
                String s1 = ebz.g();
                if (obj != null && s1 != null)
                {
                    s = new dvn(i1, ((String) (obj)), s1, this, b.a());
                    s.d();
                    return;
                } else
                {
                    ebw.g("Babel_telephony", String.format("TeleSetupController.performGetProxyNumber, invalid input, accountId: %d, destination number: %s, from number: %s", new Object[] {
                        Integer.valueOf(i1), g.u(((String) (obj))), g.u(s1)
                    }));
                    k();
                    return;
                }
            }
        }
        k();
    }

    private void q()
    {
        int i1 = 1;
        gbh.b(m);
        switch (j)
        {
        default:
            i1 = j;
            gbh.a((new StringBuilder(25)).append("unknown step: ").append(i1).toString());
            a(false);
            b(2);
            return;

        case 1: // '\001'
            i1 = e;
            ebw.e("Babel_telephony", (new StringBuilder(62)).append("TeleSetupController.performStartStep, startReason: ").append(i1).toString());
            switch (e)
            {
            default:
                i1 = e;
                gbh.a((new StringBuilder(33)).append("unknown start reason: ").append(i1).toString());
                d(g.py);
                return;

            case 1: // '\001'
                gbh.a(l());
                w = new dwd(this);
                g.a(a, w);
                return;

            case 2: // '\002'
                k();
                return;

            case 3: // '\003'
                a(dxq.a(), "account_chooser");
                break;
            }
            return;

        case 2: // '\002'
            Object obj = dwz.a(a);
            i1 = ((dwz) (obj)).b();
            if (i1 != -1)
            {
                p = dbf.e(i1);
                if (p == null)
                {
                    ((dwz) (obj)).a(-1);
                }
            }
            String s2 = g.a(a, "babel_user_to_allow_wifi_calling_for", "tycho_users");
            obj = String.valueOf(g.b(p));
            if (((String) (obj)).length() != 0)
            {
                obj = "TeleSetupController.performChooseAccount, selectedAccount: ".concat(((String) (obj)));
            } else
            {
                obj = new String("TeleSetupController.performChooseAccount, selectedAccount: ");
            }
            ebw.e("Babel_telephony", ((String) (obj)));
            if (p == null)
            {
                if ("hangouts_testing_users".equals(s2))
                {
                    a(dxq.a(), "account_chooser");
                    return;
                }
                i1 = e;
                obj = (new StringBuilder(36)).append("Unexpected start reason: ").append(i1).toString();
                boolean flag;
                if (e == 3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                gbh.b(((String) (obj)), flag);
                a(false);
                b(2);
                return;
            }
            if (o && "tycho_users".equals(s2))
            {
                String s1 = g.n(a);
                if (!TextUtils.isEmpty(s1) && !p.b(s1))
                {
                    s1 = String.valueOf(g.u(s1));
                    if (s1.length() != 0)
                    {
                        s1 = "TeleSetupController.performChooseAccount, disable Wi-Fi call for non GV number: ".concat(s1);
                    } else
                    {
                        s1 = new String("TeleSetupController.performChooseAccount, disable Wi-Fi call for non GV number: ");
                    }
                    ebw.e("Babel_telephony", s1);
                    a(false);
                }
            }
            k();
            return;

        case 3: // '\003'
            boolean flag1 = dbf.i(p.h());
            ebw.e("Babel_telephony", (new StringBuilder(55)).append("TeleSetupController.performSetupAccount, isReady: ").append(flag1).toString());
            if (flag1)
            {
                k();
                return;
            }
            if (h == null)
            {
                y = true;
                m();
                return;
            } else
            {
                o();
                return;
            }

        case 4: // '\004'
            i1 = p.X();
            ebw.e("Babel_telephony", (new StringBuilder(71)).append("TeleSetupController.performUpdateGoogleVoiceStatus, status: ").append(i1).toString());
            if (i1 == 0 && (!l() || o))
            {
                c(g.pv);
                q = new dxy(p.h(), new dwb(this));
                q.a(a);
                return;
            } else
            {
                k();
                return;
            }

        case 5: // '\005'
            switch (p.X())
            {
            default:
                i1 = p.X();
                gbh.a((new StringBuilder(41)).append("Unknown voice calling status: ").append(i1).toString());
                if (l())
                {
                    a(false);
                    k();
                    return;
                } else
                {
                    d(g.py);
                    return;
                }

            case 0: // '\0'
                ebw.f("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is UNKNOWN");
                if (l())
                {
                    a(false);
                    k();
                    return;
                } else
                {
                    d(g.py);
                    return;
                }

            case 1: // '\001'
                ebw.e("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is ALLOWED");
                k();
                return;

            case 2: // '\002'
                ebw.e("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is NEED_TOS");
                if (l())
                {
                    a(false);
                    k();
                    return;
                } else
                {
                    a(new dyn(), "tos");
                    return;
                }

            case 3: // '\003'
                ebw.f("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is BLOCKED");
                break;
            }
            if (l())
            {
                a(false);
                k();
                return;
            } else
            {
                d(g.pz);
                return;
            }

        case 6: // '\006'
            p();
            return;

        case 7: // '\007'
            break;
        }
        if (!o)
        {
            i1 = 2;
        }
        b(i1);
    }

    public void a()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed");
        k();
    }

    public void a(ani ani1)
    {
        if (ani1 != null)
        {
            String s1 = String.valueOf(g.b(ani1));
            if (s1.length() != 0)
            {
                s1 = "TeleSetupController.onAccountChooserDone, account: ".concat(s1);
            } else
            {
                s1 = new String("TeleSetupController.onAccountChooserDone, account: ");
            }
            ebw.e("Babel_telephony", s1);
            p = ani1;
            k();
            return;
        } else
        {
            ebw.f("Babel_telephony", "TeleSetupController.onAccountChooserDone, no account.");
            d(g.py);
            return;
        }
    }

    void a(dtv dtv1)
    {
        boolean flag1;
        flag1 = dwz.a(a).d();
        b.a(flag1);
        String s1 = String.valueOf(dtv1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 51)).append("TeleSetupController.isWifiCallPossible, cellState: ").append(s1).toString());
        if (g.p(a)) goto _L2; else goto _L1
_L1:
        boolean flag;
        ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, no permissions.");
        flag = false;
_L4:
        if (!flag)
        {
            a(false);
            k();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
label0:
        {
            if (!dwz.a(a).c())
            {
                ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling not enabled");
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
            if ("no_users".equals(g.a(a, "babel_user_to_allow_wifi_calling_for", "tycho_users")))
            {
                ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calls disabled for all users by gservices");
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
            Object obj = g.a(a);
            if (!((alw) (obj)).a("babel_outgoing_wifi_calls_allowed", true))
            {
                ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, outgoing wifi calls disabled by gservices");
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
            if (b.t())
            {
                if (!g.k(a))
                {
                    ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, not connected to wifi");
                    flag = false;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            {
                dws dws1 = dwn.a(a);
                String s2 = String.valueOf(dws1);
                ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s2).length() + 52)).append("TeleSetupController.isWifiCallPossible, wifi state: ").append(s2).toString());
                x = duh.a(a, b.f().d(), false, dws1);
                s2 = b.f().f();
                if (x == null && !g.a(a, b.h(), dtv1, dws1, s2))
                {
                    Context context = a;
                    dvh dvh2 = b.h();
                    if (dws1.a)
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, connected to wifi");
                        flag = false;
                    } else
                    if (dtv1.e != 13)
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, not connected to LTE");
                        flag = false;
                    } else
                    if (!g.j(context))
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, not connected to internet");
                        flag = false;
                    } else
                    if (dvh2.c() == 2 && ebz.j(s2) && g.a(context, "babel_lte_fallback_for_outgoing_tmobile_emergency_call", true))
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, falling back to LTE for emergency call over T-Mobile");
                        flag = true;
                    } else
                    if (g.a(context, "babel_lte_outgoing_call_allowed", false))
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, LTE outgoing call allowed by default");
                        flag = true;
                    } else
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, returning false");
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, bad wifi connection, falling back to LTE");
                    b.b(true);
                }
            }
            if (!dwh.a(b.d()) && bnd.a().u())
            {
                ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, another hangout is in progress");
                flag = false;
            } else
            if (!b.f().l())
            {
                obj = String.valueOf(g.u(b.f().e()));
                if (((String) (obj)).length() != 0)
                {
                    obj = "TeleSetupController.isWifiCallPossible, invalid phone number: ".concat(((String) (obj)));
                } else
                {
                    obj = new String("TeleSetupController.isWifiCallPossible, invalid phone number: ");
                }
                ebw.e("Babel_telephony", ((String) (obj)));
                flag = false;
            } else
            if (b.f().m() && !((alw) (obj)).a("babel_wifi_call_google_voice_app_integration_enabled", false))
            {
                ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, Google Voice app integration disabled by gservices");
                flag = false;
            } else
            {
                dvh dvh1 = b.h();
                if (dvh1.e() == 2 && !((alw) (obj)).a("babel_international_wifi_call_allowed", true))
                {
                    ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling while international not allowed");
                    flag = false;
                } else
                if (dvh1.e() == 1 && dvh1.a() == 2 && !((alw) (obj)).a("babel_roaming_wifi_call_allowed", true))
                {
                    ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling while roaming not allowed");
                    flag = false;
                } else
                if (b.f().n() && !((alw) (obj)).a("babel_voicemail_wifi_call_allowed", true))
                {
                    ebw.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, calling voicemail not allowed");
                    flag = false;
                } else
                {
                    flag = true;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        ebw.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, bad wifi connection");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
label1:
        {
            if (flag1)
            {
                ebw.e("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, ask each call is enabled");
                if (!dtv1.a())
                {
                    break label1;
                }
                ebw.e("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, no cell service, forcing wifi");
            }
            a(true);
            k();
            return;
        }
        a(((ad) (dyr.a())), "wifi_chooser");
        return;
    }

    public void a(gmw gmw1, cxi cxi)
    {
label0:
        {
            ebw.e("Babel_telephony", "TeleSetupController.processRegisterDeviceResponse");
            if (TextUtils.equals(p.a(), gmw1.b("account_name")) && TextUtils.equals(p.ae(), gmw1.b("effective_gaia_id")))
            {
                ((duf)hgx.a(a, duf)).b(this);
                gmw1 = p;
                g.w();
                if (gmw1 != null && gmw1.equals(p))
                {
                    boolean flag = dbf.i(p.h());
                    ebw.e("Babel_telephony", (new StringBuilder(56)).append("TeleSetupController.accountSetupComplete, isReady: ").append(flag).toString());
                    f.removeCallbacks(g);
                    if (!flag)
                    {
                        break label0;
                    }
                    k();
                }
            }
            return;
        }
        n();
    }

    public void a(hhw hhw1, gwt gwt1)
    {
        if (m)
        {
            if (h != null)
            {
                h.finish();
            }
            return;
        }
        gbh.a(h);
        h = hhw1;
        i = gwt1;
        if (y)
        {
            gbh.a(k);
            gbh.a(l);
            y = false;
            o();
            return;
        } else
        {
            gbh.b(k);
            gbh.b(l);
            a(k, l);
            return;
        }
    }

    public void a(String s1)
    {
        String s2 = String.valueOf(g.u(s1));
        if (s2.length() != 0)
        {
            s2 = "TeleSetupController.onGetProxyNumberSucceeded, proxy number: ".concat(s2);
        } else
        {
            s2 = new String("TeleSetupController.onGetProxyNumberSucceeded, proxy number: ");
        }
        ebw.e("Babel_telephony", s2);
        if (s1 != null)
        {
            b.f().a(s1);
            k();
            return;
        } else
        {
            ebw.e("Babel_telephony", "TeleSetupController.onGetProxyNumberSucceeded, no proxy number.");
            k();
            return;
        }
    }

    public void a(String s1, Intent intent)
    {
        String s2 = String.valueOf(s1);
        if (s2.length() != 0)
        {
            s2 = "TeleSetupController.performShowDialogFailedAction, performing action: ".concat(s2);
        } else
        {
            s2 = new String("TeleSetupController.performShowDialogFailedAction, performing action: ");
        }
        ebw.e("Babel_telephony", s2);
        if ("cellular".equals(s1))
        {
            a(false);
            b(2);
            return;
        }
        if ("wifi".equals(s1))
        {
            a.startActivity(intent);
            return;
        }
        if ("cancel".equals(s1))
        {
            b(3);
            return;
        }
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "TeleSetupController.performShowDialogFailedAction, unknown action: ".concat(s1);
        } else
        {
            s1 = new String("TeleSetupController.performShowDialogFailedAction, unknown action: ");
        }
        ebw.g("Babel_telephony", s1);
        a(false);
        b(2);
    }

    public void a(boolean flag, gmp gmp, gmp gmp1, int i1, int j1)
    {
        ebw.e("Babel_telephony", String.format("TeleSetupController.onAccountHandlerStateTransition, %s -> %s", new Object[] {
            gmp, gmp1
        }));
    }

    void b()
    {
        q();
    }

    void c()
    {
        b(3);
    }

    public void d()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onActivityDestroyed");
        h = null;
        b(3);
    }

    public void e()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onWifiChooserWifiChosen");
        a(true);
        k();
    }

    public void f()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onWifiChooserCellularChosen");
        a(false);
        k();
    }

    public void g()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onAccountChooserCancelled");
        b(3);
    }

    public void h()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onTosAccepted");
        c(g.ps);
        int i1 = p.h();
        dwa dwa1 = new dwa(this);
        r = new dxv(a, i1, dwa1);
        r.d();
    }

    public void i()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onTosDeclined");
        b(3);
    }

    public void j()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onMessageDone");
        b(3);
    }

    protected void k()
    {
        String s1 = a(j);
        String s2 = a(j + 1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 41 + String.valueOf(s2).length())).append("TeleSetupController.advanceNextStep, ").append(s1).append(" -> ").append(s2).toString());
        s1 = String.valueOf(g.b(p));
        if (s1.length() != 0)
        {
            s1 = "selectedAccount: ".concat(s1);
        } else
        {
            s1 = new String("selectedAccount: ");
        }
        ebw.e("Babel_telephony", s1);
        j = j + 1;
        q();
    }
}
