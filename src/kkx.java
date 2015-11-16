// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kkx extends koj
{

    private static volatile kkx g[];
    public Integer a;
    public Float b;
    public Integer c;
    public Float d;
    public Float e;
    public int f;

    public kkx()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kkx[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new kkx[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize() + koh.e(1, a.intValue()) + koh.e(2, c.intValue()) + koh.e(3, f);
        int i = j;
        if (e != null)
        {
            e.floatValue();
            i = j + (koh.f(4) + 4);
        }
        j = i;
        if (b != null)
        {
            b.floatValue();
            j = i + (koh.f(5) + 4);
        }
        i = j;
        if (d != null)
        {
            d.floatValue();
            i = j + (koh.f(6) + 4);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   16: 97
    //                   24: 111
    //                   37: 403
    //                   45: 417
    //                   53: 431;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(kog1.f());
          goto _L9
_L4:
        c = Integer.valueOf(kog1.f());
          goto _L9
_L5:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 200: 
        case 220: 
        case 221: 
        case 222: 
        case 223: 
        case 224: 
        case 225: 
        case 226: 
        case 227: 
        case 240: 
        case 241: 
        case 300: 
        case 302: 
        case 312: 
        case 314: 
        case 315: 
        case 316: 
        case 15000: 
            f = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        e = Float.valueOf(kog1.c());
        continue; /* Loop/switch isn't completed */
_L7:
        b = Float.valueOf(kog1.c());
        continue; /* Loop/switch isn't completed */
_L8:
        d = Float.valueOf(kog1.c());
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a.intValue());
        koh1.a(2, c.intValue());
        koh1.a(3, f);
        if (e != null)
        {
            koh1.a(4, e.floatValue());
        }
        if (b != null)
        {
            koh1.a(5, b.floatValue());
        }
        if (d != null)
        {
            koh1.a(6, d.floatValue());
        }
        super.writeTo(koh1);
    }
}
