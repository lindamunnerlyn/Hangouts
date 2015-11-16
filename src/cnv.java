// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import com.google.android.apps.hangouts.phone.GooglePlusUpgradeActivity;

public final class cnv
    implements android.view.View.OnClickListener
{

    final GooglePlusUpgradeActivity a;

    public cnv(GooglePlusUpgradeActivity googleplusupgradeactivity)
    {
        a = googleplusupgradeactivity;
        super();
    }

    public void onClick(View view)
    {
        if (view == GooglePlusUpgradeActivity.a(a))
        {
            GooglePlusUpgradeActivity.b(a);
        } else
        if (view == GooglePlusUpgradeActivity.c(a))
        {
            view = new Intent();
            a.setResult(0, view);
            a.finish();
            return;
        }
    }
}
