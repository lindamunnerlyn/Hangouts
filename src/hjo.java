// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class hjo
    implements hma, how, hoy
{

    private hjp a;
    private final joj b = null;
    private hkp c;
    private PreferenceScreen d;
    private boolean e;

    public hjo(hjp hjp1, hof hof1)
    {
        c = null;
        e = false;
        a = hjp1;
        hof1.a(this);
    }

    public hjr a(hjr hjr)
    {
        d.c(hjr);
        return hjr;
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        c = (hkp)hlp1.a(hkp);
    }

    public void k_()
    {
        PreferenceScreen preferencescreen;
        if (c != null)
        {
            preferencescreen = c.b();
        } else
        {
            preferencescreen = (PreferenceScreen)b.a();
        }
        d = preferencescreen;
        if (!e)
        {
            a.a();
        }
        e = true;
    }
}
