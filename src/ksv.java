// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksv extends koj
{

    public ksz a[];
    public Long b;
    public ksu c;
    public int d;
    public ksw e;

    public ksv()
    {
        a = ksz.a();
        b = null;
        c = null;
        d = 0x80000000;
        e = null;
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
                    ksz ksz1 = a[k];
                    j = i;
                    if (ksz1 != null)
                    {
                        j = i + koh.d(1, ksz1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(2, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(3, c);
        }
        i = j;
        if (d != 0x80000000)
        {
            i = j + koh.e(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(5, e);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L8:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   16: 199
    //                   26: 213
    //                   32: 242
    //                   42: 291;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int l = kou.b(kog1, 10);
        ksz aksz[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        aksz = new ksz[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, aksz, 0, j);
            l = j;
        }
        for (; l < aksz.length - 1; l++)
        {
            aksz[l] = new ksz();
            kog1.a(aksz[l]);
            kog1.a();
        }

        aksz[l] = new ksz();
        kog1.a(aksz[l]);
        a = aksz;
          goto _L8
_L4:
        b = Long.valueOf(kog1.e());
          goto _L8
_L5:
        if (c == null)
        {
            c = new ksu();
        }
        kog1.a(c);
          goto _L8
_L6:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new ksw();
        }
        kog1.a(e);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                ksz ksz1 = a[i];
                if (ksz1 != null)
                {
                    koh1.b(1, ksz1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != 0x80000000)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        super.writeTo(koh1);
    }
}
