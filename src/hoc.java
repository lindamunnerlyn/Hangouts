// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hoc
    implements hok
{

    final Bundle a;
    final hny b;

    hoc(hny hny1, Bundle bundle)
    {
        b = hny1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hnv)
        {
            b.a(hoy, a);
            ((hnv)hoy).a();
        }
    }
}
