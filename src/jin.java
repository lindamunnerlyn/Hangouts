// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

public final class jin extends ReentrantLock
{

    final LocalCache a;
    public volatile int b;
    long c;
    public int d;
    int e;
    public volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k;
    final Queue l;
    final Queue m;

    private com.google.common.cache.LocalCache.ReferenceEntry a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        if (referenceentry.getKey() != null)
        {
            jja jja1 = referenceentry.getValueReference();
            Object obj = jja1.get();
            if (obj != null || !jja1.d())
            {
                referenceentry = a.p.a(this, referenceentry, referenceentry1);
                referenceentry.setValueReference(jja1.a(i, obj, referenceentry));
                return referenceentry;
            }
        }
        return null;
    }

    private com.google.common.cache.LocalCache.ReferenceEntry a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1, Object obj, jja jja1, jjl jjl1)
    {
        a(obj, jja1, jjl1);
        l.remove(referenceentry1);
        m.remove(referenceentry1);
        if (jja1.c())
        {
            jja1.a(null);
            return referenceentry;
        } else
        {
            return b(referenceentry, referenceentry1);
        }
    }

    private com.google.common.cache.LocalCache.ReferenceEntry a(Object obj, int i1, long l1)
    {
        obj = d(obj, i1);
        if (obj == null)
        {
            return null;
        }
        if (a.b(((com.google.common.cache.LocalCache.ReferenceEntry) (obj)), l1))
        {
            a(l1);
            return null;
        } else
        {
            return ((com.google.common.cache.LocalCache.ReferenceEntry) (obj));
        }
    }

    private com.google.common.cache.LocalCache.ReferenceEntry a(Object obj, int i1, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return a.p.a(this, n.b(obj), i1, referenceentry);
    }

    private Object a(Object obj, int i1, zn zn)
    {
        jik jik1 = a(obj, i1, true);
        if (jik1 == null)
        {
            return null;
        }
        zn = jik1.a(obj, zn);
        zn.a(new jio(this, obj, i1, jik1, zn), g.A());
        if (!zn.isDone())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = g.a(zn);
        return obj;
        obj;
        return null;
    }

    private jik a(Object obj, int i1, boolean flag)
    {
        lock();
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        long l1;
        l1 = a.o.a();
        c(l1);
        atomicreferencearray = f;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(j1);
        Object obj1 = referenceentry;
_L1:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        Object obj2 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj1)).getKey();
        if (((com.google.common.cache.LocalCache.ReferenceEntry) (obj1)).getHash() != i1 || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        long l2;
        long l3;
        if (!a.e.a(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj1)).getValueReference();
        if (((jja) (obj)).c())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        l2 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj1)).getWriteTime();
        l3 = a.m;
        if (l1 - l2 >= l3)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        unlock();
        h();
        return null;
        d = d + 1;
        obj = new jik(((jja) (obj)));
        ((com.google.common.cache.LocalCache.ReferenceEntry) (obj1)).setValueReference(((jja) (obj)));
        unlock();
        h();
        return ((jik) (obj));
        obj1 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj1)).getNext();
          goto _L1
        d = d + 1;
        obj1 = new jik();
        obj = a(obj, i1, referenceentry);
        ((com.google.common.cache.LocalCache.ReferenceEntry) (obj)).setValueReference(((jja) (obj1)));
        atomicreferencearray.set(j1, obj);
        unlock();
        h();
        return ((jik) (obj1));
        obj;
        unlock();
        h();
        throw obj;
    }

    private void a(long l1)
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b(l1);
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    private void a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        a(referenceentry, jjl.c);
        l.remove(referenceentry);
        m.remove(referenceentry);
    }

    private void a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, Object obj, long l1)
    {
        jja jja1 = referenceentry.getValueReference();
        int i1 = a.j.u();
        long l2;
        boolean flag;
        if (i1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Weights must be non-negative");
        referenceentry.setValueReference(a.h.a(this, referenceentry, obj, i1));
        e();
        l2 = c;
        c = (long)i1 + l2;
        if (a.f())
        {
            referenceentry.setAccessTime(l1);
        }
        if (a.e())
        {
            referenceentry.setWriteTime(l1);
        }
        m.add(referenceentry);
        l.add(referenceentry);
        jja1.a(obj);
    }

    private void a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, jjl jjl1)
    {
        Object obj = referenceentry.getKey();
        referenceentry.getHash();
        a(obj, referenceentry.getValueReference(), jjl1);
    }

    private void a(Object obj, jja jja1, jjl jjl1)
    {
        c = c - (long)jja1.a();
        jjl1.a();
        if (a.n != LocalCache.s)
        {
            obj = new jjr(obj, jja1.get(), jjl1);
            a.n.offer(obj);
        }
    }

    private boolean a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, int i1, jjl jjl1)
    {
        int j1 = b;
        AtomicReferenceArray atomicreferencearray = f;
        i1 &= atomicreferencearray.length() - 1;
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry2 = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(i1);
        for (com.google.common.cache.LocalCache.ReferenceEntry referenceentry1 = referenceentry2; referenceentry1 != null; referenceentry1 = referenceentry1.getNext())
        {
            if (referenceentry1 == referenceentry)
            {
                d = d + 1;
                referenceentry = a(referenceentry2, referenceentry1, referenceentry1.getKey(), referenceentry1.getValueReference(), jjl1);
                int k1 = b;
                atomicreferencearray.set(i1, referenceentry);
                b = k1 - 1;
                return true;
            }
        }

        return false;
    }

    private boolean a(Object obj, int i1, jik jik1)
    {
        lock();
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        atomicreferencearray = f;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry = referenceentry1;
_L6:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!a.e.a(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (referenceentry.getValueReference() != jik1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (!jik1.d()) goto _L2; else goto _L1
_L1:
        referenceentry.setValueReference(jik1.f());
_L4:
        unlock();
        h();
        return true;
_L2:
        atomicreferencearray.set(j1, b(referenceentry1, referenceentry));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        unlock();
        h();
        throw obj;
        unlock();
        h();
        return false;
        referenceentry = referenceentry.getNext();
        if (true) goto _L6; else goto _L5
_L5:
        unlock();
        h();
        return false;
    }

    private boolean a(Object obj, int i1, jik jik1, Object obj1)
    {
        lock();
        int k1;
        long l1;
        l1 = a.o.a();
        c(l1);
        k1 = b + 1;
        int j1 = k1;
        Object obj3;
        Object obj4;
        if (k1 > e)
        {
            g();
            j1 = b + 1;
        }
        obj4 = f;
        k1 = i1 & ((AtomicReferenceArray) (obj4)).length() - 1;
        obj3 = (com.google.common.cache.LocalCache.ReferenceEntry)((AtomicReferenceArray) (obj4)).get(k1);
        Object obj2 = obj3;
_L13:
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        Object obj5 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)).getKey();
        if (((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)).getHash() != i1 || obj5 == null) goto _L4; else goto _L3
_L3:
        if (!a.e.a(obj, obj5)) goto _L4; else goto _L5
_L5:
        obj3 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)).getValueReference();
        obj4 = ((jja) (obj3)).get();
        if (jik1 == obj3) goto _L7; else goto _L6
