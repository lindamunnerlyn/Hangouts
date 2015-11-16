// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwb extends koj
{

    public Boolean a;
    public Boolean b;
    public Integer c;
    public kwj d[];
    public kwf e;
    public kwk f[];
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public int j;

    public kwb()
    {
        a = null;
        b = null;
        c = null;
        d = kwj.a();
        e = null;
        f = kwk.a();
        g = null;
        h = null;
        i = null;
        j = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            a.booleanValue();
            k = l + (koh.f(1) + 1);
        }
        l = k;
        if (b != null)
        {
            b.booleanValue();
            l = k + (koh.f(2) + 1);
        }
        k = l + koh.e(3, c.intValue());
        l = k;
        if (d != null)
        {
            l = k;
            if (d.length > 0)
            {
                for (l = 0; l < d.length;)
                {
                    kwj kwj1 = d[l];
                    int i1 = k;
                    if (kwj1 != null)
                    {
                        i1 = k + koh.d(4, kwj1);
                    }
                    l++;
                    k = i1;
                }

                l = k;
            }
        }
        k = l;
        if (e != null)
        {
            k = l + koh.d(5, e);
        }
        l = k;
        if (f != null)
        {
            l = k;
            if (f.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    l = k;
                    if (j1 >= f.length)
                    {
                        break;
                    }
                    kwk kwk1 = f[j1];
                    l = k;
                    if (kwk1 != null)
                    {
                        l = k + koh.d(6, kwk1);
                    }
                    j1++;
                    k = l;
                } while (true);
            }
        }
        k = l;
        if (g != null)
        {
            g.booleanValue();
            k = l + (koh.f(7) + 1);
        }
        l = k;
        if (h != null)
        {
            h.booleanValue();
            l = k + (koh.f(8) + 1);
        }
        k = l;
        if (i != null)
        {
            i.booleanValue();
            k = l + (koh.f(9) + 1);
        }
        l = k;
        if (j != 0x80000000)
        {
            l = k + koh.e(10, j);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
_L13:
        int k = kog1.a();
        k;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   8: 115
    //                   16: 129
    //                   24: 143
    //                   34: 157
    //                   42: 281
    //                   50: 310
    //                   56: 434
    //                   64: 448
    //                   72: 462
    //                   80: 476;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kog1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kog1.i());
          goto _L13
_L4:
        b = Boolean.valueOf(kog1.i());
          goto _L13
_L5:
        c = Integer.valueOf(kog1.f());
          goto _L13
_L6:
        int k1 = kou.b(kog1, 34);
        kwj akwj[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        akwj = new kwj[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, akwj, 0, l);
            k1 = l;
        }
        for (; k1 < akwj.length - 1; k1++)
        {
            akwj[k1] = new kwj();
            kog1.a(akwj[k1]);
            kog1.a();
        }

        akwj[k1] = new kwj();
        kog1.a(akwj[k1]);
        d = akwj;
          goto _L13
_L7:
        if (e == null)
        {
            e = new kwf();
        }
        kog1.a(e);
          goto _L13
_L8:
        int l1 = kou.b(kog1, 50);
        kwk akwk[];
        int i1;
        if (f == null)
        {
            i1 = 0;
        } else
        {
            i1 = f.length;
        }
        akwk = new kwk[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(f, 0, akwk, 0, i1);
            l1 = i1;
        }
        for (; l1 < akwk.length - 1; l1++)
        {
            akwk[l1] = new kwk();
            kog1.a(akwk[l1]);
            kog1.a();
        }

        akwk[l1] = new kwk();
        kog1.a(akwk[l1]);
        f = akwk;
          goto _L13
_L9:
        g = Boolean.valueOf(kog1.i());
          goto _L13
_L10:
        h = Boolean.valueOf(kog1.i());
          goto _L13
_L11:
        i = Boolean.valueOf(kog1.i());
          goto _L13
_L12:
        int j1 = kog1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            j = j1;
            break;
        }
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        koh1.a(3, c.intValue());
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                kwj kwj1 = d[k];
                if (kwj1 != null)
                {
                    koh1.b(4, kwj1);
                }
            }

        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < f.length; l++)
            {
                kwk kwk1 = f[l];
                if (kwk1 != null)
                {
                    koh1.b(6, kwk1);
                }
            }

        }
        if (g != null)
        {
            koh1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            koh1.a(8, h.booleanValue());
        }
        if (i != null)
        {
            koh1.a(9, i.booleanValue());
        }
        if (j != 0x80000000)
        {
            koh1.a(10, j);
        }
        super.writeTo(koh1);
    }
}
