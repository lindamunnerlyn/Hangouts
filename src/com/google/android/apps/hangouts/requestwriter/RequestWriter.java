// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.requestwriter;

import alw;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ccc;
import cce;
import ccf;
import ccg;
import cci;
import cck;
import ccm;
import csc;
import csd;
import cse;
import csf;
import csg;
import csn;
import cso;
import csp;
import csq;
import csr;
import css;
import cst;
import csu;
import ctd;
import cte;
import ctf;
import ctg;
import cth;
import cti;
import ctj;
import ctk;
import ctl;
import ctm;
import ctr;
import cts;
import ctt;
import ctv;
import ctw;
import ctx;
import cty;
import ctz;
import cub;
import cuc;
import cud;
import cue;
import cuf;
import cug;
import cuh;
import cui;
import cuk;
import cul;
import cum;
import cun;
import cuo;
import cup;
import cuq;
import cur;
import cus;
import cut;
import cuu;
import cuv;
import cuw;
import cux;
import cuy;
import cuz;
import cva;
import cvb;
import cvc;
import cvd;
import cve;
import cvf;
import cvg;
import cvh;
import cvi;
import cvj;
import cvk;
import cvl;
import cvo;
import cvp;
import cvq;
import cvr;
import cvs;
import cvt;
import cvu;
import cvv;
import cvw;
import cvx;
import cwa;
import cwb;
import cwc;
import cwd;
import cwe;
import cwf;
import cwh;
import cwi;
import cwj;
import cwk;
import cwl;
import cwm;
import cwn;
import cwo;
import cwp;
import cwq;
import cwt;
import cwu;
import cwx;
import cwy;
import cxa;
import cxb;
import cxc;
import cxd;
import cxe;
import cxf;
import cxh;
import cxi;
import cxj;
import cxk;
import cxl;
import cxm;
import cxn;
import cxo;
import cxs;
import cxt;
import cxv;
import cxx;
import cxy;
import cxz;
import cya;
import cyb;
import cyc;
import cyd;
import cye;
import cyf;
import cyg;
import cyh;
import cyi;
import cyj;
import cyk;
import cyl;
import cym;
import cyo;
import cyp;
import dbq;
import dgw;
import dka;
import dkb;
import dkc;
import dkd;
import dke;
import dkf;
import dkg;
import dki;
import dkl;
import dko;
import eba;
import ebr;
import ebw;
import ejl;
import ejm;
import ejn;
import frl;
import g;
import gbh;
import gz;
import hgx;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jlk;

public class RequestWriter extends dgw
    implements cce, dkb
{

    public static final Map a = q();
    private static final boolean b = false;
    private static volatile int h;
    private static volatile int i;
    private static volatile long j;
    private static volatile int k;
    private static volatile boolean l;
    private static volatile long m;
    private static volatile boolean n = false;
    private final Map c = new ConcurrentHashMap();
    private volatile boolean d;
    private ConnectivityManager e;
    private dka f;
    private final Random g = new Random();
    private final IBinder o = new dkf(this);
    private dkg p;

    public RequestWriter()
    {
    }

    public static Intent a(Context context, dko dko1, int i1)
    {
        Object obj;
        Intent intent;
label0:
        {
            intent = k();
            intent.putExtra("account_id", i1);
            ccg ccg1 = dko1.n();
            obj = ccg1;
            if (dbq.d(i1))
            {
                break label0;
            }
            if (!(dko1 instanceof cut))
            {
                obj = ccg1;
                if (!(dko1 instanceof cuk))
                {
                    break label0;
                }
            }
            obj = (ctr)dko1;
        }
        obj = a(((ccg) (obj)), i1);
        byte abyte0[] = ((ccf) (obj)).e();
        i1 = abyte0.length;
        ebw.a("Babel_RequestWriter", (new StringBuilder(31)).append("encodedRequestSize: ").append(i1).toString());
        long l1 = -1L;
        if ((long)i1 > m)
        {
            l1 = dki.a(context).b(((ccf) (obj)));
            intent.putExtra("database_id", l1);
        } else
        {
            intent.putExtra("server_request", abyte0);
        }
        if (b)
        {
            context = String.valueOf(dko1.getClass().getSimpleName());
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(context).length() + 72)).append("Creating request service intent for ").append(context).append(" request row id ").append(l1).toString());
        }
        return intent;
    }

    public static ccf a(Bundle bundle, dki dki1, int i1)
    {
        if (bundle.containsKey("server_request"))
        {
            bundle = dkl.a(bundle.getByteArray("server_request"));
            if (bundle != null)
            {
                if (b)
                {
                    ebw.b("Babel_RequestWriter", "Generating NetworkQueueItem from EXTRA_WRITABLE_REQUEST");
                }
                return a(((ccg) (bundle)), i1);
            }
        } else
        if (bundle.containsKey("database_id"))
        {
            long l1 = bundle.getLong("database_id");
            if (b)
            {
                ebw.b("Babel_RequestWriter", (new StringBuilder(72)).append("Generating NetworkQueueItem from EXTRA_DATABASE_ID: ").append(l1).toString());
            }
            return dki1.b(l1);
        }
        return null;
    }

    private static ccf a(ccg ccg1, int i1)
    {
        boolean flag = dbq.c(i1);
        String s1 = ccg1.a();
        String s = s1;
        if (flag)
        {
            s = s1;
            if (!s1.equals("event_queue"))
            {
                s = "default_queue";
            }
        }
        return new ccf((new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i1).toString(), i1, ccg1);
    }

    public static ccg a(Context context, Intent intent, int i1)
    {
        context = a(intent.getExtras(), dki.a(context), i1);
        if (context != null)
        {
            return context.a();
        } else
        {
            return null;
        }
    }

    public static String a(RequestWriter requestwriter, String s)
    {
        return requestwriter.a(s);
    }

    public static void a(RequestWriter requestwriter, String s, String s1)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (RequestWriter requestwriter)
        {
            return;
        }
        if (s == null) goto _L2; else goto _L3
