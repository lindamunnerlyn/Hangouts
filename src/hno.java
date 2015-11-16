// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hno
    implements hok
{

    final Bundle a;
    final hnn b;

    hno(hnn hnn1, Bundle bundle)
    {
        b = hnn1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hnk)
        {
            Bundle bundle = b.a(hoy, a);
            ((hnk)hoy).a(bundle);
        }
    }
}
