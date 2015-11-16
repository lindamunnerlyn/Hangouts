// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class hex
    implements fsn, hhi, hjd, hkc
{

    private final hey a;
    private hfy b;
    private PreferenceScreen c;
    private boolean d;

    public hex(hey hey1, hjm hjm1)
    {
        d = false;
        a = hey1;
        hjm1.a(this);
    }

    public hfa a(hfa hfa)
    {
        c.c(hfa);
        return hfa;
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        b = (hfy)hgx1.a(hfy);
    }

    public void b()
    {
        c = b.a();
    }

    public void j_()
    {
        if (!d)
        {
            a.a();
        }
        d = true;
    }
}
