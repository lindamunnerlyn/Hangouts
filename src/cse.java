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

public final class cse extends hmm
{

    private String a;
    private View b;
    private EditText c;
    private TextView d;
    private Button e;
    private gqu f;
    private boolean g;
    private crk h;

    public cse()
    {
        b = null;
    }

    static gqu a(cse cse1)
    {
        return cse1.f;
    }

    static crk b(cse cse1)
    {
        return cse1.h;
    }

    static String c(cse cse1)
    {
        return cse1.a;
    }

    static boolean d(cse cse1)
    {
        return cse1.g;
    }

    static TextView e(cse cse1)
    {
        return cse1.d;
    }

    static Button f(cse cse1)
    {
        return cse1.e;
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
        g.a(dcn.e(f.a()), 2196);
        if (h != null)
        {
            h.a(s);
        }
        return true;
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        f = (gqu)binder.a(gqu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        g = getArguments().getBoolean("set_discoverability", true);
        a = getArguments().getString("phone_number", "");
        h = (crk)binder.b(crk);
        b = layoutinflater.inflate(g.ob, viewgroup, false);
        c = (EditText)b.findViewById(w.w);
        d = (TextView)b.findViewById(w.u);
        e = (Button)b.findViewById(w.y);
        e.getCompoundDrawables()[0].setAlpha(128);
        e.setOnClickListener(new csf(this));
        c.addTextChangedListener(new csg(this));
        c.setOnFocusChangeListener(new csh(this));
        return b;
    }

    public void onResume()
    {
        c.requestFocus();
        super.onResume();
    }
}
