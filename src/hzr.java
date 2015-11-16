// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzr extends kwm
{

    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Integer j;
    public Integer k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public hzp o;
    public Boolean p;

    public hzr()
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
            e.booleanValue();
            i1 = j1 + (kwk.f(5) + 1);
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
            h.booleanValue();
            j1 = i1 + (kwk.f(8) + 1);
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
            i1 = j1 + kwk.e(11, k.intValue());
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
            i1 = j1 + kwk.d(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            p.booleanValue();
            j1 = i1 + (kwk.f(16) + 1);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L19:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   8: 163
    //                   16: 177
    //                   24: 191
    //                   32: 205
    //                   40: 219
    //                   48: 233
    //                   56: 247
    //                   64: 261
    //                   72: 275
    //                   80: 289
    //                   88: 334
    //                   96: 386
    //                   104: 400
    //                   112: 414
    //                   122: 428
    //                   128: 457;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kwj1.i());
          goto _L19
_L4:
        b = Boolean.valueOf(kwj1.i());
          goto _L19
_L5:
        c = Boolean.valueOf(kwj1.i());
          goto _L19
_L6:
        d = Boolean.valueOf(kwj1.i());
          goto _L19
_L7:
        e = Boolean.valueOf(kwj1.i());
          goto _L19
_L8:
        f = Boolean.valueOf(kwj1.i());
          goto _L19
_L9:
        g = Boolean.valueOf(kwj1.i());
          goto _L19
_L10:
        h = Boolean.valueOf(kwj1.i());
          goto _L19
_L11:
        i = Boolean.valueOf(kwj1.i());
          goto _L19
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
        int k1 = kwj1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            k = Integer.valueOf(k1);
            break;
        }
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
        if (o == null)
        {
            o = new hzp();
        }
        kwj1.a(o);
        continue; /* Loop/switch isn't completed */
_L18:
        p = Boolean.valueOf(kwj1.i());
        if (true) goto _L19; else goto _L20
_L20:
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
            kwk1.a(5, e.booleanValue());
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
            kwk1.a(8, h.booleanValue());
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
            kwk1.a(11, k.intValue());
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
            kwk1.b(15, o);
        }
        if (p != null)
        {
            kwk1.a(16, p.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
