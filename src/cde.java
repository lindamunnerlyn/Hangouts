// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class cde
    implements afk
{

    private static final boolean a = false;
    private ccx b;
    private final File c;
    private final int d;

    public cde(File file, int i)
    {
        file = String.valueOf(file.getAbsolutePath());
        String s = String.valueOf("/volleyCache");
        if (s.length() != 0)
        {
            file = file.concat(s);
        } else
        {
            file = new String(file);
        }
        c = new File(file);
        d = i;
    }

    private static int a(InputStream inputstream)
    {
        int i = inputstream.read();
        if (i == -1)
        {
            throw new EOFException();
        } else
        {
            return i;
        }
    }

    static void a(OutputStream outputstream, int i)
    {
        outputstream.write(i & 0xff);
        outputstream.write(i >> 8 & 0xff);
        outputstream.write(i >> 16 & 0xff);
        outputstream.write(i >>> 24);
    }

    static void a(OutputStream outputstream, long l)
    {
        outputstream.write((byte)(int)l);
        outputstream.write((byte)(int)(l >>> 8));
        outputstream.write((byte)(int)(l >>> 16));
        outputstream.write((byte)(int)(l >>> 24));
        outputstream.write((byte)(int)(l >>> 32));
        outputstream.write((byte)(int)(l >>> 40));
        outputstream.write((byte)(int)(l >>> 48));
        outputstream.write((byte)(int)(l >>> 56));
    }

    static void a(OutputStream outputstream, String s)
    {
        s = s.getBytes("UTF-8");
        a(outputstream, s.length);
        outputstream.write(s, 0, s.length);
    }

    static void a(Map map, OutputStream outputstream)
    {
        if (map != null)
        {
            a(outputstream, map.size());
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); a(outputstream, (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                a(outputstream, (String)entry.getKey());
            }

        } else
        {
            a(outputstream, 0);
        }
    }

    private static byte[] a(InputStream inputstream, int i)
    {
        byte abyte0[] = new byte[i];
        int j = 0;
        do
        {
            if (j >= i)
            {
                break;
            }
            int k = inputstream.read(abyte0, j, i - j);
            if (k == -1)
            {
                break;
            }
            j += k;
        } while (true);
        if (j != i)
        {
            throw new IOException((new StringBuilder(50)).append("Expected ").append(i).append(" bytes, read ").append(j).append(" bytes").toString());
        } else
        {
            return abyte0;
        }
    }

    private static int b(InputStream inputstream)
    {
        return a(inputstream) | 0 | a(inputstream) << 8 | a(inputstream) << 16 | a(inputstream) << 24;
    }

    private static long c(InputStream inputstream)
    {
        return 0L | (long)a(inputstream) & 255L | ((long)a(inputstream) & 255L) << 8 | ((long)a(inputstream) & 255L) << 16 | ((long)a(inputstream) & 255L) << 24 | ((long)a(inputstream) & 255L) << 32 | ((long)a(inputstream) & 255L) << 40 | ((long)a(inputstream) & 255L) << 48 | ((long)a(inputstream) & 255L) << 56;
    }

    private static String d(InputStream inputstream)
    {
        return new String(a(inputstream, (int)c(inputstream)), "UTF-8");
    }

    private static Map e(InputStream inputstream)
    {
        int j = b(inputstream);
        Object obj;
        int i;
        if (j == 0)
        {
            obj = Collections.emptyMap();
        } else
        {
            obj = new gz(j);
        }
        for (i = 0; i < j; i++)
        {
            ((Map) (obj)).put(d(inputstream).intern(), d(inputstream).intern());
        }

        return ((Map) (obj));
    }

    public afl a(String s)
    {
        Object obj2 = null;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        int i = s.hashCode();
        obj = b.a(String.valueOf(i));
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((cdc) (obj)).a();
        Object obj1 = obj;
        cdf cdf1 = new cdf();
        obj1 = obj;
        if (b(((InputStream) (obj))) == 0x20140131) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        try
        {
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally { }
_L25:
        obj1 = obj;
        eev.g("Babel", "VolleyDiskCache: IO exception on get");
        obj1 = obj2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        ((InputStream) (obj)).close();
        obj1 = obj2;
_L12:
        this;
        JVM INSTR monitorexit ;
        return ((afl) (obj1));
_L4:
        obj1 = obj;
        cdf1.a = b(((InputStream) (obj)));
        obj1 = obj;
        cdf1.b = d(((InputStream) (obj)));
        obj1 = obj;
        cdf1.c = d(((InputStream) (obj)));
        obj1 = obj;
        if (!cdf1.c.equals(""))
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj1 = obj;
        cdf1.c = null;
        obj1 = obj;
        cdf1.d = c(((InputStream) (obj)));
        obj1 = obj;
        cdf1.e = c(((InputStream) (obj)));
        obj1 = obj;
        cdf1.f = c(((InputStream) (obj)));
        obj1 = obj;
        cdf1.g = e(((InputStream) (obj)));
        obj1 = obj;
        if (cdf1.b.equals(s)) goto _L6; else goto _L5
_L5:
        obj1 = obj;
        if (!a) goto _L8; else goto _L7
_L7:
        obj1 = obj;
        s = String.valueOf(s);
        obj1 = obj;
        if (s.length() == 0) goto _L10; else goto _L9
_L9:
        obj1 = obj;
        s = "VolleyDiskCache: Cache miss (hash collision) ".concat(s);
_L13:
        obj1 = obj;
        eev.b("Babel", s);
_L8:
        obj1 = obj2;
        if (obj == null) goto _L12; else goto _L11
_L11:
        ((InputStream) (obj)).close();
        obj1 = obj2;
          goto _L12
        s;
        eev.g("Babel", "VolleyDiskCache: IO exception on get");
        obj1 = obj2;
          goto _L12
        s;
        throw s;
_L10:
        obj1 = obj;
        s = new String("VolleyDiskCache: Cache miss (hash collision) ");
          goto _L13
_L22:
        obj1 = null;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        ((InputStream) (obj1)).close();
_L23:
        throw s;
_L6:
        obj1 = obj;
        abyte0 = a(((InputStream) (obj)), cdf1.a);
        obj1 = obj;
        if (!a) goto _L15; else goto _L14
_L14:
        obj1 = obj;
        s = String.valueOf(s);
        obj1 = obj;
        if (s.length() == 0) goto _L17; else goto _L16
_L16:
        obj1 = obj;
        s = "VolleyDiskCache: Cache hit ".concat(s);
_L19:
        obj1 = obj;
        eev.b("Babel", s);
_L15:
        obj1 = obj;
        s = cdf1.a(abyte0);
        obj1 = s;
        if (obj == null) goto _L12; else goto _L18
_L18:
        ((InputStream) (obj)).close();
        obj1 = s;
          goto _L12
        obj;
        eev.g("Babel", "VolleyDiskCache: IO exception on get");
        obj1 = s;
          goto _L12
_L17:
        obj1 = obj;
        s = new String("VolleyDiskCache: Cache hit ");
          goto _L19
_L2:
        obj1 = obj2;
        if (!a) goto _L12; else goto _L20
_L20:
        s = String.valueOf(s);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_460;
        }
        s = "VolleyDiskCache: Cache miss ".concat(s);
_L21:
        eev.b("Babel", s);
        obj1 = obj2;
          goto _L12
        s = new String("VolleyDiskCache: Cache miss ");
          goto _L21
        s;
          goto _L22
        s;
        eev.g("Babel", "VolleyDiskCache: IO exception on get");
        obj1 = obj2;
          goto _L12
        obj;
        eev.g("Babel", "VolleyDiskCache: IO exception on get");
          goto _L23
        s;
        obj = null;
        if (true) goto _L25; else goto _L24
_L24:
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        b = ccx.a(c, d);
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        eev.g("Babel", "VolleyDiskCache: IO exception on initialize");
        throw new RuntimeException("Couldn't initialize volley disk cache");
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(String s, afl afl1)
    {
        this;
        JVM INSTR monitorenter ;
        OutputStream outputstream;
        OutputStream outputstream1;
        outputstream1 = null;
        outputstream = outputstream1;
        int i = s.hashCode();
        outputstream = outputstream1;
        if (!a) goto _L2; else goto _L1
_L1:
        outputstream = outputstream1;
        Object obj = String.valueOf(s);
        outputstream = outputstream1;
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        outputstream = outputstream1;
        obj = "VolleyDiskCache: Cache put ".concat(((String) (obj)));
_L11:
        outputstream = outputstream1;
        eev.b("Babel", ((String) (obj)));
_L2:
        outputstream = outputstream1;
        ccz ccz1 = b.b(String.valueOf(i));
        outputstream = outputstream1;
        outputstream1 = ccz1.a();
        outputstream = outputstream1;
        obj = outputstream1;
        afl1.g.put("VolleyDiskCache", "VolleyDiskCache");
        outputstream = outputstream1;
        obj = outputstream1;
        (new cdf(s, afl1)).a(outputstream1);
        outputstream = outputstream1;
        obj = outputstream1;
        outputstream1.write(afl1.a);
        outputstream = outputstream1;
        obj = outputstream1;
        ccz1.b();
        outputstream1.close();
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        outputstream = outputstream1;
        try
        {
            obj = new String("VolleyDiskCache: Cache put ");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            obj = outputstream;
        }
        finally
        {
            obj = null;
        }
        eev.g("Babel", "VolleyDiskCache: IO exception on put");
        if (outputstream == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            outputstream.close();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            throw s;
        }
        eev.g("Babel", "VolleyDiskCache: IO exception on put");
        continue; /* Loop/switch isn't completed */
        s;
        eev.g("Babel", "VolleyDiskCache: IO exception on put");
        if (true) goto _L6; else goto _L5
_L5:
_L9:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        ((OutputStream) (obj)).close();
_L7:
        throw s;
        afl1;
        eev.g("Babel", "VolleyDiskCache: IO exception on put");
          goto _L7
        s;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int i = s.hashCode();
        if (!a) goto _L2; else goto _L1
_L1:
        s = String.valueOf(s);
        if (s.length() == 0) goto _L4; else goto _L3
_L3:
        s = "VolleyDiskCache: Cache remove ".concat(s);
_L5:
        eev.b("Babel", s);
_L2:
        b.c(String.valueOf(i));
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        s = new String("VolleyDiskCache: Cache remove ");
          goto _L5
        s;
          goto _L6
        s;
        throw s;
          goto _L5
    }

    static 
    {
        hnc hnc = eev.h;
    }
}
