// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyt extends koj
{

    public byte a[];
    public String b;
    public kyu c[];
    public kyu d;
    public kyo e;
    public Integer f;

    public kyt()
    {
        a = null;
        b = null;
        c = kyu.a();
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    kyu kyu1 = c[j];
                    int k = i;
                    if (kyu1 != null)
                    {
                        k = i + koh.d(3, kyu1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(5, e);
        }
        i = j;
        if (f != null)
        {
            i = j + koh.e(6, f.intValue());
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 94
    //                   26: 105
    //                   34: 229
    //                   42: 258
    //                   48: 287;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.k();
          goto _L9
_L4:
        b = kog1.j();
          goto _L9
_L5:
        int l = kou.b(kog1, 26);
        kyu akyu[];
        int j;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.length;
        }
        akyu = new kyu[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(c, 0, akyu, 0, j);
            l = j;
        }
        for (; l < akyu.length - 1; l++)
        {
            akyu[l] = new kyu();
            kog1.a(akyu[l]);
            kog1.a();
        }

        akyu[l] = new kyu();
        kog1.a(akyu[l]);
        c = akyu;
          goto _L9
_L6:
        if (d == null)
        {
            d = new kyu();
        }
        kog1.a(d);
          goto _L9
_L7:
        if (e == null)
        {
            e = new kyo();
        }
        kog1.a(e);
          goto _L9
_L8:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(k);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kyu kyu1 = c[i];
                if (kyu1 != null)
                {
                    koh1.b(3, kyu1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f.intValue());
        }
        super.writeTo(koh1);
    }
}
