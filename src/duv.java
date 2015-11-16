// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.telecom.ConnectionRequest;
import android.telecom.TelecomManager;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public final class duv
    implements bpu, dux, dvc
{

    private final TelecomManager a;
    private final Collection b = new LinkedList();
    private final Collection c = new LinkedList();

    duv(TelecomManager telecommanager)
    {
        a = telecommanager;
    }

    public static boolean a(ConnectionRequest connectionrequest)
    {
        return duy.a(connectionrequest.getExtras()) != null;
    }

    static int c(Context context, ani ani1)
    {
        alw alw1 = g.a(context);
        if (!g.r(context))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, not allowed by gservices");
            return 1;
        }
        dwz dwz1 = dwz.a(context);
        if (!dwz1.c())
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, wifi calling not enabled");
            return 1;
        }
        if (ani1.h() == dwz1.e())
        {
            return 3;
        }
        if (!g.m(context))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, not connection manager");
            return 1;
        }
        int i = dwz1.b();
        if (ani1.h() != i)
        {
            ebw.e("Babel_telephony", String.format("TeleIncomingWifiCallController.getRegistrationState, account: %s, index: %d, doesn't match calling account index: %d", new Object[] {
                g.b(ani1), Integer.valueOf(ani1.h()), Integer.valueOf(i)
            }));
            return 1;
        }
        if (ani1.X() == 0)
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, voip calling status is unknown");
            return 2;
        }
        if (alw1.a("babel_incoming_wifi_calls_require_google_voice_integration", true) && ebz.c() && !ani1.b(ebz.g()))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, cell phone number doesn't match Google Voice number");
            return 1;
        } else
        {
            return 3;
        }
    }

    public dtz a(TeleConnectionService teleconnectionservice, ConnectionRequest connectionrequest, due due)
    {
        teleconnectionservice = new duz(teleconnectionservice, this, teleconnectionservice, connectionrequest, due);
        c.add(teleconnectionservice);
        return teleconnectionservice.a();
    }

    public void a(duw duw1)
    {
        b.remove(duw1);
    }

    public void a(duz duz1)
    {
        c.remove(duz1);
    }

    public boolean a(Context context, int i, boy boy, int j)
    {
        boolean flag = false;
        j;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 131
    //                   1 138
    //                   2 145
    //                   3 152
    //                   4 159;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        Object obj = (new StringBuilder(18)).append("OTHER: ").append(j).toString();
_L8:
        ebw.e("Babel_telephony", String.format("TeleIncomingWifiCallController.onCancelInvite, hangoutRequest: %s, dismissReason: %s", new Object[] {
            boy, obj
        }));
        obj = b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (((duw)((Iterator) (obj)).next()).a(boy))
            {
                flag = true;
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        obj = "UNKNOWN";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "USER_RESPONDED";
        continue; /* Loop/switch isn't completed */
_L4:
        obj = "USER_KICKED";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "INVITER_CANCELLED";
        continue; /* Loop/switch isn't completed */
_L6:
        obj = "INVITE_TIMEOUT";
        if (true) goto _L8; else goto _L7
_L7:
        if (g.a(context, i, boy))
        {
            flag = true;
        }
        context = c.iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            if (((duz)context.next()).a(boy, j))
            {
                flag = true;
            }
        } while (true);
        return flag;
    }

    public boolean a(Context context, ani ani1)
    {
        return c(context, ani1) == 3;
    }

    public boolean a(Context context, dgw dgw, ani ani1, boy boy, String s, long l)
    {
        Object obj = String.valueOf(boy);
        Object obj1 = g.u(s);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(obj).length() + 92 + String.valueOf(obj1).length())).append("TeleIncomingWifiCallController.onInviteToPhoneNumber, hangoutRequest: ").append(((String) (obj))).append(", inviterPhoneNumber: ").append(((String) (obj1))).toString());
        obj = duh.a(context, ebz.g(s), true, dwn.a(context));
        obj1 = new dvh(context, dvx.a(context));
        ani1 = new duy(boy, s, l, SystemClock.elapsedRealtime(), ((duh) (obj)), ani1.h(), false, ((dvh) (obj1)));
        context = new duw(context, this, a, ani1, false);
        if (context.a())
        {
            b.add(context);
            context.a(dgw);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean b(Context context, ani ani1)
    {
        context = dwz.a(context);
        return ani1.h() != context.e();
    }
}
