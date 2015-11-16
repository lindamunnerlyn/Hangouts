// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kck extends kwm
{

    public int a;
    public Integer b;
    public kcl c[];
    public kcm d[];

    public kck()
    {
        a = 0x80000000;
        b = null;
        c = kcl.a();
        d = kcm.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + kwk.e(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    kcl kcl1 = c[k];
                    int i1 = i;
                    if (kcl1 != null)
                    {
                        i1 = i + kwk.d(3, kcl1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (d != null)
        {
            j1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    kcm kcm1 = d[l];
                    j1 = i;
                    if (kcm1 != null)
                    {
                        j1 = i + kwk.d(4, kcm1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 123
    //                   26: 137
    //                   34: 261;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
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
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kwx.a(kwj1, 26);
        kcl akcl[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        akcl = new kcl[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, akcl, 0, k);
            i1 = k;
        }
        for (; i1 < akcl.length - 1; i1++)
        {
            akcl[i1] = new kcl();
            kwj1.a(akcl[i1]);
            kwj1.a();
        }

        akcl[i1] = new kcl();
        kwj1.a(akcl[i1]);
        c = akcl;
        continue; /* Loop/switch isn't completed */
_L6:
        int j1 = kwx.a(kwj1, 34);
        kcm akcm[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        akcm = new kcm[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, akcm, 0, l);
            j1 = l;
        }
        for (; j1 < akcm.length - 1; j1++)
        {
            akcm[j1] = new kcm();
            kwj1.a(akcm[j1]);
            kwj1.a();
        }

        akcm[j1] = new kcm();
        kwj1.a(akcm[j1]);
        d = akcm;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kcl kcl1 = c[i];
                if (kcl1 != null)
                {
                    kwk1.b(3, kcl1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                kcm kcm1 = d[j];
                if (kcm1 != null)
                {
                    kwk1.b(4, kcm1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
