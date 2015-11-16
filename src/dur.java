// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Collection;

final class dur
    implements duq
{

    final Context a;
    dun b;
    private final TelecomManager c;

    dur(Context context, TelecomManager telecommanager)
    {
        a = context;
        c = telecommanager;
    }

    static void a(dur dur1, PhoneAccountHandle phoneaccounthandle)
    {
        ebw.e("Babel_telephony", "TeleHandoffWifiToCellular.callHandoffNumber");
        dtz dtz1 = dur1.b.a();
        phoneaccounthandle = new ConnectionRequest(phoneaccounthandle, g.t(dtz1.m()), Bundle.EMPTY);
        TeleConnectionService teleconnectionservice = dtz1.d();
        phoneaccounthandle = teleconnectionservice.createRemoteOutgoingConnection(g.l(teleconnectionservice), phoneaccounthandle);
        if (phoneaccounthandle == null)
        {
            dur1.b.a(false, 321);
            return;
        } else
        {
            dur1.b.a(new dvq(dur1.a, phoneaccounthandle, dtz1.j().e(), dtz1.q(), dtz1.i(), dtz1.g()));
            return;
        }
    }

    static void b(dur dur1, PhoneAccountHandle phoneaccounthandle)
    {
        ebw.e("Babel_telephony", "TeleHandoffWifiToCellular.prepareForHandoff");
        jba jba1 = new jba();
        jba1.a = dur1.b.a().o();
        jba1.b = dur1.b.a().q();
        jba1.p = new jbq();
        jba1.p.a = new jtj();
        jba1.p.a.a = g.n(dur1.a);
        jba1.p.c = Boolean.valueOf(true);
        jbf jbf1 = new jbf();
        jbf1.c = (new jba[] {
            jba1
        });
        ((gaw)bnd.a().p().a(gaw)).b(jbf1, new dut(dur1, phoneaccounthandle));
    }

    void a()
    {
        ebw.e("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff");
        dtz dtz1 = b.a();
        Object obj;
        String s;
        if (dtz1.g())
        {
            obj = c.getDefaultOutgoingPhoneAccount("tel");
        } else
        {
            obj = dtz1.e().getAccountHandle();
        }
        s = String.valueOf(obj);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 59)).append("TeleHandoffWifiToCellular.startHandoff, got phone account: ").append(s).toString());
        if (obj == null)
        {
            ebw.e("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, no phone account.");
            b.a(false, 225);
            return;
        }
        if (!b.f())
        {
            ebw.e("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, disallowed by config.");
            b.a(false, 224);
            return;
        }
        if (TextUtils.isEmpty(dtz1.m()))
        {
            ebw.e("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, no handoff number");
            b.a(false, 320);
            return;
        }
        int i = b.b();
        if (i != 3 && i != 4)
        {
            obj = String.valueOf(Connection.stateToString(i));
            if (((String) (obj)).length() != 0)
            {
                obj = "TeleHandoffWifiToCellular.startHandoff, not possible for call state: ".concat(((String) (obj)));
            } else
            {
                obj = new String("TeleHandoffWifiToCellular.startHandoff, not possible for call state: ");
            }
            ebw.e("Babel_telephony", ((String) (obj)));
            b.a(false, 227);
            return;
        }
        i = dtz1.d().getAllConnections().size();
        if (i > 1)
        {
            ebw.e("Babel_telephony", (new StringBuilder(77)).append("TeleHandoffWifiToCellular.startHandoff, call count: ").append(i).append(", fail handoff").toString());
            b.a(false, 221);
            return;
        } else
        {
            dtt.a(a, new dus(this, ((PhoneAccountHandle) (obj))));
            return;
        }
    }

    void a(dun dun1)
    {
        b = dun1;
    }

    public void b()
    {
        if (b.b() == 6)
        {
            b.a(true, 0);
        } else
        {
            if (b.c() == 6)
            {
                b.a(false, 0);
                return;
            }
            if (b.d())
            {
                b.a(false, 304);
                return;
            }
        }
    }
}