_L6:
        if (obj4 != null) goto _L9; else goto _L8
_L8:
        if (obj3 == LocalCache.r) goto _L9; else goto _L7
_L7:
        d = d + 1;
        if (!jik1.d())
        {
            break MISSING_BLOCK_LABEL_355;
        }
        if (obj4 != null) goto _L11; else goto _L10
_L10:
        obj3 = jjl.c;
_L12:
        a(obj, ((jja) (jik1)), ((jjl) (obj3)));
        i1 = j1 - 1;
_L14:
        a(((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)), obj1, l1);
        b = i1;
        f();
        unlock();
        h();
        return true;
_L11:
        obj3 = jjl.b;
          goto _L12
_L9:
        a(obj, ((jja) (new jji(obj1, 0))), jjl.b);
        unlock();
        h();
        return false;
_L4:
        obj2 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)).getNext();
          goto _L13
_L2:
        d = d + 1;
        obj = a(obj, i1, ((com.google.common.cache.LocalCache.ReferenceEntry) (obj3)));
        a(((com.google.common.cache.LocalCache.ReferenceEntry) (obj)), obj1, l1);
        ((AtomicReferenceArray) (obj4)).set(k1, obj);
        b = j1;
        f();
        unlock();
        h();
        return true;
        obj;
        unlock();
        h();
        throw obj;
        i1 = j1;
          goto _L14
    }

    private com.google.common.cache.LocalCache.ReferenceEntry b(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        int i1 = b;
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry3 = referenceentry1.getNext();
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry2 = referenceentry;
        referenceentry = referenceentry3;
        while (referenceentry2 != referenceentry1) 
        {
            com.google.common.cache.LocalCache.ReferenceEntry referenceentry4 = a(referenceentry2, referenceentry);
            if (referenceentry4 != null)
            {
                referenceentry = referenceentry4;
            } else
            {
                a(referenceentry2);
                i1--;
            }
            referenceentry2 = referenceentry2.getNext();
        }
        b = i1;
        return referenceentry;
    }

    private void b(long l1)
    {
        e();
        do
        {
            com.google.common.cache.LocalCache.ReferenceEntry referenceentry = (com.google.common.cache.LocalCache.ReferenceEntry)l.peek();
            if (referenceentry != null && a.b(referenceentry, l1))
            {
                if (!a(referenceentry, referenceentry.getHash(), jjl.d))
                {
                    throw new AssertionError();
                }
            } else
            {
                do
                {
                    com.google.common.cache.LocalCache.ReferenceEntry referenceentry1 = (com.google.common.cache.LocalCache.ReferenceEntry)m.peek();
                    if (referenceentry1 != null && a.b(referenceentry1, l1))
                    {
                        if (!a(referenceentry1, referenceentry1.getHash(), jjl.d))
                        {
                            throw new AssertionError();
                        }
                    } else
                    {
                        return;
                    }
                } while (true);
            }
        } while (true);
    }

    private void b(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, long l1)
    {
        if (a.f())
        {
            referenceentry.setAccessTime(l1);
        }
        m.add(referenceentry);
    }

    private void c()
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        d();
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    private void c(long l1)
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_28;
        }
        d();
        b(l1);
        k.set(0);
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    private com.google.common.cache.LocalCache.ReferenceEntry d(Object obj, int i1)
    {
        Object obj1;
        obj1 = f;
        obj1 = (com.google.common.cache.LocalCache.ReferenceEntry)((AtomicReferenceArray) (obj1)).get(((AtomicReferenceArray) (obj1)).length() - 1 & i1);
_L2:
        Object obj2;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (((com.google.common.cache.LocalCache.ReferenceEntry) (obj1)).getHash() == i1)
        {
            obj2 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj1)).getKey();
            if (obj2 != null)
            {
                break; /* Loop/switch isn't completed */
            }
            c();
        }
