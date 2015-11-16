// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ConcurrentHashMap;

public final class djv
    implements djm
{

    ebt a;
    public ConcurrentHashMap b;

    djv()
    {
        a = new ebt();
        b = new ConcurrentHashMap();
    }

    private void a(Intent intent, boolean flag)
    {
        int i;
label0:
        {
            if (ebr.a())
            {
                i = intent.getIntExtra("android.support.content.wakelockid", -1);
                if (!flag)
                {
                    break label0;
                }
                b.putIfAbsent(Integer.valueOf(i), jhc.a(intent, ldm.a()));
            }
            return;
        }
        b.remove(Integer.valueOf(i));
    }

    private void a(jhb jhb1)
    {
        if (jhb1.b() && a.c(Integer.valueOf(((Intent)jhb1.c()).getIntExtra("android.support.content.wakelockid", -1))))
        {
            fd.a((Intent)jhb1.c());
            a((Intent)jhb1.c(), false);
        }
    }

    public ComponentName a(Context context, Intent intent, jhb jhb1)
    {
        if (jhb1.b())
        {
            jhb1 = (Intent)jhb1.c();
            n.a(jhb1.hasExtra("android.support.content.wakelockid"));
            boolean flag;
            if (!jhb1.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            n.a(flag);
            intent.putExtra("EXTRA_INTENT_HOLDING_WAKELOCK", jhb1);
            a.a(Integer.valueOf(jhb1.getIntExtra("android.support.content.wakelockid", -1)));
            a(((Intent) (jhb1)), true);
        }
        return context.startService(intent);
    }

    public void a(djl djl1, Intent intent)
    {
        jhb jhb1;
        boolean flag = true;
        if (intent == null)
        {
            djl1.a(null, jhb.d());
            return;
        }
        if (intent.hasExtra("android.support.content.wakelockid"))
        {
            if (intent.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK"))
            {
                flag = false;
            }
            n.a(flag, "Intent was both holding a wakelock and contained an extra intent holding a wakelock");
            jhb1 = jhb.b(intent);
        } else
        if (intent.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK"))
        {
            jhb1 = jhb.b(intent.getParcelableExtra("EXTRA_INTENT_HOLDING_WAKELOCK"));
        } else
        {
            jhb1 = jhb.d();
        }
        if (jhb1.b())
        {
            a.b(Integer.valueOf(((Intent)jhb1.c()).getIntExtra("android.support.content.wakelockid", -1)));
            a((Intent)jhb1.c(), true);
        }
        intent.removeExtra("EXTRA_INTENT_HOLDING_WAKELOCK");
        djl1.a(intent, jhb1);
        a(jhb1);
        return;
        djl1;
        a(jhb1);
        throw djl1;
    }
}
