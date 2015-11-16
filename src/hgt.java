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

public final class hgt
    implements fsn, hhi, his, hjw
{

    private final Activity a;
    private gmo b;
    private ps c;
    private hdh d;
    private boolean e;
    private ArrayList f;

    private hgt(Activity activity, hjm hjm1)
    {
        e = true;
        f = new ArrayList();
        a = activity;
        hjm1.a(this);
    }

    public hgt(ps ps1, hjm hjm1)
    {
        this(((Activity) (ps1)), hjm1);
        c = ps1;
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
                obj = ((hdh) (obj)).a();
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

    private boolean a(ps ps1)
    {
        android.content.Intent intent = ps1.r_();
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
                obj = ((hdh) (obj)).a();
            }
        }
        if (obj != null && ps1.a_(((android.content.Intent) (obj))))
        {
            dv dv1 = dv.a(ps1);
            ps1.a(dv1);
            if (dv1.a() == 0)
            {
                dv1.a(((android.content.Intent) (obj)));
            }
            dv1.b();
            try
            {
                p.a(ps1);
            }
            catch (IllegalStateException illegalstateexception)
            {
                ps1.finish();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        d = (hdh)hgx.b(a, hdh);
        b = (gmo)hgx1.b(gmo);
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

            if (!hgr.a(a))
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
