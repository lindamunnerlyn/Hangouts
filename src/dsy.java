// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public final class dsy extends egi
{

    private static final int b;
    private String c;
    private Spannable d;
    private final View e;
    private final ebd f;
    private final android.view.View.OnClickListener g = new dsz(this);

    public dsy(hjm hjm, int i, TextView textview, View view)
    {
        super(textview);
        e = view;
        f = new dta(this, hjm, i);
    }

    static String a(dsy dsy1)
    {
        return dsy1.c;
    }

    static void a(dsy dsy1, String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        dsy1.d = ebr.a(Html.fromHtml(s));
        if (dsy1.e != null)
        {
            ebr.a(dsy1.e, true);
            dsy1.e.setOnClickListener(dsy1.g);
        }
_L4:
        dsy1.b();
        return;
_L2:
        dsy1.d = null;
        if (dsy1.e != null)
        {
            ebr.a(dsy1.e, false);
            dsy1.e.setOnClickListener(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Spannable b(dsy dsy1)
    {
        return dsy1.d;
    }

    static int c()
    {
        return b;
    }

    public void a()
    {
        a(((String) (null)), null);
        super.a();
    }

    public void a(String s, String s1)
    {
        c = s;
        f.a(s1);
    }

    protected void b()
    {
        if (f.e() != null)
        {
            int i;
            if (!TextUtils.isEmpty(d))
            {
                i = 0;
            } else
            {
                i = 8;
            }
            if (!TextUtils.isEmpty(d))
            {
                edy.a(a.getContext()).a(d, a);
            }
            a.setVisibility(i);
            a.setText(d);
            return;
        } else
        {
            super.b();
            return;
        }
    }

    static 
    {
        b = csz.c.j;
    }
}
