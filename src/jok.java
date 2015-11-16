// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Method;

public final class jok
{

    private static final Object a;
    private static final Method b;
    private static final Method c;

    private static Object a()
    {
        Object obj;
        try
        {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return obj;
    }

    public static RuntimeException a(Throwable throwable)
    {
        b((Throwable)n.b(throwable));
        throw new RuntimeException(throwable);
    }

    private static transient Method a(String s, Class aclass[])
    {
        try
        {
            s = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static void a(Throwable throwable, Class class1)
    {
        b(throwable, class1);
        b(throwable);
    }

    private static void b(Throwable throwable)
    {
        b(throwable, java/lang/Error);
        b(throwable, java/lang/RuntimeException);
    }

    private static void b(Throwable throwable, Class class1)
    {
        if (throwable != null && class1.isInstance(throwable))
        {
            throw (Throwable)class1.cast(throwable);
        } else
        {
            return;
        }
    }

    static 
    {
        Object obj1 = null;
        Object obj = a();
        a = obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = a("getStackTraceElement", new Class[] {
                java/lang/Throwable, Integer.TYPE
            });
        }
        b = ((Method) (obj));
        if (a == null)
        {
            obj = obj1;
        } else
        {
            obj = a("getStackTraceDepth", new Class[] {
                java/lang/Throwable
            });
        }
        c = ((Method) (obj));
    }
}
