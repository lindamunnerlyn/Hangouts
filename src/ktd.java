// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ktd extends koj
{

    public ksm a;
    public kkl b;
    public jwp c;
    public jtn d;
    public Integer e;
    public int f;
    public ktw g;
    public Float h;
    public Boolean i;

    public ktd()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0x80000000;
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
            j = k + koh.d(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + koh.d(2, b);
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
            j = k + koh.e(5, e.intValue());
        }
        k = j;
        if (f != 0x80000000)
        {
            k = j + koh.e(6, f);
        }
        j = k;
        if (g != null)
        {
            j = k + koh.d(7, g);
        }
        k = j;
        if (h != null)
        {
            h.floatValue();
            k = j + (koh.f(10) + 4);
        }
        j = k;
        if (i != null)
        {
            i.booleanValue();
            j = k + (koh.f(11) + 1);
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
    //                   18: 136
    //                   26: 165
    //                   34: 194
    //                   40: 223
    //                   48: 237
    //                   58: 279
    //                   85: 308
    //                   88: 322;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, j)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new ksm();
        }
        kog1.a(a);
          goto _L12
_L4:
        if (b == null)
        {
            b = new kkl();
        }
        kog1.a(b);
          goto _L12
_L5:
        if (c == null)
        {
            c = new jwp();
        }
        kog1.a(c);
          goto _L12
_L6:
        if (d == null)
        {
            d = new jtn();
        }
        kog1.a(d);
          goto _L12
_L7:
        e = Integer.valueOf(kog1.f());
          goto _L12
_L8:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new ktw();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        h = Float.valueOf(kog1.c());
        continue; /* Loop/switch isn't completed */
_L11:
        i = Boolean.valueOf(kog1.i());
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.b(2, b);
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
            koh1.a(5, e.intValue());
        }
        if (f != 0x80000000)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.a(10, h.floatValue());
        }
        if (i != null)
        {
            koh1.a(11, i.booleanValue());
        }
        super.writeTo(koh1);
    }
}
