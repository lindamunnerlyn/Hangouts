// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import ai;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import aoa;
import aoc;
import bnk;
import bnu;
import bnz;
import boi;
import boo;
import bor;
import bot;
import box;
import boy;
import boz;
import bpa;
import bpb;
import bpc;
import bpd;
import bph;
import bpm;
import bqo;
import bra;
import bsg;
import bvm;
import cfz;
import cjf;
import cjg;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import dcn;
import ecn;
import eev;
import fzd;
import g;
import gcz;
import gdd;
import gdv;
import gle;
import glg;
import glj;
import glt;
import gly;
import gmm;
import gmt;
import gqu;
import h;
import hlp;
import hmm;
import hny;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import l;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            HangoutActivity, InCallDialpadActivity, ProximityCoverView, DebugOverlayTextView, 
//            PresentToAllBannerView, ParticipantTrayView, FocusedParticipantView, BroadcastOverlayView

public final class HangoutFragment extends hmm
{

    private static final boolean c = false;
    private static final int d;
    private static final int e;
    public final bnk a = bnk.a();
    private int aA;
    private final bpc aB = new bpc(this);
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private Menu aH;
    private int aI;
    private boolean aJ;
    private bor aK;
    private int aL;
    private bph aj;
    private bph ak;
    private boolean al;
    private final boo am = boo.a();
    private bpd an;
    private bpa ao;
    private final ArrayList ap = new ArrayList();
    private boolean aq;
    private bqo ar;
    private ParticipantTrayView as;
    private FocusedParticipantView at;
    private bnu au;
    private ProximityCoverView av;
    private boolean aw;
    private Button ax;
    private ViewGroup ay;
    private aoa az;
    public AccessibilityManager b;
    private cjg f;
    private cjf g;
    private gqu h;
    private HangoutActivity i;

    public HangoutFragment()
    {
        aA = 0;
    }

    private int a(boolean flag, boolean flag1)
    {
        boolean flag2 = getActivity().getIntent().getBooleanExtra("hangout_auto_join", false);
        if (!a.m())
        {
            if (al)
            {
                Object obj = i;
                bph bph1 = ak;
                obj = ((Context) (obj)).getSharedPreferences(boi.getName(), 0);
                if (!((SharedPreferences) (obj)).getBoolean("HISTORY_HAS_EVENT", false) || !bph1.equals(bph.a(((SharedPreferences) (obj)))))
                {
                    obj = null;
                }
                if (obj != null)
                {
                    obj = new boi(((SharedPreferences) (obj)).getInt("HISTORY_ERROR", 1004), ((SharedPreferences) (obj)).getBoolean("HISTORY_EXIT_REPORTED", false));
                } else
                {
                    obj = null;
                }
                if (obj == null)
                {
                    i.finish();
                    return 4;
                }
                int i1 = ((boi) (obj)).a();
                if (((boi) (obj)).b() || f(i1))
                {
                    if (eev.a("Babel_calls", 3))
                    {
                        eev.c("Babel_calls", (new StringBuilder(38)).append("Hangout previously exited: ").append(i1).toString());
                    }
                    i.n();
                    return 4;
                } else
                {
                    a(((String) (null)), i1);
                    boi.a(i, ak);
                    return 3;
                }
            }
            if (az != null && !flag && aoc.j(getContext(), az))
            {
                aC = true;
                (new bra()).a(getFragmentManager(), null);
                return !flag2 ? 1 : 3;
            }
            b(flag1);
            if (a.s() == null)
            {
                return 3;
            }
            if (flag2 || flag1)
            {
                a.v();
                return a.s() != null ? 2 : 3;
            } else
            {
                return 1;
            }
        }
        if (a.s().a((HangoutActivity)getActivity()))
        {
            eev.e("Babel_calls", "Continuing call where previous activity left off.");
            ak = a.s().e();
            al = true;
            return !flag2 && !a.l() ? 1 : 2;
        }
        if (c)
        {
            String s1 = String.valueOf(a.s().e());
            eev.b("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 16)).append("Already joined: ").append(s1).toString());
        }
        aj.s();
        e(l.dA);
        return 3;
    }

    public static aoa a(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.az;
    }

    public static bph a(HangoutFragment hangoutfragment, bph bph1)
    {
        hangoutfragment.ak = bph1;
        return bph1;
    }

    public static void a(HangoutFragment hangoutfragment, int i1)
    {
        hangoutfragment.c(i1);
    }

    public static void a(HangoutFragment hangoutfragment, String s1, int i1)
    {
        hangoutfragment.a(s1, i1);
    }

    public static void a(HangoutFragment hangoutfragment, String s1, boolean flag)
    {
        hangoutfragment.a(s1, flag);
    }

    private void a(String s1)
    {
        if (eev.a("Babel_calls", 3))
        {
            eev.c("Babel_calls", String.format("Lifecycle HangoutFragment.%s(this=%s) activity=%s hangoutRequest=%s", new Object[] {
                s1, this, i, aj
            }));
        }
    }

    private void a(String s1, int i1)
    {
        bot.a(s1, i1).a(getFragmentManager(), null);
    }

    private void a(String s1, boolean flag)
    {
        if (aw == flag)
        {
            return;
        }
        if (flag)
        {
            Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/hangout/InCallDialpadActivity);
            intent.putExtra("extra_endpoint_jid", s1);
            startActivityForResult(intent, 1);
        }
        aw = flag;
        w();
        char c1;
        if (aw)
        {
            c1 = '\u062E';
        } else
        {
            c1 = '\u062F';
        }
        g.b(c1);
    }

