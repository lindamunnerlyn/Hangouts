// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iji extends kwm
{

    public Integer a;
    public Integer b;
    public int c[];

    public iji()
    {
        a = null;
        b = null;
        c = kwx.a;
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
            j = i + kwk.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
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
                    k += kwk.e(c[j]);
                }

                j = i + k + c.length * 1;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 146
    //                   24: 160
    //                   26: 261;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
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
        b = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kwx.a(kwj1, 24);
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
            ai[i1] = kwj1.f();
            kwj1.a();
        }

        ai[i1] = kwj1.f();
        c = ai;
        continue; /* Loop/switch isn't completed */
_L6:
        int k1 = kwj1.c(kwj1.p());
        int l = kwj1.r();
        int j1;
        for (j1 = 0; kwj1.q() > 0; j1++)
        {
            kwj1.f();
        }

        kwj1.e(l);
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
            ai1[j1] = kwj1.f();
        }

        c = ai1;
        kwj1.d(k1);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kwk1.a(3, c[i]);
            }

        }
        super.writeTo(kwk1);
    }
}
