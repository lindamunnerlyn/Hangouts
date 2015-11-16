// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jvq extends koj
{

    public Integer a;
    public Integer b;
    public jvr c[];
    public jvs d[];

    public jvq()
    {
        a = null;
        b = null;
        c = jvr.a();
        d = jvs.a();
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
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    jvr jvr1 = c[k];
                    int i1 = i;
                    if (jvr1 != null)
                    {
                        i1 = i + koh.d(3, jvr1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (d != null)
        {
            j1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    jvs jvs1 = d[l];
                    j1 = i;
                    if (jvs1 != null)
                    {
                        j1 = i + koh.d(4, jvs1);
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
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 126
    //                   26: 140
    //                   34: 264;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kou.b(kog1, 26);
        jvr ajvr[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ajvr = new jvr[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ajvr, 0, k);
            i1 = k;
        }
        for (; i1 < ajvr.length - 1; i1++)
        {
            ajvr[i1] = new jvr();
            kog1.a(ajvr[i1]);
            kog1.a();
        }

        ajvr[i1] = new jvr();
        kog1.a(ajvr[i1]);
        c = ajvr;
        continue; /* Loop/switch isn't completed */
_L6:
        int j1 = kou.b(kog1, 34);
        jvs ajvs[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        ajvs = new jvs[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, ajvs, 0, l);
            j1 = l;
        }
        for (; j1 < ajvs.length - 1; j1++)
        {
            ajvs[j1] = new jvs();
            kog1.a(ajvs[j1]);
            kog1.a();
        }

        ajvs[j1] = new jvs();
        kog1.a(ajvs[j1]);
        d = ajvs;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jvr jvr1 = c[i];
                if (jvr1 != null)
                {
                    koh1.b(3, jvr1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                jvs jvs1 = d[j];
                if (jvs1 != null)
                {
                    koh1.b(4, jvs1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
