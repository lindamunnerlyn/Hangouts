// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huo extends koj
{

    public String a;
    public Boolean b;
    public int c[];
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public String h;
    public Boolean i;
    public Boolean j;
    public Boolean k;

    public huo()
    {
        a = null;
        b = null;
        c = kou.a;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int i1 = l;
        if (a != null)
        {
            i1 = l + koh.b(1, a);
        }
        l = i1;
        if (b != null)
        {
            b.booleanValue();
            l = i1 + (koh.f(2) + 1);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l;
            if (c.length > 0)
            {
                int j1 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < c.length; i1++)
                {
                    j1 += koh.e(c[i1]);
                }

                i1 = l + j1 + c.length * 1;
            }
        }
        l = i1;
        if (d != null)
        {
            l = i1 + koh.e(4, d.intValue());
        }
        i1 = l;
        if (e != null)
        {
            i1 = l + koh.e(5, e.intValue());
        }
        l = i1;
        if (f != null)
        {
            l = i1 + koh.e(6, f.intValue());
        }
        i1 = l;
        if (g != null)
        {
            i1 = l + koh.e(7, g.intValue());
        }
        l = i1;
        if (h != null)
        {
            l = i1 + koh.b(8, h);
        }
        i1 = l;
        if (i != null)
        {
            i.booleanValue();
            i1 = l + (koh.f(9) + 1);
        }
        l = i1;
        if (j != null)
        {
            j.booleanValue();
            l = i1 + (koh.f(10) + 1);
        }
        i1 = l;
        if (k != null)
        {
            k.booleanValue();
            i1 = l + (koh.f(11) + 1);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L15:
        int l = kog1.a();
        l;
        JVM INSTR lookupswitch 13: default 124
    //                   0: 134
    //                   10: 136
    //                   16: 147
    //                   24: 161
    //                   26: 372
    //                   32: 626
    //                   40: 640
    //                   48: 654
    //                   56: 668
    //                   66: 723
    //                   72: 734
    //                   80: 748
    //                   88: 762;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kog1, l)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L15
_L4:
        b = Boolean.valueOf(kog1.i());
          goto _L15
_L5:
        int ai[];
        int j1;
        int i2;
        i2 = kou.b(kog1, 24);
        ai = new int[i2];
        j1 = 0;
        l = 0;
_L22:
        if (j1 >= i2) goto _L17; else goto _L16
_L16:
        int j2;
        if (j1 != 0)
        {
            kog1.a();
        }
        j2 = kog1.f();
        j2;
        JVM INSTR tableswitch 0 8: default 256
    //                   0 265
    //                   1 265
    //                   2 265
    //                   3 265
    //                   4 265
    //                   5 265
    //                   6 265
    //                   7 265
    //                   8 265;
           goto _L18 _L19 _L19 _L19 _L19 _L19 _L19 _L19 _L19 _L19
_L18:
        j1++;
          goto _L20
_L19:
        int k1 = l + 1;
        ai[l] = j2;
        l = k1;
        if (true) goto _L18; else goto _L20
_L20:
        if (true) goto _L22; else goto _L21
_L21:
_L17:
        if (l != 0)
        {
            if (c == null)
            {
                j1 = 0;
            } else
            {
                j1 = c.length;
            }
            if (j1 == 0 && l == ai.length)
            {
                c = ai;
            } else
            {
                int ai1[] = new int[j1 + l];
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, j1);
                }
                System.arraycopy(ai, 0, ai1, j1, l);
                c = ai1;
            }
        }
          goto _L15
_L6:
        int l1;
        l1 = kog1.c(kog1.p());
        l = kog1.r();
        j1 = 0;
_L28:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
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
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 0) goto _L24; else goto _L23
_L23:
        kog1.e(l);
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        ai = new int[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, ai, 0, l);
            j1 = l;
        }
_L26:
        if (kog1.q() > 0)
        {
            l = kog1.f();
            switch (l)
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
                ai[j1] = l;
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        c = ai;
          goto _L24
        if (true) goto _L26; else goto _L25
_L25:
        if (true) goto _L28; else goto _L27
_L27:
_L24:
        kog1.d(l1);
          goto _L15
_L7:
        d = Integer.valueOf(kog1.f());
          goto _L15
_L8:
        e = Integer.valueOf(kog1.f());
          goto _L15
_L9:
        f = Integer.valueOf(kog1.f());
          goto _L15
_L10:
        int i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            g = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        h = kog1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        i = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        j = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L14:
        k = Boolean.valueOf(kog1.i());
        if (true) goto _L15; else goto _L29
_L29:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                koh1.a(3, c[l]);
            }

        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        if (f != null)
        {
            koh1.a(6, f.intValue());
        }
        if (g != null)
        {
            koh1.a(7, g.intValue());
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            koh1.a(10, j.booleanValue());
        }
        if (k != null)
        {
            koh1.a(11, k.booleanValue());
        }
        super.writeTo(koh1);
    }
}
