// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksf extends kwm
{

    private static volatile ksf e[];
    public ksg a;
    public int b[];
    public Integer c;
    public ksk d;

    public ksf()
    {
        a = null;
        b = kwx.a;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ksf[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new ksf[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
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
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(4, d);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L8:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 68
    //                   0: 78
    //                   10: 80
    //                   16: 109
    //                   18: 308
    //                   24: 538
    //                   34: 583;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new ksg();
        }
        kwj1.a(a);
          goto _L8
_L4:
        int ai[];
        int k;
        int j1;
        j1 = kwx.a(kwj1, 16);
        ai = new int[j1];
        k = 0;
        i = 0;
_L15:
        if (k >= j1) goto _L10; else goto _L9
_L9:
        int k1;
        if (k != 0)
        {
            kwj1.a();
        }
        k1 = kwj1.f();
        k1;
        JVM INSTR tableswitch 0 5: default 192
    //                   0 201
    //                   1 201
    //                   2 201
    //                   3 201
    //                   4 201
    //                   5 201;
           goto _L11 _L12 _L12 _L12 _L12 _L12 _L12
_L11:
        k++;
          goto _L13
_L12:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L11; else goto _L13
_L13:
        if (true) goto _L15; else goto _L14
_L14:
_L10:
        if (i != 0)
        {
            if (b == null)
            {
                k = 0;
            } else
            {
                k = b.length;
            }
            if (k == 0 && i == ai.length)
            {
                b = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                b = ai1;
            }
        }
          goto _L8
_L5:
        int i1;
        i1 = kwj1.c(kwj1.p());
        i = kwj1.r();
        k = 0;
_L21:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L17; else goto _L16
_L16:
        kwj1.e(i);
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ai, 0, i);
            k = i;
        }
_L19:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                ai[k] = i;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L17
        if (true) goto _L19; else goto _L18
_L18:
        if (true) goto _L21; else goto _L20
_L20:
_L17:
        kwj1.d(i1);
          goto _L8
_L6:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            c = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (d == null)
        {
            d = new ksk();
        }
        kwj1.a(d);
        if (true) goto _L8; else goto _L22
_L22:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kwk1.a(2, b[i]);
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        super.writeTo(kwk1);
    }
}
