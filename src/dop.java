// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.CustomizeInvitesActivity;

public final class dop extends hhu
    implements hey
{

    private gmo a;

    public dop()
    {
        new hex(this, lifecycle);
    }

    public void a()
    {
        ani ani = dbf.e(a.a());
        hfg hfg1 = new hfg(context);
        if (g.a(ani, apk.c))
        {
            com.google.android.libraries.social.settings.PreferenceCategory preferencecategory = hfg1.a(l.fi);
            Intent intent = new Intent(context, com/google/android/apps/hangouts/settings/CustomizeInvitesActivity);
            intent.putExtra("account_id", a.a());
            hfg1.a(preferencecategory, l.aI, intent);
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
    }
}
