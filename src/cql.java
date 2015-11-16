// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.service.GcmStateReceiver;

final class cql extends cqn
{

    final cqf a;

    cql(cqf cqf1)
    {
        a = cqf1;
        super(cqf1, (byte)0);
    }

    boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (g.a(cqf.f(a), "babel_gcm_change_notification", false))
        {
            flag = flag1;
            if (!GcmStateReceiver.a)
            {
                flag = true;
            }
        }
        return flag;
    }

    dvg b()
    {
        return (new dvh(cqf.f(a))).a(cqf.f(a).getString(l.cc)).a();
    }
}
