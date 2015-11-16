// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class dbm
    implements gap
{

    private final Object a = new Object();
    private final Map b = new HashMap();
    private final Context c;
    private final gms d;

    public dbm(Context context)
    {
        c = context;
        d = (gms)hgx.a(context, gms);
    }

    public gal a(int i)
    {
        Object obj1;
        Object obj;
        gal gal1;
        Object obj2;
        if (d.c(i))
        {
            obj = d.a(i).b("account_name");
        } else
        {
            obj = null;
        }
        obj1 = (gal)b.get(Integer.valueOf(i));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        obj2 = a;
        obj2;
        JVM INSTR monitorenter ;
        gal1 = (gal)b.get(Integer.valueOf(i));
        obj1 = gal1;
        if (gal1 != null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj1 = new byz(c, ((String) (obj)), i);
        b.put(Integer.valueOf(i), obj1);
        obj2;
        JVM INSTR monitorexit ;
        return ((gal) (obj1));
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        return ((gal) (obj1));
    }
}
