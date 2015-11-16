// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

final class air extends ain
    implements aio
{

    private volatile boolean a;

    air()
    {
    }

    protected void a(Activity activity)
    {
        a = true;
    }

    public boolean a()
    {
        return a;
    }

    protected void b()
    {
        a = false;
    }
}
