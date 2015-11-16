// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.settings.NotificationSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class doo extends hhu
    implements hey
{

    public doo()
    {
        new hex(this, lifecycle);
    }

    public void a()
    {
        hfg hfg1 = new hfg(context);
        PreferenceCategory preferencecategory = hfg1.a(l.ai);
        preferencecategory.c(NotificationSettingsActivity.a(context, lifecycle, hfg1, l.ag, "chat_notification_enabled_key", "chat_notification_sound_key", 2, "chat_notification_vibrate_bool_key"));
        preferencecategory.c(NotificationSettingsActivity.a(context, lifecycle, hfg1, l.tu, "hangouts_notification_enabled_key", "hangout_sound_key", 1, "hangout_vibrate_boolean_key"));
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
    }
}
