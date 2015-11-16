// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kqc extends koj
{

    private static volatile kqc m[];
    public kpu a;
    public krh b;
    public Integer c;
    public Integer d;
    public kpu e;
    public krh f;
    public Boolean g;
    public kqf h[];
    public Boolean i;
    public String j;
    public Integer k;
    public hpf l;

    public kqc()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = kqf.a();
        i = null;
        j = null;
        k = null;
        l = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kqc[] a()
    {
        if (m == null)
        {
            synchronized (kon.a)
            {
                if (m == null)
                {
                    m = new kqc[0];
                }
            }
        }
        return m;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + koh.d(1, a);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.e(2, c.intValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.e(3, d.intValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.d(4, e);
        }
        i1 = j1;
        if (g != null)
        {
            g.booleanValue();
            i1 = j1 + (koh.f(5) + 1);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                for (j1 = 0; j1 < h.length;)
                {
                    kqf kqf1 = h[j1];
                    int k1 = i1;
                    if (kqf1 != null)
                    {
                        k1 = i1 + koh.d(6, kqf1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (koh.f(7) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(8, j);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.d(9, b);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(10, l);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.d(11, f);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.e(12, k.intValue());
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L15:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 129
    //                   10: 131
    //                   16: 160
    //                   24: 222
    //                   34: 236
    //                   40: 265
    //                   50: 279
    //                   56: 403
    //                   66: 417
    //                   74: 428
    //                   82: 457
    //                   90: 486
    //                   96: 515;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new kpu();
        }
        kog1.a(a);
          goto _L15
_L4:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            c = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new kpu();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        g = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        int i2 = kou.b(kog1, 50);
        kqf akqf[];
        int k1;
        if (h == null)
        {
            k1 = 0;
        } else
        {
            k1 = h.length;
        }
        akqf = new kqf[i2 + k1];
        i2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(h, 0, akqf, 0, k1);
            i2 = k1;
        }
        for (; i2 < akqf.length - 1; i2++)
        {
            akqf[i2] = new kqf();
            kog1.a(akqf[i2]);
            kog1.a();
        }

        akqf[i2] = new kqf();
        kog1.a(akqf[i2]);
        h = akqf;
        continue; /* Loop/switch isn't completed */
_L9:
        i = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        j = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        if (b == null)
        {
            b = new krh();
        }
        kog1.a(b);
        continue; /* Loop/switch isn't completed */
_L12:
        if (l == null)
        {
            l = new hpf();
        }
        kog1.a(l);
        continue; /* Loop/switch isn't completed */
_L13:
        if (f == null)
        {
            f = new krh();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L14:
        int l1 = kog1.f();
        switch (l1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            k = Integer.valueOf(l1);
            break;
        }
        if (true) goto _L15; else goto _L16
_L16:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (c != null)
        {
            koh1.a(2, c.intValue());
        }
        if (d != null)
        {
            koh1.a(3, d.intValue());
        }
        if (e != null)
        {
            koh1.b(4, e);
        }
        if (g != null)
        {
            koh1.a(5, g.booleanValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                kqf kqf1 = h[i1];
                if (kqf1 != null)
                {
                    koh1.b(6, kqf1);
                }
            }

        }
        if (i != null)
        {
            koh1.a(7, i.booleanValue());
        }
        if (j != null)
        {
            koh1.a(8, j);
        }
        if (b != null)
        {
            koh1.b(9, b);
        }
        if (l != null)
        {
            koh1.b(10, l);
        }
        if (f != null)
        {
            koh1.b(11, f);
        }
        if (k != null)
        {
            koh1.a(12, k.intValue());
        }
        super.writeTo(koh1);
    }
}
