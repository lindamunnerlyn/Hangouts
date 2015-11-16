// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izx extends koj
{

    private static volatile izx n[];
    public String a;
    public String b;
    public String c;
    public Integer d;
    public String e;
    public String f;
    public jag g;
    public Integer h;
    public jac i;
    public jaa j;
    public jab k;
    public jad l;
    public Integer m;

    public izx()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static izx[] a()
    {
        if (n == null)
        {
            synchronized (kon.a)
            {
                if (n == null)
                {
                    n = new izx[0];
                }
            }
        }
        return n;
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
            i1 = j1 + koh.b(1, a);
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
            j1 = i1 + koh.e(4, d.intValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.d(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.e(7, h.intValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.d(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(9, j);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(10, e);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.e(13, m.intValue());
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L16:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 137
    //                   10: 139
    //                   18: 150
    //                   26: 161
    //                   32: 172
    //                   42: 222
    //                   50: 233
    //                   56: 262
    //                   66: 314
    //                   74: 343
    //                   82: 372
    //                   90: 383
    //                   98: 412
    //                   104: 441;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L16
_L4:
        b = kog1.j();
          goto _L16
_L5:
        c = kog1.j();
          goto _L16
_L6:
        int j1 = kog1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        f = kog1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        if (g == null)
        {
            g = new jag();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L9:
        int k1 = kog1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            h = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (i == null)
        {
            i = new jac();
        }
        kog1.a(i);
        continue; /* Loop/switch isn't completed */
_L11:
        if (j == null)
        {
            j = new jaa();
        }
        kog1.a(j);
        continue; /* Loop/switch isn't completed */
_L12:
        e = kog1.j();
        continue; /* Loop/switch isn't completed */
_L13:
        if (k == null)
        {
            k = new jab();
        }
        kog1.a(k);
        continue; /* Loop/switch isn't completed */
_L14:
        if (l == null)
        {
            l = new jad();
        }
        kog1.a(l);
        continue; /* Loop/switch isn't completed */
_L15:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
            m = Integer.valueOf(l1);
            break;
        }
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
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
            koh1.a(4, d.intValue());
        }
        if (f != null)
        {
            koh1.a(5, f);
        }
        if (g != null)
        {
            koh1.b(6, g);
        }
        if (h != null)
        {
            koh1.a(7, h.intValue());
        }
        if (i != null)
        {
            koh1.b(8, i);
        }
        if (j != null)
        {
            koh1.b(9, j);
        }
        if (e != null)
        {
            koh1.a(10, e);
        }
        if (k != null)
        {
            koh1.b(11, k);
        }
        if (l != null)
        {
            koh1.b(12, l);
        }
        if (m != null)
        {
            koh1.a(13, m.intValue());
        }
        super.writeTo(koh1);
    }
}
