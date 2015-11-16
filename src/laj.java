// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class laj extends kwm
{

    public Boolean A;
    public byte B[];
    public Boolean C;
    public String a;
    public Long b;
    public String c;
    public Long d;
    public String e;
    public int f;
    public String g;
    public byte h[];
    public byte i[];
    public byte j[];
    public String k;
    public String l;
    public lab m[];
    public byte n[];
    public lak o;
    public laa p;
    public lah q;
    public lad r;
    public lae s;
    public laf t;
    public lag u;
    public lac v;
    public lai w;
    public Integer x;
    public byte y[];
    public byte z[];

    public laj()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0x80000000;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = lab.a();
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.d(2, b.longValue());
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.e(4, d.longValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (f != 0x80000000)
        {
            j1 = i1 + kwk.e(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(10, j);
        }
        int k1 = j1;
        if (k != null)
        {
            k1 = j1 + kwk.b(11, k);
        }
        i1 = k1;
        if (l != null)
        {
            i1 = k1 + kwk.b(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    lab lab1 = m[j1];
                    int l1 = i1;
                    if (lab1 != null)
                    {
                        l1 = i1 + kwk.d(13, lab1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.b(14, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.d(15, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.d(16, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.d(17, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.d(18, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.d(19, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + kwk.d(20, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + kwk.d(21, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + kwk.d(22, v);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + kwk.d(23, w);
        }
        i1 = j1;
        if (x != null)
        {
            x.intValue();
            i1 = j1 + (kwk.f(24) + 4);
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + kwk.b(25, y);
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + kwk.b(26, z);
        }
        j1 = i1;
        if (A != null)
        {
            A.booleanValue();
            j1 = i1 + (kwk.f(27) + 1);
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.b(28, B);
        }
        j1 = i1;
        if (C != null)
        {
            C.booleanValue();
            j1 = i1 + (kwk.f(29) + 1);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L32:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 30: default 256
    //                   0: 265
    //                   10: 267
    //                   16: 278
    //                   26: 292
    //                   32: 303
    //                   42: 317
    //                   48: 328
    //                   58: 411
    //                   66: 422
    //                   74: 433
    //                   82: 444
    //                   90: 455
    //                   98: 466
    //                   106: 477
    //                   114: 601
    //                   122: 612
    //                   130: 641
    //                   138: 670
    //                   146: 699
    //                   154: 728
    //                   162: 757
    //                   170: 786
    //                   178: 815
    //                   186: 844
    //                   197: 873
    //                   202: 887
    //                   210: 898
    //                   216: 909
    //                   226: 923
    //                   232: 934;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L32; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L32
_L4:
        b = Long.valueOf(kwj1.d());
          goto _L32
_L5:
        c = kwj1.j();
          goto _L32
_L6:
        d = Long.valueOf(kwj1.e());
          goto _L32
_L7:
        e = kwj1.j();
          goto _L32
_L8:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
            f = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L11:
        i = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L12:
        j = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L13:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L14:
        l = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        int l1 = kwx.a(kwj1, 106);
        lab alab[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        alab = new lab[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, alab, 0, k1);
            l1 = k1;
        }
        for (; l1 < alab.length - 1; l1++)
        {
            alab[l1] = new lab();
            kwj1.a(alab[l1]);
            kwj1.a();
        }

        alab[l1] = new lab();
        kwj1.a(alab[l1]);
        m = alab;
        continue; /* Loop/switch isn't completed */
_L16:
        n = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L17:
        if (o == null)
        {
            o = new lak();
        }
        kwj1.a(o);
        continue; /* Loop/switch isn't completed */
_L18:
        if (p == null)
        {
            p = new laa();
        }
        kwj1.a(p);
        continue; /* Loop/switch isn't completed */
_L19:
        if (q == null)
        {
            q = new lah();
        }
        kwj1.a(q);
        continue; /* Loop/switch isn't completed */
_L20:
        if (r == null)
        {
            r = new lad();
        }
        kwj1.a(r);
        continue; /* Loop/switch isn't completed */
_L21:
        if (s == null)
        {
            s = new lae();
        }
        kwj1.a(s);
        continue; /* Loop/switch isn't completed */
_L22:
        if (t == null)
        {
            t = new laf();
        }
        kwj1.a(t);
        continue; /* Loop/switch isn't completed */
_L23:
        if (u == null)
        {
            u = new lag();
        }
        kwj1.a(u);
        continue; /* Loop/switch isn't completed */
_L24:
        if (v == null)
        {
            v = new lac();
        }
        kwj1.a(v);
        continue; /* Loop/switch isn't completed */
_L25:
        if (w == null)
        {
            w = new lai();
        }
        kwj1.a(w);
        continue; /* Loop/switch isn't completed */
_L26:
        x = Integer.valueOf(kwj1.h());
        continue; /* Loop/switch isn't completed */
_L27:
        y = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L28:
        z = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L29:
        A = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L30:
        B = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L31:
        C = Boolean.valueOf(kwj1.i());
        if (true) goto _L32; else goto _L33
_L33:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.longValue());
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != 0x80000000)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i);
        }
        if (j != null)
        {
            kwk1.a(10, j);
        }
        if (k != null)
        {
            kwk1.a(11, k);
        }
        if (l != null)
        {
            kwk1.a(12, l);
        }
        if (m != null && m.length > 0)
        {
            for (int i1 = 0; i1 < m.length; i1++)
            {
                lab lab1 = m[i1];
                if (lab1 != null)
                {
                    kwk1.b(13, lab1);
                }
            }

        }
        if (n != null)
        {
            kwk1.a(14, n);
        }
        if (o != null)
        {
            kwk1.b(15, o);
        }
        if (p != null)
        {
            kwk1.b(16, p);
        }
        if (q != null)
        {
            kwk1.b(17, q);
        }
        if (r != null)
        {
            kwk1.b(18, r);
        }
        if (s != null)
        {
            kwk1.b(19, s);
        }
        if (t != null)
        {
            kwk1.b(20, t);
        }
        if (u != null)
        {
            kwk1.b(21, u);
        }
        if (v != null)
        {
            kwk1.b(22, v);
        }
        if (w != null)
        {
            kwk1.b(23, w);
        }
        if (x != null)
        {
            kwk1.b(24, x.intValue());
        }
        if (y != null)
        {
            kwk1.a(25, y);
        }
        if (z != null)
        {
            kwk1.a(26, z);
        }
        if (A != null)
        {
            kwk1.a(27, A.booleanValue());
        }
        if (B != null)
        {
            kwk1.a(28, B);
        }
        if (C != null)
        {
            kwk1.a(29, C.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
