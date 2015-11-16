// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.CustomizeInvitesActivity;

public final class dri extends hmm
    implements hjp
{

    private gqu a;

    public dri()
    {
        new hjo(this, lifecycle);
    }

    public void a()
    {
        aoa aoa = dcn.e(a.a());
        hjx hjx1 = new hjx(context);
        if (g.a(aoa, aqc.c))
        {
            com.google.android.libraries.social.settings.PreferenceCategory preferencecategory = hjx1.a(l.eR);
            Intent intent = new Intent(context, com/google/android/apps/hangouts/settings/CustomizeInvitesActivity);
            intent.putExtra("account_id", a.a());
            hjx1.a(preferencecategory, l.aD, intent);
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
    }
}
