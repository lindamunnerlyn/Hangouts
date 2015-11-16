// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

final class fio
    implements Runnable
{

    final fin a;

    fio(fin fin1)
    {
        a = fin1;
        super();
    }

    public void run()
    {
        synchronized (fin.a(a))
        {
            Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
            intent.setPackage("com.google.android.gms");
            intent.putStringArrayListExtra("PLACE_IDS", fin.b(a));
            intent.putStringArrayListExtra("METHOD_NAMES", fin.c(a));
            intent.putExtra("PACKAGE_NAME", fin.d(a).getPackageName());
            intent.putExtra("CLIENT_VERSION", eml.a);
            fin.d(a).sendBroadcast(intent);
            fin.e(a);
            fin.f(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
