// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itz extends kwm
{

    private static volatile itz q[];
    public Integer a;
    public iuc b[];
    public iua c[];
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Float l;
    public Integer m;
    public Integer n;
    public Boolean o;
    public Integer p;

    public itz()
    {
        a = null;
        b = iuc.a();
        c = iua.a();
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static itz[] a()
    {
        if (q == null)
        {
            synchronized (kwq.a)
            {
                if (q == null)
                {
                    q = new itz[0];
                }
            }
        }
        return q;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + kwk.e(6, a.intValue());
        int i1 = j1;
        if (b != null)
        {
            i1 = j1;
            if (b.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < b.length;)
                {
                    iuc iuc1 = b[j1];
                    int k1 = i1;
                    if (iuc1 != null)
                    {
                        k1 = i1 + kwk.c(7, iuc1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= c.length)
                    {
                        break;
                    }
                    iua iua1 = c[l1];
                    j1 = i1;
                    if (iua1 != null)
                    {
                        j1 = i1 + kwk.c(18, iua1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.e(39, d.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(40, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.e(41, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.e(59, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(71, k.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            l.floatValue();
            j1 = i1 + (kwk.f(76) + 4);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.e(77, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.e(78, n.intValue());
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (kwk.f(79) + 1);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.e(80, p.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.e(97, e.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.e(98, g.intValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.e(99, f.intValue());
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L19:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   48: 163
    //                   59: 177
    //                   147: 305
    //                   312: 434
    //                   320: 448
    //                   328: 462
    //                   472: 476
    //                   568: 490
    //                   613: 546
    //                   616: 560
    //                   624: 574
    //                   632: 588
    //                   640: 602
    //                   776: 616
    //                   784: 630
    //                   792: 644;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(kwj1.f());
          goto _L19
_L4:
        int i2 = kwx.a(kwj1, 59);
        iuc aiuc[];
        int j1;
        if (b == null)
        {
            j1 = 0;
        } else
        {
            j1 = b.length;
        }
        aiuc = new iuc[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(b, 0, aiuc, 0, j1);
            i2 = j1;
        }
        for (; i2 < aiuc.length - 1; i2++)
        {
            aiuc[i2] = new iuc();
            kwj1.a(aiuc[i2], 7);
            kwj1.a();
        }

        aiuc[i2] = new iuc();
        kwj1.a(aiuc[i2], 7);
        b = aiuc;
          goto _L19
_L5:
        int j2 = kwx.a(kwj1, 147);
        iua aiua[];
        int k1;
        if (c == null)
        {
            k1 = 0;
        } else
        {
            k1 = c.length;
        }
        aiua = new iua[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(c, 0, aiua, 0, k1);
            j2 = k1;
        }
        for (; j2 < aiua.length - 1; j2++)
        {
            aiua[j2] = new iua();
            kwj1.a(aiua[j2], 18);
            kwj1.a();
        }

        aiua[j2] = new iua();
        kwj1.a(aiua[j2], 18);
        c = aiua;
          goto _L19
_L6:
        d = Integer.valueOf(kwj1.f());
          goto _L19
_L7:
        h = Integer.valueOf(kwj1.f());
          goto _L19
_L8:
        i = Integer.valueOf(kwj1.f());
          goto _L19
_L9:
        j = Integer.valueOf(kwj1.f());
          goto _L19
_L10:
        int l1 = kwj1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            k = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        l = Float.valueOf(kwj1.c());
        continue; /* Loop/switch isn't completed */
_L12:
        m = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L13:
        n = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L14:
        o = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        p = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L16:
        e = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L17:
        g = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L18:
        f = Integer.valueOf(kwj1.f());
        if (true) goto _L19; else goto _L20
_L20:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(6, a.intValue());
        if (b != null && b.length > 0)
        {
            for (int i1 = 0; i1 < b.length; i1++)
            {
                iuc iuc1 = b[i1];
                if (iuc1 != null)
                {
                    kwk1.a(7, iuc1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < c.length; j1++)
            {
                iua iua1 = c[j1];
                if (iua1 != null)
                {
                    kwk1.a(18, iua1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(39, d.intValue());
        }
        if (h != null)
        {
            kwk1.a(40, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(41, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(59, j.intValue());
        }
        if (k != null)
        {
            kwk1.a(71, k.intValue());
        }
        if (l != null)
        {
            kwk1.a(76, l.floatValue());
        }
        if (m != null)
        {
            kwk1.a(77, m.intValue());
        }
        if (n != null)
        {
            kwk1.a(78, n.intValue());
        }
        if (o != null)
        {
            kwk1.a(79, o.booleanValue());
        }
        if (p != null)
        {
            kwk1.a(80, p.intValue());
        }
        if (e != null)
        {
            kwk1.a(97, e.intValue());
        }
        if (g != null)
        {
            kwk1.a(98, g.intValue());
        }
        if (f != null)
        {
            kwk1.a(99, f.intValue());
        }
        super.writeTo(kwk1);
    }
}
