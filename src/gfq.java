// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gfq
{

    private static final Object c = new Object();
    private static boolean d;
    private static gfq e;
    private static gz f = new gz();
    private static gz g = new gz();
    private static gz h = new gz();
    private final gki a;
    private final int b;

    public gfq(gki gki1, int i)
    {
        a = gki1;
        b = i;
    }

    public static gfq a()
    {
        f();
        return e;
    }

    public static gfq a(int i)
    {
        f();
        return (gfq)f.get(Integer.valueOf(i));
    }

    public static gfq a(String s)
    {
        if (s == null)
        {
            return null;
        }
        String as[] = s.split("x");
        if (as.length != 3)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "VideoSpecification can't parse ".concat(s);
            } else
            {
                s = new String("VideoSpecification can't parse ");
            }
            gkc.e("vclib", s);
            return null;
        }
        int i;
        int j;
        int k;
        try
        {
            i = Integer.parseInt(as[0]);
            j = Integer.parseInt(as[1]);
            k = Integer.parseInt(as[2]);
        }
        catch (NumberFormatException numberformatexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "VideoSpecification can't parse ".concat(s);
            } else
            {
                s = new String("VideoSpecification can't parse ");
            }
            gkc.e("vclib", s);
            return null;
        }
        return new gfq(new gki(i, j), k);
    }

    public static void a(int i, gfq gfq1)
    {
        synchronized (c)
        {
            f.put(Integer.valueOf(i), gfq1);
        }
        return;
        gfq1;
        obj;
        JVM INSTR monitorexit ;
        throw gfq1;
    }

    public static gfq b(int i)
    {
        f();
        return (gfq)g.get(Integer.valueOf(i));
    }

    public static void b()
    {
        synchronized (c)
        {
            d = true;
            c.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void b(int i, gfq gfq1)
    {
        synchronized (c)
        {
            g.put(Integer.valueOf(i), gfq1);
        }
        return;
        gfq1;
        obj;
        JVM INSTR monitorexit ;
        throw gfq1;
    }

    public static gfq c(int i)
    {
        f();
        return (gfq)h.get(Integer.valueOf(i));
    }

    public static void c(int i, gfq gfq1)
    {
        synchronized (c)
        {
            h.put(Integer.valueOf(i), gfq1);
            if (e == null || gfq1.d() > e.d())
            {
                e = gfq1;
            }
        }
        return;
        gfq1;
        obj;
        JVM INSTR monitorexit ;
        throw gfq1;
    }

    private static void f()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        do
        {
            if (d)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            c.wait(10L);
        } while (System.currentTimeMillis() < l + 10000L);
        throw new RuntimeException("Video specs wait timed out (at least 10000ms elapsed)");
        Object obj1;
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
    }

    public gki c()
    {
        return a;
    }

    public int d()
    {
        return a.a * a.b;
    }

    public int e()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        obj = (gfq)obj;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (a == ((gfq) (obj)).a)
            {
                flag = flag1;
                if (b == ((gfq) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a.hashCode() * 277 + b;
    }

}