_L3:
        requestwriter.p();
        requestwriter;
        JVM INSTR monitorenter ;
        for (Iterator iterator = requestwriter.c.values().iterator(); iterator.hasNext(); ((ccc)iterator.next()).a(s, s1)) { }
        break MISSING_BLOCK_LABEL_65;
        s;
        requestwriter;
        JVM INSTR monitorexit ;
        throw s;
        requestwriter;
        JVM INSTR monitorexit ;
_L2:
    }

    public static boolean a(RequestWriter requestwriter)
    {
        return requestwriter.o();
    }

    private PendingIntent b(long l1)
    {
        Intent intent = k();
        intent.putExtra("backoff_period", l1);
        return PendingIntent.getService(this, eba.a(103), intent, 0x10000000);
    }

    public static String b(RequestWriter requestwriter, String s)
    {
        return requestwriter.a(s);
    }

    public static String c(RequestWriter requestwriter, String s)
    {
        return requestwriter.a(s);
    }

    public static String d(RequestWriter requestwriter, String s)
    {
        return requestwriter.a(s);
    }

    public static void j()
    {
        if (n)
        {
            g.nS.startService(k());
        }
    }

    public static Intent k()
    {
        return new Intent(g.nS, com/google/android/apps/hangouts/requestwriter/RequestWriter);
    }

    public static void l()
    {
        n();
    }

    public static boolean m()
    {
        return b;
    }

    private static void n()
    {
        alw alw1 = (alw)hgx.a(g.nS, alw);
        h = alw1.a("babel_max_unexpected_error_retries", 2);
        i = alw1.a("babel_max_upload_error_retries", 10);
        long l1 = alw1.a("babel_request_writer_failure_injection_percent", 0L);
        j = l1;
        if (l1 > 0L)
        {
            ebw.f("Babel_RequestWriter", "******************************************************");
            long l2 = j;
            ebw.f("Babel_RequestWriter", (new StringBuilder(51)).append("failureInjectionPercent set to ").append(l2).toString());
            ebw.f("Babel_RequestWriter", "******************************************************");
        }
        l = ebr.a();
        k = alw1.a("babel_requestwriter_ms", 5000);
        m = alw1.a("babel_maximum_request_writer_intent_extra_size", 0L);
    }

    private boolean o()
    {
        NetworkInfo networkinfo = e.getActiveNetworkInfo();
        boolean flag1 = d;
        boolean flag;
        if (networkinfo != null && networkinfo.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (d != flag1 && b)
        {
            flag = d;
            ebw.b("Babel_RequestWriter", (new StringBuilder(51)).append("network: updateNetworkAvailable was ").append(flag1).append(" now ").append(flag).toString());
        }
        return d;
    }

    private void p()
    {
        if (l)
        {
            Thread thread = Thread.currentThread();
            Iterator iterator = c.values().iterator();
            while (iterator.hasNext()) 
            {
                if (((ccc)iterator.next()).a(thread))
                {
                    throw new IllegalStateException("don't get RequestWriter lock from network queue thread");
                }
            }
        }
    }

    private static Map q()
    {
        LinkedList linkedlist = new LinkedList(jlk.a(ctv, cvr, cut, cxt, cvk, cyo, cts, cvp, cuo, cxk, cup, cxl, new Class[] {
            cuv, cxx, cuw, cxy, cuz, cyc, cve, cyh, cul, cxd, 
            cuq, cxm, ctw, cvt, cun, cxi, cvh, cyk, cuc, cwh, 
            cvg, cyj, cuh, cwt, cty, cvv, cvi, cyl, cue, cwj, 
            cvj, cym, cus, cxs, cud, cwi, cuk, cxc, cuy, cyb, 
            cvb, cye, cvd, cyg, ctt, cvq, cth, cwm, cti, cwn, 
            cte, cvs, ctg, cwl, ctm, cxo, ctj, cxa, cso, cwf, 
            csu, cxz, ctx, cvu, csp, cwq, cux, cya, cvf, cyi, 
            ctd, cvo, ctf, cwd, ctk, cxb, ctl, cxj, cub, cwb, 
            cuu, cxv, cst, cxf, css, cxe, cum, cxh, cvc, cyf, 
            cvl, cyp, cva, cyd, ctz, cvw, cuf, cwk, csr, cwx, 
            csq, cwu, csn, cwc, csg, cwy, csc, cvx, cse, cwe, 
            csf, cwp, csd, cwa, cug, cwo, cur, cxn
        }));
        for (Iterator iterator = hgx.c(g.nS, dkd).iterator(); iterator.hasNext(); linkedlist.addAll(((dkd)iterator.next()).a())) { }
        gz gz1;
        int i1;
        boolean flag;
        if (linkedlist.size() % 2 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "The list of request -> response classes in RequestWriter#makeMapping should contain the request class followed by the response class. However, this list was contained an odd number of classes, so something is wired incorrectly.");
        gz1 = new gz();
        i1 = 0;
        do
        {
            if (i1 >= linkedlist.size())
            {
                break;
            }
            Class class1 = (Class)linkedlist.get(i1);
            Object obj = (Class)linkedlist.get(i1 + 1);
            dke dke1 = new dke();
            dke1.a = ((Class) (obj));
            if (cui.isAssignableFrom(class1))
            {
                try
                {
                    dke1.b = ((Class) (obj)).getMethod("parseFrom", new Class[] {
                        [B
                    });
                }
                catch (NoSuchMethodException nosuchmethodexception)
                {
                    obj = String.valueOf(((Class) (obj)).getName());
                    (new StringBuilder(String.valueOf(obj).length() + 106)).append("Couldn't find parseFrom method for ").append(((String) (obj))).append(". Ensure that proguard.flags is not automatically removing your method.");
                }
            }
            gz1.put(class1, dke1);
            i1 += 2;
        } while (true);
        return gz1;
    }

    protected int a()
    {
        return k;
    }

    public void a(long l1)
    {
        ccc ccc1;
        for (Iterator iterator = c.values().iterator(); iterator.hasNext(); ccc1.a(true))
        {
            ccc1 = (ccc)iterator.next();
            ccc1.a(l1);
        }

    }

    public void a(Intent intent)
    {
        if (intent != null)
        {
            if (b)
            {
                String s = String.valueOf(intent);
                ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 31)).append("queue network request directly ").append(s).toString());
            }
            intent.putExtra("timestamp", SystemClock.elapsedRealtime());
            if (!w_())
            {
                ebw.g("Babel_RequestWriter", "tryRetainService failed.");
                throw new IllegalStateException();
            }
            Message message = Message.obtain();
            message.getData().putParcelable("intent", intent);
            if (!p.a.sendMessage(message))
            {
                ebw.g("Babel_RequestWriter", "mHandler.sendMessage returned false");
                return;
            }
        }
    }

    public void a(ccf ccf1)
    {
        long l1 = ccf1.a.a;
        Object obj = (new StringBuilder(76)).append("NetworkQueueItem being queued must have a valid row ID: ").append(l1).toString();
        ccc ccc1;
        String s;
        boolean flag;
        if (ccf1.a.a > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(((String) (obj)), flag);
        s = ccf1.a.b;
        p();
        this;
        JVM INSTR monitorenter ;
        ccc1 = (ccc)c.get(s);
        obj = ccc1;
        if (ccc1 != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = new ccc(s, this);
        c.put(s, obj);
        ((ccc) (obj)).a();
        this;
        JVM INSTR monitorexit ;
        ((ccc) (obj)).a(ccf1, ccf1.a().c());
        return;
        ccf1;
        this;
        JVM INSTR monitorexit ;
        throw ccf1;
    }

    public void a(boolean flag)
    {
        if (!flag)
        {
            o();
        }
        ((ccm)hgx.a(f(), ccm)).a(flag);
    }

    public boolean b()
    {
        return d;
    }

    public cck c()
    {
        return dki.a(f());
    }

    public void e()
    {
        super.x_();
    }

    public Context f()
    {
        return getApplicationContext();
    }

    public boolean g()
    {
        return j > 0L && (long)g.nextInt(100) < j;
    }

    public IBinder onBind(Intent intent)
    {
        h();
        return o;
    }

    public void onCreate()
    {
        if (b)
        {
            int i1 = hashCode();
            ebw.b("Babel_RequestWriter", (new StringBuilder(34)).append("RequestWriter.onCreate ").append(i1).toString());
        }
        super.onCreate();
        boolean flag;
        try
        {
            frl.a(getApplicationContext());
        }
        catch (ejm ejm1)
        {
            ejn.a(ejm1.a(), getApplicationContext());
            ebw.e("Babel_RequestWriter", "GPS repairable exception when trying to installIfNeeded", ejm1);
        }
        catch (ejl ejl1)
        {
            ebw.e("Babel_RequestWriter", "GPS not available when trying to installIfNeeded", ejl1);
        }
        if (Build.TYPE.equals("eng") || Build.TYPE.equals("userdebug"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            HashSet hashset = new HashSet();
            Iterator iterator = a.entrySet().iterator();
            java.util.Map.Entry entry;
            boolean flag1;
            for (flag = true; iterator.hasNext(); flag = g.a(((dke)entry.getValue()).a, null, 0, hashset) & (flag1 & flag))
            {
                entry = (java.util.Map.Entry)iterator.next();
                flag1 = g.a((Class)entry.getKey(), null, 0, hashset);
            }

            if (!flag)
            {
                throw new IllegalStateException("not all ServerRequest and ServerResponse classes are set up correctly for serialization");
            }
        }
        p = new dkg(this);
        p.start();
        e = (ConnectivityManager)getSystemService("connectivity");
        o();
        Object obj = new dka(hgx.b(this), this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(((android.content.BroadcastReceiver) (obj)), intentfilter);
        f = ((dka) (obj));
        h();
        obj = Message.obtain();
        obj.arg1 = 1;
        p.a.sendMessage(((Message) (obj)));
        ((AlarmManager)getSystemService("alarm")).cancel(b(500L));
    }

    public void onDestroy()
    {
        super.onDestroy();
        p.a.getLooper().quit();
        Object obj = c.values().iterator();
        long l1 = 500L;
        long l2 = 0x7fffffffffffffffL;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ccc ccc1 = (ccc)((Iterator) (obj)).next();
            ccc1.e();
            l2 = Math.min(l2, ccc1.b());
            if (ccc1.c() > 0)
            {
                l1 = Math.max(l1, ccc1.f());
            }
        } while (true);
        c.clear();
        if (b)
        {
            ebw.b("Babel_RequestWriter", (new StringBuilder(65)).append("Recycling request writer. Will restart after ").append(l2).toString());
        }
        if (l2 < 0x7fffffffffffffffL)
        {
            ((AlarmManager)getSystemService("alarm")).set(3, l2 + SystemClock.elapsedRealtime(), b(l1));
            n = true;
        } else
        {
            n = false;
        }
        obj = f;
        if (obj != null)
        {
            unregisterReceiver(((android.content.BroadcastReceiver) (obj)));
        }
    }

    public void onRebind(Intent intent)
    {
        h();
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        if (intent != null)
        {
            if (b)
            {
                ebw.b("Babel_RequestWriter", "RequestWriter.onStartCommand");
            }
            a(j1);
            intent.putExtra("timestamp", SystemClock.elapsedRealtime() * 1000L);
            Message message = Message.obtain();
            message.getData().putParcelable("intent", intent);
            if (!p.a.sendMessage(message))
            {
                ebw.g("Babel_RequestWriter", "mHandler.sendMessage returned false");
            }
        }
        return 2;
    }

    public boolean onUnbind(Intent intent)
    {
        x_();
        return true;
    }

    public boolean v_()
    {
        return super.w_();
    }

    static 
    {
        hik hik = ebw.o;
        n();
        g.a(g.nS).a(new dkc());
    }
}
