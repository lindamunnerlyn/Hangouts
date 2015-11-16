// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hjg
    implements hok
{

    final Bundle a;
    final hjf b;

    hjg(hjf hjf1, Bundle bundle)
    {
        b = hjf1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hma)
        {
            Bundle bundle = b.c.a(hoy, a);
            ((hma)hoy).a(b.a, b.b, bundle);
        }
    }
}
