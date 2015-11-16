// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class ldu extends kud
    implements kvd
{

    private static volatile kve g = null;
    private static final ldu i;
    private static volatile kvf j;
    private static final long serialVersionUID = 0L;
    private int d;
    private long e;
    private String f;
    private byte h;

    private ldu(ktu ktu1)
    {
        boolean flag;
        h = -1;
        e = 0L;
        f = "";
        flag = false;
_L8:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = ktu1.a();
        i1;
        JVM INSTR lookupswitch 3: default 177
    //                   0: 180
    //                   224: 83
    //                   234: 125;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!a(i1, ktu1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = d | 1;
        e = ktu1.e();
        continue; /* Loop/switch isn't completed */
        ktu1;
        throw new RuntimeException(ktu1.a(this));
        ktu1;
        f();
        throw ktu1;
_L6:
        String s = ktu1.j();
        d = d | 2;
        f = s;
        continue; /* Loop/switch isn't completed */
        ktu1;
        throw new RuntimeException((new kuu(ktu1.getMessage())).a(this));
_L2:
        f();
        return;
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static ldu k()
    {
        return i;
    }

    static ldu l()
    {
        return i;
    }

    private boolean m()
    {
        return (d & 1) == 1;
    }

    public static ldv newBuilder()
    {
        return (ldv)i.h();
    }

    public static ldv newBuilder(ldu ldu1)
    {
        return (ldv)((ldv)i.h()).a(ldu1);
    }

    protected final Object a(int i1, Object obj, Object obj1)
    {
        ldo.a[i1 - 1];
        JVM INSTR tableswitch 1 8: default 52
    //                   1 60
    //                   2 74
    //                   3 91
    //                   4 153
    //                   5 155
    //                   6 163
    //                   7 255
    //                   8 259;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new UnsupportedOperationException();
_L2:
        obj1 = new ldu((ktu)obj);
_L11:
        return obj1;
_L3:
        obj = kuq.e;
        kty.a();
        return new ldu(((ktu) (obj)));
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
        if (flag)
        {
            h = 1;
        }
        return i;
_L5:
        return null;
_L6:
        return new ldv();
_L7:
        obj1 = this;
        if (obj == i) goto _L11; else goto _L10
_L10:
        obj = (ldu)obj;
        if (((ldu) (obj)).m())
        {
            long l1 = ((ldu) (obj)).e;
            d = d | 1;
            e = l1;
        }
        if ((((ldu) (obj)).d & 2) == 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            d = d | 2;
            f = ((ldu) (obj)).f;
        }
        a(((ldu) (obj)).b);
        return this;
_L8:
        return i;
_L9:
        if (j != null) goto _L13; else goto _L12
_L12:
        ldu;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            j = new kug(i);
        }
        ldu;
        JVM INSTR monitorexit ;
_L13:
        return j;
        obj;
        ldu;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(ktv ktv1)
    {
        if ((d & 1) == 1)
        {
            ktv1.b(28, e);
        }
        if ((d & 2) == 2)
        {
            ktv1.a(29, f);
        }
        b.a(ktv1);
    }

    public int n()
    {
        int i1 = c;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if ((d & 1) == 1)
        {
            i1 = ktv.e(28, e) + 0;
        }
        int j1 = i1;
        if ((d & 2) == 2)
        {
            j1 = i1 + ktv.b(29, f);
        }
        i1 = j1 + b.d();
        c = i1;
        return i1;
    }

    static 
    {
        ktu ktu1 = kuq.e;
        kty.a();
        i = new ldu(ktu1);
    }
}
