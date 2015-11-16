// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izc extends koj
{

    public Long a;
    public iva b[];
    public izl c[];
    public Integer d;
    public Boolean e;
    public Integer f;
    public Integer g;
    public byte h[][];
    public ixf requestHeader;

    public izc()
    {
        requestHeader = null;
        a = null;
        b = iva.a();
        c = izl.a();
        d = null;
        e = null;
        f = null;
        g = null;
        h = kou.g;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (requestHeader != null)
        {
            j = i + koh.d(1, requestHeader);
        }
        i = j;
        if (a != null)
        {
            i = j + koh.d(2, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    iva iva1 = b[j];
                    int k = i;
                    if (iva1 != null)
                    {
                        k = i + koh.d(3, iva1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (g != null)
        {
            i = j + koh.e(4, g.intValue());
        }
        j = i;
        if (h != null)
        {
            j = i;
            if (h.length > 0)
            {
                j = 0;
                int l = 0;
                int j1;
                int k1;
                for (j1 = 0; j < h.length; j1 = k1)
                {
                    byte abyte0[] = h[j];
                    int l1 = l;
                    k1 = j1;
                    if (abyte0 != null)
                    {
                        k1 = j1 + 1;
                        l1 = l + koh.a(abyte0);
                    }
                    j++;
                    l = l1;
                }

                j = i + l + j1 * 1;
            }
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (koh.f(6) + 1);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    izl izl1 = c[i1];
                    j = i;
                    if (izl1 != null)
                    {
                        j = i + koh.d(7, izl1);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(8, d.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i + koh.e(9, f.intValue());
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L12:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   16: 136
    //                   26: 150
    //                   32: 274
    //                   42: 288
    //                   48: 390
    //                   58: 404
    //                   64: 528
    //                   72: 542;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new ixf();
        }
        kog1.a(requestHeader);
          goto _L12
_L4:
        a = Long.valueOf(kog1.d());
          goto _L12
_L5:
        int j1 = kou.b(kog1, 26);
        iva aiva[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        aiva = new iva[j1 + j];
        j1 = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, aiva, 0, j);
            j1 = j;
        }
        for (; j1 < aiva.length - 1; j1++)
        {
            aiva[j1] = new iva();
            kog1.a(aiva[j1]);
            kog1.a();
        }

        aiva[j1] = new iva();
        kog1.a(aiva[j1]);
        b = aiva;
          goto _L12
_L6:
        g = Integer.valueOf(kog1.f());
          goto _L12
_L7:
        int k1 = kou.b(kog1, 42);
        byte abyte0[][];
        int k;
        if (h == null)
        {
            k = 0;
        } else
        {
            k = h.length;
        }
        abyte0 = new byte[k1 + k][];
        k1 = k;
        if (k != 0)
        {
            System.arraycopy(h, 0, abyte0, 0, k);
            k1 = k;
        }
        for (; k1 < abyte0.length - 1; k1++)
        {
            abyte0[k1] = kog1.k();
            kog1.a();
        }

        abyte0[k1] = kog1.k();
        h = abyte0;
          goto _L12
_L8:
        e = Boolean.valueOf(kog1.i());
          goto _L12
_L9:
        int l1 = kou.b(kog1, 58);
        izl aizl[];
        int l;
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        aizl = new izl[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, aizl, 0, l);
            l1 = l;
        }
        for (; l1 < aizl.length - 1; l1++)
        {
            aizl[l1] = new izl();
            kog1.a(aizl[l1]);
            kog1.a();
        }

        aizl[l1] = new izl();
        kog1.a(aizl[l1]);
        c = aizl;
          goto _L12
_L10:
        d = Integer.valueOf(kog1.f());
          goto _L12
_L11:
        int i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
            f = Integer.valueOf(i1);
            break;
        }
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null)
        {
            koh1.a(2, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                iva iva1 = b[i];
                if (iva1 != null)
                {
                    koh1.b(3, iva1);
                }
            }

        }
        if (g != null)
        {
            koh1.a(4, g.intValue());
        }
        if (h != null && h.length > 0)
        {
            for (int j = 0; j < h.length; j++)
            {
                byte abyte0[] = h[j];
                if (abyte0 != null)
                {
                    koh1.a(5, abyte0);
                }
            }

        }
        if (e != null)
        {
            koh1.a(6, e.booleanValue());
        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                izl izl1 = c[k];
                if (izl1 != null)
                {
                    koh1.b(7, izl1);
                }
            }

        }
        if (d != null)
        {
            koh1.a(8, d.intValue());
        }
        if (f != null)
        {
            koh1.a(9, f.intValue());
        }
        super.writeTo(koh1);
    }
}
