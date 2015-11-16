// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iuf extends kwm
{

    public Integer a;
    public iuq b;
    public iuo c;
    public String d;
    public String e;
    public Integer f;
    public Long g;
    public String h;

    public iuf()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
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
            j = i + kwk.d(2, b);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.b(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.e(5, f.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(6, c);
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.e(7, g.longValue());
        }
        j = i;
        if (h != null)
        {
            j = i + kwk.b(8, h);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L11:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   8: 99
    //                   18: 594
    //                   26: 623
    //                   34: 634
    //                   40: 645
    //                   50: 659
    //                   56: 688
    //                   66: 702;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
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
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new iuq();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        f = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        if (c == null)
        {
            c = new iuo();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L9:
        g = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L10:
        h = kwj1.j();
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.a(5, f.intValue());
        }
        if (c != null)
        {
            kwk1.b(6, c);
        }
        if (g != null)
        {
            kwk1.b(7, g.longValue());
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        super.writeTo(kwk1);
    }
}
