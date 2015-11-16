// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iug extends koj
{

    public Integer a;
    public ivz b[];
    public Long c;
    public irg d;
    public Long e;
    public Boolean f;
    public Integer g;

    public iug()
    {
        a = null;
        b = ivz.a();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ivz ivz1 = b[j];
                    int k = i;
                    if (ivz1 != null)
                    {
                        k = i + koh.d(2, ivz1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.e(5, e.longValue());
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (koh.f(6) + 1);
        }
        i = j;
        if (g != null)
        {
            i = j + koh.e(7, g.intValue());
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L10:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   8: 91
    //                   18: 150
    //                   24: 274
    //                   34: 288
    //                   40: 317
    //                   48: 331
    //                   56: 345;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = kou.b(kog1, 18);
        ivz aivz[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aivz = new ivz[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aivz, 0, k);
            i1 = k;
        }
        for (; i1 < aivz.length - 1; i1++)
        {
            aivz[i1] = new ivz();
            kog1.a(aivz[i1]);
            kog1.a();
        }

        aivz[i1] = new ivz();
        kog1.a(aivz[i1]);
        b = aivz;
        continue; /* Loop/switch isn't completed */
_L5:
        c = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new irg();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        e = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L9:
        int l = kog1.f();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            g = Integer.valueOf(l);
            break;
        }
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ivz ivz1 = b[i];
                if (ivz1 != null)
                {
                    koh1.b(2, ivz1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c.longValue());
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e.longValue());
        }
        if (f != null)
        {
            koh1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            koh1.a(7, g.intValue());
        }
        super.writeTo(koh1);
    }
}
