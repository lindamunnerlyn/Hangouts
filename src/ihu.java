// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihu extends kwm
{

    public String a;
    public String b;
    public String c;
    public Integer d;
    public int e;
    public String f[];

    public ihu()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 0x80000000;
        f = kwx.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.e(4, d.intValue());
        }
        i = j;
        if (e != 0x80000000)
        {
            i = j + kwk.e(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < f.length;)
                {
                    String s = f[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + kwk.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L9:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 94
    //                   26: 105
    //                   32: 116
    //                   40: 130
    //                   50: 187;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L9
_L4:
        b = kwj1.j();
          goto _L9
_L5:
        c = kwj1.j();
          goto _L9
_L6:
        d = Integer.valueOf(kwj1.f());
          goto _L9
_L7:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            e = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int l = kwx.a(kwj1, 50);
        String as[];
        int k;
        if (f == null)
        {
            k = 0;
        } else
        {
            k = f.length;
        }
        as = new String[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(f, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = kwj1.j();
            kwj1.a();
        }

        as[l] = kwj1.j();
        f = as;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
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
            kwk1.a(4, d.intValue());
        }
        if (e != 0x80000000)
        {
            kwk1.a(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                String s = f[i];
                if (s != null)
                {
                    kwk1.a(6, s);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
