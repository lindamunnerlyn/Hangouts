// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class crb
    implements Runnable
{

    private final efh a = efh.a("StartupLogger");
    private final Context b;

    public crb(Context context)
    {
        b = context;
    }

    public void run()
    {
        String s1 = a.b("Stats");
        gqz gqz1 = (gqz)hlp.a(b, gqz);
        int j = -1;
        Object obj = gqz1.a().iterator();
        int i;
        do
        {
            i = j;
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Integer integer = (Integer)((Iterator) (obj)).next();
            if (dcn.d(g.a(integer, 0)))
            {
                continue;
            }
            i = g.a(integer, 0);
            break;
        } while (true);
        gcz gcz1 = ((gdd)hlp.a(b, gdd)).a(i);
        jld jld1 = new jld();
        boolean flag;
        if (dcn.j())
        {
            jld1.a = Integer.valueOf(1);
            gcz1.a(2811).a(TimeUnit.DAYS);
        } else
        {
            String s = "";
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                s = android.provider.Telephony.Sms.getDefaultSmsPackage(b);
            }
            if (!TextUtils.isEmpty(s))
            {
                if (s.contains("com.google.android.apps.messaging"))
                {
                    jld1.a = Integer.valueOf(2);
                    gcz1.a(2812).a(TimeUnit.DAYS);
                } else
                {
                    jld1.a = Integer.valueOf(3);
                    gcz1.a(2813).a(TimeUnit.DAYS);
                }
            }
        }
        flag = ((dup)hlp.a(b, dup)).c();
        if (flag)
        {
            j = 2814;
        } else
        {
            j = 2815;
        }
        gcz1.a(j).a(TimeUnit.DAYS);
        jld1.b = Boolean.valueOf(flag);
        flag = dcn.j();
        j = gqz1.a().size();
        jld1.c = Integer.valueOf(3);
        if (j == 1)
        {
            if (flag)
            {
                jld1.c = Integer.valueOf(1);
            }
        } else
        if (j > 1 && flag)
        {
            jld1.c = Integer.valueOf(2);
        }
        obj = (new cab()).a(jld1).a(2001);
        h.a(i, SystemClock.elapsedRealtime(), 10, ((cab) (obj)));
        a.c(s1);
    }
}
