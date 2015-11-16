// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqz extends koj
{

    public iqx a[];
    public isd b;
    public Boolean c;
    public Integer d;

    public iqz()
    {
        a = iqx.a();
        b = null;
        c = null;
        d = null;
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
                    iqx iqx1 = a[k];
                    j = i;
                    if (iqx1 != null)
                    {
                        j = i + koh.d(1, iqx1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (koh.f(3) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(4, d.intValue());
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   18: 191
    //                   24: 220
    //                   32: 234;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int l = kou.b(kog1, 10);
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
          goto _L7
_L4:
        if (b == null)
        {
            b = new isd();
        }
        kog1.a(b);
          goto _L7
_L5:
        c = Boolean.valueOf(kog1.i());
          goto _L7
_L6:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(k);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iqx iqx1 = a[i];
                if (iqx1 != null)
                {
                    koh1.b(1, iqx1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        super.writeTo(koh1);
    }
}
