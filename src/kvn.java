// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class kvn extends kma
    implements kna
{

    private static volatile knb g = null;
    private static final kvn i;
    private static volatile knc j;
    private static final long serialVersionUID = 0L;
    private int d;
    private int e;
    private kmq f;
    private byte h;

    private kvn(klr klr1, klv klv1)
    {
        kns kns1;
        boolean flag;
        flag = false;
        super();
        h = -1;
        e = 0;
        f = knd.d();
        kns1 = knr.newBuilder();
_L8:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = klr1.a();
        i1;
        JVM INSTR lookupswitch 3: default 259
    //                   0: 262
    //                   85: 92
    //                   91: 159;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!kns1.a(i1, klr1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = d | 1;
        e = klr1.h();
        continue; /* Loop/switch isn't completed */
        klr1;
        throw new RuntimeException(klr1.a(this));
        klr1;
        if (f.a())
        {
            f.b();
        }
        b = kns1.a();
        throw klr1;
_L6:
        if (!f.a())
        {
            f = new knd();
        }
        f.add(klr1.a(11, kvo.j(), klv1));
        continue; /* Loop/switch isn't completed */
        klr1;
        throw new RuntimeException((new kmr(klr1.getMessage())).a(this));
_L2:
        if (f.a())
        {
            f.b();
        }
        b = kns1.a();
        return;
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static kvn j()
    {
        return i;
    }

    static kvn k()
    {
        return i;
    }

    private boolean l()
    {
        return (d & 1) == 1;
    }

    public static kvs newBuilder()
    {
        return (kvs)i.g();
    }

    public static kvs newBuilder(kvn kvn1)
    {
        return (kvs)((kvs)i.g()).a(kvn1);
    }

    protected final Object a(int i1, Object obj, Object obj1)
    {
        kvk.a[i1 - 1];
        JVM INSTR tableswitch 1 8: default 52
    //                   1 60
    //                   2 78
    //                   3 92
    //                   4 207
    //                   5 218
    //                   6 226
    //                   7 349
    //                   8 353;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new UnsupportedOperationException();
_L2:
        obj1 = new kvn((klr)obj, (klv)obj1);
_L11:
        return obj1;
_L3:
        return new kvn(kmn.e, klv.a());
_L4:
        i1 = h;
        if (i1 == 1)
        {
            return i;
        }
        if (i1 == 0)
        {
            return null;
        }
        boolean flag = ((Boolean)obj).booleanValue();
        if (!l())
        {
            if (flag)
            {
                h = 0;
            }
            return null;
        }
        for (i1 = 0; i1 < f.size(); i1++)
        {
            if (!((kvo)f.get(i1)).C_())
            {
                if (flag)
                {
                    h = 0;
                }
                return null;
            }
        }

        if (flag)
        {
            h = 1;
        }
        return i;
_L5:
        f.b();
        return null;
_L6:
        return new kvs();
_L7:
        obj1 = this;
        if (obj == i) goto _L11; else goto _L10
_L10:
        obj = (kvn)obj;
        if (((kvn) (obj)).l())
        {
            i1 = ((kvn) (obj)).e;
            d = d | 1;
            e = i1;
        }
        if (!((kvn) (obj)).f.isEmpty())
        {
            if (f.isEmpty())
            {
                f = ((kvn) (obj)).f;
            } else
            {
                if (!f.a())
                {
                    f = a(((java.util.List) (f)));
                }
                f.addAll(((kvn) (obj)).f);
            }
        }
        a(((kvn) (obj)).b);
        return this;
_L8:
        return i;
_L9:
        if (j != null) goto _L13; else goto _L12
_L12:
        kvn;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            j = new kmd(i);
        }
        kvn;
        JVM INSTR monitorexit ;
_L13:
        return j;
        obj;
        kvn;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(kls kls1)
    {
        if ((d & 1) == 1)
        {
            kls1.b(10, e);
        }
        for (int i1 = 0; i1 < f.size(); i1++)
        {
            kls1.a(11, (kmy)f.get(i1));
        }

        b.a(kls1);
    }

    public int m()
    {
        int j1 = 0;
        int i1 = c;
        if (i1 != -1)
        {
            return i1;
        }
        if ((d & 1) == 1)
        {
            i1 = kls.j(10) + 0;
        } else
        {
            i1 = 0;
        }
        while (j1 < f.size()) 
        {
            int k1 = kls.d(11, (kmy)f.get(j1));
            j1++;
            i1 = k1 + i1;
        }
        i1 = b.b() + i1;
        c = i1;
        return i1;
    }

    static 
    {
        i = new kvn(kmn.e, klv.a());
    }
}