_L4:
        obj1 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj1)).getNext();
        if (true) goto _L2; else goto _L1
_L1:
        if (!a.e.a(obj, obj2)) goto _L4; else goto _L3
_L3:
        return ((com.google.common.cache.LocalCache.ReferenceEntry) (obj1));
        return null;
    }

    private void d()
    {
        int k1 = 0;
        if (a.g())
        {
            int i1 = 0;
            do
            {
                Object obj = h.poll();
                if (obj == null)
                {
                    break;
                }
                obj = (com.google.common.cache.LocalCache.ReferenceEntry)obj;
                a.a(((com.google.common.cache.LocalCache.ReferenceEntry) (obj)));
                i1++;
            } while (i1 != 16);
        }
        if (a.h())
        {
            int j1 = k1;
            do
            {
                Object obj1 = i.poll();
                if (obj1 == null)
                {
                    break;
                }
                obj1 = (jja)obj1;
                a.a(((jja) (obj1)));
                k1 = j1 + 1;
                j1 = k1;
            } while (k1 != 16);
        }
    }

    private void e()
    {
        do
        {
            com.google.common.cache.LocalCache.ReferenceEntry referenceentry = (com.google.common.cache.LocalCache.ReferenceEntry)j.poll();
            if (referenceentry == null)
            {
                break;
            }
            if (m.contains(referenceentry))
            {
                m.add(referenceentry);
            }
        } while (true);
    }

    private void f()
    {
        if (a.a())
        {
            e();
            while (c > g) 
            {
label0:
                {
                    Iterator iterator = m.iterator();
                    com.google.common.cache.LocalCache.ReferenceEntry referenceentry;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        referenceentry = (com.google.common.cache.LocalCache.ReferenceEntry)iterator.next();
                    } while (referenceentry.getValueReference().a() <= 0);
                    if (!a(referenceentry, referenceentry.getHash(), jjl.e))
                    {
                        throw new AssertionError();
                    }
                }
            }
        }
        return;
        throw new AssertionError();
    }

    private void g()
    {
        AtomicReferenceArray atomicreferencearray;
        AtomicReferenceArray atomicreferencearray1;
        int i1;
        int k1;
        int i2;
        int j2;
        atomicreferencearray = f;
        i2 = atomicreferencearray.length();
        if (i2 >= 0x40000000)
        {
            return;
        }
        i1 = b;
        atomicreferencearray1 = new AtomicReferenceArray(i2 << 1);
        e = (atomicreferencearray1.length() * 3) / 4;
        j2 = atomicreferencearray1.length() - 1;
        k1 = 0;
_L2:
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry1;
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry2;
        int j1;
        if (k1 >= i2)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        referenceentry2 = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(k1);
        if (referenceentry2 != null)
        {
            referenceentry1 = referenceentry2.getNext();
            j1 = referenceentry2.getHash() & j2;
            if (referenceentry1 != null)
            {
                break; /* Loop/switch isn't completed */
            }
            atomicreferencearray1.set(j1, referenceentry2);
        }
_L4:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry;
        referenceentry = referenceentry2;
        for (; referenceentry1 != null; referenceentry1 = referenceentry1.getNext())
        {
            int l1 = referenceentry1.getHash() & j2;
            if (l1 != j1)
            {
                referenceentry = referenceentry1;
                j1 = l1;
            }
        }

        atomicreferencearray1.set(j1, referenceentry);
        referenceentry1 = referenceentry2;
        j1 = i1;
_L5:
        i1 = j1;
        if (referenceentry1 == referenceentry) goto _L4; else goto _L3
_L3:
        i1 = referenceentry1.getHash() & j2;
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry3 = a(referenceentry1, (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray1.get(i1));
        if (referenceentry3 != null)
        {
            atomicreferencearray1.set(i1, referenceentry3);
            i1 = j1;
        } else
        {
            a(referenceentry1);
            i1 = j1 - 1;
        }
        referenceentry1 = referenceentry1.getNext();
        j1 = i1;
          goto _L5
          goto _L4
        f = atomicreferencearray1;
        b = i1;
        return;
    }

    private void h()
    {
        if (!isHeldByCurrentThread())
        {
            a.k();
        }
    }

    public Object a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, long l1)
    {
        if (referenceentry.getKey() == null)
        {
            c();
            return null;
        }
        Object obj = referenceentry.getValueReference().get();
        if (obj == null)
        {
            c();
            return null;
        }
        if (a.b(referenceentry, l1))
        {
            a(l1);
            return null;
        } else
        {
            return obj;
        }
    }

    public Object a(Object obj, int i1)
    {
        long l1;
        if (b == 0)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        l1 = a.o.a();
        obj = a(obj, i1, l1);
        if (obj == null)
        {
            b();
            return null;
        }
        Object obj1 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj)).getValueReference().get();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        Object obj2;
        zn zn;
        if (a.f())
        {
            ((com.google.common.cache.LocalCache.ReferenceEntry) (obj)).setAccessTime(l1);
        }
        j.add(obj);
        obj2 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj)).getKey();
        zn = a.q;
        if (!a.d() || l1 - ((com.google.common.cache.LocalCache.ReferenceEntry) (obj)).getWriteTime() <= a.m || ((com.google.common.cache.LocalCache.ReferenceEntry) (obj)).getValueReference().c()) goto _L4; else goto _L3
