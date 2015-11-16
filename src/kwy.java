// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwy extends koj
{

    public kwn a;
    public Integer b;
    public kwz c;
    public Integer d;
    public kws e[];

    public kwy()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kws.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(5, b.intValue());
        }
        int k = j;
        if (c != null)
        {
            k = j + koh.d(6, c);
        }
        i = k;
        if (d != null)
        {
            i = k + koh.e(7, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    kws kws1 = e[j];
                    int l = i;
                    if (kws1 != null)
                    {
                        l = i + koh.d(8, kws1);
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
    //                   18: 75
    //                   40: 104
    //                   50: 146
    //                   56: 175
    //                   66: 189;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new kwn();
        }
        kog1.a(a);
          goto _L8
_L4:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new kwz();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        d = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        int l = kou.b(kog1, 66);
        kws akws[];
        int k;
        if (e == null)
        {
            k = 0;
        } else
        {
            k = e.length;
        }
        akws = new kws[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(e, 0, akws, 0, k);
            l = k;
        }
        for (; l < akws.length - 1; l++)
        {
            akws[l] = new kws();
            kog1.a(akws[l]);
            kog1.a();
        }

        akws[l] = new kws();
        kog1.a(akws[l]);
        e = akws;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null)
        {
            koh1.a(5, b.intValue());
        }
        if (c != null)
        {
            koh1.b(6, c);
        }
        if (d != null)
        {
            koh1.a(7, d.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                kws kws1 = e[i];
                if (kws1 != null)
                {
                    koh1.b(8, kws1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
