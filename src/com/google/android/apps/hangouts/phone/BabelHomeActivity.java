// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ad;
import aia;
import ais;
import amo;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;
import any;
import aoa;
import aoc;
import aot;
import ap;
import atu;
import beq;
import bev;
import bex;
import bhj;
import bjh;
import bkm;
import bnk;
import bwn;
import bye;
import byf;
import caf;
import cag;
import cci;
import cfo;
import cgd;
import ckk;
import ckl;
import ckm;
import ckn;
import cko;
import ckp;
import ckq;
import ckr;
import cks;
import ckt;
import cku;
import ckv;
import ckw;
import cky;
import ckz;
import cla;
import clb;
import clc;
import cna;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.BootReceiver;
import com.google.android.apps.hangouts.util.TabHostEx;
import com.google.android.apps.hangouts.views.BalanceView;
import com.google.android.apps.hangouts.views.HangoutsToolbar;
import com.google.android.apps.hangouts.views.MainViewPager;
import com.google.android.gms.common.ConnectionResult;
import cov;
import cqf;
import cra;
import crb;
import csw;
import ctm;
import cvc;
import dbt;
import dcn;
import ddg;
import ddi;
import ddm;
import dir;
import djs;
import dlb;
import due;
import dur;
import dvg;
import dvh;
import dvi;
import dvo;
import ecn;
import eep;
import eev;
import efh;
import ehu;
import enb;
import end;
import g;
import gqv;
import gqw;
import gqz;
import grb;
import gxn;
import h;
import hbd;
import hbo;
import hbu;
import hbv;
import hlp;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l;
import lg;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            GmsInstallActivity

