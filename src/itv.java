// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itv extends kwm
{

    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Integer e;
    public Boolean f;
    public Boolean g;
    public Integer h;
    public Boolean i;
    public Integer j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public Integer r;
    public Boolean s;
    public Float t;
    public Integer u;
    public Boolean v;
    public Integer w;
    public Integer x;

    public itv()
    {
        a = null;
        b = null;
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            a.booleanValue();
            i1 = j1 + (kwk.f(1) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            b.booleanValue();
            j1 = i1 + (kwk.f(2) + 1);
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (kwk.f(3) + 1);
        }
        j1 = i1;
        if (d != null)
        {
            d.booleanValue();
            j1 = i1 + (kwk.f(4) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.e(5, e.intValue());
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (kwk.f(6) + 1);
        }
        i1 = j1;
        if (g != null)
        {
            g.booleanValue();
            i1 = j1 + (kwk.f(7) + 1);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(8, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (kwk.f(9) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.e(10, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            k.booleanValue();
            i1 = j1 + (kwk.f(11) + 1);
        }
        j1 = i1;
        if (l != null)
        {
            l.booleanValue();
            j1 = i1 + (kwk.f(12) + 1);
        }
        i1 = j1;
        if (m != null)
        {
            m.booleanValue();
            i1 = j1 + (kwk.f(13) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            n.booleanValue();
            j1 = i1 + (kwk.f(14) + 1);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.e(15, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.e(16, p.intValue());
        }
        i1 = j1;
        if (q != null)
        {
            q.booleanValue();
            i1 = j1 + (kwk.f(17) + 1);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + kwk.e(18, r.intValue());
        }
        i1 = j1;
        if (s != null)
        {
            s.booleanValue();
            i1 = j1 + (kwk.f(19) + 1);
        }
        j1 = i1;
        if (t != null)
        {
            t.floatValue();
            j1 = i1 + (kwk.f(20) + 4);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.e(21, u.intValue());
        }
        j1 = i1;
        if (v != null)
        {
            v.booleanValue();
            j1 = i1 + (kwk.f(22) + 1);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.e(23, w.intValue());
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.e(24, x.intValue());
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L27:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 25: default 216
    //                   0: 225
    //                   8: 227
    //                   16: 241
    //                   24: 255
    //                   32: 269
    //                   40: 283
    //                   48: 297
    //                   56: 311
    //                   64: 325
    //                   72: 339
    //                   80: 353
    //                   88: 398
    //                   96: 412
    //                   104: 426
    //                   112: 440
    //                   120: 454
    //                   128: 468
    //                   136: 482
    //                   144: 496
    //                   152: 510
    //                   165: 524
    //                   168: 538
    //                   176: 552
    //                   184: 566
    //                   192: 580;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L27; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kwj1.i());
          goto _L27
_L4:
        b = Boolean.valueOf(kwj1.i());
          goto _L27
_L5:
        c = Boolean.valueOf(kwj1.i());
          goto _L27
_L6:
        d = Boolean.valueOf(kwj1.i());
          goto _L27
_L7:
        e = Integer.valueOf(kwj1.f());
          goto _L27
_L8:
        f = Boolean.valueOf(kwj1.i());
          goto _L27
_L9:
        g = Boolean.valueOf(kwj1.i());
          goto _L27
_L10:
        h = Integer.valueOf(kwj1.f());
          goto _L27
_L11:
        i = Boolean.valueOf(kwj1.i());
          goto _L27
_L12:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            j = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        k = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L14:
        l = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        m = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        n = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        o = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L18:
        p = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L19:
        q = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L20:
        r = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L21:
        s = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L22:
        t = Float.valueOf(kwj1.c());
        continue; /* Loop/switch isn't completed */
_L23:
        u = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L24:
        v = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L25:
        w = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L26:
        x = Integer.valueOf(kwj1.f());
        if (true) goto _L27; else goto _L28
_L28:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            kwk1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            kwk1.a(8, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            kwk1.a(10, j.intValue());
        }
        if (k != null)
        {
            kwk1.a(11, k.booleanValue());
        }
        if (l != null)
        {
            kwk1.a(12, l.booleanValue());
        }
        if (m != null)
        {
            kwk1.a(13, m.booleanValue());
        }
        if (n != null)
        {
            kwk1.a(14, n.booleanValue());
        }
        if (o != null)
        {
            kwk1.a(15, o.intValue());
        }
        if (p != null)
        {
            kwk1.a(16, p.intValue());
        }
        if (q != null)
        {
            kwk1.a(17, q.booleanValue());
        }
        if (r != null)
        {
            kwk1.a(18, r.intValue());
        }
        if (s != null)
        {
            kwk1.a(19, s.booleanValue());
        }
        if (t != null)
        {
            kwk1.a(20, t.floatValue());
        }
        if (u != null)
        {
            kwk1.a(21, u.intValue());
        }
        if (v != null)
        {
            kwk1.a(22, v.booleanValue());
        }
        if (w != null)
        {
            kwk1.a(23, w.intValue());
        }
        if (x != null)
        {
            kwk1.a(24, x.intValue());
        }
        super.writeTo(kwk1);
    }
}
