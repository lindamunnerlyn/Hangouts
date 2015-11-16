// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jel extends koj
{

    private static volatile jel k[];
    public String a;
    public Long b;
    public Integer c;
    public Long d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public jem i[];
    public String j;

    public jel()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = jem.a();
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jel[] a()
    {
        if (k == null)
        {
            synchronized (kon.a)
            {
                if (k == null)
                {
                    k = new jel[0];
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
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + koh.b(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + koh.e(2, b.longValue());
        }
        l = i1;
        if (c != null)
        {
            l = i1 + koh.e(4, c.intValue());
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + koh.e(5, d.longValue());
        }
        l = i1;
        if (e != null)
        {
            l = i1 + koh.e(6, e.longValue());
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + koh.e(7, f.longValue());
        }
        int j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.b(8, g);
        }
        l = j1;
        if (h != null)
        {
            l = j1 + koh.b(9, h);
        }
        i1 = l;
        if (i != null)
        {
            i1 = l;
            if (i.length > 0)
            {
                for (i1 = 0; i1 < i.length;)
                {
                    jem jem1 = i[i1];
                    int k1 = l;
                    if (jem1 != null)
                    {
                        k1 = l + koh.d(10, jem1);
                    }
                    i1++;
                    l = k1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (j != null)
        {
            l = i1 + koh.b(11, j);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
_L13:
        int l = kog1.a();
        l;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   16: 126
    //                   32: 140
    //                   40: 190
    //                   48: 204
    //                   56: 218
    //                   66: 232
    //                   74: 243
    //                   82: 254
    //                   90: 378;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kog1, l)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L13
_L4:
        b = Long.valueOf(kog1.e());
          goto _L13
_L5:
        int i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            c = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L9:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = kou.b(kog1, 82);
        jem ajem[];
        int j1;
        if (i == null)
        {
            j1 = 0;
        } else
        {
            j1 = i.length;
        }
        ajem = new jem[k1 + j1];
        k1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(i, 0, ajem, 0, j1);
            k1 = j1;
        }
        for (; k1 < ajem.length - 1; k1++)
        {
            ajem[k1] = new jem();
            kog1.a(ajem[k1]);
            kog1.a();
        }

        ajem[k1] = new jem();
        kog1.a(ajem[k1]);
        i = ajem;
        continue; /* Loop/switch isn't completed */
_L12:
        j = kog1.j();
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (c != null)
        {
            koh1.a(4, c.intValue());
        }
        if (d != null)
        {
            koh1.b(5, d.longValue());
        }
        if (e != null)
        {
            koh1.b(6, e.longValue());
        }
        if (f != null)
        {
            koh1.b(7, f.longValue());
        }
        if (g != null)
        {
            koh1.a(8, g);
        }
        if (h != null)
        {
            koh1.a(9, h);
        }
        if (i != null && i.length > 0)
        {
            for (int l = 0; l < i.length; l++)
            {
                jem jem1 = i[l];
                if (jem1 != null)
                {
                    koh1.b(10, jem1);
                }
            }

        }
        if (j != null)
        {
            koh1.a(11, j);
        }
        super.writeTo(koh1);
    }
}
