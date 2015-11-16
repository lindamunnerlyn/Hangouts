// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

final class btb
    implements bwl
{

    final bsz a;

    btb(bsz bsz1)
    {
        a = bsz1;
        super();
    }

    public void a(Activity activity, Bundle bundle)
    {
        int i = ((gqu)hlp.a(activity, gqu)).a();
        if (bsz.a(i))
        {
            activity = (dra)hlp.a(activity, dra);
            long l = activity.f(i);
            bundle.putString("last_call_timestamp_millis", String.valueOf(l));
            if (l != -1L)
            {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(l);
                SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss Z");
                bundle.putString("last_call_timestamp", simpledateformat.format(calendar.getTime()));
                simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
                bundle.putString("last_call_timestamp_utc", simpledateformat.format(calendar.getTime()));
            }
            bundle.putString("last_call_local_session", activity.d(i));
        }
    }
}
