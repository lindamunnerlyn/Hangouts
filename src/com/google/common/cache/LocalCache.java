// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;
import jgq;
import jhp;
import jhs;
import jht;
import jhw;
import jig;
import jij;
import jim;
import jin;
import jiq;
import jja;
import jjb;
import jjr;
import jrq;
import n;
import zn;

public class LocalCache extends AbstractMap
    implements ConcurrentMap
{

    public static final Logger a = Logger.getLogger(com/google/common/cache/LocalCache.getName());
    public static final jja r = new jhs();
    public static final Queue s = new jht();
    final int b;
    final int c;
    public final jin d[];
    public final jgq e;
    public final jgq f;
    final jiq g;
    public final jiq h;
    final long i;
    public final a j;
    final long k;
    final long l;
    public final long m;
    public final Queue n;
    public final jhp o;
    public final jhw p;
    public final zn q;
    Set t;
    Collection u;
    Set v;

    public static void a(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
    {
        referenceentry.setNextInAccessQueue(referenceentry1);
        referenceentry1.setPreviousInAccessQueue(referenceentry);
    }

    public static void b(ReferenceEntry referenceentry)
    {
        jim jim1 = jim.a;
        referenceentry.setNextInAccessQueue(jim1);
        referenceentry.setPreviousInAccessQueue(jim1);
    }

    public static void b(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
    {
        referenceentry.setNextInWriteQueue(referenceentry1);
        referenceentry1.setPreviousInWriteQueue(referenceentry);
    }

    public static void c(ReferenceEntry referenceentry)
    {
        jim jim1 = jim.a;
        referenceentry.setNextInWriteQueue(jim1);
        referenceentry.setPreviousInWriteQueue(jim1);
    }

    public static jja i()
    {
        return r;
    }

    public static ReferenceEntry j()
    {
        return jim.a;
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

    public Object a(ReferenceEntry referenceentry, long l1)
    {
        Object obj;
        if (referenceentry.getKey() != null)
        {
            if ((obj = referenceentry.getValueReference().get()) != null && !b(referenceentry, l1))
            {
                return obj;
            }
        }
        return null;
    }

    jin a(int i1)
    {
        return d[i1 >>> c & b];
    }

    public void a(ReferenceEntry referenceentry)
    {
        int i1 = referenceentry.getHash();
        a(i1).a(referenceentry, i1);
    }

    public void a(jja jja1)
    {
        ReferenceEntry referenceentry = jja1.b();
        int i1 = referenceentry.getHash();
        a(i1).a(referenceentry.getKey(), i1, jja1);
    }

    public boolean a()
    {
        return i >= 0L;
    }

    boolean b()
    {
        return l > 0L;
    }

    public boolean b(ReferenceEntry referenceentry, long l1)
    {
        n.b(referenceentry);
        while (c() && l1 - referenceentry.getAccessTime() >= k || b() && l1 - referenceentry.getWriteTime() >= l) 
        {
            return true;
        }
        return false;
    }

    boolean c()
    {
        return k > 0L;
    }

    public void clear()
    {
        jin ajin[] = d;
        int j1 = ajin.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ajin[i1].a();
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
        long l4 = o.a();
        jin ajin[] = d;
        int i1 = 0;
        long l3 = -1L;
        do
        {
            if (i1 >= 3)
            {
                break;
            }
            int i2 = ajin.length;
            long l2 = 0L;
            for (int j1 = 0; j1 < i2; j1++)
            {
                jin jin1 = ajin[j1];
                int k1 = jin1.b;
                AtomicReferenceArray atomicreferencearray = jin1.f;
                for (int l1 = 0; l1 < atomicreferencearray.length(); l1++)
                {
                    for (ReferenceEntry referenceentry = (ReferenceEntry)atomicreferencearray.get(l1); referenceentry != null; referenceentry = referenceentry.getNext())
                    {
                        Object obj1 = jin1.a(referenceentry, l4);
                        if (obj1 != null && f.a(obj, obj1))
                        {
                            return true;
                        }
                    }

                }

                l2 += jin1.d;
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
        return m > 0L;
    }

    public boolean e()
    {
        return b() || d();
    }

    public Set entrySet()
    {
        Set set = v;
        if (set != null)
        {
            return set;
        } else
        {
            jig jig1 = new jig(this, this);
            v = jig1;
            return jig1;
        }
    }

    public boolean f()
    {
        return c();
    }

    public boolean g()
    {
        return g != jiq.a;
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

    public boolean h()
    {
        return h != jiq.a;
    }

    public boolean isEmpty()
    {
        jin ajin[];
        int i1;
        long l1;
        ajin = d;
        i1 = 0;
        l1 = 0L;
_L9:
        if (i1 >= ajin.length) goto _L2; else goto _L1
_L1:
        if (ajin[i1].b == 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        l1 += ajin[i1].d;
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (l1 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L6:
        if (i1 >= ajin.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ajin[i1].b != 0) goto _L3; else goto _L5
_L5:
        l1 -= ajin[i1].d;
        i1++;
          goto _L6
        if (l1 != 0L) goto _L3; else goto _L7
_L7:
        return true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void k()
    {
        while ((jjr)n.poll() != null) ;
    }

    public Set keySet()
    {
        Set set = t;
        if (set != null)
        {
            return set;
        } else
        {
            jij jij1 = new jij(this, this);
            t = jij1;
            return jij1;
        }
    }

    long l()
    {
        jin ajin[] = d;
        long l1 = 0L;
        for (int i1 = 0; i1 < ajin.length; i1++)
        {
            l1 += ajin[i1].b;
        }

        return l1;
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
        return jrq.a(l());
    }

    public Collection values()
    {
        Collection collection = u;
        if (collection != null)
        {
            return collection;
        } else
        {
            jjb jjb1 = new jjb(this, this);
            u = jjb1;
            return jjb1;
        }
    }


    private class ReferenceEntry
    {

        public abstract long getAccessTime();

        public abstract int getHash();

        public abstract Object getKey();

        public abstract ReferenceEntry getNext();

        public abstract ReferenceEntry getNextInAccessQueue();

        public abstract ReferenceEntry getNextInWriteQueue();

        public abstract ReferenceEntry getPreviousInAccessQueue();

        public abstract ReferenceEntry getPreviousInWriteQueue();

        public abstract jja getValueReference();

        public abstract long getWriteTime();

        public abstract void setAccessTime(long l1);

        public abstract void setNextInAccessQueue(ReferenceEntry referenceentry);

        public abstract void setNextInWriteQueue(ReferenceEntry referenceentry);

        public abstract void setPreviousInAccessQueue(ReferenceEntry referenceentry);

        public abstract void setPreviousInWriteQueue(ReferenceEntry referenceentry);

        public abstract void setValueReference(jja jja1);

        public abstract void setWriteTime(long l1);
    }

}
