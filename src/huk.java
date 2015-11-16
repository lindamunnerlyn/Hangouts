// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huk extends kwm
{

    public hup a;
    public kxc b;
    public hum c;
    public Long d;
    public String e;
    public hul f;
    public String g;
    public Boolean h;
    public Integer i;
    public huo j;

    public huk()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + kwk.d(1, a);
        }
        l = k;
        if (b != null)
        {
            l = k + kwk.d(2, b);
        }
        k = l;
        if (c != null)
        {
            k = l + kwk.d(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.e(4, d.longValue());
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.b(5, e);
        }
        l = k;
        if (f != null)
        {
            l = k + kwk.d(6, f);
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.b(7, g);
        }
        l = k;
        if (h != null)
        {
            h.booleanValue();
            l = k + (kwk.f(8) + 1);
        }
        k = l;
        if (i != null)
        {
            k = l + kwk.e(9, i.intValue());
        }
        l = k;
        if (j != null)
        {
            l = k + kwk.d(10, j);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L13:
        int k = kwj1.a();
        k;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   18: 144
    //                   26: 173
    //                   32: 202
    //                   42: 216
    //                   50: 227
    //                   58: 256
    //                   64: 267
    //                   72: 281
    //                   82: 330;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new hup();
        }
        kwj1.a(a);
          goto _L13
_L4:
        if (b == null)
        {
            b = new kxc();
        }
        kwj1.a(b);
          goto _L13
_L5:
        if (c == null)
        {
            c = new hum();
        }
        kwj1.a(c);
          goto _L13
_L6:
        d = Long.valueOf(kwj1.e());
          goto _L13
_L7:
        e = kwj1.j();
          goto _L13
_L8:
        if (f == null)
        {
            f = new hul();
        }
        kwj1.a(f);
          goto _L13
_L9:
        g = kwj1.j();
          goto _L13
_L10:
        h = Boolean.valueOf(kwj1.i());
          goto _L13
_L11:
        int l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            i = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (j == null)
        {
            j = new huo();
        }
        kwj1.a(j);
        if (true) goto _L13; else goto _L14
_L14:
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
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h.booleanValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.intValue());
        }
        if (j != null)
        {
            kwk1.b(10, j);
        }
        super.writeTo(kwk1);
    }
}
