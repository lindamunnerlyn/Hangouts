// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;
import java.util.concurrent.TimeUnit;

public final class dth extends bgg
{

    final StatusMessageSettingsFragment d;
    private final Context e;
    private final String f;

    public dth(StatusMessageSettingsFragment statusmessagesettingsfragment, Context context, String s)
    {
        d = statusmessagesettingsfragment;
        super();
        e = context;
        f = s;
    }

    private void k()
    {
        Intent intent = new Intent(e, com/google/android/apps/hangouts/requestwriter/RequestWriter);
        intent.putExtra("cancel_class", e().getName());
        intent.putExtra("cancel_request", f);
        e.startService(intent);
    }

    public String a()
    {
        return e.getString(l.th);
    }

    public int b()
    {
        return RealTimeChatService.e(StatusMessageSettingsFragment.b(d), f);
    }

    public void c()
    {
        k();
        Toast.makeText(e, l.kS, 0).show();
    }

    public void d()
    {
        ebe.a.a(StatusMessageSettingsFragment.b(d).h(), StatusMessageSettingsFragment.b(d).b().a, csz.c, f);
        StatusMessageSettingsFragment.c(d);
    }

    public Class e()
    {
        return cvd;
    }

    public Class f()
    {
        return cyg;
    }

    public void h()
    {
        k();
        super.h();
    }

    protected int i()
    {
        return (int)TimeUnit.SECONDS.toMillis(3L);
    }
}
