// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikh extends koj
{

    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public Integer i;
    public Integer j;
    public Boolean k;
    public Boolean l;
    public String m;
    public Integer n;
    public Boolean o;
    public Boolean p;
    public String q;

    public ikh()
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

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(1, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(2, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.b(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            g.doubleValue();
            i1 = j1 + (koh.f(5) + 8);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.e(7, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(8, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            k.booleanValue();
            i1 = j1 + (koh.f(9) + 1);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + koh.e(10, a.intValue());
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.e(11, b.intValue());
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
            i1 = j1 + koh.b(13, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.e(14, n.intValue());
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (koh.f(15) + 1);
        }
        j1 = i1;
        if (p != null)
        {
            p.booleanValue();
            j1 = i1 + (koh.f(16) + 1);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.b(17, q);
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
    //                   41: 215
    //                   50: 229
    //                   56: 240
    //                   64: 254
    //                   72: 268
    //                   80: 282
    //                   88: 330
    //                   96: 344
    //                   106: 358
    //                   112: 369
    //                   120: 383
    //                   128: 397
    //                   138: 411;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        c = kog1.j();
          goto _L20
_L4:
        d = kog1.j();
          goto _L20
_L5:
        e = kog1.j();
          goto _L20
_L6:
        f = kog1.j();
          goto _L20
_L7:
        g = Double.valueOf(kog1.b());
          goto _L20
_L8:
        h = kog1.j();
          goto _L20
_L9:
        i = Integer.valueOf(kog1.f());
          goto _L20
_L10:
        j = Integer.valueOf(kog1.f());
          goto _L20
_L11:
        k = Boolean.valueOf(kog1.i());
          goto _L20
_L12:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        b = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L14:
        l = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        m = kog1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        n = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L17:
        o = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L18:
        p = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L19:
        q = kog1.j();
        if (true) goto _L20; else goto _L21
_L21:
    }

    public void writeTo(koh koh1)
    {
        if (c != null)
        {
            koh1.a(1, c);
        }
        if (d != null)
        {
            koh1.a(2, d);
        }
        if (e != null)
        {
            koh1.a(3, e);
        }
        if (f != null)
        {
            koh1.a(4, f);
        }
        if (g != null)
        {
            koh1.a(5, g.doubleValue());
        }
        if (h != null)
        {
            koh1.a(6, h);
        }
        if (i != null)
        {
            koh1.a(7, i.intValue());
        }
        if (j != null)
        {
            koh1.a(8, j.intValue());
        }
        if (k != null)
        {
            koh1.a(9, k.booleanValue());
        }
        if (a != null)
        {
            koh1.a(10, a.intValue());
        }
        if (b != null)
        {
            koh1.a(11, b.intValue());
        }
        if (l != null)
        {
            koh1.a(12, l.booleanValue());
        }
        if (m != null)
        {
            koh1.a(13, m);
        }
        if (n != null)
        {
            koh1.a(14, n.intValue());
        }
        if (o != null)
        {
            koh1.a(15, o.booleanValue());
        }
        if (p != null)
        {
            koh1.a(16, p.booleanValue());
        }
        if (q != null)
        {
            koh1.a(17, q);
        }
        super.writeTo(koh1);
    }
}
