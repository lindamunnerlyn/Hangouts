// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hiw
    implements hjr
{

    final Bundle a;
    final hiv b;

    hiw(hiv hiv1, Bundle bundle)
    {
        b = hiv1;
        a = bundle;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof his)
        {
            Bundle bundle = b.a(fsn, a);
            ((his)fsn).a(bundle);
        }
    }
}
