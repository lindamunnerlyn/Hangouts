// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyg extends koj
{

    private static volatile hyg o[];
    public String a;
    public String b;
    public String c;
    public igi d;
    public igb e;
    public kus f;
    public String g;
    public Long h;
    public Long i;
    public hyu j;
    public Integer k;
    public Integer l;
    public String m;
    public ibf n;

    public hyg()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hyg[] a()
    {
        if (o == null)
        {
            synchronized (kon.a)
            {
                if (o == null)
                {
                    o = new hyg[0];
                }
            }
        }
        return o;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize() + koh.b(1, a) + koh.b(2, b) + koh.b(3, g);
        int i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(4, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.e(5, k.intValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.e(6, l.intValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.b(7, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.d(8, n);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(9, c);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.e(10, h.longValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.e(11, i.longValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.d(12, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.d(13, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.d(14, f);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L17:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 15: default 136
    //                   0: 145
    //                   10: 147
    //                   18: 158
    //                   26: 169
    //                   34: 180
    //                   40: 209
    //                   48: 258
    //                   58: 302
    //                   66: 313
    //                   74: 342
    //                   80: 353
    //                   88: 367
    //                   98: 381
    //                   106: 410
    //                   114: 439;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L17; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L17
_L4:
        b = kog1.j();
          goto _L17
_L5:
        g = kog1.j();
          goto _L17
_L6:
        if (j == null)
        {
            j = new hyu();
        }
        kog1.a(j);
          goto _L17
_L7:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            k = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int k1 = kog1.f();
        switch (k1)
        {
        case 1: // '\001'
        case 2: // '\002'
            l = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        m = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        if (n == null)
        {
            n = new ibf();
        }
        kog1.a(n);
        continue; /* Loop/switch isn't completed */
_L11:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        h = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L13:
        i = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L14:
        if (d == null)
        {
            d = new igi();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L15:
        if (e == null)
        {
            e = new igb();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L16:
        if (f == null)
        {
            f = new kus();
        }
        kog1.a(f);
        if (true) goto _L17; else goto _L18
_L18:
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a);
        koh1.a(2, b);
        koh1.a(3, g);
        if (j != null)
        {
            koh1.b(4, j);
        }
        if (k != null)
        {
            koh1.a(5, k.intValue());
        }
        if (l != null)
        {
            koh1.a(6, l.intValue());
        }
        if (m != null)
        {
            koh1.a(7, m);
        }
        if (n != null)
        {
            koh1.b(8, n);
        }
        if (c != null)
        {
            koh1.a(9, c);
        }
        if (h != null)
        {
            koh1.b(10, h.longValue());
        }
        if (i != null)
        {
            koh1.b(11, i.longValue());
        }
        if (d != null)
        {
            koh1.b(12, d);
        }
        if (e != null)
        {
            koh1.b(13, e);
        }
        if (f != null)
        {
            koh1.b(14, f);
        }
        super.writeTo(koh1);
    }
}
