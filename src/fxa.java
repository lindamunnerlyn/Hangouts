// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

final class fxa extends Thread
{

    final ContentResolver a;

    fxa(String s, ContentResolver contentresolver)
    {
        a = contentresolver;
        super(s);
    }

    public void run()
    {
        Looper.prepare();
        a.registerContentObserver(fwz.a, true, new fxb(this, new Handler(Looper.myLooper())));
        Looper.loop();
    }
}
