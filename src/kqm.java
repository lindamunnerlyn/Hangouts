// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kqm extends koj
{

    public kpr a;
    public kpt b[];
    public kpt c;
    public int d;

    public kqm()
    {
        a = null;
        b = kpt.a();
        c = null;
        d = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kpt kpt1 = b[j];
                    int k = i;
                    if (kpt1 != null)
                    {
                        k = i + koh.d(2, kpt1);
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
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != 0x80000000)
        {
            j = i + koh.e(4, d);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   18: 96
    //                   26: 220
    //                   32: 249;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new kpr();
        }
        kog1.a(a);
          goto _L7
_L4:
        int l = kou.b(kog1, 18);
        kpt akpt[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        akpt = new kpt[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, akpt, 0, j);
            l = j;
        }
        for (; l < akpt.length - 1; l++)
        {
            akpt[l] = new kpt();
            kog1.a(akpt[l]);
            kog1.a();
        }

        akpt[l] = new kpt();
        kog1.a(akpt[l]);
        b = akpt;
          goto _L7
_L5:
        if (c == null)
        {
            c = new kpt();
        }
        kog1.a(c);
          goto _L7
_L6:
        int k = kog1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            d = k;
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kpt kpt1 = b[i];
                if (kpt1 != null)
                {
                    koh1.b(2, kpt1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != 0x80000000)
        {
            koh1.a(4, d);
        }
        super.writeTo(koh1);
    }
}
