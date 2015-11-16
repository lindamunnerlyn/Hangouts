// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.telecom.Connection;

final class dxu
    implements dxy
{

    private final Context a;
    private final boo b;
    private final bnk c;
    private dxv d;

    dxu(Context context, boo boo, bnk bnk1)
    {
        a = context;
        b = boo;
        c = bnk1;
    }

    void a()
    {
        eev.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff");
        if (!d.f())
        {
            d.a(false, 224);
            return;
        }
        if (c.m())
        {
            eev.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, wifi call already exists");
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
            eev.e("Babel_telephony", ((String) (obj)));
            d.a(false, 227);
            return;
        }
        if (((dxh) (obj)).n() == null)
        {
            eev.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, no account name");
            d.a(false, 225);
            return;
        }
        if (((dxh) (obj)).o() == null)
        {
            eev.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, no hangout id");
            d.a(false, 226);
            return;
        }
        if (((dxh) (obj)).getConference() != null)
        {
            eev.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, in conference");
            d.a(false, 228);
            return;
        }
        if (!g.k(a))
        {
            eev.e("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, not connected to wifi");
            d.a(false, 210);
            return;
        }
        eev.e("Babel_telephony", "TeleHandoffCellularToWifi.createWifiCall");
        obj = d.a();
        bph bph = (new bpj(((dxh) (obj)).n(), 1)).a(2).e(((dxh) (obj)).o()).h(((dxh) (obj)).q()).a();
        kbg kbg1 = new kbg();
        Object obj1 = g.g(((dxh) (obj)).d());
        if (obj1 != null)
        {
            kbg1.d = ((kbh) (obj1));
        }
        obj1 = g.a(((dxh) (obj)).f().f(), g.o(), false, null, null, 0);
        c.a(bph, false, null, null, true, ((cfz) (obj1)), 85, 1, false, SystemClock.elapsedRealtime(), g.n(a), kbg1, ((dxh) (obj)).i());
        c.v();
        obj = new dzr(a, null, ((dxh) (obj)).j().e(), ((dxh) (obj)).g());
        ((dzr) (obj)).a(c.s(), b);
        d.a(((dwz) (obj)));
    }

    void a(dxv dxv1)
    {
        d = dxv1;
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
