// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jaa extends koj
{

    public String a;
    public String b;
    public Boolean c;
    public Integer d;
    public String e[];

    public jaa()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kou.f;
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        int k = j;
        if (c != null)
        {
            c.booleanValue();
            k = j + (koh.f(3) + 1);
        }
        i = k;
        if (d != null)
        {
            i = k + koh.e(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < e.length;)
                {
                    String s = e[j];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + koh.a(s);
                    }
                    j++;
                    l = k1;
                    i1 = j1;
                }

                j = i + l + i1 * 1;
            }
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L8:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   18: 86
    //                   24: 97
    //                   32: 111
    //                   42: 158;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L8
_L4:
        b = kog1.j();
          goto _L8
_L5:
        c = Boolean.valueOf(kog1.i());
          goto _L8
_L6:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int l = kou.b(kog1, 42);
        String as[];
        int k;
        if (e == null)
        {
            k = 0;
        } else
        {
            k = e.length;
        }
        as = new String[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(e, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = kog1.j();
            kog1.a();
        }

        as[l] = kog1.j();
        e = as;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    koh1.a(5, s);
                }
            }

        }
        super.writeTo(koh1);
    }
}
