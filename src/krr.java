// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krr extends koj
{

    public Long a;
    public String b;
    public int c;
    public String d;
    public Boolean e;
    public String f;
    public String g;
    public Boolean h;
    public Boolean i;
    public Boolean j;

    public krr()
    {
        a = null;
        b = null;
        c = 0x80000000;
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
        int l = super.computeSerializedSize() + koh.e(1, a.longValue()) + koh.b(2, b);
        int k = l;
        if (c != 0x80000000)
        {
            k = l + koh.e(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + koh.b(4, d);
        }
        k = l;
        if (e != null)
        {
            e.booleanValue();
            k = l + (koh.f(5) + 1);
        }
        l = k;
        if (f != null)
        {
            l = k + koh.b(6, f);
        }
        k = l;
        if (g != null)
        {
            k = l + koh.b(7, g);
        }
        l = k;
        if (h != null)
        {
            h.booleanValue();
            l = k + (koh.f(8) + 1);
        }
        k = l;
        if (i != null)
        {
            i.booleanValue();
            k = l + (koh.f(9) + 1);
        }
        l = k;
        if (j != null)
        {
            j.booleanValue();
            l = k + (koh.f(10) + 1);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
_L13:
        int k = kog1.a();
        k;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   8: 115
    //                   18: 129
    //                   24: 140
    //                   34: 183
    //                   40: 194
    //                   50: 208
    //                   58: 219
    //                   64: 230
    //                   72: 244
    //                   80: 258;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kog1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = Long.valueOf(kog1.e());
          goto _L13
_L4:
        b = kog1.j();
          goto _L13
_L5:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = l;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        f = kog1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L11:
        i = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L12:
        j = Boolean.valueOf(kog1.i());
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(koh koh1)
    {
        koh1.b(1, a.longValue());
        koh1.a(2, b);
        if (c != 0x80000000)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e.booleanValue());
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
            koh1.a(8, h.booleanValue());
        }
        if (i != null)
        {
            koh1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            koh1.a(10, j.booleanValue());
        }
        super.writeTo(koh1);
    }
}
