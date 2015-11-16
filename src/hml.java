// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hml
    implements hok
{

    final Bundle a;
    final hmk b;

    hml(hmk hmk1, Bundle bundle)
    {
        b = hmk1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hma)
        {
            Bundle bundle = hmk.a(b).a(hoy, a);
            ((hma)hoy).a(b.ak, b.al, bundle);
        }
    }
}
