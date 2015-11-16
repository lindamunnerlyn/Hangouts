// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfs extends koj
{

    private static volatile jfs e[];
    public Integer a;
    public Integer b;
    public Integer c;
    public Long d;

    public jfs()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jfs[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new jfs[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + koh.e(1, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(2, c.intValue());
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(3, d.longValue());
        }
        j = i;
        if (a != null)
        {
            j = i + koh.e(4, a.intValue());
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 722
    //                   24: 1378
    //                   32: 1392;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
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
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
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
            c = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L6:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 2: // '\002'
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
        case 15: // '\017'
        case 16: // '\020'
        case 101: // 'e'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
        case 107: // 'k'
        case 108: // 'l'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 113: // 'q'
        case 200: 
        case 201: 
        case 202: 
        case 203: 
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
            a = Integer.valueOf(l);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(1, b.intValue());
        }
        if (c != null)
        {
            koh1.a(2, c.intValue());
        }
        if (d != null)
        {
            koh1.b(3, d.longValue());
        }
        if (a != null)
        {
            koh1.a(4, a.intValue());
        }
        super.writeTo(koh1);
    }
}
