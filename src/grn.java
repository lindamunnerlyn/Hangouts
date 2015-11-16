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

public final class grn
    implements gqu, grf, hma, hon, hop, hou, hov, how, hoy
{

    private final Activity a;
    private int b;
    private List c;
    private boolean d;
    private gqz e;
    private boolean f;

    public grn(Activity activity, hof hof1)
    {
        b = -1;
        c = new ArrayList();
        d = true;
        a = activity;
        hof1.a(this);
    }

    public grn(Activity activity, hof hof1, gqz gqz1, gqy gqy)
    {
        b = -1;
        c = new ArrayList();
        d = true;
        g.e(gqy);
        a = activity;
        e = gqz1;
        hof1.a(this);
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

    public void G_()
    {
        f = true;
        e();
    }

    public void H_()
    {
        if (f)
        {
            e();
        }
    }

    public int a()
    {
        g.v();
        return b;
    }

    public gqu a(gqw gqw1)
    {
        c.add(gqw1);
        return this;
    }

    public grn a(hlp hlp1)
    {
        hlp1.a(gqu, this);
        return this;
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        if (e == null)
        {
            e = (gqz)hlp1.a(gqz);
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
                gqw gqw1 = (gqw)iterator.next();
                gqv gqv1 = gqv.a;
                if (b != -1)
                {
                    bundle = gqv.c;
                } else
                {
                    bundle = gqv.b;
                }
                gqw1.a(true, gqv1, bundle, -1, b);
            }
        } else
        {
            b = bundle.getInt("state_account_id");
        }
        f = true;
        e.a(this);
    }

    public void b(Bundle bundle)
    {
        f = false;
        bundle.putInt("state_account_id", b);
    }

    public boolean b()
    {
        g.v();
        return b != -1;
    }

    public grb c()
    {
        g.v();
        return e.a(b);
    }

    public grn d()
    {
        d = false;
        return this;
    }

    public void f_()
    {
        e.b(this);
    }

    public void k_()
    {
        f = true;
        e();
    }
}
