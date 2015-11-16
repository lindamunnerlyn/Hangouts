// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kfy extends koj
{

    public String a;
    public kif b[];
    public Long c;
    public Long d;
    public khi e;
    public kfz f[];
    public int g;
    public int h[];

    public kfy()
    {
        a = null;
        b = kif.a();
        c = null;
        d = null;
        e = null;
        f = kfz.a();
        g = 0x80000000;
        h = kou.a;
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(2, c.longValue());
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(3, d.longValue());
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    kfz kfz1 = f[j];
                    int k = i;
                    if (kfz1 != null)
                    {
                        k = i + koh.d(5, kfz1);
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
            i = j + koh.e(6, g);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kif kif1 = b[j];
                    int l = i;
                    if (kif1 != null)
                    {
                        l = i + koh.d(7, kif1);
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
            i = j + koh.d(9, e);
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
                    i1 += koh.e(h[j]);
                }

                j = i + i1 + h.length * 1;
            }
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L12:
        int i = kog1.a();
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
        if (super.storeUnknownField(kog1, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L12
_L4:
        c = Long.valueOf(kog1.e());
          goto _L12
_L5:
        d = Long.valueOf(kog1.e());
          goto _L12
_L6:
        int k1 = kou.b(kog1, 42);
        kfz akfz[];
        int j;
        if (f == null)
        {
            j = 0;
        } else
        {
            j = f.length;
        }
        akfz = new kfz[k1 + j];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(f, 0, akfz, 0, j);
            k1 = j;
        }
        for (; k1 < akfz.length - 1; k1++)
        {
            akfz[k1] = new kfz();
            kog1.a(akfz[k1]);
            kog1.a();
        }

        akfz[k1] = new kfz();
        kog1.a(akfz[k1]);
        f = akfz;
          goto _L12
_L7:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            g = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int l1 = kou.b(kog1, 58);
        kif akif[];
        int l;
        if (b == null)
        {
            l = 0;
        } else
        {
            l = b.length;
        }
        akif = new kif[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(b, 0, akif, 0, l);
            l1 = l;
        }
        for (; l1 < akif.length - 1; l1++)
        {
            akif[l1] = new kif();
            kog1.a(akif[l1]);
            kog1.a();
        }

        akif[l1] = new kif();
        kog1.a(akif[l1]);
        b = akif;
        continue; /* Loop/switch isn't completed */
_L9:
        if (e == null)
        {
            e = new khi();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L10:
        int i2 = kou.b(kog1, 80);
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
            ai[i2] = kog1.f();
            kog1.a();
        }

        ai[i2] = kog1.f();
        h = ai;
        continue; /* Loop/switch isn't completed */
_L11:
        int k2 = kog1.c(kog1.p());
        int j1 = kog1.r();
        int j2;
        for (j2 = 0; kog1.q() > 0; j2++)
        {
            kog1.f();
        }

        kog1.e(j1);
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
            ai1[j2] = kog1.f();
        }

        h = ai1;
        kog1.d(k2);
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (c != null)
        {
            koh1.b(2, c.longValue());
        }
        if (d != null)
        {
            koh1.b(3, d.longValue());
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                kfz kfz1 = f[i];
                if (kfz1 != null)
                {
                    koh1.b(5, kfz1);
                }
            }

        }
        if (g != 0x80000000)
        {
            koh1.a(6, g);
        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                kif kif1 = b[j];
                if (kif1 != null)
                {
                    koh1.b(7, kif1);
                }
            }

        }
        if (e != null)
        {
            koh1.b(9, e);
        }
        if (h != null && h.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < h.length; k++)
            {
                koh1.a(10, h[k]);
            }

        }
        super.writeTo(koh1);
    }
}
