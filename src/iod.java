// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iod extends koj
{

    public ioe a[];
    public Integer b;
    public Integer c;
    public Integer d;
    public inw e;

    public iod()
    {
        a = ioe.a();
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    ioe ioe1 = a[k];
                    j = i;
                    if (ioe1 != null)
                    {
                        j = i + koh.c(1, ioe1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(15, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(16, c.intValue());
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(17, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(18, e);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L8:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   11: 75
    //                   120: 201
    //                   128: 246
    //                   136: 260
    //                   146: 274;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int l = kou.b(kog1, 11);
        ioe aioe[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        aioe = new ioe[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, aioe, 0, j);
            l = j;
        }
        for (; l < aioe.length - 1; l++)
        {
            aioe[l] = new ioe();
            kog1.a(aioe[l], 1);
            kog1.a();
        }

        aioe[l] = new ioe();
        kog1.a(aioe[l], 1);
        a = aioe;
          goto _L8
_L4:
        int k = kog1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            b = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        d = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new inw();
        }
        kog1.a(e);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                ioe ioe1 = a[i];
                if (ioe1 != null)
                {
                    koh1.a(1, ioe1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(15, b.intValue());
        }
        if (c != null)
        {
            koh1.a(16, c.intValue());
        }
        if (d != null)
        {
            koh1.a(17, d.intValue());
        }
        if (e != null)
        {
            koh1.b(18, e);
        }
        super.writeTo(koh1);
    }
}
