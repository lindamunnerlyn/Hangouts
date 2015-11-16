// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class dcv
    implements gdd
{

    private final Object a = new Object();
    private final Map b = new HashMap();
    private final Context c;
    private final gqz d;

    public dcv(Context context)
    {
        c = context;
        d = (gqz)hlp.a(context, gqz);
    }

    public gcz a()
    {
        aoa aoa1 = g.g();
        int i;
        if (aoa1 != null)
        {
            i = aoa1.h();
        } else
        {
            i = -1;
        }
        return a(i);
    }

    public gcz a(int i)
    {
        Object obj1;
        Object obj;
        gcz gcz1;
        Object obj2;
        if (d.c(i))
        {
            obj = d.a(i).b("account_name");
        } else
        {
            obj = null;
        }
        obj1 = (gcz)b.get(Integer.valueOf(i));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        obj2 = a;
        obj2;
        JVM INSTR monitorenter ;
        gcz1 = (gcz)b.get(Integer.valueOf(i));
        obj1 = gcz1;
        if (gcz1 != null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj1 = new cac(c, ((String) (obj)), i);
        b.put(Integer.valueOf(i), obj1);
        obj2;
        JVM INSTR monitorexit ;
        return ((gcz) (obj1));
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        return ((gcz) (obj1));
    }
}
