// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.util.Log;

public final class hhf
{

    private final gco a;
    private final Uri b;
    private long c;

    public hhf(Context context, Uri uri)
    {
        c = 3000L;
        a = (gco)hlp.a(context, gco);
        b = uri;
    }

    public boolean a()
    {
        hhg hhg1 = new hhg();
        long l = System.currentTimeMillis();
        long l1 = c;
        do
        {
            long l2;
label0:
            {
                if (!hhg1.a())
                {
                    l2 = (l + l1) - System.currentTimeMillis();
                    if (l2 > 0L)
                    {
                        break label0;
                    }
                    if (Log.isLoggable("BlockingPanoDetector", 5))
                    {
                        String s = String.valueOf(b);
                        (new StringBuilder(String.valueOf(s).length() + 56)).append("pano wait time expired, assume image is not a pano; uri=").append(s);
                    }
                }
                return hhg1.b();
            }
            try
            {
                Thread.sleep(Math.min(5L, l2));
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }
}
