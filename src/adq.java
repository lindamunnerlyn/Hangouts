// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class adq
{

    private static Method a = null;

    public static String a(String s)
    {
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        Class class1 = Class.forName("android.os.SystemProperties");
        if (class1 != null)
        {
            try
            {
                a = class1.getMethod("get", new Class[] {
                    java/lang/String
                });
            }
            catch (ClassNotFoundException classnotfoundexception) { }
            catch (NoSuchMethodException nosuchmethodexception) { }
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        s = (String)a.invoke(null, new Object[] {
            s
        });
        return s;
        s;
_L2:
        return null;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
