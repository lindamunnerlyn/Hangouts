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

public final class dzo
{

    dys a;

    dzo(dys dys1)
    {
        a = dys1;
    }

    public void a()
    {
        if (a != null)
        {
            dys dys1 = a;
            if (!g.a(dys1.a, "babel_remote_connection_allowed", true))
            {
                eev.e("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, remote connection disallowed by gservices");
                dys1.b.setDisconnected(new DisconnectCause(10));
            } else
            {
                Object obj = dys1.b.d();
                obj = ((TeleConnectionService) (obj)).createRemoteOutgoingConnection(g.l(((Context) (obj))), dys1.b.e());
                if (obj == null)
                {
                    eev.g("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, unable to create remote connection");
                    dys1.b.setDisconnected(new DisconnectCause(10));
                } else
                {
                    eev.e("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, starting remote cellular call");
                    dys1.b.a(new dyz(dys1.a, ((android.telecom.RemoteConnection) (obj)), null, null, dys1.b.i(), false));
                }
            }
            dys1.c();
            a = null;
        }
    }

    public void a(aoa aoa1)
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        String s;
        dys dys1;
        bnk bnk1;
        java.util.List list;
        java.util.List list1;
        cfz cfz;
        dys1 = a;
        dys1.b.b(aoa1.a());
        TeleConnectionService teleconnectionservice = dys1.b.d();
        String s1 = dys1.b.f().f();
        s = s1;
        if (eey.c(dys1.b.f().e()))
        {
            s = eey.d(s1);
        }
        s1 = String.valueOf(g.u(s));
        if (s1.length() != 0)
        {
            s1 = "TeleOutgoingCallRequest.startWifiCall, outgoing phone number: ".concat(s1);
        } else
        {
            s1 = new String("TeleOutgoingCallRequest.startWifiCall, outgoing phone number: ");
        }
        eev.e("Babel_telephony", s1);
        cfz = g.a(s, g.o(), false, null, s, 0);
        list = Collections.singletonList(cfz);
        list1 = Collections.emptyList();
        bnk1 = bnk.a();
        if (bnk1.t() && dzr.a(teleconnectionservice))
        {
            dzr.a(teleconnectionservice, dys1.b);
            aoa1 = String.valueOf(dys1.b);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(aoa1).length() + 67)).append("TeleOutgoingCallRequest.startWifiCall, inviting to existing hangout").append(aoa1).toString());
            bnk1.b(list, list1);
            dzw.a(teleconnectionservice, dys1.b);
        } else
        {
label0:
            {
                if (!bnk.a().m())
                {
                    break label0;
                }
                eev.e("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, hangout in progress, cancelling");
                dys1.b();
            }
        }
_L5:
        aoa1 = new dzr(dys1.a, null, null, false);
        dys1.b.a(aoa1);
        aoa1.a(bnk1.s(), boo.a());
        dys1.b.setDialing();
        if (dys1.b.f().n())
        {
            dys1.b.setAddress(dys1.b.f().i().getAddress(), 1);
        }
        dys1.c();
        a = null;
_L2:
        return;
        kbg kbg1;
        Object obj = String.valueOf(dys1.b);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(obj).length() + 61)).append("TeleOutgoingCallRequest.startWifiCall, creating a new hangout").append(((String) (obj))).toString());
        kbg1 = new kbg();
        obj = g.g(dys1.b.d());
        if (obj != null)
        {
            kbg1.d = ((kbh) (obj));
        }
        if (!eey.j(s)) goto _L4; else goto _L3
_L3:
        Object obj1;
        obj1 = (LocationManager)dys1.a.getSystemService("location");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_714;
        }
        Object obj2 = new Criteria();
        ((Criteria) (obj2)).setAccuracy(1);
        obj2 = ((LocationManager) (obj1)).getBestProvider(((Criteria) (obj2)), true);
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            break MISSING_BLOCK_LABEL_714;
        }
        obj2 = ((LocationManager) (obj1)).getLastKnownLocation(((String) (obj2)));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_714;
        }
        obj1 = new kbi();
        obj1.a = Integer.valueOf((int)Math.round(((Location) (obj2)).getLatitude() * 1000000D));
        obj1.b = Integer.valueOf((int)Math.round(((Location) (obj2)).getLongitude() * 1000000D));
        obj1.c = Double.valueOf(((Location) (obj2)).getAccuracy());
_L6:
        if (obj1 != null)
        {
            kbg1.b = ((kbi) (obj1));
        }
        if (dys1.b.u())
        {
            eev.e("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, setting timestamp for emergency LTE call");
            eaj.a(dys1.a).b(System.currentTimeMillis());
        }
_L4:
        bnk1.a((new bpj(aoa1.a(), 1)).i(s).a(), false, list, list1, false, cfz, 85, 1, false, dys1.c, g.a(dys1.b), kbg1, dys1.b.i());
        bnk1.v();
        if (dys1.b.r() != null)
        {
            bnk1.s().g(dys1.b.r().a());
        }
        if (!dys1.b.t())
        {
            bnk1.s().g("tycho_network_auto");
        }
          goto _L5
        obj1 = null;
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
