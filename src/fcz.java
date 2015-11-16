// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;

public final class fcz extends fcx
{

    private final Object a;

    private fcz(Object obj)
    {
        a = obj;
    }

    public static fcw a(Object obj)
    {
        return new fcz(obj);
    }

    public static Object a(fcw fcw1)
    {
        if (fcw1 instanceof fcz)
        {
            return ((fcz)fcw1).a;
        }
        fcw1 = fcw1.asBinder();
        Field afield[] = fcw1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    fcw1 = ((fcw) (field.get(fcw1)));
                }
                // Misplaced declaration of an exception variable
                catch (fcw fcw1)
                {
                    throw new IllegalArgumentException("Binder object is null.", fcw1);
                }
                // Misplaced declaration of an exception variable
                catch (fcw fcw1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", fcw1);
                }
                // Misplaced declaration of an exception variable
                catch (fcw fcw1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", fcw1);
                }
                return fcw1;
            } else
            {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else
        {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
