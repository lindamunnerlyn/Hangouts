// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

public final class jvi extends ReentrantLock
{

    final MapMakerInternalMap a;
    public volatile int b;
    public int c;
    int d;
    public volatile AtomicReferenceArray e;
    final int f;
    final ReferenceQueue g;
    final ReferenceQueue h;
    final Queue i;
    final AtomicInteger j = new AtomicInteger();
    final Queue k;
    final Queue l;

    public jvi(MapMakerInternalMap mapmakerinternalmap, int i1, int j1)
    {
        Object obj1 = null;
        super();
        a = mapmakerinternalmap;
        f = j1;
        Object obj = a(i1);
        d = (((AtomicReferenceArray) (obj)).length() * 3) / 4;
        if (d == f)
        {
            d = d + 1;
        }
        e = ((AtomicReferenceArray) (obj));
        if (mapmakerinternalmap.e())
        {
            obj = new ReferenceQueue();
        } else
        {
            obj = null;
        }
        g = ((ReferenceQueue) (obj));
        obj = obj1;
        if (mapmakerinternalmap.f())
        {
            obj = new ReferenceQueue();
        }
        h = ((ReferenceQueue) (obj));
        if (mapmakerinternalmap.a() || mapmakerinternalmap.d())
        {
            obj = new ConcurrentLinkedQueue();
        } else
        {
            obj = MapMakerInternalMap.i();
        }
        i = ((Queue) (obj));
        if (mapmakerinternalmap.a())
        {
            obj = new jux();
        } else
        {
            obj = MapMakerInternalMap.i();
        }
        k = ((Queue) (obj));
        if (mapmakerinternalmap.b())
        {
            mapmakerinternalmap = new jva();
        } else
        {
            mapmakerinternalmap = MapMakerInternalMap.i();
        }
        l = mapmakerinternalmap;
    }

    private com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        if (referenceentry.getKey() != null)
        {
            jvv jvv1 = referenceentry.getValueReference();
            Object obj = jvv1.get();
            if (obj != null)
            {
                referenceentry = a.n.a(this, referenceentry, referenceentry1);
                referenceentry.setValueReference(jvv1.a(h, obj, referenceentry));
                return referenceentry;
            }
        }
        return null;
    }

    private static AtomicReferenceArray a(int i1)
    {
        return new AtomicReferenceArray(i1);
    }

    private void a(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, long l1)
    {
        referenceentry.setExpirationTime(a.o.a() + l1);
    }

    private void a(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, Object obj)
    {
        referenceentry.setValueReference(a.h.a(this, referenceentry, obj));
        e();
        k.add(referenceentry);
        if (a.b())
        {
            long l1;
            if (a.d())
            {
                l1 = a.j;
            } else
            {
                l1 = a.k;
            }
            a(referenceentry, l1);
            l.add(referenceentry);
        }
    }

    private void a(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, jub jub1)
    {
        Object obj = referenceentry.getKey();
        referenceentry.getHash();
        a(obj, referenceentry.getValueReference().get(), jub1);
    }

    private void a(Object obj, Object obj1, jub jub1)
    {
        if (a.l != MapMakerInternalMap.q)
        {
            obj = new juh(obj, obj1, jub1);
            a.l.offer(obj);
        }
    }

    private boolean a(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, int i1, jub jub1)
    {
        int j1 = b;
        AtomicReferenceArray atomicreferencearray = e;
        i1 &= atomicreferencearray.length() - 1;
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry2 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(i1);
        for (com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1 = referenceentry2; referenceentry1 != null; referenceentry1 = referenceentry1.getNext())
        {
            if (referenceentry1 == referenceentry)
            {
                c = c + 1;
                a(referenceentry1.getKey(), referenceentry1.getValueReference().get(), jub1);
                referenceentry = b(referenceentry2, referenceentry1);
                int k1 = b;
                atomicreferencearray.set(i1, referenceentry);
                b = k1 - 1;
                return true;
            }
        }

        return false;
    }

    private static boolean a(jvv jvv1)
    {
        return jvv1.get() == null;
    }

    private com.google.common.collect.MapMakerInternalMap.ReferenceEntry b(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        k.remove(referenceentry1);
        l.remove(referenceentry1);
        int i1 = b;
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry3 = referenceentry1.getNext();
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry2 = referenceentry;
        referenceentry = referenceentry3;
        while (referenceentry2 != referenceentry1) 
        {
            com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry4 = a(referenceentry2, referenceentry);
            if (referenceentry4 != null)
            {
                referenceentry = referenceentry4;
            } else
            {
                c(referenceentry2);
                i1--;
            }
            referenceentry2 = referenceentry2.getNext();
        }
        b = i1;
        return referenceentry;
    }

    private void b(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        k.add(referenceentry);
        if (a.d())
        {
            a(referenceentry, a.j);
            l.add(referenceentry);
        }
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

    private void c(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        a(referenceentry, jub.c);
        k.remove(referenceentry);
        l.remove(referenceentry);
    }

    private com.google.common.collect.MapMakerInternalMap.ReferenceEntry d(Object obj, int i1)
    {
        Object obj1;
        if (b == 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj1 = e;
        obj1 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)((AtomicReferenceArray) (obj1)).get(((AtomicReferenceArray) (obj1)).length() - 1 & i1);
_L2:
        Object obj2;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj1)).getHash() == i1)
        {
            obj2 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj1)).getKey();
            if (obj2 != null)
            {
                break; /* Loop/switch isn't completed */
            }
            c();
        }
