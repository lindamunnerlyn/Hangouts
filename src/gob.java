// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public class gob
{

    private static gob c;
    gog a;
    goh b;
    private gon d;
    private Application e;

    private gob(gon gon, Application application, gog gog1, goh goh1)
    {
        d = gon;
        e = application;
        a = gog1;
        b = goh1;
    }

    public static gob a(gon gon, Application application, goe goe1)
    {
        boolean flag1 = true;
        gob;
        JVM INSTR monitorenter ;
        Object obj;
        g.e(gon);
        g.e(application);
        g.e(goe1);
        obj = goe1.a;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        obj = new goc();
        goe1 = goe1.b;
        if (goe1 != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        goe1 = new god();
        boolean flag;
        if (((gog) (obj)).b() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.c(flag);
        if (goe1.b() > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g.c(flag);
        if (c == null) goto _L2; else goto _L1
_L1:
        gon = c;
_L4:
        gob;
        JVM INSTR monitorexit ;
        return gon;
_L2:
        gon = new gob(gon, application, ((gog) (obj)), goe1);
        c = gon;
        if (true) goto _L4; else goto _L3
_L3:
        gon;
        throw gon;
    }

    public static void a()
    {
        boolean flag = true;
        gob;
        JVM INSTR monitorenter ;
        int i;
        if (c != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 16)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (i == 0) goto _L2; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
_L8:
        if (i != 0) goto _L5; else goto _L4
_L4:
        gob;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L5:
        if (!c.a.a()) goto _L4; else goto _L6
_L6:
        gnw.a(c.d, c.e, c.a).a();
          goto _L4
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
