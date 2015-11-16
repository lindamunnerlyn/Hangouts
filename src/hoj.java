// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hoj
    implements hok
{

    final Bundle a;
    final hof b;

    hoj(hof hof1, Bundle bundle)
    {
        b = hof1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hov)
        {
            Bundle bundle = new Bundle();
            ((hov)hoy).b(bundle);
            hoy = (String)g.e(hof.b(hoy));
            a.putBundle(hoy, bundle);
        }
    }
}
