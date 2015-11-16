// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class imo extends kwm
{

    private static volatile imo j[];
    public Integer a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public imn i[];

    public imo()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = imn.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static imo[] a()
    {
        if (j == null)
        {
            synchronized (kwq.a)
            {
                if (j == null)
                {
                    j = new imo[0];
                }
            }
        }
        return j;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + kwk.e(1, a.intValue());
        }
        l = k;
        if (b != null)
        {
            l = k + kwk.b(2, b);
        }
        k = l;
        if (c != null)
        {
            k = l + kwk.b(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.b(4, d);
        }
        int i1 = l;
        if (e != null)
        {
            i1 = l + kwk.b(5, e);
        }
        k = i1;
        if (f != null)
        {
            k = i1 + kwk.b(6, f);
        }
        l = k;
        if (i != null)
        {
            l = k;
            if (i.length > 0)
            {
                for (l = 0; l < i.length;)
                {
                    imn imn1 = i[l];
                    int j1 = k;
                    if (imn1 != null)
                    {
                        j1 = k + kwk.d(7, imn1);
                    }
                    l++;
                    k = j1;
                }

                l = k;
            }
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.b(8, g);
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.e(9, h.intValue());
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int k = kwj1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   18: 194
    //                   26: 205
    //                   34: 216
    //                   42: 227
    //                   50: 238
    //                   58: 249
    //                   66: 373
    //                   72: 384;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int l = kwj1.f();
        switch (l)
        {
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
            a = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        int j1 = kwx.a(kwj1, 58);
        imn aimn[];
        int i1;
        if (i == null)
        {
            i1 = 0;
        } else
        {
            i1 = i.length;
        }
        aimn = new imn[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(i, 0, aimn, 0, i1);
            j1 = i1;
        }
        for (; j1 < aimn.length - 1; j1++)
        {
            aimn[j1] = new imn();
            kwj1.a(aimn[j1]);
            kwj1.a();
        }

        aimn[j1] = new imn();
        kwj1.a(aimn[j1]);
        i = aimn;
        continue; /* Loop/switch isn't completed */
_L10:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        h = Integer.valueOf(kwj1.f());
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (i != null && i.length > 0)
        {
            for (int k = 0; k < i.length; k++)
            {
                imn imn1 = i[k];
                if (imn1 != null)
                {
                    kwk1.b(7, imn1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(8, g);
        }
        if (h != null)
        {
            kwk1.a(9, h.intValue());
        }
        super.writeTo(kwk1);
    }
}