_L4:
        obj1 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj1)).getNext();
        if (true) goto _L2; else goto _L1
_L1:
        if (!a.e.a(obj, obj2)) goto _L4; else goto _L3
_L3:
        return ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj1));
        return null;
    }

    private void d()
    {
        int k1 = 0;
        if (a.e())
        {
            int i1 = 0;
            do
            {
                Object obj = g.poll();
                if (obj == null)
                {
                    break;
                }
                obj = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)obj;
                a.a(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)));
                i1++;
            } while (i1 != 16);
        }
        if (a.f())
        {
            int j1 = k1;
            do
            {
                Object obj1 = h.poll();
                if (obj1 == null)
                {
                    break;
                }
                obj1 = (jvv)obj1;
                a.a(((jvv) (obj1)));
                k1 = j1 + 1;
                j1 = k1;
            } while (k1 != 16);
        }
    }

    private com.google.common.collect.MapMakerInternalMap.ReferenceEntry e(Object obj, int i1)
    {
        obj = d(obj, i1);
        if (obj == null)
        {
            return null;
        }
        if (a.b() && a.c(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj))))
        {
            f();
            return null;
        } else
        {
            return ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj));
        }
    }

    private void e()
    {
        do
        {
            com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)i.poll();
            if (referenceentry == null)
            {
                break;
            }
            if (k.contains(referenceentry))
            {
                k.add(referenceentry);
            }
            if (a.d() && l.contains(referenceentry))
            {
                l.add(referenceentry);
            }
        } while (true);
    }

    private void f()
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        g();
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    private void g()
    {
        e();
        if (!l.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1 = a.o.a();
        do
        {
            com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)l.peek();
            if (referenceentry == null || !a.a(referenceentry, l1))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!a(referenceentry, referenceentry.getHash(), jub.d))
            {
                throw new AssertionError();
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void h()
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        d();
        g();
        j.set(0);
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    private void i()
    {
        if (!isHeldByCurrentThread())
        {
            a.j();
        }
    }

    public Object a(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
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
        if (a.b() && a.c(referenceentry))
        {
            f();
            return null;
        } else
        {
            return obj;
        }
    }

    public Object a(Object obj, int i1)
    {
        obj = e(obj, i1);
        if (obj == null)
        {
            b();
            return null;
        }
        Object obj1 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getValueReference().get();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (a.d())
        {
            a(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)), a.j);
        }
        i.add(obj);
_L4:
        b();
        return obj1;
_L2:
        c();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        b();
        throw obj;
    }

    public Object a(Object obj, int i1, Object obj1)
    {
        lock();
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        h();
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = referenceentry1;
_L2:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        jvv jvv1;
        Object obj3;
        if (!a.e.a(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_221;
        }
        jvv1 = referenceentry.getValueReference();
        obj3 = jvv1.get();
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        if (a(jvv1))
        {
            i1 = b;
            c = c + 1;
            a(obj2, obj3, jub.c);
            obj = b(referenceentry1, referenceentry);
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
        }
        unlock();
        i();
        return null;
        c = c + 1;
        a(obj, obj3, jub.b);
        a(referenceentry, obj1);
        unlock();
        i();
        return obj3;
        referenceentry = referenceentry.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        i();
        return null;
        obj;
        unlock();
        i();
        throw obj;
    }

    public Object a(Object obj, int i1, Object obj1, boolean flag)
    {
        lock();
        int k1;
        h();
        k1 = b + 1;
        int j1 = k1;
        if (k1 <= d) goto _L2; else goto _L1
_L1:
        Object obj5;
        int j2;
        obj5 = e;
        j2 = ((AtomicReferenceArray) (obj5)).length();
        if (j2 >= 0x40000000) goto _L4; else goto _L3
_L3:
        AtomicReferenceArray atomicreferencearray;
        int k2;
        j1 = b;
        atomicreferencearray = a(j2 << 1);
        d = (atomicreferencearray.length() * 3) / 4;
        k2 = atomicreferencearray.length() - 1;
        int l1 = 0;
_L22:
        if (l1 >= j2) goto _L6; else goto _L5
_L5:
        Object obj4 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)((AtomicReferenceArray) (obj5)).get(l1);
        k1 = j1;
        if (obj4 == null) goto _L8; else goto _L7
_L7:
        Object obj2;
        obj2 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj4)).getNext();
        k1 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj4)).getHash() & k2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_702;
        }
        atomicreferencearray.set(k1, obj4);
          goto _L9
