// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwu extends koj
{

    public String a;
    public Integer b;
    public hvd c;
    public hve d;
    public hxe e;
    public hwi f;
    public String g;
    public hwt h;
    public String i;

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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + koh.b(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + koh.e(2, b.intValue());
        }
        j = k;
        if (c != null)
        {
            j = k + koh.d(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + koh.d(4, d);
        }
        j = k;
        if (e != null)
        {
            j = k + koh.d(5, e);
        }
        k = j;
        if (f != null)
        {
            k = j + koh.d(6, f);
        }
        j = k;
        if (g != null)
        {
            j = k + koh.b(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + koh.d(8, h);
        }
        j = k;
        if (i != null)
        {
            j = k + koh.b(9, i);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L12:
        int j = kog1.a();
        j;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   16: 118
    //                   26: 166
    //                   34: 195
    //                   42: 224
    //                   50: 253
    //                   58: 282
    //                   66: 293
    //                   74: 322;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, j)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L12
_L4:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            b = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new hvd();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new hve();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new hxe();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new hwi();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new hwt();
        }
        kog1.a(h);
        continue; /* Loop/switch isn't completed */
_L11:
        i = kog1.j();
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i);
        }
        super.writeTo(koh1);
    }
}
