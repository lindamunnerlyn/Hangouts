// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbn extends koj
{

    public jau a;
    public ius b[];
    public jbp c;
    public Boolean d;
    public Integer e;
    public String f;
    public jbw g;
    public ixf requestHeader;

    public jbn()
    {
        requestHeader = null;
        a = null;
        b = ius.a();
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
        int i = super.computeSerializedSize();
        int j = i;
        if (requestHeader != null)
        {
            j = i + koh.d(1, requestHeader);
        }
        i = j;
        if (a != null)
        {
            i = j + koh.d(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ius ius1 = b[j];
                    int k = i;
                    if (ius1 != null)
                    {
                        k = i + koh.d(3, ius1);
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
            i = j + koh.d(4, c);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (koh.f(5) + 1);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.e(6, e.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i + koh.b(7, f);
        }
        i = j;
        if (g != null)
        {
            i = j + koh.d(8, g);
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
    //                   18: 128
    //                   26: 157
    //                   34: 281
    //                   40: 310
    //                   48: 324
    //                   58: 370
    //                   66: 381;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new ixf();
        }
        kog1.a(requestHeader);
          goto _L11
_L4:
        if (a == null)
        {
            a = new jau();
        }
        kog1.a(a);
          goto _L11
_L5:
        int l = kou.b(kog1, 26);
        ius aius[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        aius = new ius[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, aius, 0, j);
            l = j;
        }
        for (; l < aius.length - 1; l++)
        {
            aius[l] = new ius();
            kog1.a(aius[l]);
            kog1.a();
        }

        aius[l] = new ius();
        kog1.a(aius[l]);
        b = aius;
          goto _L11
_L6:
        if (c == null)
        {
            c = new jbp();
        }
        kog1.a(c);
          goto _L11
_L7:
        d = Boolean.valueOf(kog1.i());
          goto _L11
_L8:
        int k = kog1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            e = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        f = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        if (g == null)
        {
            g = new jbw();
        }
        kog1.a(g);
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(koh koh1)
    {
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ius ius1 = b[i];
                if (ius1 != null)
                {
                    koh1.b(3, ius1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(4, c);
        }
        if (d != null)
        {
            koh1.a(5, d.booleanValue());
        }
        if (e != null)
        {
            koh1.a(6, e.intValue());
        }
        if (f != null)
        {
            koh1.a(7, f);
        }
        if (g != null)
        {
            koh1.b(8, g);
        }
        super.writeTo(koh1);
    }
}
