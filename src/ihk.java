// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihk extends koj
{

    private static volatile ihk j[];
    public Integer a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public ihj i[];

    public ihk()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = ihj.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ihk[] a()
    {
        if (j == null)
        {
            synchronized (kon.a)
            {
                if (j == null)
                {
                    j = new ihk[0];
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
        int i1 = l;
        if (e != null)
        {
            i1 = l + koh.b(5, e);
        }
        k = i1;
        if (f != null)
        {
            k = i1 + koh.b(6, f);
        }
        l = k;
        if (i != null)
        {
            l = k;
            if (i.length > 0)
            {
                for (l = 0; l < i.length;)
                {
                    ihj ihj1 = i[l];
                    int j1 = k;
                    if (ihj1 != null)
                    {
                        j1 = k + koh.d(7, ihj1);
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
            k = l + koh.b(8, g);
        }
        l = k;
        if (h != null)
        {
            l = k + koh.e(9, h.intValue());
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
_L12:
        int k = kog1.a();
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
        case 12: // '\f'
        case 13: // '\r'
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
        e = kog1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        f = kog1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        int j1 = kou.b(kog1, 58);
        ihj aihj[];
        int i1;
        if (i == null)
        {
            i1 = 0;
        } else
        {
            i1 = i.length;
        }
        aihj = new ihj[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(i, 0, aihj, 0, i1);
            j1 = i1;
        }
        for (; j1 < aihj.length - 1; j1++)
        {
            aihj[j1] = new ihj();
            kog1.a(aihj[j1]);
            kog1.a();
        }

        aihj[j1] = new ihj();
        kog1.a(aihj[j1]);
        i = aihj;
        continue; /* Loop/switch isn't completed */
_L10:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        h = Integer.valueOf(kog1.f());
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
            koh1.a(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (i != null && i.length > 0)
        {
            for (int k = 0; k < i.length; k++)
            {
                ihj ihj1 = i[k];
                if (ihj1 != null)
                {
                    koh1.b(7, ihj1);
                }
            }

        }
        if (g != null)
        {
            koh1.a(8, g);
        }
        if (h != null)
        {
            koh1.a(9, h.intValue());
        }
        super.writeTo(koh1);
    }
}
