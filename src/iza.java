// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iza extends kwm
{

    private static volatile iza y[];
    public ixl a;
    public jce b;
    public Long c;
    public String d;
    public izb e;
    public Integer f;
    public iww g;
    public jbq h;
    public ixo i;
    public jal j;
    public jcd k;
    public jcl l;
    public jcu m;
    public Long n;
    public Boolean o;
    public Integer p;
    public Boolean q;
    public iyf r;
    public izc s;
    public Integer t;
    public Long u;
    public iwr v;
    public Long w;
    public Integer x;

    public iza()
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

    public static iza[] a()
    {
        if (y == null)
        {
            synchronized (kwq.a)
            {
                if (y == null)
                {
                    y = new iza[0];
                }
            }
        }
        return y;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.d(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.d(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.d(3, c.longValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.d(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.e(6, f.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.d(7, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.d(9, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.d(10, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(11, j);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(12, d);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.e(13, n.longValue());
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.d(14, k);
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (kwk.f(15) + 1);
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
        if (l != null)
        {
            j1 = i1 + kwk.d(18, l);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.d(20, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.d(21, s);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.d(22, m);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.e(23, t.intValue());
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.d(24, u.longValue());
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.d(26, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.e(27, w.longValue());
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.e(28, x.intValue());
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
    //                   10: 227
    //                   18: 256
    //                   24: 285
    //                   34: 299
    //                   48: 328
    //                   58: 374
    //                   74: 403
    //                   82: 432
    //                   90: 461
    //                   98: 490
    //                   104: 501
    //                   114: 515
    //                   120: 544
    //                   128: 558
    //                   136: 602
    //                   146: 616
    //                   162: 645
    //                   170: 674
    //                   178: 703
    //                   184: 732
    //                   192: 818
    //                   210: 832
    //                   216: 861
    //                   224: 875;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L27; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new ixl();
        }
        kwj1.a(a);
          goto _L27
_L4:
        if (b == null)
        {
            b = new jce();
        }
        kwj1.a(b);
          goto _L27
_L5:
        c = Long.valueOf(kwj1.d());
          goto _L27
_L6:
        if (e == null)
        {
            e = new izb();
        }
        kwj1.a(e);
          goto _L27
_L7:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (g == null)
        {
            g = new iww();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L9:
        if (h == null)
        {
            h = new jbq();
        }
        kwj1.a(h);
        continue; /* Loop/switch isn't completed */
_L10:
        if (i == null)
        {
            i = new ixo();
        }
        kwj1.a(i);
        continue; /* Loop/switch isn't completed */
_L11:
        if (j == null)
        {
            j = new jal();
        }
        kwj1.a(j);
        continue; /* Loop/switch isn't completed */
_L12:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L13:
        n = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L14:
        if (k == null)
        {
            k = new jcd();
        }
        kwj1.a(k);
        continue; /* Loop/switch isn't completed */
_L15:
        o = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 1: // '\001'
        case 2: // '\002'
            p = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        q = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L18:
        if (l == null)
        {
            l = new jcl();
        }
        kwj1.a(l);
        continue; /* Loop/switch isn't completed */
_L19:
        if (r == null)
        {
            r = new iyf();
        }
        kwj1.a(r);
        continue; /* Loop/switch isn't completed */
_L20:
        if (s == null)
        {
            s = new izc();
        }
        kwj1.a(s);
        continue; /* Loop/switch isn't completed */
_L21:
        if (m == null)
        {
            m = new jcu();
        }
        kwj1.a(m);
        continue; /* Loop/switch isn't completed */
_L22:
        int l1 = kwj1.f();
        switch (l1)
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
            t = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L23:
        u = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L24:
        if (v == null)
        {
            v = new iwr();
        }
        kwj1.a(v);
        continue; /* Loop/switch isn't completed */
_L25:
        w = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L26:
        int i2 = kwj1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            x = Integer.valueOf(i2);
            break;
        }
        if (true) goto _L27; else goto _L28
_L28:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.longValue());
        }
        if (e != null)
        {
            kwk1.b(4, e);
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.b(9, h);
        }
        if (i != null)
        {
            kwk1.b(10, i);
        }
        if (j != null)
        {
            kwk1.b(11, j);
        }
        if (d != null)
        {
            kwk1.a(12, d);
        }
        if (n != null)
        {
            kwk1.b(13, n.longValue());
        }
        if (k != null)
        {
            kwk1.b(14, k);
        }
        if (o != null)
        {
            kwk1.a(15, o.booleanValue());
        }
        if (p != null)
        {
            kwk1.a(16, p.intValue());
        }
        if (q != null)
        {
            kwk1.a(17, q.booleanValue());
        }
        if (l != null)
        {
            kwk1.b(18, l);
        }
        if (r != null)
        {
            kwk1.b(20, r);
        }
        if (s != null)
        {
            kwk1.b(21, s);
        }
        if (m != null)
        {
            kwk1.b(22, m);
        }
        if (t != null)
        {
            kwk1.a(23, t.intValue());
        }
        if (u != null)
        {
            kwk1.a(24, u.longValue());
        }
        if (v != null)
        {
            kwk1.b(26, v);
        }
        if (w != null)
        {
            kwk1.b(27, w.longValue());
        }
        if (x != null)
        {
            kwk1.a(28, x.intValue());
        }
        super.writeTo(kwk1);
    }
}
