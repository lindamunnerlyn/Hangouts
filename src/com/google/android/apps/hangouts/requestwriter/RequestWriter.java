// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.requestwriter;

import amo;
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
import cdh;
import cdj;
import cdk;
import cdl;
import cdn;
import cdp;
import cdr;
import cuf;
import cug;
import cuh;
import cui;
import cuj;
import cuq;
import cur;
import cus;
import cut;
import cuu;
import cuv;
import cuw;
import cux;
import cvg;
import cvh;
import cvi;
import cvj;
import cvk;
import cvl;
import cvm;
import cvn;
import cvo;
import cvp;
import cvv;
import cvw;
import cvx;
import cvz;
import cwa;
import cwb;
import cwc;
import cwd;
import cwf;
import cwg;
import cwh;
import cwi;
import cwj;
import cwk;
import cwl;
import cwm;
import cwo;
import cwp;
import cwq;
import cwr;
import cws;
import cwt;
import cwu;
import cwv;
import cww;
import cwx;
import cwy;
import cwz;
import cxa;
import cxb;
import cxc;
import cxd;
import cxe;
import cxf;
import cxg;
import cxh;
import cxi;
import cxj;
import cxk;
import cxl;
import cxm;
import cxn;
import cxo;
import cxp;
import cxs;
import cxt;
import cxu;
import cxv;
import cxw;
import cxx;
import cxy;
import cxz;
import cya;
import cyb;
import cye;
import cyf;
import cyg;
import cyh;
import cyi;
import cyj;
import cyl;
import cym;
import cyn;
import cyo;
import cyp;
import cyq;
import cyr;
import cys;
import cyt;
import cyu;
import cyx;
import cyy;
import czb;
import czc;
import cze;
import czf;
import czg;
import czh;
import czi;
import czj;
import czl;
import czm;
import czn;
import czo;
import czp;
import czq;
import czr;
import czs;
import czw;
import czx;
import czz;
import dab;
import dac;
import dad;
import dae;
import daf;
import dag;
import dah;
import dai;
import daj;
import dak;
import dal;
import dam;
import dan;
import dao;
import dap;
import daq;
import das;
import dat;
import dcz;
import dif;
import dlr;
import dls;
import dlt;
import dlu;
import dlv;
import dlw;
import dlx;
import dlz;
import dmc;
import dmf;
import eee;
import eep;
import eev;
import emm;
import emn;
import emo;
import fts;
import g;
import gdv;
import gz;
import hlp;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jsh;
import jxa;

