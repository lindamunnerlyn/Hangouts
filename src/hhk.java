// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hhk
    implements hjr
{

    final Bundle a;
    final hhj b;

    hhk(hhj hhj1, Bundle bundle)
    {
        b = hhj1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hhi)
        {
            Bundle bundle = hhj.a(b).a(fsn, a);
            ((hhi)fsn).a(b, b.p, bundle);
        }
    }
}
