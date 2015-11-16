// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.Window;

class qw extends qv
{

    private boolean v;

    qw(Context context, Window window, qq qq)
    {
        super(context, window, qq);
        v = true;
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new qx(this, callback);
    }

    public boolean l()
    {
        return v;
    }
}
