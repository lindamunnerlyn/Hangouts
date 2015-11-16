// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhl extends koj
{

    private static volatile lhl d[];
    public lhn a;
    public lho b;
    public Integer c;

    public lhl()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lhl[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new lhl[0];
                }
            }
        }
        return d;
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
            i = j + koh.d(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(2, c.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L6:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   16: 88
    //                   26: 278;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new lhn();
        }
        kog1.a(a);
          goto _L6
_L4:
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
        case 312: 
        case 314: 
        case 315: 
        case 316: 
        case 15000: 
            c = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (b == null)
        {
            b = new lho();
        }
        kog1.a(b);
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (c != null)
        {
            koh1.a(2, c.intValue());
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        super.writeTo(koh1);
    }
}
