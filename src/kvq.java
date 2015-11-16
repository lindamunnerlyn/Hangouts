// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class kvq extends kma
    implements kna
{

    private static volatile knb g = null;
    private static final kvq i;
    private static volatile knc j;
    private static final long serialVersionUID = 0L;
    private int d;
    private long e;
    private String f;
    private byte h;

    private kvq(klr klr1)
    {
        kns kns1;
        boolean flag;
        h = -1;
        e = 0L;
        f = "";
        kns1 = knr.newBuilder();
        flag = false;
_L8:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = klr1.a();
        i1;
        JVM INSTR lookupswitch 3: default 194
    //                   0: 197
    //                   224: 92
    //                   234: 138;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!kns1.a(i1, klr1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = d | 1;
        e = klr1.e();
        continue; /* Loop/switch isn't completed */
        klr1;
        throw new RuntimeException(klr1.a(this));
        klr1;
        b = kns1.a();
        throw klr1;
_L6:
        String s = klr1.j();
        d = d | 2;
        f = s;
        continue; /* Loop/switch isn't completed */
        klr1;
        throw new RuntimeException((new kmr(klr1.getMessage())).a(this));
_L2:
        b = kns1.a();
        return;
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static kvq j()
    {
        return i;
    }

    static kvq k()
    {
        return i;
    }

    private boolean l()
    {
        return (d & 1) == 1;
    }

    public static kvr newBuilder()
    {
        return (kvr)i.g();
    }

    public static kvr newBuilder(kvq kvq1)
    {
        return (kvr)((kvr)i.g()).a(kvq1);
    }

    protected final Object a(int i1, Object obj, Object obj1)
    {
        kvk.a[i1 - 1];
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
        obj1 = new kvq((klr)obj);
_L11:
        return obj1;
_L3:
        obj = kmn.e;
        klv.a();
        return new kvq(((klr) (obj)));
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
        if (flag)
        {
            h = 1;
        }
        return i;
_L5:
        return null;
_L6:
        return new kvr();
_L7:
        obj1 = this;
        if (obj == i) goto _L11; else goto _L10
_L10:
        obj = (kvq)obj;
        if (((kvq) (obj)).l())
        {
            long l1 = ((kvq) (obj)).e;
            d = d | 1;
            e = l1;
        }
        if ((((kvq) (obj)).d & 2) == 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            d = d | 2;
            f = ((kvq) (obj)).f;
        }
        a(((kvq) (obj)).b);
        return this;
_L8:
        return i;
_L9:
        if (j != null) goto _L13; else goto _L12
_L12:
        kvq;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            j = new kmd(i);
        }
        kvq;
        JVM INSTR monitorexit ;
_L13:
        return j;
        obj;
        kvq;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(kls kls1)
    {
        if ((d & 1) == 1)
        {
            kls1.b(28, e);
        }
        if ((d & 2) == 2)
        {
            kls1.a(29, f);
        }
        b.a(kls1);
    }

    public int m()
    {
        int i1 = c;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if ((d & 1) == 1)
        {
            i1 = kls.e(28, e) + 0;
        }
        int j1 = i1;
        if ((d & 2) == 2)
        {
            j1 = i1 + kls.b(29, f);
        }
        i1 = j1 + b.b();
        c = i1;
        return i1;
    }

    static 
    {
        klr klr1 = kmn.e;
        klv.a();
        i = new kvq(klr1);
    }
}
