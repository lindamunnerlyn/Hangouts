// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import java.util.Set;

public final class bor extends bnk
{

    final HangoutFragment a;

    public bor(HangoutFragment hangoutfragment)
    {
        a = hangoutfragment;
        super();
    }

    public void a()
    {
        HangoutFragment.l(a);
    }

    public void a(giw giw, Set set)
    {
        HangoutFragment.m(a);
        a.a(giw, set);
    }

    public void a(gjq gjq)
    {
        HangoutFragment.a(a, a.a.t().e());
        int i = ((gmo)HangoutFragment.j(a).a(gmo)).a();
        ((bwg)HangoutFragment.k(a).a(bwg)).a(i, bwh.a);
    }

    public void a(gjs gjs1)
    {
        boq.a[gjs1.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 75
    //                   2 182;
           goto _L1 _L2 _L3
_L1:
        gjs1 = String.valueOf(gjs1.a());
        ebw.g("Babel_calls", (new StringBuilder(String.valueOf(gjs1).length() + 39)).append("Error: invalid quality event reported: ").append(gjs1).toString());
        return;
_L2:
        char c;
        char c1 = '\u09AD';
        gjs1 = g.h();
        Object obj = a.a;
        obj = bnd.l();
        c = c1;
        if (!HangoutFragment.n(a))
        {
            c = c1;
            if (obj != null)
            {
                c = c1;
                if (gjs1 != null)
                {
                    c = c1;
                    if (dbq.A(gjs1.h()))
                    {
                        HangoutFragment.o(a);
                        a.a(false);
                        Toast.makeText(a.getActivity(), l.tt, 1).show();
                        ((gih) (obj)).a(false);
                        c = c1;
                    }
                }
            }
        }
_L5:
        g.b(c);
        return;
_L3:
        c = '\u09AE';
        if (true) goto _L5; else goto _L4
_L4:
    }
}
