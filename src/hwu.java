// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwu extends kwm
{

    private static volatile hwu r[];
    public hwx a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Integer j;
    public String k;
    public String l;
    public Long m;
    public Long n;
    public Boolean o;
    public Long p;
    public Long q;

    public hwu()
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

    public static hwu[] a()
    {
        if (r == null)
        {
            synchronized (kwq.a)
            {
                if (r == null)
                {
                    r = new hwu[0];
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
        if (a != null)
        {
            i1 = j1 + kwk.d(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.b(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.e(10, j.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.e(11, m.longValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.e(12, n.longValue());
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (kwk.f(13) + 1);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.e(14, p.longValue());
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.e(15, q.longValue());
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.b(16, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.b(17, l);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L20:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 18: default 160
    //                   0: 169
    //                   10: 171
    //                   18: 200
    //                   26: 211
    //                   34: 222
    //                   42: 233
    //                   50: 244
    //                   58: 255
    //                   66: 266
    //                   74: 277
    //                   80: 288
    //                   88: 334
    //                   96: 348
    //                   104: 362
    //                   112: 376
    //                   120: 390
    //                   130: 404
    //                   138: 415;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new hwx();
        }
        kwj1.a(a);
          goto _L20
_L4:
        b = kwj1.j();
          goto _L20
_L5:
        c = kwj1.j();
          goto _L20
_L6:
        d = kwj1.j();
          goto _L20
_L7:
        e = kwj1.j();
          goto _L20
_L8:
        f = kwj1.j();
          goto _L20
_L9:
        g = kwj1.j();
          goto _L20
_L10:
        h = kwj1.j();
          goto _L20
_L11:
        i = kwj1.j();
          goto _L20
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
        m = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L14:
        n = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L15:
        o = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        p = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L17:
        q = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L18:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        l = kwj1.j();
        if (true) goto _L20; else goto _L21
_L21:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i);
        }
        if (j != null)
        {
            kwk1.a(10, j.intValue());
        }
        if (m != null)
        {
            kwk1.b(11, m.longValue());
        }
        if (n != null)
        {
            kwk1.b(12, n.longValue());
        }
        if (o != null)
        {
            kwk1.a(13, o.booleanValue());
        }
        if (p != null)
        {
            kwk1.b(14, p.longValue());
        }
        if (q != null)
        {
            kwk1.b(15, q.longValue());
        }
        if (k != null)
        {
            kwk1.a(16, k);
        }
        if (l != null)
        {
            kwk1.a(17, l);
        }
        super.writeTo(kwk1);
    }
}
