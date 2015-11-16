// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcg extends kwm
{

    public jcf a[];
    public iwv b[];
    public Integer c;

    public jcg()
    {
        a = jcf.a();
        b = iwv.a();
        c = null;
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    jcf jcf1 = a[j];
                    int k = i;
                    if (jcf1 != null)
                    {
                        k = i + kwk.d(1, jcf1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    iwv iwv1 = b[l];
                    j = i;
                    if (iwv1 != null)
                    {
                        j = i + kwk.d(2, iwv1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L6:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   18: 183
    //                   24: 307;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int i1 = kwx.a(kwj1, 10);
        jcf ajcf[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        ajcf = new jcf[i1 + j];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, ajcf, 0, j);
            i1 = j;
        }
        for (; i1 < ajcf.length - 1; i1++)
        {
            ajcf[i1] = new jcf();
            kwj1.a(ajcf[i1]);
            kwj1.a();
        }

        ajcf[i1] = new jcf();
        kwj1.a(ajcf[i1]);
        a = ajcf;
          goto _L6
_L4:
        int j1 = kwx.a(kwj1, 18);
        iwv aiwv[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aiwv = new iwv[j1 + k];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aiwv, 0, k);
            j1 = k;
        }
        for (; j1 < aiwv.length - 1; j1++)
        {
            aiwv[j1] = new iwv();
            kwj1.a(aiwv[j1]);
            kwj1.a();
        }

        aiwv[j1] = new iwv();
        kwj1.a(aiwv[j1]);
        b = aiwv;
          goto _L6
_L5:
        int l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(l);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jcf jcf1 = a[i];
                if (jcf1 != null)
                {
                    kwk1.b(1, jcf1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                iwv iwv1 = b[j];
                if (iwv1 != null)
                {
                    kwk1.b(2, iwv1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        super.writeTo(kwk1);
    }
}
