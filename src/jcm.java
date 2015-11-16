// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcm extends koj
{

    private static volatile jcm g[];
    public String a;
    public jcf b[];
    public jcf c[];
    public jde d[];
    public String e[];
    public Integer f;

    public jcm()
    {
        a = null;
        b = jcf.a();
        c = jcf.a();
        d = jde.a();
        e = kou.f;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jcm[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new jcm[0];
                }
            }
        }
        return g;
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
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    jcf jcf1 = b[j];
                    int k = i;
                    if (jcf1 != null)
                    {
                        k = i + koh.d(3, jcf1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (j = 0; j < c.length;)
                {
                    jcf jcf2 = c[j];
                    int l = i;
                    if (jcf2 != null)
                    {
                        l = i + koh.d(4, jcf2);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    jde jde1 = d[j];
                    int i1 = i;
                    if (jde1 != null)
                    {
                        i1 = i + koh.d(5, jde1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                int j1 = 0;
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < e.length;)
                {
                    String s = e[i];
                    int i2 = j1;
                    int l1 = k1;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        i2 = j1 + koh.a(s);
                    }
                    i++;
                    j1 = i2;
                    k1 = l1;
                }

                i = j + j1 + k1 * 1;
            }
        }
        j = i;
        if (f != null)
        {
            j = i + koh.e(7, f.intValue());
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   26: 94
    //                   34: 218
    //                   42: 342
    //                   50: 466
    //                   56: 568;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L9
_L4:
        int k1 = kou.b(kog1, 26);
        jcf ajcf[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        ajcf = new jcf[k1 + j];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, ajcf, 0, j);
            k1 = j;
        }
        for (; k1 < ajcf.length - 1; k1++)
        {
            ajcf[k1] = new jcf();
            kog1.a(ajcf[k1]);
            kog1.a();
        }

        ajcf[k1] = new jcf();
        kog1.a(ajcf[k1]);
        b = ajcf;
          goto _L9
_L5:
        int l1 = kou.b(kog1, 34);
        jcf ajcf1[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ajcf1 = new jcf[l1 + k];
        l1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ajcf1, 0, k);
            l1 = k;
        }
        for (; l1 < ajcf1.length - 1; l1++)
        {
            ajcf1[l1] = new jcf();
            kog1.a(ajcf1[l1]);
            kog1.a();
        }

        ajcf1[l1] = new jcf();
        kog1.a(ajcf1[l1]);
        c = ajcf1;
          goto _L9
_L6:
        int i2 = kou.b(kog1, 42);
        jde ajde[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        ajde = new jde[i2 + l];
        i2 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, ajde, 0, l);
            i2 = l;
        }
        for (; i2 < ajde.length - 1; i2++)
        {
            ajde[i2] = new jde();
            kog1.a(ajde[i2]);
            kog1.a();
        }

        ajde[i2] = new jde();
        kog1.a(ajde[i2]);
        d = ajde;
          goto _L9
_L7:
        int j2 = kou.b(kog1, 50);
        String as[];
        int i1;
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        as = new String[j2 + i1];
        j2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, as, 0, i1);
            j2 = i1;
        }
        for (; j2 < as.length - 1; j2++)
        {
            as[j2] = kog1.j();
            kog1.a();
        }

        as[j2] = kog1.j();
        e = as;
          goto _L9
_L8:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(j1);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jcf jcf1 = b[i];
                if (jcf1 != null)
                {
                    koh1.b(3, jcf1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                jcf jcf2 = c[j];
                if (jcf2 != null)
                {
                    koh1.b(4, jcf2);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                jde jde1 = d[k];
                if (jde1 != null)
                {
                    koh1.b(5, jde1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < e.length; l++)
            {
                String s = e[l];
                if (s != null)
                {
                    koh1.a(6, s);
                }
            }

        }
        if (f != null)
        {
            koh1.a(7, f.intValue());
        }
        super.writeTo(koh1);
    }
}
