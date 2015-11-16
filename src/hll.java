// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActionBar;
import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;

public final class hll
    implements hma, hnk, hoq, hoy
{

    private final Activity a;
    private gqu b;
    private pu c;
    private hhy d;
    private boolean e;
    private ArrayList f;

    private hll(Activity activity, hof hof1)
    {
        e = true;
        f = new ArrayList();
        a = activity;
        hof1.a(this);
    }

    public hll(pu pu1, hof hof1)
    {
        this(((Activity) (pu1)), hof1);
        c = pu1;
    }

    private boolean a(Activity activity)
    {
        android.content.Intent intent = activity.getParentActivityIntent();
        Object obj = intent;
        if (intent == null)
        {
            obj = intent;
            if (d != null)
            {
                obj = d;
                if (b != null)
                {
                    b.a();
                }
                obj = ((hhy) (obj)).a();
            }
        }
        if (obj != null && activity.shouldUpRecreateTask(((android.content.Intent) (obj))))
        {
            TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(activity);
            activity.onCreateNavigateUpTaskStack(taskstackbuilder);
            activity.onPrepareNavigateUpTaskStack(taskstackbuilder);
            taskstackbuilder.startActivities();
            try
            {
                activity.finishAffinity();
            }
            catch (IllegalStateException illegalstateexception)
            {
                activity.finish();
            }
            return true;
        } else
        {
            return false;
        }
    }

    private boolean a(pu pu1)
    {
        android.content.Intent intent = pu1.s_();
        Object obj = intent;
        if (intent == null)
        {
            obj = intent;
            if (d != null)
            {
                obj = d;
                if (b != null)
                {
                    b.a();
                }
                obj = ((hhy) (obj)).a();
            }
        }
        if (obj != null && pu1.a_(((android.content.Intent) (obj))))
        {
            dv dv1 = dv.a(pu1);
            pu1.a(dv1);
            if (dv1.a() == 0)
            {
                dv1.a(((android.content.Intent) (obj)));
            }
            dv1.b();
            try
            {
                p.a(pu1);
            }
            catch (IllegalStateException illegalstateexception)
            {
                pu1.finish();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        d = (hhy)hlp.b(a, hhy);
        b = (gqu)hlp1.b(gqu);
    }

    public void a(Bundle bundle)
    {
        if (c != null)
        {
            bundle = c.g();
            if (bundle != null)
            {
                bundle.a(e);
            }
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            bundle = a.getActionBar();
            if (bundle != null)
            {
                bundle.setDisplayHomeAsUpEnabled(e);
                return;
            }
        }
    }

    public boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            for (int i = f.size() - 1; i >= 0; i--)
            {
                if (((a)f.get(i)).t())
                {
                    return true;
                }
            }

            if (!hlj.a(a))
            {
                if (c != null)
                {
                    if (a(c))
                    {
                        return true;
                    }
                } else
                if (android.os.Build.VERSION.SDK_INT >= 16 && a(a))
                {
                    return true;
                }
            }
            a.onBackPressed();
            return true;
        } else
        {
            return false;
        }
    }
}
