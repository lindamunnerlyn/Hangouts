// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import java.util.Map;
import java.util.Set;

public final class bpa extends bns
{

    final HangoutFragment a;

    public bpa(HangoutFragment hangoutfragment)
    {
        a = hangoutfragment;
        super();
    }

    public void a()
    {
        HangoutFragment.l(a);
    }

    public void a(bnf bnf)
    {
        int i = g.a((Integer)bne.a.get(bnf), -1);
        if (i != -1)
        {
            g.b(i);
        }
    }

    public void a(gly gly, Set set)
    {
        HangoutFragment.m(a);
        a.a(gly, set);
    }

    public void a(gms gms)
    {
        HangoutFragment.a(a, a.a.s().e());
        int i = ((gqu)HangoutFragment.j(a).a(gqu)).a();
        ((bwz)HangoutFragment.k(a).a(bwz)).a(i, bxa.a);
    }

    public void a(gmu gmu1)
    {
        boz.a[gmu1.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 75
    //                   2 182;
           goto _L1 _L2 _L3
_L1:
        gmu1 = String.valueOf(gmu1.a());
        eev.g("Babel_calls", (new StringBuilder(String.valueOf(gmu1).length() + 39)).append("Error: invalid quality event reported: ").append(gmu1).toString());
        return;
_L2:
        char c;
        char c1 = '\u09AD';
        gmu1 = g.g();
        Object obj = a.a;
        obj = bnk.k();
        c = c1;
        if (!HangoutFragment.n(a))
        {
            c = c1;
            if (obj != null)
            {
                c = c1;
                if (gmu1 != null)
                {
                    c = c1;
                    if (dcz.C(gmu1.h()))
                    {
                        HangoutFragment.o(a);
                        a.a(false);
                        Toast.makeText(a.getActivity(), l.sL, 0).show();
                        ((glj) (obj)).a(false);
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
