// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;

public final class jxp
{

    private final Field a;

    public jxp(Field field)
    {
        a = field;
        field.setAccessible(true);
    }

    void a(Object obj, int i)
    {
        try
        {
            a.set(obj, Integer.valueOf(i));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
    }

    void a(Object obj, Object obj1)
    {
        try
        {
            a.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
    }
}
