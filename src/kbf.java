// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kbf extends kwm
{

    private static volatile kbf h[];
    public String a;
    public String b;
    public int c[];
    public String d;
    public String e;
    public kbc f;
    public ltc g;

    public kbf()
    {
        a = null;
        b = null;
        c = kwx.a;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kbf[] a()
    {
        if (h == null)
        {
            synchronized (kwq.a)
            {
                if (h == null)
                {
                    h = new kbf[0];
                }
            }
        }
        return h;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize() + kwk.b(1, a);
        int i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
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
        i = j;
        if (d != null)
        {
            i = j + kwk.b(5, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.b(6, e);
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.d(15, g);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.d(500, f);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L25:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 9: default 92
    //                   0: 102
    //                   10: 104
    //                   18: 115
    //                   24: 126
    //                   26: 592
    //                   42: 1358
    //                   50: 1369
    //                   122: 1380
    //                   4002: 1409;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        a = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        int ai[];
        int j;
        int i1;
        i1 = kwx.a(kwj1, 24);
        ai = new int[i1];
        j = 0;
        i = 0;
_L17:
        if (j >= i1) goto _L12; else goto _L11
_L11:
        int j1;
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR lookupswitch 37: default 476
    //                   0: 485
    //                   1: 485
    //                   2: 485
    //                   3: 485
    //                   4: 485
    //                   5: 485
    //                   6: 485
    //                   7: 485
    //                   9: 485
    //                   10: 485
    //                   11: 485
    //                   12: 485
    //                   81: 485
    //                   82: 485
    //                   83: 485
    //                   84: 485
    //                   85: 485
    //                   129: 485
    //                   161: 485
    //                   163: 485
    //                   164: 485
    //                   165: 485
    //                   166: 485
    //                   167: 485
    //                   168: 485
    //                   169: 485
    //                   209: 485
    //                   211: 485
    //                   212: 485
    //                   213: 485
    //                   215: 485
    //                   216: 485
    //                   1297: 485
    //                   1298: 485
    //                   2705: 485
    //                   20753: 485
    //                   20769: 485;
           goto _L13 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14 _L14
_L13:
        j++;
          goto _L15
_L14:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L13; else goto _L15
_L15:
        if (true) goto _L17; else goto _L16
_L16:
_L12:
        if (i != 0)
        {
            if (c == null)
            {
                j = 0;
            } else
            {
                j = c.length;
            }
            if (j == 0 && i == ai.length)
            {
                c = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                c = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int l;
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L23:
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
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 81: // 'Q'
            case 82: // 'R'
            case 83: // 'S'
            case 84: // 'T'
            case 85: // 'U'
            case 129: 
            case 161: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 167: 
            case 168: 
            case 169: 
            case 209: 
            case 211: 
            case 212: 
            case 213: 
            case 215: 
            case 216: 
            case 1297: 
            case 1298: 
            case 2705: 
            case 20753: 
            case 20769: 
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L19; else goto _L18
_L18:
        kwj1.e(i);
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(c, 0, ai, 0, i);
            j = i;
        }
_L21:
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
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 81: // 'Q'
            case 82: // 'R'
            case 83: // 'S'
            case 84: // 'T'
            case 85: // 'U'
            case 129: 
            case 161: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 167: 
            case 168: 
            case 169: 
            case 209: 
            case 211: 
            case 212: 
            case 213: 
            case 215: 
            case 216: 
            case 1297: 
            case 1298: 
            case 2705: 
            case 20753: 
            case 20769: 
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        c = ai;
          goto _L19
        if (true) goto _L21; else goto _L20
_L20:
        if (true) goto _L23; else goto _L22
_L22:
_L19:
        kwj1.d(l);
        continue; /* Loop/switch isn't completed */
_L7:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new ltc();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        if (f == null)
        {
            f = new kbc();
        }
        kwj1.a(f);
        if (true) goto _L25; else goto _L24
_L24:
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a);
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kwk1.a(3, c[i]);
            }

        }
        if (d != null)
        {
            kwk1.a(5, d);
        }
        if (e != null)
        {
            kwk1.a(6, e);
        }
        if (g != null)
        {
            kwk1.b(15, g);
        }
        if (f != null)
        {
            kwk1.b(500, f);
        }
        super.writeTo(kwk1);
    }
}
