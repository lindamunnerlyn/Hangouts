// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;

final class dyn
    implements Runnable
{

    final Context a;
    private final Handler b = new Handler();

    dyn(Context context)
    {
        a = context.getApplicationContext();
    }

    public void run()
    {
        b.post(new dyo(this));
    }
}
