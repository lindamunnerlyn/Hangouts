// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhq extends koj
{

    public lhu a[];
    public Long b;
    public lhp c;
    public Integer d;
    public lhr e;

    public lhq()
    {
        a = lhu.a();
        b = null;
        c = null;
        d = null;
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
                    lhu lhu1 = a[k];
                    j = i;
                    if (lhu1 != null)
                    {
                        j = i + koh.d(1, lhu1);
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
        if (d != null)
        {
            i = j + koh.e(4, d.intValue());
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
    //                   42: 294;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int l = kou.b(kog1, 10);
        lhu alhu[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        alhu = new lhu[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, alhu, 0, j);
            l = j;
        }
        for (; l < alhu.length - 1; l++)
        {
            alhu[l] = new lhu();
            kog1.a(alhu[l]);
            kog1.a();
        }

        alhu[l] = new lhu();
        kog1.a(alhu[l]);
        a = alhu;
          goto _L8
_L4:
        b = Long.valueOf(kog1.e());
          goto _L8
_L5:
        if (c == null)
        {
            c = new lhp();
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
            d = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new lhr();
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
                lhu lhu1 = a[i];
                if (lhu1 != null)
                {
                    koh1.b(1, lhu1);
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
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        super.writeTo(koh1);
    }
}
