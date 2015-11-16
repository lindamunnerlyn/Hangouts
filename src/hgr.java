// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;

final class hgr
    implements fsn, hiu
{

    private final Activity a;

    public hgr(Activity activity, hjm hjm1)
    {
        a = activity;
        hjm1.a(this);
    }

    static boolean a(Activity activity)
    {
        boolean flag = false;
        if (activity.getCallingActivity() != null || activity.getIntent().getBooleanExtra("task_launched_for_result", false))
        {
            flag = true;
        }
        return flag;
    }

    public void a(Intent intent)
    {
        if (a(a))
        {
            intent.putExtra("task_launched_for_result", true);
        }
    }
}
