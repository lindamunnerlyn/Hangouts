// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.people.accountswitcherview.ExpanderView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class fqo
    implements fqs
{

    final SelectedAccountNavigationView a;

    public fqo(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        a = selectedaccountnavigationview;
        super();
    }

    public fqr a(View view)
    {
        fqr fqr1 = new fqr();
        fqr1.l = view;
        fqr1.m = view.findViewById(g.rH);
        fqr1.p = view.findViewById(g.rK);
        fqr1.v = (ImageView)fqr1.p;
        fqr1.q = (TextView)view.findViewById(g.rD);
        fqr1.r = (TextView)view.findViewById(g.rC);
        fqr1.u = (ImageView)view.findViewById(g.rP);
        fqr1.n = (ExpanderView)view.findViewById(g.rE);
        fqr1.o = view.findViewById(g.rF);
        fqr1.k = view.findViewById(g.rY);
        fqr1.I = a.findViewById(g.rG);
        if (a.b)
        {
            fqr1.s = view.findViewById(g.rL);
            fqr1.w = (ImageView)view.findViewById(g.rM);
            fqr1.t = view.findViewById(g.rN);
            fqr1.x = (ImageView)view.findViewById(g.rO);
            if (fqr1.w == null && (fqr1.s instanceof ImageView))
            {
                fqr1.w = (ImageView)fqr1.s;
            }
            if (fqr1.x == null && (fqr1.t instanceof ImageView))
            {
                fqr1.x = (ImageView)fqr1.t;
            }
            fqr1.B = view.findViewById(g.rV);
            fqr1.F = (ImageView)fqr1.B;
            fqr1.C = (ImageView)view.findViewById(g.rW);
            fqr1.y = view.findViewById(g.rX);
            fqr1.z = (TextView)view.findViewById(g.rU);
            fqr1.A = (TextView)view.findViewById(g.rT);
            fqr1.D = view.findViewById(g.rQ);
            fqr1.G = (ImageView)fqr1.D;
            fqr1.E = view.findViewById(g.rR);
            fqr1.H = (ImageView)fqr1.E;
        }
        return fqr1;
    }
}
