// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hrr extends koj
{

    private static volatile hrr r[];
    public hru a;
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

    public hrr()
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

    public static hrr[] a()
    {
        if (r == null)
        {
            synchronized (kon.a)
            {
                if (r == null)
                {
                    r = new hrr[0];
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
            i1 = j1 + koh.d(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.b(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.b(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(10, j.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.e(11, m.longValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.e(12, n.longValue());
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (koh.f(13) + 1);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.e(14, p.longValue());
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.e(15, q.longValue());
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.b(16, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.b(17, l);
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
        if (super.storeUnknownField(kog1, i1)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new hru();
        }
        kog1.a(a);
          goto _L20
_L4:
        b = kog1.j();
          goto _L20
_L5:
        c = kog1.j();
          goto _L20
_L6:
        d = kog1.j();
          goto _L20
_L7:
        e = kog1.j();
          goto _L20
_L8:
        f = kog1.j();
          goto _L20
_L9:
        g = kog1.j();
          goto _L20
_L10:
        h = kog1.j();
          goto _L20
_L11:
        i = kog1.j();
          goto _L20
_L12:
        int j1 = kog1.f();
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
        m = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L14:
        n = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L15:
        o = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        p = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L17:
        q = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L18:
        k = kog1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        l = kog1.j();
        if (true) goto _L20; else goto _L21
_L21:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i);
        }
        if (j != null)
        {
            koh1.a(10, j.intValue());
        }
        if (m != null)
        {
            koh1.b(11, m.longValue());
        }
        if (n != null)
        {
            koh1.b(12, n.longValue());
        }
        if (o != null)
        {
            koh1.a(13, o.booleanValue());
        }
        if (p != null)
        {
            koh1.b(14, p.longValue());
        }
        if (q != null)
        {
            koh1.b(15, q.longValue());
        }
        if (k != null)
        {
            koh1.a(16, k);
        }
        if (l != null)
        {
            koh1.a(17, l);
        }
        super.writeTo(koh1);
    }
}
