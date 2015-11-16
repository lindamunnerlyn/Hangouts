// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class ldr extends kud
    implements kvd
{

    private static volatile kve g = null;
    private static final ldr i;
    private static volatile kvf j;
    private static final long serialVersionUID = 0L;
    private int d;
    private int e;
    private kut f;
    private byte h;

    private ldr(ktu ktu1, kty kty1)
    {
        boolean flag;
        flag = false;
        super();
        h = -1;
        e = 0;
        f = kvg.d();
_L8:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = ktu1.a();
        i1;
        JVM INSTR lookupswitch 3: default 242
    //                   0: 245
    //                   85: 83
    //                   91: 146;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!a(i1, ktu1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = d | 1;
        e = ktu1.h();
        continue; /* Loop/switch isn't completed */
        ktu1;
        throw new RuntimeException(ktu1.a(this));
        ktu1;
        if (f.a())
        {
            f.b();
        }
        f();
        throw ktu1;
_L6:
        if (!f.a())
        {
            f = new kvg();
        }
        f.add(ktu1.a(11, lds.k(), kty1));
        continue; /* Loop/switch isn't completed */
        ktu1;
        throw new RuntimeException((new kuu(ktu1.getMessage())).a(this));
_L2:
        if (f.a())
        {
            f.b();
        }
        f();
        return;
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static ldr k()
    {
        return i;
    }

    static ldr l()
    {
        return i;
    }

    private boolean m()
    {
        return (d & 1) == 1;
    }

    public static ldw newBuilder()
    {
        return (ldw)i.h();
    }

    public static ldw newBuilder(ldr ldr1)
    {
        return (ldw)((ldw)i.h()).a(ldr1);
    }

    protected final Object a(int i1, Object obj, Object obj1)
    {
        ldo.a[i1 - 1];
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
        obj1 = new ldr((ktu)obj, (kty)obj1);
_L11:
        return obj1;
_L3:
        return new ldr(kuq.e, kty.a());
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
        if (!m())
        {
            if (flag)
            {
                h = 0;
            }
            return null;
        }
        for (i1 = 0; i1 < f.size(); i1++)
        {
            if (!((lds)f.get(i1)).E_())
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
        return new ldw();
_L7:
        obj1 = this;
        if (obj == i) goto _L11; else goto _L10
_L10:
        obj = (ldr)obj;
        if (((ldr) (obj)).m())
        {
            i1 = ((ldr) (obj)).e;
            d = d | 1;
            e = i1;
        }
        if (!((ldr) (obj)).f.isEmpty())
        {
            if (f.isEmpty())
            {
                f = ((ldr) (obj)).f;
            } else
            {
                if (!f.a())
                {
                    f = a(((java.util.List) (f)));
                }
                f.addAll(((ldr) (obj)).f);
            }
        }
        a(((ldr) (obj)).b);
        return this;
_L8:
        return i;
_L9:
        if (j != null) goto _L13; else goto _L12
_L12:
        ldr;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            j = new kug(i);
        }
        ldr;
        JVM INSTR monitorexit ;
_L13:
        return j;
        obj;
        ldr;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(ktv ktv1)
    {
        if ((d & 1) == 1)
        {
            ktv1.b(10, e);
        }
        for (int i1 = 0; i1 < f.size(); i1++)
        {
            ktv1.a(11, (kvb)f.get(i1));
        }

        b.a(ktv1);
    }

    public int n()
    {
        int j1 = 0;
        int i1 = c;
        if (i1 != -1)
        {
            return i1;
        }
        if ((d & 1) == 1)
        {
            i1 = ktv.j(10) + 0;
        } else
        {
            i1 = 0;
        }
        while (j1 < f.size()) 
        {
            int k1 = ktv.d(11, (kvb)f.get(j1));
            j1++;
            i1 = k1 + i1;
        }
        i1 = b.d() + i1;
        c = i1;
        return i1;
    }

    static 
    {
        i = new ldr(kuq.e, kty.a());
    }
}
