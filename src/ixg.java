// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixg extends koj
{

    public Integer a;
    public String b;
    public String c;
    public Long d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public ize i;

    public ixg()
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
            j = k + koh.e(1, a.intValue());
        }
        k = j;
        if (b != null)
        {
            k = j + koh.b(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + koh.b(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + koh.d(4, d.longValue());
        }
        j = k;
        if (e != null)
        {
            j = k + koh.d(5, e.longValue());
        }
        k = j;
        if (f != null)
        {
            k = j + koh.d(6, f.longValue());
        }
        j = k;
        if (g != null)
        {
            j = k + koh.b(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + koh.b(8, h);
        }
        j = k;
        if (i != null)
        {
            j = k + koh.d(9, i);
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
    //                   8: 107
    //                   18: 190
    //                   26: 201
    //                   32: 212
    //                   40: 226
    //                   48: 240
    //                   58: 254
    //                   66: 265
    //                   74: 276;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, j)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
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
            a = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L9:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        if (i == null)
        {
            i = new ize();
        }
        kog1.a(i);
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
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
            koh1.a(4, d.longValue());
        }
        if (e != null)
        {
            koh1.a(5, e.longValue());
        }
        if (f != null)
        {
            koh1.a(6, f.longValue());
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
            koh1.b(9, i);
        }
        super.writeTo(koh1);
    }
}
