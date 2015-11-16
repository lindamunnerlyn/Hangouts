// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.serverupdate;

import alw;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import ani;
import any;
import aoe;
import byy;
import cej;
import cey;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import crm;
import ctr;
import cyq;
import cyr;
import cys;
import cyt;
import cyv;
import cyy;
import cyz;
import cza;
import czf;
import czh;
import czi;
import czj;
import czm;
import dbe;
import dbf;
import dbn;
import dbw;
import dco;
import dfb;
import dfd;
import dii;
import diy;
import djl;
import djm;
import dkw;
import doq;
import eba;
import ebw;
import g;
import gms;
import gmw;
import h;
import hgx;
import java.util.Iterator;
import java.util.List;
import jhb;

public class ReceiveServerUpdateService extends djl
{

    private static final boolean a = false;
    private static final int b = Process.myPid();
    private static final Object c = new Object();
    private static android.os.PowerManager.WakeLock d;
    private static boolean e;

    public ReceiveServerUpdateService()
    {
        super("ReceiveServerUpdateService");
    }

    private static String a(int i)
    {
        switch (i)
        {
        default:
            String s = String.valueOf(Integer.toString(i));
            return (new StringBuilder(String.valueOf(s).length() + 17)).append("(unknown opcode ").append(s).append(")").toString();

        case 1: // '\001'
            return "OP_RECEIVE_SERVER_UPDATE";
        }
    }

    public static void a()
    {
        b();
    }

    private static void a(String s)
    {
        String s1 = String.valueOf("[ReceiveServerUpdateService] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        ebw.b("Babel", s);
    }

    public static void a(String s, int i, long l, long l1, jhb jhb)
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/serverupdate/ReceiveServerUpdateService);
        intent.putExtra("op", 1);
        intent.putExtra("account_id", i);
        intent.putExtra("timestamp", l);
        intent.putExtra("gcm_handle_timestamps", l1);
        cyq.a(intent, s);
        intent.putExtra("rqtms", SystemClock.elapsedRealtime());
        if (a || e)
        {
            intent.putExtra("rqtns", System.nanoTime());
        }
        Context context = g.nS;
        synchronized (c)
        {
            if (d == null)
            {
                if (a)
                {
                    a("initializing wakelock");
                }
                d = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "hangouts_rsus");
            }
        }
        if (a)
        {
            s = String.valueOf(a(intent.getIntExtra("op", 0)));
            if (s.length() != 0)
            {
                s = "acquiring wakelock for opcode ".concat(s);
            } else
            {
                s = new String("acquiring wakelock for opcode ");
            }
            a(s);
        }
        d.acquire();
        intent.setClass(context, com/google/android/apps/hangouts/serverupdate/ReceiveServerUpdateService);
        intent.putExtra("pid", b);
        intent.putExtra("stack_trace", ebw.a(new Throwable()));
        if (((djm)hgx.a(context, djm)).a(context, intent, jhb) == null)
        {
            s = String.valueOf(intent);
            ebw.g("Babel", (new StringBuilder(String.valueOf(s).length() + 62)).append("ReceiveServerUpdateService failed to start service for intent ").append(s).toString());
            d.release();
        }
        return;
        jhb;
        s;
        JVM INSTR monitorexit ;
        throw jhb;
    }

    private static void b()
    {
        e = g.a(g.nS, "babel_log_dump", false);
    }

    public void a(Intent intent, jhb jhb)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        ebw.f("Babel", "ReceiveServerUpdateService onHandleIntent called with null intent");
_L8:
        return;
