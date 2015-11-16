// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iha extends koj
{

    public Integer a;
    public ihm b[];
    public Integer c;
    public String d;
    public igw e[];

    public iha()
    {
        a = null;
        b = ihm.a();
        c = null;
        d = null;
        e = igw.a();
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
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ihm ihm1 = b[j];
                    int l = i;
                    if (ihm1 != null)
                    {
                        l = i + koh.d(2, ihm1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        int i1 = j;
        if (c != null)
        {
            i1 = j + koh.e(3, c.intValue());
        }
        i = i1;
        if (d != null)
        {
            i = i1 + koh.b(4, d);
        }
        i1 = i;
        if (e != null)
        {
            i1 = i;
            if (e.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= e.length)
                    {
                        break;
                    }
                    igw igw1 = e[k];
                    i1 = i;
                    if (igw1 != null)
                    {
                        i1 = i + koh.d(5, igw1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L8:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   18: 386
    //                   24: 510
    //                   34: 524
    //                   42: 535;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
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
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 200: 
        case 201: 
        case 202: 
        case 203: 
        case 204: 
        case 205: 
        case 206: 
        case 207: 
        case 300: 
        case 401: 
        case 402: 
        case 500: 
        case 600: 
        case 601: 
        case 602: 
        case 603: 
        case 604: 
        case 605: 
        case 606: 
        case 700: 
        case 701: 
        case 800: 
        case 801: 
        case 802: 
        case 803: 
        case 900: 
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = kou.b(kog1, 18);
        ihm aihm[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aihm = new ihm[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aihm, 0, k);
            i1 = k;
        }
        for (; i1 < aihm.length - 1; i1++)
        {
            aihm[i1] = new ihm();
            kog1.a(aihm[i1]);
            kog1.a();
        }

        aihm[i1] = new ihm();
        kog1.a(aihm[i1]);
        b = aihm;
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = kou.b(kog1, 42);
        igw aigw[];
        int l;
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.length;
        }
        aigw = new igw[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(e, 0, aigw, 0, l);
            j1 = l;
        }
        for (; j1 < aigw.length - 1; j1++)
        {
            aigw[j1] = new igw();
            kog1.a(aigw[j1]);
            kog1.a();
        }

        aigw[j1] = new igw();
        kog1.a(aigw[j1]);
        e = aigw;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ihm ihm1 = b[i];
                if (ihm1 != null)
                {
                    koh1.b(2, ihm1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                igw igw1 = e[j];
                if (igw1 != null)
                {
                    koh1.b(5, igw1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
