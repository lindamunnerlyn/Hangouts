// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcd extends koj
{

    private static volatile jcd i[];
    public Integer a;
    public String b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public jce h[];

    public jcd()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = jce.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jcd[] a()
    {
        if (i == null)
        {
            synchronized (kon.a)
            {
                if (i == null)
                {
                    i = new jcd[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + koh.e(1, a.intValue());
        }
        k = j;
        if (b != null)
        {
            k = j + koh.b(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + koh.e(3, c.intValue());
        }
        k = j;
        if (d != null)
        {
            k = j + koh.e(4, d.intValue());
        }
        j = k;
        if (e != null)
        {
            j = k + koh.e(5, e.intValue());
        }
        k = j;
        if (f != null)
        {
            k = j + koh.e(6, f.intValue());
        }
        j = k;
        if (g != null)
        {
            j = k + koh.e(7, g.intValue());
        }
        k = j;
        if (h != null)
        {
            k = j;
            if (h.length > 0)
            {
                for (k = 0; k < h.length;)
                {
                    jce jce1 = h[k];
                    int l = j;
                    if (jce1 != null)
                    {
                        l = j + koh.d(8, jce1);
                    }
                    k++;
                    j = l;
                }

                k = j;
            }
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
_L11:
        int j = kog1.a();
        j;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   8: 99
    //                   18: 113
    //                   24: 124
    //                   32: 174
    //                   40: 188
    //                   48: 202
    //                   56: 216
    //                   66: 230;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, j)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(kog1.f());
          goto _L11
_L4:
        b = kog1.j();
          goto _L11
_L5:
        int k = kog1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        g = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L10:
        int i1 = kou.b(kog1, 66);
        jce ajce[];
        int l;
        if (h == null)
        {
            l = 0;
        } else
        {
            l = h.length;
        }
        ajce = new jce[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(h, 0, ajce, 0, l);
            i1 = l;
        }
        for (; i1 < ajce.length - 1; i1++)
        {
            ajce[i1] = new jce();
            kog1.a(ajce[i1]);
            kog1.a();
        }

        ajce[i1] = new jce();
        kog1.a(ajce[i1]);
        h = ajce;
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        if (f != null)
        {
            koh1.a(6, f.intValue());
        }
        if (g != null)
        {
            koh1.a(7, g.intValue());
        }
        if (h != null && h.length > 0)
        {
            for (int j = 0; j < h.length; j++)
            {
                jce jce1 = h[j];
                if (jce1 != null)
                {
                    koh1.b(8, jce1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
