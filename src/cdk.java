// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class cdk
{

    private static final boolean b = false;
    public cdn a;
    private final cdl c;
    private byte d[];

    public cdk(long l, String s, int i, int j, int k, long l1, cdl cdl1)
    {
        a = new cdn(l, s, i, j, k, l1);
        c = cdl1;
    }

    public cdk(String s, int i, cdl cdl1)
    {
        this(0L, s, i, 0, 0, System.currentTimeMillis(), cdl1);
    }

    public int a(cdj cdj1, cdo cdo1)
    {
        if (dcn.e(a.c) == null)
        {
            int i = a.c;
            cdj1 = String.valueOf(toString());
            eev.e("Babel_NetworkQueue", (new StringBuilder(String.valueOf(cdj1).length() + 95)).append("Account does not exist on device, removing request from the queue for id ").append(i).append(", request: ").append(cdj1).toString());
            cdo1.a(dcx.a);
            return cdm.d;
        }
        if (b())
        {
            cdo1.a(dcx.a);
            return cdm.d;
        }
        if (a().d() && !cdj1.b())
        {
            cdo1.a(new dcx(101));
            return cdm.c;
        }
        if (cdj1.g())
        {
            cdo1.a(new dcx(102, null, 0L, true, null));
            return cdm.c;
        } else
        {
            return cdm.a;
        }
    }

    public cdl a()
    {
        return c;
    }

    public void a(dcx dcx1)
    {
        a().a(a.c, dcx1);
    }

    public boolean a(cdo cdo1)
    {
        cdn cdn1 = a;
        cdn1.d = cdn1.d + 1;
        cdo1.a();
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
            cdn cdn2 = a;
            cdn2.e = cdn2.e + 1;
        }
        if (a.d % 10 == 0)
        {
            i = a.d;
            int j = cdo1.a();
            String s = String.valueOf(c);
            long l = a.g;
            eev.g("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 83)).append("Retried: ").append(i).append(" errorCode: ").append(j).append(" Request: ").append(s).append(" created: ").append(l).toString());
        }
        return c.a(a, cdo1.c());
_L2:
        i = 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a(Class class1, String s)
    {
        return class1.isInstance(c) && c.a(s);
    }

    public int b(cdj cdj1, cdo cdo1)
    {
        cdl cdl1;
        if (b)
        {
            long l = a.a;
            eev.b("Babel_NetworkQueue", (new StringBuilder(31)).append("Processing ").append(l).toString());
        }
        cdl1 = a();
        int i;
        cdl1.a(cdj1.f(), a, cdj1.c());
        i = cdm.b;
        return i;
        cdj1;
        cdo1.a(cdj1);
        cdo1.a(cdj1.a());
        cdo1.a(cdj1.c());
        cdo1.a();
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
            return cdm.c;
        } else
        {
            return cdm.d;
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
            d = dmc.a(c);
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
        hnc hnc = eev.i;
    }
}
