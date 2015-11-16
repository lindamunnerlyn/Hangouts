// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ad;
import aih;
import aiv;
import alw;
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
import ang;
import ani;
import ank;
import aob;
import ap;
import atd;
import bea;
import bef;
import beh;
import bgx;
import biv;
import bka;
import bnd;
import bvu;
import byy;
import bzc;
import bzd;
import cbd;
import cej;
import cey;
import cjf;
import cjg;
import cjh;
import cji;
import cjj;
import cjk;
import cjl;
import cjm;
import cjn;
import cjo;
import cjp;
import cjq;
import cjr;
import cjt;
import cju;
import cjv;
import cjw;
import cjx;
import cls;
import cnd;
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
import cop;
import cpk;
import crc;
import csz;
import dan;
import dbf;
import dbx;
import dbz;
import dce;
import dhi;
import dih;
import djk;
import drk;
import dry;
import dsn;
import dso;
import dsp;
import dsv;
import dzj;
import dzx;
import ebd;
import ebr;
import ebw;
import ecd;
import ees;
import eka;
import ekc;
import g;
import gmp;
import gmq;
import gms;
import gmu;
import gwt;
import gxe;
import gxj;
import gxk;
import h;
import hgx;
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

public class BabelHomeActivity extends bka
    implements bgx, biv, cbd, dbz, dih, eka, ekc, gmq
{

    public static LinkedList m = new LinkedList();
    private static final boolean n = false;
    private boolean A;
    private boolean B;
    private BalanceView C;
    private DrawerLayout D;
    private NavigationDrawerFragment E;
    private cop F;
    private MainViewPager G;
    private TabHostEx H;
    private String I;
    private String J;
    private String K;
    private bef L;
    private lg M;
    private Menu N;
    private Runnable O;
    private dan P;
    private ebd Q;
    private dsn R;
    private long S;
    private long T;
    private alw U;
    private long V;
    private long W;
    private final gwt X;
    private final dsp Y;
    private final dsv Z = new cjf(this);
    private ani o;
    private ConversationListFragment r;
    private CallContactPickerFragment s;
    private boolean t;
    private boolean u;
    private final Handler v = new Handler();
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public BabelHomeActivity()
    {
        S = -1L;
        V = 0L;
        W = 0L;
        X = (new gwt(this, q)).a("active-hangouts-account").a(p).b(this);
        Y = (new dsp(this, q)).b(p);
        new aiv(this, q);
        new crc(this, q);
    }

    private void a(long l1)
    {
        if (V != 0L && l1 > V)
        {
            W = l1 - V;
            V = 0L;
        }
    }

    private void a(aih aih1, Intent intent, int i1)
    {
        if (n)
        {
            String s1 = aih1.a;
            int j1 = aih1.b;
            d((new StringBuilder(String.valueOf(s1).length() + 51)).append("openConversation conversationId: ").append(s1).append(" type: ").append(j1).toString());
        }
        Intent intent1 = g.a(i1, aih1.a, aih1.b);
        intent1.putExtra("conversation_parameters", aih1);
        intent1.putExtra("opened_from_impression", aih1.k);
        if (intent != null)
        {
            ebw.c("Babel", "Injecting share intent.");
            intent1.putExtra("share_intent", intent);
        }
        startActivity(intent1);
        aih1 = String.valueOf(aih1.a);
        if (aih1.length() != 0)
        {
            aih1 = "openConversation ".concat(aih1);
        } else
        {
            aih1 = new String("openConversation ");
        }
        c(aih1);
    }

    public static void a(BabelHomeActivity babelhomeactivity, aih aih1, Intent intent, int i1)
    {
        babelhomeactivity.a(aih1, intent, i1);
    }

    public static void a(BabelHomeActivity babelhomeactivity, String s1)
    {
        babelhomeactivity.b(s1);
    }

    public static void a(BabelHomeActivity babelhomeactivity, boolean flag)
    {
        babelhomeactivity.f(flag);
    }

    public static void a(PrintWriter printwriter)
    {
        Iterator iterator = m.iterator();
        int i1 = 0;
        long l1 = 0L;
        while (iterator.hasNext()) 
        {
            cjx cjx1 = (cjx)iterator.next();
            cjx1.a(i1, printwriter, l1);
            l1 = cjx1.a;
            i1++;
        }
    }

    public static boolean a(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.y;
    }

    public static bef b(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.L;
    }

    private void b(String s1)
    {
        String s2;
        dso dso1;
        boolean flag;
        int i1;
        if (R != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dso1 = new dso(this);
        i1 = l.kP;
        if (o.F())
        {
            s2 = o.c();
        } else
        {
            s2 = o.a();
        }
        dso1.a(getString(i1, new Object[] {
            s2
        }));
        dso1.b(s1);
        dso1.a(TimeUnit.SECONDS.toMillis(5L));
        dso1.a(new cji(this));
        s1 = dso1.a();
        if (flag)
        {
            Y.a(R, s1);
        } else
        {
            Y.a(s1);
        }
        R = s1;
    }

    public static void c(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.v();
    }

    private static void c(String s1)
    {
        ebw.a("Babel", s1);
        if (ebw.b())
        {
            m.add(new cjx(s1));
            for (; m.size() > 40; m.remove(0)) { }
        }
    }

    private void c(boolean flag)
    {
        if (o != null && !o.q())
        {
            f(flag);
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
                if (l1 + T <= l2)
                {
                    T = l2;
                    g.a(o.h(), this, false, new cjt(this, flag));
                    return;
                }
            }
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
        return babelhomeactivity.G;
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
        ebw.b("Babel", s1);
    }

    private void d(boolean flag)
    {
        boolean flag2 = true;
        if (!w)
        {
            MainViewPager mainviewpager;
            ap ap1;
            boolean flag1;
            int i1;
            if (p.b(bea) != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            mainviewpager = G;
            i1 = X.a();
            ap1 = t_();
            if (flag && !flag1)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            if (mainviewpager.a(i1, ap1, flag))
            {
                if (G.a(I))
                {
                    I = null;
                } else
                {
                    String s1 = PreferenceManager.getDefaultSharedPreferences(this).getString("last_selected_tab", null);
                    G.a(s1);
                }
                H.a(getLayoutInflater());
                v();
            }
            x = false;
            return;
        } else
        {
            x = true;
            return;
        }
    }

    private static boolean d(Intent intent)
    {
        return TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.recentcalls") || TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.dialpad");
    }

    public static Runnable e(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.O;
    }

    private void e(boolean flag)
    {
        boolean flag2 = true;
        long l1 = ((alw)p.a(alw)).a("babel_account_snackbar_reshow", djk.n);
        boolean flag1;
        if (flag || S == -1L || SystemClock.elapsedRealtime() - S > l1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (((gms)hgx.a(this, gms)).a(new String[] {
    "logged_in"
}).size() <= 1)
        {
            flag2 = false;
        }
        if (!(flag1 & flag2))
        {
            return;
        }
        S = SystemClock.elapsedRealtime();
        if (X.c().d("sms_only"))
        {
            b(((String) (null)));
            return;
        }
        if (Q != null)
        {
            Q.a(null);
        }
        Q = new cjh(this, q, o.h(), csz.c.j);
        Q.a(o.b().a);
    }

    public static gwt f(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.X;
    }

    private void f(boolean flag)
    {
        if (P.b(o) && !o.ab())
        {
            if (C == null)
            {
                C = (BalanceView)getLayoutInflater().inflate(g.hh, null);
                ((HangoutsToolbar)l).a(C);
            }
            if (flag)
            {
                C.a(true);
            }
        } else
        if (C != null)
        {
            C.a(false);
            return;
        }
    }

    public static alw g(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.U;
    }

    public static Handler h(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.v;
    }

    public static boolean i(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.A = true;
        return true;
    }

    public static boolean j(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.B = false;
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

    public static ebd m(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.Q;
    }

    public static ebd n(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.Q = null;
        return null;
    }

    public static dsn o(BabelHomeActivity babelhomeactivity)
    {
        babelhomeactivity.R = null;
        return null;
    }

    public static ani p(BabelHomeActivity babelhomeactivity)
    {
        return babelhomeactivity.o;
    }

    private void p()
    {
        if (A)
        {
            B = true;
            return;
        }
        A = true;
        B = false;
        Intent intent = getIntent();
        if (c(intent) && !intent.hasExtra("account_id"))
        {
            if (dbf.j())
            {
                int i1 = dbf.l().h();
                X.a((new gxe()).a(i1).b());
                return;
            } else
            {
                Toast.makeText(this, l.ki, 1).show();
                finish();
                return;
            }
        } else
        {
            X.a((new gxe()).a().c().a(gxj, (new gxk()).b().c()));
            return;
        }
    }

    private void q()
    {
        if (!z) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Intent intent;
        Object obj3;
        z = true;
        intent = getIntent();
        if (c(intent))
        {
            ang ang1 = new ang(intent.getStringExtra("sms_body"), intent.getStringExtra("subject"), null, 0, null, null);
            Object obj2 = drk.b(intent.getData());
            if (TextUtils.isEmpty(((CharSequence) (obj2))))
            {
                intent = g.a(o, null, null, cnd.a, atd.b);
                obj2 = new Intent();
                ((Intent) (obj2)).putExtra("android.intent.extra.TEXT", ang1.b);
                ((Intent) (obj2)).putExtra("draft_subject", ang1.c);
                intent.putExtra("share_intent", ((android.os.Parcelable) (obj2)));
                startActivityForResult(intent, 1001);
                overridePendingTransition(g.cs, g.ct);
                return;
            }
            HashSet hashset = new HashSet();
            String as[] = ((String) (obj2)).split(";");
            int l1 = as.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                String s1 = as[i1];
                hashset.add(g.a(getApplicationContext(), s1, null, null));
            }

            int j1 = intent.getIntExtra("transport_type", 3);
            dhi dhi1 = dhi.b();
            RealTimeChatService.a(dhi1, (new dce(getApplicationContext())).a(o.h()).a(g.a(hashset)).a(aob.c).b(j1).a());
            RealTimeChatService.a(new cju(this, dhi1, ((String) (obj2)), ang1, intent.getIntExtra("opened_from_impression", 0)));
            return;
        }
        obj = dzx.a(intent.getStringExtra("conversation_id_set"), intent.getStringExtra("conversation_id"));
        if (intent.getBooleanExtra("reset_chat_notifications", false))
        {
            cej.a(getApplicationContext(), o.h(), ((String) (obj)));
        }
        if (intent.getBooleanExtra("reset_hangout_notifications", false))
        {
            cej.b(getApplicationContext(), o.h(), ((String) (obj)));
        }
        if (intent.getBooleanExtra("reset_failed_notifications", false))
        {
            cej.c(getApplicationContext(), o.h(), ((String) (obj)));
        }
        obj = intent.getAction();
        u = TextUtils.equals(((CharSequence) (obj)), "android.intent.action.MAIN");
        obj3 = intent.getStringExtra("conversation_id");
        K = null;
        J = null;
        if (!TextUtils.isEmpty(((CharSequence) (obj3))))
        {
            break MISSING_BLOCK_LABEL_619;
        }
        if (TextUtils.equals(((CharSequence) (obj)), "android.intent.action.INSERT"))
        {
            a(intent);
            return;
        }
        if (!d(intent))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (intent.getBooleanExtra("use_dialer_activity", true))
        {
            startActivity(g.d(intent));
            finish();
            return;
        }
        J = intent.getAction();
        if (TextUtils.equals(J, "com.google.android.apps.hangouts.phone.dialpad"))
        {
            K = intent.getStringExtra("number_to_call");
        }
        if (!dbf.y())
        {
            ebw.f("Babel", "[BabelHomeActivity.onNewIntent] Adding account from dialer intent.");
            n();
        }
        obj = (bea)p.b(bea);
        if (obj != null)
        {
            o.h();
            obj = ((bea) (obj)).a();
            if (K != null)
            {
                ((Intent) (obj)).putExtra("number_to_call", K);
            }
            startActivity(((Intent) (obj)));
            return;
        }
        o();
        if (s == null) goto _L1; else goto _L3
_L3:
        s.b();
        return;
        if (!TextUtils.equals(((CharSequence) (obj)), "com.google.android.apps.hangouts.phone.addgoogleaccount")) goto _L1; else goto _L4
_L4:
        n();
        return;
        int k1 = intent.getIntExtra("client_conversation_type", 0);
        Object obj1 = g.a(intent.getExtras());
        if (obj1 != null)
        {
            a(((cey) (obj1)), ((String) (obj3)), k1, intent.getLongExtra("invite_timestamp", 0L));
            return;
        }
        if (r != null)
        {
            obj1 = r.c(((String) (obj3)));
        } else
        {
            obj1 = null;
        }
        obj3 = new aih(((String) (obj3)), k1);
        obj3.d = true;
        obj3.f = ((ang) (obj1));
        obj3.k = intent.getIntExtra("opened_from_impression", 0);
        a(((aih) (obj3)), null, intent.getIntExtra("account_id", X.a()));
        return;
    }

    private void r()
    {
        if (o != null && W > 0L)
        {
            h.a(o.h(), SystemClock.elapsedRealtime(), 17, (new byy()).a(1001).b(W));
            W = 0L;
        }
    }

    private void s()
    {
        if (G != null && N != null)
        {
            ees ees1 = G.j();
            MenuItem menuitem = N.findItem(h.fk);
            if (menuitem != null)
            {
                boolean flag;
                if (ees1 == MainViewPager.a)
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
        d(P.a(this, o));
    }

    private void u()
    {
        if ((r == null || !r.c()) && L != null)
        {
            ViewGroup viewgroup = (ViewGroup)findViewById(h.dy);
            if (viewgroup != null)
            {
                L.a(this);
                L.a(this, viewgroup, N);
                if (M == null)
                {
                    M = L.a();
                    if (M != null)
                    {
                        G.b(M);
                    }
                }
                if (M != null)
                {
                    int i1 = G.c();
                    M.a(i1);
                    M.a(i1, 0.0F, 0);
                    return;
                }
            }
        }
    }

    private void v()
    {
        ees ees1 = G.j();
        int i1;
        if (ees1 != null)
        {
            i1 = ees1.a;
        } else
        {
            i1 = l.fb;
        }
        setTitle(i1);
    }

    private void w()
    {
        r.a(false);
        H.a(true);
        G.b(false);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            d(g.dt);
        }
    }

    private void x()
    {
        boolean flag = true;
        r.a(true);
        H.a(false);
        MainViewPager mainviewpager = G;
        if (p.b(bea) != null)
        {
            flag = false;
        }
        mainviewpager.b(flag);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            d(g.dg);
        }
    }

    private boolean y()
    {
        if (D == null || E == null || E.getView() == null)
        {
            return false;
        } else
        {
            return D.j(E.getView());
        }
    }

    public int a()
    {
        return 1;
    }

    public void a(int i1)
    {
    }

    public void a(ad ad)
    {
        String s1 = String.valueOf(ad.getClass().getSimpleName());
        if (s1.length() != 0)
        {
            s1 = "onAttachFragment ".concat(s1);
        } else
        {
            s1 = new String("onAttachFragment ");
        }
        c(s1);
        super.a(ad);
        if (ad instanceof ConversationListFragment)
        {
            r = (ConversationListFragment)ad;
            r.a(this);
            r.a(0);
        } else
        if (ad instanceof CallContactPickerFragment)
        {
            s = (CallContactPickerFragment)ad;
            s.a(this);
        }
        ad = String.valueOf(ad.getClass().getSimpleName());
        if (ad.length() != 0)
        {
            ad = "/onAttachFragment ".concat(ad);
        } else
        {
            ad = new String("/onAttachFragment ");
        }
        c(ad);
    }

    public void a(aih aih1)
    {
        a(aih1, null, X.a());
    }

    public void a(Intent intent)
    {
        g.b(intent);
        G.a(MainViewPager.a);
        if (L != null)
        {
            L.e();
        }
        if (r != null)
        {
            r.b();
        }
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        ((bvu)p.a(bvu)).a(q);
        U = (alw)p.a(alw);
        bundle = (beh)p.b(beh);
        if (bundle != null)
        {
            L = bundle.a(this);
            p.a(bef, L);
        }
        P = (dan)p.a(dan);
    }

    public void a(cey cey1, String s1, int i1, long l1)
    {
        if (n)
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
        startActivity(g.a(o.h(), s1, cey1, i1, l1));
    }

    public void a(ConnectionResult connectionresult)
    {
    }

    public void a(dbx dbx1)
    {
        g.a(dbx1, o, this, this);
    }

    public void a(dsn dsn)
    {
        Y.a(dsn);
    }

    public void a(dsn dsn, dsn dsn1)
    {
        Y.a(dsn, dsn1);
    }

    public void a(String s1, String s2)
    {
        int i1 = ((gms)p.a(gms)).b(s1, s2);
        if (X.a() == i1)
        {
            return;
        }
        A = true;
        if (s2 != null && i1 == -1)
        {
            X.a((new gxe()).a(bzc, (new bzd()).a(s1).b(s2).a()).b());
            return;
        } else
        {
            g.a(o, 1561);
            X.a((new gxe()).a(s1, s2).b());
            return;
        }
    }

    public void a(String s1, boolean flag, int i1, int j1)
    {
        c("openHangout");
        (new cpk(this, o, s1, flag, i1, j1)).a(new Void[0]);
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i1, int j1)
    {
        String s1 = String.valueOf(gmp1);
        String s2 = String.valueOf(gmp2);
        ebw.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 41 + String.valueOf(s2).length())).append("oAHST ").append(flag).append(", ").append(s1).append(", ").append(s2).append(", ").append(i1).append(", ").append(j1).toString());
        cjo.a[gmp2.ordinal()];
        JVM INSTR tableswitch 1 3: default 136
    //                   1 155
    //                   2 163
    //                   3 168;
           goto _L1 _L2 _L3 _L4
_L1:
        if (B)
        {
            g.a(new cjw(this));
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        A = false;
        if (true) goto _L1; else goto _L5
_L3:
        finish();
        return;
_L4:
        o = null;
        t();
        g.a(new cjv(this));
        return;
_L5:
        if (gmp1 == gmp.c)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        o = dbf.e(j1);
        q();
        g.a(new cjg(this));
        if (i1 != 0 && !o.q())
        {
            RealTimeChatService.e(o);
        }
        u();
        if (L != null)
        {
            L.a(G.c());
        }
        cej.d(getApplicationContext(), j1);
        if (i1 == 0) goto _L7; else goto _L6
_L6:
        c(false);
_L9:
        e(true);
        return;
_L7:
        if (d(getIntent()))
        {
            if (!dbf.y())
            {
                n();
                ebw.f("Babel", "[BabelHomeActivity.onCreate] Adding account from dialer intent.");
                return;
            }
            if (!P.a(o))
            {
                (new android.app.AlertDialog.Builder(this)).setMessage(l.ct).setCancelable(true).setPositiveButton(l.hJ, new cjn(this)).create().show();
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == h.aK)
        {
            g.a(o, 1615);
            (new cls(this)).a(F).a(t_()).a().show();
        }
        return super.a(menuitem);
    }

    public boolean a(String s1)
    {
        return bnd.a(o, s1);
    }

    public void a_(Bundle bundle)
    {
        if (isFinishing())
        {
            ebw.c("Babel", "People client connected but home activity is finishing.");
        }
    }

    public void b(dbx dbx1)
    {
        switch (dbx1.b())
        {
        default:
            ebw.g("Babel", "Unsupported call action type for BabelHomeActivity!");
            return;

        case 1: // '\001'
            o();
            return;

        case 2: // '\002'
            g.a(this, dbx1, o.h(), o.a());
            break;
        }
    }

    public void c()
    {
        J = null;
    }

    public String d()
    {
        return K;
    }

    public void e()
    {
        K = null;
    }

    public boolean h()
    {
        return G.j() == MainViewPager.b;
    }

    public void j()
    {
        x();
        u();
    }

    public void l_()
    {
        w();
        if (L != null && (ViewGroup)findViewById(h.dy) != null)
        {
            L.a(this);
        }
    }

    public void m()
    {
        boolean flag;
        if (o != null && G.l())
        {
            if ((flag = P.a(this, o)) != G.k())
            {
                d(flag);
                return;
            }
        }
    }

    public String m_()
    {
        return J;
    }

    public void n()
    {
        g.a(o, 1628);
        ebw.e("Babel", "Adding a new account");
        g.a(new cjm(this));
    }

    public void n_()
    {
        w();
    }

    public void o()
    {
        G.a(MainViewPager.b);
    }

    public void o_()
    {
        x();
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
        if (L == null || !L.f()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!y())
        {
            break; /* Loop/switch isn't completed */
        }
        if (D != null)
        {
            D.b();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        c("onBackPressed");
        if ((s == null || !s.isVisible() || !s.d()) && (r == null || !r.e()))
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
        p_();
        u();
    }

    protected void onCreate(Bundle bundle)
    {
        Intent intent;
        setTheme(g.im);
        V = SystemClock.elapsedRealtime();
        ecd.a("BabelHomeActivity.onCreate");
        c("onCreate");
        if (n)
        {
            String s1 = String.valueOf("onCreate  savedInstanceState: ");
            String s2 = String.valueOf(bundle);
            d((new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s2).length())).append(s1).append(s2).toString());
        }
        super.onCreate(bundle);
        intent = getIntent();
        u = TextUtils.equals(intent.getAction(), "android.intent.action.MAIN");
        dzj.a("BabelHomeActivity.onCreate", intent);
        if (isTaskRoot())
        {
            break MISSING_BLOCK_LABEL_167;
        }
        ebw.f("Babel", "BabelHomeActivity was not the root task in onCreate");
        if (!intent.hasCategory("android.intent.category.LAUNCHER") || !u)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        ebw.f("Babel", "Finishing instead of re-launching from the launcher");
        finish();
        c("/onCreate");
        ecd.a();
        return;
        if (g.a(false, false, true) == 0)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        boolean flag = u;
        bundle = new Intent(g.nS, com/google/android/apps/hangouts/phone/GmsInstallActivity);
        bundle.putExtra("from_main_launcher", flag);
        bundle.setAction(intent.getAction());
        startActivity(bundle);
        finish();
        c("/onCreate");
        ecd.a();
        return;
        if (!TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.addgoogleaccount"))
        {
            break MISSING_BLOCK_LABEL_261;
        }
        n();
        c("/onCreate");
        ecd.a();
        return;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        if (TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.conversationlist") || !d(intent) || !intent.getBooleanExtra("use_dialer_activity", true))
        {
            break MISSING_BLOCK_LABEL_318;
        }
        startActivity(g.d(intent));
        finish();
        c("/onCreate");
        ecd.a();
        return;
        t = dzj.c();
        if (!t && p.b(bea) == null)
        {
            setRequestedOrientation(1);
        }
        BootReceiver.a(this);
        (new cjp(this)).execute(new Void[0]);
        if (bundle != null) goto _L2; else goto _L1
_L1:
        p();
_L7:
        MainViewPager mainviewpager;
        setContentView(c(g.fg));
        G = (MainViewPager)findViewById(h.gX);
        G.b(new cjq(this));
        H = (TabHostEx)findViewById(0x1020012);
        H.a(G);
        mainviewpager = G;
        boolean flag1;
        if (p.b(bea) == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mainviewpager.b(flag1);
        H.setup();
        if (bundle != null) goto _L4; else goto _L3
_L3:
        if (!TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.conversationlist")) goto _L6; else goto _L5
_L5:
        I = MainViewPager.a.d;
        g.b(intent);
_L4:
        ebw.e("Babel", "[BabelHomeActivity.onCreate] setContentView called");
        D = (DrawerLayout)findViewById(h.bb);
        E = (NavigationDrawerFragment)t_().a(h.dS);
        D.c(getResources().getColor(g.dt));
        F = new cop(this, q);
        c("/onCreate");
        ecd.a();
        return;
_L2:
        z = bundle.getBoolean("handled_intent_for_action");
        A = bundle.getBoolean("is_logging_in");
        B = bundle.getBoolean("pending_login_from_intent");
        if (X.b())
        {
            o = dbf.e(X.a());
        }
          goto _L7
        bundle;
        c("/onCreate");
        ecd.a();
        throw bundle;
_L6:
        if (!d(intent)) goto _L4; else goto _L8
_L8:
        I = MainViewPager.b.d;
          goto _L4
    }

    public Dialog onCreateDialog(int i1, Bundle bundle)
    {
        bundle = null;
        if (i1 == 1)
        {
            bundle = new android.app.AlertDialog.Builder(this);
            View view = getLayoutInflater().inflate(g.fD, null);
            EditText edittext = (EditText)view.findViewById(h.aD);
            bundle.setTitle(l.iN).setView(view).setPositiveButton(getString(l.iO), new cjk(this, edittext)).setNegativeButton(getString(l.iM), new cjj(this));
            bundle = bundle.create();
            edittext.addTextChangedListener(new cjl(this, bundle));
            bundle.getWindow().setSoftInputMode(5);
        }
        return bundle;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(g.hx, menu);
        N = menu;
        if (X.d())
        {
            u();
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        c("onDestroy");
        super.onDestroy();
        if (L != null && (ViewGroup)findViewById(h.dy) != null)
        {
            L.a(this);
        }
        c("/onDestroy");
    }

    protected void onNewIntent(Intent intent)
    {
        c("onNewIntent");
        super.onNewIntent(intent);
        String s1 = String.valueOf(intent);
        ebw.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 12)).append("onNewIntet: ").append(s1).toString());
        dzj.a("BabelHomeActivity.onNewIntent", intent);
        z = false;
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
        if (O != null)
        {
            v.removeCallbacks(O);
            O = null;
        }
        y = false;
        super.onPause();
        c("/onPause");
    }

    public void onPrepareDialog(int i1, Dialog dialog, Bundle bundle)
    {
        if (i1 == 1)
        {
            dialog = (EditText)dialog.findViewById(h.aD);
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
        if (G.j() != MainViewPager.b) goto _L2; else goto _L1
_L1:
        c(true);
_L4:
        MenuItem menuitem = menu.findItem(h.aK);
        if (menuitem != null)
        {
            boolean flag = ebr.a();
            menuitem.setVisible(flag).setEnabled(flag);
        }
        return super.onPrepareOptionsMenu(menu);
_L2:
        if (C != null)
        {
            C.a(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onResume()
    {
        ecd.a("BabelHomeActivity.onResume");
        c("onResume");
        super.onResume();
        y = true;
        if (n)
        {
            String s1 = String.valueOf(o);
            d((new StringBuilder(String.valueOf(s1).length() + 19)).append("onResume mAccount: ").append(s1).toString());
        }
        if (o != null)
        {
            if (dbf.j())
            {
                dry.b(dbf.l());
            }
            c(false);
            cej.d(this, o.h());
            e(false);
        }
        w = false;
        if (!x)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        t();
_L1:
        s();
        O = new cjr(this);
        v.post(O);
        c("/onResume");
        a(SystemClock.elapsedRealtime());
        r();
        ecd.a();
        return;
        m();
          goto _L1
        Exception exception;
        exception;
        c("/onResume");
        a(SystemClock.elapsedRealtime());
        r();
        ecd.a();
        throw exception;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("handled_intent_for_action", z);
        bundle.putBoolean("is_logging_in", A);
        bundle.putBoolean("pending_login_from_intent", B);
        w = true;
    }

    protected void onStart()
    {
        ecd.a("BabelHomeActivity.onStart");
        c("onStart");
        super.onStart();
        if (n)
        {
            d("onStart");
        }
        if (X.d())
        {
            if (!G.l())
            {
                t();
            }
            u();
            if (L != null)
            {
                L.a(G.c());
            }
        }
        String s1 = ank.e(this);
        if (!TextUtils.isEmpty(s1))
        {
            ank.a(this, "");
            try
            {
                startActivity(Intent.parseUri(s1, 1));
                g.a(o, 1869);
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
                ebw.f("Babel", s1);
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
                ebw.f("Babel", s1);
            }
        }
        Y.a(Z);
        c("/onStart");
        ecd.a();
    }

    protected void onStop()
    {
        c("onStop");
        super.onStop();
        Y.b(Z);
        c("/onStop");
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        l.b(charsequence);
    }

    static 
    {
        hik hik = ebw.j;
    }
}
