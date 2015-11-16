// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iss extends koj
{

    private static volatile iss r[];
    public Integer a;
    public Boolean b;
    public ivz c;
    public isu d;
    public ism e;
    public iwk f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Integer j;
    public Integer k;
    public Integer l;
    public byte m[];
    public byte n[];
    public byte o[];
    public byte p[];
    public byte q[];

    public iss()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iss[] a()
    {
        if (r == null)
        {
            synchronized (kon.a)
            {
                if (r == null)
                {
                    r = new iss[0];
                }
            }
        }
        return r;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.b(1, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.b(2, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.b(3, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.b(4, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.b(5, q);
        }
        j1 = i1;
        if (g != null)
        {
            g.booleanValue();
            j1 = i1 + (koh.f(7) + 1);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.d(8, f);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.d(9, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.d(10, d);
        }
        j1 = i1;
        if (h != null)
        {
            h.booleanValue();
            j1 = i1 + (koh.f(11) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.d(12, e);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + koh.e(13, a.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (koh.f(14) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(15, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.e(16, k.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.e(17, l.intValue());
        }
        i1 = j1;
        if (b != null)
        {
            b.booleanValue();
            i1 = j1 + (koh.f(18) + 1);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L20:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 18: default 160
    //                   0: 169
    //                   10: 171
    //                   18: 182
    //                   26: 193
    //                   34: 204
    //                   42: 215
    //                   56: 226
    //                   66: 240
    //                   74: 269
    //                   82: 298
    //                   88: 327
    //                   98: 341
    //                   104: 370
    //                   112: 434
    //                   120: 448
    //                   128: 494
    //                   136: 542
    //                   144: 594;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        m = kog1.k();
          goto _L20
_L4:
        n = kog1.k();
          goto _L20
_L5:
        o = kog1.k();
          goto _L20
_L6:
        p = kog1.k();
          goto _L20
_L7:
        q = kog1.k();
          goto _L20
_L8:
        g = Boolean.valueOf(kog1.i());
          goto _L20
_L9:
        if (f == null)
        {
            f = new iwk();
        }
        kog1.a(f);
          goto _L20
_L10:
        if (c == null)
        {
            c = new ivz();
        }
        kog1.a(c);
          goto _L20
_L11:
        if (d == null)
        {
            d = new isu();
        }
        kog1.a(d);
          goto _L20
_L12:
        h = Boolean.valueOf(kog1.i());
          goto _L20
_L13:
        if (e == null)
        {
            e = new ism();
        }
        kog1.a(e);
          goto _L20
_L14:
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
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        i = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        int k1 = kog1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            j = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            k = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L18:
        int i2 = kog1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            l = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        b = Boolean.valueOf(kog1.i());
        if (true) goto _L20; else goto _L21
_L21:
    }

    public void writeTo(koh koh1)
    {
        if (m != null)
        {
            koh1.a(1, m);
        }
        if (n != null)
        {
            koh1.a(2, n);
        }
        if (o != null)
        {
            koh1.a(3, o);
        }
        if (p != null)
        {
            koh1.a(4, p);
        }
        if (q != null)
        {
            koh1.a(5, q);
        }
        if (g != null)
        {
            koh1.a(7, g.booleanValue());
        }
        if (f != null)
        {
            koh1.b(8, f);
        }
        if (c != null)
        {
            koh1.b(9, c);
        }
        if (d != null)
        {
            koh1.b(10, d);
        }
        if (h != null)
        {
            koh1.a(11, h.booleanValue());
        }
        if (e != null)
        {
            koh1.b(12, e);
        }
        if (a != null)
        {
            koh1.a(13, a.intValue());
        }
        if (i != null)
        {
            koh1.a(14, i.booleanValue());
        }
        if (j != null)
        {
            koh1.a(15, j.intValue());
        }
        if (k != null)
        {
            koh1.a(16, k.intValue());
        }
        if (l != null)
        {
            koh1.a(17, l.intValue());
        }
        if (b != null)
        {
            koh1.a(18, b.booleanValue());
        }
        super.writeTo(koh1);
    }
}
