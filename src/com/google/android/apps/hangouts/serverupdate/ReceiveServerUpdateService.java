// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.serverupdate;

import amo;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import aoa;
import aoq;
import aow;
import cab;
import cfo;
import cgd;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import cvv;
import dck;
import dcn;
import dcw;
import ddf;
import ddw;
import dgk;
import dgm;
import djt;
import dkl;
import dlc;
import dld;
import dmo;
import dmv;
import dmw;
import dmx;
import dmy;
import dmz;
import dnb;
import dne;
import dnf;
import dng;
import dnl;
import dnn;
import dno;
import dnp;
import dns;
import drj;
import eee;
import eev;
import g;
import gqz;
import grd;
import h;
import hlp;
import java.util.Iterator;
import java.util.List;
import jnv;

public class ReceiveServerUpdateService extends dlc
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
        eev.b("Babel", s);
    }

    public static void a(String s, int i, long l, long l1, jnv jnv)
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/serverupdate/ReceiveServerUpdateService);
        intent.putExtra("op", 1);
        intent.putExtra("account_id", i);
        intent.putExtra("timestamp", l);
        intent.putExtra("gcm_handle_timestamps", l1);
        dmw.a(intent, s);
        intent.putExtra("rqtms", SystemClock.elapsedRealtime());
        if (a || e)
        {
            intent.putExtra("rqtns", System.nanoTime());
        }
        Context context = g.nU;
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
        intent.putExtra("stack_trace", eev.a(new Throwable()));
        if (((dld)hlp.a(context, dld)).a(context, intent, jnv) == null)
        {
            s = String.valueOf(intent);
            eev.g("Babel", (new StringBuilder(String.valueOf(s).length() + 62)).append("ReceiveServerUpdateService failed to start service for intent ").append(s).toString());
            d.release();
        }
        return;
        jnv;
        s;
        JVM INSTR monitorexit ;
        throw jnv;
    }

    private static void b()
    {
        e = g.a(g.nU, "babel_log_dump", false);
    }

    public void a(Intent intent, jnv jnv)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        eev.f("Babel", "ReceiveServerUpdateService onHandleIntent called with null intent");
_L8:
        return;
_L2:
        Object obj;
        dcw dcw1;
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
        obj = dcn.e(i);
        j = intent.getIntExtra("op", 0);
        dcw1 = dcn.g(((aoa) (obj)));
        if (a)
        {
            String s = String.valueOf(intent);
            String s1 = String.valueOf(a(j));
            a((new StringBuilder(String.valueOf(s).length() + 73 + String.valueOf(s1).length())).append("ReceiveServerUpdateService onHandleIntent ").append(s).append(" opCode: ").append(s1).append(" respectWakeLock ").append(flag).toString());
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        j;
        JVM INSTR tableswitch 1 2: default 172
    //                   1 190
    //                   2 1507;
           goto _L4 _L5 _L6
_L4:
        if (!flag) goto _L8; else goto _L7
_L7:
        d.release();
        return;
_L5:
        long l1;
        l1 = SystemClock.elapsedRealtime();
        obj = dmw.a(intent, ((aoa) (obj)), true);
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
        obj2 = (dmw)iterator.next();
        if (obj2 instanceof dmo)
        {
            ((dmo)obj2).a(1);
        }
        l2 = intent.getLongExtra("timestamp", 0L);
        l3 = intent.getLongExtra("gcm_handle_timestamps", 0L);
        obj1 = dcn.e(i);
        if (!eev.a("Babel", 3)) goto _L13; else goto _L12
_L12:
        obj = null;
        Object obj3;
        Object obj4;
        if (obj2 instanceof dmy)
        {
            obj = ((dmy)obj2).c;
        }
        obj3 = String.valueOf(obj2.getClass().getSimpleName());
        obj4 = String.valueOf(((aoa) (obj1)).b());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1561;
        }
        obj = String.valueOf(obj);
        if (((String) (obj)).length() == 0) goto _L15; else goto _L14
