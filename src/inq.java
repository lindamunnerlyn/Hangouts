// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class inq extends koj
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

    public inq()
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
            i1 = j1 + (koh.f(1) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            b.booleanValue();
            j1 = i1 + (koh.f(2) + 1);
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (koh.f(3) + 1);
        }
        j1 = i1;
        if (d != null)
        {
            d.booleanValue();
            j1 = i1 + (koh.f(4) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.e(5, e.intValue());
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (koh.f(6) + 1);
        }
        i1 = j1;
        if (g != null)
        {
            g.booleanValue();
            i1 = j1 + (koh.f(7) + 1);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.e(8, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (koh.f(9) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(10, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            k.booleanValue();
            i1 = j1 + (koh.f(11) + 1);
        }
        j1 = i1;
        if (l != null)
        {
            l.booleanValue();
            j1 = i1 + (koh.f(12) + 1);
        }
        i1 = j1;
        if (m != null)
        {
            m.booleanValue();
            i1 = j1 + (koh.f(13) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            n.booleanValue();
            j1 = i1 + (koh.f(14) + 1);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.e(15, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.e(16, p.intValue());
        }
        i1 = j1;
        if (q != null)
        {
            q.booleanValue();
            i1 = j1 + (koh.f(17) + 1);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.e(18, r.intValue());
        }
        i1 = j1;
        if (s != null)
        {
            s.booleanValue();
            i1 = j1 + (koh.f(19) + 1);
        }
        j1 = i1;
        if (t != null)
        {
            t.floatValue();
            j1 = i1 + (koh.f(20) + 4);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + koh.e(21, u.intValue());
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L24:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 22: default 192
    //                   0: 201
    //                   8: 203
    //                   16: 217
    //                   24: 231
    //                   32: 245
    //                   40: 259
    //                   48: 273
    //                   56: 287
    //                   64: 301
    //                   72: 315
    //                   80: 329
    //                   88: 374
    //                   96: 388
    //                   104: 402
    //                   112: 416
    //                   120: 430
    //                   128: 444
    //                   136: 458
    //                   144: 472
    //                   152: 486
    //                   165: 500
    //                   168: 514;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L24; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kog1.i());
          goto _L24
_L4:
        b = Boolean.valueOf(kog1.i());
          goto _L24
_L5:
        c = Boolean.valueOf(kog1.i());
          goto _L24
_L6:
        d = Boolean.valueOf(kog1.i());
          goto _L24
_L7:
        e = Integer.valueOf(kog1.f());
          goto _L24
_L8:
        f = Boolean.valueOf(kog1.i());
          goto _L24
_L9:
        g = Boolean.valueOf(kog1.i());
          goto _L24
_L10:
        h = Integer.valueOf(kog1.f());
          goto _L24
_L11:
        i = Boolean.valueOf(kog1.i());
          goto _L24
_L12:
        int j1 = kog1.f();
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
        k = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L14:
        l = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        m = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        n = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        o = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L18:
        p = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L19:
        q = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L20:
        r = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L21:
        s = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L22:
        t = Float.valueOf(kog1.c());
        continue; /* Loop/switch isn't completed */
_L23:
        u = Integer.valueOf(kog1.f());
        if (true) goto _L24; else goto _L25
_L25:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        if (f != null)
        {
            koh1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            koh1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            koh1.a(8, h.intValue());
        }
        if (i != null)
        {
            koh1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            koh1.a(10, j.intValue());
        }
        if (k != null)
        {
            koh1.a(11, k.booleanValue());
        }
        if (l != null)
        {
            koh1.a(12, l.booleanValue());
        }
        if (m != null)
        {
            koh1.a(13, m.booleanValue());
        }
        if (n != null)
        {
            koh1.a(14, n.booleanValue());
        }
        if (o != null)
        {
            koh1.a(15, o.intValue());
        }
        if (p != null)
        {
            koh1.a(16, p.intValue());
        }
        if (q != null)
        {
            koh1.a(17, q.booleanValue());
        }
        if (r != null)
        {
            koh1.a(18, r.intValue());
        }
        if (s != null)
        {
            koh1.a(19, s.booleanValue());
        }
        if (t != null)
        {
            koh1.a(20, t.floatValue());
        }
        if (u != null)
        {
            koh1.a(21, u.intValue());
        }
        super.writeTo(koh1);
    }
}
