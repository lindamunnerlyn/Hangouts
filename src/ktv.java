// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ktv
{

    private static final Logger a = Logger.getLogger(ktv.getName());
    private final byte b[];
    private final int c;
    private int d;
    private int e;
    private final OutputStream f = null;

    private ktv(byte abyte0[], int i1, int j1)
    {
        e = 0;
        b = abyte0;
        d = 0;
        c = j1 + 0;
    }

    public static int a()
    {
        return 8;
    }

    public static int a(int i1, kuy kuy1)
    {
        return (q(1) << 1) + t(i1) + (q(3) + a(kuy1));
    }

    public static int a(kuy kuy1)
    {
        int i1 = kuy1.b();
        return i1 + s(i1);
    }

    public static ktv a(byte abyte0[])
    {
        return new ktv(abyte0, 0, abyte0.length);
    }

    private void a(byte abyte0[], int i1)
    {
        if (c - d >= i1)
        {
            System.arraycopy(abyte0, 0, b, d, i1);
            d = d + i1;
        } else
        {
            int j1 = c - d;
            System.arraycopy(abyte0, 0, b, d, j1);
            i1 -= j1;
            d = c;
            e = e + j1;
            i();
            if (i1 <= c)
            {
                System.arraycopy(abyte0, j1, b, 0, i1);
                d = i1;
            } else
            {
                f.write(abyte0, j1, i1);
            }
        }
        e = e + i1;
    }

    public static int b()
    {
        return 4;
    }

    public static int b(int i1, String s1)
    {
        return q(i1) + b(s1);
    }

    public static int b(int i1, kts kts1)
    {
        return q(i1) + b(kts1);
    }

    public static int b(String s1)
    {
        int i1;
        try
        {
            i1 = g.a(s1);
        }
        catch (kvw kvw1)
        {
            i1 = s1.getBytes(kuq.a).length;
        }
        return i1 + s(i1);
    }

    public static int b(kts kts1)
    {
        return s(kts1.a()) + kts1.a();
    }

    public static int c()
    {
        return 8;
    }

    public static int c(int i1, int j1)
    {
        return q(i1) + m(j1);
    }

    public static int c(kvb kvb1)
    {
        return kvb1.n();
    }

    public static int c(byte abyte0[])
    {
        return s(abyte0.length) + abyte0.length;
    }

    public static int d()
    {
        return 4;
    }

    public static int d(int i1, long l1)
    {
        return q(i1) + j(l1);
    }

    public static int d(int i1, kvb kvb1)
    {
        return (q(i1) << 1) + kvb1.n();
    }

    public static int d(kvb kvb1)
    {
        int i1 = kvb1.n();
        return i1 + s(i1);
    }

    public static int e()
    {
        return 1;
    }

    public static int e(int i1, long l1)
    {
        return q(i1) + j(l1);
    }

    public static int e(int i1, kvb kvb1)
    {
        return q(i1) + d(kvb1);
    }

    public static int f()
    {
        return 4;
    }

    public static int f(int i1, kvb kvb1)
    {
        return (q(1) << 1) + t(i1) + e(3, kvb1);
    }

    public static int f(long l1)
    {
        return j(l1);
    }

    public static int g()
    {
        return 8;
    }

    public static int g(long l1)
    {
        return j(l1);
    }

    public static int h(int i1)
    {
        return q(i1) + 8;
    }

    public static int h(long l1)
    {
        return j(l(l1));
    }

    public static int i(int i1)
    {
        return q(i1) + 8;
    }

    private void i()
    {
        if (f == null)
        {
            throw new ktw();
        } else
        {
            f.write(b, 0, d);
            d = 0;
            return;
        }
    }

    private void i(long l1)
    {
        do
        {
            if ((-128L & l1) == 0L)
            {
                u((int)l1);
                return;
            }
            u((int)l1 & 0x7f | 0x80);
            l1 >>>= 7;
        } while (true);
    }

    public static int j(int i1)
    {
        return q(i1) + 4;
    }

    private static int j(long l1)
    {
        if ((-128L & l1) == 0L)
        {
            return 1;
        }
        if ((-16384L & l1) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l1) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l1) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l1) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l1) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l1) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l1) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l1) != 0L ? 10 : 9;
    }

    public static int k(int i1)
    {
        return q(i1) + 1;
    }

    private void k(long l1)
    {
        u((int)l1 & 0xff);
        u((int)(l1 >> 8) & 0xff);
        u((int)(l1 >> 16) & 0xff);
        u((int)(l1 >> 24) & 0xff);
        u((int)(l1 >> 32) & 0xff);
        u((int)(l1 >> 40) & 0xff);
        u((int)(l1 >> 48) & 0xff);
        u((int)(l1 >> 56) & 0xff);
    }

    public static int l(int i1)
    {
        return q(34) + m(i1);
    }

    private static long l(long l1)
    {
        return l1 << 1 ^ l1 >> 63;
    }

    public static int m(int i1)
    {
        if (i1 >= 0)
        {
            return s(i1);
        } else
        {
            return 10;
        }
    }

    public static int n(int i1)
    {
        return s(i1);
    }

    public static int o(int i1)
    {
        return m(i1);
    }

    public static int p(int i1)
    {
        return s(w(i1));
    }

    public static int q(int i1)
    {
        return s(i1 << 3);
    }

    public static int s(int i1)
    {
        if ((i1 & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i1 & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i1) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i1) != 0 ? 5 : 4;
    }

    private static int t(int i1)
    {
        return q(2) + s(i1);
    }

    private void u(int i1)
    {
        byte byte0 = (byte)i1;
        if (d == c)
        {
            i();
        }
        byte abyte0[] = b;
        i1 = d;
        d = i1 + 1;
        abyte0[i1] = byte0;
        e = e + 1;
    }

    private void v(int i1)
    {
        u(i1 & 0xff);
        u(i1 >> 8 & 0xff);
        u(i1 >> 16 & 0xff);
        u(i1 >>> 24);
    }

    private static int w(int i1)
    {
        return i1 << 1 ^ i1 >> 31;
    }

    public void a(double d1)
    {
        k(Double.doubleToRawLongBits(d1));
    }

    public void a(float f1)
    {
        v(Float.floatToRawIntBits(f1));
    }

    public void a(int i1)
    {
        d(34, 0);
        e(i1);
    }

    public void a(int i1, double d1)
    {
        d(i1, 1);
        a(d1);
    }

    public void a(int i1, int j1)
    {
        d(i1, 0);
        b(j1);
    }

    public void a(int i1, long l1)
    {
        d(i1, 0);
        a(l1);
    }

    public void a(int i1, String s1)
    {
        d(i1, 2);
        a(s1);
    }

    public void a(int i1, kts kts1)
    {
        d(i1, 2);
        a(kts1);
    }

    public void a(int i1, kvb kvb1)
    {
        d(i1, 3);
        a(kvb1);
        d(i1, 4);
    }

    public void a(int i1, boolean flag)
    {
        d(i1, 0);
        a(flag);
    }

    public void a(long l1)
    {
        i(l1);
    }

    public void a(String s1)
    {
        int i1;
        int j1 = s1.length() * 3;
        i1 = s(j1);
        if (f != null && i1 + j1 > c - d)
        {
            byte abyte0[] = new byte[j1];
            i1 = g.a(s1, abyte0, 0, j1);
            r(i1);
            a(abyte0, i1);
            return;
        }
        int k1;
        int l1;
        l1 = s(s1.length());
        k1 = d;
        if (l1 != i1) goto _L2; else goto _L1
_L1:
        int i2;
        d = k1 + l1;
        i2 = g.a(s1, b, d, c - d);
        d = k1;
        i1 = i2 - k1 - l1;
        r(i1);
        d = i2;
_L4:
        try
        {
            e = i1 + e;
            return;
        }
        catch (kvw kvw1)
        {
            a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", kvw1);
        }
        s1 = s1.getBytes(kuq.a);
        r(s1.length);
        a(((byte []) (s1)), s1.length);
        return;
_L2:
        i1 = g.a(s1);
        r(i1);
        d = g.a(s1, b, d, c - d);
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        d = k1;
        throw obj;
        obj;
        throw new ktw(((Throwable) (obj)));
    }

    public void a(kts kts1)
    {
        r(kts1.a());
        int i1 = kts1.a();
        if (c - d >= i1)
        {
            kts1.b(b, 0, d, i1);
            d = d + i1;
        } else
        {
            int j1 = c - d;
            kts1.b(b, 0, d, j1);
            i1 -= j1;
            d = c;
            e = e + j1;
            i();
            if (i1 <= c)
            {
                kts1.b(b, j1, 0, i1);
                d = i1;
            } else
            {
                kts1.a(f, j1, i1);
            }
        }
        e = i1 + e;
    }

    public void a(kvb kvb1)
    {
        kvb1.a(this);
    }

    public void a(boolean flag)
    {
        byte byte0;
        byte abyte0[];
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        byte0 = (byte)i1;
        if (d == c)
        {
            i();
        }
        abyte0 = b;
        i1 = d;
        d = i1 + 1;
        abyte0[i1] = byte0;
        e = e + 1;
    }

    public void b(int i1)
    {
        if (i1 >= 0)
        {
            r(i1);
            return;
        } else
        {
            i(i1);
            return;
        }
    }

    public void b(int i1, int j1)
    {
        d(i1, 5);
        c(j1);
    }

    public void b(int i1, long l1)
    {
        d(i1, 0);
        b(l1);
    }

    public void b(int i1, kvb kvb1)
    {
        d(i1, 2);
        b(kvb1);
    }

    public void b(long l1)
    {
        i(l1);
    }

    public void b(kvb kvb1)
    {
        r(kvb1.n());
        kvb1.a(this);
    }

    public void b(byte abyte0[])
    {
        r(abyte0.length);
        a(abyte0, abyte0.length);
    }

    public void c(int i1)
    {
        v(i1);
    }

    public void c(int i1, long l1)
    {
        d(i1, 1);
        c(l1);
    }

    public void c(int i1, kvb kvb1)
    {
        d(1, 3);
        d(2, 0);
        d(i1);
        b(3, kvb1);
        d(1, 4);
    }

    public void c(long l1)
    {
        k(l1);
    }

    public void d(int i1)
    {
        r(i1);
    }

    public void d(int i1, int j1)
    {
        r(i1 << 3 | j1);
    }

    public void d(long l1)
    {
        k(l1);
    }

    public void e(int i1)
    {
        b(i1);
    }

    public void e(long l1)
    {
        i(l(l1));
    }

    public void f(int i1)
    {
        v(i1);
    }

    public void g(int i1)
    {
        r(w(i1));
    }

    public void h()
    {
        if (f == null)
        {
            if (c - d != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            } else
            {
                return;
            }
        } else
        {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        }
    }

    public void r(int i1)
    {
        do
        {
            if ((i1 & 0xffffff80) == 0)
            {
                u(i1);
                return;
            }
            u(i1 & 0x7f | 0x80);
            i1 >>>= 7;
        } while (true);
    }

}
