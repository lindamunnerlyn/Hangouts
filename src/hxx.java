// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxx extends koj
{

    public Long a;
    public Long b;
    public Boolean c;
    public int d;
    public Long e;
    public Long f;
    public Integer g;
    public long h[];

    public hxx()
    {
        a = null;
        b = null;
        c = null;
        d = 0x80000000;
        e = null;
        f = null;
        g = null;
        h = kou.b;
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
            i = j + koh.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (koh.f(3) + 1);
        }
        j = i;
        if (d != 0x80000000)
        {
            j = i + koh.e(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.e(5, e.longValue());
        }
        j = i;
        if (f != null)
        {
            j = i + koh.e(6, f.longValue());
        }
        i = j;
        if (g != null)
        {
            i = j + koh.e(7, g.intValue());
        }
        j = i;
        if (h != null)
        {
            j = i;
            if (h.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < h.length; j++)
                {
                    k += koh.b(h[j]);
                }

                j = i + k + h.length * 1;
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
    //                   8: 107
    //                   16: 121
    //                   24: 135
    //                   32: 149
    //                   40: 191
    //                   48: 205
    //                   56: 219
    //                   64: 233
    //                   66: 334;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = Long.valueOf(kog1.e());
          goto _L12
_L4:
        b = Long.valueOf(kog1.e());
          goto _L12
_L5:
        c = Boolean.valueOf(kog1.i());
          goto _L12
_L6:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        e = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L9:
        g = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L10:
        int i1 = kou.b(kog1, 64);
        long al[];
        int k;
        if (h == null)
        {
            k = 0;
        } else
        {
            k = h.length;
        }
        al = new long[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(h, 0, al, 0, k);
            i1 = k;
        }
        for (; i1 < al.length - 1; i1++)
        {
            al[i1] = kog1.e();
            kog1.a();
        }

        al[i1] = kog1.e();
        h = al;
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = kog1.c(kog1.p());
        int l = kog1.r();
        int j1;
        for (j1 = 0; kog1.q() > 0; j1++)
        {
            kog1.e();
        }

        kog1.e(l);
        long al1[];
        if (h == null)
        {
            l = 0;
        } else
        {
            l = h.length;
        }
        al1 = new long[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(h, 0, al1, 0, l);
            j1 = l;
        }
        for (; j1 < al1.length; j1++)
        {
            al1[j1] = kog1.e();
        }

        h = al1;
        kog1.d(k1);
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a.longValue());
        }
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != 0x80000000)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e.longValue());
        }
        if (f != null)
        {
            koh1.b(6, f.longValue());
        }
        if (g != null)
        {
            koh1.a(7, g.intValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i = 0; i < h.length; i++)
            {
                koh1.b(8, h[i]);
            }

        }
        super.writeTo(koh1);
    }
}
