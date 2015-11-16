// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.login.settings.LoginSettingsActivity;

public final class hdl extends hkq
{

    final LoginSettingsActivity a;

    public hdl(LoginSettingsActivity loginsettingsactivity, pu pu, hof hof)
    {
        a = loginsettingsactivity;
        super(pu, hof);
    }

    protected Bundle a(Intent intent)
    {
        return hdm.a(intent);
    }

    protected hjy a()
    {
        return new hdm();
    }
}