    public static boolean a(int i1)
    {
        return f(i1);
    }

    public static boolean a(HangoutFragment hangoutfragment, boolean flag)
    {
        hangoutfragment.aF = flag;
        return flag;
    }

    public static int b(HangoutFragment hangoutfragment, int i1)
    {
        hangoutfragment.aI = i1;
        return i1;
    }

    public static HangoutActivity b(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.i;
    }

    private static String b(int i1)
    {
        switch (i1)
        {
        default:
            String s1 = String.valueOf(String.valueOf(i1));
            if (s1.length() != 0)
            {
                return "UNKNOWN_".concat(s1);
            } else
            {
                return new String("UNKNOWN_");
            }

        case 0: // '\0'
            return "START";

        case 1: // '\001'
            return "GREEN_ROOM";

        case 2: // '\002'
            return "HANGOUT";

        case 3: // '\003'
            return "ERROR_DIALOG";

        case 4: // '\004'
            return "ACTIVITY_FINISHED";

        case 5: // '\005'
            return "WAITING_FOR_RESULT";
        }
    }

    private void b(boolean flag)
    {
        Intent intent = i.getIntent();
        Object obj = (ArrayList)intent.getSerializableExtra("hangout_invitee_users");
        ArrayList arraylist = (ArrayList)intent.getSerializableExtra("hangout_invitee_circles");
        boolean flag1 = intent.getBooleanExtra("hangout_is_joining_non_empty_hangout", false);
        cfz cfz1 = (cfz)intent.getParcelableExtra("pstn_caller");
        int i1 = intent.getIntExtra("hangout_start_source", 51);
        int j1 = intent.getIntExtra("hangout_pstn_call", 2);
        long l1 = intent.getLongExtra("extra_hangout_start_time", 0L);
        a.a(aj.r(), flag, ((List) (obj)), arraylist, flag1, cfz1, i1, aL, true, l1, null, null, null);
        obj = a.s();
        if (((TelephonyManager)g.nU.getSystemService("phone")).getCallState() == 2)
        {
            a(((String) (null)), 1013);
            c(3);
            ((bpm) (obj)).c(1013);
            return;
        }
        a.w();
        if (aL == 3 && g.a("android.permission.CAMERA"))
        {
            u();
        }
        if (intent.getBooleanExtra("hangout_mute_microphone", false))
        {
            a.a(true);
        }
        if (intent.getBooleanExtra("hangout_mute_playback", false))
        {
            a.b(true);
        }
        ((gdd)binder.a(gdd)).a(((gqu)binder.a(gqu)).a()).a();
        ((bpm) (obj)).b(j1);
        if (aF)
        {
            a.a(true);
            aF = false;
        }
        al = true;
    }

    public static int c(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.aA;
    }

    private void c(int i1)
    {
        eev.e("Babel_calls", String.format(Locale.US, "changeUiState: %s->%s", new Object[] {
            b(aA), b(i1)
        }));
        if (i1 == aA)
        {
            return;
        }
        aA = i1;
        d(i1);
        if (i1 == 2)
        {
            gdv.a(Integer.valueOf(aB.c()), Integer.valueOf(2));
            i.getWindow().setFlags(128, 128);
        }
        for (Iterator iterator = ap.iterator(); iterator.hasNext(); ((bpb)iterator.next()).a(i1)) { }
        au.a(i1);
    }

