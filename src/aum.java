// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class aum extends ContentObserver
{

    final auk a;

    aum(auk auk1, Handler handler)
    {
        a = auk1;
        super(handler);
    }

    public void onChange(boolean flag)
    {
        onChange(flag, null);
    }

    public void onChange(boolean flag, Uri uri)
    {
        auk.b(a);
    }
}
