// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibx extends koj
{

    public Integer a;
    public Long b;
    public Long c;
    public kpu d[];
    public Integer e;
    public kqc f[];

    public ibx()
    {
        a = null;
        b = null;
        c = null;
        d = kpu.a();
        e = null;
        f = kqc.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    kpu kpu1 = d[j];
                    int l = i;
                    if (kpu1 != null)
                    {
                        l = i + koh.d(4, kpu1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + koh.e(5, e.intValue());
        }
        int i1 = i;
        if (f != null)
        {
            i1 = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    kqc kqc1 = f[k];
                    i1 = i;
                    if (kqc1 != null)
                    {
                        i1 = i + koh.d(6, kqc1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   16: 138
    //                   24: 152
    //                   34: 166
    //                   40: 290
    //                   50: 304;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
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
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = kou.b(kog1, 34);
        kpu akpu[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        akpu = new kpu[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, akpu, 0, k);
            i1 = k;
        }
        for (; i1 < akpu.length - 1; i1++)
        {
            akpu[i1] = new kpu();
            kog1.a(akpu[i1]);
            kog1.a();
        }

        akpu[i1] = new kpu();
        kog1.a(akpu[i1]);
        d = akpu;
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kou.b(kog1, 50);
        kqc akqc[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        akqc = new kqc[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, akqc, 0, l);
            j1 = l;
        }
        for (; j1 < akqc.length - 1; j1++)
        {
            akqc[j1] = new kqc();
            kog1.a(akqc[j1]);
            kog1.a();
        }

        akqc[j1] = new kqc();
        kog1.a(akqc[j1]);
        f = akqc;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (c != null)
        {
            koh1.b(3, c.longValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                kpu kpu1 = d[i];
                if (kpu1 != null)
                {
                    koh1.b(4, kpu1);
                }
            }

        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                kqc kqc1 = f[j];
                if (kqc1 != null)
                {
                    koh1.b(6, kqc1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
