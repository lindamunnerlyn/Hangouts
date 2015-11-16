// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class hfu
    implements fsn, hfy, hjd, hjf, hkb
{

    private final heo a;
    private bg b;
    private hfv c;
    private PreferenceScreen d;

    private hfu(heo heo1, hfv hfv1, hjm hjm1)
    {
        a = heo1;
        c = (hfv)g.d(hfv1);
        hjm1.a(this);
    }

    public hfu(heo heo1, hjm hjm1)
    {
        this(heo1, (hfv)heo1, hjm1);
    }

    public PreferenceScreen a()
    {
        if (d == null)
        {
            throw new IllegalStateException("PreferenceScreen cannot be accessed before OnCreateView");
        } else
        {
            return d;
        }
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

    public void b()
    {
        PreferenceScreen preferencescreen = a.b().a(a.a);
        a.a(preferencescreen);
        d = preferencescreen;
    }

    public void b(Bundle bundle)
    {
    }
}
