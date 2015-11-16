// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import com.google.android.apps.hangouts.telephony.ui.TeleSetupActivity;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public final class dzh
    implements dij, dyy, ebe, ebn, ebu, ecb, ece, gqw
{

    private eaq A;
    private dzn B;
    private dxp C;
    private boolean D;
    final Context a;
    final dxh b;
    final Handler c;
    final Runnable d;
    ebi e;
    ebf f;
    dzm g;
    final emy h;
    PredictedNetworkQuality i;
    dxd j;
    boolean k;
    private final dzo l;
    private final ebx m;
    private final int n;
    private hmo o;
    private hbd p;
    private int q;
    private ad r;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private aoa w;
    private String x;
    private dyw y;
    private eat z;

    dzh(Context context, dxh dxh1, dzo dzo1)
    {
        c = g.x();
        d = new dzi(this);
        q = 1;
        gdv.b("Expected non-null", dxh1);
        a = context;
        b = dxh1;
        l = dzo1;
        m = null;
        n = 1;
        h = (new emz(context)).a(fep.b).a();
    }

    public dzh(Context context, ebx ebx1, boolean flag)
    {
        c = g.x();
        d = new dzi(this);
        q = 1;
        a = context;
        b = null;
        l = null;
        m = ebx1;
        int i1;
        if (flag)
        {
            i1 = 3;
        } else
        {
            i1 = 2;
        }
        n = i1;
        h = (new emz(context)).a(fep.b).a();
    }

    private void a(ad ad1, String s1)
    {
        if (o == null)
        {
            r = ad1;
            s = s1;
            m();
            return;
        }
        r = null;
        s = null;
        Object obj = o.u_();
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
            eev.e("Babel_telephony", ad1);
            return;
        }
        String s2 = String.valueOf(ad1);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s2).length() + 51 + String.valueOf(s1).length())).append("TeleSetupController.showFragment, fragment: ").append(s2).append(", tag: ").append(s1).toString());
        obj = ((ap) (obj)).a();
        if (ad2 != null)
        {
            ((bg) (obj)).a(0x10a0000, 0x10a0001);
        }
        ((bg) (obj)).b(0x1020002, ad1, s1);
        ((bg) (obj)).b();
    }

    static void a(dzh dzh1)
    {
        dzh1.o();
    }

    private static String b(int i1)
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

    private void c(int i1)
    {
        eev.e("Babel_telephony", (new StringBuilder(62)).append("TeleSetupController.finishSetupWithResult, result: ").append(i1).toString());
        h.d();
        if (t) goto _L2; else goto _L1
_L1:
        t = true;
        n;
        JVM INSTR tableswitch 1 3: default 76
    //                   1 303
    //                   2 422
    //                   3 422;
           goto _L3 _L4 _L5 _L5
_L3:
        i1 = n;
        gdv.a((new StringBuilder(33)).append("Unknown start reason: ").append(i1).toString());
_L2:
        k = true;
        if (o != null)
        {
            o.finish();
            o = null;
        }
        if (z != null)
        {
            z.d();
            z = null;
        }
        if (A != null)
        {
            A.c();
            A = null;
        }
        if (g != null)
        {
            g.a();
            g = null;
        }
        if (B != null)
        {
            B.a();
            B = null;
        }
        if (e != null)
        {
            e.d();
            e = null;
        }
        if (f != null)
        {
            f.e();
            f = null;
        }
        if (y != null)
        {
            y.e();
            y = null;
        }
        ((dxn)hlp.a(a, dxn)).b(this);
        r = null;
        s = null;
        c.removeCallbacks(d);
        return;
_L4:
        if (i1 == 3)
        {
            b.w();
            l.b();
        } else
        if (i1 == 1)
        {
            gdv.b("Expected non-null", w);
            gdv.a(Integer.valueOf(b.f().a()), Integer.valueOf(2));
            b.a(C);
            l.a(w);
        } else
        {
            gdv.a(Integer.valueOf(b.f().a()), Integer.valueOf(1));
            b.w();
            l.a();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        m.a();
        if (true) goto _L2; else goto _L6
_L6:
    }

    private void d(int i1)
    {
        ebo ebo1 = null;
        if (o != null)
        {
            ebo1 = (ebo)o.u_().a("progress");
        }
        if (ebo1 == null)
        {
            a(ebo.a(a.getString(g.pv), a.getString(i1)), "progress");
            return;
        } else
        {
            ebo1.a(a.getString(i1));
            return;
        }
    }

    private void m()
    {
        boolean flag;
        if (!t)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.d(flag, "Create UI after callback invoked.");
        if (!u)
        {
            u = true;
            Object obj = a;
            gdv.b("Expected non-null", this);
            obj = new Intent(((Context) (obj)), com/google/android/apps/hangouts/telephony/ui/TeleSetupActivity);
            ((Intent) (obj)).putExtra("controller", new edz(this));
            if (d())
            {
                ((Intent) (obj)).addFlags(0x50008000);
            }
            if (d())
            {
                A = new eaq(a, this, ((Intent) (obj)));
                eap eap1 = b.d().a();
                if (eap1.a(this))
                {
                    z = eap1.a(((Intent) (obj)), A);
                }
                if (z == null)
                {
                    eev.g("Babel_telephony", "TeleSetupController.createSetupActivity, unable to show dialog on top of in-call UI");
                    A.a();
                    return;
                } else
                {
                    eev.e("Babel_telephony", "TeleSetupController.createSetupActivity, wifi call waiting for dialog");
                    return;
                }
            } else
            {
                a.startActivity(((Intent) (obj)));
                return;
            }
        } else
        {
            eev.e("Babel_telephony", "TeleSetupController.createSetupActivity, creation already in progress.");
            return;
        }
    }

    private void n()
    {
        String s3 = g.a(a, "babel_user_to_allow_wifi_calling_for", "tycho_users");
        String s1 = String.valueOf(g.b(w));
        if (s1.length() != 0)
        {
            s1 = "TeleSetupController.chooseWifiOrCellular, selectedAccount: ".concat(s1);
        } else
        {
            s1 = new String("TeleSetupController.chooseWifiOrCellular, selectedAccount: ");
        }
        eev.e("Babel_telephony", s1);
        if (w == null)
        {
            if ("hangouts_testing_users".equals(s3))
            {
                a(eba.a(), "account_chooser");
                return;
            }
            int i1 = n;
            s1 = (new StringBuilder(36)).append("Unexpected start reason: ").append(i1).toString();
            boolean flag;
            if (n == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gdv.b(s1, flag);
            a(false);
            c(2);
            return;
        }
        if (v && "tycho_users".equals(s3))
        {
            String s2 = g.n(a);
            if (!TextUtils.isEmpty(s2) && !w.b(s2))
            {
                s2 = String.valueOf(g.u(s2));
                if (s2.length() != 0)
                {
                    s2 = "TeleSetupController.chooseWifiOrCellular, disable Wi-Fi call for non GV number: ".concat(s2);
                } else
                {
                    s2 = new String("TeleSetupController.chooseWifiOrCellular, disable Wi-Fi call for non GV number: ");
                }
                eev.e("Babel_telephony", s2);
                a(false);
            }
        }
        l();
    }

    private void o()
    {
        if (d())
        {
            a(false);
            l();
            return;
        } else
        {
            a(g.pC);
            return;
        }
    }

    private void p()
    {
        eaj eaj1 = eaj.a(a);
        int i1 = eaj1.b();
        if (i1 == -1)
        {
            x = eaj.a(a).h();
            String s1 = String.valueOf(x);
            if (s1.length() != 0)
            {
                s1 = "TeleSetupController.setSelectedAccount accountName:".concat(s1);
            } else
            {
                s1 = new String("TeleSetupController.setSelectedAccount accountName:");
            }
            eev.e("Babel_telephony", s1);
        }
        if (i1 != -1)
        {
            w = dcn.e(i1);
            if (w == null)
            {
                eaj1.a(-1);
            }
        }
    }

    private void q()
    {
        eev.e("Babel_telephony", "TeleSetupController.loginToAccount");
        d(g.pw);
        int i1 = g.a(a, "babel_wifi_call_account_setup_timeout", 20000);
        c.postDelayed(d, i1);
        ((dxn)hlp.a(a, dxn)).a(this);
        p.a("active-hangouts-account").b(this);
        if (w != null)
        {
            eev.e("Babel_telephony", "TeleSetupController.loginToAccount using accountId");
            p.a((new hbo()).a().a(w.h()));
            return;
        } else
        {
            eev.e("Babel_telephony", "TeleSetupController.loginToAccount using accountName");
            p.a((new hbo()).a().a(x));
            return;
        }
    }

    private void r()
    {
        if (d())
        {
            Object obj = b.f();
            if (((dyt) (obj)).p())
            {
                if (!g.j(a))
                {
                    eev.f("Babel_telephony", "TeleSetupController.performGetProxyNumber, no internet connection");
                    b.a().a(new int[] {
                        205
                    });
                    l();
                    return;
                }
                int i1 = w.h();
                obj = ((dyt) (obj)).d();
                String s1 = eey.g();
                if (obj != null && s1 != null)
                {
                    y = new dyw(i1, ((String) (obj)), s1, this, b.a());
                    y.d();
                    return;
                } else
                {
                    eev.g("Babel_telephony", String.format("TeleSetupController.performGetProxyNumber, invalid input, accountId: %d, destination number: %s, from number: %s", new Object[] {
                        Integer.valueOf(i1), g.u(((String) (obj))), g.u(s1)
                    }));
                    l();
                    return;
                }
            }
        }
        l();
    }

    private void s()
    {
        int i1 = 1;
        boolean flag1 = false;
        gdv.b("Expected condition to be false", t);
        switch (q)
        {
        default:
            i1 = q;
            gdv.a((new StringBuilder(25)).append("unknown step: ").append(i1).toString());
            a(false);
            c(2);
            return;

        case 1: // '\001'
            i1 = n;
            eev.e("Babel_telephony", (new StringBuilder(62)).append("TeleSetupController.performStartStep, startReason: ").append(i1).toString());
            switch (n)
            {
            default:
                i1 = n;
                gdv.a((new StringBuilder(33)).append("unknown start reason: ").append(i1).toString());
                a(g.pA);
                return;

            case 1: // '\001'
                gdv.a("Expected condition to be true", d());
                h.b();
                B = new dzn(this);
                g.a(a, B);
                return;

            case 2: // '\002'
                l();
                return;

            case 3: // '\003'
                a(eba.a(), "account_chooser");
                break;
            }
            return;

        case 2: // '\002'
            p();
            l();
            return;

        case 3: // '\003'
            boolean flag = flag1;
            if (w != null)
            {
                flag = flag1;
                if (dcn.i(w.h()))
                {
                    flag = true;
                }
            }
            eev.e("Babel_telephony", (new StringBuilder(55)).append("TeleSetupController.performSetupAccount, isReady: ").append(flag).toString());
            if (flag)
            {
                n();
                return;
            }
            String s1 = String.valueOf(w);
            String s2 = x;
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 65 + String.valueOf(s2).length())).append("TeleSetupController.setupOrLogin, selectedAccount:").append(s1).append(" , accountName:").append(s2).toString());
            if (w == null && TextUtils.isEmpty(x))
            {
                n();
                return;
            }
            if (o == null)
            {
                D = true;
                m();
                return;
            } else
            {
                q();
                return;
            }

        case 4: // '\004'
            i1 = w.U();
            eev.e("Babel_telephony", (new StringBuilder(71)).append("TeleSetupController.performUpdateGoogleVoiceStatus, status: ").append(i1).toString());
            if (i1 == 0 && (!d() || v))
            {
                d(g.px);
                e = new ebi(w.h(), new dzl(this));
                e.a(a);
                return;
            } else
            {
                l();
                return;
            }

        case 5: // '\005'
            switch (w.U())
            {
            default:
                i1 = w.U();
                gdv.a((new StringBuilder(41)).append("Unknown voice calling status: ").append(i1).toString());
                if (d())
                {
                    a(false);
                    l();
                    return;
                } else
                {
                    a(g.pA);
                    return;
                }

            case 0: // '\0'
                eev.f("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is UNKNOWN");
                if (d())
                {
                    a(false);
                    l();
                    return;
                } else
                {
                    a(g.pA);
                    return;
                }

            case 1: // '\001'
                eev.e("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is ALLOWED");
                l();
                return;

            case 2: // '\002'
                eev.e("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is NEED_TOS");
                if (d())
                {
                    a(false);
                    l();
                    return;
                } else
                {
                    a(new eby(), "tos");
                    return;
                }

            case 3: // '\003'
                eev.f("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is BLOCKED");
                break;
            }
            if (d())
            {
                a(false);
                l();
                return;
            } else
            {
                a(g.pB);
                return;
            }

        case 6: // '\006'
            r();
            return;

        case 7: // '\007'
            break;
        }
        if (!v)
        {
            i1 = 2;
        }
        c(i1);
    }

    public void a()
    {
        eev.e("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed");
        l();
    }

    void a(int i1)
    {
        int j1 = g.pD;
        ebl ebl1 = null;
        if (o != null)
        {
            ebl1 = (ebl)o.u_().a("message");
        }
        if (ebl1 == null)
        {
            a(((ad) (ebl.a(a.getString(j1), a.getString(i1)))), "message");
            return;
        } else
        {
            ebl1.a(a.getString(j1));
            ebl1.b(a.getString(i1));
            return;
        }
    }

    public void a(aoa aoa1)
    {
        if (aoa1 != null)
        {
            String s1 = String.valueOf(g.b(aoa1));
            if (s1.length() != 0)
            {
                s1 = "TeleSetupController.onAccountChooserDone, account: ".concat(s1);
            } else
            {
                s1 = new String("TeleSetupController.onAccountChooserDone, account: ");
            }
            eev.e("Babel_telephony", s1);
            w = aoa1;
            if (!dcn.i(w.h()))
            {
                if (o == null)
                {
                    D = true;
                    m();
                    return;
                } else
                {
                    q();
                    return;
                }
            } else
            {
                l();
                return;
            }
        } else
        {
            eev.f("Babel_telephony", "TeleSetupController.onAccountChooserDone, no account.");
            a(g.pA);
            return;
        }
    }

    void a(dxd dxd1)
    {
        boolean flag1;
        flag1 = eaj.a(a).d();
        b.a(flag1);
        String s1 = String.valueOf(dxd1);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 51)).append("TeleSetupController.isWifiCallPossible, cellState: ").append(s1).toString());
        if (g.p(a)) goto _L2; else goto _L1
