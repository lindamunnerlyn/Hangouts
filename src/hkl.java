// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class hkl
    implements hkp, hnv, hnx, hov, hoy
{

    private final hjf a;
    private bg b;
    private hkm c;
    private PreferenceScreen d;

    private hkl(hjf hjf1, hkm hkm1, hof hof1)
    {
        a = hjf1;
        c = (hkm)g.e(hkm1);
        hof1.a(this);
    }

    public hkl(hjf hjf1, hof hof1)
    {
        this(hjf1, (hkm)hjf1, hof1);
    }

    public void a()
    {
        PreferenceScreen preferencescreen = a.b().a(a.a);
        a.a(preferencescreen);
        d = preferencescreen;
    }

    public void a(ad ad)
    {
        b.a(ad, null);
    }

    public void a(View view, Bundle bundle)
    {
        if (bundle == null)
        {
            b = a.getChildFragmentManager().a();
            c.a();
            b.b();
            b = null;
        }
    }

    public PreferenceScreen b()
    {
        if (d == null)
        {
            throw new IllegalStateException("PreferenceScreen cannot be accessed before OnCreateView");
        } else
        {
            return d;
        }
    }

    public void b(Bundle bundle)
    {
    }
}
