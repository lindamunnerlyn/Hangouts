// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class htw extends koj
{

    private static volatile htw j[];
    public Integer a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public htw f[];
    public String g;
    public String h;
    public Integer i;

    public htw()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = a();
        g = null;
        h = null;
        i = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static htw[] a()
    {
        if (j == null)
        {
            synchronized (kon.a)
            {
                if (j == null)
                {
                    j = new htw[0];
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
            k = l + koh.e(1, a.intValue());
        }
        l = k;
        if (b != null)
        {
            l = k + koh.b(2, b);
        }
        k = l;
        if (c != null)
        {
            k = l + koh.b(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + koh.b(4, d);
        }
        k = l;
        if (e != null)
        {
            e.booleanValue();
            k = l + (koh.f(5) + 1);
        }
        l = k;
        if (f != null)
        {
            l = k;
            if (f.length > 0)
            {
                for (l = 0; l < f.length;)
                {
                    htw htw1 = f[l];
                    int i1 = k;
                    if (htw1 != null)
                    {
                        i1 = k + koh.d(6, htw1);
                    }
                    l++;
                    k = i1;
                }

                l = k;
            }
        }
        k = l;
        if (g != null)
        {
            k = l + koh.b(7, g);
        }
        l = k;
        if (h != null)
        {
            l = k + koh.b(8, h);
        }
        k = l;
        if (i != null)
        {
            k = l + koh.e(9, i.intValue());
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
_L12:
        int k = kog1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   18: 186
    //                   26: 197
    //                   34: 208
    //                   40: 219
    //                   50: 233
    //                   58: 357
    //                   66: 368
    //                   72: 379;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int l = kog1.f();
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
            a = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kou.b(kog1, 50);
        htw ahtw[];
        int i1;
        if (f == null)
        {
            i1 = 0;
        } else
        {
            i1 = f.length;
        }
        ahtw = new htw[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(f, 0, ahtw, 0, i1);
            j1 = i1;
        }
        for (; j1 < ahtw.length - 1; j1++)
        {
            ahtw[j1] = new htw();
            kog1.a(ahtw[j1]);
            kog1.a();
        }

        ahtw[j1] = new htw();
        kog1.a(ahtw[j1]);
        f = ahtw;
        continue; /* Loop/switch isn't completed */
_L9:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        i = Integer.valueOf(kog1.f());
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b);
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
            koh1.a(5, e.booleanValue());
        }
        if (f != null && f.length > 0)
        {
            for (int k = 0; k < f.length; k++)
            {
                htw htw1 = f[k];
                if (htw1 != null)
                {
                    koh1.b(6, htw1);
                }
            }

        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i.intValue());
        }
        super.writeTo(koh1);
    }
}