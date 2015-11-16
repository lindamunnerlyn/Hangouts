// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public final class cqn extends hhu
{

    private String a;
    private View b;
    private EditText c;
    private TextView d;
    private Button e;
    private gmo f;
    private boolean g;
    private cpt h;

    public cqn()
    {
        b = null;
    }

    static gmo a(cqn cqn1)
    {
        return cqn1.f;
    }

    static cpt b(cqn cqn1)
    {
        return cqn1.h;
    }

    static String c(cqn cqn1)
    {
        return cqn1.a;
    }

    static boolean d(cqn cqn1)
    {
        return cqn1.g;
    }

    static TextView e(cqn cqn1)
    {
        return cqn1.d;
    }

    static Button f(cqn cqn1)
    {
        return cqn1.e;
    }

    protected boolean a(int i)
    {
        String s;
label0:
        {
            if (i == w.l)
            {
                s = c.getText().toString();
                if (s.length() >= 4)
                {
                    break label0;
                }
                e.setVisibility(8);
                d.setVisibility(0);
            }
            return false;
        }
        g.a(dbf.e(f.a()), 2196);
        if (h != null)
        {
            h.a(s);
        }
        return true;
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        f = (gmo)binder.a(gmo);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        g = getArguments().getBoolean("set_discoverability", true);
        a = getArguments().getString("phone_number", "");
        h = (cpt)binder.b(cpt);
        b = layoutinflater.inflate(g.nZ, viewgroup, false);
        c = (EditText)b.findViewById(w.w);
        d = (TextView)b.findViewById(w.u);
        e = (Button)b.findViewById(w.y);
        e.getCompoundDrawables()[0].setAlpha(128);
        e.setOnClickListener(new cqo(this));
        c.addTextChangedListener(new cqp(this));
        c.setOnFocusChangeListener(new cqq(this));
        return b;
    }

    public void onResume()
    {
        c.requestFocus();
        super.onResume();
    }
}
