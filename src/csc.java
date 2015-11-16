// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public final class csc extends hmm
{

    BroadcastReceiver a;
    private String aj;
    private String b;
    private TextView c;
    private TextView d;
    private View e;
    private View f;
    private Button g;
    private gqu h;
    private View i;

    public csc()
    {
    }

    static String a(csc csc1, String s)
    {
        csc1.aj = s;
        return s;
    }

    private void a()
    {
        e.setVisibility(8);
        if (aj.equals("phone_verification_success"))
        {
            f.setVisibility(0);
            d.setVisibility(8);
            c.setText(getActivity().getString(g.ok, new Object[] {
                gf.a().a(eey.a(b, efb.c), gq.a)
            }));
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                c.setTextAlignment(4);
            }
            return;
        } else
        {
            g.a(dcn.e(h.a()), 2406);
            c.setText(getActivity().getResources().getString(g.oo));
            d.setText(getActivity().getResources().getString(g.on));
            g.setEnabled(true);
            g.setText(getActivity().getResources().getString(g.oc));
            return;
        }
    }

    static void a(csc csc1)
    {
        csc1.a();
    }

    static View b(csc csc1)
    {
        return csc1.i;
    }

    protected void a(int j)
    {
        if (j == w.l)
        {
            ai ai1;
            if (aj.equals("phone_verification_success"))
            {
                g.a(dcn.e(h.a()), 2197);
            } else
            {
                g.a(dcn.e(h.a()), 2284);
            }
            ai1 = getActivity();
            if (ai1 != null)
            {
                ((InputMethodManager)ai1.getSystemService("input_method")).hideSoftInputFromWindow(ai1.findViewById(0x1020002).getWindowToken(), 0);
            }
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        h = (gqu)binder.a(gqu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        b = getArguments().getString("phone_number", "");
        i = layoutinflater.inflate(g.oa, viewgroup, false);
        c = (TextView)i.findViewById(w.z);
        d = (TextView)i.findViewById(w.t);
        e = i.findViewById(w.x);
        f = i.findViewById(w.s);
        g = (Button)getActivity().findViewById(w.k);
        if (bundle == null)
        {
            g.setEnabled(false);
            g.setText("");
            aj = "";
        } else
        {
            aj = bundle.getString("verification_outcome");
            a();
        }
        return i;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("verification_outcome", aj);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        i.setFocusable(true);
        i.setFocusableInTouchMode(true);
        a = new csd(this);
        eq.a(getActivity()).a(a, new IntentFilter("phone_verification_outcome"));
    }

    public void onStop()
    {
        eq.a(getActivity()).a(a);
        super.onStop();
    }
}
