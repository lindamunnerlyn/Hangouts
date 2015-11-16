// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.service.NetworkStateReceiver;

final class cov extends cox
{

    final cop a;

    cov(cop cop1)
    {
        a = cop1;
        super(cop1, (byte)0);
    }

    boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (g.a(cop.f(a), "babel_gcm_change_notification", false))
        {
            flag = flag1;
            if (!NetworkStateReceiver.a())
            {
                flag = true;
            }
        }
        return flag;
    }

    dsn b()
    {
        return (new dso(cop.f(a))).a(cop.f(a).getString(l.cl)).a();
    }
}
