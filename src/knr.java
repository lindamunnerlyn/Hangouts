// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class knr
{

    private static final int a[];
    private static final Object b[];
    private static final knr c;
    private int d;
    private int e[];
    private Object f[];
    private int g;

    knr(int i, int ai[], Object aobj[])
    {
        g = -1;
        d = i;
        e = ai;
        f = aobj;
    }

    public static knr a()
    {
        return c;
    }

    static knr a(knr knr1, knr knr2)
    {
        int i = knr1.d + knr2.d;
        int ai[] = Arrays.copyOf(knr1.e, i);
        System.arraycopy(knr2.e, 0, ai, knr1.d, knr2.d);
        Object aobj[] = Arrays.copyOf(knr1.f, i);
        System.arraycopy(((Object) (knr2.f)), 0, ((Object) (aobj)), knr1.d, knr2.d);
        return new knr(i, ai, aobj);
    }

    static int[] c()
    {
        return a;
    }

    static Object[] d()
    {
        return b;
    }

    static knr e()
    {
        return c;
    }

    public static kns newBuilder()
    {
        return new kns();
    }

    public void a(kls kls1)
    {
        int i = 0;
_L8:
        int j;
        int k;
        if (i >= d)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        j = e[i];
        k = knu.b(j);
        knu.a(j);
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
        throw kmr.g();
_L2:
        kls1.a(k, ((Long)f[i]).longValue());
_L9:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        kls1.b(k, ((Integer)f[i]).intValue());
          goto _L9
_L3:
        kls1.c(k, ((Long)f[i]).longValue());
          goto _L9
_L4:
        kls1.a(k, (klp)f[i]);
          goto _L9
        kls1.d(k, 3);
        ((knr)f[i]).a(kls1);
        kls1.d(k, 4);
          goto _L9
    }

    public int b()
    {
        int i;
        int j;
        i = g;
        if (i != -1)
        {
            return i;
        }
        j = 0;
        i = 0;
_L8:
        int k;
        int i1;
        if (j >= d)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        k = e[j];
        i1 = knu.b(k);
        knu.a(k);
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
        throw new IllegalStateException(kmr.g());
_L2:
        i += kls.d(i1, ((Long)f[j]).longValue());
_L9:
        j++;
        if (true) goto _L8; else goto _L7
_L7:
        ((Integer)f[j]).intValue();
        i += kls.j(i1);
          goto _L9
_L3:
        ((Long)f[j]).longValue();
        i += kls.i(i1);
          goto _L9
_L4:
        i += kls.b(i1, (klp)f[j]);
          goto _L9
        int l = kls.q(i1);
        i += ((knr)f[j]).b() + (l << 1);
          goto _L9
        g = i;
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
            if (!(obj instanceof knr))
            {
                return false;
            }
            obj = (knr)obj;
            if (d != ((knr) (obj)).d || !Arrays.equals(e, ((knr) (obj)).e) || !Arrays.deepEquals(f, ((knr) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((d + 527) * 31 + Arrays.hashCode(e)) * 31 + Arrays.deepHashCode(f);
    }

    static 
    {
        a = new int[0];
        b = new Object[0];
        c = new knr(0, a, b);
    }
}
