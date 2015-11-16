// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iyb extends kwm
{

    private static volatile iyb e[];
    public Integer a;
    public Long b;
    public Long c;
    public String d[];

    public iyb()
    {
        a = null;
        b = null;
        c = null;
        d = kwx.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iyb[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new iyb[0];
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
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + kwk.d(1, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(2, c.longValue());
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.e(3, a.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < d.length;)
                {
                    String s = d[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + kwk.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
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
    //                   16: 81
    //                   24: 95
    //                   34: 142;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        b = Long.valueOf(kwj1.d());
          goto _L7
_L4:
        c = Long.valueOf(kwj1.d());
          goto _L7
_L5:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int l = kwx.a(kwj1, 34);
        String as[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        as = new String[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = kwj1.j();
            kwj1.a();
        }

        as[l] = kwj1.j();
        d = as;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b.longValue());
        }
        if (c != null)
        {
            kwk1.a(2, c.longValue());
        }
        if (a != null)
        {
            kwk1.a(3, a.intValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                String s = d[i];
                if (s != null)
                {
                    kwk1.a(4, s);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
