// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class klb extends koj
{

    private static volatile klb g[];
    public Integer a;
    public Float b;
    public Integer c;
    public Float d;
    public Float e;
    public Integer f;

    public klb()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static klb[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new klb[0];
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
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(2, c.intValue());
        }
        i = j;
        if (e != null)
        {
            e.floatValue();
            i = j + (koh.f(3) + 4);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.e(4, f.intValue());
        }
        i = j;
        if (b != null)
        {
            b.floatValue();
            i = j + (koh.f(5) + 4);
        }
        j = i;
        if (d != null)
        {
            d.floatValue();
            j = i + (koh.f(6) + 4);
        }
        return j;
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
    //                   29: 111
    //                   32: 125
    //                   45: 330
    //                   53: 344;
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
        e = Float.valueOf(kog1.c());
          goto _L9
_L6:
        int j = kog1.f();
        switch (j)
        {
        case 43: // '+'
        case 44: // ','
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
        case 304: 
        case 305: 
        case 312: 
        case 314: 
        case 315: 
        case 316: 
        case 15000: 
            f = Integer.valueOf(j);
            break;
        }
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
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (c != null)
        {
            koh1.a(2, c.intValue());
        }
        if (e != null)
        {
            koh1.a(3, e.floatValue());
        }
        if (f != null)
        {
            koh1.a(4, f.intValue());
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
