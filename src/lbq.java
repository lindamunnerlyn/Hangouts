// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbq extends koj
{

    public kyq a[];
    public kyo b;
    public kyo c;
    public Integer d;
    public Integer e;
    public Integer f;
    public lbx g;
    public lbd h;

    public lbq()
    {
        a = kyq.a();
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    kyq kyq1 = a[k];
                    j = i;
                    if (kyq1 != null)
                    {
                        j = i + koh.d(1, kyq1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(4, c);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(6, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.e(7, e.intValue());
        }
        i = j;
        if (f != null)
        {
            i = j + koh.e(8, f.intValue());
        }
        j = i;
        if (g != null)
        {
            j = i + koh.d(9, g);
        }
        i = j;
        if (h != null)
        {
            i = j + koh.d(10, h);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L11:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   26: 223
    //                   34: 252
    //                   48: 281
    //                   56: 295
    //                   64: 309
    //                   74: 370
    //                   82: 399;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        int l = kou.b(kog1, 10);
        kyq akyq[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        akyq = new kyq[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, akyq, 0, j);
            l = j;
        }
        for (; l < akyq.length - 1; l++)
        {
            akyq[l] = new kyq();
            kog1.a(akyq[l]);
            kog1.a();
        }

        akyq[l] = new kyq();
        kog1.a(akyq[l]);
        a = akyq;
          goto _L11
_L4:
        if (b == null)
        {
            b = new kyo();
        }
        kog1.a(b);
          goto _L11
_L5:
        if (c == null)
        {
            c = new kyo();
        }
        kog1.a(c);
          goto _L11
_L6:
        d = Integer.valueOf(kog1.f());
          goto _L11
_L7:
        e = Integer.valueOf(kog1.f());
          goto _L11
_L8:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            f = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new lbx();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new lbd();
        }
        kog1.a(h);
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                kyq kyq1 = a[i];
                if (kyq1 != null)
                {
                    koh1.b(1, kyq1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null)
        {
            koh1.b(4, c);
        }
        if (d != null)
        {
            koh1.a(6, d.intValue());
        }
        if (e != null)
        {
            koh1.a(7, e.intValue());
        }
        if (f != null)
        {
            koh1.a(8, f.intValue());
        }
        if (g != null)
        {
            koh1.b(9, g);
        }
        if (h != null)
        {
            koh1.b(10, h);
        }
        super.writeTo(koh1);
    }
}
