// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.Window;

class qy extends qx
{

    private boolean v;

    qy(Context context, Window window, qs qs)
    {
        super(context, window, qs);
        v = true;
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new qz(this, callback);
    }

    public boolean l()
    {
        return v;
    }
}
