// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hhh
    implements hjr
{

    final Bundle a;
    final hhg b;

    hhh(hhg hhg1, Bundle bundle)
    {
        b = hhg1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hhi)
        {
            Bundle bundle = hhg.a(b).a(fsn, a);
            ((hhi)fsn).a(b, b.a, bundle);
        }
    }
}
