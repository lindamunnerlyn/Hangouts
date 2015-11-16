// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.apps.hangouts.phone.ConversationActivity;
import com.google.android.apps.hangouts.phone.HangoutUrlHandlerActivity;
import com.google.android.apps.hangouts.phone.ShareIntentActivity;
import com.google.android.apps.hangouts.phone.ShowDialerActivity;
import java.util.concurrent.TimeUnit;

public final class dbb extends aiu
{

    private static dbb b = null;
    private final Context a;
    private boolean c;
    private bxi d;
    private gap e;

    public dbb(Context context)
    {
        a = context;
        e = (gap)hgx.a(context, gap);
    }

    protected void a()
    {
        c = true;
    }

    protected void a(Activity activity)
    {
        int i;
        char c1;
        if (activity instanceof BabelHomeActivity)
        {
            if (c)
            {
                i = 2266;
            } else
            {
                i = 2269;
            }
        } else
        if (activity instanceof HangoutUrlHandlerActivity)
        {
            if (c)
            {
                i = 1962;
            } else
            {
                i = 1971;
            }
        } else
        if (activity instanceof ShareIntentActivity)
        {
            if (c)
            {
                i = 1966;
            } else
            {
                i = 1975;
            }
        } else
        if (activity instanceof ShowDialerActivity)
        {
            if (c)
            {
                i = 2267;
            } else
            {
                i = 2270;
            }
        } else
        if (activity instanceof HangoutActivity)
        {
            if (c)
            {
                i = 2268;
            } else
            {
                i = 2271;
            }
        } else
        {
label0:
            {
                if (!(activity instanceof ConversationActivity))
                {
                    break label0;
                }
                activity = activity.getIntent();
                if (activity == null || !activity.getBooleanExtra("reset_chat_notifications", false) || !c)
                {
                    break label0;
                }
                activity = (bxj)hgx.b(a, bxj);
                if (activity != null)
                {
                    d = activity.a(17);
                } else
                {
                    d = null;
                }
                if (d != null)
                {
                    d.a("hangout_launch_remote_notification");
                }
                i = 1963;
            }
        }
_L1:
        g.a(null, i);
        activity = dbf.a(a);
        if (activity != null)
        {
            i = activity.h();
        } else
        {
            i = -1;
        }
        if (dbf.j())
        {
            c1 = '\u0AC0';
        } else
        {
            c1 = '\u0AC1';
        }
        e.a(i).a(c1).a(TimeUnit.DAYS);
        c = false;
        return;
        if (c)
        {
            i = 1967;
        } else
        {
            i = 1976;
        }
          goto _L1
    }

    protected void b()
    {
        g.a(null, 2272);
    }

}
