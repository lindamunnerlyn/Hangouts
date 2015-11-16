// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ConcurrentHashMap;

public final class dlm
    implements dld
{

    eer a;
    ConcurrentHashMap b;

    dlm()
    {
        a = new eer();
        b = new ConcurrentHashMap();
    }

    private void a(Intent intent, boolean flag)
    {
        int i;
label0:
        {
            if (eep.a())
            {
                i = intent.getIntExtra("android.support.content.wakelockid", -1);
                if (!flag)
                {
                    break label0;
                }
                b.putIfAbsent(Integer.valueOf(i), jnw.a(intent, new lnw()));
            }
            return;
        }
        b.remove(Integer.valueOf(i));
    }

    private void a(jnv jnv1)
    {
        if (jnv1.b() && a.c(Integer.valueOf(((Intent)jnv1.c()).getIntExtra("android.support.content.wakelockid", -1))))
        {
            fd.a((Intent)jnv1.c());
            a((Intent)jnv1.c(), false);
        }
    }

    public ComponentName a(Context context, Intent intent, jnv jnv1)
    {
        if (jnv1.b())
        {
            jnv1 = (Intent)jnv1.c();
            n.a(jnv1.hasExtra("android.support.content.wakelockid"));
            boolean flag;
            if (!jnv1.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            n.a(flag);
            intent.putExtra("EXTRA_INTENT_HOLDING_WAKELOCK", jnv1);
            a.a(Integer.valueOf(jnv1.getIntExtra("android.support.content.wakelockid", -1)));
            a(((Intent) (jnv1)), true);
        }
        return context.startService(intent);
    }

    public void a(dlc dlc1, Intent intent)
    {
        jnv jnv1;
        boolean flag = true;
        if (intent == null)
        {
            dlc1.a(null, jmq.a());
            return;
        }
        if (intent.hasExtra("android.support.content.wakelockid"))
        {
            if (intent.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK"))
            {
                flag = false;
            }
            n.a(flag, "Intent was both holding a wakelock and contained an extra intent holding a wakelock");
            jnv1 = jnv.b(intent);
        } else
        if (intent.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK"))
        {
            jnv1 = jnv.b(intent.getParcelableExtra("EXTRA_INTENT_HOLDING_WAKELOCK"));
        } else
        {
            jnv1 = jmq.a();
        }
        if (jnv1.b())
        {
            a.b(Integer.valueOf(((Intent)jnv1.c()).getIntExtra("android.support.content.wakelockid", -1)));
            a((Intent)jnv1.c(), true);
        }
        intent.removeExtra("EXTRA_INTENT_HOLDING_WAKELOCK");
        dlc1.a(intent, jnv1);
        a(jnv1);
        return;
        dlc1;
        a(jnv1);
        throw dlc1;
    }
}
