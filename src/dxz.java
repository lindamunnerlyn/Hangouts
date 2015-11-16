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

final class dxz
    implements dxy
{

    final Context a;
    dxv b;
    private final TelecomManager c;

    dxz(Context context, TelecomManager telecommanager)
    {
        a = context;
        c = telecommanager;
    }

    static void a(dxz dxz1, PhoneAccountHandle phoneaccounthandle)
    {
        eev.e("Babel_telephony", "TeleHandoffWifiToCellular.callHandoffNumber");
        dxh dxh1 = dxz1.b.a();
        phoneaccounthandle = new ConnectionRequest(phoneaccounthandle, g.t(dxh1.m()), Bundle.EMPTY);
        TeleConnectionService teleconnectionservice = dxh1.d();
        phoneaccounthandle = teleconnectionservice.createRemoteOutgoingConnection(g.l(teleconnectionservice), phoneaccounthandle);
        if (phoneaccounthandle == null)
        {
            dxz1.b.a(false, 321);
            return;
        } else
        {
            dxz1.b.a(new dyz(dxz1.a, phoneaccounthandle, dxh1.j().e(), dxh1.q(), dxh1.i(), dxh1.g()));
            return;
        }
    }

    static void b(dxz dxz1, PhoneAccountHandle phoneaccounthandle)
    {
        eev.e("Babel_telephony", "TeleHandoffWifiToCellular.prepareForHandoff");
        jhh jhh1 = new jhh();
        jhh1.a = dxz1.b.a().o();
        jhh1.b = dxz1.b.a().q();
        jhh1.p = new jhz();
        jhh1.p.a = new kbm();
        jhh1.p.a.a = g.n(dxz1.a);
        jhh1.p.c = Boolean.valueOf(true);
        jhm jhm1 = new jhm();
        jhm1.c = (new jhh[] {
            jhh1
        });
        ((gdk)bnk.a().o().a(gdk)).b(jhm1, new dyb(dxz1, phoneaccounthandle));
    }

    void a()
    {
        eev.e("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff");
        dxh dxh1 = b.a();
        Object obj;
        String s;
        if (dxh1.g())
        {
            obj = c.getDefaultOutgoingPhoneAccount("tel");
        } else
        {
            obj = dxh1.e().getAccountHandle();
        }
        s = String.valueOf(obj);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 59)).append("TeleHandoffWifiToCellular.startHandoff, got phone account: ").append(s).toString());
        if (obj == null)
        {
            eev.e("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, no phone account.");
            b.a(false, 225);
            return;
        }
        if (!b.f())
        {
            eev.e("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, disallowed by config.");
            b.a(false, 224);
            return;
        }
        if (TextUtils.isEmpty(dxh1.m()))
        {
            eev.e("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, no handoff number");
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
            eev.e("Babel_telephony", ((String) (obj)));
            b.a(false, 227);
            return;
        }
        i = dxh1.d().getAllConnections().size();
        if (i > 1)
        {
            eev.e("Babel_telephony", (new StringBuilder(77)).append("TeleHandoffWifiToCellular.startHandoff, call count: ").append(i).append(", fail handoff").toString());
            b.a(false, 221);
            return;
        } else
        {
            dxb.a(a, new dya(this, ((PhoneAccountHandle) (obj))));
            return;
        }
    }

    void a(dxv dxv1)
    {
        b = dxv1;
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
