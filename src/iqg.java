// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqg extends koj
{

    private static volatile iqg q[];
    public Integer a;
    public Long b;
    public String c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Integer i;
    public Integer j;
    public Long k;
    public String l;
    public Long m;
    public Integer n;
    public Integer o;
    public Integer p;

    public iqg()
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

    public static iqg[] a()
    {
        if (q == null)
        {
            synchronized (kon.a)
            {
                if (q == null)
                {
                    q = new iqg[0];
                }
            }
        }
        return q;
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
            i1 = j1 + koh.e(1, a.intValue());
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.e(2, b.longValue());
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(3, c);
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
            e.booleanValue();
            i1 = j1 + (koh.f(5) + 1);
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
            h.booleanValue();
            j1 = i1 + (koh.f(8) + 1);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.e(9, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(10, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(11, k.longValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.b(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(13, m.longValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.e(14, n.intValue());
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
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L19:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   8: 163
    //                   16: 250
    //                   26: 264
    //                   32: 275
    //                   40: 289
    //                   48: 303
    //                   56: 317
    //                   64: 331
    //                   72: 345
    //                   80: 390
    //                   88: 446
    //                   98: 460
    //                   104: 471
    //                   112: 485
    //                   120: 586
    //                   128: 600;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
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
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L5:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L9:
        g = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        h = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = kog1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            i = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        int l1 = kog1.f();
        switch (l1)
        {
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
            j = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        k = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L14:
        l = kog1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        m = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L16:
        int i2 = kog1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 100: // 'd'
        case 101: // 'e'
        case 701: 
        case 702: 
        case 703: 
        case 704: 
        case 705: 
        case 706: 
            n = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        o = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L18:
        int j2 = kog1.f();
        switch (j2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            p = Integer.valueOf(j2);
            break;
        }
        if (true) goto _L19; else goto _L20
_L20:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            koh1.a(5, e.booleanValue());
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
            koh1.a(8, h.booleanValue());
        }
        if (i != null)
        {
            koh1.a(9, i.intValue());
        }
        if (j != null)
        {
            koh1.a(10, j.intValue());
        }
        if (k != null)
        {
            koh1.a(11, k.longValue());
        }
        if (l != null)
        {
            koh1.a(12, l);
        }
        if (m != null)
        {
            koh1.a(13, m.longValue());
        }
        if (n != null)
        {
            koh1.a(14, n.intValue());
        }
        if (o != null)
        {
            koh1.a(15, o.intValue());
        }
        if (p != null)
        {
            koh1.a(16, p.intValue());
        }
        super.writeTo(koh1);
    }
}
