// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.lang.reflect.Method;

public final class hky
{

    private static final Method a;
    private static final Method b;
    private static final Method c;

    public static long a(String s)
    {
        long l;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        l = ((Long)c.invoke(null, new Object[] {
            s, Long.valueOf(100L)
        })).longValue();
        return l;
        s;
        Log.e("SystemProperties", "get error", s);
        return 100L;
    }

    static 
    {
        Method method;
        Object obj1;
        obj1 = Class.forName("android.os.SystemProperties");
        method = ((Class) (obj1)).getMethod("get", new Class[] {
            java/lang/String, java/lang/String
        });
        Exception exception1;
        Object obj;
        Exception exception;
        Method method1;
        Method method2;
        try
        {
            obj = ((Class) (obj1)).getMethod("getInt", new Class[] {
                java/lang/String, Integer.TYPE
            });
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1)
        {
            exception = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            method2 = null;
            continue; /* Loop/switch isn't completed */
        }
        method2 = ((Method) (obj));
        method1 = method;
        obj1 = ((Class) (obj1)).getMethod("getLong", new Class[] {
            java/lang/String, Long.TYPE
        });
        a = method;
        b = ((Method) (obj));
        c = ((Method) (obj1));
        return;
        exception1;
        obj = null;
        method = null;
_L4:
        method2 = ((Method) (obj));
        method1 = method;
        exception1.printStackTrace();
        a = method;
        b = ((Method) (obj));
        c = null;
        return;
        exception;
        method2 = null;
        method = null;
_L2:
        a = method;
        b = method2;
        c = null;
        throw exception;
        exception;
        method = method1;
        if (true) goto _L2; else goto _L1
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
