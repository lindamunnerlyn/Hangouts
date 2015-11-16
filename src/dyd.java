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

public final class dyd
    implements bqd, dyf, dyk
{

    private final TelecomManager a;
    private final Collection b = new LinkedList();
    private final Collection c = new LinkedList();

    dyd(TelecomManager telecommanager)
    {
        a = telecommanager;
    }

    static int c(Context context, aoa aoa1)
    {
        amo amo1 = g.a(context);
        if (!g.r(context))
        {
            eev.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, not allowed by gservices");
            return 1;
        }
        eaj eaj1 = eaj.a(context);
        if (!eaj1.c())
        {
            eev.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, wifi calling not enabled");
            return 1;
        }
        if (aoa1.h() == eaj1.e())
        {
            return 3;
        }
        if (!g.m(context))
        {
            eev.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, not connection manager");
            return 1;
        }
        int i = eaj1.b();
        if (aoa1.h() != i)
        {
            eev.e("Babel_telephony", String.format("TeleIncomingWifiCallController.getRegistrationState, account: %s, index: %d, doesn't match calling account index: %d", new Object[] {
                g.b(aoa1), Integer.valueOf(aoa1.h()), Integer.valueOf(i)
            }));
            return 1;
        }
        if (aoa1.U() == 0)
        {
            eev.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, voip calling status is unknown");
            return 2;
        }
        if (amo1.a("babel_incoming_wifi_calls_require_google_voice_integration", true) && eey.c() && !aoa1.b(eey.g()))
        {
            eev.e("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, cell phone number doesn't match Google Voice number");
            return 1;
        } else
        {
            return 3;
        }
    }

    public dxh a(TeleConnectionService teleconnectionservice, ConnectionRequest connectionrequest, dxm dxm)
    {
        teleconnectionservice = new dyh(teleconnectionservice, this, teleconnectionservice, connectionrequest, dxm);
        c.add(teleconnectionservice);
        return teleconnectionservice.a();
    }

    public void a(dye dye1)
    {
        b.remove(dye1);
    }

    public void a(dyh dyh1)
    {
        c.remove(dyh1);
    }

    public boolean a(Context context, int i, bph bph, int j)
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
        eev.e("Babel_telephony", String.format("TeleIncomingWifiCallController.onCancelInvite, hangoutRequest: %s, dismissReason: %s", new Object[] {
            bph, obj
        }));
        obj = b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (((dye)((Iterator) (obj)).next()).a(bph))
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
        if (g.a(context, i, bph))
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
            if (((dyh)context.next()).a(bph, j))
            {
                flag = true;
            }
        } while (true);
        return flag;
    }

    public boolean a(Context context, aoa aoa1)
    {
        return c(context, aoa1) == 3;
    }

    public boolean a(Context context, dif dif, aoa aoa1, bph bph, String s, long l)
    {
        Object obj = String.valueOf(bph);
        Object obj1 = String.valueOf(g.u(s));
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(obj).length() + 92 + String.valueOf(obj1).length())).append("TeleIncomingWifiCallController.onInviteToPhoneNumber, hangoutRequest: ").append(((String) (obj))).append(", inviterPhoneNumber: ").append(((String) (obj1))).toString());
        obj = dxp.a(context, eey.g(s), true, dzx.a(context));
        obj1 = new dyq(context, dzg.a(context));
        aoa1 = new dyg(bph, s, l, SystemClock.elapsedRealtime(), ((dxp) (obj)), aoa1.h(), false, ((dyq) (obj1)));
        context = new dye(context, this, a, aoa1, false);
        if (context.a())
        {
            b.add(context);
            context.a(dif);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean b(Context context, aoa aoa1)
    {
        context = eaj.a(context);
        return aoa1.h() != context.e();
    }
}