    private void c(boolean flag)
    {
        gdv.a("Expected condition to be true", a.n());
        if (flag || !aJ)
        {
            av.a();
        }
        if (!aJ)
        {
            w();
            aJ = true;
        }
    }

    private static void d(int i1)
    {
        char c1 = '\u0632';
        i1;
        JVM INSTR tableswitch 1 5: default 40
    //                   1 79
    //                   2 86
    //                   3 93
    //                   4 72
    //                   5 100;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        gdv.a((new StringBuilder(37)).append("Call in unknown UI state: ").append(i1).toString());
        i1 = c1;
_L8:
        g.b(i1);
        return;
_L5:
        i1 = 1587;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = 1588;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 1589;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 1590;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 2389;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean d(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.aw;
    }

    public static ViewGroup e(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.ay;
    }

    private void e(int i1)
    {
        String s1 = getResources().getString(i1);
        if (eev.a("Babel_calls", 3))
        {
            eev.c("Babel_calls", String.format(Locale.US, "showError:%s (%s)", new Object[] {
                s1, i
            }));
        }
        bot.a(s1, 0).a(getFragmentManager(), null);
    }

    public static Button f(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.ax;
    }

    private static boolean f(int i1)
    {
        return i1 == 1004 || i1 == 30 || i1 == 1005 || i1 == 1011 || i1 == 1010;
    }

    public static cjf g(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.g;
    }

    public static void h(HangoutFragment hangoutfragment)
    {
        hangoutfragment.u();
    }

    public static cjg i(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.f;
    }

    public static hlp j(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.binder;
    }

    public static hlp k(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.binder;
    }

    public static void l(HangoutFragment hangoutfragment)
    {
        hangoutfragment.c(false);
    }

    public static void m(HangoutFragment hangoutfragment)
    {
        hangoutfragment.w();
    }

    public static boolean n(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.aG;
    }

    public static boolean o(HangoutFragment hangoutfragment)
    {
        hangoutfragment.aG = true;
        return true;
    }

    public static boolean p(HangoutFragment hangoutfragment)
    {
        hangoutfragment.aC = true;
        return true;
    }

    public static hlp q(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.binder;
    }

    public static bph r(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.ak;
    }

    public static hlp s(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.binder;
    }

    public static int t()
    {
        return e;
    }

    public static boolean t(HangoutFragment hangoutfragment)
    {
        hangoutfragment.aD = true;
        return true;
    }

    private void u()
    {
        eev.e("Babel_calls", "Creating camera capturer");
        Object obj = getActivity();
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT > 22)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (fzd.a(((Context) (obj)).getContentResolver(), "babel_hangout_enable_camera2", flag) && android.os.Build.VERSION.SDK_INT >= 21)
        {
            obj = new glg(((Context) (obj)));
        } else
        {
            obj = new gle(((Context) (obj)));
        }
        ((glj) (obj)).j();
        ((glj) (obj)).a(true);
        if (a.f() == null)
        {
            eev.g("Babel_calls", "Call was not created before initiating capturer");
        } else
        {
            a.f().a(((gmx) (obj)));
        }
        a(true);
    }

    public static void u(HangoutFragment hangoutfragment)
    {
        hangoutfragment.v();
    }

