// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwl extends koj
{

    public String a;
    public int b;
    public kvw c;
    public kwb d;
    public String e;
    public String f;
    public byte g[];
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public String l;

    public kwl()
    {
        a = null;
        b = 0x80000000;
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize() + koh.b(1, a);
        int i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.b(3, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.b(5, g);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(6, e);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.d(7, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.d(8, d);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.e(9, h.longValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.e(10, k.longValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.e(11, i.longValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.b(12, l);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(13, j.longValue());
        }
        i1 = j1;
        if (b != 0x80000000)
        {
            i1 = j1 + koh.e(15, b);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L15:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 129
    //                   10: 131
    //                   26: 142
    //                   42: 153
    //                   50: 164
    //                   58: 175
    //                   66: 204
    //                   72: 233
    //                   80: 247
    //                   88: 261
    //                   98: 275
    //                   104: 286
    //                   120: 300;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L15
_L4:
        f = kog1.j();
          goto _L15
_L5:
        g = kog1.k();
          goto _L15
_L6:
        e = kog1.j();
          goto _L15
_L7:
        if (c == null)
        {
            c = new kvw();
        }
        kog1.a(c);
          goto _L15
_L8:
        if (d == null)
        {
            d = new kwb();
        }
        kog1.a(d);
          goto _L15
_L9:
        h = Long.valueOf(kog1.e());
          goto _L15
_L10:
        k = Long.valueOf(kog1.e());
          goto _L15
_L11:
        i = Long.valueOf(kog1.e());
          goto _L15
_L12:
        l = kog1.j();
          goto _L15
_L13:
        j = Long.valueOf(kog1.e());
          goto _L15
_L14:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            b = j1;
            break;
        }
        if (true) goto _L15; else goto _L16
_L16:
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a);
        if (f != null)
        {
            koh1.a(3, f);
        }
        if (g != null)
        {
            koh1.a(5, g);
        }
        if (e != null)
        {
            koh1.a(6, e);
        }
        if (c != null)
        {
            koh1.b(7, c);
        }
        if (d != null)
        {
            koh1.b(8, d);
        }
        if (h != null)
        {
            koh1.b(9, h.longValue());
        }
        if (k != null)
        {
            koh1.b(10, k.longValue());
        }
        if (i != null)
        {
            koh1.b(11, i.longValue());
        }
        if (l != null)
        {
            koh1.a(12, l);
        }
        if (j != null)
        {
            koh1.b(13, j.longValue());
        }
        if (b != 0x80000000)
        {
            koh1.a(15, b);
        }
        super.writeTo(koh1);
    }
}
