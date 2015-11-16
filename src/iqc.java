// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqc extends koj
{

    public byte a[];
    public byte b[];
    public Integer c;
    public Boolean d;
    public Long e;
    public Long f;
    public Integer g;
    public Boolean h;
    public Long i;
    public Long j;
    public String k;
    public String l;
    public String m;
    public String n;
    public Integer o;
    public int p;

    public iqc()
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
        p = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize() + koh.b(1, a);
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.b(2, b);
        }
        j1 = i1 + koh.f(3, c.intValue());
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (koh.f(5) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.d(6, i.longValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.d(8, f.longValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.d(9, e.longValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.f(10, g.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.d(11, j.longValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.b(13, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.b(14, l);
        }
        i1 = j1;
        if (h != null)
        {
            h.booleanValue();
            i1 = j1 + (koh.f(15) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.b(16, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.b(17, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.f(18, o.intValue());
        }
        i1 = j1;
        if (p != 0x80000000)
        {
            i1 = j1 + koh.e(19, p);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L19:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   10: 163
    //                   18: 174
    //                   24: 185
    //                   40: 199
    //                   48: 213
    //                   64: 227
    //                   72: 241
    //                   80: 255
    //                   88: 269
    //                   106: 283
    //                   114: 294
    //                   120: 305
    //                   130: 319
    //                   138: 330
    //                   144: 341
    //                   152: 355;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.k();
          goto _L19
_L4:
        b = kog1.k();
          goto _L19
_L5:
        c = Integer.valueOf(kog1.l());
          goto _L19
_L6:
        d = Boolean.valueOf(kog1.i());
          goto _L19
_L7:
        i = Long.valueOf(kog1.d());
          goto _L19
_L8:
        f = Long.valueOf(kog1.d());
          goto _L19
_L9:
        e = Long.valueOf(kog1.d());
          goto _L19
_L10:
        g = Integer.valueOf(kog1.l());
          goto _L19
_L11:
        j = Long.valueOf(kog1.d());
          goto _L19
_L12:
        k = kog1.j();
          goto _L19
_L13:
        l = kog1.j();
          goto _L19
_L14:
        h = Boolean.valueOf(kog1.i());
          goto _L19
_L15:
        m = kog1.j();
          goto _L19
_L16:
        n = kog1.j();
          goto _L19
_L17:
        o = Integer.valueOf(kog1.l());
          goto _L19
_L18:
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
            p = j1;
            break;
        }
        if (true) goto _L19; else goto _L20
_L20:
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a);
        if (b != null)
        {
            koh1.a(2, b);
        }
        koh1.c(3, c.intValue());
        if (d != null)
        {
            koh1.a(5, d.booleanValue());
        }
        if (i != null)
        {
            koh1.a(6, i.longValue());
        }
        if (f != null)
        {
            koh1.a(8, f.longValue());
        }
        if (e != null)
        {
            koh1.a(9, e.longValue());
        }
        if (g != null)
        {
            koh1.c(10, g.intValue());
        }
        if (j != null)
        {
            koh1.a(11, j.longValue());
        }
        if (k != null)
        {
            koh1.a(13, k);
        }
        if (l != null)
        {
            koh1.a(14, l);
        }
        if (h != null)
        {
            koh1.a(15, h.booleanValue());
        }
        if (m != null)
        {
            koh1.a(16, m);
        }
        if (n != null)
        {
            koh1.a(17, n);
        }
        if (o != null)
        {
            koh1.c(18, o.intValue());
        }
        if (p != 0x80000000)
        {
            koh1.a(19, p);
        }
        super.writeTo(koh1);
    }
}
