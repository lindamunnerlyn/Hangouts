// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljz extends kwm
{

    public Integer a;
    public Integer b;
    public ljl c;
    public String d;
    public Integer e;
    public Long f;
    public String g;
    public String h;
    public String i[];
    public Boolean j;
    public String k;
    public Integer l;
    public String m;
    public String n;
    public String o;
    public Boolean p;
    public Boolean q;

    public ljz()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = kwx.f;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            a.intValue();
            i1 = j1 + (kwk.f(1) + 4);
        }
        j1 = i1;
        if (b != null)
        {
            b.intValue();
            j1 = i1 + (kwk.f(2) + 4);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = e.intValue();
            int k1 = kwk.f(4);
            j1 = i1 + (kwk.h(kwk.i(j1)) + k1);
        }
        i1 = j1;
        if (f != null)
        {
            long l3 = f.longValue();
            i1 = kwk.f(5);
            i1 = j1 + (kwk.b(kwk.c(l3)) + i1);
        }
        j1 = i1;
        if (j != null)
        {
            j.booleanValue();
            j1 = i1 + (kwk.f(6) + 1);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(7, g);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.b(8, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.e(9, l.intValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.b(10, m);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.d(11, c);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.b(12, n);
        }
        int l1 = j1;
        if (h != null)
        {
            l1 = j1 + kwk.b(13, h);
        }
        i1 = l1;
        if (o != null)
        {
            i1 = l1 + kwk.b(14, o);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                int i2 = 0;
                int j2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < i.length;)
                {
                    String s = i[j1];
                    int l2 = i2;
                    int k2 = j2;
                    if (s != null)
                    {
                        k2 = j2 + 1;
                        l2 = i2 + kwk.a(s);
                    }
                    j1++;
                    i2 = l2;
                    j2 = k2;
                }

                j1 = i1 + i2 + j2 * 2;
            }
        }
        i1 = j1;
        if (p != null)
        {
            p.booleanValue();
            i1 = j1 + (kwk.f(17) + 1);
        }
        j1 = i1;
        if (q != null)
        {
            q.booleanValue();
            j1 = i1 + (kwk.f(18) + 1);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L20:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 18: default 160
    //                   0: 169
    //                   13: 171
    //                   21: 185
    //                   26: 199
    //                   32: 210
    //                   40: 224
    //                   48: 238
    //                   58: 252
    //                   66: 263
    //                   72: 274
    //                   82: 322
    //                   90: 333
    //                   98: 362
    //                   106: 373
    //                   114: 384
    //                   130: 395
    //                   136: 498
    //                   144: 512;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(kwj1.m());
          goto _L20
_L4:
        b = Integer.valueOf(kwj1.m());
          goto _L20
_L5:
        d = kwj1.j();
          goto _L20
_L6:
        e = Integer.valueOf(kwj1.n());
          goto _L20
_L7:
        f = Long.valueOf(kwj1.o());
          goto _L20
_L8:
        j = Boolean.valueOf(kwj1.i());
          goto _L20
_L9:
        g = kwj1.j();
          goto _L20
_L10:
        k = kwj1.j();
          goto _L20
_L11:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            l = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        m = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L13:
        if (c == null)
        {
            c = new ljl();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L14:
        n = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        o = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        int l1 = kwx.a(kwj1, 130);
        String as[];
        int k1;
        if (i == null)
        {
            k1 = 0;
        } else
        {
            k1 = i.length;
        }
        as = new String[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(i, 0, as, 0, k1);
            l1 = k1;
        }
        for (; l1 < as.length - 1; l1++)
        {
            as[l1] = kwj1.j();
            kwj1.a();
        }

        as[l1] = kwj1.j();
        i = as;
        continue; /* Loop/switch isn't completed */
_L18:
        p = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L19:
        q = Boolean.valueOf(kwj1.i());
        if (true) goto _L20; else goto _L21
_L21:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.d(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.d(2, b.intValue());
        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.a(e.intValue());
        }
        if (f != null)
        {
            kwk1.a(f.longValue());
        }
        if (j != null)
        {
            kwk1.a(6, j.booleanValue());
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (k != null)
        {
            kwk1.a(8, k);
        }
        if (l != null)
        {
            kwk1.a(9, l.intValue());
        }
        if (m != null)
        {
            kwk1.a(10, m);
        }
        if (c != null)
        {
            kwk1.b(11, c);
        }
        if (n != null)
        {
            kwk1.a(12, n);
        }
        if (h != null)
        {
            kwk1.a(13, h);
        }
        if (o != null)
        {
            kwk1.a(14, o);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                String s = i[i1];
                if (s != null)
                {
                    kwk1.a(16, s);
                }
            }

        }
        if (p != null)
        {
            kwk1.a(17, p.booleanValue());
        }
        if (q != null)
        {
            kwk1.a(18, q.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