_L2:
        Object obj;
        dbn dbn1;
        int i;
        int j;
        boolean flag;
        if (b == intent.getIntExtra("pid", -1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = intent.getIntExtra("account_id", -1);
        obj = dbf.e(i);
        j = intent.getIntExtra("op", 0);
        dbn1 = dbf.h(((ani) (obj)));
        if (a)
        {
            String s = String.valueOf(intent);
            String s1 = a(j);
            a((new StringBuilder(String.valueOf(s).length() + 73 + String.valueOf(s1).length())).append("ReceiveServerUpdateService onHandleIntent ").append(s).append(" opCode: ").append(s1).append(" respectWakeLock ").append(flag).toString());
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        j;
        JVM INSTR tableswitch 1 2: default 168
    //                   1 186
    //                   2 1519;
           goto _L4 _L5 _L6
_L4:
        if (!flag) goto _L8; else goto _L7
_L7:
        d.release();
        return;
_L5:
        long l1;
        l1 = SystemClock.elapsedRealtime();
        obj = cyq.a(intent, ((ani) (obj)), true);
        if (obj == null) goto _L10; else goto _L9
_L9:
        Iterator iterator = ((List) (obj)).iterator();
_L19:
        if (!iterator.hasNext()) goto _L4; else goto _L11
_L11:
        Object obj1;
        Object obj2;
        long l2;
        long l3;
        obj2 = (cyq)iterator.next();
        if (obj2 instanceof crm)
        {
            ((crm)obj2).a(1);
        }
        l2 = intent.getLongExtra("timestamp", 0L);
        l3 = intent.getLongExtra("gcm_handle_timestamps", 0L);
        obj1 = dbf.e(i);
        if (!ebw.a("Babel", 3)) goto _L13; else goto _L12
_L12:
        obj = null;
        Object obj3;
        Object obj4;
        if (obj2 instanceof cys)
        {
            obj = ((cys)obj2).c;
        }
        obj3 = String.valueOf(obj2.getClass().getSimpleName());
        obj4 = String.valueOf(((ani) (obj1)).b());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1573;
        }
        obj = String.valueOf(obj);
        if (((String) (obj)).length() == 0) goto _L15; else goto _L14
_L14:
        obj = "update convId ".concat(((String) (obj)));
_L24:
        ebw.c("Babel", (new StringBuilder(String.valueOf(obj3).length() + 32 + String.valueOf(obj4).length() + String.valueOf(obj).length())).append("processServerUpdate: ").append(((String) (obj3))).append(", account: ").append(((String) (obj4))).append(((String) (obj))).toString());
_L13:
        if (!(obj2 instanceof cyr)) goto _L17; else goto _L16
_L16:
        if (((cyr)obj2).a == 1) goto _L19; else goto _L18
_L18:
        if (!a) goto _L21; else goto _L20
_L20:
        obj = String.valueOf(((ani) (obj1)).a());
        if (((String) (obj)).length() == 0) goto _L23; else goto _L22
_L22:
        obj = "Clearing active client time stamp for account: ".concat(((String) (obj)));
_L25:
        a(((String) (obj)));
_L21:
        dii.a(((ani) (obj1))).h();
          goto _L19
        intent;
        if (flag)
        {
            d.release();
        }
        throw intent;
_L15:
        obj = new String("update convId ");
          goto _L24
_L23:
        obj = new String("Clearing active client time stamp for account: ");
          goto _L25
_L17:
label0:
        {
            if (!(obj2 instanceof czh))
            {
                break label0;
            }
            obj = (czh)obj2;
            if (((czh) (obj)).b == 1)
            {
                (new aoe(this, i)).s(((czh) (obj)).a);
            }
        }
          goto _L19
        if (!(obj2 instanceof czj))
        {
            break MISSING_BLOCK_LABEL_629;
        }
        obj = (czj)obj2;
        if (!((czj) (obj)).b) goto _L19; else goto _L26
_L26:
        l2 = ((czj) (obj)).a;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_619;
        }
        ((doq)hgx.a(getApplicationContext(), doq)).a(i, l2);
        RealTimeChatService.b(((ani) (obj1)), l2);
          goto _L19
label1:
        {
            if (!(obj2 instanceof czm))
            {
                break label1;
            }
            obj = (czm)obj2;
            new dfb();
            obj1 = new aoe(this, i);
            (new dbe(((czm) (obj)))).b(((aoe) (obj1)));
        }
          goto _L19
label2:
        {
            if (!(obj2 instanceof cyt))
            {
                break label2;
            }
            obj = (cyt)obj2;
            new dfb();
            obj1 = new aoe(this, i);
            (new dbw(((cyt) (obj)))).a(((aoe) (obj1)));
        }
          goto _L19
        if (!(obj2 instanceof cyv))
        {
            break MISSING_BLOCK_LABEL_804;
        }
        obj1 = ((cyv)obj2).c;
        obj = String.valueOf(obj1);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_790;
        }
        obj = "ContactsNotification.selfFanoutId == ".concat(((String) (obj)));
_L27:
        a(((String) (obj)));
        if (!ctr.c(((String) (obj1))))
        {
            RealTimeChatService.a(i, true);
        }
          goto _L19
        obj = new String("ContactsNotification.selfFanoutId == ");
          goto _L27
label3:
        {
            if (!(obj2 instanceof cyy))
            {
                break label3;
            }
            obj = (cyy)obj2;
            new dfb();
            obj1 = new aoe(this, i);
            (new dco(((cyy) (obj)))).a(((aoe) (obj1)));
        }
          goto _L19
label4:
        {
            if (!(obj2 instanceof czf))
            {
                break label4;
            }
            obj = (czf)obj2;
            new dfb();
            obj1 = new aoe(this, i);
            (new diy(((czf) (obj)))).a(((aoe) (obj1)));
        }
          goto _L19
