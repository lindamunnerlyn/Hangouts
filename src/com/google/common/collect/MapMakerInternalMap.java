// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import fsn;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;
import jgq;
import jhp;
import jkx;
import jmz;
import jnh;
import jni;
import jnj;
import jnm;
import jnw;
import jof;
import jog;
import joh;
import joi;
import jok;
import jou;
import jov;
import jrq;
import n;

public class MapMakerInternalMap extends AbstractMap
    implements Serializable, ConcurrentMap
{

    static final jou p = new jni();
    public static final Queue q = new jnj();
    private static final long serialVersionUID = 5L;
    private static final Logger u = Logger.getLogger(com/google/common/collect/MapMakerInternalMap.getName());
    final transient int a;
    final transient int b;
    public final transient joh c[];
    final int d;
    public final jgq e;
    public final jgq f;
    final jok g;
    public final jok h;
    final int i;
    public final long j;
    public final long k;
    public final Queue l;
    final fsn m;
    public final transient jnm n;
    public final jhp o;
    transient Set r;
    transient Collection s;
    transient Set t;

    public MapMakerInternalMap(jmz jmz1)
    {
        int j2 = 1;
        boolean flag1 = false;
        boolean flag = false;
        super();
        d = Math.min(jmz1.d(), 0x10000);
        g = jmz1.e();
        h = jmz1.f();
        e = jmz1.b();
        f = h.a();
        i = jmz1.e;
        j = jmz1.h();
        k = jmz1.g();
        n = jnm.a(g, b(), a());
        o = jmz1.i();
        m = jmz1.a();
        Object obj;
        int i1;
        int j1;
        int k1;
        if (m == jkx.a)
        {
            obj = q;
        } else
        {
            obj = new ConcurrentLinkedQueue();
        }
        l = ((Queue) (obj));
        i1 = Math.min(jmz1.c(), 0x40000000);
        j1 = i1;
        if (a())
        {
            j1 = Math.min(i1, i);
        }
        i1 = 1;
        k1 = 0;
        for (; i1 < d && (!a() || i1 << 1 <= i); i1 <<= 1)
        {
            k1++;
        }

        b = 32 - k1;
        a = i1 - 1;
        c = new joh[i1];
        k1 = j1 / i1;
        if (k1 * i1 < j1)
        {
            k1++;
            j1 = j2;
        } else
        {
            j1 = j2;
        }
        for (; j1 < k1; j1 <<= 1) { }
        k1 = ((flag1) ? 1 : 0);
        if (a())
        {
            int i2 = i / i1 + 1;
            j2 = i;
            k1 = ((flag) ? 1 : 0);
            for (int l1 = i2; k1 < c.length; l1 = i2)
            {
                i2 = l1;
                if (k1 == j2 % i1)
                {
                    i2 = l1 - 1;
                }
                c[k1] = a(j1, i2);
                k1++;
            }

        } else
        {
            for (; k1 < c.length; k1++)
            {
                c[k1] = a(j1, -1);
            }

        }
    }

    public static void a(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
    {
        referenceentry.setNextExpirable(referenceentry1);
        referenceentry1.setPreviousExpirable(referenceentry);
    }

    public static void b(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
    {
        referenceentry.setNextEvictable(referenceentry1);
        referenceentry1.setPreviousEvictable(referenceentry);
    }

    public static void d(ReferenceEntry referenceentry)
    {
        jog jog1 = jog.a;
        referenceentry.setNextExpirable(jog1);
        referenceentry.setPreviousExpirable(jog1);
    }

    public static void e(ReferenceEntry referenceentry)
    {
        jog jog1 = jog.a;
        referenceentry.setNextEvictable(jog1);
        referenceentry.setPreviousEvictable(jog1);
    }

    public static jou g()
    {
        return p;
    }

    public static ReferenceEntry h()
    {
        return jog.a;
    }

    public static Queue i()
    {
        return q;
    }

    int a(Object obj)
    {
        int i1 = e.a(obj);
        i1 += i1 << 15 ^ 0xffffcd7d;
        i1 ^= i1 >>> 10;
        i1 += i1 << 3;
        i1 ^= i1 >>> 6;
        i1 += (i1 << 2) + (i1 << 14);
        return i1 ^ i1 >>> 16;
    }

    joh a(int i1)
    {
        return c[i1 >>> b & a];
    }

    joh a(int i1, int j1)
    {
        return new joh(this, i1, j1);
    }

    public void a(ReferenceEntry referenceentry)
    {
        int i1 = referenceentry.getHash();
        a(i1).a(referenceentry, i1);
    }

    public void a(jou jou1)
    {
        ReferenceEntry referenceentry = jou1.a();
        int i1 = referenceentry.getHash();
        a(i1).a(referenceentry.getKey(), i1, jou1);
    }

    public boolean a()
    {
        return i != -1;
    }

    public boolean a(ReferenceEntry referenceentry, long l1)
    {
        return l1 - referenceentry.getExpirationTime() > 0L;
    }

    public Object b(ReferenceEntry referenceentry)
    {
        Object obj;
        if (referenceentry.getKey() != null)
        {
            if ((obj = referenceentry.getValueReference().get()) != null && (!b() || !c(referenceentry)))
            {
                return obj;
            }
        }
        return null;
    }

    public boolean b()
    {
        return c() || d();
    }

    boolean c()
    {
        return k > 0L;
    }

    public boolean c(ReferenceEntry referenceentry)
    {
        return a(referenceentry, o.a());
    }

    public void clear()
    {
        joh ajoh[] = c;
        int j1 = ajoh.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ajoh[i1].a();
        }

    }

    public boolean containsKey(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            int i1 = a(obj);
            return a(i1).b(obj, i1);
        }
    }

    public boolean containsValue(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        joh ajoh[] = c;
        int i1 = 0;
        long l3 = -1L;
        do
        {
            if (i1 >= 3)
            {
                break;
            }
            int i2 = ajoh.length;
            long l2 = 0L;
            for (int j1 = 0; j1 < i2; j1++)
            {
                joh joh1 = ajoh[j1];
                int k1 = joh1.b;
                AtomicReferenceArray atomicreferencearray = joh1.e;
                for (int l1 = 0; l1 < atomicreferencearray.length(); l1++)
                {
                    for (ReferenceEntry referenceentry = (ReferenceEntry)atomicreferencearray.get(l1); referenceentry != null; referenceentry = referenceentry.getNext())
                    {
                        Object obj1 = joh1.a(referenceentry);
                        if (obj1 != null && f.a(obj, obj1))
                        {
                            return true;
                        }
                    }

                }

                l2 += joh1.c;
            }

            if (l2 == l3)
            {
                break;
            }
            i1++;
            l3 = l2;
        } while (true);
        return false;
    }

    public boolean d()
    {
        return j > 0L;
    }

    public boolean e()
    {
        return g != jok.a;
    }

    public Set entrySet()
    {
        Set set = t;
        if (set != null)
        {
            return set;
        } else
        {
            jnw jnw1 = new jnw(this);
            t = jnw1;
            return jnw1;
        }
    }

    public boolean f()
    {
        return h != jok.a;
    }

    public Object get(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            int i1 = a(obj);
            return a(i1).a(obj, i1);
        }
    }

    public boolean isEmpty()
    {
        joh ajoh[];
        int i1;
        long l1;
        ajoh = c;
        i1 = 0;
        l1 = 0L;
_L9:
        if (i1 >= ajoh.length) goto _L2; else goto _L1
_L1:
        if (ajoh[i1].b == 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        l1 += ajoh[i1].c;
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (l1 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L6:
        if (i1 >= ajoh.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ajoh[i1].b != 0) goto _L3; else goto _L5
_L5:
        l1 -= ajoh[i1].c;
        i1++;
          goto _L6
        if (l1 != 0L) goto _L3; else goto _L7
_L7:
        return true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void j()
    {
        while ((jnh)l.poll() != null) ;
    }

    public Set keySet()
    {
        Set set = r;
        if (set != null)
        {
            return set;
        } else
        {
            jof jof1 = new jof(this);
            r = jof1;
            return jof1;
        }
    }

    public Object put(Object obj, Object obj1)
    {
        n.b(obj);
        n.b(obj1);
        int i1 = a(obj);
        return a(i1).a(obj, i1, obj1, false);
    }

    public void putAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Object putIfAbsent(Object obj, Object obj1)
    {
        n.b(obj);
        n.b(obj1);
        int i1 = a(obj);
        return a(i1).a(obj, i1, obj1, true);
    }

    public Object remove(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            int i1 = a(obj);
            return a(i1).c(obj, i1);
        }
    }

    public boolean remove(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            int i1 = a(obj);
            return a(i1).b(obj, i1, obj1);
        }
    }

    public Object replace(Object obj, Object obj1)
    {
        n.b(obj);
        n.b(obj1);
        int i1 = a(obj);
        return a(i1).a(obj, i1, obj1);
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        n.b(obj);
        n.b(obj2);
        if (obj1 == null)
        {
            return false;
        } else
        {
            int i1 = a(obj);
            return a(i1).a(obj, i1, obj1, obj2);
        }
    }

    public int size()
    {
        joh ajoh[] = c;
        long l1 = 0L;
        for (int i1 = 0; i1 < ajoh.length; i1++)
        {
            l1 += ajoh[i1].b;
        }

        return jrq.a(l1);
    }

    public Collection values()
    {
        Collection collection = s;
        if (collection != null)
        {
            return collection;
        } else
        {
            jov jov1 = new jov(this);
            s = jov1;
            return jov1;
        }
    }

    Object writeReplace()
    {
        return new joi(g, h, e, f, k, j, i, d, m, this);
    }


    private class ReferenceEntry
    {

        public abstract long getExpirationTime();

        public abstract int getHash();

        public abstract Object getKey();

        public abstract ReferenceEntry getNext();

        public abstract ReferenceEntry getNextEvictable();

        public abstract ReferenceEntry getNextExpirable();

        public abstract ReferenceEntry getPreviousEvictable();

        public abstract ReferenceEntry getPreviousExpirable();

        public abstract jou getValueReference();

        public abstract void setExpirationTime(long l1);

        public abstract void setNextEvictable(ReferenceEntry referenceentry);

        public abstract void setNextExpirable(ReferenceEntry referenceentry);

        public abstract void setPreviousEvictable(ReferenceEntry referenceentry);

        public abstract void setPreviousExpirable(ReferenceEntry referenceentry);

        public abstract void setValueReference(jou jou1);
    }

}
