// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class llt
    implements llv
{

    private Method a;

    llt()
    {
        try
        {
            a = Class.forName("android.os.Message").getMethod("setAsynchronous", new Class[] {
                Boolean.TYPE
            });
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            g.a("cr.SysMessageHandler", "Failed to find android.os.Message class", new Object[] {
                classnotfoundexception
            });
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            g.a("cr.SysMessageHandler", "Failed to load Message.setAsynchronous method", new Object[] {
                nosuchmethodexception
            });
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            g.a("cr.SysMessageHandler", "Exception while loading Message.setAsynchronous method", new Object[] {
                runtimeexception
            });
        }
    }

    public void a(Message message, boolean flag)
    {
        if (a == null)
        {
            return;
        }
        try
        {
            a.invoke(message, new Object[] {
                Boolean.valueOf(true)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            g.a("cr.SysMessageHandler", "Illegal access to async message creation, disabling.", new Object[0]);
            a = null;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            g.a("cr.SysMessageHandler", "Illegal argument for async message creation, disabling.", new Object[0]);
            a = null;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            g.a("cr.SysMessageHandler", "Invocation exception during async message creation, disabling.", new Object[0]);
            a = null;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            g.a("cr.SysMessageHandler", "Runtime exception during async message creation, disabling.", new Object[0]);
        }
        a = null;
    }
}
