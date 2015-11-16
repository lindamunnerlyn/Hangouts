// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class ccf
{

    private static final boolean b = false;
    public cci a;
    private final ccg c;
    private byte d[];

    public ccf(long l, String s, int i, int j, int k, long l1, ccg ccg1)
    {
        a = new cci(l, s, i, j, k, l1);
        c = ccg1;
    }

    public ccf(String s, int i, ccg ccg1)
    {
        this(0L, s, i, 0, 0, System.currentTimeMillis(), ccg1);
    }

    public int a(cce cce1, ccj ccj1)
    {
        if (dbf.e(a.c) == null)
        {
            int i = a.c;
            cce1 = toString();
            ebw.e("Babel_NetworkQueue", (new StringBuilder(String.valueOf(cce1).length() + 95)).append("Account does not exist on device, removing request from the queue for id ").append(i).append(", request: ").append(cce1).toString());
            ccj1.a(dbo.a);
            return cch.d;
        }
        if (b())
        {
            ccj1.a(dbo.a);
            return cch.d;
        }
        if (a().d() && !cce1.b())
        {
            ccj1.a(new dbo(101));
            return cch.c;
        }
        if (cce1.g())
        {
            ccj1.a(new dbo(102, null, 0L, true, null));
            return cch.c;
        } else
        {
            return cch.a;
        }
    }

    public ccg a()
    {
        return c;
    }

    public void a(dbo dbo1)
    {
        a().a(a.c, dbo1);
    }

    public boolean a(ccj ccj1)
    {
        cci cci1 = a;
        cci1.d = cci1.d + 1;
        ccj1.a();
        JVM INSTR tableswitch 106 108: default 44
    //                   106 190
    //                   107 190
    //                   108 190;
           goto _L1 _L2 _L2 _L2
_L1:
        int i = 0;
_L4:
        if (i != 0)
        {
            cci cci2 = a;
            cci2.e = cci2.e + 1;
        }
        if (a.d % 10 == 0)
        {
            i = a.d;
            int j = ccj1.a();
            String s = String.valueOf(c);
            long l = a.g;
            ebw.g("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 83)).append("Retried: ").append(i).append(" errorCode: ").append(j).append(" Request: ").append(s).append(" created: ").append(l).toString());
        }
        return c.a(a, ccj1.c());
_L2:
        i = 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a(Class class1, String s)
    {
        return class1.isInstance(c) && c.a(s);
    }

    public int b(cce cce1, ccj ccj1)
    {
        ccg ccg1;
        if (b)
        {
            long l = a.a;
            ebw.b("Babel_NetworkQueue", (new StringBuilder(31)).append("Processing ").append(l).toString());
        }
        ccg1 = a();
        int i;
        ccg1.a(cce1.f(), a, cce1.c());
        i = cch.b;
        return i;
        cce1;
        ccj1.a(cce1);
        ccj1.a(cce1.a());
        ccj1.a(cce1.c());
        ccj1.a();
        JVM INSTR tableswitch 101 122: default 204
    //                   101 222
    //                   102 222
    //                   103 222
    //                   104 216
    //                   105 222
    //                   106 222
    //                   107 222
    //                   108 222
    //                   109 204
    //                   110 204
    //                   111 204
    //                   112 204
    //                   113 204
    //                   114 204
    //                   115 204
    //                   116 222
    //                   117 204
    //                   118 222
    //                   119 204
    //                   120 204
    //                   121 204
    //                   122 222;
           goto _L1 _L2 _L2 _L2 _L3 _L2 _L2 _L2 _L2 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L2 _L1 _L2 _L1 _L1 _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_222;
_L1:
        boolean flag = false;
_L4:
        if (flag)
        {
            return cch.c;
        } else
        {
            return cch.d;
        }
_L3:
        flag = false;
          goto _L4
        flag = true;
          goto _L4
    }

    public boolean b()
    {
        boolean flag1 = false;
        long l = c.b();
        boolean flag = flag1;
        if (l > 0L)
        {
            flag = flag1;
            if (System.currentTimeMillis() > l + a.g)
            {
                flag = true;
            }
        }
        return flag;
    }

    public long c()
    {
        long l = 0L;
        long l1 = c.b();
        if (l1 > 0L)
        {
            l = (a.g + l1) - System.currentTimeMillis();
        } else
        if (l1 != 0L)
        {
            return 0x7fffffffffffffffL;
        }
        return l;
    }

    public long d()
    {
        return a.f;
    }

    public byte[] e()
    {
        if (d == null)
        {
            d = dkl.a(c);
        }
        return d;
    }

    public String toString()
    {
        Locale locale = Locale.US;
        long l = a.a;
        int i = a.d;
        long l1 = a.g;
        String s;
        if (c == null)
        {
            s = "null";
        } else
        {
            s = c.toString();
        }
        return String.format(locale, "REQUEST[id:%d; fc:%d; create:%d; type:%s]", new Object[] {
            Long.valueOf(l), Integer.valueOf(i), Long.valueOf(l1), s
        });
    }

    static 
    {
        hik hik = ebw.i;
    }
}
