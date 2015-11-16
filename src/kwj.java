// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwj
{

    private final byte a[];
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private kwj(byte abyte0[], int i1, int j1)
    {
        g = 0x7fffffff;
        i = 64;
        j = 0x4000000;
        a = abyte0;
        b = i1;
        c = i1 + j1;
        e = i1;
    }

    public static kwj a(byte abyte0[], int i1, int j1)
    {
        return new kwj(abyte0, i1, j1);
    }

    private byte[] f(int i1)
    {
        if (i1 < 0)
        {
            throw kwr.b();
        }
        if (e + i1 > g)
        {
            g(g - e);
            throw kwr.a();
        }
        if (i1 <= c - e)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = e + i1;
            return abyte0;
        } else
        {
            throw kwr.a();
        }
    }

    private void g(int i1)
    {
        if (i1 < 0)
        {
            throw kwr.b();
        }
        if (e + i1 > g)
        {
            g(g - e);
            throw kwr.a();
        }
        if (i1 <= c - e)
        {
            e = e + i1;
            return;
        } else
        {
            throw kwr.a();
        }
    }

    private long s()
    {
        int i1 = 0;
        long l1 = 0L;
        for (; i1 < 64; i1 += 7)
        {
            byte byte0 = w();
            l1 |= (long)(byte0 & 0x7f) << i1;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw kwr.c();
    }

    private int t()
    {
        return w() & 0xff | (w() & 0xff) << 8 | (w() & 0xff) << 16 | (w() & 0xff) << 24;
    }

    private long u()
    {
        int i1 = w();
        int j1 = w();
        int k1 = w();
        int l1 = w();
        int i2 = w();
        int j2 = w();
        int k2 = w();
        int l2 = w();
        long l3 = i1;
        return ((long)j1 & 255L) << 8 | l3 & 255L | ((long)k1 & 255L) << 16 | ((long)l1 & 255L) << 24 | ((long)i2 & 255L) << 32 | ((long)j2 & 255L) << 40 | ((long)k2 & 255L) << 48 | ((long)l2 & 255L) << 56;
    }

    private void v()
    {
        c = c + d;
        int i1 = c;
        if (i1 > g)
        {
            d = i1 - g;
            c = c - d;
            return;
        } else
        {
            d = 0;
            return;
        }
    }

    private byte w()
    {
        if (e == c)
        {
            throw kwr.a();
        } else
        {
            byte abyte0[] = a;
            int i1 = e;
            e = i1 + 1;
            return abyte0[i1];
        }
    }

    public int a()
    {
        boolean flag;
        if (e == c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f = 0;
            return 0;
        }
        f = p();
        if (f == 0)
        {
            throw new kwr("Protocol message contained an invalid tag (zero).");
        } else
        {
            return f;
        }
    }

    public void a(int i1)
    {
        if (f != i1)
        {
            throw new kwr("Protocol message end-group tag did not match expected tag.");
        } else
        {
            return;
        }
    }

    public void a(kws kws1)
    {
        int i1 = p();
        if (h >= i)
        {
            throw kwr.d();
        } else
        {
            i1 = c(i1);
            h = h + 1;
            kws1.mergeFrom(this);
            a(0);
            h = h - 1;
            d(i1);
            return;
        }
    }

    public void a(kws kws1, int i1)
    {
        if (h >= i)
        {
            throw kwr.d();
        } else
        {
            h = h + 1;
            kws1.mergeFrom(this);
            a(i1 << 3 | 4);
            h = h - 1;
            return;
        }
    }

    public byte[] a(int i1, int j1)
    {
        if (j1 == 0)
        {
            return kwx.h;
        } else
        {
            byte abyte0[] = new byte[j1];
            int k1 = b;
            System.arraycopy(a, k1 + i1, abyte0, 0, j1);
            return abyte0;
        }
    }

    public double b()
    {
        return Double.longBitsToDouble(u());
    }

    public boolean b(int i1)
    {
        switch (i1 & 7)
        {
        default:
            throw new kwr("Protocol message tag had invalid wire type.");

        case 0: // '\0'
            f();
            return true;

        case 1: // '\001'
            u();
            return true;

        case 2: // '\002'
            g(p());
            return true;

        case 3: // '\003'
            int j1;
            do
            {
                j1 = a();
            } while (j1 != 0 && b(j1));
            a((i1 >>> 3) << 3 | 4);
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            t();
            return true;
        }
    }

    public float c()
    {
        return Float.intBitsToFloat(t());
    }

    public int c(int i1)
    {
        if (i1 < 0)
        {
            throw kwr.b();
        }
        i1 = e + i1;
        int j1 = g;
        if (i1 > j1)
        {
            throw kwr.a();
        } else
        {
            g = i1;
            v();
            return j1;
        }
    }

    public long d()
    {
        return s();
    }

    public void d(int i1)
    {
        g = i1;
        v();
    }

    public long e()
    {
        return s();
    }

    public void e(int i1)
    {
        if (i1 > e - b)
        {
            int j1 = e;
            int k1 = b;
            throw new IllegalArgumentException((new StringBuilder(50)).append("Position ").append(i1).append(" is beyond current ").append(j1 - k1).toString());
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(24)).append("Bad position ").append(i1).toString());
        } else
        {
            e = b + i1;
            return;
        }
    }

    public int f()
    {
        return p();
    }

    public long g()
    {
        return u();
    }

    public int h()
    {
        return t();
    }

    public boolean i()
    {
        return p() != 0;
    }

    public String j()
    {
        int i1 = p();
        if (i1 <= c - e && i1 > 0)
        {
            String s1 = new String(a, e, i1, "UTF-8");
            e = i1 + e;
            return s1;
        } else
        {
            return new String(f(i1), "UTF-8");
        }
    }

    public byte[] k()
    {
        int i1 = p();
        if (i1 <= c - e && i1 > 0)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = i1 + e;
            return abyte0;
        }
        if (i1 == 0)
        {
            return kwx.h;
        } else
        {
            return f(i1);
        }
    }

    public int l()
    {
        return p();
    }

    public int m()
    {
        return t();
    }

    public int n()
    {
        int i1 = p();
        return -(i1 & 1) ^ i1 >>> 1;
    }

    public long o()
    {
        long l1 = s();
        return -(l1 & 1L) ^ l1 >>> 1;
    }

    public int p()
    {
        int i1 = w();
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        i1 &= 0x7f;
        byte byte0 = w();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 7;
        }
        i1 |= (byte0 & 0x7f) << 7;
        byte0 = w();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 14;
        }
        i1 |= (byte0 & 0x7f) << 14;
        int k1 = w();
        if (k1 >= 0)
        {
            return i1 | k1 << 21;
        }
        byte0 = w();
        k1 = i1 | (k1 & 0x7f) << 21 | byte0 << 28;
        i1 = k1;
        if (byte0 < 0)
        {
            int j1 = 0;
label0:
            do
            {
label1:
                {
                    if (j1 >= 5)
                    {
                        break label1;
                    }
                    i1 = k1;
                    if (w() >= 0)
                    {
                        break label0;
                    }
                    j1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw kwr.c();
    }

    public int q()
    {
        if (g == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i1 = e;
            return g - i1;
        }
    }

    public int r()
    {
        return e - b;
    }
}
