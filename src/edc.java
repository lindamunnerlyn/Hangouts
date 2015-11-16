// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.PowerManager;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class edc
{

    private static final Object a = new Object();
    private static volatile boolean b = false;
    private static BufferedOutputStream c;
    private static PowerManager d;
    private static volatile String e;

    public static void a()
    {
        e = null;
    }

    public static void a(ede ede1)
    {
label0:
        {
            synchronized (a)
            {
                if (b)
                {
                    break label0;
                }
            }
            return;
        }
        c.write(ede.a(ede1).getBytes());
        c.flush();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        ede1;
        obj;
        JVM INSTR monitorexit ;
        throw ede1;
        ede1;
        eev.e("Babel", "error writing to datalog output stream", ede1);
          goto _L1
    }

    public static void a(String s)
    {
        e = s;
    }

    public static boolean b()
    {
        return b;
    }

    public static void c()
    {
label0:
        {
            synchronized (a)
            {
                if (b)
                {
                    break label0;
                }
            }
            return;
        }
        c.flush();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        IOException ioexception;
        ioexception;
        eev.e("Babel", "error flushing datalog output stream", ioexception);
          goto _L1
    }

    static PowerManager d()
    {
        return d;
    }

    static String e()
    {
        return e;
    }

    static void f()
    {
        g();
    }

    private static void g()
    {
        Object obj;
        boolean flag;
        obj = g.nU;
        flag = g.a(g.nU, "babel_data_logging", false);
        Object obj2 = a;
        obj2;
        JVM INSTR monitorenter ;
        if (flag == b) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        boolean flag1;
        d = (PowerManager)((Context) (obj)).getSystemService("power");
        flag1 = ((Context) (obj)).getFileStreamPath("datalogs.csv").exists();
        obj = ((Context) (obj)).openFileOutput("datalogs.csv", 32768);
_L9:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        c = new BufferedOutputStream(((java.io.OutputStream) (obj)));
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        c.write(ede.c().getBytes());
        c.flush();
_L5:
        b = flag;
_L2:
        obj2;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        eev.e("Babel", "error opening datalog output stream", ((Throwable) (obj1)));
        obj1 = null;
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj1;
        eev.e("Babel", "error writing header to datalog output stream", ((Throwable) (obj1)));
          goto _L5
_L4:
        d = null;
        obj1 = c;
        if (obj1 == null) goto _L5; else goto _L6
_L6:
        c.close();
_L7:
        c = null;
          goto _L5
        obj1;
        eev.e("Babel", "error closing datalog output stream", ((Throwable) (obj1)));
          goto _L7
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static 
    {
        g();
        g.a(g.nU).a(new edd());
    }
}
