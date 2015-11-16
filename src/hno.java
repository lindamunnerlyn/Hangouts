// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

public final class hno
{

    private static final Map a = new WeakHashMap();
    private final boolean b;
    private final Field c;
    private final String d;

    private hno(Field field, String s)
    {
        c = field;
        if (s == null)
        {
            field = null;
        } else
        {
            field = s.intern();
        }
        d = field;
        b = hng.a(c.getType());
    }

    public static hno a(Enum enum)
    {
        boolean flag = true;
        hno hno1;
        try
        {
            hno1 = a(enum.getClass().getField(enum.name()));
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            throw new RuntimeException(enum);
        }
        if (hno1 == null)
        {
            flag = false;
        }
        l.a(flag, "enum constant missing @Value or @NullValue annotation: %s", new Object[] {
            enum
        });
        return hno1;
    }

    public static hno a(Field field)
    {
        if (field == null)
        {
            return null;
        }
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        hno hno1;
        boolean flag;
        hno1 = (hno)a.get(field);
        flag = field.isEnumConstant();
        Object obj = hno1;
        if (hno1 != null) goto _L2; else goto _L1
_L1:
        if (flag) goto _L4; else goto _L3
_L3:
        obj = hno1;
        if (Modifier.isStatic(field.getModifiers())) goto _L2; else goto _L4
_L4:
        if (!flag) goto _L6; else goto _L5
_L5:
        obj = (hoj)field.getAnnotation(hoj);
        if (obj == null) goto _L8; else goto _L7
_L7:
        obj = ((hoj) (obj)).a();
_L9:
        if ("##default".equals(obj))
        {
            obj = field.getName();
        }
        obj = new hno(field, ((String) (obj)));
        a.put(field, obj);
_L2:
        map;
        JVM INSTR monitorexit ;
        return ((hno) (obj));
        field;
        map;
        JVM INSTR monitorexit ;
        throw field;
_L8:
        if ((hoa)field.getAnnotation(hoa) == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        obj = null;
          goto _L9
        map;
        JVM INSTR monitorexit ;
        return null;
_L6:
        obj = (hnt)field.getAnnotation(hnt);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        map;
        JVM INSTR monitorexit ;
        return null;
        obj = ((hnt) (obj)).a();
        field.setAccessible(true);
          goto _L9
    }

    private static Object a(Field field, Object obj)
    {
        try
        {
            field = ((Field) (field.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Field field)
        {
            throw new IllegalArgumentException(field);
        }
        return field;
    }

    public static void a(Field field, Object obj, Object obj1)
    {
        if (Modifier.isFinal(field.getModifiers()))
        {
            Object obj2 = a(field, obj);
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                obj2 = String.valueOf(obj2);
                obj1 = String.valueOf(obj1);
                field = String.valueOf(field.getName());
                obj = String.valueOf(obj.getClass().getName());
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj2).length() + 48 + String.valueOf(obj1).length() + String.valueOf(field).length() + String.valueOf(obj).length())).append("expected final value <").append(((String) (obj2))).append("> but was <").append(((String) (obj1))).append("> on ").append(field).append(" field in ").append(((String) (obj))).toString());
            } else
            {
                return;
            }
        }
        try
        {
            field.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Field field)
        {
            throw new IllegalArgumentException(field);
        }
        // Misplaced declaration of an exception variable
        catch (Field field)
        {
            throw new IllegalArgumentException(field);
        }
    }

    public Object a(Object obj)
    {
        return a(c, obj);
    }

    public Field a()
    {
        return c;
    }

    public void a(Object obj, Object obj1)
    {
        a(c, obj, obj1);
    }

    public String b()
    {
        return d;
    }

    public Type c()
    {
        return c.getGenericType();
    }

    public boolean d()
    {
        return Modifier.isFinal(c.getModifiers());
    }

    public boolean e()
    {
        return b;
    }

    public Enum f()
    {
        return Enum.valueOf(c.getDeclaringClass(), c.getName());
    }

}
