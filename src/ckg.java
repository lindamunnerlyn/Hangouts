// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceScreen;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;

public final class ckg extends Handler
{

    private ApnSettingsActivity a;

    public ckg(ApnSettingsActivity apnsettingsactivity)
    {
        a = apnsettingsactivity;
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 2: // '\002'
            ApnSettingsActivity.c(a);
            break;
        }
        a.getPreferenceScreen().setEnabled(true);
        ApnSettingsActivity.e();
        a.dismissDialog(1001);
        Toast.makeText(a, a.getResources().getString(l.jc), 0).show();
    }
}
