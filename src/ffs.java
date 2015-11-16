// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

final class ffs
    implements Runnable
{

    final ffr a;

    ffs(ffr ffr1)
    {
        a = ffr1;
        super();
    }

    public void run()
    {
        synchronized (ffr.a(a))
        {
            Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
            intent.setPackage("com.google.android.gms");
            intent.putStringArrayListExtra("PLACE_IDS", ffr.b(a));
            intent.putStringArrayListExtra("METHOD_NAMES", ffr.c(a));
            intent.putExtra("PACKAGE_NAME", ffr.d(a).getPackageName());
            intent.putExtra("CLIENT_VERSION", ejk.a);
            ffr.d(a).sendBroadcast(intent);
            ffr.e(a);
            ffr.f(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
