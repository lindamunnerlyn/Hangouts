// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipq extends koj
{

    public static final kok a = kok.a(ipq, 0x102d7e72L);
    private static final ipq p[] = new ipq[0];
    public String b;
    public ipt c[];
    public String d[];
    public String e;
    public Integer f;
    public Integer g;
    public Long h;
    public Long i;
    public String j;
    public String k;
    public int l;
    public Boolean m;
    public String n;
    public Boolean o;

    public ipq()
    {
        b = null;
        c = ipt.a();
        d = kou.f;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = 0x80000000;
        m = null;
        n = null;
        o = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l2 = super.computeSerializedSize() + koh.b(1, b);
        int i1;
        int k1;
        if (d != null && d.length > 0)
        {
            i1 = 0;
            int j1 = 0;
            int l1;
            int j2;
            for (l1 = 0; i1 < d.length; l1 = j2)
            {
                String s = d[i1];
                int k2 = j1;
                j2 = l1;
                if (s != null)
                {
                    j2 = l1 + 1;
                    k2 = j1 + koh.a(s);
                }
                i1++;
                j1 = k2;
            }

            i1 = l2 + j1 + l1 * 1;
        } else
        {
            i1 = l2;
        }
        k1 = i1;
        if (e != null)
        {
            k1 = i1 + koh.b(8, e);
        }
        i1 = k1;
        if (h != null)
        {
            i1 = k1 + koh.d(9, h.longValue());
        }
        k1 = i1;
        if (c != null)
        {
            k1 = i1;
            if (c.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    k1 = i1;
                    if (i2 >= c.length)
                    {
                        break;
                    }
                    ipt ipt1 = c[i2];
                    k1 = i1;
                    if (ipt1 != null)
                    {
                        k1 = i1 + koh.d(10, ipt1);
                    }
                    i2++;
                    i1 = k1;
                } while (true);
            }
        }
        i1 = k1;
        if (g != null)
        {
            i1 = k1 + koh.f(11, g.intValue());
        }
        k1 = i1;
        if (f != null)
        {
            k1 = i1 + koh.f(12, f.intValue());
        }
        i1 = k1;
        if (i != null)
        {
            i1 = k1 + koh.d(13, i.longValue());
        }
        k1 = i1;
        if (j != null)
        {
            k1 = i1 + koh.b(15, j);
        }
        i1 = k1;
        if (k != null)
        {
            i1 = k1 + koh.b(16, k);
        }
        k1 = i1;
        if (l != 0x80000000)
        {
            k1 = i1 + koh.e(17, l);
        }
        i1 = k1;
        if (m != null)
        {
            m.booleanValue();
            i1 = k1 + (koh.f(18) + 1);
        }
        k1 = i1;
        if (n != null)
        {
            k1 = i1 + koh.b(19, n);
        }
        i1 = k1;
        if (o != null)
        {
            o.booleanValue();
            i1 = k1 + (koh.f(20) + 1);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L17:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 15: default 136
    //                   0: 145
    //                   10: 147
    //                   34: 158
    //                   66: 260
    //                   72: 271
    //                   82: 285
    //                   88: 409
    //                   96: 423
    //                   104: 437
    //                   122: 451
    //                   130: 462
    //                   136: 473
    //                   144: 523
    //                   154: 537
    //                   160: 548;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L17; else goto _L2
_L2:
        return this;
_L3:
        b = kog1.j();
          goto _L17
_L4:
        int i2 = kou.b(kog1, 34);
        String as[];
        int j1;
        if (d == null)
        {
            j1 = 0;
        } else
        {
            j1 = d.length;
        }
        as = new String[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(d, 0, as, 0, j1);
            i2 = j1;
        }
        for (; i2 < as.length - 1; i2++)
        {
            as[i2] = kog1.j();
            kog1.a();
        }

        as[i2] = kog1.j();
        d = as;
          goto _L17
_L5:
        e = kog1.j();
          goto _L17
_L6:
        h = Long.valueOf(kog1.d());
          goto _L17
_L7:
        int j2 = kou.b(kog1, 82);
        ipt aipt[];
        int k1;
        if (c == null)
        {
            k1 = 0;
        } else
        {
            k1 = c.length;
        }
        aipt = new ipt[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(c, 0, aipt, 0, k1);
            j2 = k1;
        }
        for (; j2 < aipt.length - 1; j2++)
        {
            aipt[j2] = new ipt();
            kog1.a(aipt[j2]);
            kog1.a();
        }

        aipt[j2] = new ipt();
        kog1.a(aipt[j2]);
        c = aipt;
          goto _L17
_L8:
        g = Integer.valueOf(kog1.l());
          goto _L17
_L9:
        f = Integer.valueOf(kog1.l());
          goto _L17
_L10:
        i = Long.valueOf(kog1.d());
          goto _L17
_L11:
        j = kog1.j();
          goto _L17
_L12:
        k = kog1.j();
          goto _L17
_L13:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            l = l1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        m = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        n = kog1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        o = Boolean.valueOf(kog1.i());
        if (true) goto _L17; else goto _L18
_L18:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(1, b);
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                String s = d[i1];
                if (s != null)
                {
                    koh1.a(4, s);
                }
            }

        }
        if (e != null)
        {
            koh1.a(8, e);
        }
        if (h != null)
        {
            koh1.a(9, h.longValue());
        }
        if (c != null && c.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < c.length; j1++)
            {
                ipt ipt1 = c[j1];
                if (ipt1 != null)
                {
                    koh1.b(10, ipt1);
                }
            }

        }
        if (g != null)
        {
            koh1.c(11, g.intValue());
        }
        if (f != null)
        {
            koh1.c(12, f.intValue());
        }
        if (i != null)
        {
            koh1.a(13, i.longValue());
        }
        if (j != null)
        {
            koh1.a(15, j);
        }
        if (k != null)
        {
            koh1.a(16, k);
        }
        if (l != 0x80000000)
        {
            koh1.a(17, l);
        }
        if (m != null)
        {
            koh1.a(18, m.booleanValue());
        }
        if (n != null)
        {
            koh1.a(19, n);
        }
        if (o != null)
        {
            koh1.a(20, o.booleanValue());
        }
        super.writeTo(koh1);
    }

}