_L1:
        int i1;
        eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, no permissions.");
        i1 = 0;
_L14:
        if (i1 == 0)
        {
            a(false);
            l();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        Object obj;
        Object obj1;
        obj1 = eaj.a(a);
        if (!((eaj) (obj1)).c())
        {
            eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling not enabled");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if ("no_users".equals(g.a(a, "babel_user_to_allow_wifi_calling_for", "tycho_users")))
        {
            eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calls disabled for all users by gservices");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        obj = g.a(a);
        if (!((amo) (obj)).a("babel_outgoing_wifi_calls_allowed", true))
        {
            eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, outgoing wifi calls disabled by gservices");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (!b.t()) goto _L4; else goto _L3
_L3:
        if (!g.k(a))
        {
            eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, not connected to wifi");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L4:
        String s2;
        Object obj2;
        Object obj3;
        eac eac1 = dzx.a(a);
        s2 = String.valueOf(eac1);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s2).length() + 52)).append("TeleSetupController.isWifiCallPossible, wifi state: ").append(s2).toString());
        C = dxp.a(a, b.f().d(), false, eac1);
        s2 = b.f().f();
        i1 = ((eaj) (obj1)).b();
        boolean flag;
        boolean flag2;
        if (i1 == -1)
        {
            flag = false;
        } else
        {
            flag = dcz.O(i1);
        }
        if (C != null) goto _L5; else goto _L6
_L6:
        flag2 = g.a(a, b.h(), dxd1, eac1, s2);
        if (!flag) goto _L8; else goto _L7
_L7:
        obj2 = a;
        obj3 = b.h();
        obj1 = i;
        if (obj1 != null) goto _L10; else goto _L9
_L9:
        eev.e("Babel_telephony", "TeleWifiCallThreshold.hasNetworkQualityForNewWifiCall, no prediction, assuming good network");
_L8:
        i1 = 1;
_L11:
        if (flag2 && i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            obj1 = a;
            obj2 = b.h();
            long l1;
            if (eac1.a)
            {
                eev.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, connected to wifi");
                i1 = 0;
            } else
            if (dxd1.e != 13)
            {
                eev.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, not connected to LTE");
                i1 = 0;
            } else
            if (!g.j(((Context) (obj1))))
            {
                eev.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, not connected to internet");
                i1 = 0;
            } else
            if (((dyq) (obj2)).c() == 2 && eey.j(s2) && g.a(((Context) (obj1)), "babel_lte_fallback_for_outgoing_tmobile_emergency_call", true))
            {
                eev.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, falling back to LTE for emergency call over T-Mobile");
                i1 = 1;
            } else
            if (g.a(((Context) (obj1)), "babel_lte_outgoing_call_allowed", false))
            {
                eev.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, LTE outgoing call allowed by default");
                i1 = 1;
            } else
            {
                eev.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, returning false");
                i1 = 0;
            }
            if (i1 == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, bad wifi connection, falling back to LTE");
            b.b(true);
        }
_L5:
        if (!dzr.a(b.d()) && bnk.a().m())
        {
            eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, another hangout is in progress");
            i1 = 0;
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
            eev.e("Babel_telephony", ((String) (obj)));
            i1 = 0;
        } else
        if (b.f().m() && !((amo) (obj)).a("babel_wifi_call_google_voice_app_integration_enabled", false))
        {
            eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, Google Voice app integration disabled by gservices");
            i1 = 0;
        } else
        {
            dyq dyq1 = b.h();
            if (dyq1.e() == 2 && !((amo) (obj)).a("babel_international_wifi_call_allowed", true))
            {
                eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling while international not allowed");
                i1 = 0;
            } else
            if (dyq1.e() == 1 && dyq1.a() == 2 && !((amo) (obj)).a("babel_roaming_wifi_call_allowed", true))
            {
                eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling while roaming not allowed");
                i1 = 0;
            } else
            if (b.f().n() && !((amo) (obj)).a("babel_voicemail_wifi_call_allowed", true))
            {
                eev.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, calling voicemail not allowed");
                i1 = 0;
            } else
            {
                i1 = 1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L10:
        obj2 = g.a(((Context) (obj2)), ((dyq) (obj3)));
        if (((PredictedNetworkQuality) (obj1)).c >= 0 && (long)((PredictedNetworkQuality) (obj1)).c > ((dzv) (obj2)).f)
        {
            obj3 = String.valueOf("TeleWifiCallThreshold.hasNetworkQualityForNewWifiCall, predicted latency ");
            i1 = ((PredictedNetworkQuality) (obj1)).c;
            l1 = ((dzv) (obj2)).f;
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(obj3).length() + 62)).append(((String) (obj3))).append(i1).append("micros exceeds threshold ").append(l1).append("micros").toString());
            i1 = 0;
        } else
        {
label0:
            {
                if (((PredictedNetworkQuality) (obj1)).d < 0L || ((PredictedNetworkQuality) (obj1)).d << 3 >= ((dzv) (obj2)).g)
                {
                    break label0;
                }
                l1 = ((PredictedNetworkQuality) (obj1)).d;
                eev.e("Babel_telephony", (new StringBuilder(110)).append("TeleWifiCallThreshold.hasNetworkQualityForNewWifiCall, down throughput ").append(l1).append("Bps below threshold").toString());
                i1 = 0;
            }
        }
          goto _L11
        obj2 = String.valueOf("TeleWifiCallThreshold.hasNetworkQualityForNewWifiCall, has good network quality ");
        obj1 = String.valueOf(obj1);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(obj2).length() + 0 + String.valueOf(obj1).length())).append(((String) (obj2))).append(((String) (obj1))).toString());
        if (true) goto _L8; else goto _L12
