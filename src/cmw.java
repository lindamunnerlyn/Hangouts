// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

final class cmw
    implements Runnable
{

    final Intent a;
    final cmv b;

    cmw(cmv cmv1, Intent intent)
    {
        b = cmv1;
        a = intent;
        super();
    }

    public void run()
    {
        Intent intent = (Intent)a.clone();
        intent.putExtra("___time", com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.a().format(new Date()));
        com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.a(b.a).add(intent);
        if ((com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.b(b.a) == null || TextUtils.equals(intent.getStringExtra("conversation_id"), com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.b(b.a))) && com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.c(b.a) != null)
        {
            com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.c(b.a).add(intent);
            com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.c(b.a).notifyDataSetChanged();
        }
        do
        {
            if (com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.a(b.a).size() <= 1000)
            {
                break;
            }
            Intent intent1 = (Intent)com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.a(b.a).remove(0);
            if (com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.c(b.a) != null)
            {
                com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.c(b.a).remove(intent1);
            }
        } while (true);
    }
}
