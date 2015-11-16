// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jca extends koj
{

    private static volatile jca h[];
    public String a;
    public String b;
    public String c[];
    public Integer d;
    public jby e;
    public jcb f;
    public Boolean g;

    public jca()
    {
        a = null;
        b = null;
        c = kou.f;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jca[] a()
    {
        if (h == null)
        {
            synchronized (kon.a)
            {
                if (h == null)
                {
                    h = new jca[0];
                }
            }
        }
        return h;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < c.length;)
                {
                    String s = c[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + koh.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(5, e);
        }
        i = j;
        if (g != null)
        {
            g.booleanValue();
            i = j + (koh.f(6) + 1);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.d(7, f);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L10:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   18: 102
    //                   26: 113
    //                   32: 215
    //                   42: 266
    //                   48: 295
    //                   58: 309;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L10
_L4:
        b = kog1.j();
          goto _L10
_L5:
        int l = kou.b(kog1, 26);
        String as[];
        int j;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.length;
        }
        as = new String[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(c, 0, as, 0, j);
            l = j;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = kog1.j();
            kog1.a();
        }

        as[l] = kog1.j();
        c = as;
          goto _L10
_L6:
        int k = kog1.f();
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
            e = new jby();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        g = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L9:
        if (f == null)
        {
            f = new jcb();
        }
        kog1.a(f);
        if (true) goto _L10; else goto _L11
_L11:
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
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    koh1.a(3, s);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (g != null)
        {
            koh1.a(6, g.booleanValue());
        }
        if (f != null)
        {
            koh1.b(7, f);
        }
        super.writeTo(koh1);
    }
}
