// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import ahk;
import ai;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
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
import ani;
import ank;
import bnd;
import bnm;
import bnr;
import bnz;
import bof;
import boi;
import bok;
import boo;
import bop;
import boq;
import bor;
import bos;
import bot;
import bou;
import boy;
import bpd;
import bqf;
import bqr;
import brx;
import buz;
import ceu;
import chz;
import cia;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import dbf;
import dzj;
import ebw;
import g;
import gal;
import gap;
import gbh;
import gic;
import gie;
import gih;
import gir;
import giw;
import gjk;
import gjr;
import gkj;
import gmo;
import h;
import hgx;
import hhu;
import hjg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import l;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            HangoutActivity, InCallDialpadActivity, ProximityCoverView, DebugOverlayTextView, 
//            PresentToAllBannerView, ParticipantTrayView, FocusedParticipantView, BroadcastOverlayView

public final class HangoutFragment extends hhu
{

    private static final boolean c = false;
    private static final int d;
    private static final int e;
    public final bnd a = bnd.a();
    private int aA;
    private final bot aB = new bot(this);
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private Menu aH;
    private int aI;
    private boolean aJ;
    private boi aK;
    private int aL;
    private boy aj;
    private boy ak;
    private boolean al;
    private final bof am = bof.a();
    private bou an;
    private bor ao;
    private final ArrayList ap = new ArrayList();
    private boolean aq;
    private bqf ar;
    private ParticipantTrayView as;
    private FocusedParticipantView at;
    private bnm au;
    private ProximityCoverView av;
    private boolean aw;
    private Button ax;
    private ViewGroup ay;
    private ani az;
    public AccessibilityManager b;
    private cia f;
    private chz g;
    private gmo h;
    private HangoutActivity i;

    public HangoutFragment()
    {
        aA = 0;
    }

