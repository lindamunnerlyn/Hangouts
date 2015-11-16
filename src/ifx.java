// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifx extends koj
{

    public String a;
    public int b;
    public int c;
    public iek d;
    public ifd e;
    public igm f;
    public iez g;
    public int h;

    public ifx()
    {
        a = null;
        b = 0x80000000;
        c = 0x80000000;
        d = null;
        e = null;
        f = null;
        g = null;
        h = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != 0x80000000)
        {
            j = i + koh.e(2, b);
        }
        i = j;
        if (c != 0x80000000)
        {
            i = j + koh.e(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.d(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + koh.d(7, g);
        }
        j = i;
        if (h != 0x80000000)
        {
            j = i + koh.e(8, h);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L11:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   16: 110
    //                   24: 191
    //                   34: 231
    //                   42: 260
    //                   50: 289
    //                   58: 318
    //                   64: 347;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L11
_L4:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k = kog1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
            c = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new iek();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new ifd();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new igm();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new iez();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = l;
            break;
        }
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != 0x80000000)
        {
            koh1.a(2, b);
        }
        if (c != 0x80000000)
        {
            koh1.a(3, c);
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
            koh1.b(7, g);
        }
        if (h != 0x80000000)
        {
            koh1.a(8, h);
        }
        super.writeTo(koh1);
    }
}
