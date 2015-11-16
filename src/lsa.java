// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lsa extends kwm
{

    public lse a[];
    public Long b;
    public lrz c;
    public Integer d;
    public lsb e;

    public lsa()
    {
        a = lse.a();
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    lse lse1 = a[k];
                    j = i;
                    if (lse1 != null)
                    {
                        j = i + kwk.d(1, lse1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(5, e);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L8:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   16: 199
    //                   26: 213
    //                   32: 242
    //                   42: 294;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int l = kwx.a(kwj1, 10);
        lse alse[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        alse = new lse[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, alse, 0, j);
            l = j;
        }
        for (; l < alse.length - 1; l++)
        {
            alse[l] = new lse();
            kwj1.a(alse[l]);
            kwj1.a();
        }

        alse[l] = new lse();
        kwj1.a(alse[l]);
        a = alse;
          goto _L8
_L4:
        b = Long.valueOf(kwj1.e());
          goto _L8
_L5:
        if (c == null)
        {
            c = new lrz();
        }
        kwj1.a(c);
          goto _L8
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new lsb();
        }
        kwj1.a(e);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                lse lse1 = a[i];
                if (lse1 != null)
                {
                    kwk1.b(1, lse1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        super.writeTo(kwk1);
    }
}
