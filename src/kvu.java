// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class kvu
{

    private static final kvu a = new kvu(0, new int[0], new Object[0], false);
    private int b;
    private int c[];
    private Object d[];
    private int e;
    private boolean f;

    private kvu()
    {
        this(0, new int[8], new Object[8], true);
    }

    private kvu(int i, int ai[], Object aobj[], boolean flag)
    {
        e = -1;
        b = i;
        c = ai;
        d = aobj;
        f = flag;
    }

    public static kvu a()
    {
        return a;
    }

    static kvu a(kvu kvu1, kvu kvu2)
    {
        int i = kvu1.b + kvu2.b;
        int ai[] = Arrays.copyOf(kvu1.c, i);
        System.arraycopy(kvu2.c, 0, ai, kvu1.b, kvu2.b);
        Object aobj[] = Arrays.copyOf(kvu1.d, i);
        System.arraycopy(((Object) (kvu2.d)), 0, ((Object) (aobj)), kvu1.b, kvu2.b);
        return new kvu(i, ai, aobj, true);
    }

    private void a(int i, Object obj)
    {
        if (b == c.length)
        {
            int j;
            if (b < 4)
            {
                j = 8;
            } else
            {
                j = b >> 1;
            }
            j += b;
            c = Arrays.copyOf(c, j);
            d = Arrays.copyOf(d, j);
        }
        c[b] = i;
        d[b] = obj;
        b = b + 1;
    }

    static kvu b()
    {
        return new kvu();
    }

    private void e()
    {
        if (!f)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return;
        }
    }

    public static kvv newBuilder()
    {
        return new kvv();
    }

    kvu a(int i, int j)
    {
        e();
        if (i == 0)
        {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        } else
        {
            a(i << 3, Long.valueOf(j));
            return this;
        }
    }

    public void a(ktv ktv1)
    {
        int i = 0;
_L8:
        int j;
        int k;
        if (i >= b)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        j = c[i];
        k = j >>> 3;
        j & 7;
        JVM INSTR tableswitch 0 5: default 64
    //                   0 68
    //                   1 114
    //                   2 135
    //                   3 153
    //                   4 64
    //                   5 93;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6
_L5:
        break MISSING_BLOCK_LABEL_153;
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        throw kuu.d();
_L2:
        ktv1.a(k, ((Long)d[i]).longValue());
_L9:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        ktv1.b(k, ((Integer)d[i]).intValue());
          goto _L9
_L3:
        ktv1.c(k, ((Long)d[i]).longValue());
          goto _L9
_L4:
        ktv1.a(k, (kts)d[i]);
          goto _L9
        ktv1.d(k, 3);
        ((kvu)d[i]).a(ktv1);
        ktv1.d(k, 4);
          goto _L9
    }

    boolean a(int i, ktu ktu1)
    {
        e();
        switch (i & 7)
        {
        default:
            throw kuu.d();

        case 0: // '\0'
            a(i, Long.valueOf(ktu1.e()));
            return true;

        case 5: // '\005'
            a(i, Integer.valueOf(ktu1.h()));
            return true;

        case 1: // '\001'
            a(i, Long.valueOf(ktu1.g()));
            return true;

        case 2: // '\002'
            a(i, ktu1.l());
            return true;

        case 3: // '\003'
            kvu kvu1 = new kvu();
            int j;
            do
            {
                j = ktu1.a();
            } while (j != 0 && kvu1.a(j, ktu1));
            ktu1.a((i >>> 3) << 3 | 4);
            a(i, kvu1);
            return true;

        case 4: // '\004'
            return false;
        }
    }

    public void c()
    {
        f = false;
    }

    public int d()
    {
        int i;
        int j;
        i = e;
        if (i != -1)
        {
            return i;
        }
        j = 0;
        i = 0;
_L8:
        int k;
        int i1;
        if (j >= b)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        k = c[j];
        i1 = k >>> 3;
        k & 7;
        JVM INSTR tableswitch 0 5: default 80
    //                   0 91
    //                   1 142
    //                   2 166
    //                   3 186
    //                   4 80
    //                   5 118;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6
_L5:
        break MISSING_BLOCK_LABEL_186;
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalStateException(kuu.d());
_L2:
        i += ktv.d(i1, ((Long)d[j]).longValue());
_L9:
        j++;
        if (true) goto _L8; else goto _L7
_L7:
        ((Integer)d[j]).intValue();
        i += ktv.j(i1);
          goto _L9
_L3:
        ((Long)d[j]).longValue();
        i += ktv.i(i1);
          goto _L9
_L4:
        i += ktv.b(i1, (kts)d[j]);
          goto _L9
        int l = ktv.q(i1);
        i += ((kvu)d[j]).d() + (l << 1);
          goto _L9
        e = i;
        return i;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof kvu))
            {
                return false;
            }
            obj = (kvu)obj;
            if (b != ((kvu) (obj)).b || !Arrays.equals(c, ((kvu) (obj)).c) || !Arrays.deepEquals(d, ((kvu) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((b + 527) * 31 + Arrays.hashCode(c)) * 31 + Arrays.deepHashCode(d);
    }

}
