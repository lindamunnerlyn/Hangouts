// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbe extends koj
{

    public jba a;
    public jbw b;
    public Integer c;
    public jba d[];
    public ixg responseHeader;

    public jbe()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = null;
        d = jba.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(2, a);
        }
        int k = j;
        if (b != null)
        {
            k = j + koh.d(3, b);
        }
        i = k;
        if (c != null)
        {
            i = k + koh.e(4, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    jba jba1 = d[j];
                    int l = i;
                    if (jba1 != null)
                    {
                        l = i + koh.d(5, jba1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
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
    //                   10: 75
    //                   18: 104
    //                   26: 133
    //                   32: 162
    //                   42: 246;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new ixg();
        }
        kog1.a(responseHeader);
          goto _L8
_L4:
        if (a == null)
        {
            a = new jba();
        }
        kog1.a(a);
          goto _L8
_L5:
        if (b == null)
        {
            b = new jbw();
        }
        kog1.a(b);
          goto _L8
_L6:
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
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            c = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int l = kou.b(kog1, 42);
        jba ajba[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        ajba = new jba[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, ajba, 0, k);
            l = k;
        }
        for (; l < ajba.length - 1; l++)
        {
            ajba[l] = new jba();
            kog1.a(ajba[l]);
            kog1.a();
        }

        ajba[l] = new jba();
        kog1.a(ajba[l]);
        d = ajba;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null)
        {
            koh1.a(4, c.intValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                jba jba1 = d[i];
                if (jba1 != null)
                {
                    koh1.b(5, jba1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
