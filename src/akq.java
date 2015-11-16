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

public final class akq extends cqw
{

    private Button a;
    private ala aj;
    private Button b;
    private int c;
    private boolean d;
    private String e;
    private ProgressBar f;
    private TextView g;
    private TextView h;
    private BroadcastReceiver i;

    public akq()
    {
        super(g.iJ, new int[] {
            h.hn, h.ho
        });
    }

    public static akq a(boolean flag, String s)
    {
        akq akq1 = new akq();
        Bundle bundle = new Bundle();
        bundle.putBoolean("callerid_from_promo_flow", flag);
        bundle.putString("callerid_current_sim_number", s);
        akq1.setArguments(bundle);
        return akq1;
    }

    static void a(akq akq1)
    {
        akq1.aj.a(2247);
        akq1.f.getIndeterminateDrawable().setColorFilter(akq1.getResources().getColor(g.iH), android.graphics.PorterDuff.Mode.SRC_IN);
        akq1.f.bringToFront();
        akq1.f.setVisibility(0);
        akq1.i = new aks(akq1);
        eq.a(akq1.context).a(akq1.i, new IntentFilter("set_callerid_outcome"));
        ((ajl)akq1.binder.b(ajl)).a(akq1.c, true, akq1.e);
    }

    static ProgressBar b(akq akq1)
    {
        return akq1.f;
    }

    static ala c(akq akq1)
    {
        return akq1.aj;
    }

    static TextView d(akq akq1)
    {
        return akq1.g;
    }

    static String e(akq akq1)
    {
        return akq1.e;
    }

    static TextView f(akq akq1)
    {
        return akq1.h;
    }

    static Button g(akq akq1)
    {
        return akq1.b;
    }

    static Button h(akq akq1)
    {
        return akq1.a;
    }

    protected String a()
    {
        return getString(g.jj);
    }

    protected void a(int j)
    {
        hhb hhb1 = context;
        int k = c;
        ((gms)hgx.a(hhb1, gms)).b(k).c("callerid_promo_shown", true).d();
        super.a(j);
    }

    protected void b()
    {
        b.setEnabled(true);
        a.setEnabled(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = ((gmo)binder.a(gmo)).a();
        aj = new ala(context, c);
        d = g.a(c, ebz.g());
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        g = (TextView)layoutinflater.findViewById(h.hm);
        h = (TextView)layoutinflater.findViewById(h.hl);
        e = getArguments().getString("callerid_current_sim_number");
        g.a(h, context, context.getString(g.jh, new Object[] {
            ebz.o(e), g.f("https://www.google.com/support/hangouts/?hl=%locale%", "android_caller_id").toString()
        }));
        a = (Button)layoutinflater.findViewById(h.hn);
        b = (Button)layoutinflater.findViewById(h.ho);
        f = (ProgressBar)layoutinflater.findViewById(h.hi);
        b.setText(g.ja);
        b.setTextColor(layoutinflater.getResources().getColor(g.iG));
        a.setText(g.jd);
        g.a((ImageView)layoutinflater.findViewById(h.hk), context.getResources(), h.hq);
        if (getArguments().getBoolean("callerid_from_promo_flow"))
        {
            aj.a(2252);
            if (d)
            {
                aj.a(2253);
            }
            b.setEnabled(false);
            a.setEnabled(false);
            getActivity().f().b(1, null, new aku(this)).u();
        } else
        {
            a.setText(context.getString(g.jc));
        }
        viewgroup = (Snackbar)layoutinflater.findViewById(h.hp);
        viewgroup.a(context.getString(g.jb, new Object[] {
            ((gmo)binder.a(gmo)).c().b("account_name")
        }));
        viewgroup.setVisibility(0);
        g.setText(context.getString(g.jj, new Object[] {
            ebz.p(e)
        }));
        b.setOnClickListener(new akr(this));
        return layoutinflater;
    }

    public void onPause()
    {
        super.onPause();
        eq.a(context).a(i);
    }
}