_L3:
        obj = a(obj2, i1, zn);
        if (obj == null) goto _L4; else goto _L5
_L5:
        b();
        return obj;
_L4:
        obj = obj1;
        if (true) goto _L5; else goto _L2
_L2:
        c();
        b();
        return null;
        obj;
        b();
        throw obj;
    }

    public Object a(Object obj, int i1, Object obj1)
    {
        lock();
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        long l1;
        l1 = a.o.a();
        c(l1);
        atomicreferencearray = f;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry = referenceentry1;
_L2:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        jja jja1;
        Object obj3;
        if (!a.e.a(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_239;
        }
        jja1 = referenceentry.getValueReference();
        obj3 = jja1.get();
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (jja1.d())
        {
            i1 = b;
            d = d + 1;
            obj = a(referenceentry1, referenceentry, obj2, jja1, jjl.c);
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
        }
        unlock();
        h();
        return null;
        d = d + 1;
        a(obj, jja1, jjl.b);
        a(referenceentry, obj1, l1);
        f();
        unlock();
        h();
        return obj3;
        referenceentry = referenceentry.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        h();
        return null;
        obj;
        unlock();
        h();
        throw obj;
    }

    public Object a(Object obj, int i1, Object obj1, boolean flag)
    {
        lock();
        Object obj3;
        Object obj4;
        int k1;
        long l1;
        l1 = a.o.a();
        c(l1);
        if (b + 1 > e)
        {
            g();
            int j1 = b;
        }
        obj4 = f;
        k1 = i1 & ((AtomicReferenceArray) (obj4)).length() - 1;
        obj3 = (com.google.common.cache.LocalCache.ReferenceEntry)((AtomicReferenceArray) (obj4)).get(k1);
        Object obj2 = obj3;
_L2:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        Object obj5 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)).getKey();
        if (((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)).getHash() != i1 || obj5 == null)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        if (!a.e.a(obj, obj5))
        {
            break MISSING_BLOCK_LABEL_297;
        }
        obj3 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)).getValueReference();
        obj4 = ((jja) (obj3)).get();
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        d = d + 1;
        if (!((jja) (obj3)).d())
        {
            break MISSING_BLOCK_LABEL_210;
        }
        a(obj, ((jja) (obj3)), jjl.c);
        a(((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)), obj1, l1);
        i1 = b;
