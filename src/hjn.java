// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hjn
    implements hjr
{

    final Bundle a;
    final hjm b;

    hjn(hjm hjm1, Bundle bundle)
    {
        b = hjm1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hjt)
        {
            Bundle bundle = b.a(fsn, a);
            ((hjt)fsn).a(bundle);
        }
    }
}
