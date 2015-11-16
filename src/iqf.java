// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqf extends koj
{

    public iur a[];
    public isv b;
    public irb c;
    public Integer d;
    public Long e;
    public String f;
    public ixg responseHeader;

    public iqf()
    {
        responseHeader = null;
        a = iur.a();
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    iur iur1 = a[j];
                    int k = i;
                    if (iur1 != null)
                    {
                        k = i + koh.d(2, iur1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(3, e.longValue());
        }
        j = i;
        if (f != null)
        {
            j = i + koh.b(4, f);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(5, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(6, c);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(8, d.intValue());
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L10:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   18: 120
    //                   24: 244
    //                   34: 258
    //                   42: 269
    //                   50: 298
    //                   64: 327;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new ixg();
        }
        kog1.a(responseHeader);
          goto _L10
_L4:
        int l = kou.b(kog1, 18);
        iur aiur[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        aiur = new iur[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, aiur, 0, j);
            l = j;
        }
        for (; l < aiur.length - 1; l++)
        {
            aiur[l] = new iur();
            kog1.a(aiur[l]);
            kog1.a();
        }

        aiur[l] = new iur();
        kog1.a(aiur[l]);
        a = aiur;
          goto _L10
_L5:
        e = Long.valueOf(kog1.d());
          goto _L10
_L6:
        f = kog1.j();
          goto _L10
_L7:
        if (b == null)
        {
            b = new isv();
        }
        kog1.a(b);
          goto _L10
_L8:
        if (c == null)
        {
            c = new irb();
        }
        kog1.a(c);
          goto _L10
_L9:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(k);
            break;
        }
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iur iur1 = a[i];
                if (iur1 != null)
                {
                    koh1.b(2, iur1);
                }
            }

        }
        if (e != null)
        {
            koh1.a(3, e.longValue());
        }
        if (f != null)
        {
            koh1.a(4, f);
        }
        if (b != null)
        {
            koh1.b(5, b);
        }
        if (c != null)
        {
            koh1.b(6, c);
        }
        if (d != null)
        {
            koh1.a(8, d.intValue());
        }
        super.writeTo(koh1);
    }
}
