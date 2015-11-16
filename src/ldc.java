// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ldc extends kwm
{

    public static final kwn a = kwn.a(ldc, 0x13cf2522L);
    private static final ldc g[] = new ldc[0];
    public String b;
    public Integer c;
    public ldd d;
    public Boolean e;
    public Integer f;

    public ldc()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (c != null)
        {
            i = j + kwk.e(1, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(2, d);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (kwk.f(3) + 1);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.e(5, f.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(6, b);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L8:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   18: 782
    //                   24: 811
    //                   40: 825
    //                   50: 874;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 8: // '\b'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        case 106: // 'j'
        case 107: // 'k'
        case 108: // 'l'
        case 109: // 'm'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 113: // 'q'
        case 114: // 'r'
        case 115: // 's'
        case 116: // 't'
        case 117: // 'u'
        case 118: // 'v'
        case 119: // 'w'
        case 120: // 'x'
        case 121: // 'y'
        case 122: // 'z'
        case 123: // '{'
        case 124: // '|'
        case 125: // '}'
        case 126: // '~'
        case 127: // '\177'
        case 128: 
        case 129: 
        case 130: 
        case 131: 
        case 132: 
        case 133: 
        case 134: 
        case 135: 
        case 136: 
        case 137: 
        case 138: 
        case 139: 
        case 140: 
        case 141: 
        case 142: 
        case 143: 
        case 144: 
        case 145: 
        case 146: 
        case 147: 
        case 148: 
        case 149: 
        case 150: 
        case 151: 
        case 152: 
        case 153: 
        case 154: 
        case 155: 
        case 156: 
        case 157: 
        case 158: 
        case 159: 
        case 160: 
        case 161: 
        case 162: 
        case 163: 
        case 164: 
        case 165: 
        case 166: 
        case 167: 
            c = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (d == null)
        {
            d = new ldd();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L5:
        e = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            f = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        b = kwj1.j();
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(kwk kwk1)
    {
        if (c != null)
        {
            kwk1.a(1, c.intValue());
        }
        if (d != null)
        {
            kwk1.b(2, d);
        }
        if (e != null)
        {
            kwk1.a(3, e.booleanValue());
        }
        if (f != null)
        {
            kwk1.a(5, f.intValue());
        }
        if (b != null)
        {
            kwk1.a(6, b);
        }
        super.writeTo(kwk1);
    }

}
