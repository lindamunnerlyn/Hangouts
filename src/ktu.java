// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ktu
{

    private final byte a[];
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private a n;

    ktu(InputStream inputstream)
    {
        h = false;
        j = 0x7fffffff;
        l = 100;
        m = 0x4000000;
        n = null;
        a = new byte[4096];
        c = 0;
        e = 0;
        i = 0;
        f = inputstream;
        b = false;
    }

    private ktu(kuz kuz1)
    {
        h = false;
        j = 0x7fffffff;
        l = 100;
        m = 0x4000000;
        n = null;
        a = kuz1.b;
        e = kuz1.b();
        c = e + kuz1.a();
        i = -e;
        f = null;
        b = true;
    }

    private ktu(byte abyte0[], int i1, int j1)
    {
        h = false;
        j = 0x7fffffff;
        l = 100;
        m = 0x4000000;
        n = null;
        a = abyte0;
        c = i1 + j1;
        e = i1;
        i = -i1;
        f = null;
        b = false;
    }

    static ktu a(kuz kuz1)
    {
        ktu ktu1 = new ktu(kuz1);
        try
        {
            ktu1.b(kuz1.a());
        }
        // Misplaced declaration of an exception variable
        catch (kuz kuz1)
        {
            throw new IllegalArgumentException(kuz1);
        }
        return ktu1;
    }

    public static ktu a(byte abyte0[], int i1, int j1)
    {
        abyte0 = new ktu(abyte0, 0, j1);
        try
        {
            abyte0.b(j1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException(abyte0);
        }
        return abyte0;
    }

    private void d(int i1)
    {
        if (!e(i1))
        {
            throw kuu.b();
        } else
        {
            return;
        }
    }

    private boolean e(int i1)
    {
_L2:
        if (e + i1 <= c)
        {
            throw new IllegalStateException((new StringBuilder(77)).append("refillBuffer() called when ").append(i1).append(" bytes were already available in buffer").toString());
        }
        break MISSING_BLOCK_LABEL_47;
        int j1;
        while (j1 <= 0) 
        {
            do
            {
                return false;
            } while (i + e + i1 > j || f == null);
            j1 = e;
            if (j1 > 0)
            {
                if (c > j1)
                {
                    System.arraycopy(a, j1, a, 0, c - j1);
                }
                i = i + j1;
                c = c - j1;
                e = 0;
            }
            j1 = f.read(a, c, a.length - c);
            if (j1 == 0 || j1 < -1 || j1 > a.length)
            {
                throw new IllegalStateException((new StringBuilder(102)).append("InputStream#read(byte[]) returned invalid result: ").append(j1).append("\nThe InputStream implementation is buggy.").toString());
            }
        }
        c = j1 + c;
        if ((i + i1) - m > 0)
        {
            throw new kuu("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        y();
        if (c >= i1)
        {
            return true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private byte[] f(int i1)
    {
        if (i1 <= 0)
        {
            if (i1 == 0)
            {
                return kuq.c;
            } else
            {
                throw kuu.c();
            }
        }
        if (i + e + i1 > j)
        {
            g(j - i - e);
            throw kuu.b();
        }
        if (i1 < 4096)
        {
            byte abyte0[] = new byte[i1];
            int j1 = c - e;
            System.arraycopy(a, e, abyte0, 0, j1);
            e = c;
            int l1 = i1 - j1;
            if (c - e < l1)
            {
                d(l1);
            }
            System.arraycopy(a, 0, abyte0, j1, i1 - j1);
            e = i1 - j1;
            return abyte0;
        }
        int l2 = e;
        int i3 = c;
        i = i + c;
        e = 0;
        c = 0;
        Object obj = new ArrayList();
        int j2;
        for (int k1 = i1 - (i3 - l2); k1 > 0; k1 -= j2)
        {
            byte abyte1[] = new byte[Math.min(k1, 4096)];
            int k2;
            for (int i2 = 0; i2 < abyte1.length; i2 += k2)
            {
                if (f == null)
                {
                    k2 = -1;
                } else
                {
                    k2 = f.read(abyte1, i2, abyte1.length - i2);
                }
                if (k2 == -1)
                {
                    throw kuu.b();
                }
                i = i + k2;
            }

            j2 = abyte1.length;
            ((List) (obj)).add(abyte1);
        }

        byte abyte2[] = new byte[i1];
        i1 = i3 - l2;
        System.arraycopy(a, l2, abyte2, 0, i1);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            byte abyte3[] = (byte[])((Iterator) (obj)).next();
            System.arraycopy(abyte3, 0, abyte2, i1, abyte3.length);
            i1 = abyte3.length + i1;
        }

        return abyte2;
    }

    private void g(int i1)
    {
        if (i1 <= c - e && i1 >= 0)
        {
            e = e + i1;
            return;
        }
        if (i1 < 0)
        {
            throw kuu.c();
        }
        if (i + e + i1 > j)
        {
            g(j - i - e);
            throw kuu.b();
        }
        int j1 = c - e;
        e = c;
        d(1);
        while (i1 - j1 > c) 
        {
            j1 += c;
            e = c;
            d(1);
        }
        e = i1 - j1;
    }

    private long u()
    {
        int i1 = e;
        if (c == i1) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int j1;
        int k1;
        abyte0 = a;
        j1 = i1 + 1;
        k1 = abyte0[i1];
        if (k1 >= 0)
        {
            e = j1;
            return (long)k1;
        }
        if (c - j1 < 9) goto _L2; else goto _L3
_L3:
        i1 = j1 + 1;
        k1 ^= abyte0[j1] << 7;
        if (k1 >= 0) goto _L5; else goto _L4
_L4:
        long l1 = k1 ^ 0xffffff80;
_L9:
        e = i1;
        return l1;
_L5:
        j1 = i1 + 1;
        k1 ^= abyte0[i1] << 14;
        if (k1 >= 0)
        {
            l1 = k1 ^ 0x3f80;
            i1 = j1;
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1 + 1;
        j1 = k1 ^ abyte0[j1] << 21;
        if (j1 < 0)
        {
            l1 = j1 ^ 0xffe03f80;
            continue; /* Loop/switch isn't completed */
        }
        l1 = j1;
        j1 = i1 + 1;
        l1 ^= (long)abyte0[i1] << 28;
        if (l1 >= 0L)
        {
            l1 ^= 0xfe03f80L;
            i1 = j1;
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1 + 1;
        l1 ^= (long)abyte0[j1] << 35;
        if (l1 < 0L)
        {
            l1 ^= 0xfffffff80fe03f80L;
            continue; /* Loop/switch isn't completed */
        }
        j1 = i1 + 1;
        l1 ^= (long)abyte0[i1] << 42;
        if (l1 >= 0L)
        {
            l1 ^= 0x3f80fe03f80L;
            i1 = j1;
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1 + 1;
        l1 ^= (long)abyte0[j1] << 49;
        if (l1 < 0L)
        {
            l1 ^= 0xfffe03f80fe03f80L;
            continue; /* Loop/switch isn't completed */
        }
        j1 = i1 + 1;
        l1 = l1 ^ (long)abyte0[i1] << 56 ^ 0xfe03f80fe03f80L;
        if (l1 >= 0L) goto _L7; else goto _L6
_L6:
        i1 = j1 + 1;
        if ((long)abyte0[j1] >= 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return v();
_L7:
        i1 = j1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private long v()
    {
        long l1 = 0L;
        for (int i1 = 0; i1 < 64; i1 += 7)
        {
            if (e == c)
            {
                d(1);
            }
            byte abyte0[] = a;
            int j1 = e;
            e = j1 + 1;
            j1 = abyte0[j1];
            l1 |= (long)(j1 & 0x7f) << i1;
            if ((j1 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw new kuu("CodedInputStream encountered a malformed varint.");
    }

    private int w()
    {
        int j1 = e;
        int i1 = j1;
        if (c - j1 < 4)
        {
            d(4);
            i1 = e;
        }
        byte abyte0[] = a;
        e = i1 + 4;
        j1 = abyte0[i1];
        byte byte0 = abyte0[i1 + 1];
        byte byte1 = abyte0[i1 + 2];
        return (abyte0[i1 + 3] & 0xff) << 24 | (j1 & 0xff | (byte0 & 0xff) << 8 | (byte1 & 0xff) << 16);
    }

    private long x()
    {
        int j1 = e;
        int i1 = j1;
        if (c - j1 < 8)
        {
            d(8);
            i1 = e;
        }
        byte abyte0[] = a;
        e = i1 + 8;
        long l1 = abyte0[i1];
        long l2 = abyte0[i1 + 1];
        long l3 = abyte0[i1 + 2];
        long l4 = abyte0[i1 + 3];
        long l5 = abyte0[i1 + 4];
        long l6 = abyte0[i1 + 5];
        long l7 = abyte0[i1 + 6];
        return ((long)abyte0[i1 + 7] & 255L) << 56 | (l1 & 255L | (l2 & 255L) << 8 | (l3 & 255L) << 16 | (l4 & 255L) << 24 | (l5 & 255L) << 32 | (l6 & 255L) << 40 | (l7 & 255L) << 48);
    }

    private void y()
    {
        c = c + d;
        int i1 = i + c;
        if (i1 > j)
        {
            d = i1 - j;
            c = c - d;
            return;
        } else
        {
            d = 0;
            return;
        }
    }

    public int a()
    {
        boolean flag = true;
        if (e != c || e(1))
        {
            flag = false;
        }
        if (flag)
        {
            g = 0;
            return 0;
        }
        g = s();
        if (g >>> 3 == 0)
        {
            throw new kuu("Protocol message contained an invalid tag (zero).");
        } else
        {
            return g;
        }
    }

    public kud a(int i1, kud kud1, kty kty)
    {
        if (k >= l)
        {
            throw kuu.e();
        } else
        {
            k = k + 1;
            kud1 = kud.a(kud1, this, kty);
            a(i1 << 3 | 4);
            k = k - 1;
            return kud1;
        }
    }

    public kud a(kud kud1, kty kty)
    {
        int i1 = s();
        if (k >= l)
        {
            throw kuu.e();
        } else
        {
            i1 = b(i1);
            k = k + 1;
            kud1 = kud.a(kud1, this, kty);
            a(0);
            k = k - 1;
            c(i1);
            return kud1;
        }
    }

    public void a(int i1)
    {
        if (g != i1)
        {
            throw new kuu("Protocol message end-group tag did not match expected tag.");
        } else
        {
            return;
        }
    }

    public void a(int i1, kvc kvc1, kty kty)
    {
        if (k >= l)
        {
            throw kuu.e();
        } else
        {
            k = k + 1;
            kvc1.b(this, kty);
            a(i1 << 3 | 4);
            k = k - 1;
            return;
        }
    }

    public void a(kvc kvc1, kty kty)
    {
        int i1 = s();
        if (k >= l)
        {
            throw kuu.e();
        } else
        {
            i1 = b(i1);
            k = k + 1;
            kvc1.b(this, kty);
            a(0);
            k = k - 1;
            c(i1);
            return;
        }
    }

    public double b()
    {
        return Double.longBitsToDouble(x());
    }

    public int b(int i1)
    {
        if (i1 < 0)
        {
            throw kuu.c();
        }
        i1 = i + e + i1;
        int j1 = j;
        if (i1 > j1)
        {
            throw kuu.b();
        } else
        {
            j = i1;
            y();
            return j1;
        }
    }

    public float c()
    {
        return Float.intBitsToFloat(w());
    }

    public void c(int i1)
    {
        j = i1;
        y();
    }

    public long d()
    {
        return u();
    }

    public long e()
    {
        return u();
    }

    public int f()
    {
        return s();
    }

    public long g()
    {
        return x();
    }

    public int h()
    {
        return w();
    }

    public boolean i()
    {
        return u() != 0L;
    }

    public String j()
    {
        int i1 = s();
        if (i1 <= c - e && i1 > 0)
        {
            String s1 = new String(a, e, i1, kuq.a);
            e = i1 + e;
            return s1;
        }
        if (i1 == 0)
        {
            return "";
        } else
        {
            return new String(f(i1), kuq.a);
        }
    }

    public String k()
    {
        byte abyte0[];
        int i1;
        int j1;
        int k1;
        boolean flag1;
        int i2;
        int j2;
        flag1 = false;
        i2 = s();
        j1 = e;
        if (i2 <= c - j1 && i2 > 0)
        {
            abyte0 = a;
            e = j1 + i2;
        } else
        {
            if (i2 == 0)
            {
                return "";
            }
            abyte0 = f(i2);
            j1 = 0;
        }
        j2 = j1 + i2;
        for (k1 = j1; k1 < j2 && abyte0[k1] >= 0; k1++) { }
        i1 = k1;
        if (k1 < j2) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L3:
        boolean flag = flag1;
        if (i1 == 0)
        {
            flag = true;
        }
        int l1;
        byte byte0;
        int k2;
        if (!flag)
        {
            throw new kuu("Protocol message had invalid UTF-8.");
        } else
        {
            return new String(abyte0, j1, i2, kuq.a);
        }
_L5:
        i1 = l1;
_L2:
label0:
        {
            if (i1 < j2)
            {
                break label0;
            }
            i1 = 0;
        }
          goto _L3
        l1 = i1 + 1;
        byte0 = abyte0[i1];
        if (byte0 >= 0) goto _L5; else goto _L4
_L4:
        if (byte0 >= -32)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        i1 = byte0;
        if (l1 >= j2) goto _L3; else goto _L6
_L6:
        if (byte0 < -62)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = l1 + 1;
        if (abyte0[l1] <= -65) goto _L2; else goto _L7
_L7:
        i1 = -1;
          goto _L3
label1:
        {
            if (byte0 >= -16)
            {
                break MISSING_BLOCK_LABEL_297;
            }
            if (l1 < j2 - 1)
            {
                break label1;
            }
            i1 = g.a(abyte0, l1, j2);
        }
          goto _L3
        k2 = l1 + 1;
        i1 = abyte0[l1];
        if (i1 > -65 || byte0 == -32 && i1 < -96 || byte0 == -19 && i1 >= -96)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = k2 + 1;
        if (abyte0[k2] <= -65) goto _L2; else goto _L8
_L8:
        i1 = -1;
          goto _L3
label2:
        {
            if (l1 < j2 - 2)
            {
                break label2;
            }
            i1 = g.a(abyte0, l1, j2);
        }
          goto _L3
        i1 = l1 + 1;
        l1 = abyte0[l1];
        if (l1 > -65 || (byte0 << 28) + (l1 + 112) >> 30 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = i1 + 1;
        if (abyte0[i1] > -65)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = l1 + 1;
        if (abyte0[l1] <= -65) goto _L2; else goto _L9
_L9:
        i1 = -1;
          goto _L3
    }

    public kts l()
    {
        int i1 = s();
        if (i1 <= c - e && i1 > 0)
        {
            Object obj;
            if (b && h)
            {
                obj = new ktq(a, e, i1);
            } else
            {
                obj = kts.a(a, e, i1);
            }
            e = i1 + e;
            return ((kts) (obj));
        }
        if (i1 == 0)
        {
            return kts.a;
        } else
        {
            return new kuz(f(i1));
        }
    }

    public int m()
    {
        return s();
    }

    public int n()
    {
        return s();
    }

    public int o()
    {
        return w();
    }

    public long p()
    {
        return x();
    }

    public int q()
    {
        int i1 = s();
        return -(i1 & 1) ^ i1 >>> 1;
    }

    public long r()
    {
        long l1 = u();
        return -(l1 & 1L) ^ l1 >>> 1;
    }

    public int s()
    {
        int i1 = e;
        if (c == i1) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int j1;
        int k1;
        abyte0 = a;
        j1 = i1 + 1;
        k1 = abyte0[i1];
        if (k1 >= 0)
        {
            e = j1;
            return k1;
        }
        if (c - j1 < 9) goto _L2; else goto _L3
_L3:
        i1 = j1 + 1;
        k1 ^= abyte0[j1] << 7;
        if (k1 >= 0) goto _L5; else goto _L4
_L4:
        j1 = k1 ^ 0xffffff80;
_L11:
        e = i1;
        return j1;
_L5:
        int l1;
        j1 = i1 + 1;
        k1 ^= abyte0[i1] << 14;
        if (k1 >= 0)
        {
            k1 ^= 0x3f80;
            i1 = j1;
            j1 = k1;
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1 + 1;
        k1 ^= abyte0[j1] << 21;
        if (k1 < 0)
        {
            j1 = k1 ^ 0xffe03f80;
            continue; /* Loop/switch isn't completed */
        }
        l1 = i1 + 1;
        j1 = abyte0[i1];
        k1 = k1 ^ j1 << 28 ^ 0xfe03f80;
        i1 = l1;
        if (j1 >= 0) goto _L7; else goto _L6
_L6:
        int i2;
        i2 = l1 + 1;
        j1 = k1;
        i1 = i2;
        if (abyte0[l1] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = i2 + 1;
        i1 = l1;
        if (abyte0[i2] >= 0) goto _L7; else goto _L8
_L8:
        i2 = l1 + 1;
        j1 = k1;
        i1 = i2;
        if (abyte0[l1] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = i2 + 1;
        i1 = l1;
        if (abyte0[i2] >= 0) goto _L7; else goto _L9
_L9:
        i1 = l1 + 1;
        j1 = k1;
        if (abyte0[l1] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return (int)v();
_L7:
        j1 = k1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public int t()
    {
        if (j == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i1 = i;
            int j1 = e;
            return j - (i1 + j1);
        }
    }
}
