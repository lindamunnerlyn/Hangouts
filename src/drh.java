// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.settings.NotificationSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class drh extends hmm
    implements hjp
{

    public drh()
    {
        new hjo(this, lifecycle);
    }

    public void a()
    {
        hjx hjx1 = new hjx(context);
        PreferenceCategory preferencecategory = hjx1.a(l.af);
        preferencecategory.c(NotificationSettingsActivity.a(context, lifecycle, hjx1, l.ad, "chat_notification_enabled_key", "chat_notification_sound_key", 2, "chat_notification_vibrate_bool_key"));
        preferencecategory.c(NotificationSettingsActivity.a(context, lifecycle, hjx1, l.sM, "hangouts_notification_enabled_key", "hangout_sound_key", 1, "hangout_vibrate_boolean_key"));
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
    }
}
