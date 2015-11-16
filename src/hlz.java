// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hlz
    implements hok
{

    final Bundle a;
    final hly b;

    hlz(hly hly1, Bundle bundle)
    {
        b = hly1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hma)
        {
            Bundle bundle = b.b.a(hoy, a);
            ((hma)hoy).a(b, b.a, bundle);
        }
    }
}