public class RequestWriter extends dif
    implements cdj, dls
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
    private dlr f;
    private final Random g = new Random();
    private final IBinder o = new dlw(this);
    private dlx p;

    public RequestWriter()
    {
    }

    public static Intent a(Context context, dmf dmf1, int i1)
    {
        Object obj;
        Intent intent;
label0:
        {
            intent = k();
            intent.putExtra("account_id", i1);
            cdl cdl1 = dmf1.m();
            obj = cdl1;
            if (dcz.d(i1))
            {
                break label0;
            }
            if (!(dmf1 instanceof cwx))
            {
                obj = cdl1;
                if (!(dmf1 instanceof cwo))
                {
                    break label0;
                }
            }
            obj = (cvv)dmf1;
        }
        obj = a(((cdl) (obj)), i1);
        byte abyte0[] = ((cdk) (obj)).e();
        i1 = abyte0.length;
        eev.a("Babel_RequestWriter", (new StringBuilder(31)).append("encodedRequestSize: ").append(i1).toString());
        long l1 = -1L;
        if ((long)i1 > m)
        {
            l1 = dlz.a(context).b(((cdk) (obj)));
            intent.putExtra("database_id", l1);
        } else
        {
            intent.putExtra("server_request", abyte0);
        }
        if (b)
        {
            context = String.valueOf(dmf1.getClass().getSimpleName());
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(context).length() + 72)).append("Creating request service intent for ").append(context).append(" request row id ").append(l1).toString());
        }
        return intent;
    }

    public static cdk a(Bundle bundle, dlz dlz1, int i1)
    {
        if (bundle.containsKey("server_request"))
        {
            bundle = dmc.a(bundle.getByteArray("server_request"));
            if (bundle != null)
            {
                if (b)
                {
                    eev.b("Babel_RequestWriter", "Generating NetworkQueueItem from EXTRA_WRITABLE_REQUEST");
                }
                return a(((cdl) (bundle)), i1);
            }
        } else
        if (bundle.containsKey("database_id"))
        {
            long l1 = bundle.getLong("database_id");
            if (b)
            {
                eev.b("Babel_RequestWriter", (new StringBuilder(72)).append("Generating NetworkQueueItem from EXTRA_DATABASE_ID: ").append(l1).toString());
            }
            return dlz1.b(l1);
        }
        return null;
    }

    private static cdk a(cdl cdl1, int i1)
    {
        boolean flag = dcz.c(i1);
        String s1 = cdl1.a();
        String s = s1;
        if (flag)
        {
            s = s1;
            if (!s1.equals("event_queue"))
            {
                s = "default_queue";
            }
        }
        return new cdk((new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i1).toString(), i1, cdl1);
    }

    public static cdl a(Context context, Intent intent, int i1)
    {
        context = a(intent.getExtras(), dlz.a(context), i1);
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
        for (Iterator iterator = requestwriter.c.values().iterator(); iterator.hasNext(); ((cdh)iterator.next()).a(s, s1)) { }
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
        return PendingIntent.getService(this, eee.a(103), intent, 0x10000000);
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
            g.nU.startService(k());
        }
    }

    public static Intent k()
    {
        return new Intent(g.nU, com/google/android/apps/hangouts/requestwriter/RequestWriter);
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
        amo amo1 = (amo)hlp.a(g.nU, amo);
        h = amo1.a("babel_max_unexpected_error_retries", 2);
        i = amo1.a("babel_max_upload_error_retries", 10);
        long l1 = amo1.a("babel_request_writer_failure_injection_percent", 0L);
        j = l1;
        if (l1 > 0L)
        {
            eev.f("Babel_RequestWriter", "******************************************************");
            long l2 = j;
            eev.f("Babel_RequestWriter", (new StringBuilder(51)).append("failureInjectionPercent set to ").append(l2).toString());
            eev.f("Babel_RequestWriter", "******************************************************");
        }
        l = eep.a();
        k = amo1.a("babel_requestwriter_ms", 5000);
        m = amo1.a("babel_maximum_request_writer_intent_extra_size", 0L);
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
            eev.b("Babel_RequestWriter", (new StringBuilder(51)).append("network: updateNetworkAvailable was ").append(flag1).append(" now ").append(flag).toString());
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
                if (((cdh)iterator.next()).a(thread))
                {
                    throw new IllegalStateException("don't get RequestWriter lock from network queue thread");
                }
            }
        }
    }

    private static Map q()
    {
        Object aobj[] = new Object[130];
        aobj[0] = cvz;
        aobj[1] = cxv;
        aobj[2] = cwx;
        aobj[3] = czx;
        aobj[4] = cxo;
        aobj[5] = das;
        aobj[6] = cvw;
        aobj[7] = cxt;
        aobj[8] = cws;
        aobj[9] = czo;
        aobj[10] = cwt;
        aobj[11] = czp;
        System.arraycopy(new Class[] {
            cwz, dab, cxa, dac, cxd, dag, cxi, dal, cwp, czh, 
            cwu, czq, cwa, cxx, cwr, czm, cxl, dao, cwg, cyl, 
            cxk, dan, cwl, cyx, cwc, cxz, cxm, dap, cwi, cyn, 
            cxn, daq, cww, czw, cwh, cym, cwo, czg, cxc, daf, 
            cxf, dai, cxh, dak, cvx, cxu, cvk, cyq, cvl, cyr, 
            cvh, cxw, cvj, cyp, cvp, czs, cvm, cze, cur, cyj, 
            cux, dad, cwb, cxy, cus, cyu, cxb, dae, cxj, dam, 
            cvg, cxs, cvi, cyh, cvn, czf, cvo, czn, cwf, cyf, 
            cwy, czz, cuw, czj, cuv, czi, cwq, czl, cxg, daj, 
            cxp, dat, cxe, dah, cwd, cya, cwj, cyo, cuu, czb, 
            cut, cyy, cuq, cyg, cuj, czc, cuf, cyb, cuh, cyi, 
            cui, cyt, cug, cye, cwk, cys, cwv, czr
        }, 0, ((Object) (aobj)), 12, 118);
        aobj = jxa.b(aobj, 130);
        LinkedList linkedlist = new LinkedList(jsh.b(aobj, aobj.length));
        for (Iterator iterator = hlp.c(g.nU, dlu).iterator(); iterator.hasNext(); linkedlist.addAll(((dlu)iterator.next()).a())) { }
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
        g.d(flag, "The list of request -> response classes in RequestWriter#makeMapping should contain the request class followed by the response class. However, this list was contained an odd number of classes, so something is wired incorrectly.");
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
            dlv dlv1 = new dlv();
            dlv1.a = ((Class) (obj));
            if (cwm.isAssignableFrom(class1))
            {
                try
                {
                    dlv1.b = ((Class) (obj)).getMethod("parseFrom", new Class[] {
                        [B
                    });
                }
                catch (NoSuchMethodException nosuchmethodexception)
                {
                    obj = String.valueOf(((Class) (obj)).getName());
                    (new StringBuilder(String.valueOf(obj).length() + 106)).append("Couldn't find parseFrom method for ").append(((String) (obj))).append(". Ensure that proguard.flags is not automatically removing your method.");
                }
            }
            gz1.put(class1, dlv1);
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
        cdh cdh1;
        for (Iterator iterator = c.values().iterator(); iterator.hasNext(); cdh1.a(true))
        {
            cdh1 = (cdh)iterator.next();
            cdh1.a(l1);
        }

    }

    public void a(Intent intent)
    {
        if (intent != null)
        {
            if (b)
            {
                String s = String.valueOf(intent);
                eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 31)).append("queue network request directly ").append(s).toString());
            }
            intent.putExtra("timestamp", SystemClock.elapsedRealtime());
            if (!w_())
            {
                eev.g("Babel_RequestWriter", "tryRetainService failed.");
                throw new IllegalStateException();
            }
            Message message = Message.obtain();
            message.getData().putParcelable("intent", intent);
            if (!p.a.sendMessage(message))
            {
                eev.g("Babel_RequestWriter", "mHandler.sendMessage returned false");
                return;
            }
        }
    }

    public void a(cdk cdk1)
    {
        long l1 = cdk1.a.a;
        Object obj = (new StringBuilder(76)).append("NetworkQueueItem being queued must have a valid row ID: ").append(l1).toString();
        cdh cdh1;
        String s;
        boolean flag;
        if (cdk1.a.a > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a(((String) (obj)), flag);
        s = cdk1.a.b;
        p();
        this;
        JVM INSTR monitorenter ;
        cdh1 = (cdh)c.get(s);
        obj = cdh1;
        if (cdh1 != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = new cdh(s, this);
        c.put(s, obj);
        ((cdh) (obj)).a();
        this;
        JVM INSTR monitorexit ;
        ((cdh) (obj)).a(cdk1, cdk1.a().c());
        return;
        cdk1;
        this;
        JVM INSTR monitorexit ;
        throw cdk1;
    }

    public void a(boolean flag)
    {
        if (!flag)
        {
            o();
        }
        ((cdr)hlp.a(f(), cdr)).a(flag);
    }

    public boolean b()
    {
        return d;
    }

    public cdp c()
    {
        return dlz.a(f());
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
            eev.b("Babel_RequestWriter", (new StringBuilder(34)).append("RequestWriter.onCreate ").append(i1).toString());
        }
        super.onCreate();
        boolean flag;
        try
        {
            fts.a(getApplicationContext());
        }
        catch (emn emn1)
        {
            emo.a(emn1.a(), getApplicationContext());
            eev.e("Babel_RequestWriter", "GPS repairable exception when trying to installIfNeeded", emn1);
        }
        catch (emm emm1)
        {
            eev.e("Babel_RequestWriter", "GPS not available when trying to installIfNeeded", emm1);
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
            for (flag = true; iterator.hasNext(); flag = g.a(((dlv)entry.getValue()).a, null, 0, hashset) & (flag1 & flag))
            {
                entry = (java.util.Map.Entry)iterator.next();
                flag1 = g.a((Class)entry.getKey(), null, 0, hashset);
            }

            if (!flag)
            {
                throw new IllegalStateException("not all ServerRequest and ServerResponse classes are set up correctly for serialization");
            }
        }
        p = new dlx(this);
        p.start();
        e = (ConnectivityManager)getSystemService("connectivity");
        o();
        Object obj = new dlr(hlp.b(this), this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(((android.content.BroadcastReceiver) (obj)), intentfilter);
        f = ((dlr) (obj));
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
            cdh cdh1 = (cdh)((Iterator) (obj)).next();
            cdh1.e();
            l2 = Math.min(l2, cdh1.b());
            if (cdh1.c() > 0)
            {
                l1 = Math.max(l1, cdh1.f());
            }
        } while (true);
        c.clear();
        if (b)
        {
            eev.b("Babel_RequestWriter", (new StringBuilder(65)).append("Recycling request writer. Will restart after ").append(l2).toString());
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
                eev.b("Babel_RequestWriter", "RequestWriter.onStartCommand");
            }
            a(j1);
            intent.putExtra("timestamp", SystemClock.elapsedRealtime() * 1000L);
            Message message = Message.obtain();
            message.getData().putParcelable("intent", intent);
            if (!p.a.sendMessage(message))
            {
                eev.g("Babel_RequestWriter", "mHandler.sendMessage returned false");
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
        hnc hnc = eev.o;
        n();
        g.a(g.nU).a(new dlt());
    }
}
