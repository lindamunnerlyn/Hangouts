// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.lang.reflect.Method;

public final class frl
{

    private static final Object a = new Object();
    private static Method b = null;

    public static void a(Context context)
    {
        Context context1;
        h.a(context, "Context must not be null");
        ejn.b(context);
        context1 = ejn.d(context);
        if (context1 == null)
        {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new ejl(8);
        }
        if (true) goto _L2; else goto _L1
_L1:
        context;
        JVM INSTR monitorenter ;
_L2:
        synchronized (a)
        {
            if (b == null)
            {
                b = context1.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[] {
                    android/content/Context
                });
            }
            b.invoke(null, new Object[] {
                context1
            });
        }
        return;
        Exception exception;
        exception;
        Log.e("ProviderInstaller", (new StringBuilder("Failed to install provider: ")).append(exception.getMessage()).toString());
        throw new ejl(8);
        exception1;
        context;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public static void a(Context context, frn frn)
    {
        h.a(context, "Context must not be null");
        h.a(frn, "Listener must not be null");
        h.c("Must be called on the UI thread");
        (new frm(context, frn)).execute(new Void[0]);
    }

}
