// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gng
    implements fsn, gmo, hhi, hjt, hka, hkb, hkc
{

    private final Activity a;
    private int b;
    private List c;
    private boolean d;
    private gms e;

    public gng(Activity activity, hjm hjm1)
    {
        b = -1;
        c = new ArrayList();
        d = true;
        a = activity;
        hjm1.a(this);
    }

    private void e()
    {
        boolean flag;
        if (b == -1)
        {
            if (!d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = e.c(b);
        }
        if (!flag)
        {
            if (Log.isLoggable("IntentAccountHandler", 3))
            {
                int i = b;
                String s = String.valueOf(a.getClass().getName());
                (new StringBuilder(String.valueOf(s).length() + 62)).append("Invalid account state with accountId ").append(i).append(" for activity ").append(s);
            }
            b = -1;
            a.finish();
        }
    }

    public void E_()
    {
        e();
    }

    public int a()
    {
        g.w();
        return b;
    }

    public gmo a(gmq gmq1)
    {
        c.add(gmq1);
        return this;
    }

    public gng a(hgx hgx1)
    {
        hgx1.a(gmo, this);
        return this;
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        if (e == null)
        {
            e = (gms)hgx1.a(gms);
        }
    }

    public void a(Bundle bundle)
    {
        if (bundle == null)
        {
            b = a.getIntent().getIntExtra("account_id", -1);
            e();
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                gmq gmq1 = (gmq)iterator.next();
                gmp gmp1 = gmp.a;
                if (b != -1)
                {
                    bundle = gmp.c;
                } else
                {
                    bundle = gmp.b;
                }
                gmq1.a(true, gmp1, bundle, -1, b);
            }
        } else
        {
            b = bundle.getInt("state_account_id");
        }
    }

    public void b(Bundle bundle)
    {
        bundle.putInt("state_account_id", b);
    }

    public boolean b()
    {
        g.w();
        return b != -1;
    }

    public gmu c()
    {
        g.w();
        return e.a(b);
    }

    public gng d()
    {
        d = false;
        return this;
    }

    public void j_()
    {
        e();
    }
}
