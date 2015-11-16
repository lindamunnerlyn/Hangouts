// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksg extends koj
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
    public kry m[];
    public byte n[];
    public ksh o;
    public krx p;
    public kse q;
    public ksa r;
    public ksb s;
    public ksc t;
    public ksd u;
    public krz v;
    public ksf w;
    public Integer x;
    public byte y[];
    public byte z[];

    public ksg()
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
        m = kry.a();
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
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.d(2, b.longValue());
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.e(4, d.longValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(5, e);
        }
        j1 = i1;
        if (f != 0x80000000)
        {
            j1 = i1 + koh.e(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.b(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(10, j);
        }
        int k1 = j1;
        if (k != null)
        {
            k1 = j1 + koh.b(11, k);
        }
        i1 = k1;
        if (l != null)
        {
            i1 = k1 + koh.b(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    kry kry1 = m[j1];
                    int l1 = i1;
                    if (kry1 != null)
                    {
                        l1 = i1 + koh.d(13, kry1);
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
            i1 = j1 + koh.b(14, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.d(15, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.d(16, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.d(17, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.d(18, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.d(19, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + koh.d(20, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + koh.d(21, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + koh.d(22, v);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + koh.d(23, w);
        }
        i1 = j1;
        if (x != null)
        {
            x.intValue();
            i1 = j1 + (koh.f(24) + 4);
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + koh.b(25, y);
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + koh.b(26, z);
        }
        j1 = i1;
        if (A != null)
        {
            A.booleanValue();
            j1 = i1 + (koh.f(27) + 1);
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + koh.b(28, B);
        }
        j1 = i1;
        if (C != null)
        {
            C.booleanValue();
            j1 = i1 + (koh.f(29) + 1);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L32:
        int i1 = kog1.a();
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
        if (super.storeUnknownField(kog1, i1)) goto _L32; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L32
_L4:
        b = Long.valueOf(kog1.d());
          goto _L32
_L5:
        c = kog1.j();
          goto _L32
_L6:
        d = Long.valueOf(kog1.e());
          goto _L32
_L7:
        e = kog1.j();
          goto _L32
_L8:
        int j1 = kog1.f();
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
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kog1.k();
        continue; /* Loop/switch isn't completed */
_L11:
        i = kog1.k();
        continue; /* Loop/switch isn't completed */
_L12:
        j = kog1.k();
        continue; /* Loop/switch isn't completed */
_L13:
        k = kog1.j();
        continue; /* Loop/switch isn't completed */
_L14:
        l = kog1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        int l1 = kou.b(kog1, 106);
        kry akry[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        akry = new kry[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, akry, 0, k1);
            l1 = k1;
        }
        for (; l1 < akry.length - 1; l1++)
        {
            akry[l1] = new kry();
            kog1.a(akry[l1]);
            kog1.a();
        }

        akry[l1] = new kry();
        kog1.a(akry[l1]);
        m = akry;
        continue; /* Loop/switch isn't completed */
_L16:
        n = kog1.k();
        continue; /* Loop/switch isn't completed */
_L17:
        if (o == null)
        {
            o = new ksh();
        }
        kog1.a(o);
        continue; /* Loop/switch isn't completed */
_L18:
        if (p == null)
        {
            p = new krx();
        }
        kog1.a(p);
        continue; /* Loop/switch isn't completed */
_L19:
        if (q == null)
        {
            q = new kse();
        }
        kog1.a(q);
        continue; /* Loop/switch isn't completed */
_L20:
        if (r == null)
        {
            r = new ksa();
        }
        kog1.a(r);
        continue; /* Loop/switch isn't completed */
_L21:
        if (s == null)
        {
            s = new ksb();
        }
        kog1.a(s);
        continue; /* Loop/switch isn't completed */
_L22:
        if (t == null)
        {
            t = new ksc();
        }
        kog1.a(t);
        continue; /* Loop/switch isn't completed */
_L23:
        if (u == null)
        {
            u = new ksd();
        }
        kog1.a(u);
        continue; /* Loop/switch isn't completed */
_L24:
        if (v == null)
        {
            v = new krz();
        }
        kog1.a(v);
        continue; /* Loop/switch isn't completed */
_L25:
        if (w == null)
        {
            w = new ksf();
        }
        kog1.a(w);
        continue; /* Loop/switch isn't completed */
_L26:
        x = Integer.valueOf(kog1.h());
        continue; /* Loop/switch isn't completed */
_L27:
        y = kog1.k();
        continue; /* Loop/switch isn't completed */
_L28:
        z = kog1.k();
        continue; /* Loop/switch isn't completed */
_L29:
        A = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L30:
        B = kog1.k();
        continue; /* Loop/switch isn't completed */
_L31:
        C = Boolean.valueOf(kog1.i());
        if (true) goto _L32; else goto _L33
_L33:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.longValue());
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d.longValue());
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != 0x80000000)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i);
        }
        if (j != null)
        {
            koh1.a(10, j);
        }
        if (k != null)
        {
            koh1.a(11, k);
        }
        if (l != null)
        {
            koh1.a(12, l);
        }
        if (m != null && m.length > 0)
        {
            for (int i1 = 0; i1 < m.length; i1++)
            {
                kry kry1 = m[i1];
                if (kry1 != null)
                {
                    koh1.b(13, kry1);
                }
            }

        }
        if (n != null)
        {
            koh1.a(14, n);
        }
        if (o != null)
        {
            koh1.b(15, o);
        }
        if (p != null)
        {
            koh1.b(16, p);
        }
        if (q != null)
        {
            koh1.b(17, q);
        }
        if (r != null)
        {
            koh1.b(18, r);
        }
        if (s != null)
        {
            koh1.b(19, s);
        }
        if (t != null)
        {
            koh1.b(20, t);
        }
        if (u != null)
        {
            koh1.b(21, u);
        }
        if (v != null)
        {
            koh1.b(22, v);
        }
        if (w != null)
        {
            koh1.b(23, w);
        }
        if (x != null)
        {
            koh1.b(24, x.intValue());
        }
        if (y != null)
        {
            koh1.a(25, y);
        }
        if (z != null)
        {
            koh1.a(26, z);
        }
        if (A != null)
        {
            koh1.a(27, A.booleanValue());
        }
        if (B != null)
        {
            koh1.a(28, B);
        }
        if (C != null)
        {
            koh1.a(29, C.booleanValue());
        }
        super.writeTo(koh1);
    }
}