_L14:
        obj = "update convId ".concat(((String) (obj)));
_L24:
        eev.c("Babel", (new StringBuilder(String.valueOf(obj3).length() + 32 + String.valueOf(obj4).length() + String.valueOf(obj).length())).append("processServerUpdate: ").append(((String) (obj3))).append(", account: ").append(((String) (obj4))).append(((String) (obj))).toString());
_L13:
        if (!(obj2 instanceof dmx)) goto _L17; else goto _L16
_L16:
        if (((dmx)obj2).a == 1) goto _L19; else goto _L18
_L18:
        if (!a) goto _L21; else goto _L20
_L20:
        obj = String.valueOf(((aoa) (obj1)).a());
        if (((String) (obj)).length() == 0) goto _L23; else goto _L22
_L22:
        obj = "Clearing active client time stamp for account: ".concat(((String) (obj)));
_L25:
        a(((String) (obj)));
_L21:
        djt.a(((aoa) (obj1))).h();
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
            if (!(obj2 instanceof dnn))
            {
                break label0;
            }
            obj = (dnn)obj2;
            if (((dnn) (obj)).b == 1)
            {
                (new aow(this, i)).s(((dnn) (obj)).a);
            }
        }
          goto _L19
        if (!(obj2 instanceof dnp))
        {
            break MISSING_BLOCK_LABEL_633;
        }
        obj = (dnp)obj2;
        if (!((dnp) (obj)).b) goto _L19; else goto _L26
_L26:
        l2 = ((dnp) (obj)).a;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_623;
        }
        ((drj)hlp.a(getApplicationContext(), drj)).a(i, l2);
        RealTimeChatService.b(((aoa) (obj1)), l2);
          goto _L19
label1:
        {
            if (!(obj2 instanceof dns))
            {
                break label1;
            }
            obj = (dns)obj2;
            obj1 = new aow(this, i);
            (new dck(((dns) (obj)))).b(((aow) (obj1)));
        }
          goto _L19
label2:
        {
            if (!(obj2 instanceof dmz))
            {
                break label2;
            }
            obj = (dmz)obj2;
            new dgk();
            obj1 = new aow(this, i);
            (new ddf(((dmz) (obj)))).a(((aow) (obj1)));
        }
          goto _L19
        if (!(obj2 instanceof dnb))
        {
            break MISSING_BLOCK_LABEL_800;
        }
        obj1 = ((dnb)obj2).c;
        obj = String.valueOf(obj1);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_786;
        }
        obj = "ContactsNotification.selfFanoutId == ".concat(((String) (obj)));
_L27:
        a(((String) (obj)));
        if (!cvv.c(((String) (obj1))))
        {
            RealTimeChatService.a(i, true);
        }
          goto _L19
        obj = new String("ContactsNotification.selfFanoutId == ");
          goto _L27
label3:
        {
            if (!(obj2 instanceof dne))
            {
                break label3;
            }
            obj = (dne)obj2;
            obj1 = new aow(this, i);
            (new ddw(((dne) (obj)))).a(((aow) (obj1)));
        }
          goto _L19
label4:
        {
            if (!(obj2 instanceof dnl))
            {
                break label4;
            }
            obj = (dnl)obj2;
            new dgk();
            obj1 = new aow(this, i);
            (new dkl(((dnl) (obj)))).a(((aow) (obj1)));
        }
          goto _L19
label5:
        {
            if (!(obj2 instanceof dno))
            {
                break label5;
            }
            obj = (dno)obj2;
            obj2 = ((gqz)hlp.a(g.nU, gqz)).b(i);
            RealTimeChatService.a(((grd) (obj2)), ((dno) (obj)).a);
            ((grd) (obj2)).d();
            RealTimeChatService.f(((aoa) (obj1)));
        }
          goto _L19
