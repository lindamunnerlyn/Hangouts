// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itr extends koj
{

    public Integer a;
    public irm b;
    public iwn c;
    public ixh d[];
    public iss e[];
    public ixg responseHeader;

    public itr()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = null;
        d = ixh.a();
        e = iss.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(2, b);
        }
        i = j;
        if (a != null)
        {
            i = j + koh.e(3, a.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(4, c);
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (int k = 0; k < d.length;)
                {
                    ixh ixh1 = d[k];
                    int i1 = i;
                    if (ixh1 != null)
                    {
                        i1 = i + koh.d(5, ixh1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (e != null)
        {
            j1 = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    iss iss1 = e[l];
                    j1 = i;
                    if (iss1 != null)
                    {
                        j1 = i + koh.d(7, iss1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 112
    //                   24: 141
    //                   34: 178
    //                   42: 207
    //                   58: 331;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new ixg();
        }
        kog1.a(responseHeader);
          goto _L9
_L4:
        if (b == null)
        {
            b = new irm();
        }
        kog1.a(b);
          goto _L9
_L5:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (c == null)
        {
            c = new iwn();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = kou.b(kog1, 42);
        ixh aixh[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        aixh = new ixh[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, aixh, 0, k);
            i1 = k;
        }
        for (; i1 < aixh.length - 1; i1++)
        {
            aixh[i1] = new ixh();
            kog1.a(aixh[i1]);
            kog1.a();
        }

        aixh[i1] = new ixh();
        kog1.a(aixh[i1]);
        d = aixh;
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kou.b(kog1, 58);
        iss aiss[];
        int l;
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.length;
        }
        aiss = new iss[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(e, 0, aiss, 0, l);
            j1 = l;
        }
        for (; j1 < aiss.length - 1; j1++)
        {
            aiss[j1] = new iss();
            kog1.a(aiss[j1]);
            kog1.a();
        }

        aiss[j1] = new iss();
        kog1.a(aiss[j1]);
        e = aiss;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (a != null)
        {
            koh1.a(3, a.intValue());
        }
        if (c != null)
        {
            koh1.b(4, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                ixh ixh1 = d[i];
                if (ixh1 != null)
                {
                    koh1.b(5, ixh1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                iss iss1 = e[j];
                if (iss1 != null)
                {
                    koh1.b(7, iss1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
