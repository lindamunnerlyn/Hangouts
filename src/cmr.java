// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cmr
    implements Runnable
{

    final Context a;

    public cmr(Context context)
    {
        a = context;
        super();
    }

    public void run()
    {
        gdv.b();
        aoa aoa1 = dcn.a(a);
        if (aoa1 == null)
        {
            return;
        }
        try
        {
            if (aoc.a(a, aoa1.h(), "DEBUG_RTCS", 0L) > 0L)
            {
                android.content.Intent intent = DebugActivity.b(a);
                a.startService(intent);
                return;
            }
        }
        catch (grc grc1)
        {
            eev.c("BabelDebugActivity", "account not found starting debug activity", grc1);
        }
        return;
    }
}
