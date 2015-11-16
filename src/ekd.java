// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.apps.hangouts.wearable.WearableService;
import java.util.concurrent.TimeUnit;

final class ekd
    implements Runnable
{

    final aqn a;
    final eef b;
    final ekc c;

    ekd(ekc ekc1, aqn aqn1, eef eef1)
    {
        c = ekc1;
        a = aqn1;
        b = eef1;
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
        String s = (String)a.m();
        Object obj = String.valueOf(s);
        fvi fvi1;
        if (((String) (obj)).length() != 0)
        {
            obj = "/hangouts/profiles/".concat(((String) (obj)));
        } else
        {
            obj = new String("/hangouts/profiles/");
        }
        obj = fvp.a(((String) (obj)));
        fvi1 = ((fvp) (obj)).b();
        fvi1.a("10", s);
        fvi1.a("5", g.a(b.e()));
        c.a.d.a(c.a.b, ((fvp) (obj)).c()).a();
    }
}
