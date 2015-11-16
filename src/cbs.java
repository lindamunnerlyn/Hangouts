// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class cbs
    implements Closeable
{

    private static final Charset a = Charset.forName("UTF-8");
    private final File b;
    private final File c;
    private final File d;
    private final int e = 0x20140131;
    private final long f;
    private final int g = 1;
    private long h;
    private Writer i;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75F, true);
    private int k;
    private long l;
    private final ExecutorService m;
    private final Callable n = new cbt(this);

    private cbs(File file, int i1, int j1, long l1)
    {
        h = 0L;
        l = 0L;
        m = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        b = file;
        c = new File(file, "journal");
        d = new File(file, "journal.tmp");
        f = l1;
    }

    public static cbs a(File file, long l1)
    {
        cbs cbs1;
        if (l1 <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        cbs1 = new cbs(file, 0x20140131, 1, l1);
        if (!cbs1.c.exists())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        cbs1.a();
        cbs1.b();
        cbs1.i = new BufferedWriter(new FileWriter(cbs1.c, true), 8192);
        return cbs1;
        IOException ioexception;
        ioexception;
        cbs1.close();
        a(cbs1.b);
        file.mkdirs();
        file = new cbs(file, 0x20140131, 1, l1);
        file.c();
        return file;
    }

    static Writer a(cbs cbs1)
    {
        return cbs1.i;
    }

    private static String a(InputStream inputstream)
    {
        StringBuilder stringbuilder = new StringBuilder(80);
        do
        {
            int i1 = inputstream.read();
            if (i1 == -1)
            {
                throw new EOFException();
            }
            if (i1 == 10)
            {
                break;
            }
            stringbuilder.append((char)i1);
        } while (true);
        int j1 = stringbuilder.length();
        if (j1 > 0 && stringbuilder.charAt(j1 - 1) == '\r')
        {
            stringbuilder.setLength(j1 - 1);
        }
        return stringbuilder.toString();
    }

    private void a()
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(c), 8192);
        Exception exception;
        String s = a(((InputStream) (bufferedinputstream)));
        String s2 = a(((InputStream) (bufferedinputstream)));
        String s3 = a(((InputStream) (bufferedinputstream)));
        String s4 = a(((InputStream) (bufferedinputstream)));
        String s6 = a(((InputStream) (bufferedinputstream)));
        if (!"com.google.android.apps.hangouts.network".equals(s) || !"1".equals(s2) || !Integer.toString(e).equals(s3) || !Integer.toString(g).equals(s4) || !"".equals(s6))
        {
            throw new IOException((new StringBuilder(String.valueOf(s).length() + 35 + String.valueOf(s2).length() + String.valueOf(s4).length() + String.valueOf(s6).length())).append("unexpected journal header: [").append(s).append(", ").append(s2).append(", ").append(s4).append(", ").append(s6).append("]").toString());
        }
          goto _L1
_L5:
        String as[];
        String s5 = as[1];
        if (!as[0].equals("REMOVE") || as.length != 2) goto _L3; else goto _L2
_L2:
        j.remove(s5);
_L1:
        Object obj1;
        obj1 = a(((InputStream) (bufferedinputstream)));
        as = ((String) (obj1)).split(" ");
        if (as.length >= 2) goto _L5; else goto _L4
_L4:
        Object obj = String.valueOf(obj1);
        if (((String) (obj)).length() == 0) goto _L7; else goto _L6
_L6:
        obj = "unexpected journal line: ".concat(((String) (obj)));
_L8:
        throw new IOException(((String) (obj)));
_L7:
        try
        {
            obj = new String("unexpected journal line: ");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Closeable) (bufferedinputstream)));
            return;
        }
        finally
        {
            a(((Closeable) (bufferedinputstream)));
            throw exception;
        }
          goto _L8
