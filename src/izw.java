// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izw extends kwm
{

    public Integer a;
    public ixr b;
    public jcs c;
    public jdm d[];
    public iyx e[];
    public jdl responseHeader;

    public izw()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = null;
        d = jdm.a();
        e = iyx.a();
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
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(2, b);
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.e(3, a.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(4, c);
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
                    jdm jdm1 = d[k];
                    int i1 = i;
                    if (jdm1 != null)
                    {
                        i1 = i + kwk.d(5, jdm1);
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
                    iyx iyx1 = e[l];
                    j1 = i;
                    if (iyx1 != null)
                    {
                        j1 = i + kwk.d(7, iyx1);
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
_L9:
        int i = kwj1.a();
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
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new jdl();
        }
        kwj1.a(responseHeader);
          goto _L9
_L4:
        if (b == null)
        {
            b = new ixr();
        }
        kwj1.a(b);
          goto _L9
_L5:
        int j = kwj1.f();
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
            c = new jcs();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = kwx.a(kwj1, 42);
        jdm ajdm[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        ajdm = new jdm[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, ajdm, 0, k);
            i1 = k;
        }
        for (; i1 < ajdm.length - 1; i1++)
        {
            ajdm[i1] = new jdm();
            kwj1.a(ajdm[i1]);
            kwj1.a();
        }

        ajdm[i1] = new jdm();
        kwj1.a(ajdm[i1]);
        d = ajdm;
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kwx.a(kwj1, 58);
        iyx aiyx[];
        int l;
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.length;
        }
        aiyx = new iyx[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(e, 0, aiyx, 0, l);
            j1 = l;
        }
        for (; j1 < aiyx.length - 1; j1++)
        {
            aiyx[j1] = new iyx();
            kwj1.a(aiyx[j1]);
            kwj1.a();
        }

        aiyx[j1] = new iyx();
        kwj1.a(aiyx[j1]);
        e = aiyx;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (a != null)
        {
            kwk1.a(3, a.intValue());
        }
        if (c != null)
        {
            kwk1.b(4, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                jdm jdm1 = d[i];
                if (jdm1 != null)
                {
                    kwk1.b(5, jdm1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                iyx iyx1 = e[j];
                if (iyx1 != null)
                {
                    kwk1.b(7, iyx1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
