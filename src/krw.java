// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krw extends koj
{

    public static final kok a = kok.a(krw, 0x15ec49c2L);
    private static final krw e[] = new krw[0];
    public String b;
    public krv c[];
    public int d;

    public krw()
    {
        b = null;
        c = krv.a();
        d = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (d != 0x80000000)
        {
            j = i + koh.e(1, d);
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
                    krv krv1 = c[j];
                    int k = i;
                    if (krv1 != null)
                    {
                        k = i + koh.d(3, krv1);
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
    //                   18: 151
    //                   26: 162;
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
            d = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kou.b(kog1, 26);
        krv akrv[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        akrv = new krv[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, akrv, 0, k);
            l = k;
        }
        for (; l < akrv.length - 1; l++)
        {
            akrv[l] = new krv();
            kog1.a(akrv[l]);
            kog1.a();
        }

        akrv[l] = new krv();
        kog1.a(akrv[l]);
        c = akrv;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        if (d != 0x80000000)
        {
            koh1.a(1, d);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                krv krv1 = c[i];
                if (krv1 != null)
                {
                    koh1.b(3, krv1);
                }
            }

        }
        super.writeTo(koh1);
    }

}
