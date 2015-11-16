// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kob extends kwm
{

    public String a;
    public kqi b[];
    public Long c;
    public Long d;
    public kpl e;
    public koc f[];
    public int g;
    public int h[];

    public kob()
    {
        a = null;
        b = kqi.a();
        c = null;
        d = null;
        e = null;
        f = koc.a();
        g = 0x80000000;
        h = kwx.a;
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.e(2, c.longValue());
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(3, d.longValue());
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    koc koc1 = f[j];
                    int k = i;
                    if (koc1 != null)
                    {
                        k = i + kwk.d(5, koc1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (g != 0x80000000)
        {
            i = j + kwk.e(6, g);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kqi kqi1 = b[j];
                    int l = i;
                    if (kqi1 != null)
                    {
                        l = i + kwk.d(7, kqi1);
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
            i = j + kwk.d(9, e);
        }
        j = i;
        if (h != null)
        {
            j = i;
            if (h.length > 0)
            {
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < h.length; j++)
                {
                    i1 += kwk.e(h[j]);
                }

                j = i + i1 + h.length * 1;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   16: 118
    //                   24: 132
    //                   42: 146
    //                   48: 270
    //                   58: 311
    //                   74: 435
    //                   80: 464
    //                   82: 565;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L12
_L4:
        c = Long.valueOf(kwj1.e());
          goto _L12
_L5:
        d = Long.valueOf(kwj1.e());
          goto _L12
_L6:
        int k1 = kwx.a(kwj1, 42);
        koc akoc[];
        int j;
        if (f == null)
        {
            j = 0;
        } else
        {
            j = f.length;
        }
        akoc = new koc[k1 + j];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(f, 0, akoc, 0, j);
            k1 = j;
        }
        for (; k1 < akoc.length - 1; k1++)
        {
            akoc[k1] = new koc();
            kwj1.a(akoc[k1]);
            kwj1.a();
        }

        akoc[k1] = new koc();
        kwj1.a(akoc[k1]);
        f = akoc;
          goto _L12
_L7:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            g = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int l1 = kwx.a(kwj1, 58);
        kqi akqi[];
        int l;
        if (b == null)
        {
            l = 0;
        } else
        {
            l = b.length;
        }
        akqi = new kqi[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(b, 0, akqi, 0, l);
            l1 = l;
        }
        for (; l1 < akqi.length - 1; l1++)
        {
            akqi[l1] = new kqi();
            kwj1.a(akqi[l1]);
            kwj1.a();
        }

        akqi[l1] = new kqi();
        kwj1.a(akqi[l1]);
        b = akqi;
        continue; /* Loop/switch isn't completed */
_L9:
        if (e == null)
        {
            e = new kpl();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L10:
        int i2 = kwx.a(kwj1, 80);
        int ai[];
        int i1;
        if (h == null)
        {
            i1 = 0;
        } else
        {
            i1 = h.length;
        }
        ai = new int[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(h, 0, ai, 0, i1);
            i2 = i1;
        }
        for (; i2 < ai.length - 1; i2++)
        {
            ai[i2] = kwj1.f();
            kwj1.a();
        }

        ai[i2] = kwj1.f();
        h = ai;
        continue; /* Loop/switch isn't completed */
_L11:
        int k2 = kwj1.c(kwj1.p());
        int j1 = kwj1.r();
        int j2;
        for (j2 = 0; kwj1.q() > 0; j2++)
        {
            kwj1.f();
        }

        kwj1.e(j1);
        int ai1[];
        if (h == null)
        {
            j1 = 0;
        } else
        {
            j1 = h.length;
        }
        ai1 = new int[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(h, 0, ai1, 0, j1);
            j2 = j1;
        }
        for (; j2 < ai1.length; j2++)
        {
            ai1[j2] = kwj1.f();
        }

        h = ai1;
        kwj1.d(k2);
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (c != null)
        {
            kwk1.b(2, c.longValue());
        }
        if (d != null)
        {
            kwk1.b(3, d.longValue());
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                koc koc1 = f[i];
                if (koc1 != null)
                {
                    kwk1.b(5, koc1);
                }
            }

        }
        if (g != 0x80000000)
        {
            kwk1.a(6, g);
        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                kqi kqi1 = b[j];
                if (kqi1 != null)
                {
                    kwk1.b(7, kqi1);
                }
            }

        }
        if (e != null)
        {
            kwk1.b(9, e);
        }
        if (h != null && h.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < h.length; k++)
            {
                kwk1.a(10, h[k]);
            }

        }
        super.writeTo(kwk1);
    }
}