_L12:
        eev.e("Babel_telephony", "TeleSetupController.isWifiCallPossible, bad wifi connection");
        i1 = 0;
        if (true) goto _L14; else goto _L13
_L13:
label1:
        {
            if (flag1)
            {
                eev.e("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, ask each call is enabled");
                if (!dxd1.a())
                {
                    break label1;
                }
                eev.e("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, no cell service, forcing wifi");
            }
            a(true);
            l();
            return;
        }
        a(((ad) (ecc.a())), "wifi_chooser");
        return;
    }

    public void a(grd grd1, czm czm)
    {
label0:
        {
            eev.e("Babel_telephony", "TeleSetupController.processRegisterDeviceResponse");
            p();
            if (TextUtils.equals(w.a(), grd1.b("account_name")) && TextUtils.equals(w.ab(), grd1.b("effective_gaia_id")))
            {
                ((dxn)hlp.a(a, dxn)).b(this);
                grd1 = w;
                g.v();
                if (grd1 != null && grd1.equals(w))
                {
                    boolean flag = dcn.i(w.h());
                    eev.e("Babel_telephony", (new StringBuilder(56)).append("TeleSetupController.accountSetupComplete, isReady: ").append(flag).toString());
                    c.removeCallbacks(d);
                    if (!flag)
                    {
                        break label0;
                    }
                    n();
                }
            }
            return;
        }
        o();
    }

    public void a(hmo hmo1, hbd hbd1)
    {
        if (t)
        {
            if (o != null)
            {
                o.finish();
            }
            return;
        }
        gdv.a("Expected null", o);
        o = hmo1;
        p = hbd1;
        if (D)
        {
            gdv.a("Expected null", r);
            gdv.a("Expected null", s);
            D = false;
            q();
            return;
        } else
        {
            gdv.b("Expected non-null", r);
            gdv.b("Expected non-null", s);
            a(r, s);
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
        eev.e("Babel_telephony", s2);
        if (s1 != null)
        {
            b.f().a(s1);
            l();
            return;
        } else
        {
            eev.e("Babel_telephony", "TeleSetupController.onGetProxyNumberSucceeded, no proxy number.");
            l();
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
        eev.e("Babel_telephony", s2);
        if ("cellular".equals(s1))
        {
            a(false);
            c(2);
            return;
        }
        if ("wifi".equals(s1))
        {
            a.startActivity(intent);
            return;
        }
        if ("cancel".equals(s1))
        {
            c(3);
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
        eev.g("Babel_telephony", s1);
        a(false);
        c(2);
    }

    void a(boolean flag)
    {
label0:
        {
            v = flag;
            if (d())
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

    public void a(boolean flag, gqv gqv, gqv gqv1, int i1, int j1)
    {
        eev.e("Babel_telephony", String.format("TeleSetupController.onAccountHandlerStateTransition, %s -> %s", new Object[] {
            gqv, gqv1
        }));
    }

    void b()
    {
        s();
    }

    void c()
    {
        c(3);
    }

    boolean d()
    {
        return n == 1;
    }

    public void e()
    {
        eev.e("Babel_telephony", "TeleSetupController.onActivityDestroyed");
        o = null;
        c(3);
    }

    public void f()
    {
        eev.e("Babel_telephony", "TeleSetupController.onWifiChooserWifiChosen");
        a(true);
        l();
    }

    public void g()
    {
        eev.e("Babel_telephony", "TeleSetupController.onWifiChooserCellularChosen");
        a(false);
        l();
    }

    public void h()
    {
        eev.e("Babel_telephony", "TeleSetupController.onAccountChooserCancelled");
        c(3);
    }

    public void i()
    {
        eev.e("Babel_telephony", "TeleSetupController.onTosAccepted");
        d(g.pu);
        int i1 = w.h();
        dzj dzj1 = new dzj(this);
        f = new ebf(a, i1, dzj1);
        f.d();
    }

    public void j()
    {
        eev.e("Babel_telephony", "TeleSetupController.onTosDeclined");
        c(3);
    }

    public void k()
    {
        eev.e("Babel_telephony", "TeleSetupController.onMessageDone");
        c(3);
    }

    protected void l()
    {
        String s1 = String.valueOf(b(q));
        String s2 = String.valueOf(b(q + 1));
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 41 + String.valueOf(s2).length())).append("TeleSetupController.advanceNextStep, ").append(s1).append(" -> ").append(s2).toString());
        s1 = String.valueOf(g.b(w));
        if (s1.length() != 0)
        {
            s1 = "selectedAccount: ".concat(s1);
        } else
        {
            s1 = new String("selectedAccount: ");
        }
        eev.e("Babel_telephony", s1);
        q = q + 1;
        s();
    }
}
