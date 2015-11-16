// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Status;

final class gai
    implements eni
{

    final gae a;

    gai(gae gae1)
    {
        a = gae1;
        super();
    }

    public void a(enh enh)
    {
        enh = (Status)enh;
        if (Log.isLoggable("GcoreClearcutLogger", 3))
        {
            enh = String.valueOf(enh);
            (new StringBuilder(String.valueOf(enh).length() + 27)).append("ClearcutLogger log result: ").append(enh);
        }
        a.d.postDelayed(a.e, 10000L);
    }
}