_L3:
        obj = (cbw)j.get(s5);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        obj = new cbw(this, s5);
        j.put(s5, obj);
        int i1;
        int j1;
        if (!as[0].equals("CLEAN") || as.length != g + 2)
        {
            break MISSING_BLOCK_LABEL_476;
        }
        obj.c = true;
        obj.d = null;
        j1 = as.length;
        i1 = as.length;
        if (2 <= j1)
        {
            break MISSING_BLOCK_LABEL_406;
        }
        throw new IllegalArgumentException();
        if (2 <= i1)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        throw new ArrayIndexOutOfBoundsException();
        j1 -= 2;
        i1 = Math.min(j1, i1 - 2);
        obj1 = ((Object) ((Object[])Array.newInstance(as.getClass().getComponentType(), j1)));
        System.arraycopy(as, 2, obj1, 0, i1);
        ((cbw) (obj)).a((String[])obj1);
          goto _L1
        if (!as[0].equals("DIRTY") || as.length != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj.d = new cbu(this, ((cbw) (obj)));
          goto _L1
        if (as[0].equals("READ") && as.length == 2) goto _L1; else goto _L9
_L9:
        String s1 = String.valueOf(obj1);
        if (s1.length() != 0)
        {
            s1 = "unexpected journal line: ".concat(s1);
        } else
        {
            s1 = new String("unexpected journal line: ");
        }
        throw new IOException(s1);
    }

    static void a(cbs cbs1, cbu cbu1, boolean flag)
    {
        cbs1.a(cbu1, flag);
    }

    private void a(cbu cbu1, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = cbu1.a;
        if (((cbw) (obj)).d != cbu1)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        cbu1;
        this;
        JVM INSTR monitorexit ;
        throw cbu1;
        int j1 = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        j1 = ((flag1) ? 1 : 0);
        if (((cbw) (obj)).c) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L9:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= g) goto _L2; else goto _L4
_L4:
        if (!((cbw) (obj)).b(i1).exists())
        {
            cbu1.c();
            throw new IllegalStateException((new StringBuilder(35)).append("edit didn't create file ").append(i1).toString());
        }
          goto _L5
_L2:
        if (j1 >= g) goto _L7; else goto _L6
_L6:
        cbu1 = ((cbw) (obj)).b(j1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        if (cbu1.exists())
        {
            File file = ((cbw) (obj)).a(j1);
            cbu1.renameTo(file);
            long l1 = ((cbw) (obj)).b[j1];
            long l3 = file.length();
            ((cbw) (obj)).b[j1] = l3;
            h = (h - l1) + l3;
        }
        break MISSING_BLOCK_LABEL_470;
        b(cbu1);
        break MISSING_BLOCK_LABEL_470;
_L7:
        k = k + 1;
        obj.d = null;
        if (!(((cbw) (obj)).c | flag))
        {
            break MISSING_BLOCK_LABEL_381;
        }
        obj.c = true;
        cbu1 = i;
        String s = String.valueOf("CLEAN ");
        String s2 = ((cbw) (obj)).a;
        String s3 = ((cbw) (obj)).a();
        cbu1.write((new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s2).append(s3).append("\n").toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        long l2 = l;
        l = 1L + l2;
        obj.e = l2;
_L8:
        if (h > f || d())
        {
            m.submit(n);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        j.remove(((cbw) (obj)).a);
        cbu1 = i;
        String s1 = String.valueOf("REMOVE ");
        obj = ((cbw) (obj)).a;
        cbu1.write((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(obj).length())).append(s1).append(((String) (obj))).append("\n").toString());
          goto _L8
_L5:
        i1++;
          goto _L9
        j1++;
          goto _L2
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        throw closeable;
        closeable;
    }

    private static void a(File file)
    {
        File afile[] = file.listFiles();
        if (afile == null)
        {
            file = String.valueOf(file);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(file).length() + 17)).append("not a directory: ").append(file).toString());
        }
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            file = afile[i1];
            if (file.isDirectory())
            {
                a(file);
            }
            if (!file.delete())
            {
                file = String.valueOf(file);
                throw new IOException((new StringBuilder(String.valueOf(file).length() + 23)).append("failed to delete file: ").append(file).toString());
            }
        }

    }

    private void b()
    {
        b(d);
        for (Iterator iterator = j.values().iterator(); iterator.hasNext();)
        {
            cbw cbw1 = (cbw)iterator.next();
            if (cbw1.d == null)
            {
                int i1 = 0;
                while (i1 < g) 
                {
                    h = h + cbw1.b[i1];
                    i1++;
                }
            } else
            {
                cbw1.d = null;
                for (int j1 = 0; j1 < g; j1++)
                {
                    b(cbw1.a(j1));
                    b(cbw1.b(j1));
                }

                iterator.remove();
            }
        }

    }

    static void b(cbs cbs1)
    {
        cbs1.f();
    }

    private static void b(File file)
    {
        if (file.exists() && !file.delete())
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        if (i != null)
        {
            i.close();
        }
        obj = new BufferedWriter(new FileWriter(d), 8192);
        ((Writer) (obj)).write("com.google.android.apps.hangouts.network");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("1");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(e));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(g));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("\n");
        iterator = j.values().iterator();
