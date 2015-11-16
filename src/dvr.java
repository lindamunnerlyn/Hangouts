// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public final class dvr extends ejk
{

    private static final int b;
    private String c;
    private Spannable d;
    private final View e;
    private final csw f;
    private final android.view.View.OnClickListener g = new dvs(this);

    public dvr(hof hof, int i, TextView textview, View view)
    {
        super(textview);
        e = view;
        f = new dvt(this, textview.getContext(), hof, i);
    }

    static String a(dvr dvr1)
    {
        return dvr1.c;
    }

    static void a(dvr dvr1, String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        dvr1.d = eep.a(Html.fromHtml(s));
        if (dvr1.e != null)
        {
            eep.a(dvr1.e, true);
            dvr1.e.setOnClickListener(dvr1.g);
        }
_L4:
        dvr1.b();
        return;
_L2:
        dvr1.d = null;
        if (dvr1.e != null)
        {
            eep.a(dvr1.e, false);
            dvr1.e.setOnClickListener(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Spannable b(dvr dvr1)
    {
        return dvr1.d;
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
                eha.a(a.getContext()).a(d, a);
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
        b = cvc.c.j;
    }
}
