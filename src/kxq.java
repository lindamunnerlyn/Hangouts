// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kxq extends koj
{

    public static final kok a = kok.a(kxq, 0x15ec49c2L);
    private static final kxq e[] = new kxq[0];
    public String b;
    public kxp c[];
    public Integer d;

    public kxq()
    {
        b = null;
        c = kxp.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (d != null)
        {
            j = i + koh.e(1, d.intValue());
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
                    kxp kxp1 = c[j];
                    int k = i;
                    if (kxp1 != null)
                    {
                        k = i + koh.d(3, kxp1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L6:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 154
    //                   26: 165;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 400: 
        case 403: 
        case 404: 
        case 409: 
        case 410: 
        case 412: 
        case 500: 
        case 503: 
            d = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kou.b(kog1, 26);
        kxp akxp[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        akxp = new kxp[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, akxp, 0, k);
            l = k;
        }
        for (; l < akxp.length - 1; l++)
        {
            akxp[l] = new kxp();
            kog1.a(akxp[l]);
            kog1.a();
        }

        akxp[l] = new kxp();
        kog1.a(akxp[l]);
        c = akxp;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        if (d != null)
        {
            koh1.a(1, d.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kxp kxp1 = c[i];
                if (kxp1 != null)
                {
                    koh1.b(3, kxp1);
                }
            }

        }
        super.writeTo(koh1);
    }

}
