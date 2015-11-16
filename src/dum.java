// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.telecom.Connection;

final class dum
    implements duq
{

    private final Context a;
    private final bof b;
    private final bnd c;
    private dun d;

    dum(Context context, bof bof, bnd bnd1)
    {
        a = context;
        b = bof;
        c = bnd1;
    }

    void a()
    {
        ebw.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff");
        if (!d.f())
        {
            d.a(false, 224);
            return;
        }
        if (c.n())
        {
            ebw.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, wifi call already exists");
            d.a(false, 221);
            return;
        }
        Object obj = d.a();
        int i = d.b();
        if (i != 4)
        {
            obj = String.valueOf(Connection.stateToString(i));
            if (((String) (obj)).length() != 0)
            {
                obj = "TeleHandoffCellularToWifi.isHandoffPossible, not possible for call state: ".concat(((String) (obj)));
            } else
            {
                obj = new String("TeleHandoffCellularToWifi.isHandoffPossible, not possible for call state: ");
            }
            ebw.e("Babel_telephony", ((String) (obj)));
            d.a(false, 227);
            return;
        }
        if (((dtz) (obj)).n() == null)
        {
            ebw.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, no account name");
            d.a(false, 225);
            return;
        }
        if (((dtz) (obj)).o() == null)
        {
            ebw.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, no hangout id");
            d.a(false, 226);
            return;
        }
        if (((dtz) (obj)).getConference() != null)
        {
            ebw.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, in conference");
            d.a(false, 228);
            return;
        }
        if (!g.k(a))
        {
            ebw.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, not connected to wifi");
            d.a(false, 210);
            return;
        }
        ebw.e("Babel_telephony", "TeleHandoffCellularToWifi.createWifiCall");
        obj = d.a();
        boy boy = (new bpa(((dtz) (obj)).n(), 1)).a(2).e(((dtz) (obj)).o()).h(((dtz) (obj)).q()).a();
        jtd jtd1 = new jtd();
        Object obj1 = g.g(((dtz) (obj)).d());
        if (obj1 != null)
        {
            jtd1.d = ((jte) (obj1));
        }
        obj1 = g.a(((dtz) (obj)).f().f(), g.p(), false, null, null, 0);
        c.a(boy, false, null, null, true, ((ceu) (obj1)), 85, 1, false, SystemClock.elapsedRealtime(), g.n(a), jtd1, ((dtz) (obj)).i());
        c.x();
        obj = new dwh(a, null, ((dtz) (obj)).j().e(), ((dtz) (obj)).g());
        ((dwh) (obj)).a(c.t(), b);
        d.a(((dtr) (obj)));
    }

    void a(dun dun1)
    {
        d = dun1;
    }

    public void b()
    {
        if (d.c() == 6)
        {
            d.a(false, 0);
        } else
        {
            if (d.c() == 4 || d.b() == 6)
            {
                d.a(true, 0);
                return;
            }
            if (d.d())
            {
                d.a(false, 304);
                return;
            }
        }
    }
}
