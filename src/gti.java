// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class gti
    implements fsn, hjf, hjt, hjx, hka
{

    private View a;
    private TextView b;
    private View c;
    private TextView d;
    private boolean e;
    private boolean f;
    private int g;
    private CharSequence h;
    private android.view.View.OnClickListener i;
    private int j;
    private CharSequence k;
    private boolean l;
    private boolean m;
    private gtl n;
    private final gtk o = new gtk(this);

    public gti(hjm hjm1)
    {
        e = true;
        f = true;
        n = gtl.a;
        hjm1.a(this);
    }

    private static void a(TextView textview, int i1, CharSequence charsequence)
    {
        if (textview == null)
        {
            return;
        }
        if (i1 != 0)
        {
            charsequence = textview.getContext().getString(i1);
        }
        textview.setText(charsequence);
    }

    private void d()
    {
        if (!m || a == null)
        {
            return;
        }
        switch (gtj.a[n.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            if (l)
            {
                o.a();
                return;
            } else
            {
                c();
                return;
            }

        case 2: // '\002'
            o.b();
            if (e)
            {
                c.setVisibility(8);
                a.setVisibility(0);
                b.setVisibility(0);
                return;
            } else
            {
                a.setVisibility(8);
                return;
            }

        case 3: // '\003'
            o.b();
            a.setVisibility(8);
            return;
        }
    }

    public void E_()
    {
        m = true;
        d();
    }

    public void a()
    {
        m = false;
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            l = true;
        }
    }

    public void a(View view, Bundle bundle)
    {
        a = view.findViewById(0x1020004);
        if (a != null)
        {
            b = (TextView)a.findViewById(g.sy);
            b.setOnClickListener(i);
            c = a.findViewById(g.sw);
            d = (TextView)a.findViewById(g.sx);
            if (a != null)
            {
                a(b, g, h);
                a(d, j, k);
            }
        }
    }

    public void a(gtl gtl1)
    {
        n = (gtl)g.d(gtl1);
        d();
    }

    void c()
    {
label0:
        {
            if (m && a != null && n == gtl.a)
            {
                if (!f)
                {
                    break label0;
                }
                b.setVisibility(8);
                a.setVisibility(0);
                c.setVisibility(0);
            }
            return;
        }
        a.setVisibility(8);
    }
}
