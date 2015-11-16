// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hjk
    implements hjr
{

    final Bundle a;
    final hjg b;

    hjk(hjg hjg1, Bundle bundle)
    {
        b = hjg1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hjd)
        {
            b.a(fsn, a);
            ((hjd)fsn).b();
        }
    }
}
