// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class coe
    implements ComponentCallbacks2
{

    final coc a;

    coe(coc coc)
    {
        a = coc;
        super();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public void onLowMemory()
    {
        gbi.a.a();
    }

    public void onTrimMemory(int i)
    {
        gbi.a.a(i);
    }
}
