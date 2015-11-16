// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.os.Handler;

final class ob extends ContentObserver
{

    final oa a;

    public ob(oa oa1)
    {
        a = oa1;
        super(new Handler());
    }

    public boolean deliverSelfNotifications()
    {
        return true;
    }

    public void onChange(boolean flag)
    {
        a.b();
    }
}
