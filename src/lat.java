// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lat extends kwm
{

    private static volatile lat d[];
    public lav a;
    public law b;
    public int c;

    public lat()
    {
        a = null;
        b = null;
        c = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lat[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new lat[0];
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
            i = j + kwk.d(1, a);
        }
        j = i;
        if (c != 0x80000000)
        {
            j = i + kwk.e(2, c);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(3, b);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L6:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   16: 88
    //                   26: 275;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new lav();
        }
        kwj1.a(a);
          goto _L6
_L4:
        int j = kwj1.f();
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
            c = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (b == null)
        {
            b = new law();
        }
        kwj1.a(b);
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (c != 0x80000000)
        {
            kwk1.a(2, c);
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        super.writeTo(kwk1);
    }
}
