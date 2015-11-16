// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;

public final class fix
{

    private static boolean a = false;

    public static int a(Context context)
    {
        fix;
        JVM INSTR monitorenter ;
        boolean flag;
        g.b(context, "Context is null");
        flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        fix;
        JVM INSTR monitorexit ;
        return i;
_L2:
        context = fms.a(context);
        g.rs = (fja)g.d(context.a());
        context = context.b();
        if (g.rt == null)
        {
            g.rt = (fnb)g.d(context);
        }
        a = true;
        i = 0;
        continue; /* Loop/switch isn't completed */
        context;
        i = ((emm) (context)).a;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw new af(context);
        context;
        fix;
        JVM INSTR monitorexit ;
        throw context;
    }

}
