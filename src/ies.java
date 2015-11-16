// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ies extends koj
{

    public int a;
    public ifi b[];
    public Integer c;
    public String d;
    public ien e[];

    public ies()
    {
        a = 0x80000000;
        b = ifi.a();
        c = null;
        d = null;
        e = ien.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + koh.e(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ifi ifi1 = b[j];
                    int l = i;
                    if (ifi1 != null)
                    {
                        l = i + koh.d(2, ifi1);
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
                    ien ien1 = e[k];
                    i1 = i;
                    if (ien1 != null)
                    {
                        i1 = i + koh.d(5, ien1);
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
    //                   18: 383
    //                   24: 507
    //                   34: 521
    //                   42: 532;
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
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = kou.b(kog1, 18);
        ifi aifi[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aifi = new ifi[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aifi, 0, k);
            i1 = k;
        }
        for (; i1 < aifi.length - 1; i1++)
        {
            aifi[i1] = new ifi();
            kog1.a(aifi[i1]);
            kog1.a();
        }

        aifi[i1] = new ifi();
        kog1.a(aifi[i1]);
        b = aifi;
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = kou.b(kog1, 42);
        ien aien[];
        int l;
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.length;
        }
        aien = new ien[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(e, 0, aien, 0, l);
            j1 = l;
        }
        for (; j1 < aien.length - 1; j1++)
        {
            aien[j1] = new ien();
            kog1.a(aien[j1]);
            kog1.a();
        }

        aien[j1] = new ien();
        kog1.a(aien[j1]);
        e = aien;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != 0x80000000)
        {
            koh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ifi ifi1 = b[i];
                if (ifi1 != null)
                {
                    koh1.b(2, ifi1);
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
                ien ien1 = e[j];
                if (ien1 != null)
                {
                    koh1.b(5, ien1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
