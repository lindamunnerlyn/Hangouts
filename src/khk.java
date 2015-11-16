// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class khk extends kwm
{

    public String a;
    public Integer b;
    public khl c[];

    public khk()
    {
        a = null;
        b = null;
        c = khl.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    khl khl1 = c[j];
                    int k = i;
                    if (khl1 != null)
                    {
                        k = i + kwk.d(3, khl1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L6:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   16: 70
    //                   26: 134;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L6
_L4:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kwx.a(kwj1, 26);
        khl akhl[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        akhl = new khl[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, akhl, 0, k);
            l = k;
        }
        for (; l < akhl.length - 1; l++)
        {
            akhl[l] = new khl();
            kwj1.a(akhl[l]);
            kwj1.a();
        }

        akhl[l] = new khl();
        kwj1.a(akhl[l]);
        c = akhl;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
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
                khl khl1 = c[i];
                if (khl1 != null)
                {
                    kwk1.b(3, khl1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
