// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hmn
    implements hok
{

    final Bundle a;
    final hmm b;

    hmn(hmm hmm1, Bundle bundle)
    {
        b = hmm1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hma)
        {
            Bundle bundle = hmm.a(b).a(hoy, a);
            ((hma)hoy).a(b.context, b.binder, bundle);
        }
    }
}
