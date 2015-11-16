// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

final class gou
    implements got
{

    private static final Logger a = Logger.getLogger(gou.getName());
    private final Map b;
    private final Map c;
    private final String d;
    private final gor e;

    public gou(gor gor)
    {
        this("/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto", gor);
    }

    private gou(String s, gor gor)
    {
        b = Collections.synchronizedMap(new HashMap());
        c = Collections.synchronizedMap(new HashMap());
        d = s;
        e = gor;
    }

    private static gps a(ObjectInputStream objectinputstream)
    {
        gps gps1 = new gps();
        gps1.readExternal(objectinputstream);
        try
        {
            objectinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            a.log(Level.WARNING, "error closing input stream (ignored)", objectinputstream);
            return gps1;
        }
        return gps1;
        IOException ioexception;
        ioexception;
        a.log(Level.WARNING, "error reading input (ignored)", ioexception);
        try
        {
            objectinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            a.log(Level.WARNING, "error closing input stream (ignored)", objectinputstream);
            return gps1;
        }
        return gps1;
        Exception exception;
        exception;
        try
        {
            objectinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            a.log(Level.WARNING, "error closing input stream (ignored)", objectinputstream);
        }
        throw exception;
    }

    private void a(String s, int i)
    {
        Object obj;
        String s1;
        boolean flag;
        flag = "001".equals(s);
        s1 = String.valueOf(String.valueOf(d));
        if (flag)
        {
            obj = String.valueOf(i);
        } else
        {
            obj = s;
        }
        obj = String.valueOf(String.valueOf(obj));
        s1 = (new StringBuilder(s1.length() + 1 + ((String) (obj)).length())).append(s1).append("_").append(((String) (obj))).toString();
        obj = gpb.getResourceAsStream(s1);
        if (obj == null)
        {
            obj = a;
            Level level = Level.SEVERE;
            s = String.valueOf(s1);
            if (s.length() != 0)
            {
                s = "missing metadata: ".concat(s);
            } else
            {
                s = new String("missing metadata: ");
            }
            ((Logger) (obj)).log(level, s);
            s = String.valueOf(s1);
            if (s.length() != 0)
            {
                s = "missing metadata: ".concat(s);
            } else
            {
                s = new String("missing metadata: ");
            }
            throw new IllegalStateException(s);
        }
        Object obj2 = a(new ObjectInputStream(((java.io.InputStream) (obj)))).a();
        if (!((List) (obj2)).isEmpty()) goto _L2; else goto _L1
_L1:
        obj = a;
        obj2 = Level.SEVERE;
        s = String.valueOf(s1);
        if (s.length() == 0) goto _L4; else goto _L3
_L3:
        s = "empty metadata: ".concat(s);
_L7:
        ((Logger) (obj)).log(((Level) (obj2)), s);
        s = String.valueOf(s1);
        if (s.length() == 0) goto _L6; else goto _L5
_L5:
        s = "empty metadata: ".concat(s);
_L8:
        IOException ioexception;
        Object obj3;
        throw new IllegalStateException(s);
_L4:
        try
        {
            s = new String("empty metadata: ");
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            obj2 = a;
            obj3 = Level.SEVERE;
            s = String.valueOf(s1);
            Object obj1;
            Level level1;
            if (s.length() != 0)
            {
                s = "cannot load/parse metadata: ".concat(s);
            } else
            {
                s = new String("cannot load/parse metadata: ");
            }
            ((Logger) (obj2)).log(((Level) (obj3)), s, ioexception);
            s = String.valueOf(s1);
            if (s.length() != 0)
            {
                s = "cannot load/parse metadata: ".concat(s);
            } else
            {
                s = new String("cannot load/parse metadata: ");
            }
            throw new RuntimeException(s, ioexception);
        }
          goto _L7
_L6:
        s = new String("empty metadata: ");
          goto _L8
_L2:
        if (((List) (obj2)).size() <= 1) goto _L10; else goto _L9
_L9:
        obj3 = a;
        level1 = Level.WARNING;
        obj1 = String.valueOf(s1);
        if (((String) (obj1)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_453;
        }
        obj1 = "invalid metadata (too many entries): ".concat(((String) (obj1)));
_L11:
        ((Logger) (obj3)).log(level1, ((String) (obj1)));
_L10:
        obj1 = (gpq)((List) (obj2)).get(0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        c.put(Integer.valueOf(i), obj1);
        return;
        obj1 = new String("invalid metadata (too many entries): ");
          goto _L11
        b.put(s, obj1);
        return;
          goto _L7
    }

    public gpq a(int i)
    {
        synchronized (c)
        {
            if (!c.containsKey(Integer.valueOf(i)))
            {
                a("001", i);
            }
        }
        return (gpq)c.get(Integer.valueOf(i));
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public gpq a(String s)
    {
        synchronized (b)
        {
            if (!b.containsKey(s))
            {
                a(s, 0);
            }
        }
        return (gpq)b.get(s);
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

}
