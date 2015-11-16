// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jct extends koj
{

    public Integer a;
    public jdg b;
    public jcu c[];

    public jct()
    {
        a = null;
        b = null;
        c = jcu.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    jcu jcu1 = c[j];
                    int k = i;
                    if (jcu1 != null)
                    {
                        k = i + koh.d(3, jcu1);
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
    //                   8: 59
    //                   18: 102
    //                   26: 131;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new jdg();
        }
        kog1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kou.b(kog1, 26);
        jcu ajcu[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ajcu = new jcu[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ajcu, 0, k);
            l = k;
        }
        for (; l < ajcu.length - 1; l++)
        {
            ajcu[l] = new jcu();
            kog1.a(ajcu[l]);
            kog1.a();
        }

        ajcu[l] = new jcu();
        kog1.a(ajcu[l]);
        c = ajcu;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jcu jcu1 = c[i];
                if (jcu1 != null)
                {
                    koh1.b(3, jcu1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