    private int a(boolean flag, boolean flag1)
    {
        boolean flag2 = getActivity().getIntent().getBooleanExtra("hangout_auto_join", false);
        if (!a.n())
        {
            if (al)
            {
                bnz bnz1 = bnz.b(i, ak);
                if (bnz1 == null)
                {
                    i.finish();
                    return 4;
                }
                int i1 = bnz1.a();
                if (bnz1.b() || e(i1))
                {
                    if (ebw.a("Babel_calls", 3))
                    {
                        ebw.c("Babel_calls", (new StringBuilder(38)).append("Hangout previously exited: ").append(i1).toString());
                    }
                    i.n();
                    return 4;
                } else
                {
                    a(((String) (null)), i1);
                    bnz.a(i, ak);
                    return 3;
                }
            }
            if (az != null && !flag && ank.j(getContext(), az))
            {
                aC = true;
                (new bqr()).a(getFragmentManager(), null);
                return !flag2 ? 1 : 3;
            }
            b(flag1);
            if (a.t() == null)
            {
                return 3;
            }
            if (flag2 || flag1)
            {
                a.x();
                return a.t() != null ? 2 : 3;
            } else
            {
                return 1;
            }
        }
        if (a.t().a((HangoutActivity)getActivity()))
        {
            ebw.e("Babel_calls", "Continuing call where previous activity left off.");
            ak = a.t().e();
            al = true;
            return !flag2 && !a.m() ? 1 : 2;
        }
        if (c)
        {
            String s1 = String.valueOf(a.t().e());
            ebw.b("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 16)).append("Already joined: ").append(s1).toString());
        }
        aj.s();
        d(l.dR);
        return 3;
    }

    public static ani a(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.az;
    }

    public static boy a(HangoutFragment hangoutfragment, boy boy1)
    {
        hangoutfragment.ak = boy1;
        return boy1;
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
        if (ebw.a("Babel_calls", 3))
        {
            ebw.c("Babel_calls", String.format("Lifecycle HangoutFragment.%s(this=%s) activity=%s hangoutRequest=%s", new Object[] {
                s1, this, i, aj
            }));
        }
    }

    private void a(String s1, int i1)
    {
        bok.a(s1, i1).a(getFragmentManager(), null);
    }

    private void a(String s1, boolean flag)
    {
        if (aw == flag)
        {
            return;
        }
        if (flag)
        {
            Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/hangout/InCallDialpadActivity);
            intent.putExtra("extra_endpoint_jid", s1);
            startActivityForResult(intent, 1);
        }
        aw = flag;
        x();
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
        return e(i1);
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
        ceu ceu1 = (ceu)intent.getParcelableExtra("pstn_caller");
        int i1 = intent.getIntExtra("hangout_start_source", 51);
        int j1 = intent.getIntExtra("hangout_pstn_call", 2);
        long l1 = intent.getLongExtra("extra_hangout_start_time", 0L);
        a.a(aj.r(), flag, ((List) (obj)), arraylist, flag1, ceu1, i1, aL, true, l1, null, null, null);
        obj = a.t();
        if (((TelephonyManager)g.nS.getSystemService("phone")).getCallState() == 2)
        {
            a(((String) (null)), 1013);
            c(3);
            ((bpd) (obj)).c(1013);
            return;
        }
        a.y();
        if (aL == 3 && g.a("android.permission.CAMERA"))
        {
            v();
        }
        if (intent.getBooleanExtra("hangout_present_all", false))
        {
            a.h();
        }
        if (intent.getBooleanExtra("hangout_mute_microphone", false))
        {
            a.a(true);
        }
        if (intent.getBooleanExtra("hangout_mute_playback", false))
        {
            a.b(true);
        }
        ((gap)binder.a(gap)).a(((gmo)binder.a(gmo)).a()).a();
        ((bpd) (obj)).b(j1);
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
        char c1;
        ebw.e("Babel_calls", String.format(Locale.US, "changeUiState: %s->%s", new Object[] {
            b(aA), b(i1)
        }));
        if (i1 == aA)
        {
            return;
        }
        aA = i1;
        c1 = '\u0632';
        i1;
        JVM INSTR tableswitch 1 5: default 88
    //                   1 197
    //                   2 204
    //                   3 211
    //                   4 190
    //                   5 218;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        gbh.a((new StringBuilder(37)).append("Call in unknown UI state: ").append(i1).toString());
_L8:
        g.b(c1);
        if (i1 == 2)
        {
            gbh.a(Integer.valueOf(aB.c()), Integer.valueOf(2));
            i.getWindow().setFlags(128, 128);
        }
        for (Iterator iterator = ap.iterator(); iterator.hasNext(); ((bos)iterator.next()).a(i1)) { }
        break; /* Loop/switch isn't completed */
_L5:
        c1 = '\u0633';
        continue; /* Loop/switch isn't completed */
_L2:
        c1 = '\u0634';
        continue; /* Loop/switch isn't completed */
_L3:
        c1 = '\u0635';
        continue; /* Loop/switch isn't completed */
_L4:
        c1 = '\u0636';
        continue; /* Loop/switch isn't completed */
_L6:
        c1 = '\u0955';
        if (true) goto _L8; else goto _L7
_L7:
        au.a(i1);
        return;
    }

    private void c(boolean flag)
    {
        al = false;
        aC = false;
        c(a(true, flag));
    }

    private void d(int i1)
    {
        String s1 = getResources().getString(i1);
        if (ebw.a("Babel_calls", 3))
        {
            ebw.c("Babel_calls", String.format(Locale.US, "showError:%s (%s)", new Object[] {
                s1, i
            }));
        }
        bok.a(s1, 0).a(getFragmentManager(), null);
    }

    private void d(boolean flag)
    {
        gbh.a(a.o());
        if (flag || !aJ)
        {
            av.a();
        }
        if (!aJ)
        {
            x();
            aJ = true;
        }
    }

    public static boolean d(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.aw;
    }

    public static ViewGroup e(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.ay;
    }

