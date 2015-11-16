// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jzm
    implements kak
{

    private static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger b = Logger.getLogger(jzm.getName());
    private static final jzn c = new jzs();
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(jzx, java/lang/Thread, "thread");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(jzx, jzx, "next");
    private static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(jzm, jzx, "waiters");
    private static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(jzm, jzr, "listeners");
    private static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(jzm, java/lang/Object, "value");
    private static final Object i = new Object();
    private volatile jzr listeners;
    private volatile Object value;
    private volatile jzx waiters;

    protected jzm()
    {
    }

    static Object a(jzm jzm1)
    {
        return jzm1.value;
    }

    private void a(jzx jzx1)
    {
        jzx1.thread = null;
_L10:
        jzx1 = waiters;
        if (jzx1 != jzx.a) goto _L2; else goto _L1
_L1:
        return;
_L6:
        if (jzx1 == null) goto _L1; else goto _L3
_L3:
        jzx jzx3 = jzx1.next;
        if (jzx1.thread == null) goto _L5; else goto _L4
_L4:
        jzx jzx2;
        jzx2 = jzx1;
        jzx1 = jzx3;
          goto _L6
_L5:
        if (jzx2 == null) goto _L8; else goto _L7
_L7:
        jzx2.next = jzx3;
        if (jzx2.thread == null) goto _L10; else goto _L9
_L9:
        jzx1 = jzx2;
          goto _L4
_L8:
        if (!c.a(this, jzx1, jzx3)) goto _L10; else goto _L9
_L2:
        jzx2 = null;
          goto _L6
    }

    static boolean a(jzm jzm1, kak kak1, Object obj)
    {
        return jzm1.a(kak1, obj);
    }

    private boolean a(kak kak1, Object obj)
    {
        if (!(kak1 instanceof jzu)) goto _L2; else goto _L1
_L1:
        kak1 = ((kak) (((jzm)kak1).value));
_L3:
        Object obj1;
        if (c.a(this, obj, kak1))
        {
            j();
            return true;
        } else
        {
            return false;
        }
_L2:
        obj1 = g.a(kak1);
        kak1 = ((kak) (obj1));
        if (obj1 == null)
        {
            try
            {
                kak1 = ((kak) (i));
            }
            // Misplaced declaration of an exception variable
            catch (kak kak1)
            {
                kak1 = new jzp(kak1.getCause());
            }
            // Misplaced declaration of an exception variable
            catch (kak kak1)
            {
                kak1 = new jzo(false, kak1);
            }
            // Misplaced declaration of an exception variable
            catch (kak kak1)
            {
                kak1 = new jzp(kak1);
            }
        }
          goto _L3
    }

    private static Object b(Object obj)
    {
        if (obj instanceof jzo)
        {
            obj = ((jzo)obj).b;
            CancellationException cancellationexception = new CancellationException("Task was cancelled.");
            cancellationexception.initCause(((Throwable) (obj)));
            throw cancellationexception;
        }
        if (obj instanceof jzp)
        {
            throw new ExecutionException(((jzp)obj).b);
        }
        Object obj1 = obj;
        if (obj == i)
        {
            obj1 = null;
        }
        return obj1;
    }

    private static void b(Runnable runnable, Executor executor)
    {
        try
        {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            Logger logger = b;
            Level level = Level.SEVERE;
            runnable = String.valueOf(runnable);
            executor = String.valueOf(executor);
            logger.log(level, (new StringBuilder(String.valueOf(runnable).length() + 57 + String.valueOf(executor).length())).append("RuntimeException while executing runnable ").append(runnable).append(" with executor ").append(executor).toString(), runtimeexception);
            return;
        }
    }

    static jzn d()
    {
        return c;
    }

    static AtomicReferenceFieldUpdater e()
    {
        return d;
    }

    static AtomicReferenceFieldUpdater f()
    {
        return e;
    }

    static AtomicReferenceFieldUpdater g()
    {
        return f;
    }

    static AtomicReferenceFieldUpdater h()
    {
        return g;
    }

    static AtomicReferenceFieldUpdater i()
    {
        return h;
    }

    private void j()
    {
        Object obj;
        do
        {
            obj = waiters;
        } while (!c.a(this, ((jzx) (obj)), jzx.a));
        for (; obj != null; obj = ((jzx) (obj)).next)
        {
            ((jzx) (obj)).a();
        }

        jzr jzr1;
        do
        {
            jzr1 = listeners;
        } while (!c.a(this, jzr1, jzr.a));
        obj = null;
        jzr jzr2;
        do
        {
            jzr2 = ((jzr) (obj));
            if (jzr1 == null)
            {
                break;
            }
            jzr2 = jzr1.next;
            jzr1.next = ((jzr) (obj));
            obj = jzr1;
            jzr1 = jzr2;
        } while (true);
        for (; jzr2 != null; jzr2 = jzr2.next)
        {
            b(jzr2.b, jzr2.c);
        }

        c();
    }

    protected void a()
    {
    }

    public void a(Runnable runnable, Executor executor)
    {
        n.b(runnable, "Runnable was null.");
        n.b(executor, "Executor was null.");
        jzr jzr1 = listeners;
        if (jzr1 != jzr.a)
        {
            jzr jzr3 = new jzr(runnable, executor);
            jzr jzr2;
            do
            {
                jzr3.next = jzr1;
                if (c.a(this, jzr1, jzr3))
                {
                    return;
                }
                jzr2 = listeners;
                jzr1 = jzr2;
            } while (jzr2 != jzr.a);
        }
        b(runnable, executor);
    }

    final void a(Future future)
    {
        boolean flag;
        if (future != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag & isCancelled())
        {
            future.cancel(b());
        }
    }

    protected boolean a(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = i;
        }
        if (c.a(this, null, obj1))
        {
            j();
            return true;
        } else
        {
            return false;
        }
    }

    protected boolean a(Throwable throwable)
    {
        throwable = new jzp((Throwable)n.b(throwable));
        if (c.a(this, null, throwable))
        {
            j();
            return true;
        } else
        {
            return false;
        }
    }

    protected final boolean b()
    {
        Object obj = value;
        return (obj instanceof jzo) && ((jzo)obj).a;
    }

    void c()
    {
    }

    public boolean cancel(boolean flag)
    {
        Object obj1 = value;
        boolean flag1;
        if (obj1 == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 | (obj1 instanceof jzt))
        {
            Object obj;
            jzo jzo1;
            if (a)
            {
                obj = new CancellationException("Future.cancel() was called.");
            } else
            {
                obj = null;
            }
            jzo1 = new jzo(flag, ((Throwable) (obj)));
            obj = obj1;
            do
            {
                if (c.a(this, obj, jzo1))
                {
                    if (flag)
                    {
                        a();
                    }
                    j();
                    if (obj instanceof jzt)
                    {
                        ((jzt)obj).a.cancel(flag);
                    }
                    return true;
                }
                obj1 = value;
                obj = obj1;
            } while (obj1 instanceof jzt);
        }
        return false;
    }

    public Object get()
    {
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
        Object obj = value;
        boolean flag;
        boolean flag2;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!(obj instanceof jzt))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag & flag2)
        {
            return b(obj);
        }
        obj = waiters;
        if (obj != jzx.a)
        {
            jzx jzx2 = new jzx((byte)0);
            jzx jzx1;
            do
            {
                jzx2.a(((jzx) (obj)));
                if (c.a(this, ((jzx) (obj)), jzx2))
                {
                    do
                    {
                        LockSupport.park(this);
                        if (Thread.interrupted())
                        {
                            a(jzx2);
                            throw new InterruptedException();
                        }
                        obj = value;
                        boolean flag1;
                        boolean flag3;
                        if (obj != null)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (!(obj instanceof jzt))
                        {
                            flag3 = true;
                        } else
                        {
                            flag3 = false;
                        }
                    } while (!(flag1 & flag3));
                    return b(obj);
                }
                jzx1 = waiters;
                obj = jzx1;
            } while (jzx1 != jzx.a);
        }
        return b(value);
    }

    public Object get(long l, TimeUnit timeunit)
    {
        jzx jzx2;
        long l1;
        l = timeunit.toNanos(l);
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
        timeunit = ((TimeUnit) (value));
        boolean flag;
        boolean flag3;
        if (timeunit != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!(timeunit instanceof jzt))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag & flag3)
        {
            return b(timeunit);
        }
        if (l > 0L)
        {
            l1 = System.nanoTime() + l;
        } else
        {
            l1 = 0L;
        }
        if (l < 1000L) goto _L2; else goto _L1
