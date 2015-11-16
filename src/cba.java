// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.gms.people.accountswitcherview.ExpanderView;

public final class cba
    implements fnw
{

    final NavigationDrawerFragment a;

    public cba(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public fnv a(View view)
    {
        cbe cbe1 = new cbe();
        cbe1.l = view;
        cbe1.m = view.findViewById(h.r);
        cbe1.p = view.findViewById(h.E);
        cbe1.v = (ImageView)cbe1.p.findViewById(h.H);
        cbe1.a = (ImageView)cbe1.p.findViewById(h.fV);
        cbe1.q = (TextView)view.findViewById(h.o);
        cbe1.r = (TextView)view.findViewById(h.n);
        cbe1.u = (ImageView)view.findViewById(h.aG);
        cbe1.n = (ExpanderView)view.findViewById(h.p);
        cbe1.k = view.findViewById(h.fE);
        cbe1.I = view.findViewById(h.q);
        cbe1.s = view.findViewById(h.K);
        cbe1.w = (ImageView)cbe1.s.findViewById(h.H);
        cbe1.c = (ImageView)cbe1.s.findViewById(h.fV);
        cbe1.d = (ImageView)cbe1.s.findViewById(h.I);
        cbe1.t = view.findViewById(h.L);
        cbe1.x = (ImageView)cbe1.t.findViewById(h.H);
        cbe1.g = (ImageView)cbe1.t.findViewById(h.fV);
        cbe1.h = (ImageView)cbe1.t.findViewById(h.I);
        cbe1.B = view.findViewById(h.ei);
        cbe1.F = (ImageView)cbe1.B.findViewById(h.H);
        cbe1.b = (ImageView)cbe1.B.findViewById(h.fV);
        cbe1.C = (ImageView)view.findViewById(h.ej);
        cbe1.y = view.findViewById(h.ek);
        cbe1.z = (TextView)view.findViewById(h.eh);
        cbe1.A = (TextView)view.findViewById(h.eg);
        cbe1.D = view.findViewById(h.aH);
        cbe1.G = (ImageView)cbe1.D.findViewById(h.H);
        cbe1.e = (ImageView)cbe1.D.findViewById(h.fV);
        cbe1.f = (ImageView)cbe1.D.findViewById(h.I);
        cbe1.E = view.findViewById(h.aI);
        cbe1.H = (ImageView)cbe1.E.findViewById(h.H);
        cbe1.i = (ImageView)cbe1.E.findViewById(h.fV);
        cbe1.j = (ImageView)cbe1.E.findViewById(h.I);
        return cbe1;
    }
}
