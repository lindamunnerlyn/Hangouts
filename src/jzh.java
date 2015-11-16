// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jzh extends koj
{

    public String a;
    public Integer b;
    public jzi c[];

    public jzh()
    {
        a = null;
        b = null;
        c = jzi.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    jzi jzi1 = c[j];
                    int k = i;
                    if (jzi1 != null)
                    {
                        k = i + koh.d(3, jzi1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L6:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   16: 70
    //                   26: 134;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L6
_L4:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kou.b(kog1, 26);
        jzi ajzi[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ajzi = new jzi[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ajzi, 0, k);
            l = k;
        }
        for (; l < ajzi.length - 1; l++)
        {
            ajzi[l] = new jzi();
            kog1.a(ajzi[l]);
            kog1.a();
        }

        ajzi[l] = new jzi();
        kog1.a(ajzi[l]);
        c = ajzi;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
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
                jzi jzi1 = c[i];
                if (jzi1 != null)
                {
                    koh1.b(3, jzi1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
