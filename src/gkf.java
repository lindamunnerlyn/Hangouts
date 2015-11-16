// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class gkf
{

    private final gkb a = new gkb(500);
    private final Object b = new Object();

    public gkf()
    {
    }

    public void a(int i, String s, String s1)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        gkg gkg1 = (gkg)a.b();
        if (gkg1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        gkg1 = new gkg();
        gkg1.a(Process.myTid(), i, System.currentTimeMillis(), s, s1);
        a.a(gkg1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(PrintWriter printwriter)
    {
        SimpleDateFormat simpledateformat;
        int j;
        simpledateformat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        j = Process.myPid();
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= a.a())
        {
            break; /* Loop/switch isn't completed */
        }
        gkg gkg1 = (gkg)a.a(i);
        printwriter.println(String.format("%s %5d %5d %s %s: %s", new Object[] {
            simpledateformat.format(Long.valueOf(gkg1.c)), Integer.valueOf(j), Integer.valueOf(gkg1.a), gkg1.b, gkg1.d, gkg1.e
        }));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
    }
}
