// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdc extends koj
{

    public Integer a;
    public jdd b;
    public String c[];
    public String d;
    public String e;
    public jch f[];

    public jdc()
    {
        a = null;
        b = null;
        c = kou.f;
        d = null;
        e = null;
        f = jch.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                j = 0;
                int l = 0;
                int j1;
                int k1;
                for (j1 = 0; j < c.length; j1 = k1)
                {
                    String s = c[j];
                    int l1 = l;
                    k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = l + koh.a(s);
                    }
                    j++;
                    l = l1;
                }

                j = i + l + j1 * 1;
            }
        }
        int i1 = j;
        if (d != null)
        {
            i1 = j + koh.b(4, d);
        }
        i = i1;
        if (e != null)
        {
            i = i1 + koh.b(5, e);
        }
        i1 = i;
        if (f != null)
        {
            i1 = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    jch jch1 = f[k];
                    i1 = i;
                    if (jch1 != null)
                    {
                        i1 = i + koh.d(6, jch1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   18: 126
    //                   26: 155
    //                   34: 257
    //                   42: 268
    //                   50: 279;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new jdd();
        }
        kog1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kou.b(kog1, 26);
        String as[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        as = new String[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, as, 0, k);
            i1 = k;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = kog1.j();
            kog1.a();
        }

        as[i1] = kog1.j();
        c = as;
        continue; /* Loop/switch isn't completed */
_L6:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = kog1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kou.b(kog1, 50);
        jch ajch[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        ajch = new jch[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, ajch, 0, l);
            j1 = l;
        }
        for (; j1 < ajch.length - 1; j1++)
        {
            ajch[j1] = new jch();
            kog1.a(ajch[j1]);
            kog1.a();
        }

        ajch[j1] = new jch();
        kog1.a(ajch[j1]);
        f = ajch;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    koh1.a(3, s);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                jch jch1 = f[j];
                if (jch1 != null)
                {
                    koh1.b(6, jch1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