    private static boolean e(int i1)
    {
        return i1 == 1004 || i1 == 30 || i1 == 1005 || i1 == 1011 || i1 == 1010;
    }

    public static Button f(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.ax;
    }

    public static chz g(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.g;
    }

    public static void h(HangoutFragment hangoutfragment)
    {
        hangoutfragment.v();
    }

    public static cia i(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.f;
    }

    public static hgx j(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.binder;
    }

    public static hgx k(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.binder;
    }

    public static void l(HangoutFragment hangoutfragment)
    {
        hangoutfragment.d(false);
    }

    public static void m(HangoutFragment hangoutfragment)
    {
        hangoutfragment.x();
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

    public static hgx q(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.binder;
    }

    public static hgx r(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.binder;
    }

    public static boy s(HangoutFragment hangoutfragment)
    {
        return hangoutfragment.ak;
    }

    public static boolean t(HangoutFragment hangoutfragment)
    {
        hangoutfragment.aD = true;
        return true;
    }

    public static int u()
    {
        return e;
    }

    public static void u(HangoutFragment hangoutfragment)
    {
        hangoutfragment.w();
    }

    private void v()
    {
        ebw.e("Babel_calls", "Creating camera capturer");
        Object obj = getActivity();
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            obj = new gic(((Context) (obj)));
        } else
        if (android.os.Build.VERSION.SDK_INT > 21)
        {
            obj = new gie(((Context) (obj)));
        } else
        if (gie.a(((Context) (obj))))
        {
            obj = new gie(((Context) (obj)));
        } else
        {
            obj = new gic(((Context) (obj)));
        }
        ((gih) (obj)).a(true);
        a.f().a(((gjv) (obj)));
        a(true);
    }

