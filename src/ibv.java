// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibv extends koj
{

    public int a;
    public Long b;
    public Long c;
    public kpt d[];
    public Integer e;
    public kpq f[];

    public ibv()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = kpt.a();
        e = null;
        f = kpq.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + koh.e(1, a);
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
                    kpt kpt1 = d[j];
                    int l = i;
                    if (kpt1 != null)
                    {
                        l = i + koh.d(4, kpt1);
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
                    kpq kpq1 = f[k];
                    i1 = i;
                    if (kpq1 != null)
                    {
                        i1 = i + koh.d(6, kpq1);
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
    //                   16: 135
    //                   24: 149
    //                   34: 163
    //                   40: 287
    //                   50: 301;
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
            a = j;
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
        kpt akpt[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        akpt = new kpt[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, akpt, 0, k);
            i1 = k;
        }
        for (; i1 < akpt.length - 1; i1++)
        {
            akpt[i1] = new kpt();
            kog1.a(akpt[i1]);
            kog1.a();
        }

        akpt[i1] = new kpt();
        kog1.a(akpt[i1]);
        d = akpt;
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kou.b(kog1, 50);
        kpq akpq[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        akpq = new kpq[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, akpq, 0, l);
            j1 = l;
        }
        for (; j1 < akpq.length - 1; j1++)
        {
            akpq[j1] = new kpq();
            kog1.a(akpq[j1]);
            kog1.a();
        }

        akpq[j1] = new kpq();
        kog1.a(akpq[j1]);
        f = akpq;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != 0x80000000)
        {
            koh1.a(1, a);
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
                kpt kpt1 = d[i];
                if (kpt1 != null)
                {
                    koh1.b(4, kpt1);
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
                kpq kpq1 = f[j];
                if (kpq1 != null)
                {
                    koh1.b(6, kpq1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
