// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class kup
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final String a;
    private final byte b[];

    kup(kve kve1)
    {
        a = kve1.getClass().getName();
        b = kve1.a();
    }

    protected Object readResolve()
    {
        Object obj;
        try
        {
            obj = (kve)Class.forName(a).getMethod("newMessage", new Class[0]).invoke(null, new Object[0]);
            byte abyte0[] = b;
            ktu.a(abyte0, 0, abyte0.length);
            if (!((kve) (obj)).e())
            {
                throw new RuntimeException("Unable to understand proto buffer");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("Unable to find proto buffer class", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("Unable to find newMessage method", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("Unable to call newMessage method", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("Error calling newMessage", ((InvocationTargetException) (obj)).getCause());
        }
        return obj;
    }
}