public class BabelHomeActivity extends bkm
    implements bhj, bjh, cci, ddi, djs, enb, end, gqw
{

    public static LinkedList n = new LinkedList();
    private static final boolean o = false;
    private static final efh p = efh.a("HomeActivity");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private BalanceView E;
    private DrawerLayout F;
    private NavigationDrawerFragment G;
    private cqf H;
    private MainViewPager I;
    private TabHostEx J;
    private String K;
    private String L;
    private String M;
    private bev N;
    private lg O;
    private Menu P;
    private Runnable Q;
    private dbt R;
    private csw S;
    private dvg T;
    private long U;
    private long V;
    private amo W;
    private bye X;
    private long Y;
    private boolean Z;
    private gxn aa;
    private final hbd ab;
    private final dvi ac;
    private final dvo ad = new ckk(this);
    private aoa s;
    private ConversationListFragment t;
    private CallContactPickerFragment u;
    private boolean v;
    private boolean w;
    private final Handler x = new Handler();
    private boolean y;
    private boolean z;

    public BabelHomeActivity()
    {
        U = -1L;
        Y = -1L;
        ab = (new hbd(this, r)).a("active-hangouts-account").a(q).b(this);
        ac = (new dvi(this, r)).b(q);
        new ais(this, r);
        new ctm(this, r);
    }

    private void a(aia aia1, Intent intent, int i1)
    {
        if (o)
        {
            String s1 = aia1.a;
            int j1 = aia1.b;
            d((new StringBuilder(String.valueOf(s1).length() + 51)).append("openConversation conversationId: ").append(s1).append(" type: ").append(j1).toString());
        }
        Intent intent1 = g.a(i1, aia1.a, aia1.b);
        intent1.putExtra("conversation_parameters", aia1);
        intent1.putExtra("opened_from_impression", aia1.k);
        if (intent != null)
        {
            eev.c("Babel", "Injecting share intent.");
            intent1.putExtra("share_intent", intent);
        }
        startActivity(intent1);
        aia1 = String.valueOf(aia1.a);
        if (aia1.length() != 0)
        {
            aia1 = "openConversation ".concat(aia1);
        } else
        {
            aia1 = new String("openConversation ");
        }
        c(aia1);
    }

    public static void a(BabelHomeActivity babelhomeactivity, aia aia1, Intent intent, int i1)
    {
        babelhomeactivity.a(aia1, intent, i1);
    }

    public static void a(BabelHomeActivity babelhomeactivity, String s1)
    {
        babelhomeactivity.b(s1);
    }

    public static void a(BabelHomeActivity babelhomeactivity, boolean flag)
    {
        babelhomeactivity.e(flag);
    }

    public static void a(PrintWriter printwriter)
    {
        Iterator iterator = n.iterator();
        int i1 = 0;
        long l1 = 0L;
        while (iterator.hasNext()) 
        {
            clc clc1 = (clc)iterator.next();
            clc1.a(i1, printwriter, l1);
            l1 = clc1.a;
            i1++;
        }
    }

    public static boolean a(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.A;
    }

    public static bev b(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.N;
    }

    private void b(String s1)
    {
        String s2;
        dvh dvh1;
        boolean flag;
        int i1;
        if (T != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dvh1 = new dvh(this);
        i1 = l.ki;
        if (s.D())
        {
            s2 = s.c();
        } else
        {
            s2 = s.a();
        }
        dvh1.a(getString(i1, new Object[] {
            s2
        }));
        dvh1.b(s1);
        dvh1.a(TimeUnit.SECONDS.toMillis(5L));
        dvh1.a(new ckn(this));
        s1 = dvh1.a();
        if (flag)
        {
            ac.a(T, s1);
        } else
        {
            ac.a(s1);
        }
        T = s1;
    }

    private void b(boolean flag)
    {
        if (s != null && !s.o())
        {
            e(flag);
            NetworkInfo networkinfo = ((ConnectivityManager)getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            boolean flag1;
            if (networkinfo != null && networkinfo.isConnected())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                long l1 = g.a(this, "babel_request_voice_account_data_delay_ms", 30000L);
                long l2 = System.currentTimeMillis();
                if (l1 + V <= l2)
                {
                    V = l2;
                    g.a(s.h(), this, false, new cky(this, flag));
                    return;
                }
            }
        }
    }

    public static void c(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.v();
    }

    private static void c(String s1)
    {
        eev.a("Babel", s1);
        if (eev.b())
        {
            n.add(new clc(s1));
            for (; n.size() > 40; n.remove(0)) { }
        }
    }

    private void c(boolean flag)
    {
        boolean flag2 = true;
        if (!y && A)
        {
            MainViewPager mainviewpager;
            ap ap1;
            boolean flag1;
            int i1;
            if (q.b(beq) != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            mainviewpager = I;
            i1 = ab.a();
            ap1 = u_();
            if (flag && !flag1)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            if (mainviewpager.a(i1, ap1, flag))
            {
                if (I.a(K))
                {
                    K = null;
                } else
                {
                    String s1 = PreferenceManager.getDefaultSharedPreferences(this).getString("last_selected_tab", null);
                    I.a(s1);
                }
                J.a(getLayoutInflater());
                v();
            }
            z = false;
            return;
        } else
        {
            z = true;
            return;
        }
    }

    private static boolean c(Intent intent)
    {
        if (intent != null)
        {
            if ("android.intent.action.RESPOND_VIA_MESSAGE".equals(intent.getAction()))
            {
                return true;
            }
            intent = intent.getData();
            if (intent != null)
            {
                intent = intent.toString();
                if (intent != null && (intent.startsWith("sms:") || intent.startsWith("smsto:") || intent.startsWith("mms:") || intent.startsWith("mmsto:")))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static MainViewPager d(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.I;
    }

    private void d(int i1)
    {
        getWindow().setStatusBarColor(getResources().getColor(i1));
    }

    private static void d(String s1)
    {
        String s2 = String.valueOf("[BabelHomeActivity] ");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = s2.concat(s1);
        } else
        {
            s1 = new String(s2);
        }
        eev.b("Babel", s1);
    }

    private void d(boolean flag)
    {
        boolean flag2 = true;
        if (!C)
        {
            long l1 = ((amo)q.a(amo)).a("babel_account_snackbar_reshow", dlb.n);
            boolean flag1;
            if (flag || U == -1L || SystemClock.elapsedRealtime() - U > l1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (((gqz)hlp.a(this, gqz)).a(new String[] {
    "logged_in"
}).size() <= 1)
            {
                flag2 = false;
            }
            if (flag1 & flag2)
            {
                U = SystemClock.elapsedRealtime();
                if (ab.c().d("sms_only"))
                {
                    b(((String) (null)));
                    return;
                }
                if (S != null)
                {
                    S.a(null);
                }
                S = new ckm(this, this, r, s.h(), cvc.c.j);
                S.a(s.b().a);
                return;
            }
        }
    }

    private static boolean d(Intent intent)
    {
        return TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.recentcalls") || TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.dialpad");
    }

    public static Runnable e(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.Q;
    }

    private void e(boolean flag)
    {
        if (R.b(s) && !s.Y())
        {
            if (E == null)
            {
                E = (BalanceView)getLayoutInflater().inflate(g.gZ, null);
                ((HangoutsToolbar)m).a(E);
            }
            if (flag)
            {
                E.a(true);
            }
        } else
        if (E != null)
        {
            E.a(false);
            return;
        }
    }

    public static hbd f(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.ab;
    }

    public static amo g(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.W;
    }

    public static Handler h(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.x;
    }

    public static boolean i(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.C = true;
        return true;
    }

    public static boolean j(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.D = false;
        return false;
    }

    public static void k(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.p();
    }

    public static void l(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.t();
    }

    public static csw m(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.S;
    }

    public static csw n(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.S = null;
        return null;
    }

    public static dvg o(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.T = null;
        return null;
    }

    public static aoa p(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.s;
    }

    private void p()
    {
        if (C)
        {
            D = true;
            return;
        }
        C = true;
        D = false;
        Intent intent = getIntent();
        if (c(intent) && !intent.hasExtra("account_id"))
        {
            if (dcn.j())
            {
                int i1 = dcn.l().h();
                ab.a((new hbo()).a(i1).b());
                return;
            } else
            {
                Toast.makeText(this, l.jB, 0).show();
                finish();
                return;
            }
        } else
        {
            ab.a((new hbo()).a().c().a(hbu, (new hbv()).b().c()));
            return;
        }
    }

    private void q()
    {
        if (!B)
        {
            B = true;
            Intent intent = getIntent();
            if (c(intent))
            {
                any any1 = new any(intent.getStringExtra("sms_body"), intent.getStringExtra("subject"), null, 0, null, null);
                Object obj1 = due.b(intent.getData());
                if (TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    intent = g.a(s, null, null, cov.a, atu.b);
                    obj1 = new Intent();
                    ((Intent) (obj1)).putExtra("android.intent.extra.TEXT", any1.b);
                    ((Intent) (obj1)).putExtra("draft_subject", any1.c);
                    intent.putExtra("share_intent", ((android.os.Parcelable) (obj1)));
                    startActivityForResult(intent, 1001);
                    overridePendingTransition(g.cr, g.cs);
                    return;
                }
                HashSet hashset = new HashSet();
                String as[] = ((String) (obj1)).split(";");
                int l1 = as.length;
                for (int i1 = 0; i1 < l1; i1++)
                {
                    String s2 = as[i1];
                    hashset.add(g.a(getApplicationContext(), s2, null, null));
                }

                int j1 = intent.getIntExtra("transport_type", 3);
                dir dir1 = dir.b();
                RealTimeChatService.a(dir1, (new ddm(getApplicationContext())).a(s.h()).a(g.a(hashset)).a(aot.c).b(j1).a());
                RealTimeChatService.a(new ckz(this, dir1, ((String) (obj1)), any1, intent.getIntExtra("opened_from_impression", 0)));
                return;
            }
            Object obj2 = intent.getStringExtra("conversation_id_set");
            Object obj = intent.getStringExtra("conversation_id");
            if (obj2 != null)
            {
                if (obj != null)
                {
                    String s1 = String.valueOf("|");
                    obj = (new StringBuilder(String.valueOf(obj2).length() + 0 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(((String) (obj2))).append(s1).append(((String) (obj))).toString();
                } else
                {
                    obj = null;
                }
            }
            if (intent.getBooleanExtra("reset_chat_notifications", false))
            {
                cfo.a(getApplicationContext(), s.h(), ((String) (obj)));
            }
            if (intent.getBooleanExtra("reset_hangout_notifications", false))
            {
                cfo.b(getApplicationContext(), s.h(), ((String) (obj)));
            }
            if (intent.getBooleanExtra("reset_failed_notifications", false))
            {
                cfo.c(getApplicationContext(), s.h(), ((String) (obj)));
            }
            obj = intent.getAction();
            w = TextUtils.equals(((CharSequence) (obj)), "android.intent.action.MAIN");
            obj2 = intent.getStringExtra("conversation_id");
            M = null;
            L = null;
            if (TextUtils.isEmpty(((CharSequence) (obj2))))
            {
                if (TextUtils.equals(((CharSequence) (obj)), "android.intent.action.INSERT"))
                {
                    a(intent);
                    return;
                }
                if (d(intent))
                {
                    if (intent.getBooleanExtra("use_dialer_activity", true))
                    {
                        startActivity(g.d(intent));
                        finish();
                        return;
                    }
                    L = intent.getAction();
                    if (TextUtils.equals(L, "com.google.android.apps.hangouts.phone.dialpad"))
                    {
                        M = intent.getStringExtra("number_to_call");
                    }
                    if (!dcn.y())
                    {
                        eev.f("Babel", "[BabelHomeActivity.onNewIntent] Adding account from dialer intent.");
                        n();
                    }
                    obj = (beq)q.b(beq);
                    if (obj != null)
                    {
                        s.h();
                        obj = ((beq) (obj)).a();
                        if (M != null)
                        {
                            ((Intent) (obj)).putExtra("number_to_call", M);
                        }
                        startActivity(((Intent) (obj)));
                        return;
                    }
                    o();
                    if (u != null)
                    {
                        u.b();
                        return;
                    }
                }
            } else
            {
                int k1 = intent.getIntExtra("client_conversation_type", 0);
                obj = g.a(intent.getExtras());
                if (obj != null)
                {
                    a(((cgd) (obj)), ((String) (obj2)), k1, intent.getLongExtra("invite_timestamp", 0L));
                    return;
                }
                if (t != null)
                {
                    obj = t.c(((String) (obj2)));
                } else
                {
                    obj = null;
                }
                obj2 = new aia(((String) (obj2)), k1);
                obj2.d = true;
                obj2.f = ((any) (obj));
                obj2.k = intent.getIntExtra("opened_from_impression", 0);
                a(((aia) (obj2)), null, intent.getIntExtra("account_id", ab.a()));
                return;
            }
        }
    }

    private void r()
    {
        if (Z && s != null && Y > 0L)
        {
            String s1 = p.b("reportStartup");
            Z = false;
            if (X != null)
            {
                X.a(s.h(), "hangout_launch_icon", Y, 1001);
            }
            g.a(new crb(getApplicationContext()), 1000L);
            p.c(s1);
        }
    }

    private void s()
    {
        if (I != null && P != null)
        {
            ehu ehu1 = I.j();
            MenuItem menuitem = P.findItem(h.eS);
            if (menuitem != null)
            {
                boolean flag;
                if (ehu1 == MainViewPager.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                menuitem.setVisible(flag);
                return;
            }
        }
    }

    private void t()
    {
        c(R.a(this, s));
    }

    private void u()
    {
        if ((t == null || !t.c()) && N != null)
        {
            ViewGroup viewgroup = (ViewGroup)findViewById(h.dm);
            if (viewgroup != null)
            {
                N.a();
                N.a(this, viewgroup, P);
                if (O == null)
                {
                    O = N.b();
                    if (O != null)
                    {
                        I.b(O);
                    }
                }
                if (O != null)
                {
                    int i1 = I.c();
                    O.a(i1);
                    O.a(i1, 0.0F, 0);
                    return;
                }
            }
        }
    }

    private void v()
    {
        ehu ehu1 = I.j();
        int i1;
        if (ehu1 != null)
        {
            i1 = ehu1.a;
        } else
        {
            i1 = l.eK;
        }
        setTitle(i1);
    }

    private void w()
    {
        t.a(false);
        J.a(true);
        I.b(false);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            d(g.ds);
        }
    }

    private void x()
    {
        boolean flag = true;
        t.a(true);
        J.a(false);
        MainViewPager mainviewpager = I;
        if (q.b(beq) != null)
        {
            flag = false;
        }
        mainviewpager.b(flag);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            d(g.de);
        }
    }

    private boolean y()
    {
        if (F == null || G == null || G.getView() == null)
        {
            return false;
        } else
        {
            return F.j(G.getView());
        }
    }

    public int a()
    {
        return 1;
    }

    public void a(int i1)
    {
    }

    public void a(ad ad1)
    {
        String s1 = String.valueOf(ad1.getClass().getSimpleName());
        if (s1.length() != 0)
        {
            s1 = "onAttachFragment ".concat(s1);
        } else
        {
            s1 = new String("onAttachFragment ");
        }
        c(s1);
        super.a(ad1);
        if (ad1 instanceof ConversationListFragment)
        {
            t = (ConversationListFragment)ad1;
            t.a(this);
            t.a(0);
        } else
        if (ad1 instanceof CallContactPickerFragment)
        {
            u = (CallContactPickerFragment)ad1;
            u.a(this);
        }
        ad1 = String.valueOf(ad1.getClass().getSimpleName());
        if (ad1.length() != 0)
        {
            ad1 = "/onAttachFragment ".concat(ad1);
        } else
        {
            ad1 = new String("/onAttachFragment ");
        }
        c(ad1);
    }

    public void a(aia aia1)
    {
        a(aia1, null, ab.a());
    }

    public void a(Intent intent)
    {
        g.b(intent);
        I.a(MainViewPager.a);
        if (N != null)
        {
            N.f();
        }
        if (t != null)
        {
            t.b();
        }
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        ((bwn)q.a(bwn)).a(r);
        W = (amo)q.a(amo);
        bundle = (bex)q.b(bex);
        if (bundle != null)
        {
            N = bundle.a(this);
            q.a(bev, N);
        }
        R = (dbt)q.a(dbt);
        bundle = (byf)q.b(byf);
        if (bundle != null)
        {
            X = bundle.a(17);
        }
        aa = (gxn)q.a(gxn);
    }

    public void a(cgd cgd1, String s1, int i1, long l1)
    {
        if (o)
        {
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                s2 = "openInvite ".concat(s2);
            } else
            {
                s2 = new String("openInvite ");
            }
            d(s2);
        }
        startActivity(g.a(s.h(), s1, cgd1, i1, l1));
    }

    public void a(ConnectionResult connectionresult)
    {
    }

    public void a(ddg ddg1)
    {
        g.a(ddg1, s, this, this);
    }

    public void a(dvg dvg)
    {
        ac.a(dvg);
    }

    public void a(dvg dvg, dvg dvg1)
    {
        ac.a(dvg, dvg1);
    }

    public void a(String s1, String s2)
    {
        int i1 = ((gqz)q.a(gqz)).b(s1, s2);
        if (ab.a() == i1)
        {
            return;
        }
        C = true;
        if (s2 != null && i1 == -1)
        {
            ab.a((new hbo()).a(caf, (new cag()).a(s1).b(s2).a()).b());
            return;
        } else
        {
            g.a(s, 1561);
            ab.a((new hbo()).a(s1, s2).b());
            return;
        }
    }

    public void a(String s1, boolean flag, int i1, int j1)
    {
        c("openHangout");
        (new cra(this, s, s1, flag, i1, j1)).a(new Void[0]);
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i1, int j1)
    {
        String s1 = String.valueOf(gqv1);
        String s2 = String.valueOf(gqv2);
        eev.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 41 + String.valueOf(s2).length())).append("oAHST ").append(flag).append(", ").append(s1).append(", ").append(s2).append(", ").append(i1).append(", ").append(j1).toString());
        ckt.a[gqv2.ordinal()];
        JVM INSTR tableswitch 1 3: default 136
    //                   1 155
    //                   2 163
    //                   3 168;
           goto _L1 _L2 _L3 _L4
_L1:
        if (D)
        {
            g.a(new clb(this));
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        C = false;
        if (true) goto _L1; else goto _L5
_L3:
        finish();
        return;
_L4:
        s = null;
        t();
        g.a(new cla(this));
        return;
_L5:
        if (gqv1 == gqv.c)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        s = dcn.e(j1);
        q();
        aa.a(new ckl(this));
        if (i1 != 0 && !s.o())
        {
            RealTimeChatService.e(s);
        }
        u();
        if (N != null)
        {
            N.a(I.c());
        }
        cfo.d(getApplicationContext(), j1);
        if (i1 == 0) goto _L7; else goto _L6
_L6:
        b(false);
_L9:
        d(true);
        r();
        return;
_L7:
        if (d(getIntent()))
        {
            if (!dcn.y())
            {
                n();
                eev.f("Babel", "[BabelHomeActivity.onCreate] Adding account from dialer intent.");
                return;
            }
            if (!R.a(s))
            {
                (new android.app.AlertDialog.Builder(this)).setMessage(l.ch).setCancelable(true).setPositiveButton(l.hd, new cks(this)).create().show();
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == h.aF)
        {
            g.a(s, 1615);
            (new cna(this)).a(H).a(u_()).a().show();
        }
        return super.a(menuitem);
    }

    public boolean a(String s1)
    {
        return bnk.a(s, s1);
    }

    public void a_(Bundle bundle)
    {
        if (isFinishing())
        {
            eev.c("Babel", "People client connected but home activity is finishing.");
        }
    }

    public String b()
    {
        return L;
    }

    public void b(ddg ddg1)
    {
        switch (ddg1.b())
        {
        default:
            eev.g("Babel", "Unsupported call action type for BabelHomeActivity!");
            return;

        case 1: // '\001'
            o();
            return;

        case 2: // '\002'
            g.a(this, ddg1, s.h(), s.a());
            break;
        }
    }

    public void c()
    {
        L = null;
    }

    public String d()
    {
        return M;
    }

    public void e()
    {
        M = null;
    }

    public boolean h()
    {
        return I.j() == MainViewPager.b;
    }

    public void j()
    {
        x();
        u();
    }

    public void m()
    {
        boolean flag;
        if (s != null && I.l())
        {
            if ((flag = R.a(this, s)) != I.k())
            {
                c(flag);
                return;
            }
        }
    }

    public void m_()
    {
        w();
        if (N != null && (ViewGroup)findViewById(h.dm) != null)
        {
            N.a();
        }
    }

    public void n()
    {
        g.a(s, 1628);
        eev.e("Babel", "Adding a new account");
        g.a(new ckr(this));
    }

    public void o()
    {
        I.a(MainViewPager.b);
    }

    public void o_()
    {
        w();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 1001)
        {
            finish();
        }
    }

    public void onBackPressed()
    {
        if (N == null || !N.g()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!y())
        {
            break; /* Loop/switch isn't completed */
        }
        if (F != null)
        {
            F.b();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        c("onBackPressed");
        if ((u == null || !u.isVisible() || !u.d()) && (t == null || !t.e()))
        {
            super.onBackPressed();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        q_();
        u();
    }

    protected void onCreate(Bundle bundle)
    {
        Intent intent;
        setTheme(g.ie);
        p.b("onCreate");
        c("onCreate");
        if (o)
        {
            String s1 = String.valueOf("onCreate  savedInstanceState: ");
            String s2 = String.valueOf(bundle);
            d((new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s2).length())).append(s1).append(s2).toString());
        }
        super.onCreate(bundle);
        intent = getIntent();
        w = TextUtils.equals(intent.getAction(), "android.intent.action.MAIN");
        ecn.a("BabelHomeActivity.onCreate", intent);
        if (isTaskRoot())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        eev.f("Babel", "BabelHomeActivity was not the root task in onCreate");
        if (!intent.hasCategory("android.intent.category.LAUNCHER") || !w)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        eev.f("Babel", "Finishing instead of re-launching from the launcher");
        finish();
        c("/onCreate");
        p.c("onCreate");
        return;
        if (g.a(false, false, true) == 0)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        boolean flag = w;
        bundle = new Intent(g.nU, com/google/android/apps/hangouts/phone/GmsInstallActivity);
        bundle.putExtra("from_main_launcher", flag);
        bundle.setAction(intent.getAction());
        startActivity(bundle);
        finish();
        c("/onCreate");
        p.c("onCreate");
        return;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        if (TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.conversationlist") || !d(intent) || !intent.getBooleanExtra("use_dialer_activity", true))
        {
            break MISSING_BLOCK_LABEL_306;
        }
        startActivity(g.d(intent));
        finish();
        c("/onCreate");
        p.c("onCreate");
        return;
        v = ecn.c();
        if (!v && q.b(beq) == null)
        {
            setRequestedOrientation(1);
        }
        BootReceiver.a(this);
        (new cku(this)).execute(new Void[0]);
        if (bundle != null) goto _L2; else goto _L1
_L1:
        p();
_L7:
        MainViewPager mainviewpager;
        setContentView(c(g.fe));
        I = (MainViewPager)findViewById(h.gD);
        I.b(new ckv(this));
        J = (TabHostEx)findViewById(0x1020012);
        J.a(I);
        mainviewpager = I;
        boolean flag1;
        if (q.b(beq) == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mainviewpager.b(flag1);
        J.setup();
        if (bundle != null) goto _L4; else goto _L3
_L3:
        if (!TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.conversationlist")) goto _L6; else goto _L5
_L5:
        K = MainViewPager.a.d;
        g.b(intent);
_L4:
        eev.e("Babel", "[BabelHomeActivity.onCreate] setContentView called");
        F = (DrawerLayout)findViewById(h.aV);
        G = (NavigationDrawerFragment)u_().a(h.dJ);
        F.c(getResources().getColor(g.ds));
        H = new cqf(this, r);
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_595;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") && w)
        {
            Z = true;
        }
        c("/onCreate");
        p.c("onCreate");
        return;
_L2:
        B = bundle.getBoolean("handled_intent_for_action");
        C = bundle.getBoolean("is_logging_in");
        D = bundle.getBoolean("pending_login_from_intent");
        if (ab.b())
        {
            s = dcn.e(ab.a());
        }
          goto _L7
        bundle;
        c("/onCreate");
        p.c("onCreate");
        throw bundle;
_L6:
        if (!d(intent)) goto _L4; else goto _L8
_L8:
        K = MainViewPager.b.d;
          goto _L4
    }

    public Dialog onCreateDialog(int i1, Bundle bundle)
    {
        bundle = null;
        if (i1 == 1)
        {
            bundle = new android.app.AlertDialog.Builder(this);
            View view = getLayoutInflater().inflate(g.fB, null);
            EditText edittext = (EditText)view.findViewById(h.ay);
            bundle.setTitle(l.ih).setView(view).setPositiveButton(getString(l.ii), new ckp(this, edittext)).setNegativeButton(getString(l.ig), new cko(this));
            bundle = bundle.create();
            edittext.addTextChangedListener(new ckq(this, bundle));
            bundle.getWindow().setSoftInputMode(5);
        }
        return bundle;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(g.hp, menu);
        P = menu;
        if (ab.d())
        {
            u();
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        c("onDestroy");
        super.onDestroy();
        if (N != null && (ViewGroup)findViewById(h.dm) != null)
        {
            N.a();
        }
        c("/onDestroy");
    }

    protected void onNewIntent(Intent intent)
    {
        c("onNewIntent");
        super.onNewIntent(intent);
        String s1 = String.valueOf(intent);
        eev.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 12)).append("onNewIntet: ").append(s1).toString());
        ecn.a("BabelHomeActivity.onNewIntent", intent);
        B = false;
        p();
        c("/onNewIntent");
        return;
        intent;
        c("/onNewIntent");
        throw intent;
    }

    public void onPause()
    {
        c("onPause");
        if (Q != null)
        {
            x.removeCallbacks(Q);
            Q = null;
        }
        A = false;
        super.onPause();
        c("/onPause");
    }

    public void onPrepareDialog(int i1, Dialog dialog, Bundle bundle)
    {
        if (i1 == 1)
        {
            dialog = (EditText)dialog.findViewById(h.ay);
            dialog.setText(bundle.getString("conversation_name"));
            dialog.setSelection(0, dialog.getText().toString().length());
            dialog.requestFocus();
            dialog.setTag(bundle.getString("conversation_id"));
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (y())
        {
            menu.clear();
            return false;
        }
        s();
        if (I.j() != MainViewPager.b) goto _L2; else goto _L1
_L1:
        b(true);
_L4:
        MenuItem menuitem = menu.findItem(h.aF);
        if (menuitem != null)
        {
            boolean flag = eep.a();
            menuitem.setVisible(flag).setEnabled(flag);
        }
        return super.onPrepareOptionsMenu(menu);
_L2:
        if (E != null)
        {
            E.a(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onResume()
    {
        p.b("onResume");
        c("onResume");
        super.onResume();
        A = true;
        if (o)
        {
            String s1 = String.valueOf(s);
            d((new StringBuilder(String.valueOf(s1).length() + 19)).append("onResume mAccount: ").append(s1).toString());
        }
        if (s != null)
        {
            if (dcn.j())
            {
                dur.b(dcn.l());
            }
            b(false);
            cfo.d(this, s.h());
            d(false);
        }
        y = false;
        t();
        s();
        Q = new ckw(this);
        x.post(Q);
        c("/onResume");
        if (Y < 0L)
        {
            Y = SystemClock.elapsedRealtime();
        }
        r();
        p.c("onResume");
        return;
        Exception exception;
        exception;
        c("/onResume");
        if (Y < 0L)
        {
            Y = SystemClock.elapsedRealtime();
        }
        r();
        p.c("onResume");
        throw exception;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("handled_intent_for_action", B);
        bundle.putBoolean("is_logging_in", C);
        bundle.putBoolean("pending_login_from_intent", D);
        y = true;
    }

    protected void onStart()
    {
        p.b("onStart");
        c("onStart");
        super.onStart();
        if (o)
        {
            d("onStart");
        }
        if (ab.d())
        {
            if (!I.l())
            {
                t();
            }
            u();
            if (N != null)
            {
                N.a(I.c());
            }
        }
        String s1 = aoc.e(this);
        if (!TextUtils.isEmpty(s1))
        {
            aoc.a(this, "");
            try
            {
                startActivity(Intent.parseUri(s1, 1));
                g.a(s, 1869);
            }
            catch (URISyntaxException urisyntaxexception)
            {
                s1 = String.valueOf(s1);
                if (s1.length() != 0)
                {
                    s1 = "Failed to parse refererr url: ".concat(s1);
                } else
                {
                    s1 = new String("Failed to parse refererr url: ");
                }
                eev.f("Babel", s1);
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                s1 = String.valueOf(s1);
                if (s1.length() != 0)
                {
                    s1 = "Failed to find activity for refererr url: ".concat(s1);
                } else
                {
                    s1 = new String("Failed to find activity for refererr url: ");
                }
                eev.f("Babel", s1);
            }
        }
        ac.a(ad);
        c("/onStart");
        p.c("onStart");
    }

    protected void onStop()
    {
        c("onStop");
        super.onStop();
        ac.b(ad);
        c("/onStop");
    }

    public void p_()
    {
        x();
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        m.b(charsequence);
    }

    static 
    {
        hnc hnc = eev.j;
    }
}
