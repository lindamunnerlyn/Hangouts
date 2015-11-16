// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzs extends koj
{

    private static volatile kzs k[];
    public String a;
    public String b[];
    public kyo c;
    public Integer d;
    public String e;
    public Double f;
    public Double g;
    public Integer h;
    public Integer i;
    public Float j;

    public kzs()
    {
        a = null;
        b = kou.f;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kzs[] a()
    {
        if (k == null)
        {
            synchronized (kon.a)
            {
                if (k == null)
                {
                    k = new kzs[0];
                }
            }
        }
        return k;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + koh.b(1, a);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l + koh.d(2, c);
        }
        l = i1;
        if (d != null)
        {
            l = i1 + koh.e(3, d.intValue());
        }
        i1 = l;
        if (e != null)
        {
            i1 = l + koh.b(4, e);
        }
        l = i1;
        if (f != null)
        {
            f.doubleValue();
            l = i1 + (koh.f(5) + 8);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l;
            if (b.length > 0)
            {
                int j1 = 0;
                int k1 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < b.length;)
                {
                    String s = b[i1];
                    int i2 = j1;
                    int l1 = k1;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        i2 = j1 + koh.a(s);
                    }
                    i1++;
                    j1 = i2;
                    k1 = l1;
                }

                i1 = l + j1 + k1 * 1;
            }
        }
        l = i1;
        if (g != null)
        {
            g.doubleValue();
            l = i1 + (koh.f(7) + 8);
        }
        i1 = l;
        if (h != null)
        {
            h.intValue();
            i1 = l + (koh.f(8) + 4);
        }
        l = i1;
        if (i != null)
        {
            i.intValue();
            l = i1 + (koh.f(9) + 4);
        }
        i1 = l;
        if (j != null)
        {
            j.floatValue();
            i1 = l + (koh.f(10) + 4);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L13:
        int l = kog1.a();
        l;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   18: 126
    //                   24: 155
    //                   34: 202
    //                   41: 213
    //                   50: 227
    //                   57: 329
    //                   69: 343
    //                   77: 357
    //                   85: 371;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kog1, l)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L13
_L4:
        if (c == null)
        {
            c = new kyo();
        }
        kog1.a(c);
          goto _L13
_L5:
        int i1 = kog1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        e = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        f = Double.valueOf(kog1.b());
        continue; /* Loop/switch isn't completed */
_L8:
        int k1 = kou.b(kog1, 50);
        String as[];
        int j1;
        if (b == null)
        {
            j1 = 0;
        } else
        {
            j1 = b.length;
        }
        as = new String[k1 + j1];
        k1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(b, 0, as, 0, j1);
            k1 = j1;
        }
        for (; k1 < as.length - 1; k1++)
        {
            as[k1] = kog1.j();
            kog1.a();
        }

        as[k1] = kog1.j();
        b = as;
        continue; /* Loop/switch isn't completed */
_L9:
        g = Double.valueOf(kog1.b());
        continue; /* Loop/switch isn't completed */
_L10:
        h = Integer.valueOf(kog1.h());
        continue; /* Loop/switch isn't completed */
_L11:
        i = Integer.valueOf(kog1.h());
        continue; /* Loop/switch isn't completed */
_L12:
        j = Float.valueOf(kog1.c());
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (d != null)
        {
            koh1.a(3, d.intValue());
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (f != null)
        {
            koh1.a(5, f.doubleValue());
        }
        if (b != null && b.length > 0)
        {
            for (int l = 0; l < b.length; l++)
            {
                String s = b[l];
                if (s != null)
                {
                    koh1.a(6, s);
                }
            }

        }
        if (g != null)
        {
            koh1.a(7, g.doubleValue());
        }
        if (h != null)
        {
            koh1.b(8, h.intValue());
        }
        if (i != null)
        {
            koh1.b(9, i.intValue());
        }
        if (j != null)
        {
            koh1.a(10, j.floatValue());
        }
        super.writeTo(koh1);
    }
}
