// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hru extends koj
{

    public Boolean a;
    public Integer b;
    public Long c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Integer g;
    public Boolean h;
    public hql i[];
    public Long j;
    public hqx k;
    public Boolean l;

    public hru()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = hql.a();
        j = null;
        k = null;
        l = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            a.booleanValue();
            i1 = j1 + (koh.f(1) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.e(2, b.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            e.booleanValue();
            i1 = j1 + (koh.f(3) + 1);
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (koh.f(4) + 1);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.e(5, j.longValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.e(6, g.intValue());
        }
        i1 = j1;
        if (h != null)
        {
            h.booleanValue();
            i1 = j1 + (koh.f(7) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.e(8, c.longValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(9, d);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    hql hql1 = i[j1];
                    int k1 = i1;
                    if (hql1 != null)
                    {
                        k1 = i1 + koh.d(10, hql1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            l.booleanValue();
            j1 = i1 + (koh.f(12) + 1);
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
    //                   8: 131
    //                   16: 145
    //                   24: 210
    //                   32: 224
    //                   40: 238
    //                   48: 252
    //                   56: 298
    //                   64: 312
    //                   74: 326
    //                   82: 337
    //                   90: 461
    //                   96: 490;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kog1.i());
          goto _L15
_L4:
        int j1 = kog1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            b = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        e = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        f = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        j = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L8:
        int k1 = kog1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            g = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        h = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        c = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L11:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        int i2 = kou.b(kog1, 82);
        hql ahql[];
        int l1;
        if (i == null)
        {
            l1 = 0;
        } else
        {
            l1 = i.length;
        }
        ahql = new hql[i2 + l1];
        i2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(i, 0, ahql, 0, l1);
            i2 = l1;
        }
        for (; i2 < ahql.length - 1; i2++)
        {
            ahql[i2] = new hql();
            kog1.a(ahql[i2]);
            kog1.a();
        }

        ahql[i2] = new hql();
        kog1.a(ahql[i2]);
        i = ahql;
        continue; /* Loop/switch isn't completed */
_L13:
        if (k == null)
        {
            k = new hqx();
        }
        kog1.a(k);
        continue; /* Loop/switch isn't completed */
_L14:
        l = Boolean.valueOf(kog1.i());
        if (true) goto _L15; else goto _L16
_L16:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (e != null)
        {
            koh1.a(3, e.booleanValue());
        }
        if (f != null)
        {
            koh1.a(4, f.booleanValue());
        }
        if (j != null)
        {
            koh1.b(5, j.longValue());
        }
        if (g != null)
        {
            koh1.a(6, g.intValue());
        }
        if (h != null)
        {
            koh1.a(7, h.booleanValue());
        }
        if (c != null)
        {
            koh1.b(8, c.longValue());
        }
        if (d != null)
        {
            koh1.a(9, d);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                hql hql1 = i[i1];
                if (hql1 != null)
                {
                    koh1.b(10, hql1);
                }
            }

        }
        if (k != null)
        {
            koh1.b(11, k);
        }
        if (l != null)
        {
            koh1.a(12, l.booleanValue());
        }
        super.writeTo(koh1);
    }
}