_L10:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        int i2 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)).getHash() & k2;
        Object obj3;
        if (i2 != k1)
        {
            obj3 = obj2;
            k1 = i2;
        }
        obj2 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)).getNext();
          goto _L10
        atomicreferencearray.set(k1, obj3);
        obj2 = obj4;
_L14:
        k1 = j1;
        if (obj2 == obj3) goto _L8; else goto _L11
_L11:
        k1 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)).getHash() & k2;
        obj4 = a(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)), (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(k1));
        if (obj4 == null) goto _L13; else goto _L12
_L12:
        atomicreferencearray.set(k1, obj4);
_L15:
        obj2 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)).getNext();
          goto _L14
_L13:
        c(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)));
        j1--;
          goto _L15
_L6:
        e = atomicreferencearray;
        b = j1;
_L4:
        j1 = b + 1;
_L2:
        obj4 = e;
        k1 = i1 & ((AtomicReferenceArray) (obj4)).length() - 1;
        obj3 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)((AtomicReferenceArray) (obj4)).get(k1);
        obj2 = obj3;
_L16:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_530;
        }
        obj5 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)).getKey();
        if (((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)).getHash() != i1 || obj5 == null)
        {
            break MISSING_BLOCK_LABEL_518;
        }
        if (!a.e.a(obj, obj5))
        {
            break MISSING_BLOCK_LABEL_518;
        }
        obj3 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)).getValueReference().get();
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_458;
        }
        c = c + 1;
        a(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)), obj1);
        a(obj, obj3, jub.c);
        b = b;
        unlock();
        i();
        return null;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        b(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)));
        unlock();
        i();
        return obj3;
        c = c + 1;
        a(obj, obj3, jub.b);
        a(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)), obj1);
        unlock();
        i();
        return obj3;
        obj2 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj2)).getNext();
          goto _L16
        c = c + 1;
        obj = a.n.a(this, obj, i1, ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj3)));
        a(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)), obj1);
        ((AtomicReferenceArray) (obj4)).set(k1, obj);
        if (!a.a() || b < f) goto _L18; else goto _L17
_L17:
        e();
        obj = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)k.remove();
        if (!a(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)), ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getHash(), jub.e))
        {
            throw new AssertionError();
        }
          goto _L19
        obj;
        unlock();
        i();
        throw obj;
_L19:
        i1 = 1;
_L20:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_677;
        }
        i1 = b + 1;
_L21:
        b = i1;
        unlock();
        i();
        return null;
_L18:
        i1 = 0;
          goto _L20
        i1 = j1;
          goto _L21
_L8:
        j1 = k1;
