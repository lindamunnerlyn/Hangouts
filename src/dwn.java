// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;

public final class dwn extends ccm
{

    private static final int f;
    private String g;
    private Spannable h;
    private final csv i = new dwo(this);

    public dwn()
    {
    }

    static void a(dwn dwn1, String s)
    {
        dwn1.a(s);
    }

    private void a(String s)
    {
label0:
        {
            g = s;
            if (g != null)
            {
                s = eep.a(Html.fromHtml(s));
            } else
            {
                s = null;
            }
            h = s;
            if (c != null)
            {
                c.setText(h);
                if (!TextUtils.isEmpty(h))
                {
                    break label0;
                }
                c.setVisibility(8);
            }
            return;
        }
        eha.a(c.getContext()).a(h, c);
        c.setVisibility(0);
    }

    public int a()
    {
        return l.fC;
    }

    public void a(Activity activity)
    {
        g.a(a, 1921);
        int j = a.h();
        String s = g;
        Intent intent = new Intent(activity, com/google/android/apps/hangouts/statusmessage/impl/StatusMessageSettingsActivity);
        intent.putExtra("account_id", j);
        intent.putExtra("status_message", s);
        activity.startActivity(intent);
    }

    public void a(aoa aoa1)
    {
        if (a == null || !a.equals(aoa1))
        {
            a(((String) (null)));
        }
        super.a(aoa1);
    }

    public void a(boolean flag)
    {
        csy csy1 = (csy)hlp.a(g.nU, csy);
        if (flag && a != null && !a.o())
        {
            String s = a.b().a;
            csy1.a(a.h(), s, i, f);
            return;
        } else
        {
            csy1.a(i);
            return;
        }
    }

    public int b()
    {
        return com.google.android.apps.hangouts.R.drawable.cp;
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
        return h;
    }

    public boolean g()
    {
        return a != null && !a.o();
    }

    static 
    {
        f = cvc.c.j;
    }
}
