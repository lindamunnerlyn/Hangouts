// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxh extends koj
{

    private static volatile hxh d[];
    public Integer a;
    public hxd b[];
    public Boolean c;

    public hxh()
    {
        a = null;
        b = hxd.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hxh[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new hxh[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        i = koh.e(1, a.intValue()) + i;
        int j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    hxd hxd1 = b[k];
                    j = i;
                    if (hxd1 != null)
                    {
                        j = i + koh.d(2, hxd1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (koh.f(3) + 1);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L6:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 122
    //                   24: 246;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
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
        case 6: // '\006'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kou.b(kog1, 18);
        hxd ahxd[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        ahxd = new hxd[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, ahxd, 0, k);
            l = k;
        }
        for (; l < ahxd.length - 1; l++)
        {
            ahxd[l] = new hxd();
            kog1.a(ahxd[l]);
            kog1.a();
        }

        ahxd[l] = new hxd();
        kog1.a(ahxd[l]);
        b = ahxd;
        continue; /* Loop/switch isn't completed */
_L5:
        c = Boolean.valueOf(kog1.i());
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a.intValue());
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                hxd hxd1 = b[i];
                if (hxd1 != null)
                {
                    koh1.b(2, hxd1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        super.writeTo(koh1);
    }
}
