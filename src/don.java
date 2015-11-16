// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class don
{

    private static final boolean b = false;
    public final Handler a = new Handler(Looper.getMainLooper());
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final LinkedBlockingQueue d = new LinkedBlockingQueue();
    private volatile Thread e;
    private final Object f = new Object();

    public don()
    {
    }

    static void a(don don1)
    {
        ArrayList arraylist = new ArrayList();
_L6:
        Object obj;
        Object obj1;
        if (b)
        {
            obj = String.valueOf(don1.b());
            if (((String) (obj)).length() != 0)
            {
                obj = "loadKeys looping: ".concat(((String) (obj)));
            } else
            {
                obj = new String("loadKeys looping: ");
            }
            eev.b("Babel", ((String) (obj)));
        }
        if (don1.d.drainTo(arraylist) != 0) goto _L2; else goto _L1
_L1:
        try
        {
            obj = (String)don1.d.poll(60L, TimeUnit.SECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = String.valueOf(obj);
            eev.g("Babel", (new StringBuilder(String.valueOf(obj).length() + 47)).append("Our background loader thread was interrupted?? ").append(((String) (obj))).toString());
            obj = null;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        obj1 = don1.f;
        obj1;
        JVM INSTR monitorenter ;
        if (don1.d.drainTo(arraylist) != 0)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        if (!b) goto _L4; else goto _L3
_L3:
        obj = String.valueOf(don1.e.getName());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        obj = "Exiting loading thread: ".concat(((String) (obj)));
_L5:
        eev.b("Babel", ((String) (obj)));
        eev.b("Babel", don1.b());
_L4:
        don1.e = null;
        return;
        obj = new String("Exiting loading thread: ");
          goto _L5
        don1;
        obj1;
        JVM INSTR monitorexit ;
        throw don1;
        obj1;
        JVM INSTR monitorexit ;
_L7:
        don1.d.drainTo(arraylist);
_L2:
        if (b)
        {
            int i = arraylist.size();
            eev.b("Babel", (new StringBuilder(25)).append("Loading ").append(i).append(" keys.").toString());
        }
        try
        {
            don1.a(arraylist);
        }
        catch (apu apu1) { }
        arraylist.clear();
          goto _L6
        arraylist.add(obj);
          goto _L7
    }

    private void c()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (e != null) goto _L2; else goto _L1
_L1:
        e = new Thread(new doq(this), a());
        if (!b) goto _L4; else goto _L3
_L3:
        String s;
        s = String.valueOf(e.getName());
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        s = "Starting loader thread: ".concat(s);
_L6:
        eev.b("Babel", s);
_L4:
        e.start();
_L2:
        return;
        s = new String("Starting loader thread: ");
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean f(dor dor1)
    {
        Object obj1;
        String s1;
        List list;
        boolean flag;
        boolean flag1 = true;
        s1 = dor1.c();
        if (b)
        {
            Object obj = String.valueOf(b());
            if (((String) (obj)).length() != 0)
            {
                obj = "addRequest 1: ".concat(((String) (obj)));
            } else
            {
                obj = new String("addRequest 1: ");
            }
            eev.b("Babel", ((String) (obj)));
        }
        if (dor1.c == null || dor1.c == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        dor1.c = this;
        obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        list = (List)c.get(s1);
        if (list != null) goto _L2; else goto _L1
_L1:
        obj = new ArrayList();
        ((List) (obj)).add(dor1);
        c.put(s1, obj);
        if (!b) goto _L4; else goto _L3
_L3:
        dor1 = String.valueOf(b());
        if (dor1.length() == 0) goto _L6; else goto _L5
_L5:
        dor1 = "addRequest 2: ".concat(dor1);
_L11:
        eev.b("Babel", dor1);
_L4:
        d.add(s1);
        flag = flag1;
        if (!b) goto _L8; else goto _L7
_L7:
        dor1 = String.valueOf(s1);
        if (dor1.length() == 0) goto _L10; else goto _L9
_L9:
        dor1 = "Added first request for: ".concat(dor1);
_L12:
        eev.b("Babel", dor1);
        flag = flag1;
_L8:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
_L6:
        dor1 = new String("addRequest 2: ");
          goto _L11
        dor1;
        obj1;
        JVM INSTR monitorexit ;
        throw dor1;
_L10:
        dor1 = new String("Added first request for: ");
          goto _L12
_L2:
        if (!b) goto _L14; else goto _L13
_L13:
        String s;
        s = String.valueOf(s1);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        s = "Added additional request for: ".concat(s);
_L15:
        eev.b("Babel", s);
_L14:
        list.add(dor1);
        flag = false;
          goto _L8
        s = new String("Added additional request for: ");
          goto _L15
    }

    protected abstract String a();

    protected void a(Runnable runnable)
    {
        a.post(runnable);
    }

    protected abstract void a(ArrayList arraylist);

    public boolean a(dor dor1)
    {
        gdv.a();
        while (dor1 == null || !f(dor1)) 
        {
            return false;
        }
        c();
        return false;
    }

    protected boolean a(String s)
    {
        return c.containsKey(s);
    }

    protected String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = d.size();
        stringbuilder.append((new StringBuilder(43)).append("Number of keys in mPendingKeys: ").append(i).toString());
        i = c.size();
        stringbuilder.append((new StringBuilder(46)).append("\nNumber of keys in mRequestsByKey: ").append(i).toString());
        return stringbuilder.toString();
    }

    protected List b(String s)
    {
        return (List)c.remove(s);
    }

    public void b(dor dor1)
    {
        gdv.a();
        e(dor1);
    }

    protected dor c(String s)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        s = (List)c.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (s.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        s = (dor)s.get(0);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s = null;
          goto _L1
    }

    public void c(dor dor1)
    {
        a(new doo(this, dor1));
    }

    public void d(dor dor1)
    {
        a(new dop(this, dor1));
    }

    protected void d(String s)
    {
        synchronized (f)
        {
            d.add(s);
        }
        c();
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void e(dor dor1)
    {
        if (dor1.c == null)
        {
            return;
        }
        gdv.a(dor1.c, this);
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        String s;
        List list;
        s = dor1.c();
        list = (List)c.get(s);
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        dor1;
        obj;
        JVM INSTR monitorexit ;
        throw dor1;
        dor1.c = null;
        list.remove(dor1);
        if (list.size() != 0) goto _L2; else goto _L1
_L1:
        c.remove(s);
        d.remove(s);
        if (!b) goto _L2; else goto _L3
_L3:
        dor1 = String.valueOf(s);
        if (dor1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        dor1 = "Removed request for: ".concat(dor1);
_L5:
        eev.b("Babel", dor1);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        dor1 = new String("Removed request for: ");
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        hnc hnc = eev.p;
    }
}
