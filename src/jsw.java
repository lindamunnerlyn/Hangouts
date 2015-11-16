// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jsw extends koj
{

    private static volatile jsw g[];
    public Integer a;
    public jtc b[];
    public Integer c;
    public jsu d;
    public jsy e;
    public lis f;

    public jsw()
    {
        a = null;
        b = jtc.a();
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jsw[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new jsw[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
                    jtc jtc1 = b[j];
                    int k = i;
                    if (jtc1 != null)
                    {
                        k = i + koh.d(3, jtc1);
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
            i = j + koh.e(4, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(5, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(6, e);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.d(15, f);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   26: 158
    //                   32: 282
    //                   42: 296
    //                   50: 325
    //                   122: 354;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 17: // '\021'
        case 18: // '\022'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kou.b(kog1, 26);
        jtc ajtc[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        ajtc = new jtc[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, ajtc, 0, k);
            l = k;
        }
        for (; l < ajtc.length - 1; l++)
        {
            ajtc[l] = new jtc();
            kog1.a(ajtc[l]);
            kog1.a();
        }

        ajtc[l] = new jtc();
        kog1.a(ajtc[l]);
        b = ajtc;
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new jsu();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new jsy();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new lis();
        }
        kog1.a(f);
        if (true) goto _L9; else goto _L10
_L10:
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
                jtc jtc1 = b[i];
                if (jtc1 != null)
                {
                    koh1.b(3, jtc1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(4, c.intValue());
        }
        if (d != null)
        {
            koh1.b(5, d);
        }
        if (e != null)
        {
            koh1.b(6, e);
        }
        if (f != null)
        {
            koh1.b(15, f);
        }
        super.writeTo(koh1);
    }
}
