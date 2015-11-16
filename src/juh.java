// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class juh extends koj
{

    public int a;
    public Integer b;
    public jui c[];
    public juj d[];

    public juh()
    {
        a = 0x80000000;
        b = null;
        c = jui.a();
        d = juj.a();
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
                    jui jui1 = c[k];
                    int i1 = i;
                    if (jui1 != null)
                    {
                        i1 = i + koh.d(3, jui1);
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
                    juj juj1 = d[l];
                    j1 = i;
                    if (juj1 != null)
                    {
                        j1 = i + koh.d(4, juj1);
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
    //                   16: 123
    //                   26: 137
    //                   34: 261;
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
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kou.b(kog1, 26);
        jui ajui[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ajui = new jui[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ajui, 0, k);
            i1 = k;
        }
        for (; i1 < ajui.length - 1; i1++)
        {
            ajui[i1] = new jui();
            kog1.a(ajui[i1]);
            kog1.a();
        }

        ajui[i1] = new jui();
        kog1.a(ajui[i1]);
        c = ajui;
        continue; /* Loop/switch isn't completed */
_L6:
        int j1 = kou.b(kog1, 34);
        juj ajuj[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        ajuj = new juj[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, ajuj, 0, l);
            j1 = l;
        }
        for (; j1 < ajuj.length - 1; j1++)
        {
            ajuj[j1] = new juj();
            kog1.a(ajuj[j1]);
            kog1.a();
        }

        ajuj[j1] = new juj();
        kog1.a(ajuj[j1]);
        d = ajuj;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != 0x80000000)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jui jui1 = c[i];
                if (jui1 != null)
                {
                    koh1.b(3, jui1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                juj juj1 = d[j];
                if (juj1 != null)
                {
                    koh1.b(4, juj1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