    private void w()
    {
        if (!aE || !aD)
        {
            boolean flag = aE;
            boolean flag1 = aD;
            ebw.c("Babel_calls", (new StringBuilder(101)).append("maybeDoStartup: HangoutFragment not ready to start mOnStartComplete=").append(flag).append(" mPermissionsRequested=").append(flag1).toString());
            return;
        }
        a("maybeDoStartup.enter");
        if (g.a("android.permission.RECORD_AUDIO")) goto _L2; else goto _L1
_L1:
        d(l.ep);
        c(3);
_L4:
        for (Iterator iterator = ap.iterator(); iterator.hasNext(); ((bos)iterator.next()).a(aB)) { }
        break; /* Loop/switch isn't completed */
_L2:
        if (a.o())
        {
            break; /* Loop/switch isn't completed */
        }
        c(3);
        a(((String) (null)), 1016);
        if (true) goto _L4; else goto _L3
_L3:
        an = new bou(this);
        am.a(an);
        ao = new bor(this);
        a.a(ao);
        int i1;
        if (aC)
        {
            i1 = 5;
        } else
        {
            i1 = a(false, false);
        }
        ebw.e("Babel_calls", String.format(Locale.US, "maybeDoStartup.changeUiState: %s->%s", new Object[] {
            b(aA), b(i1)
        }));
        aA = i1;
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

    private void x()
    {
        boolean flag2 = false;
        if (dzj.c())
        {
            return;
        }
        gir gir1;
        boolean flag;
        boolean flag1;
        if (t() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gir1 = a.k();
        flag1 = flag2;
        if (gir1 != null)
        {
            flag1 = flag2;
            if (gir1.b().equals(giw.b))
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
label0:
        {
label1:
            {
                boolean flag2 = false;
                if (aH == null)
                {
                    break label0;
                }
                Object obj = aH.findItem(h.de);
                int i1 = aB.h();
                boolean flag;
                boolean flag1;
                if (i1 != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                ((MenuItem) (obj)).setVisible(flag1);
                if (i1 != 0)
                {
                    boolean flag3;
                    if (i1 == 2)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    ((MenuItem) (obj)).setEnabled(flag1);
                }
                obj = (ahk)hgx.b(getActivity().getApplicationContext(), ahk);
                flag3 = a.w();
                if (a.s() != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (obj == null)
                {
                    flag1 = flag2;
                    if (!flag3)
                    {
                        break label1;
                    }
                }
                flag1 = flag2;
                if (flag)
                {
                    flag1 = true;
                }
            }
            aH.findItem(h.cP).setVisible(flag1);
            c();
            b();
        }
    }

    public void a(giw giw1, Set set)
    {
        int i1;
        boolean flag;
        flag = true;
        i1 = 0;
        if (aH == null || set == null) goto _L2; else goto _L1
_L1:
        MenuItem menuitem = aH.findItem(h.C);
        if (menuitem == null) goto _L2; else goto _L3
_L3:
        int j1;
        if (set.size() <= 1)
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        j1 = l.fN;
        boq.b[giw1.ordinal()];
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
            if (giw1 == giw.e || giw1 == giw.f)
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
        i1 = com.google.android.apps.hangouts.R.drawable.bW;
        j1 = l.fK;
          goto _L9
_L6:
        i1 = com.google.android.apps.hangouts.R.drawable.cw;
        j1 = l.fM;
          goto _L9
_L7:
        i1 = com.google.android.apps.hangouts.R.drawable.cr;
        j1 = l.fL;
          goto _L9
        i1 = com.google.android.apps.hangouts.R.drawable.cl;
        j1 = l.fN;
          goto _L9
    }

    public void a(boolean flag)
    {
        if (a.t() != null)
        {
            a.t().a(flag);
        }
    }

    public void b()
    {
        if (aH == null) goto _L2; else goto _L1
_L1:
        gih gih2;
        int i1;
        int j1;
        gih gih1 = bnd.l();
        MenuItem menuitem = aH.findItem(h.co);
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
        j1 = l.ek;
        gih2 = bnd.l();
        i1 = j1;
        if (gih2 == null) goto _L7; else goto _L6
_L6:
        gih2.i();
        JVM INSTR tableswitch 1 2: default 104
    //                   1 201
    //                   2 220;
           goto _L8 _L9 _L10
_L8:
        i1 = gih2.i();
        ebw.f("Babel_calls", (new StringBuilder(32)).append("Unknown camera type: ").append(i1).toString());
        i1 = j1;
_L7:
        menuitem.setTitle(getString(i1));
_L5:
        j1 = com.google.android.apps.hangouts.R.drawable.ca;
        i1 = j1;
        if (gih1 != null)
        {
            i1 = j1;
            if (gih1.i() == 2)
            {
                i1 = com.google.android.apps.hangouts.R.drawable.cb;
            }
        }
        menuitem.setIcon(i1);
_L2:
        return;
_L9:
        i1 = j1;
        if (gih2.b())
        {
            i1 = l.el;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        i1 = j1;
        if (gih2.a())
        {
            i1 = l.em;
        }
        if (true) goto _L7; else goto _L11
_L11:
    }

    public void c()
    {
        gir gir1 = a.k();
        if (gir1 != null)
        {
            a(gir1.b(), gir1.c());
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
        c(true);
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
        h = (gmo)binder.a(gmo);
        f = (cia)binder.a(cia);
        g = (chz)binder.a(chz);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        for (Iterator iterator = ap.iterator(); iterator.hasNext(); ((bos)iterator.next()).onConfigurationChanged(configuration)) { }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        aj = i.m();
        if (ebw.a("Babel_calls", 3))
        {
            ebw.c("Babel_calls", String.format(Locale.US, "HangoutFragment.onCreate: this=%s activity=%s hangoutRequest=%s", new Object[] {
                this, i, aj
            }));
        }
        boolean flag;
        if (bundle == null)
        {
            ak = aj.r();
        } else
        {
            ak = (boy)bundle.getParcelable("HangoutFragment_current_request");
            aC = bundle.getBoolean("HangoutFragment_waiting_for_result");
            al = bundle.getBoolean("HangoutFragment_hangout_initiated", false);
            aF = bundle.getBoolean("HangoutFragment_audio_muted_awaiting_result");
        }
        az = dbf.e(h.a());
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
            f.a(d, new boo(this));
            f.a(d, bundle, 2656, null);
        } else
        {
            aD = true;
        }
        if (!g.a("android.permission.CAMERA"))
        {
            f.a(e, new bop(this));
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(g.hv, menu);
        aH = menu;
        b();
        menu = aH.findItem(h.C);
        menuinflater = (TelephonyManager)i.getSystemService("phone");
        BluetoothAdapter bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        boolean flag;
        boolean flag1;
        if (bluetoothadapter != null && bluetoothadapter.getProfileConnectionState(1) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || gkj.a(menuinflater))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menu.setVisible(flag1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(g.ga, null);
        ar = new bqf(this, viewgroup);
        ((buz)hgx.a(i, buz)).a((Snackbar)viewgroup.findViewById(h.cy));
        au = new bnm(i, lifecycle);
        lifecycle.a((DebugOverlayTextView)viewgroup.findViewById(h.ca));
        bundle = (PresentToAllBannerView)viewgroup.findViewById(h.eI);
        as = (ParticipantTrayView)viewgroup.findViewById(h.cw);
        as.a(ar);
        at = (FocusedParticipantView)viewgroup.findViewById(h.cd);
        at.a(ar, as);
        as.a(at);
        av = (ProximityCoverView)viewgroup.findViewById(h.eN);
        aw = false;
        BroadcastOverlayView broadcastoverlayview = (BroadcastOverlayView)viewgroup.findViewById(h.bX);
        ax = (Button)viewgroup.findViewById(h.dk);
        ay = (ViewGroup)viewgroup.findViewById(h.dl);
        HangoutActivity hangoutactivity = i;
        ani ani = az;
        String s1 = aj.e();
        layoutinflater = a.t();
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
        aK = new boi(hangoutactivity, ani, s1, layoutinflater);
        ap.add(bundle);
        ap.add(broadcastoverlayview);
        ap.add(at);
        ap.add(as);
        ap.add(ar);
        ap.add(new bnr(getActivity()));
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

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() != h.de) goto _L2; else goto _L1
_L1:
        g.b(889);
        ar.d();
_L4:
        return false;
_L2:
        if (menuitem.getItemId() == h.cP)
        {
            menuitem = a.s();
            if (menuitem != null)
            {
                ar.a(menuitem.a());
            }
        } else
        if (menuitem.getItemId() == h.C)
        {
            ar.f();
        } else
        if (menuitem.getItemId() == h.co)
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
        gih gih1 = bnd.l();
        if (gih1 != null)
        {
            a(gih1.h());
            gih1.a(false);
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
        gih gih1 = bnd.l();
        if (gih1 != null)
        {
            boolean flag;
            if (a.t() != null)
            {
                flag = a.t().h();
            } else
            {
                flag = false;
            }
            gih1.a(flag);
        }
        if (!brx.a(getContext()))
        {
            ebw.e("Babel_calls", "Using legacy proximity.");
            av.a(ar);
            av.a(ar);
        } else
        {
            ebw.e("Babel_calls", "Using service proximity.");
            a.b();
        }
        if (a.o())
        {
            d(true);
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
        w();
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
            for (Iterator iterator = ap.iterator(); iterator.hasNext(); ((bos)iterator.next()).i_()) { }
            a("onStop.stopped");
        }
        a("onStop.done");
    }

    public void q()
    {
        c(false);
    }

    boy r()
    {
        return ak;
    }

    String s()
    {
        return r().e();
    }

    public int t()
    {
        if (aA == 2 && a.t() != null)
        {
            return a.t().M();
        } else
        {
            return i.getIntent().getIntExtra("hangout_pstn_call", 2);
        }
    }

    static 
    {
        hik hik = ebw.f;
        d = h.gU;
        e = h.gV;
    }
}
