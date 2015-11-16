// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hmp
    implements hok
{

    final Bundle a;
    final hmo b;

    hmp(hmo hmo1, Bundle bundle)
    {
        b = hmo1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hma)
        {
            Bundle bundle = b.l.a(hoy, a);
            ((hma)hoy).a(b, b.k, bundle);
        }
    }
}