_L1:
        b = i1;
        f();
        unlock();
        h();
        return null;
        a(((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)), obj1, l1);
        i1 = b + 1;
          goto _L1
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        b(((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)), l1);
        unlock();
        h();
        return obj4;
        d = d + 1;
        a(obj, ((jja) (obj3)), jjl.b);
        a(((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)), obj1, l1);
        f();
        unlock();
        h();
        return obj4;
        obj2 = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj2)).getNext();
          goto _L2
        d = d + 1;
        obj = a(obj, i1, ((com.google.common.cache.LocalCache.ReferenceEntry) (obj3)));
        a(((com.google.common.cache.LocalCache.ReferenceEntry) (obj)), obj1, l1);
        ((AtomicReferenceArray) (obj4)).set(k1, obj);
        b = b + 1;
        f();
        unlock();
        h();
        return null;
        obj;
        unlock();
        h();
        throw obj;
    }

    Object a(Object obj, int i1, jik jik1, jsj jsj1)
    {
        jsj jsj2 = null;
        jsj1 = ((jsj) (g.a(jsj1)));
        if (jsj1 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        jsj2 = jsj1;
        throw new jhr((new StringBuilder("CacheLoader returned null for key ")).append(obj).append(".").toString());
        jsj1;
        if (jsj2 == null)
        {
            jik1.e();
            a(obj, i1, jik1);
        }
        throw jsj1;
        jsj2 = jsj1;
        jik1.e();
        jsj2 = jsj1;
        a(obj, i1, jik1, jsj1);
        if (jsj1 == null)
        {
            jik1.e();
            a(obj, i1, jik1);
        }
        return jsj1;
    }

    public void a()
    {
        if (b == 0) goto _L2; else goto _L1
_L1:
        lock();
        AtomicReferenceArray atomicreferencearray = f;
        int i1 = 0;
_L7:
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry;
        if (i1 >= atomicreferencearray.length())
        {
            break MISSING_BLOCK_LABEL_200;
        }
        referenceentry = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(i1);
_L4:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (referenceentry.getValueReference().d())
        {
            a(referenceentry, jjl.a);
        }
        referenceentry = referenceentry.getNext();
        if (true) goto _L4; else goto _L3
_L5:
        Exception exception;
        for (; i1 >= atomicreferencearray.length(); i1 = 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }

        atomicreferencearray.set(i1, null);
        i1++;
          goto _L5
        if (a.g())
        {
            while (h.poll() != null) ;
        }
        if (a.h())
        {
            while (i.poll() != null) ;
        }
        l.clear();
        m.clear();
        k.set(0);
        d = d + 1;
        b = 0;
        unlock();
        h();
_L2:
        return;
        exception;
        unlock();
        h();
        throw exception;
_L3:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, int i1)
    {
        lock();
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry2;
        AtomicReferenceArray atomicreferencearray;
        int j1 = b;
        atomicreferencearray = f;
        i1 &= atomicreferencearray.length() - 1;
        referenceentry2 = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(i1);
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry1 = referenceentry2;
_L2:
        if (referenceentry1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (referenceentry1 != referenceentry)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        d = d + 1;
        referenceentry = a(referenceentry2, referenceentry1, referenceentry1.getKey(), referenceentry1.getValueReference(), jjl.c);
        int k1 = b;
        atomicreferencearray.set(i1, referenceentry);
        b = k1 - 1;
        unlock();
        h();
        return true;
        referenceentry1 = referenceentry1.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        h();
        return false;
        referenceentry;
        unlock();
        h();
        throw referenceentry;
    }

    public boolean a(Object obj, int i1, Object obj1, Object obj2)
    {
        lock();
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        long l1;
        l1 = a.o.a();
        c(l1);
        atomicreferencearray = f;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry = referenceentry1;
_L2:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj3 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj3 == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        jja jja1;
        Object obj4;
        if (!a.e.a(obj, obj3))
        {
            break MISSING_BLOCK_LABEL_273;
        }
        jja1 = referenceentry.getValueReference();
        obj4 = jja1.get();
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (jja1.d())
        {
            i1 = b;
            d = d + 1;
            obj = a(referenceentry1, referenceentry, obj3, jja1, jjl.c);
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
        }
        unlock();
        h();
        return false;
        if (!a.f.a(obj1, obj4))
        {
            break MISSING_BLOCK_LABEL_255;
        }
        d = d + 1;
        a(obj, jja1, jjl.b);
        a(referenceentry, obj2, l1);
        f();
        unlock();
        h();
        return true;
        b(referenceentry, l1);
        unlock();
        h();
        return false;
        referenceentry = referenceentry.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        h();
        return false;
        obj;
        unlock();
        h();
        throw obj;
    }

    public boolean a(Object obj, int i1, jja jja1)
    {
        boolean flag;
        flag = false;
        lock();
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        j1 = b;
        atomicreferencearray = f;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry = referenceentry1;
_L12:
        if (referenceentry == null) goto _L2; else goto _L1
_L1:
        Object obj1 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj1 == null) goto _L4; else goto _L3
_L3:
        if (!a.e.a(obj, obj1)) goto _L4; else goto _L5
_L5:
        if (referenceentry.getValueReference() != jja1) goto _L7; else goto _L6
_L6:
        d = d + 1;
        obj = a(referenceentry1, referenceentry, obj1, jja1, jjl.c);
        i1 = b;
        atomicreferencearray.set(j1, obj);
        b = i1 - 1;
        unlock();
        if (!isHeldByCurrentThread())
        {
            h();
        }
        flag = true;
_L9:
        return flag;
_L7:
        unlock();
        if (isHeldByCurrentThread()) goto _L9; else goto _L8
_L8:
        h();
        return false;
_L4:
        referenceentry = referenceentry.getNext();
        continue; /* Loop/switch isn't completed */
_L2:
        unlock();
        if (isHeldByCurrentThread()) goto _L9; else goto _L10
_L10:
        h();
        return false;
        obj;
        unlock();
        if (!isHeldByCurrentThread())
        {
            h();
        }
        throw obj;
        if (true) goto _L12; else goto _L11
_L11:
    }

    void b()
    {
        if ((k.incrementAndGet() & 0x3f) == 0)
        {
            c(a.o.a());
            h();
        }
    }

    public boolean b(Object obj, int i1)
    {
        boolean flag = false;
        if (b == 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        obj = a(obj, i1, a.o.a());
        if (obj == null)
        {
            b();
            return false;
        }
        obj = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj)).getValueReference().get();
        if (obj != null)
        {
            flag = true;
        }
        b();
        return flag;
        b();
        return false;
        obj;
        b();
        throw obj;
    }

    public boolean b(Object obj, int i1, Object obj1)
    {
        lock();
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        c(a.o.a());
        j1 = b;
        atomicreferencearray = f;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry = referenceentry1;
_L5:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        jja jja1;
        if (!a.e.a(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_243;
        }
        jja1 = referenceentry.getValueReference();
        obj = jja1.get();
        if (!a.f.a(obj1, obj)) goto _L2; else goto _L1
_L1:
        obj = jjl.a;
_L3:
        d = d + 1;
        obj1 = a(referenceentry1, referenceentry, obj2, jja1, ((jjl) (obj)));
        i1 = b;
        atomicreferencearray.set(j1, obj1);
        b = i1 - 1;
        obj1 = jjl.a;
        boolean flag;
        if (obj == obj1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        unlock();
        h();
        return flag;
_L2:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        if (!jja1.d())
        {
            break MISSING_BLOCK_LABEL_227;
        }
        obj = jjl.c;
          goto _L3
        unlock();
        h();
        return false;
        referenceentry = referenceentry.getNext();
        if (true) goto _L5; else goto _L4
_L4:
        unlock();
        h();
        return false;
        obj;
        unlock();
        h();
        throw obj;
    }

    public Object c(Object obj, int i1)
    {
        lock();
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        c(a.o.a());
        j1 = b;
        atomicreferencearray = f;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.cache.LocalCache.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.cache.LocalCache.ReferenceEntry referenceentry = referenceentry1;
_L3:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        Object obj2;
        jja jja1;
        if (!a.e.a(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        jja1 = referenceentry.getValueReference();
        obj2 = jja1.get();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        obj = jjl.a;
_L1:
        d = d + 1;
        obj = a(referenceentry1, referenceentry, obj1, jja1, ((jjl) (obj)));
        i1 = b;
        atomicreferencearray.set(j1, obj);
        b = i1 - 1;
        unlock();
        h();
        return obj2;
label0:
        {
            if (!jja1.d())
            {
                break label0;
            }
            obj = jjl.c;
        }
          goto _L1
        unlock();
        h();
        return null;
        referenceentry = referenceentry.getNext();
        if (true) goto _L3; else goto _L2
_L2:
        unlock();
        h();
        return null;
        obj;
        unlock();
        h();
        throw obj;
    }
}
