// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;

public class fms
{

    private static Context a;
    private static fkh b;

    public fms()
    {
    }

    public static fkh a(Context context)
    {
        g.d(context);
        if (b != null)
        {
            return b;
        }
        int i = emo.a(context);
        switch (i)
        {
        default:
            throw new emm(i);

        case 0: // '\0'
            fms.getSimpleName();
            break;
        }
        Object obj = (IBinder)a(b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
        if (obj == null)
        {
            obj = null;
        } else
        {
            android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (iinterface != null && (iinterface instanceof fkh))
            {
                obj = (fkh)iinterface;
            } else
            {
                obj = new fkj(((IBinder) (obj)));
            }
        }
        b = ((fkh) (obj));
        try
        {
            b.a(fcz.a(b(context).getResources()), emo.a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new af(context);
        }
        return b;
    }

    private static Object a(Class class1)
    {
        Object obj;
        try
        {
            obj = class1.newInstance();
        }
        catch (InstantiationException instantiationexception)
        {
            throw new IllegalStateException((new StringBuilder("Unable to instantiate the dynamic class ")).append(class1.getName()).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException((new StringBuilder("Unable to call the default constructor of ")).append(class1.getName()).toString());
        }
        return obj;
    }

    private static Object a(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (a(((ClassLoader)g.d(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder("Unable to find dynamic class ")).append(s).toString());
        }
        return classloader;
    }

    private static Context b(Context context)
    {
        if (a == null)
        {
            a = emo.d(context);
        }
        return a;
    }
}
