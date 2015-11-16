// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class gvh
{

    private final int a;
    private final List b = new LinkedList();
    private final File c;
    private int d;
    private int e;

    public gvh(Context context, String s)
    {
        a = (android.os.Build.VERSION.RELEASE.hashCode() + 31) * 31 + a(context);
        context = String.valueOf(context.getDir(null, 0).getAbsolutePath());
        c = new File((new StringBuilder(String.valueOf(context).length() + 1 + String.valueOf(s).length())).append(context).append("/").append(s).toString());
        d();
        b();
    }

    private static int a(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("BackgroundTask", "Failed to get application version", context);
            return 0;
        }
        return i;
    }

    private static int a(gvv gvv1)
    {
        gvv1 = gvv1.e();
        int i;
        if (gvv1 != null)
        {
            i = gvv1.length;
        } else
        {
            i = 0;
        }
        return i + 200;
    }

    private void a(gvi gvi1)
    {
        b.add(gvi1);
        e = e + a(gvi1.c);
    }

    private void a(Iterator iterator, gvi gvi1)
    {
        iterator.remove();
        e = e - a(gvi1.c);
    }

    private void b()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            gvi gvi1 = (gvi)iterator.next();
            if (gvi1.c.h())
            {
                if (Log.isLoggable("BackgroundTask", 4))
                {
                    String s = String.valueOf(gvi1.c);
                    String s1 = gvi1.b;
                    (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s1).length())).append("Dropping expired result: ").append(s).append(", tag: ").append(s1);
                }
                a(iterator, gvi1);
            }
        } while (true);
    }

    private void c()
    {
        gvi gvi1;
        for (Iterator iterator = b.iterator(); e > 0x7d000 && iterator.hasNext(); a(iterator, gvi1))
        {
            gvi1 = (gvi)iterator.next();
            if (Log.isLoggable("BackgroundTask", 4))
            {
                String s = String.valueOf(gvi1.c);
                String s1 = gvi1.b;
                (new StringBuilder(String.valueOf(s).length() + 37 + String.valueOf(s1).length())).append("Dropping result to make room: ").append(s).append(", tag: ").append(s1);
            }
        }

    }

    private void d()
    {
        File file = c;
        file;
        JVM INSTR monitorenter ;
        android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.allowThreadDiskWrites();
        boolean flag = c.exists();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
        file;
        JVM INSTR monitorexit ;
        return;
        DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(c)));
        Object obj = datainputstream;
        int i = datainputstream.readInt();
        obj = datainputstream;
        int j = a;
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        Exception exception;
        byte abyte0[];
        Exception exception1;
        try
        {
            datainputstream.close();
        }
        catch (IOException ioexception) { }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
        file;
        JVM INSTR monitorexit ;
        return;
        obj;
        file;
        JVM INSTR monitorexit ;
        throw obj;
        obj = datainputstream;
        j = datainputstream.readInt();
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = datainputstream;
        abyte0 = new byte[datainputstream.readInt()];
        obj = datainputstream;
        datainputstream.readFully(abyte0);
        obj = datainputstream;
        a((gvi)g.a(abyte0, gvi.getClassLoader()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = datainputstream;
        if (!Log.isLoggable("BackgroundTask", 4))
        {
            break MISSING_BLOCK_LABEL_258;
        }
        obj = datainputstream;
        i = b.size();
        obj = datainputstream;
        (new StringBuilder(34)).append("readResults: num read: ").append(i);
        try
        {
            datainputstream.close();
        }
        catch (IOException ioexception1) { }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
_L3:
        file;
        JVM INSTR monitorexit ;
        return;
        exception1;
        datainputstream = null;
_L6:
        obj = datainputstream;
        Log.e("BackgroundTask", "Cannot read service results", exception1);
        if (datainputstream == null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        try
        {
            datainputstream.close();
        }
        catch (IOException ioexception2) { }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
          goto _L3
        exception;
        obj = null;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        try
        {
            ((DataInputStream) (obj)).close();
        }
        catch (IOException ioexception3) { }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
        throw exception;
        exception;
        if (true) goto _L5; else goto _L4
_L4:
        exception1;
          goto _L6
    }

    public int a()
    {
        List list = b;
        list;
        JVM INSTR monitorenter ;
        Object obj2;
        obj2 = new ArrayList(b.size());
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            gvi gvi1 = (gvi)iterator.next();
            if (gvi1.c.j() == gvw.c)
            {
                ((List) (obj2)).add(gvi1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_85;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
        int i;
label0:
        {
            synchronized (c)
            {
                i = ((List) (obj2)).hashCode();
                if (i != d)
                {
                    break label0;
                }
            }
            return 0;
        }
        Object obj1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(c)));
        obj = obj1;
        ((DataOutputStream) (obj1)).writeInt(a);
        obj = obj1;
        ((DataOutputStream) (obj1)).writeInt(((List) (obj2)).size());
        obj = obj1;
        Iterator iterator1 = ((List) (obj2)).iterator();
_L2:
        obj = obj1;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        byte abyte0[] = g.a((gvi)iterator1.next());
        obj = obj1;
        ((DataOutputStream) (obj1)).writeInt(abyte0.length);
        obj = obj1;
        ((DataOutputStream) (obj1)).write(abyte0);
        if (true) goto _L2; else goto _L1
        obj2;
_L6:
        obj = obj1;
        Log.e("BackgroundTask", "Cannot save background task results", ((Throwable) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        try
        {
            ((DataOutputStream) (obj1)).close();
        }
        catch (IOException ioexception1) { }
        file;
        JVM INSTR monitorexit ;
        return -1;
_L1:
        obj = obj1;
        d = i;
        obj = obj1;
        if (!Log.isLoggable("BackgroundTask", 4))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj = obj1;
        i = ((List) (obj2)).size();
        obj = obj1;
        (new StringBuilder(38)).append("writeResults: num written: ").append(i);
        obj = obj1;
        i = ((List) (obj2)).size();
        try
        {
            ((DataOutputStream) (obj1)).close();
        }
        catch (IOException ioexception) { }
        file;
        JVM INSTR monitorexit ;
        return i;
        obj;
        file;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        obj = null;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        try
        {
            ((DataOutputStream) (obj)).close();
        }
        catch (IOException ioexception2) { }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int a(int i)
    {
        List list = b;
        list;
        JVM INSTR monitorenter ;
        int j = 0;
        Iterator iterator = b.iterator();
_L1:
        gvi gvi1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_65;
            }
            gvi1 = (gvi)iterator.next();
        } while (gvi1.a != i);
        a(iterator, gvi1);
        j++;
          goto _L1
        list;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public gvv a(int i, String s)
    {
label0:
        {
            synchronized (b)
            {
                Iterator iterator = b.iterator();
                gvi gvi1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    gvi1 = (gvi)iterator.next();
                } while (gvi1.a != i || !TextUtils.equals(gvi1.b, s));
                a(iterator, gvi1);
                s = gvi1.c;
            }
            return s;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(int i, String s, gvv gvv1)
    {
        if (a(gvv1) > 0x1f400)
        {
            if (Log.isLoggable("BackgroundTask", 5))
            {
                gvv1 = String.valueOf(gvv1);
                (new StringBuilder(String.valueOf(gvv1).length() + 34 + String.valueOf(s).length())).append("Result too large to store: ").append(gvv1).append(", tag: ").append(s);
            }
            return;
        }
        synchronized (b)
        {
            b();
            a(new gvi(i, s, gvv1));
            c();
        }
        return;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
    }
}
