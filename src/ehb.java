// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.apps.hangouts.wearable.WearableService;
import java.util.concurrent.TimeUnit;

final class ehb
    implements Runnable
{

    final apw a;
    final ebh b;
    final eha c;

    ehb(eha eha1, apw apw1, ebh ebh1)
    {
        c = eha1;
        a = apw1;
        b = ebh1;
        super();
    }

    public void run()
    {
        c.a.b.a(TimeUnit.MILLISECONDS);
        if (!c.a.b.e())
        {
            Log.e("HangoutsWearableService", "GoogleApiClient failed to connect");
            return;
        }
        String s = (String)a.l();
        Object obj = String.valueOf(s);
        ftc ftc1;
        if (((String) (obj)).length() != 0)
        {
            obj = "/hangouts/profiles/".concat(((String) (obj)));
        } else
        {
            obj = new String("/hangouts/profiles/");
        }
        obj = ftj.a(((String) (obj)));
        ftc1 = ((ftj) (obj)).b();
        ftc1.a("10", s);
        ftc1.a("5", g.a(b.e()));
        c.a.d.a(c.a.b, ((ftj) (obj)).c()).a();
    }
}
