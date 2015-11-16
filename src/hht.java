// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hht
    implements hjr
{

    final Bundle a;
    final hhs b;

    hht(hhs hhs1, Bundle bundle)
    {
        b = hhs1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hhi)
        {
            Bundle bundle = hhs.a(b).a(fsn, a);
            ((hhi)fsn).a(b.ak, b.al, bundle);
        }
    }
}
