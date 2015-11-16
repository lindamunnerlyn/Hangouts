// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hhv
    implements hjr
{

    final Bundle a;
    final hhu b;

    hhv(hhu hhu1, Bundle bundle)
    {
        b = hhu1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hhi)
        {
            Bundle bundle = hhu.a(b).a(fsn, a);
            ((hhi)fsn).a(b.context, b.binder, bundle);
        }
    }
}
