// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class khf extends kwm
{

    private static volatile khf e[];
    public Integer a;
    public khe b[];
    public Integer c;
    public String d;

    public khf()
    {
        a = null;
        b = khe.a();
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static khf[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new khf[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    khe khe1 = b[j];
                    int k = i;
                    if (khe1 != null)
                    {
                        k = i + kwk.d(2, khe1);
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
            i = j + kwk.b(3, d);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.e(4, c.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   18: 110
    //                   26: 234
    //                   32: 245;
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
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kwx.a(kwj1, 18);
        khe akhe[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        akhe = new khe[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, akhe, 0, k);
            l = k;
        }
        for (; l < akhe.length - 1; l++)
        {
            akhe[l] = new khe();
            kwj1.a(akhe[l]);
            kwj1.a();
        }

        akhe[l] = new khe();
        kwj1.a(akhe[l]);
        b = akhe;
        continue; /* Loop/switch isn't completed */
_L5:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        c = Integer.valueOf(kwj1.f());
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                khe khe1 = b[i];
                if (khe1 != null)
                {
                    kwk1.b(2, khe1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (c != null)
        {
            kwk1.a(4, c.intValue());
        }
        super.writeTo(kwk1);
    }
}
