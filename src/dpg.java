// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.AccountSettingsActivity;

public final class dpg extends heo
    implements hfv
{

    private final hfu e;

    public dpg()
    {
        e = new hfu(this, c);
    }

    public void a()
    {
        e.a(new dpj());
        Intent intent = new Intent(a, com/google/android/apps/hangouts/settings/AccountSettingsActivity);
        e.a((new gyx()).a().a(intent).a((new gwn()).a("logged_in").b("sms_only")).b());
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        b.a(hfy, e);
    }
}