_L1:
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_297;
            }
            obj1 = (cbw)iterator.next();
            if (((cbw) (obj1)).d == null)
            {
                break MISSING_BLOCK_LABEL_214;
            }
            String s = String.valueOf("DIRTY ");
            obj1 = ((cbw) (obj1)).a;
            ((Writer) (obj)).write((new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj1).length())).append(s).append(((String) (obj1))).append("\n").toString());
        } while (true);
        obj;
        throw obj;
        String s1 = String.valueOf("CLEAN ");
        String s2 = ((cbw) (obj1)).a;
        obj1 = ((cbw) (obj1)).a();
        ((Writer) (obj)).write((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s2).length() + String.valueOf(obj1).length())).append(s1).append(s2).append(((String) (obj1))).append("\n").toString());
          goto _L1
        ((Writer) (obj)).close();
        d.renameTo(c);
        i = new BufferedWriter(new FileWriter(c, true), 8192);
        this;
        JVM INSTR monitorexit ;
    }

    static boolean c(cbs cbs1)
    {
        return cbs1.d();
    }

    private cbu d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        e();
        e(s);
        obj = (cbw)j.get(s);
        if (-1L == -1L) goto _L2; else goto _L1
_L1:
        if (obj == null) goto _L4; else goto _L3
_L3:
        long l1 = ((cbw) (obj)).e;
        if (l1 == -1L) goto _L2; else goto _L4
_L4:
        s = null;
_L10:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (obj != null) goto _L6; else goto _L5
_L5:
        obj = new cbw(this, s);
        j.put(s, obj);
_L8:
        cbu cbu1;
        cbu1 = new cbu(this, ((cbw) (obj)));
        obj.d = cbu1;
        obj = i;
        String s1 = String.valueOf("DIRTY ");
        ((Writer) (obj)).write((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append(s).append("\n").toString());
        i.flush();
        s = cbu1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        cbu1 = ((cbw) (obj)).d;
        if (cbu1 == null) goto _L8; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static void d(cbs cbs1)
    {
        cbs1.c();
    }

    private boolean d()
    {
        return k >= 2000 && k >= j.size();
    }

    static int e(cbs cbs1)
    {
        cbs1.k = 0;
        return 0;
    }

    private void e()
    {
        if (i == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    private static void e(String s)
    {
        if (s.contains(" ") || s.contains("\n") || s.contains("\r"))
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 44)).append("keys must not contain spaces or newlines: \"").append(s).append("\"").toString());
        } else
        {
            return;
        }
    }

    static int f(cbs cbs1)
    {
        return cbs1.g;
    }

    private void f()
    {
        while (h > f) 
        {
            c((String)((java.util.Map.Entry)j.entrySet().iterator().next()).getKey());
        }
    }

    static File g(cbs cbs1)
    {
        return cbs1.b;
    }

    public cbx a(String s)
    {
        Writer writer = null;
        this;
        JVM INSTR monitorenter ;
        cbw cbw1;
        e();
        e(s);
        cbw1 = (cbw)j.get(s);
        if (cbw1 != null) goto _L2; else goto _L1
_L1:
        Object obj = writer;
_L6:
        this;
        JVM INSTR monitorexit ;
        return ((cbx) (obj));
_L2:
        obj = writer;
        if (!cbw1.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new InputStream[g];
        int i1 = 0;
_L4:
        if (i1 >= g)
        {
            break; /* Loop/switch isn't completed */
        }
        obj[i1] = new FileInputStream(cbw1.a(i1));
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        k = k + 1;
        writer = i;
        String s1 = String.valueOf("READ ");
        writer.append((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append(s).append("\n").toString());
        if (d())
        {
            m.submit(n);
        }
        obj = new cbx(this, s, cbw1.e, ((InputStream []) (obj)));
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        s;
        obj = writer;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public cbu b(String s)
    {
        return d(s);
    }

    public boolean c(String s)
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        cbw cbw1;
        e();
        e(s);
        cbw1 = (cbw)j.get(s);
        if (cbw1 == null) goto _L2; else goto _L1
_L1:
        Object obj = cbw1.d;
        if (obj == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        h = h - cbw1.b[i1];
        cbw1.b[i1] = 0L;
        i1++;
_L3:
        if (i1 >= g)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        obj = cbw1.a(i1);
        if (((File) (obj)).delete()) goto _L5; else goto _L4
_L4:
        s = String.valueOf(obj);
        throw new IOException((new StringBuilder(String.valueOf(s).length() + 17)).append("failed to delete ").append(s).toString());
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        k = k + 1;
        Writer writer = i;
        String s1 = String.valueOf("REMOVE ");
        writer.append((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append(s).append("\n").toString());
        j.remove(s);
        if (d())
        {
            m.submit(n);
        }
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        Writer writer = i;
        if (writer != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = (new ArrayList(j.values())).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cbw cbw1 = (cbw)iterator.next();
            if (cbw1.d != null)
            {
                cbw1.d.c();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        f();
        i.close();
        i = null;
          goto _L1
    }

}
