// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hhx
    implements hjr
{

    final Bundle a;
    final hhw b;

    hhx(hhw hhw1, Bundle bundle)
    {
        b = hhw1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hhi)
        {
            Bundle bundle = hhw.a(b).a(fsn, a);
            ((hhi)fsn).a(b, b.k, bundle);
        }
    }
}
