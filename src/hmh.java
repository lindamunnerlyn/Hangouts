// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class hmh
{

    private final Context a;
    private final Class b;
    private HashMap c;

    public hmh(Context context, Class class1)
    {
        a = context;
        b = class1;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        c = new HashMap();
        iterator = hlp.c(a, b).iterator();
_L1:
        List list;
        hmg hmg1;
        Class class1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        hmg1 = (hmg)iterator.next();
        class1 = hmg1.a();
        list = (List)c.get(class1);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        obj = new ArrayList();
        c.put(class1, obj);
        ((List) (obj)).add(hmg1);
          goto _L1
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public List a(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        a();
        class1 = (List)c.get(class1);
        this;
        JVM INSTR monitorexit ;
        return class1;
        class1;
        throw class1;
    }
}
