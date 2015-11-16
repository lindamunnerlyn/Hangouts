// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iee extends koj
{

    public Integer a;
    public Integer b;
    public int c[];

    public iee()
    {
        a = null;
        b = null;
        c = kou.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.e(1, a.intValue());
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
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < c.length; j++)
                {
                    k += koh.e(c[j]);
                }

                j = i + k + c.length * 1;
            }
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
    //                   8: 67
    //                   16: 146
    //                   24: 160
    //                   26: 261;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case -1: 
        case 0: // '\0'
        case 280: 
        case 360: 
        case 440: 
        case 520: 
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kou.b(kog1, 24);
        int ai[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ai = new int[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ai, 0, k);
            i1 = k;
        }
        for (; i1 < ai.length - 1; i1++)
        {
            ai[i1] = kog1.f();
            kog1.a();
        }

        ai[i1] = kog1.f();
        c = ai;
        continue; /* Loop/switch isn't completed */
_L6:
        int k1 = kog1.c(kog1.p());
        int l = kog1.r();
        int j1;
        for (j1 = 0; kog1.q() > 0; j1++)
        {
            kog1.f();
        }

        kog1.e(l);
        int ai1[];
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        ai1 = new int[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, ai1, 0, l);
            j1 = l;
        }
        for (; j1 < ai1.length; j1++)
        {
            ai1[j1] = kog1.f();
        }

        c = ai1;
        kog1.d(k1);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                koh1.a(3, c[i]);
            }

        }
        super.writeTo(koh1);
    }
}
