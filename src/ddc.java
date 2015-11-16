// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.BackgroundGcmTickleService;
import java.util.Iterator;
import java.util.List;

public final class ddc extends ain
{

    private static final boolean a = false;
    private static ddc b = null;
    private final Context c;

    private ddc(Context context)
    {
        c = context;
    }

    public static ddc a(Context context)
    {
        if (b == null)
        {
            b = new ddc(context);
        }
        return b;
    }

    protected void a(Activity activity)
    {
        if (BackgroundGcmTickleService.a(c))
        {
            if (a)
            {
                eev.b("Babel", "Turn off service alarm for BackgroundGcmTicklerService when the first activity starts");
            }
            BackgroundGcmTickleService.a(c, false);
        }
    }

    protected void b()
    {
        Iterator iterator = ((gqz)hlp.a(c, gqz)).a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!dcz.e(g.a((Integer)iterator.next(), 0)) || BackgroundGcmTickleService.a(c))
            {
                continue;
            }
            if (a)
            {
                eev.b("Babel", "Set service alarm for BackgroundGcmTicklerServicewhen the last activity stops.");
            }
            BackgroundGcmTickleService.a(c, true);
            break;
        } while (true);
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
