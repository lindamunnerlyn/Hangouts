// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;

public final class fab extends ezz
{

    private final Object a;

    private fab(Object obj)
    {
        a = obj;
    }

    public static ezy a(Object obj)
    {
        return new fab(obj);
    }

    public static Object a(ezy ezy1)
    {
        if (ezy1 instanceof fab)
        {
            return ((fab)ezy1).a;
        }
        ezy1 = ezy1.asBinder();
        Field afield[] = ezy1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    ezy1 = ((ezy) (field.get(ezy1)));
                }
                // Misplaced declaration of an exception variable
                catch (ezy ezy1)
                {
                    throw new IllegalArgumentException("Binder object is null.", ezy1);
                }
                // Misplaced declaration of an exception variable
                catch (ezy ezy1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", ezy1);
                }
                // Misplaced declaration of an exception variable
                catch (ezy ezy1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", ezy1);
                }
                return ezy1;
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
