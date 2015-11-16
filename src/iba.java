// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iba extends koj
{

    private static volatile iba l[];
    public String a;
    public String b;
    public String c[];
    public String d;
    public hyl e;
    public String f;
    public hyu g;
    public iaz h;
    public Boolean i;
    public iba j[];
    public Integer k;

    public iba()
    {
        a = null;
        b = null;
        c = kou.f;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = a();
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iba[] a()
    {
        if (l == null)
        {
            synchronized (kon.a)
            {
                if (l == null)
                {
                    l = new iba[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if (a != null)
        {
            j1 = i1 + koh.b(1, a);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.b(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int j2;
                int k2;
                for (j2 = 0; j1 < c.length; j2 = k2)
                {
                    String s = c[j1];
                    int l2 = k1;
                    k2 = j2;
                    if (s != null)
                    {
                        k2 = j2 + 1;
                        l2 = k1 + koh.a(s);
                    }
                    j1++;
                    k1 = l2;
                }

                j1 = i1 + k1 + j2 * 1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.d(5, e);
        }
        int l1 = j1;
        if (f != null)
        {
            l1 = j1 + koh.b(6, f);
        }
        i1 = l1;
        if (i != null)
        {
            i.booleanValue();
            i1 = l1 + (koh.f(7) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= j.length)
                    {
                        break;
                    }
                    iba iba1 = j[i2];
                    j1 = i1;
                    if (iba1 != null)
                    {
                        j1 = i1 + koh.d(8, iba1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.e(9, k.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.d(10, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.d(11, h);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L14:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   10: 123
    //                   18: 134
    //                   26: 145
    //                   34: 247
    //                   42: 258
    //                   50: 287
    //                   56: 298
    //                   66: 312
    //                   72: 436
    //                   82: 546
    //                   90: 575;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L14
_L4:
        b = kog1.j();
          goto _L14
_L5:
        int i2 = kou.b(kog1, 26);
        String as[];
        int j1;
        if (c == null)
        {
            j1 = 0;
        } else
        {
            j1 = c.length;
        }
        as = new String[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(c, 0, as, 0, j1);
            i2 = j1;
        }
        for (; i2 < as.length - 1; i2++)
        {
            as[i2] = kog1.j();
            kog1.a();
        }

        as[i2] = kog1.j();
        c = as;
          goto _L14
_L6:
        d = kog1.j();
          goto _L14
_L7:
        if (e == null)
        {
            e = new hyl();
        }
        kog1.a(e);
          goto _L14
_L8:
        f = kog1.j();
          goto _L14
_L9:
        i = Boolean.valueOf(kog1.i());
          goto _L14
_L10:
        int j2 = kou.b(kog1, 66);
        iba aiba[];
        int k1;
        if (j == null)
        {
            k1 = 0;
        } else
        {
            k1 = j.length;
        }
        aiba = new iba[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(j, 0, aiba, 0, k1);
            j2 = k1;
        }
        for (; j2 < aiba.length - 1; j2++)
        {
            aiba[j2] = new iba();
            kog1.a(aiba[j2]);
            kog1.a();
        }

        aiba[j2] = new iba();
        kog1.a(aiba[j2]);
        j = aiba;
          goto _L14
_L11:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 100: // 'd'
        case 101: // 'e'
        case 110: // 'n'
            k = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (g == null)
        {
            g = new hyu();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L13:
        if (h == null)
        {
            h = new iaz();
        }
        kog1.a(h);
        if (true) goto _L14; else goto _L15
_L15:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                String s = c[i1];
                if (s != null)
                {
                    koh1.a(3, s);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (i != null)
        {
            koh1.a(7, i.booleanValue());
        }
        if (j != null && j.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < j.length; j1++)
            {
                iba iba1 = j[j1];
                if (iba1 != null)
                {
                    koh1.b(8, iba1);
                }
            }

        }
        if (k != null)
        {
            koh1.a(9, k.intValue());
        }
        if (g != null)
        {
            koh1.b(10, g);
        }
        if (h != null)
        {
            koh1.b(11, h);
        }
        super.writeTo(koh1);
    }
}
