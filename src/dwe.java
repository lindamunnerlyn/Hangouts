// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.telecom.ConnectionRequest;
import android.telecom.DisconnectCause;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Collections;

public final class dwe
{

    dvj a;

    dwe(dvj dvj1)
    {
        a = dvj1;
    }

    public void a()
    {
        if (a != null)
        {
            dvj dvj1 = a;
            if (!g.a(dvj1.a, "babel_remote_connection_allowed", true))
            {
                ebw.e("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, remote connection disallowed by gservices");
                dvj1.b.setDisconnected(new DisconnectCause(10));
            } else
            {
                Object obj = dvj1.b.d();
                obj = ((TeleConnectionService) (obj)).createRemoteOutgoingConnection(g.l(((Context) (obj))), dvj1.b.e());
                if (obj == null)
                {
                    ebw.g("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, unable to create remote connection");
                    dvj1.b.setDisconnected(new DisconnectCause(10));
                } else
                {
                    ebw.e("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, starting remote cellular call");
                    dvj1.b.a(new dvq(dvj1.a, ((android.telecom.RemoteConnection) (obj)), null, null, dvj1.b.i(), false));
                }
            }
            dvj1.c();
            a = null;
        }
    }

    public void a(ani ani1)
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        String s;
        dvj dvj1;
        bnd bnd1;
        ceu ceu;
        java.util.List list;
        java.util.List list1;
        dvj1 = a;
        dvj1.b.b(ani1.a());
        TeleConnectionService teleconnectionservice = dvj1.b.d();
        String s1 = dvj1.b.f().f();
        s = s1;
        if (ebz.c(dvj1.b.f().e()))
        {
            s = ebz.d(s1);
        }
        s1 = String.valueOf(g.u(s));
        if (s1.length() != 0)
        {
            s1 = "TeleOutgoingCallRequest.startWifiCall, outgoing phone number: ".concat(s1);
        } else
        {
            s1 = new String("TeleOutgoingCallRequest.startWifiCall, outgoing phone number: ");
        }
        ebw.e("Babel_telephony", s1);
        ceu = g.a(s, g.p(), false, null, s, 0);
        list = Collections.singletonList(ceu);
        list1 = Collections.emptyList();
        bnd1 = bnd.a();
        if (bnd1.u() && dwh.a(teleconnectionservice))
        {
            ebw.e("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, inviting to existing hangout");
            bnd1.b(list, list1);
            dwm.a(teleconnectionservice, dvj1.b);
        } else
        {
label0:
            {
                if (!bnd.a().n())
                {
                    break label0;
                }
                ebw.e("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, hangout in progress, cancelling");
                dvj1.b();
            }
        }
_L5:
        ani1 = new dwh(dvj1.a, null, null, false);
        dvj1.b.a(ani1);
        ani1.a(bnd1.t(), bof.a());
        dvj1.b.setDialing();
        if (dvj1.b.f().n())
        {
            dvj1.b.setAddress(dvj1.b.f().i().getAddress(), 1);
        }
        dvj1.c();
        a = null;
_L2:
        return;
        jtd jtd1;
        ebw.e("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, creating a new hangout");
        jtd1 = new jtd();
        jte jte = g.g(dvj1.b.d());
        if (jte != null)
        {
            jtd1.d = jte;
        }
        if (!ebz.j(s)) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = (LocationManager)dvj1.a.getSystemService("location");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_632;
        }
        Object obj1 = new Criteria();
        ((Criteria) (obj1)).setAccuracy(1);
        obj1 = ((LocationManager) (obj)).getBestProvider(((Criteria) (obj1)), true);
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_632;
        }
        obj1 = ((LocationManager) (obj)).getLastKnownLocation(((String) (obj1)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_632;
        }
        obj = new jtf();
        obj.a = Integer.valueOf((int)Math.round(((Location) (obj1)).getLatitude() * 1000000D));
        obj.b = Integer.valueOf((int)Math.round(((Location) (obj1)).getLongitude() * 1000000D));
        obj.c = Double.valueOf(((Location) (obj1)).getAccuracy());
_L6:
        if (obj != null)
        {
            jtd1.b = ((jtf) (obj));
        }
        if (dvj1.b.u())
        {
            ebw.e("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, setting timestamp for emergency LTE call");
            dwz.a(dvj1.a).b(System.currentTimeMillis());
        }
_L4:
        bnd1.a((new bpa(ani1.a(), 1)).i(s).a(), false, list, list1, false, ceu, 85, 1, false, dvj1.c, g.a(dvj1.b), jtd1, dvj1.b.i());
        bnd1.x();
        if (dvj1.b.r() != null)
        {
            bnd1.t().j(dvj1.b.r().a());
        }
        if (!dvj1.b.t())
        {
            bnd1.t().j("tycho_network_auto");
        }
          goto _L5
        obj = null;
          goto _L6
    }

    public void b()
    {
        if (a != null)
        {
            a.b();
            a = null;
        }
    }

    void c()
    {
        a = null;
    }
}