    private void v()
    {
        if (!aE || !aD)
        {
            boolean flag = aE;
            boolean flag1 = aD;
            eev.c("Babel_calls", (new StringBuilder(101)).append("maybeDoStartup: HangoutFragment not ready to start mOnStartComplete=").append(flag).append(" mPermissionsRequested=").append(flag1).toString());
            return;
        }
        a("maybeDoStartup.enter");
        if (g.a("android.permission.RECORD_AUDIO")) goto _L2; else goto _L1
_L1:
        e(l.dY);
        c(3);
_L4:
        for (Iterator iterator = ap.iterator(); iterator.hasNext(); ((bpb)iterator.next()).a(aB)) { }
        break; /* Loop/switch isn't completed */
_L2:
        if (a.n())
        {
            break; /* Loop/switch isn't completed */
        }
        c(3);
        a(((String) (null)), 1016);
        if (true) goto _L4; else goto _L3
_L3:
        an = new bpd(this);
        am.a(an);
        ao = new bpa(this);
        a.a(ao);
        int i1;
        if (aC)
        {
            i1 = 5;
        } else
        {
            i1 = a(false, false);
        }
        eev.e("Babel_calls", String.format(Locale.US, "maybeDoStartup.changeUiState: %s->%s", new Object[] {
            b(aA), b(i1)
        }));
        aA = i1;
        d(i1);
        if (aA == 4)
        {
            a("maybeDoStartup.finish");
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        aq = true;
        au.a(aB.c());
        aK.a(i.g());
        a("maybeDoStartup.done");
        return;
    }

    private void w()
    {
        boolean flag2 = false;
        if (ecn.c())
        {
            return;
        }
        glt glt1;
        boolean flag;
        boolean flag1;
        if (s() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        glt1 = a.j();
        flag1 = flag2;
        if (glt1 != null)
        {
            flag1 = flag2;
            if (glt1.b().equals(gly.b))
            {
                flag1 = true;
            }
        }
        if (flag || flag1 || aw)
        {
            i.setRequestedOrientation(1);
            return;
        } else
        {
            i.setRequestedOrientation(-1);
            return;
        }
    }

    public void a()
    {
        boolean flag1 = true;
        if (aH != null)
        {
            MenuItem menuitem = aH.findItem(h.cT);
            int i1 = aB.h();
            boolean flag;
            if (i1 != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menuitem.setVisible(flag);
            if (i1 != 0)
            {
                if (i1 == 2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                menuitem.setEnabled(flag);
            }
            if (a.r() != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            aH.findItem(h.cF).setVisible(flag);
            c();
            b();
        }
    }

    public void a(gly gly1, Set set)
    {
        int i1;
        boolean flag;
        flag = true;
        i1 = 0;
        if (aH == null || set == null) goto _L2; else goto _L1
_L1:
        MenuItem menuitem = aH.findItem(h.B);
        if (menuitem == null) goto _L2; else goto _L3
_L3:
        int j1;
        if (set.size() <= 1)
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        j1 = l.fw;
        boz.b[gly1.ordinal()];
        JVM INSTR tableswitch 1 6: default 104
    //                   1 169
    //                   2 169
    //                   3 169
    //                   4 182
    //                   5 195
    //                   6 208;
           goto _L4 _L5 _L5 _L5 _L6 _L7 _L8
_L4:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_208;
_L9:
        if (i1 != 0)
        {
            menuitem.setIcon(i1);
            set = menuitem.getIcon();
            if (gly1 == gly.e || gly1 == gly.f)
            {
                i1 = 127;
            } else
            {
                i1 = 255;
            }
            set.setAlpha(i1);
        }
        menuitem.setTitle(getText(j1));
_L2:
        return;
_L5:
        i1 = com.google.android.apps.hangouts.R.drawable.bO;
        j1 = l.ft;
          goto _L9
_L6:
        i1 = com.google.android.apps.hangouts.R.drawable.co;
        j1 = l.fv;
          goto _L9
_L7:
        i1 = com.google.android.apps.hangouts.R.drawable.cj;
        j1 = l.fu;
          goto _L9
        i1 = com.google.android.apps.hangouts.R.drawable.cd;
        j1 = l.fw;
          goto _L9
    }

    public void a(boolean flag)
    {
        if (a.s() != null)
        {
            a.s().a(flag);
        }
    }

    public void b()
    {
        if (aH == null) goto _L2; else goto _L1
_L1:
        glj glj2;
        int i1;
        int j1;
        glj glj1 = bnk.k();
        MenuItem menuitem = aH.findItem(h.ce);
        boolean flag;
        if (aI == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        if (!menuitem.isVisible()) goto _L2; else goto _L3
_L3:
        if (!menuitem.isEnabled()) goto _L5; else goto _L4
_L4:
        j1 = l.dT;
        glj2 = bnk.k();
        i1 = j1;
        if (glj2 == null) goto _L7; else goto _L6
_L6:
        glj2.i();
        JVM INSTR tableswitch 1 2: default 104
    //                   1 201
    //                   2 220;
           goto _L8 _L9 _L10
_L8:
        i1 = glj2.i();
        eev.f("Babel_calls", (new StringBuilder(32)).append("Unknown camera type: ").append(i1).toString());
        i1 = j1;
_L7:
        menuitem.setTitle(getString(i1));
_L5:
        j1 = com.google.android.apps.hangouts.R.drawable.bS;
        i1 = j1;
        if (glj1 != null)
        {
            i1 = j1;
            if (glj1.i() == 2)
            {
                i1 = com.google.android.apps.hangouts.R.drawable.bT;
            }
        }
        menuitem.setIcon(i1);
_L2:
        return;
_L9:
        i1 = j1;
        if (glj2.b())
        {
            i1 = l.dU;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        i1 = j1;
        if (glj2.a())
        {
            i1 = l.dV;
        }
        if (true) goto _L7; else goto _L11
_L11:
    }

    public void c()
    {
        glt glt1 = a.j();
        if (glt1 != null)
        {
            a(glt1.b(), glt1.c());
        }
    }

    boolean d()
    {
        if (aw)
        {
            a(((String) (null)), false);
            return true;
        }
        if (aA == 1)
        {
            a.e();
            return true;
        } else
        {
            return false;
        }
    }

    public void e()
    {
        aC = false;
        c(a(true, false));
    }

    public void f()
    {
        al = false;
        aC = false;
        c(a(true, true));
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        ar.b();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (j1 != -1) goto _L4; else goto _L3
_L3:
        c(a(false, false));
        aC = false;
_L6:
        return;
_L4:
        i.n();
        return;
_L2:
        if (i1 == 1)
        {
            aw = false;
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        i = (HangoutActivity)activity;
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        h = (gqu)binder.a(gqu);
        f = (cjg)binder.a(cjg);
        g = (cjf)binder.a(cjf);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        for (Iterator iterator = ap.iterator(); iterator.hasNext(); ((bpb)iterator.next()).onConfigurationChanged(configuration)) { }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        aj = i.m();
        if (eev.a("Babel_calls", 3))
        {
            eev.c("Babel_calls", String.format(Locale.US, "HangoutFragment.onCreate: this=%s activity=%s hangoutRequest=%s", new Object[] {
                this, i, aj
            }));
        }
        boolean flag;
        if (bundle == null)
        {
            ak = aj.r();
        } else
        {
            ak = (bph)bundle.getParcelable("HangoutFragment_current_request");
            aC = bundle.getBoolean("HangoutFragment_waiting_for_result");
            al = bundle.getBoolean("HangoutFragment_hangout_initiated", false);
            aF = bundle.getBoolean("HangoutFragment_audio_muted_awaiting_result");
        }
        az = dcn.e(h.a());
        setHasOptionsMenu(true);
        b = (AccessibilityManager)i.getSystemService("accessibility");
        if (aj.l() != 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i.getIntent().getIntExtra("hangout_pstn_call", 2) == 1)
        {
            aL = 1;
        } else
        if (flag)
        {
            aL = 3;
        } else
        {
            aL = 2;
        }
        bundle = new ArrayList();
        if (!g.a("android.permission.RECORD_AUDIO"))
        {
            bundle.add("android.permission.RECORD_AUDIO");
        }
        if (!g.a("android.permission.CAMERA") && aL == 3)
        {
            bundle.add("android.permission.CAMERA");
        }
        if (bundle.size() > 0)
        {
            f.a(d, new box(this));
            f.a(d, bundle, 2656, null);
        } else
        {
            aD = true;
        }
        if (!g.a("android.permission.CAMERA"))
        {
            f.a(e, new boy(this));
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
label0:
        {
            boolean flag2 = false;
            menuinflater.inflate(g.hn, menu);
            aH = menu;
            b();
            menu = aH.findItem(h.B);
            menuinflater = BluetoothAdapter.getDefaultAdapter();
            boolean flag;
            boolean flag1;
            if (menuinflater != null && menuinflater.getProfileConnectionState(1) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menuinflater = a.j();
            if (!flag)
            {
                flag1 = flag2;
                if (menuinflater == null)
                {
                    break label0;
                }
                flag1 = flag2;
                if (!menuinflater.j())
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        menu.setVisible(flag1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(g.fW, null);
        ar = new bqo(this, viewgroup);
        ((bvm)hlp.a(i, bvm)).a((Snackbar)viewgroup.findViewById(h.co));
        au = new bnu(i, lifecycle);
        lifecycle.a((DebugOverlayTextView)viewgroup.findViewById(h.bQ));
        bundle = (PresentToAllBannerView)viewgroup.findViewById(h.eq);
        as = (ParticipantTrayView)viewgroup.findViewById(h.cm);
        as.a(ar);
        at = (FocusedParticipantView)viewgroup.findViewById(h.bT);
        at.a(ar, as);
        as.a(at);
        av = (ProximityCoverView)viewgroup.findViewById(h.ev);
        aw = false;
        BroadcastOverlayView broadcastoverlayview = (BroadcastOverlayView)viewgroup.findViewById(h.bN);
        ax = (Button)viewgroup.findViewById(h.cY);
        ay = (ViewGroup)viewgroup.findViewById(h.cZ);
        HangoutActivity hangoutactivity = i;
        aoa aoa = az;
        String s1 = aj.e();
        layoutinflater = a.s();
        if (layoutinflater == null)
        {
            layoutinflater = aj;
        } else
        {
            layoutinflater = layoutinflater.d();
        }
        if (layoutinflater.q())
        {
            layoutinflater = layoutinflater.g();
        } else
        {
            layoutinflater = null;
        }
        aK = new bor(hangoutactivity, aoa, s1, layoutinflater);
        ap.add(bundle);
        ap.add(broadcastoverlayview);
        ap.add(at);
        ap.add(as);
        ap.add(ar);
        ap.add(new bnz(getActivity()));
        ap.add(aK);
        return viewgroup;
    }

    public void onDestroy()
    {
        a("onDestroy.enter");
        super.onDestroy();
        a("onDestroy.done");
    }

    public void onDestroyOptionsMenu()
    {
        super.onDestroyOptionsMenu();
    }

    public void onDestroyView()
    {
        a("onDestroyView.enter");
        as.b();
        super.onDestroyView();
        a("onDestroyView.done");
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() != h.cT) goto _L2; else goto _L1
_L1:
        g.b(889);
        ar.d();
_L4:
        return false;
_L2:
        if (menuitem.getItemId() == h.cF)
        {
            menuitem = a.r();
            if (menuitem != null)
            {
                ar.a(menuitem.a());
            }
        } else
        if (menuitem.getItemId() == h.B)
        {
            ar.f();
        } else
        if (menuitem.getItemId() == h.ce)
        {
            ar.e();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPause()
    {
        a("onPause.enter");
        super.onPause();
        glj glj1 = bnk.k();
        if (glj1 != null)
        {
            a(glj1.h());
            glj1.a(false);
        }
        av.b();
        av.d();
        av.e();
        a("onPause.done");
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        a();
    }

    public void onResume()
    {
        a("onResume.enter");
        super.onResume();
        glj glj1 = bnk.k();
        if (glj1 != null)
        {
            boolean flag;
            if (a.s() != null)
            {
                flag = a.s().h();
            } else
            {
                flag = false;
            }
            glj1.a(flag);
        }
        if (!bsg.a(getContext()))
        {
            eev.e("Babel_calls", "Using legacy proximity.");
            av.a(ar);
            av.a(ar);
        } else
        {
            eev.e("Babel_calls", "Using service proximity.");
            a.b();
        }
        if (a.n())
        {
            c(true);
        }
        a("onResume.done");
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("HangoutFragment_current_request", ak);
        bundle.putBoolean("HangoutFragment_waiting_for_result", aC);
        bundle.putBoolean("HangoutFragment_hangout_initiated", al);
        bundle.putBoolean("HangoutFragment_audio_muted_awaiting_result", aF);
    }

    public void onStart()
    {
        super.onStart();
        a("onStart.enter");
        aE = true;
        v();
        a("onStart.done");
    }

    public void onStop()
    {
        a("onStop.enter");
        super.onStop();
        if (an != null)
        {
            am.b(an);
            an = null;
        }
        if (ao != null)
        {
            a.b(ao);
        }
        if (aA == 4)
        {
            a("onStop.finish");
            return;
        }
        if (aq)
        {
            for (Iterator iterator = ap.iterator(); iterator.hasNext(); ((bpb)iterator.next()).j_()) { }
            a("onStop.stopped");
        }
        a("onStop.done");
    }

    bph q()
    {
        return ak;
    }

    String r()
    {
        return q().e();
    }

    public int s()
    {
        if (aA == 2 && a.s() != null)
        {
            return a.s().L();
        } else
        {
            return i.getIntent().getIntExtra("hangout_pstn_call", 2);
        }
    }

    static 
    {
        hnc hnc = eev.f;
        d = h.gA;
        e = h.gB;
    }
}