label5:
        {
            if (!(obj2 instanceof czi))
            {
                break label5;
            }
            obj = (czi)obj2;
            obj2 = ((gms)hgx.a(g.nS, gms)).b(i);
            RealTimeChatService.a(((gmw) (obj2)), ((czi) (obj)).a);
            ((gmw) (obj2)).d();
            RealTimeChatService.f(((ani) (obj1)));
        }
          goto _L19
label6:
        {
            if (!(obj2 instanceof cyz))
            {
                break label6;
            }
            RealTimeChatService.a(((ani) (obj1)), (cyz)obj2);
        }
          goto _L19
        obj3 = getApplicationContext();
        obj4 = dbf.e(i);
        obj = new dfb();
        ((dfb) (obj)).a(((ani) (obj4)));
        ((dfb) (obj)).b();
        any.a(new aoe(g.nS, i), ((cyq) (obj2)), ((dfb) (obj)), l2, l3, l1 * 1000L);
        ((dfb) (obj)).e();
        obj1 = ((dfb) (obj)).c();
        if (((List) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_1156;
        }
        if (ebw.a("Babel", 3))
        {
            int k = ((List) (obj1)).size();
            String s2 = String.valueOf(obj2.getClass().getSimpleName());
            ebw.c("Babel", (new StringBuilder(String.valueOf(s2).length() + 66)).append("processServerUpdate: sending ").append(k).append(" requests from processing ").append(s2).toString());
        }
        if (dbn1 == null)
        {
            break MISSING_BLOCK_LABEL_1156;
        }
        dbn1.a(((java.util.Collection) (obj1)), 0);
        dfd dfd1 = ((dfb) (obj)).g();
        if (!ebw.a("Babel", 3)) goto _L29; else goto _L28
_L28:
        obj = String.valueOf(dfd1.toString());
        if (((String) (obj)).length() == 0) goto _L31; else goto _L30
_L30:
        obj = "update should trigger notification? ".concat(((String) (obj)));
_L36:
        ebw.c("Babel", ((String) (obj)));
_L29:
        if (!(obj2 instanceof cza)) goto _L33; else goto _L32
_L32:
        obj1 = (cza)obj2;
        obj = ((cza) (obj1)).c;
        obj1 = ((cza) (obj1)).m;
_L37:
        l2 = SystemClock.elapsedRealtime();
        if (dfd1 != dfd.b) goto _L35; else goto _L34
_L34:
        h.a(i, l2, 10, (new byy()).a(453).c(((String) (obj1))).a(((String) (obj))));
        ebw.a("Babel", "Scheduling future notification after late push");
        obj2 = (AlarmManager)g.nS.getSystemService("alarm");
        obj3 = new Intent("com.google.android.apps.hangouts.DEFERRED_NOTIFICATION");
        ((Intent) (obj3)).putExtra("op", 2);
        ((Intent) (obj3)).putExtra("account_id", i);
        ((Intent) (obj3)).putExtra("message_id", ((String) (obj1)));
        ((Intent) (obj3)).putExtra("conversation_id", ((String) (obj)));
        int l = eba.a(i, 1, 110, null);
        obj = PendingIntent.getBroadcast(g.nS, l, ((Intent) (obj3)), 0x10000000);
        ((AlarmManager) (obj2)).set(2, SystemClock.elapsedRealtime() + g.a(g.nS, "babel_latenotifdly", 3000L), ((PendingIntent) (obj)));
          goto _L19
_L31:
        obj = new String("update should trigger notification? ");
          goto _L36
_L35:
        if (dfd1 == dfd.e)
        {
            h.a(i, l2, 10, (new byy()).a(403).c(((String) (obj1))).a(((String) (obj))));
        }
        cej.a(g.nS, i, dfd1, true, jhb);
        if ((obj2 instanceof crm) && ((ani) (obj4)).H() && !((crm)obj2).d.equals(((ani) (obj4)).b()))
        {
            cej.b(((Context) (obj3)), i);
        }
          goto _L19
_L10:
        ebw.g("Babel", "could not parse ServerUpdate");
          goto _L4
_L6:
        if (a)
        {
            a("handle OP_TRIGGER_DEFERRED_NOTIFICATION");
        }
        jhb = intent.getStringExtra("message_id");
        intent = intent.getStringExtra("conversation_id");
        cej.a(getApplicationContext(), i, jhb, intent);
          goto _L4
_L33:
        obj1 = "";
        obj = "";
          goto _L37
        obj = "";
          goto _L24
    }

    static 
    {
        hik hik = ebw.n;
        b();
        g.a(g.nS).a(new dkw());
    }
}
