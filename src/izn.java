// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izn extends koj
{

    public Integer a;
    public itk b[];
    public byte c[];
    public ixg responseHeader;

    public izn()
    {
        responseHeader = null;
        a = null;
        b = itk.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (responseHeader != null)
        {
            j = i + koh.d(1, responseHeader);
        }
        i = j;
        if (a != null)
        {
            i = j + koh.e(2, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    itk itk1 = b[j];
                    int k = i;
                    if (itk1 != null)
                    {
                        k = i + koh.d(3, itk1);
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
            i = j + koh.b(4, c);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   16: 96
    //                   26: 138
    //                   34: 262;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new ixg();
        }
        kog1.a(responseHeader);
          goto _L7
_L4:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kou.b(kog1, 26);
        itk aitk[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aitk = new itk[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aitk, 0, k);
            l = k;
        }
        for (; l < aitk.length - 1; l++)
        {
            aitk[l] = new itk();
            kog1.a(aitk[l]);
            kog1.a();
        }

        aitk[l] = new itk();
        kog1.a(aitk[l]);
        b = aitk;
        continue; /* Loop/switch isn't completed */
_L6:
        c = kog1.k();
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null)
        {
            koh1.a(2, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                itk itk1 = b[i];
                if (itk1 != null)
                {
                    koh1.b(3, itk1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(4, c);
        }
        super.writeTo(koh1);
    }
}
