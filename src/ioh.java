// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ioh extends koj
{

    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public Long e;

    public ioh()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
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
        if (b != null)
        {
            j = i + koh.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.e(5, e.longValue());
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L8:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   16: 134
    //                   26: 630
    //                   34: 641
    //                   40: 652;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
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
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
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
        case 223: 
        case 224: 
        case 225: 
        case 226: 
        case 227: 
        case 228: 
        case 229: 
        case 230: 
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
            b = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = Long.valueOf(kog1.e());
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e.longValue());
        }
        super.writeTo(koh1);
    }
}
