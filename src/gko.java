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

final class gko
    implements gkn
{

    private static final Logger a = Logger.getLogger(gko.getName());
    private final Map b;
    private final Map c;
    private final String d;
    private final gkl e;

    public gko(gkl gkl)
    {
        this("/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto", gkl);
    }

    private gko(String s, gkl gkl)
    {
        b = Collections.synchronizedMap(new HashMap());
        c = Collections.synchronizedMap(new HashMap());
        d = s;
        e = gkl;
    }

    private static glm a(ObjectInputStream objectinputstream)
    {
        glm glm1 = new glm();
        glm1.readExternal(objectinputstream);
        try
        {
            objectinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            a.log(Level.WARNING, "error closing input stream (ignored)", objectinputstream);
            return glm1;
        }
        return glm1;
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
            return glm1;
        }
        return glm1;
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

    private void a(String s, String s1, int i, gkl gkl)
    {
        boolean flag;
        flag = "001".equals(s1);
        if (flag)
        {
            gkl = String.valueOf(i);
        } else
        {
            gkl = s1;
        }
        gkl = String.valueOf(gkl);
        gkl = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(gkl).length())).append(s).append("_").append(gkl).toString();
        s = gkv.getResourceAsStream(gkl);
        if (s == null)
        {
            s1 = a;
            Level level = Level.SEVERE;
            s = String.valueOf(gkl);
            if (s.length() != 0)
            {
                s = "missing metadata: ".concat(s);
            } else
            {
                s = new String("missing metadata: ");
            }
            s1.log(level, s);
            s = String.valueOf(gkl);
            if (s.length() != 0)
            {
                s = "missing metadata: ".concat(s);
            } else
            {
                s = new String("missing metadata: ");
            }
            throw new IllegalStateException(s);
        }
        Object obj = a(new ObjectInputStream(s)).a();
        if (!((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        s1 = a;
        obj = Level.SEVERE;
        s = String.valueOf(gkl);
        if (s.length() == 0) goto _L4; else goto _L3
_L3:
        s = "empty metadata: ".concat(s);
_L7:
        s1.log(((Level) (obj)), s);
        s = String.valueOf(gkl);
        if (s.length() == 0) goto _L6; else goto _L5
_L5:
        s = "empty metadata: ".concat(s);
_L8:
        Object obj1;
        throw new IllegalStateException(s);
_L4:
        try
        {
            s = new String("empty metadata: ");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            obj = a;
            obj1 = Level.SEVERE;
            s = String.valueOf(gkl);
            Level level1;
            if (s.length() != 0)
            {
                s = "cannot load/parse metadata: ".concat(s);
            } else
            {
                s = new String("cannot load/parse metadata: ");
            }
            ((Logger) (obj)).log(((Level) (obj1)), s, s1);
            s = String.valueOf(gkl);
            if (s.length() != 0)
            {
                s = "cannot load/parse metadata: ".concat(s);
            } else
            {
                s = new String("cannot load/parse metadata: ");
            }
            throw new RuntimeException(s, s1);
        }
          goto _L7
_L6:
        s = new String("empty metadata: ");
          goto _L8
_L2:
        if (((List) (obj)).size() <= 1) goto _L10; else goto _L9
_L9:
        obj1 = a;
        level1 = Level.WARNING;
        s = String.valueOf(gkl);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        s = "invalid metadata (too many entries): ".concat(s);
_L11:
        ((Logger) (obj1)).log(level1, s);
_L10:
        s = (glk)((List) (obj)).get(0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        c.put(Integer.valueOf(i), s);
        return;
        s = new String("invalid metadata (too many entries): ");
          goto _L11
        b.put(s1, s);
        return;
          goto _L7
    }

    public glk a(int i)
    {
        synchronized (c)
        {
            if (!c.containsKey(Integer.valueOf(i)))
            {
                a(d, "001", i, e);
            }
        }
        return (glk)c.get(Integer.valueOf(i));
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public glk a(String s)
    {
        synchronized (b)
        {
            if (!b.containsKey(s))
            {
                a(d, s, 0, e);
            }
        }
        return (glk)b.get(s);
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

}
