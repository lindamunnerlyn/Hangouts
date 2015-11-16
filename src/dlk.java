// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dlk
{

    private static Object a = new Object();
    private static Map b;
    private static String c;
    private static List d;

    public static List a()
    {
        List list;
        synchronized (a)
        {
            if (d == null)
            {
                c();
            }
            list = d;
        }
        return list;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(String s)
    {
label0:
        {
            synchronized (a)
            {
                if (!TextUtils.equals(s, c))
                {
                    break label0;
                }
            }
            return;
        }
        c = s;
        c();
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static dll b(String s)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b();
            }
            s = (dll)b.get(s);
        }
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static void b()
    {
label0:
        {
            synchronized (a)
            {
                if (b == null)
                {
                    break label0;
                }
            }
            return;
        }
        b = new gz();
        gkv gkv1 = gkv.b();
        String s;
        dll dll1;
        for (Iterator iterator = gkv1.a().iterator(); iterator.hasNext(); b.put(s, dll1))
        {
            s = (String)iterator.next();
            dll1 = new dll(s, Integer.toString(gkv1.e(s)));
        }

        break MISSING_BLOCK_LABEL_96;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    private static void c()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        if (b == null)
        {
            b();
        }
        obj1 = new ArrayList(b.values());
        d = ((List) (obj1));
        Collections.sort(((List) (obj1)), dll.a);
        if (TextUtils.isEmpty(c))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj1 = (dll)b.get(c);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        d.add(0, obj1);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
