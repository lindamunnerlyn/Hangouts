// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hlu
{

    private volatile hlp a;
    private final Object b = new Object();
    private final hlv c;
    private final boolean d = false;

    hlu(hlv hlv)
    {
        c = hlv;
    }

    public hlp a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        hlv hlv;
        hlp hlp1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        hlp1 = new hlp(context);
        if (d)
        {
            hlp1.a(hlp.c(context));
        }
        hlv = c;
        if (hlv == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
label0:
        {
            java.util.Set set;
            hlx hlx1;
            try
            {
                hlx1 = (hlx)Class.forName("gen_binder.root.RootModule$Generated").newInstance();
                set = hlx1.a();
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                classnotfoundexception = null;
                break label0;
            }
            try
            {
                hlp1.a(hlx1);
                hlx1.a(hlp1);
            }
            catch (ClassNotFoundException classnotfoundexception1) { }
        }
        hlp1.a(new hlo(context, set));
        a = hlp1;
        obj;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", context);
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", context);
    }
}
