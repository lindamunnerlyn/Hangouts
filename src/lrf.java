// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public final class lrf
    implements lrd
{

    private final File a;
    private final String b;
    private final ClassLoader c;
    private final Map d;

    public lrf(String s)
    {
        this(s, (byte)0);
    }

    private lrf(String s, byte byte0)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("No resource path provided");
        }
        String s1 = s;
        if (!s.endsWith("/"))
        {
            s = String.valueOf(s);
            s1 = (new StringBuilder(String.valueOf(s).length() + 1)).append(s).append("/").toString();
        }
        a = null;
        b = s1;
        c = getClass().getClassLoader();
        d = a(b("ZoneInfoMap"));
    }

    private static Map a(InputStream inputstream)
    {
        ConcurrentHashMap concurrenthashmap;
        concurrenthashmap = new ConcurrentHashMap();
        inputstream = new DataInputStream(inputstream);
        a(((DataInputStream) (inputstream)), ((Map) (concurrenthashmap)));
        Exception exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        concurrenthashmap.put("UTC", new SoftReference(lnn.a));
        return concurrenthashmap;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw exception;
    }

    private static void a(DataInputStream datainputstream, Map map)
    {
        boolean flag = false;
        int k = datainputstream.readUnsignedShort();
        String as[] = new String[k];
        for (int i = 0; i < k; i++)
        {
            as[i] = datainputstream.readUTF().intern();
        }

        k = datainputstream.readUnsignedShort();
        int j = ((flag) ? 1 : 0);
        while (j < k) 
        {
            try
            {
                map.put(as[datainputstream.readUnsignedShort()], as[datainputstream.readUnsignedShort()]);
            }
            // Misplaced declaration of an exception variable
            catch (DataInputStream datainputstream)
            {
                throw new IOException("Corrupt zone info map");
            }
            j++;
        }
    }

    private InputStream b(String s)
    {
        Object obj;
        if (a != null)
        {
            obj = new FileInputStream(new File(a, s));
        } else
        {
            String s1 = b.concat(s);
            if (c != null)
            {
                s = c.getResourceAsStream(s1);
            } else
            {
                s = ClassLoader.getSystemResourceAsStream(s1);
            }
            obj = s;
            if (s == null)
            {
                StringBuilder stringbuilder = (new StringBuilder(40)).append("Resource not found: \"").append(s1).append("\" ClassLoader: ");
                if (c != null)
                {
                    s = c.toString();
                } else
                {
                    s = "system";
                }
                throw new IOException(stringbuilder.append(s).toString());
            }
        }
        return ((InputStream) (obj));
    }

    private lnn c(String s)
    {
        InputStream inputstream1 = b(s);
        InputStream inputstream = inputstream1;
        if (!(inputstream1 instanceof DataInput)) goto _L2; else goto _L1
_L1:
        inputstream = inputstream1;
        Object obj = g.a((DataInput)inputstream1, s);
_L4:
        inputstream = inputstream1;
        d.put(s, new SoftReference(obj));
        Thread thread;
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return ((lnn) (obj));
            }
        }
        return ((lnn) (obj));
_L2:
        inputstream = inputstream1;
        obj = g.a(new DataInputStream(inputstream1), s);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        inputstream1 = null;
_L8:
        inputstream = inputstream1;
        thread = Thread.currentThread();
        inputstream = inputstream1;
        thread.getThreadGroup().uncaughtException(thread, ((Throwable) (obj)));
        inputstream = inputstream1;
        d.remove(s);
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
        s;
        inputstream = null;
_L6:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (IOException ioexception) { }
        }
        throw s;
        s;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Set a()
    {
        return new TreeSet(d.keySet());
    }

    public lnn a(String s)
    {
        Object obj;
        if (s == null)
        {
            obj = null;
        } else
        {
            obj = d.get(s);
            if (obj == null)
            {
                return null;
            }
            if (s.equals(obj))
            {
                return c(s);
            }
            if (obj instanceof SoftReference)
            {
                lnn lnn1 = (lnn)((SoftReference)obj).get();
                obj = lnn1;
                if (lnn1 == null)
                {
                    return c(s);
                }
            } else
            {
                return a((String)obj);
            }
        }
        return ((lnn) (obj));
    }
}
