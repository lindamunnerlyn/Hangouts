// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvl extends koj
{

    private static volatile hvl n[];
    public hwc a;
    public hwc b;
    public Integer c;
    public Double d;
    public Double e;
    public Long f;
    public Integer g;
    public String h;
    public String i;
    public String j;
    public String k;
    public Long l;
    public hvk m[];

    public hvl()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = hvk.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hvl[] a()
    {
        if (n == null)
        {
            synchronized (kon.a)
            {
                if (n == null)
                {
                    n = new hvl[0];
                }
            }
        }
        return n;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.e(2, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            d.doubleValue();
            j1 = i1 + (koh.f(3) + 8);
        }
        i1 = j1;
        if (e != null)
        {
            e.doubleValue();
            i1 = j1 + (koh.f(4) + 8);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.e(5, f.longValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.e(6, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(9, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.b(10, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.e(11, l.longValue());
        }
        int k1 = j1;
        if (a != null)
        {
            k1 = j1 + koh.d(12, a);
        }
        i1 = k1;
        if (b != null)
        {
            i1 = k1 + koh.d(13, b);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    hvk hvk1 = m[j1];
                    int l1 = i1;
                    if (hvk1 != null)
                    {
                        l1 = i1 + koh.d(14, hvk1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L16:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 137
    //                   16: 139
    //                   25: 182
    //                   33: 196
    //                   40: 210
    //                   48: 224
    //                   58: 238
    //                   66: 249
    //                   74: 260
    //                   82: 271
    //                   88: 282
    //                   98: 296
    //                   106: 325
    //                   114: 354;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        d = Double.valueOf(kog1.b());
        continue; /* Loop/switch isn't completed */
_L5:
        e = Double.valueOf(kog1.b());
        continue; /* Loop/switch isn't completed */
_L6:
        f = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L7:
        g = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        h = kog1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        i = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        j = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        k = kog1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        l = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L13:
        if (a == null)
        {
            a = new hwc();
        }
        kog1.a(a);
        continue; /* Loop/switch isn't completed */
_L14:
        if (b == null)
        {
            b = new hwc();
        }
        kog1.a(b);
        continue; /* Loop/switch isn't completed */
_L15:
        int l1 = kou.b(kog1, 114);
        hvk ahvk[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        ahvk = new hvk[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, ahvk, 0, k1);
            l1 = k1;
        }
        for (; l1 < ahvk.length - 1; l1++)
        {
            ahvk[l1] = new hvk();
            kog1.a(ahvk[l1]);
            kog1.a();
        }

        ahvk[l1] = new hvk();
        kog1.a(ahvk[l1]);
        m = ahvk;
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(koh koh1)
    {
        if (c != null)
        {
            koh1.a(2, c.intValue());
        }
        if (d != null)
        {
            koh1.a(3, d.doubleValue());
        }
        if (e != null)
        {
            koh1.a(4, e.doubleValue());
        }
        if (f != null)
        {
            koh1.b(5, f.longValue());
        }
        if (g != null)
        {
            koh1.a(6, g.intValue());
        }
        if (h != null)
        {
            koh1.a(7, h);
        }
        if (i != null)
        {
            koh1.a(8, i);
        }
        if (j != null)
        {
            koh1.a(9, j);
        }
        if (k != null)
        {
            koh1.a(10, k);
        }
        if (l != null)
        {
            koh1.b(11, l.longValue());
        }
        if (a != null)
        {
            koh1.b(12, a);
        }
        if (b != null)
        {
            koh1.b(13, b);
        }
        if (m != null && m.length > 0)
        {
            for (int i1 = 0; i1 < m.length; i1++)
            {
                hvk hvk1 = m[i1];
                if (hvk1 != null)
                {
                    koh1.b(14, hvk1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
