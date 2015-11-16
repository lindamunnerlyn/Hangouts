// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hmc
    implements hok
{

    final Bundle a;
    final hmb b;

    hmc(hmb hmb1, Bundle bundle)
    {
        b = hmb1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hma)
        {
            Bundle bundle = b.r.a(hoy, a);
            ((hma)hoy).a(b, b.q, bundle);
        }
    }
}
