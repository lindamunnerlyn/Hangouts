// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.hangouts.settings.SettingsActivity;

public final class cbo extends cbh
{

    public cbo()
    {
    }

    public int a()
    {
        return l.ju;
    }

    public void a(Activity activity)
    {
        g.a(a, 1606);
        ani ani1 = a;
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/settings/SettingsActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", ani1.h());
        activity.startActivity(intent);
    }

    public int b()
    {
        return com.google.android.apps.hangouts.R.drawable.cu;
    }

    public int c()
    {
        return 7;
    }

    public int d()
    {
        return 2;
    }

    public int e()
    {
        return 7;
    }
}
