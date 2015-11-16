// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jed extends koj
{

    public Long a;
    public String b;
    public ius c;
    public jei d[];
    public Integer e;
    public Boolean f;
    public Integer g;
    public jeg h;
    public String i;
    public String j;

    public jed()
    {
        a = null;
        b = null;
        c = null;
        d = jei.a();
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (b != null)
        {
            k = l + koh.b(1, b);
        }
        l = k;
        if (c != null)
        {
            l = k + koh.d(2, c);
        }
        k = l;
        if (e != null)
        {
            k = l + koh.e(3, e.intValue());
        }
        l = k;
        if (f != null)
        {
            f.booleanValue();
            l = k + (koh.f(4) + 1);
        }
        k = l;
        if (g != null)
        {
            k = l + koh.e(6, g.intValue());
        }
        l = k;
        if (h != null)
        {
            l = k + koh.d(7, h);
        }
        int i1 = l;
        if (a != null)
        {
            i1 = l + koh.e(8, a.longValue());
        }
        k = i1;
        if (i != null)
        {
            k = i1 + koh.b(9, i);
        }
        l = k;
        if (d != null)
        {
            l = k;
            if (d.length > 0)
            {
                for (l = 0; l < d.length;)
                {
                    jei jei1 = d[l];
                    int j1 = k;
                    if (jei1 != null)
                    {
                        j1 = k + koh.d(11, jei1);
                    }
                    l++;
                    k = j1;
                }

                l = k;
            }
        }
        k = l;
        if (j != null)
        {
            k = l + koh.b(99, j);
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
_L13:
        int k = kog1.a();
        k;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   18: 126
    //                   24: 155
    //                   32: 206
    //                   48: 220
    //                   58: 278
    //                   64: 307
    //                   74: 321
    //                   90: 332
    //                   794: 456;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kog1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        b = kog1.j();
          goto _L13
_L4:
        if (c == null)
        {
            c = new ius();
        }
        kog1.a(c);
          goto _L13
_L5:
        int l = kog1.f();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            e = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        f = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            g = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (h == null)
        {
            h = new jeg();
        }
        kog1.a(h);
        continue; /* Loop/switch isn't completed */
_L9:
        a = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L10:
        i = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = kou.b(kog1, 90);
        jei ajei[];
        int j1;
        if (d == null)
        {
            j1 = 0;
        } else
        {
            j1 = d.length;
        }
        ajei = new jei[k1 + j1];
        k1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(d, 0, ajei, 0, j1);
            k1 = j1;
        }
        for (; k1 < ajei.length - 1; k1++)
        {
            ajei[k1] = new jei();
            kog1.a(ajei[k1]);
            kog1.a();
        }

        ajei[k1] = new jei();
        kog1.a(ajei[k1]);
        d = ajei;
        continue; /* Loop/switch isn't completed */
_L12:
        j = kog1.j();
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(1, b);
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (e != null)
        {
            koh1.a(3, e.intValue());
        }
        if (f != null)
        {
            koh1.a(4, f.booleanValue());
        }
        if (g != null)
        {
            koh1.a(6, g.intValue());
        }
        if (h != null)
        {
            koh1.b(7, h);
        }
        if (a != null)
        {
            koh1.b(8, a.longValue());
        }
        if (i != null)
        {
            koh1.a(9, i);
        }
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                jei jei1 = d[k];
                if (jei1 != null)
                {
                    koh1.b(11, jei1);
                }
            }

        }
        if (j != null)
        {
            koh1.a(99, j);
        }
        super.writeTo(koh1);
    }
}
