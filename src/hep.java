// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hep
    implements hjr
{

    final Bundle a;
    final heo b;

    hep(heo heo1, Bundle bundle)
    {
        b = heo1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hhi)
        {
            Bundle bundle = b.c.a(fsn, a);
            ((hhi)fsn).a(b.a, b.b, bundle);
        }
    }
}
