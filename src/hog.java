// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hog
    implements hok
{

    final Bundle a;
    final hof b;

    hog(hof hof1, Bundle bundle)
    {
        b = hof1;
        a = bundle;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hon)
        {
            Bundle bundle = b.a(hoy, a);
            ((hon)hoy).a(bundle);
        }
    }
}
