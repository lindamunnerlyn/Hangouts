// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdi extends kwm
{

    public ixl a;
    public int b[];
    public jdk requestHeader;

    public jdi()
    {
        requestHeader = null;
        a = null;
        b = kwx.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (requestHeader != null)
        {
            j = i + kwk.d(1, requestHeader);
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.d(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < b.length; j++)
                {
                    k += kwk.e(b[j]);
                }

                j = i + k + b.length * 1;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L21:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 60
    //                   0: 70
    //                   10: 72
    //                   18: 101
    //                   24: 130
    //                   26: 316;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
        continue; /* Loop/switch isn't completed */
_L4:
        if (a == null)
        {
            a = new ixl();
        }
        kwj1.a(a);
        continue; /* Loop/switch isn't completed */
_L5:
        int ai[];
        int j;
        int i1;
        i1 = kwx.a(kwj1, 24);
        ai = new int[i1];
        j = 0;
        i = 0;
_L13:
        if (j >= i1) goto _L8; else goto _L7
_L7:
        int j1;
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR tableswitch 1 3: default 200
    //                   1 209
    //                   2 209
    //                   3 209;
           goto _L9 _L10 _L10 _L10
_L9:
        j++;
          goto _L11
_L10:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L9; else goto _L11
_L11:
        if (true) goto _L13; else goto _L12
_L12:
_L8:
        if (i != 0)
        {
            if (b == null)
            {
                j = 0;
            } else
            {
                j = b.length;
            }
            if (j == 0 && i == ai.length)
            {
                b = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                b = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int l;
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L19:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L15; else goto _L14
_L14:
        kwj1.e(i);
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ai, 0, i);
            j = i;
        }
_L17:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L15
        if (true) goto _L17; else goto _L16
_L16:
        if (true) goto _L19; else goto _L18
_L18:
_L15:
        kwj1.d(l);
        if (true) goto _L21; else goto _L20
_L20:
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kwk1.a(3, b[i]);
            }

        }
        super.writeTo(kwk1);
    }
}