_L9:
        l1++;
          goto _L22
        obj3 = obj4;
          goto _L10
    }

    public void a()
    {
        if (b == 0) goto _L2; else goto _L1
_L1:
        lock();
        AtomicReferenceArray atomicreferencearray;
        atomicreferencearray = e;
        if (a.l == MapMakerInternalMap.q)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        int i1 = 0;
_L7:
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry;
        if (i1 >= atomicreferencearray.length())
        {
            break MISSING_BLOCK_LABEL_206;
        }
        referenceentry = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(i1);
_L4:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        referenceentry.getValueReference();
        a(referenceentry, jub.a);
        referenceentry = referenceentry.getNext();
        if (true) goto _L4; else goto _L3
_L5:
        Exception exception;
        for (; i1 >= atomicreferencearray.length(); i1 = 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }

        atomicreferencearray.set(i1, null);
        i1++;
          goto _L5
        if (a.e())
        {
            while (g.poll() != null) ;
        }
        if (a.f())
        {
            while (h.poll() != null) ;
        }
        k.clear();
        l.clear();
        j.set(0);
        c = c + 1;
        b = 0;
        unlock();
        i();
_L2:
        return;
        exception;
        unlock();
        i();
        throw exception;
_L3:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean a(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, int i1)
    {
        lock();
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry2;
        AtomicReferenceArray atomicreferencearray;
        int j1 = b;
        atomicreferencearray = e;
        i1 &= atomicreferencearray.length() - 1;
        referenceentry2 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(i1);
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1 = referenceentry2;
_L2:
        if (referenceentry1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (referenceentry1 != referenceentry)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        c = c + 1;
        a(referenceentry1.getKey(), referenceentry1.getValueReference().get(), jub.c);
        referenceentry = b(referenceentry2, referenceentry1);
        int k1 = b;
        atomicreferencearray.set(i1, referenceentry);
        b = k1 - 1;
        unlock();
        i();
        return true;
        referenceentry1 = referenceentry1.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        i();
        return false;
        referenceentry;
        unlock();
        i();
        throw referenceentry;
    }

    public boolean a(Object obj, int i1, Object obj1, Object obj2)
    {
        lock();
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        h();
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = referenceentry1;
_L2:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj3 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj3 == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        jvv jvv1;
        Object obj4;
        if (!a.e.a(obj, obj3))
        {
            break MISSING_BLOCK_LABEL_253;
        }
        jvv1 = referenceentry.getValueReference();
        obj4 = jvv1.get();
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        if (a(jvv1))
        {
            i1 = b;
            c = c + 1;
            a(obj3, obj4, jub.c);
            obj = b(referenceentry1, referenceentry);
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
        }
        unlock();
        i();
        return false;
        if (!a.f.a(obj1, obj4))
        {
            break MISSING_BLOCK_LABEL_237;
        }
        c = c + 1;
        a(obj, obj4, jub.b);
        a(referenceentry, obj2);
        unlock();
        i();
        return true;
        b(referenceentry);
        unlock();
        i();
        return false;
        referenceentry = referenceentry.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        i();
        return false;
        obj;
        unlock();
        i();
        throw obj;
    }

    public boolean a(Object obj, int i1, jvv jvv1)
    {
        lock();
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        j1 = b;
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = referenceentry1;
_L2:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        if (!a.e.a(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_187;
        }
        if (referenceentry.getValueReference() != jvv1)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        c = c + 1;
        a(obj, jvv1.get(), jub.c);
        obj = b(referenceentry1, referenceentry);
        i1 = b;
        atomicreferencearray.set(j1, obj);
        b = i1 - 1;
        unlock();
        if (!isHeldByCurrentThread())
        {
            i();
        }
        return true;
        unlock();
        if (!isHeldByCurrentThread())
        {
            i();
        }
        return false;
        referenceentry = referenceentry.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        if (!isHeldByCurrentThread())
        {
            i();
        }
        return false;
        obj;
        unlock();
        if (!isHeldByCurrentThread())
        {
            i();
        }
        throw obj;
    }

    void b()
    {
        if ((j.incrementAndGet() & 0x3f) == 0)
        {
            h();
            i();
        }
    }

    public boolean b(Object obj, int i1)
    {
        boolean flag = false;
        if (b == 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = e(obj, i1);
        if (obj == null)
        {
            b();
            return false;
        }
        obj = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getValueReference().get();
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
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        h();
        j1 = b;
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = referenceentry1;
_L3:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        Object obj3;
        if (!a.e.a(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_230;
        }
        obj = referenceentry.getValueReference();
        obj3 = ((jvv) (obj)).get();
        if (!a.f.a(obj1, obj3))
        {
            break MISSING_BLOCK_LABEL_200;
        }
        obj = jub.a;
_L1:
        c = c + 1;
        a(obj2, obj3, ((jub) (obj)));
        obj1 = b(referenceentry1, referenceentry);
        i1 = b;
        atomicreferencearray.set(j1, obj1);
        b = i1 - 1;
        obj1 = jub.a;
        boolean flag;
        if (obj == obj1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        unlock();
        i();
        return flag;
label0:
        {
            if (!a(((jvv) (obj))))
            {
                break label0;
            }
            obj = jub.c;
        }
          goto _L1
        unlock();
        i();
        return false;
        referenceentry = referenceentry.getNext();
        if (true) goto _L3; else goto _L2
_L2:
        unlock();
        i();
        return false;
        obj;
        unlock();
        i();
        throw obj;
    }

    public Object c(Object obj, int i1)
    {
        lock();
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        h();
        j1 = b;
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        referenceentry1 = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(j1);
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = referenceentry1;
_L3:
        if (referenceentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = referenceentry.getKey();
        if (referenceentry.getHash() != i1 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        Object obj2;
        if (!a.e.a(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_195;
        }
        obj = referenceentry.getValueReference();
        obj2 = ((jvv) (obj)).get();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj = jub.a;
_L1:
        c = c + 1;
        a(obj1, obj2, ((jub) (obj)));
        obj = b(referenceentry1, referenceentry);
        i1 = b;
        atomicreferencearray.set(j1, obj);
        b = i1 - 1;
        unlock();
        i();
        return obj2;
label0:
        {
            if (!a(((jvv) (obj))))
            {
                break label0;
            }
            obj = jub.c;
        }
          goto _L1
        unlock();
        i();
        return null;
        referenceentry = referenceentry.getNext();
        if (true) goto _L3; else goto _L2
_L2:
        unlock();
        i();
        return null;
        obj;
        unlock();
        i();
        throw obj;
    }
}
