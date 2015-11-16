// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lci extends kwm
{

    public int a;
    public int b;
    public int c;
    public int d;

    public lci()
    {
        a = 0x80000000;
        b = 0x80000000;
        c = 0x80000000;
        d = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + kwk.e(1, a);
        }
        j = i;
        if (b != 0x80000000)
        {
            j = i + kwk.e(2, b);
        }
        i = j;
        if (c != 0x80000000)
        {
            i = j + kwk.e(3, c);
        }
        j = i;
        if (d != 0x80000000)
        {
            j = i + kwk.e(4, d);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 215
    //                   24: 1795
    //                   32: 1863;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
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
        case 100: // 'd'
        case 200: 
        case 201: 
        case 202: 
        case 203: 
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = kwj1.f();
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
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 80: // 'P'
        case 81: // 'Q'
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
        case 168: 
        case 169: 
        case 170: 
        case 171: 
        case 172: 
        case 173: 
        case 174: 
        case 175: 
        case 176: 
        case 177: 
        case 178: 
        case 179: 
        case 180: 
        case 181: 
        case 182: 
        case 183: 
        case 184: 
        case 185: 
        case 186: 
        case 187: 
        case 188: 
        case 189: 
        case 190: 
        case 191: 
        case 192: 
        case 193: 
        case 194: 
        case 195: 
        case 196: 
        case 197: 
        case 198: 
        case 199: 
        case 200: 
        case 201: 
        case 202: 
        case 203: 
        case 204: 
        case 205: 
        case 206: 
        case 207: 
        case 208: 
        case 209: 
        case 210: 
        case 211: 
        case 212: 
        case 213: 
        case 214: 
        case 215: 
        case 216: 
        case 217: 
        case 218: 
        case 219: 
        case 220: 
        case 221: 
        case 222: 
        case 300: 
        case 301: 
        case 400: 
        case 401: 
        case 402: 
        case 403: 
        case 404: 
        case 405: 
        case 406: 
        case 407: 
        case 408: 
        case 409: 
        case 410: 
        case 411: 
        case 412: 
        case 500: 
        case 501: 
        case 502: 
        case 503: 
        case 504: 
        case 505: 
        case 506: 
        case 507: 
        case 508: 
        case 509: 
        case 510: 
        case 511: 
        case 512: 
        case 513: 
        case 514: 
        case 515: 
        case 516: 
        case 517: 
        case 518: 
        case 519: 
        case 520: 
        case 521: 
        case 522: 
        case 523: 
        case 524: 
        case 525: 
        case 526: 
        case 527: 
        case 1000: 
        case 1001: 
        case 1002: 
        case 1003: 
        case 1004: 
        case 1005: 
        case 1006: 
        case 1007: 
        case 1008: 
        case 1009: 
        case 1010: 
            b = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 10: // '\n'
        case 20: // '\024'
            c = l;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = kwj1.f();
        switch (i1)
        {
        case 20: // '\024'
        case 30: // '\036'
        case 40: // '('
        case 50: // '2'
        case 90: // 'Z'
        case 100: // 'd'
        case 110: // 'n'
            d = i1;
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        if (b != 0x80000000)
        {
            kwk1.a(2, b);
        }
        if (c != 0x80000000)
        {
            kwk1.a(3, c);
        }
        if (d != 0x80000000)
        {
            kwk1.a(4, d);
        }
        super.writeTo(kwk1);
    }
}
