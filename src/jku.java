// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jku extends kwm
{

    private static volatile jku e[];
    public jkv a;
    public int b[];
    public String c;
    public String d;

    public jku()
    {
        a = null;
        b = kwx.a;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jku[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new jku[0];
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
            i = j + kwk.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.b(4, d);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L22:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 68
    //                   0: 78
    //                   10: 80
    //                   16: 109
    //                   18: 324
    //                   26: 586
    //                   34: 597;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new jkv();
        }
        kwj1.a(a);
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[];
        int j;
        int i1;
        i1 = kwx.a(kwj1, 16);
        ai = new int[i1];
        j = 0;
        i = 0;
_L14:
        if (j >= i1) goto _L9; else goto _L8
_L8:
        int j1;
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR tableswitch 0 9: default 208
    //                   0 217
    //                   1 217
    //                   2 217
    //                   3 217
    //                   4 217
    //                   5 217
    //                   6 217
    //                   7 217
    //                   8 217
    //                   9 217;
           goto _L10 _L11 _L11 _L11 _L11 _L11 _L11 _L11 _L11 _L11 _L11
_L10:
        j++;
          goto _L12
_L11:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L10; else goto _L12
_L12:
        if (true) goto _L14; else goto _L13
_L13:
_L9:
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
_L5:
        int l;
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L20:
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
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L16; else goto _L15
_L15:
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
_L18:
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
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L16
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
_L16:
        kwj1.d(l);
        continue; /* Loop/switch isn't completed */
_L6:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        d = kwj1.j();
        if (true) goto _L22; else goto _L21
_L21:
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
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        super.writeTo(kwk1);
    }
}