label6:
        {
            if (!(obj2 instanceof dnf))
            {
                break label6;
            }
            RealTimeChatService.a(((aoa) (obj1)), (dnf)obj2);
        }
          goto _L19
        obj3 = getApplicationContext();
        obj4 = dcn.e(i);
        obj = new dgk();
        ((dgk) (obj)).a(((aoa) (obj4)));
        ((dgk) (obj)).b();
        aoq.a(new aow(g.nU, i), ((dmw) (obj2)), ((dgk) (obj)), l2, l3, l1 * 1000L);
        ((dgk) (obj)).e();
        obj1 = ((dgk) (obj)).c();
        if (((List) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_1144;
        }
        if (eev.a("Babel", 3))
        {
            int k = ((List) (obj1)).size();
            String s2 = String.valueOf(obj2.getClass().getSimpleName());
            eev.c("Babel", (new StringBuilder(String.valueOf(s2).length() + 66)).append("processServerUpdate: sending ").append(k).append(" requests from processing ").append(s2).toString());
        }
        if (dcw1 == null)
        {
            break MISSING_BLOCK_LABEL_1144;
        }
        dcw1.a(((java.util.Collection) (obj1)), 0);
        dgm dgm1 = ((dgk) (obj)).g();
        if (!eev.a("Babel", 3)) goto _L29; else goto _L28
_L28:
        obj = String.valueOf(dgm1.toString());
        if (((String) (obj)).length() == 0) goto _L31; else goto _L30
_L30:
        obj = "update should trigger notification? ".concat(((String) (obj)));
_L36:
        eev.c("Babel", ((String) (obj)));
_L29:
        if (!(obj2 instanceof dng)) goto _L33; else goto _L32
_L32:
        obj1 = (dng)obj2;
        obj = ((dng) (obj1)).c;
        obj1 = ((dng) (obj1)).m;
_L37:
        l2 = SystemClock.elapsedRealtime();
        if (dgm1 != dgm.b) goto _L35; else goto _L34
_L34:
        h.a(i, l2, 10, (new cab()).a(453).c(((String) (obj1))).a(((String) (obj))));
        eev.a("Babel", "Scheduling future notification after late push");
        obj2 = (AlarmManager)g.nU.getSystemService("alarm");
        obj3 = new Intent("com.google.android.apps.hangouts.DEFERRED_NOTIFICATION");
        ((Intent) (obj3)).putExtra("op", 2);
        ((Intent) (obj3)).putExtra("account_id", i);
        ((Intent) (obj3)).putExtra("message_id", ((String) (obj1)));
        ((Intent) (obj3)).putExtra("conversation_id", ((String) (obj)));
        int l = eee.a(i, 1, 110, null);
        obj = PendingIntent.getBroadcast(g.nU, l, ((Intent) (obj3)), 0x10000000);
        ((AlarmManager) (obj2)).set(2, SystemClock.elapsedRealtime() + g.a(g.nU, "babel_latenotifdly", 3000L), ((PendingIntent) (obj)));
          goto _L19
_L31:
        obj = new String("update should trigger notification? ");
          goto _L36
_L35:
        if (dgm1 == dgm.e)
        {
            h.a(i, l2, 10, (new cab()).a(403).c(((String) (obj1))).a(((String) (obj))));
        }
        cfo.a(g.nU, i, dgm1, true, jnv);
        if ((obj2 instanceof dmo) && ((aoa) (obj4)).F() && !((dmo)obj2).d.equals(((aoa) (obj4)).b()))
        {
            cfo.b(((Context) (obj3)), i);
        }
          goto _L19
_L10:
        eev.g("Babel", "could not parse ServerUpdate");
          goto _L4
_L6:
        if (a)
        {
            a("handle OP_TRIGGER_DEFERRED_NOTIFICATION");
        }
        jnv = intent.getStringExtra("message_id");
        intent = intent.getStringExtra("conversation_id");
        cfo.a(getApplicationContext(), i, jnv, intent);
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
        hnc hnc = eev.n;
        b();
        g.a(g.nU).a(new dmv());
    }
}
