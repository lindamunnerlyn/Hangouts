// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jvz extends koj
{

    public jvy a;
    public int b;
    public jwc c;
    public jwe d;
    public jwg e;
    public jwi f;
    public jwk g;
    public kth h;
    public ktg i;
    public ktf j;
    public ktp k;
    public kts l;
    public ktu m;
    public ktm n;
    public ktn o;
    public ktj p;
    public ktq q;
    public ktr r;
    public ktv s;
    public ktk t;
    public kti u;
    public ktt v;
    public ktl w;
    public jwm x;
    public kto y;

    public jvz()
    {
        a = null;
        b = 0x80000000;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + koh.d(1, a);
        }
        j1 = i1;
        if (b != 0x80000000)
        {
            j1 = i1 + koh.e(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.d(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.d(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.d(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.d(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.d(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(13, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.d(14, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.d(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.d(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.d(17, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.d(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + koh.d(19, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + koh.d(20, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + koh.d(21, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + koh.d(22, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + koh.d(23, w);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + koh.d(24, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + koh.d(25, y);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L28:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 26: default 224
    //                   0: 233
    //                   10: 235
    //                   16: 264
    //                   26: 391
    //                   34: 420
    //                   42: 449
    //                   50: 478
    //                   58: 507
    //                   66: 536
    //                   74: 565
    //                   82: 594
    //                   90: 623
    //                   98: 652
    //                   106: 681
    //                   114: 710
    //                   122: 739
    //                   130: 768
    //                   138: 797
    //                   146: 826
    //                   154: 855
    //                   162: 884
    //                   170: 913
    //                   178: 942
    //                   186: 971
    //                   194: 1000
    //                   202: 1029;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L28; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new jvy();
        }
        kog1.a(a);
          goto _L28
_L4:
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
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
            b = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new jwc();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new jwe();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new jwg();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new jwi();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new jwk();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new kth();
        }
        kog1.a(h);
        continue; /* Loop/switch isn't completed */
_L11:
        if (i == null)
        {
            i = new ktg();
        }
        kog1.a(i);
        continue; /* Loop/switch isn't completed */
_L12:
        if (j == null)
        {
            j = new ktf();
        }
        kog1.a(j);
        continue; /* Loop/switch isn't completed */
_L13:
        if (k == null)
        {
            k = new ktp();
        }
        kog1.a(k);
        continue; /* Loop/switch isn't completed */
_L14:
        if (l == null)
        {
            l = new kts();
        }
        kog1.a(l);
        continue; /* Loop/switch isn't completed */
_L15:
        if (m == null)
        {
            m = new ktu();
        }
        kog1.a(m);
        continue; /* Loop/switch isn't completed */
_L16:
        if (n == null)
        {
            n = new ktm();
        }
        kog1.a(n);
        continue; /* Loop/switch isn't completed */
_L17:
        if (o == null)
        {
            o = new ktn();
        }
        kog1.a(o);
        continue; /* Loop/switch isn't completed */
_L18:
        if (p == null)
        {
            p = new ktj();
        }
        kog1.a(p);
        continue; /* Loop/switch isn't completed */
_L19:
        if (q == null)
        {
            q = new ktq();
        }
        kog1.a(q);
        continue; /* Loop/switch isn't completed */
_L20:
        if (r == null)
        {
            r = new ktr();
        }
        kog1.a(r);
        continue; /* Loop/switch isn't completed */
_L21:
        if (s == null)
        {
            s = new ktv();
        }
        kog1.a(s);
        continue; /* Loop/switch isn't completed */
_L22:
        if (t == null)
        {
            t = new ktk();
        }
        kog1.a(t);
        continue; /* Loop/switch isn't completed */
_L23:
        if (u == null)
        {
            u = new kti();
        }
        kog1.a(u);
        continue; /* Loop/switch isn't completed */
_L24:
        if (v == null)
        {
            v = new ktt();
        }
        kog1.a(v);
        continue; /* Loop/switch isn't completed */
_L25:
        if (w == null)
        {
            w = new ktl();
        }
        kog1.a(w);
        continue; /* Loop/switch isn't completed */
_L26:
        if (x == null)
        {
            x = new jwm();
        }
        kog1.a(x);
        continue; /* Loop/switch isn't completed */
_L27:
        if (y == null)
        {
            y = new kto();
        }
        kog1.a(y);
        if (true) goto _L28; else goto _L29
_L29:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != 0x80000000)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        if (i != null)
        {
            koh1.b(9, i);
        }
        if (j != null)
        {
            koh1.b(10, j);
        }
        if (k != null)
        {
            koh1.b(11, k);
        }
        if (l != null)
        {
            koh1.b(12, l);
        }
        if (m != null)
        {
            koh1.b(13, m);
        }
        if (n != null)
        {
            koh1.b(14, n);
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
            koh1.b(24, x);
        }
        if (y != null)
        {
            koh1.b(25, y);
        }
        super.writeTo(koh1);
    }
}
