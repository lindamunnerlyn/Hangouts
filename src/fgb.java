// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;

public final class fgb
{

    private static boolean a = false;

    public static int a(Context context)
    {
        fgb;
        JVM INSTR monitorenter ;
        boolean flag;
        h.a(context, "Context is null");
        flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        fgb;
        JVM INSTR monitorexit ;
        return i;
_L2:
        context = fjw.a(context);
        g.rq = (fge)h.a(context.a());
        context = context.b();
        if (g.rr == null)
        {
            g.rr = (fkf)h.a(context);
        }
        a = true;
        i = 0;
        continue; /* Loop/switch isn't completed */
        context;
        i = ((ejl) (context)).a;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw new af(context);
        context;
        fgb;
        JVM INSTR monitorexit ;
        throw context;
    }

}
