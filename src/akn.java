// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class akn extends ctg
{

    private Button a;
    private akx aj;
    private Button b;
    private int c;
    private boolean d;
    private String e;
    private ProgressBar f;
    private TextView g;
    private TextView h;
    private BroadcastReceiver i;

    public akn()
    {
        super(g.iB, new int[] {
            h.gT, h.gU
        });
    }

    public static akn a(boolean flag, String s)
    {
        akn akn1 = new akn();
        Bundle bundle = new Bundle();
        bundle.putBoolean("callerid_from_promo_flow", flag);
        bundle.putString("callerid_current_sim_number", s);
        akn1.setArguments(bundle);
        return akn1;
    }

    static void a(akn akn1)
    {
        akn1.aj.a(2247);
        akn1.f.getIndeterminateDrawable().setColorFilter(akn1.getResources().getColor(g.iz), android.graphics.PorterDuff.Mode.SRC_IN);
        akn1.f.bringToFront();
        akn1.f.setVisibility(0);
        akn1.i = new akp(akn1);
        eq.a(akn1.context).a(akn1.i, new IntentFilter("set_callerid_outcome"));
        ((aji)akn1.binder.b(aji)).a(akn1.c, true, akn1.e);
    }

    static ProgressBar b(akn akn1)
    {
        return akn1.f;
    }

    static akx c(akn akn1)
    {
        return akn1.aj;
    }

    static TextView d(akn akn1)
    {
        return akn1.g;
    }

    static String e(akn akn1)
    {
        return akn1.e;
    }

    static TextView f(akn akn1)
    {
        return akn1.h;
    }

    static Button g(akn akn1)
    {
        return akn1.b;
    }

    static Button h(akn akn1)
    {
        return akn1.a;
    }

    protected String a()
    {
        return getString(g.jb);
    }

    protected void a(int j)
    {
        hlt hlt1 = context;
        int k = c;
        ((gqz)hlp.a(hlt1, gqz)).b(k).c("callerid_promo_shown", true).d();
        super.a(j);
    }

    protected void b()
    {
        b.setEnabled(true);
        a.setEnabled(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = ((gqu)binder.a(gqu)).a();
        aj = new akx(context, c);
        d = g.a(c, eey.g());
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        g = (TextView)layoutinflater.findViewById(h.gS);
        h = (TextView)layoutinflater.findViewById(h.gR);
        e = getArguments().getString("callerid_current_sim_number");
        g.a(h, context, context.getString(g.iZ, new Object[] {
            eey.o(e), g.f("https://www.google.com/support/hangouts/?hl=%locale%", "android_caller_id").toString()
        }));
        a = (Button)layoutinflater.findViewById(h.gT);
        b = (Button)layoutinflater.findViewById(h.gU);
        f = (ProgressBar)layoutinflater.findViewById(h.gO);
        b.setText(g.iS);
        b.setTextColor(layoutinflater.getResources().getColor(g.iy));
        a.setText(g.iV);
        g.a((ImageView)layoutinflater.findViewById(h.gQ), context.getResources(), h.gW);
        if (getArguments().getBoolean("callerid_from_promo_flow"))
        {
            aj.a(2252);
            if (d)
            {
                aj.a(2253);
            }
            b.setEnabled(false);
            a.setEnabled(false);
            getActivity().f().b(1, null, new akr(this)).u();
        } else
        {
            a.setText(context.getString(g.iU));
        }
        viewgroup = (Snackbar)layoutinflater.findViewById(h.gV);
        viewgroup.a(context.getString(g.iT, new Object[] {
            ((gqu)binder.a(gqu)).c().b("account_name")
        }));
        viewgroup.setVisibility(0);
        g.setText(context.getString(g.jb, new Object[] {
            eey.p(e)
        }));
        b.setOnClickListener(new ako(this));
        return layoutinflater;
    }

    public void onPause()
    {
        super.onPause();
        eq.a(context).a(i);
    }
}
