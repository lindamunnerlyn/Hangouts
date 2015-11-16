// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.Window;

final class qy extends qw
{

    qy(Context context, Window window, qq qq)
    {
        super(context, window, qq);
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new qz(this, callback);
    }
}
