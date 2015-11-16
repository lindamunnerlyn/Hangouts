// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iel extends koj
{

    private static volatile iel A[];
    public String a;
    public String b;
    public iil c;
    public String d;
    public igq e;
    public Long f;
    public String g;
    public String h;
    public ier i;
    public String j;
    public String k;
    public Boolean l;
    public Boolean m;
    public String n;
    public Boolean o;
    public Boolean p;
    public Long q;
    public ibl r;
    public String s;
    public Boolean t;
    public String u;
    public ifn v;
    public int w;
    public Boolean x;
    public ifi y;
    public kuu z;

    public iel()
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
        w = 0x80000000;
        x = null;
        y = null;
        z = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iel[] a()
    {
        if (A == null)
        {
            synchronized (kon.a)
            {
                if (A == null)
                {
                    A = new iel[0];
                }
            }
        }
        return A;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize() + koh.b(2, a) + koh.b(3, b) + koh.e(4, f.longValue()) + koh.b(5, g);
        int i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.b(6, h);
        }
        j1 = koh.b(7, j);
        int k1 = koh.b(8, k);
        l.booleanValue();
        int l1 = koh.f(9);
        m.booleanValue();
        j1 = i1 + j1 + k1 + (l1 + 1) + (koh.f(10) + 1);
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.b(11, n);
        }
        o.booleanValue();
        j1 = i1 + (koh.f(12) + 1);
        i1 = j1;
        if (p != null)
        {
            p.booleanValue();
            i1 = j1 + (koh.f(13) + 1);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.e(15, q.longValue());
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.d(16, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.b(17, s);
        }
        i1 = j1;
        if (t != null)
        {
            t.booleanValue();
            i1 = j1 + (koh.f(18) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.d(19, c);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.d(20, i);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + koh.b(21, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + koh.d(22, v);
        }
        j1 = i1;
        if (w != 0x80000000)
        {
            j1 = i1 + koh.e(23, w);
        }
        i1 = j1;
        if (x != null)
        {
            x.booleanValue();
            i1 = j1 + (koh.f(24) + 1);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(25, d);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + koh.d(26, y);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.d(27, e);
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + koh.d(28, z);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L29:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 27: default 232
    //                   0: 241
    //                   18: 243
    //                   26: 254
    //                   32: 265
    //                   42: 279
    //                   50: 290
    //                   58: 301
    //                   66: 312
    //                   72: 323
    //                   80: 337
    //                   90: 351
    //                   96: 362
    //                   104: 376
    //                   120: 390
    //                   130: 404
    //                   138: 433
    //                   144: 444
    //                   154: 458
    //                   162: 487
    //                   170: 516
    //                   178: 527
    //                   184: 556
    //                   192: 603
    //                   202: 617
    //                   210: 628
    //                   218: 657
    //                   226: 686;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L29; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L29
_L4:
        b = kog1.j();
          goto _L29
_L5:
        f = Long.valueOf(kog1.e());
          goto _L29
_L6:
        g = kog1.j();
          goto _L29
_L7:
        h = kog1.j();
          goto _L29
_L8:
        j = kog1.j();
          goto _L29
_L9:
        k = kog1.j();
          goto _L29
_L10:
        l = Boolean.valueOf(kog1.i());
          goto _L29
_L11:
        m = Boolean.valueOf(kog1.i());
          goto _L29
_L12:
        n = kog1.j();
          goto _L29
_L13:
        o = Boolean.valueOf(kog1.i());
          goto _L29
_L14:
        p = Boolean.valueOf(kog1.i());
          goto _L29
_L15:
        q = Long.valueOf(kog1.e());
          goto _L29
_L16:
        if (r == null)
        {
            r = new ibl();
        }
        kog1.a(r);
          goto _L29
_L17:
        s = kog1.j();
          goto _L29
_L18:
        t = Boolean.valueOf(kog1.i());
          goto _L29
_L19:
        if (c == null)
        {
            c = new iil();
        }
        kog1.a(c);
          goto _L29
_L20:
        if (i == null)
        {
            i = new ier();
        }
        kog1.a(i);
          goto _L29
_L21:
        u = kog1.j();
          goto _L29
_L22:
        if (v == null)
        {
            v = new ifn();
        }
        kog1.a(v);
          goto _L29
_L23:
        int j1 = kog1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            w = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L24:
        x = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L25:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L26:
        if (y == null)
        {
            y = new ifi();
        }
        kog1.a(y);
        continue; /* Loop/switch isn't completed */
_L27:
        if (e == null)
        {
            e = new igq();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L28:
        if (z == null)
        {
            z = new kuu();
        }
        kog1.a(z);
        if (true) goto _L29; else goto _L30
_L30:
    }

    public void writeTo(koh koh1)
    {
        koh1.a(2, a);
        koh1.a(3, b);
        koh1.b(4, f.longValue());
        koh1.a(5, g);
        if (h != null)
        {
            koh1.a(6, h);
        }
        koh1.a(7, j);
        koh1.a(8, k);
        koh1.a(9, l.booleanValue());
        koh1.a(10, m.booleanValue());
        if (n != null)
        {
            koh1.a(11, n);
        }
        koh1.a(12, o.booleanValue());
        if (p != null)
        {
            koh1.a(13, p.booleanValue());
        }
        if (q != null)
        {
            koh1.b(15, q.longValue());
        }
        if (r != null)
        {
            koh1.b(16, r);
        }
        if (s != null)
        {
            koh1.a(17, s);
        }
        if (t != null)
        {
            koh1.a(18, t.booleanValue());
        }
        if (c != null)
        {
            koh1.b(19, c);
        }
        if (i != null)
        {
            koh1.b(20, i);
        }
        if (u != null)
        {
            koh1.a(21, u);
        }
        if (v != null)
        {
            koh1.b(22, v);
        }
        if (w != 0x80000000)
        {
            koh1.a(23, w);
        }
        if (x != null)
        {
            koh1.a(24, x.booleanValue());
        }
        if (d != null)
        {
            koh1.a(25, d);
        }
        if (y != null)
        {
            koh1.b(26, y);
        }
        if (e != null)
        {
            koh1.b(27, e);
        }
        if (z != null)
        {
            koh1.b(28, z);
        }
        super.writeTo(koh1);
    }
}
