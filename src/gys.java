// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.login.settings.LoginSettingsActivity;

public final class gys extends hfz
{

    final LoginSettingsActivity a;

    public gys(LoginSettingsActivity loginsettingsactivity, ps ps, hjm hjm)
    {
        a = loginsettingsactivity;
        super(ps, hjm);
    }

    protected Bundle a(Intent intent)
    {
        return gyt.a(intent);
    }

    protected hfh a()
    {
        return new gyt();
    }
}
