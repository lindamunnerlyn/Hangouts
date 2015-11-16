// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;

public final class dti extends cbh
{

    private static final int f;
    private static final ebe g;
    private String h;
    private Spannable i;
    private final ebc j = new dtj(this);

    public dti()
    {
    }

    static void a(dti dti1, String s)
    {
        dti1.a(s);
    }

    private void a(String s)
    {
label0:
        {
            h = s;
            if (h != null)
            {
                s = ebr.a(Html.fromHtml(s));
            } else
            {
                s = null;
            }
            i = s;
            if (c != null)
            {
                c.setText(i);
                if (!TextUtils.isEmpty(i))
                {
                    break label0;
                }
                c.setVisibility(8);
            }
            return;
        }
        edy.a(c.getContext()).a(i, c);
        c.setVisibility(0);
    }

    public int a()
    {
        return l.fT;
    }

    public void a(Activity activity)
    {
        g.a(a, 1921);
        StatusMessageSettingsActivity.a(activity, a.h(), h);
    }

    public void a(ani ani1)
    {
        if (a == null || !a.equals(ani1))
        {
            a(((String) (null)));
        }
        super.a(ani1);
    }

    public void a(boolean flag)
    {
        if (flag && a != null && !a.q())
        {
            String s = a.b().a;
            g.a(a.h(), s, j, f);
            return;
        } else
        {
            g.a(j);
            return;
        }
    }

    public int b()
    {
        return com.google.android.apps.hangouts.R.drawable.cx;
    }

    public int c()
    {
        return 1;
    }

    public int d()
    {
        return 0;
    }

    public int e()
    {
        return 1;
    }

    public CharSequence f()
    {
        return i;
    }

    public boolean g()
    {
        return a != null && !a.q();
    }

    static 
    {
        f = csz.c.j;
        g = ebe.a;
    }
}
