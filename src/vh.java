// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

public final class vh extends ContextWrapper
{

    private Resources a;

    private vh(Context context)
    {
        super(context);
    }

    public static Context a(Context context)
    {
        Object obj = context;
        if (!(context instanceof vh))
        {
            obj = new vh(context);
        }
        return ((Context) (obj));
    }

    public Resources getResources()
    {
        if (a == null)
        {
            a = new vi(super.getResources(), vk.a(this));
        }
        return a;
    }
}
