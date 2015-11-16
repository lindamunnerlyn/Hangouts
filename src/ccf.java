// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.gms.people.accountswitcherview.ExpanderView;

public final class ccf
    implements fqs
{

    final NavigationDrawerFragment a;

    public ccf(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public fqr a(View view)
    {
        ccj ccj1 = new ccj();
        ccj1.l = view;
        ccj1.m = view.findViewById(h.r);
        ccj1.p = view.findViewById(h.D);
        ccj1.v = (ImageView)ccj1.p.findViewById(h.H);
        ccj1.a = (ImageView)ccj1.p.findViewById(h.fD);
        ccj1.q = (TextView)view.findViewById(h.o);
        ccj1.r = (TextView)view.findViewById(h.n);
        ccj1.u = (ImageView)view.findViewById(h.aB);
        ccj1.n = (ExpanderView)view.findViewById(h.p);
        ccj1.k = view.findViewById(h.fm);
        ccj1.I = view.findViewById(h.q);
        ccj1.s = view.findViewById(h.K);
        ccj1.w = (ImageView)ccj1.s.findViewById(h.H);
        ccj1.c = (ImageView)ccj1.s.findViewById(h.fD);
        ccj1.d = (ImageView)ccj1.s.findViewById(h.I);
        ccj1.t = view.findViewById(h.L);
        ccj1.x = (ImageView)ccj1.t.findViewById(h.H);
        ccj1.g = (ImageView)ccj1.t.findViewById(h.fD);
        ccj1.h = (ImageView)ccj1.t.findViewById(h.I);
        ccj1.B = view.findViewById(h.dQ);
        ccj1.F = (ImageView)ccj1.B.findViewById(h.H);
        ccj1.b = (ImageView)ccj1.B.findViewById(h.fD);
        ccj1.C = (ImageView)view.findViewById(h.dR);
        ccj1.y = view.findViewById(h.dS);
        ccj1.z = (TextView)view.findViewById(h.dP);
        ccj1.A = (TextView)view.findViewById(h.dO);
        ccj1.D = view.findViewById(h.aC);
        ccj1.G = (ImageView)ccj1.D.findViewById(h.H);
        ccj1.e = (ImageView)ccj1.D.findViewById(h.fD);
        ccj1.f = (ImageView)ccj1.D.findViewById(h.I);
        ccj1.E = view.findViewById(h.aD);
        ccj1.H = (ImageView)ccj1.E.findViewById(h.H);
        ccj1.i = (ImageView)ccj1.E.findViewById(h.fD);
        ccj1.j = (ImageView)ccj1.E.findViewById(h.I);
        return ccj1;
    }
}
