// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jzc extends koj
{

    private static volatile jzc d[];
    public Integer a;
    public jzb b[];
    public String c;

    public jzc()
    {
        a = null;
        b = jzb.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jzc[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new jzc[0];
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
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    jzb jzb1 = b[j];
                    int k = i;
                    if (jzb1 != null)
                    {
                        k = i + koh.d(2, jzb1);
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
            i = j + koh.b(3, c);
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
    //                   18: 102
    //                   26: 226;
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
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kou.b(kog1, 18);
        jzb ajzb[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        ajzb = new jzb[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, ajzb, 0, k);
            l = k;
        }
        for (; l < ajzb.length - 1; l++)
        {
            ajzb[l] = new jzb();
            kog1.a(ajzb[l]);
            kog1.a();
        }

        ajzb[l] = new jzb();
        kog1.a(ajzb[l]);
        b = ajzb;
        continue; /* Loop/switch isn't completed */
_L5:
        c = kog1.j();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jzb jzb1 = b[i];
                if (jzb1 != null)
                {
                    koh1.b(2, jzb1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        super.writeTo(koh1);
    }
}
