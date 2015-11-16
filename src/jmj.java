// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jmj extends kwm
{

    private static volatile jmj c[];
    public Integer a;
    public Long b;

    public jmj()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jmj[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new jmj[0];
                }
            }
        }
        return c;
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
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.longValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L5:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   16: 938;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L5; else goto _L2
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
        case 200: 
        case 201: 
        case 202: 
        case 203: 
        case 204: 
        case 205: 
        case 300: 
        case 301: 
        case 302: 
        case 303: 
        case 304: 
        case 305: 
        case 306: 
        case 307: 
        case 308: 
        case 309: 
        case 310: 
        case 311: 
        case 312: 
        case 313: 
        case 314: 
        case 315: 
        case 316: 
        case 317: 
        case 318: 
        case 319: 
        case 320: 
        case 321: 
        case 322: 
        case 323: 
        case 324: 
        case 325: 
        case 326: 
        case 327: 
        case 328: 
        case 329: 
        case 330: 
        case 331: 
        case 332: 
        case 333: 
        case 334: 
        case 335: 
        case 336: 
        case 337: 
        case 338: 
        case 339: 
        case 340: 
        case 341: 
        case 342: 
        case 343: 
        case 344: 
        case 345: 
        case 346: 
        case 347: 
        case 348: 
        case 349: 
        case 350: 
        case 351: 
        case 352: 
        case 353: 
        case 354: 
        case 355: 
        case 400: 
        case 401: 
        case 402: 
        case 403: 
        case 404: 
        case 405: 
        case 406: 
        case 407: 
        case 500: 
        case 501: 
        case 502: 
        case 503: 
        case 1000: 
        case 1001: 
        case 1002: 
        case 1003: 
        case 1004: 
        case 1005: 
        case 1100: 
        case 1101: 
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Long.valueOf(kwj1.e());
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        super.writeTo(kwk1);
    }
}
