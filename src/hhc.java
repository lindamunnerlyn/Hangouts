// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hhc
{

    private volatile hgx a;
    private final Object b = new Object();
    private final hhd c;
    private final boolean d = false;

    hhc(hhd hhd)
    {
        c = hhd;
    }

    public hgx a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        hhd hhd;
        hgx hgx1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        hgx1 = new hgx(context);
        if (d)
        {
            hgx1.a(hgx.c(context));
        }
        hhd = c;
        if (hhd == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
label0:
        {
            java.util.Set set;
            hhf hhf1;
            try
            {
                hhf1 = (hhf)Class.forName("gen_binder.root.RootModule$Generated").newInstance();
                set = hhf1.a();
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                classnotfoundexception = null;
                break label0;
            }
            try
            {
                hgx1.a(hhf1);
                hhf1.a(hgx1);
            }
            catch (ClassNotFoundException classnotfoundexception1) { }
        }
        hgx1.a(new hgw(context, set));
        a = hgx1;
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
