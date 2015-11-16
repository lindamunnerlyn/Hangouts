// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

class gos
{

    private static final Logger a = Logger.getLogger(gos.getName());
    private static final Map b = Collections.synchronizedMap(new HashMap());
    private static final Map c = Collections.synchronizedMap(new HashMap());
    private static final Set d = g.q();
    private static final Set e = g.s();

    private gos()
    {
    }

    static gpq a(int i)
    {
        if (!d.contains(Integer.valueOf(i)))
        {
            return null;
        }
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        if (b.containsKey(Integer.valueOf(i))) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = String.valueOf(String.valueOf("/com/google/android/libraries/phonenumbers/data/PhoneNumberAlternateFormatsProto_"));
        obj = goy.getResourceAsStream((new StringBuilder(((String) (obj)).length() + 11)).append(((String) (obj))).append(i).toString());
        Object obj1 = new ObjectInputStream(((InputStream) (obj)));
        obj = obj1;
        Object obj2 = new gps();
        obj = obj1;
        ((gps) (obj2)).readExternal(((java.io.ObjectInput) (obj1)));
        obj = obj1;
        obj2 = ((gps) (obj2)).a().iterator();
_L4:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        gpq gpq1 = (gpq)((Iterator) (obj2)).next();
        obj = obj1;
        b.put(Integer.valueOf(gpq1.n()), gpq1);
        if (true) goto _L4; else goto _L3
        Object obj3;
        obj3;
_L8:
        obj = obj1;
        a.log(Level.WARNING, ((IOException) (obj3)).toString());
        a(((InputStream) (obj1)));
_L2:
        map;
        JVM INSTR monitorexit ;
        return (gpq)b.get(Integer.valueOf(i));
_L3:
        a(((InputStream) (obj1)));
          goto _L2
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        obj3 = null;
        obj1 = obj;
_L6:
        a(((InputStream) (obj3)));
        throw obj1;
        obj1;
        obj3 = obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj3;
        obj1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static gpq a(String s)
    {
        if (!e.contains(s))
        {
            return null;
        }
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        if (c.containsKey(s)) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj = String.valueOf("/com/google/android/libraries/phonenumbers/data/ShortNumberMetadataProto_");
        obj1 = String.valueOf(s);
        if (((String) (obj1)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = ((String) (obj)).concat(((String) (obj1)));
_L7:
        obj = goy.getResourceAsStream(((String) (obj)));
        obj1 = new ObjectInputStream(((InputStream) (obj)));
        obj = obj1;
        Object obj2 = new gps();
        obj = obj1;
        ((gps) (obj2)).readExternal(((java.io.ObjectInput) (obj1)));
        obj = obj1;
        obj2 = ((gps) (obj2)).a().iterator();
_L6:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        gpq gpq1 = (gpq)((Iterator) (obj2)).next();
        obj = obj1;
        c.put(s, gpq1);
        if (true) goto _L6; else goto _L5
        IOException ioexception;
        ioexception;
_L9:
        obj = obj1;
        a.log(Level.WARNING, ioexception.toString());
        a(((InputStream) (obj1)));
_L2:
        map;
        JVM INSTR monitorexit ;
        return (gpq)c.get(s);
_L4:
        obj = new String(((String) (obj)));
          goto _L7
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
_L5:
        a(((InputStream) (obj1)));
          goto _L2
_L8:
        a(((InputStream) (obj)));
        throw s;
        s;
          goto _L8
        ioexception;
        obj1 = null;
          goto _L9
        s;
        obj = null;
          goto _L8
    }

    private static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
        a.log(Level.WARNING, inputstream.toString());
        return;
    }

}
