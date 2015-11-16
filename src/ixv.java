// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixv extends koj
{

    public iqx a[];
    public isd b;
    public Boolean c;
    public Integer d;
    public ixf requestHeader;

    public ixv()
    {
        requestHeader = null;
        a = iqx.a();
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + koh.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    iqx iqx1 = a[j];
                    int k = i;
                    if (iqx1 != null)
                    {
                        k = i + koh.d(2, iqx1);
                    }
                    j++;
                    i = k;
                }

                j = i;
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
            c.booleanValue();
            j = i + (koh.f(4) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(5, d.intValue());
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L8:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   18: 104
    //                   26: 228
    //                   32: 257
    //                   40: 271;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new ixf();
        }
        kog1.a(requestHeader);
          goto _L8
_L4:
        int l = kou.b(kog1, 18);
        iqx aiqx[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        aiqx = new iqx[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, aiqx, 0, j);
            l = j;
        }
        for (; l < aiqx.length - 1; l++)
        {
            aiqx[l] = new iqx();
            kog1.a(aiqx[l]);
            kog1.a();
        }

        aiqx[l] = new iqx();
        kog1.a(aiqx[l]);
        a = aiqx;
          goto _L8
_L5:
        if (b == null)
        {
            b = new isd();
        }
        kog1.a(b);
          goto _L8
_L6:
        c = Boolean.valueOf(kog1.i());
          goto _L8
_L7:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(k);
            break;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iqx iqx1 = a[i];
                if (iqx1 != null)
                {
                    koh1.b(2, iqx1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null)
        {
            koh1.a(4, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(5, d.intValue());
        }
        super.writeTo(koh1);
    }
}