_L1:
        timeunit = waiters;
        if (timeunit == jzx.a) goto _L4; else goto _L3
_L3:
        jzx2 = new jzx((byte)0);
_L7:
        jzx2.a(timeunit);
        if (!c.a(this, timeunit, jzx2)) goto _L6; else goto _L5
_L5:
        long l2;
        do
        {
            LockSupport.parkNanos(this, l);
            if (Thread.interrupted())
            {
                a(jzx2);
                throw new InterruptedException();
            }
            timeunit = ((TimeUnit) (value));
            boolean flag1;
            boolean flag4;
            if (timeunit != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!(timeunit instanceof jzt))
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (flag1 & flag4)
            {
                return b(timeunit);
            }
            l2 = l1 - System.nanoTime();
            l = l2;
        } while (l2 >= 1000L);
        a(jzx2);
        l = l2;
_L2:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        timeunit = ((TimeUnit) (value));
        jzx jzx1;
        boolean flag2;
        boolean flag5;
        if (timeunit != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!(timeunit instanceof jzt))
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (flag2 & flag5)
        {
            return b(timeunit);
        }
        break MISSING_BLOCK_LABEL_314;
_L6:
        jzx1 = waiters;
        timeunit = jzx1;
        if (jzx1 != jzx.a) goto _L7; else goto _L4
_L4:
        return b(value);
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
        l = l1 - System.nanoTime();
          goto _L2
        throw new TimeoutException();
    }

    public boolean isCancelled()
    {
        return value instanceof jzo;
    }

    public boolean isDone()
    {
        boolean flag1 = true;
        Object obj = value;
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj instanceof jzt)
        {
            flag1 = false;
        }
        return flag & flag1;
    }

    static 
    {
        try
        {
            jzv.values()[0].a();
        }
        catch (Throwable throwable) { }
    }
}
