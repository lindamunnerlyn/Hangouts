// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;

public final class gzm
    implements ComponentCallbacks2
{

    private final Context a;

    gzm(Context context)
    {
        a = context;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public void onLowMemory()
    {
    }

    public void onTrimMemory(int i)
    {
        if (i > 5)
        {
            ((gzl)hlp.a(a, gzl)).k();
        }
    }
}
