// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.AccountSettingsActivity;

public final class drz extends hjf
    implements hkm
{

    private final hkl e;

    public drz()
    {
        e = new hkl(this, c);
    }

    public void a()
    {
        e.a(new dsc());
        Intent intent = new Intent(a, com/google/android/apps/hangouts/settings/AccountSettingsActivity);
        e.a((new hdq()).a().a(intent).a((new hax()).a("logged_in").b("sms_only")).b());
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        b.a(hkp, e);
    }
}
