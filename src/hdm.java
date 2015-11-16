// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class hdm extends hjf
    implements hkm
{

    private final hkl e;

    public hdm()
    {
        e = new hkl(this, c);
    }

    public static Bundle a(Intent intent)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("LoginSettingsFragment.account_view_intent", intent.getParcelableExtra("LoginSettingsFragment.account_view_intent"));
        return bundle;
    }

    public void a()
    {
        Intent intent = null;
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            intent = (Intent)bundle.getParcelable("LoginSettingsFragment.account_view_intent");
        }
        e.a((new hdq()).a(intent).b());
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        b.a(hkp, e);
    }
}
