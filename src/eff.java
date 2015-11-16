// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class eff extends efe
{

    private static Method a;
    private static Method b;
    private static Method c;

    eff()
    {
        super((byte)0);
        Class aclass[];
        aclass = new Class[3];
        aclass[0] = Long.TYPE;
        aclass[1] = java/lang/String;
        try
        {
            aclass[2] = Integer.TYPE;
            a = android/os/Trace.getDeclaredMethod("asyncTraceBegin", aclass);
            b = android/os/Trace.getDeclaredMethod("asyncTraceEnd", aclass);
            a.setAccessible(true);
            b.setAccessible(true);
            Method method = android/os/Trace.getDeclaredMethod("traceCounter", aclass);
            c = method;
            method.setAccessible(true);
            return;
        }
        catch (Exception exception)
        {
            eev.e("Babel_Trace", "No async tracer available.", exception);
        }
        return;
    }

    void a(String s, int i)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        a.invoke(null, new Object[] {
            Long.valueOf(4096L), s, Integer.valueOf(i)
        });
        return;
        s;
        return;
        s;
    }

    void b(String s, int i)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        b.invoke(null, new Object[] {
            Long.valueOf(4096L), s, Integer.valueOf(i)
        });
        return;
        s;
        return;
        s;
    }
}
