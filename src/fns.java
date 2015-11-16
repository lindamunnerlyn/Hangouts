// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.people.accountswitcherview.ExpanderView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class fns
    implements fnw
{

    final SelectedAccountNavigationView a;

    public fns(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        a = selectedaccountnavigationview;
        super();
    }

    public fnv a(View view)
    {
        fnv fnv1 = new fnv();
        fnv1.l = view;
        fnv1.m = view.findViewById(o.j);
        fnv1.p = view.findViewById(o.m);
        fnv1.v = (ImageView)fnv1.p;
        fnv1.q = (TextView)view.findViewById(o.f);
        fnv1.r = (TextView)view.findViewById(o.e);
        fnv1.u = (ImageView)view.findViewById(o.r);
        fnv1.n = (ExpanderView)view.findViewById(o.g);
        fnv1.o = view.findViewById(o.h);
        fnv1.k = view.findViewById(o.A);
        fnv1.I = a.findViewById(o.i);
        if (SelectedAccountNavigationView.g(a))
        {
            fnv1.s = view.findViewById(o.n);
            fnv1.w = (ImageView)view.findViewById(o.o);
            fnv1.t = view.findViewById(o.p);
            fnv1.x = (ImageView)view.findViewById(o.q);
            if (fnv1.w == null && (fnv1.s instanceof ImageView))
            {
                fnv1.w = (ImageView)fnv1.s;
            }
            if (fnv1.x == null && (fnv1.t instanceof ImageView))
            {
                fnv1.x = (ImageView)fnv1.t;
            }
            fnv1.B = view.findViewById(o.x);
            fnv1.F = (ImageView)fnv1.B;
            fnv1.C = (ImageView)view.findViewById(o.y);
            fnv1.y = view.findViewById(o.z);
            fnv1.z = (TextView)view.findViewById(o.w);
            fnv1.A = (TextView)view.findViewById(o.v);
            fnv1.D = view.findViewById(o.s);
            fnv1.G = (ImageView)fnv1.D;
            fnv1.E = view.findViewById(o.t);
            fnv1.H = (ImageView)fnv1.E;
        }
        return fnv1;
    }
}
