// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class hod
    implements hok
{

    final Bundle a;
    final View b;
    final hny c;

    hod(hny hny1, Bundle bundle, View view)
    {
        c = hny1;
        a = bundle;
        b = view;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hnx)
        {
            Bundle bundle = c.a(hoy, a);
            ((hnx)hoy).a(b, bundle);
        }
    }
}
