// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class hjl
    implements hjr
{

    final Bundle a;
    final View b;
    final hjg c;

    hjl(hjg hjg1, Bundle bundle, View view)
    {
        c = hjg1;
        a = bundle;
        b = view;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hjf)
        {
            Bundle bundle = c.a(fsn, a);
            ((hjf)fsn).a(b, bundle);
        }
    }
}
