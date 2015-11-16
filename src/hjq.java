// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hjq
    implements hjr
{

    final Bundle a;
    final hjm b;

    hjq(hjm hjm1, Bundle bundle)
    {
        b = hjm1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hkb)
        {
            Bundle bundle = new Bundle();
            ((hkb)fsn).b(bundle);
            fsn = (String)g.d(hjm.b(fsn));
            a.putBundle(fsn, bundle);
        }
    }
}
