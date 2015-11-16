// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fdh
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

    fdh(byte abyte0[], int i1, int j1)
    {
        g = 0x7fffffff;
        i = 64;
        j = 0x4000000;
        a = abyte0;
        b = 0;
        c = j1 + 0;
        e = 0;
    }

    private byte[] f(int i1)
    {
        if (i1 < 0)
        {
            throw fdn.b();
        }
        if (e + i1 > g)
        {
            g(g - e);
            throw fdn.a();
        }
        if (i1 <= c - e)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = e + i1;
            return abyte0;
        } else
        {
            throw fdn.a();
        }
    }

    private void g(int i1)
    {
        if (i1 < 0)
        {
            throw fdn.b();
        }
        if (e + i1 > g)
        {
            g(g - e);
            throw fdn.a();
        }
        if (i1 <= c - e)
        {
            e = e + i1;
            return;
        } else
        {
            throw fdn.a();
        }
    }

    private long n()
    {
        int i1 = 0;
        long l1 = 0L;
        for (; i1 < 64; i1 += 7)
        {
            byte byte0 = r();
            l1 |= (long)(byte0 & 0x7f) << i1;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw fdn.c();
    }

    private int o()
    {
        return r() & 0xff | (r() & 0xff) << 8 | (r() & 0xff) << 16 | (r() & 0xff) << 24;
    }

    private long p()
    {
        int i1 = r();
        int j1 = r();
        int k1 = r();
        int l1 = r();
        int i2 = r();
        int j2 = r();
        int k2 = r();
        int l2 = r();
        long l3 = i1;
        return ((long)j1 & 255L) << 8 | l3 & 255L | ((long)k1 & 255L) << 16 | ((long)l1 & 255L) << 24 | ((long)i2 & 255L) << 32 | ((long)j2 & 255L) << 40 | ((long)k2 & 255L) << 48 | ((long)l2 & 255L) << 56;
    }

    private void q()
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

    private byte r()
    {
        if (e == c)
        {
            throw fdn.a();
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
        f = k();
        if (f == 0)
        {
            throw fdn.d();
        } else
        {
            return f;
        }
    }

    public void a(int i1)
    {
        if (f != i1)
        {
            throw fdn.e();
        } else
        {
            return;
        }
    }

    public void a(fdo fdo1)
    {
        int i1 = k();
        if (h >= i)
        {
            throw fdn.g();
        } else
        {
            i1 = c(i1);
            h = h + 1;
            fdo1.a(this);
            a(0);
            h = h - 1;
            d(i1);
            return;
        }
    }

    public byte[] a(int i1, int j1)
    {
        if (j1 == 0)
        {
            return fdq.h;
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
        return Double.longBitsToDouble(p());
    }

    public boolean b(int i1)
    {
        switch (fdq.a(i1))
        {
        default:
            throw fdn.f();

        case 0: // '\0'
            e();
            return true;

        case 1: // '\001'
            p();
            return true;

        case 2: // '\002'
            g(k());
            return true;

        case 3: // '\003'
            int j1;
            do
            {
                j1 = a();
            } while (j1 != 0 && b(j1));
            a(fdq.a(fdq.b(i1), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            o();
            return true;
        }
    }

    public float c()
    {
        return Float.intBitsToFloat(o());
    }

    public int c(int i1)
    {
        if (i1 < 0)
        {
            throw fdn.b();
        }
        i1 = e + i1;
        int j1 = g;
        if (i1 > j1)
        {
            throw fdn.a();
        } else
        {
            g = i1;
            q();
            return j1;
        }
    }

    public long d()
    {
        return n();
    }

    public void d(int i1)
    {
        g = i1;
        q();
    }

    public int e()
    {
        return k();
    }

    public void e(int i1)
    {
        if (i1 > e - b)
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i1).append(" is beyond current ").append(e - b).toString());
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad position ")).append(i1).toString());
        } else
        {
            e = b + i1;
            return;
        }
    }

    public boolean f()
    {
        return k() != 0;
    }

    public String g()
    {
        int i1 = k();
        if (i1 <= c - e && i1 > 0)
        {
            String s = new String(a, e, i1, "UTF-8");
            e = i1 + e;
            return s;
        } else
        {
            return new String(f(i1), "UTF-8");
        }
    }

    public byte[] h()
    {
        int i1 = k();
        if (i1 <= c - e && i1 > 0)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = i1 + e;
            return abyte0;
        } else
        {
            return f(i1);
        }
    }

    public int i()
    {
        int i1 = k();
        return -(i1 & 1) ^ i1 >>> 1;
    }

    public long j()
    {
        long l1 = n();
        return -(l1 & 1L) ^ l1 >>> 1;
    }

    public int k()
    {
        int i1 = r();
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        i1 &= 0x7f;
        byte byte0 = r();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 7;
        }
        i1 |= (byte0 & 0x7f) << 7;
        byte0 = r();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 14;
        }
        i1 |= (byte0 & 0x7f) << 14;
        int k1 = r();
        if (k1 >= 0)
        {
            return i1 | k1 << 21;
        }
        byte0 = r();
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
                    if (r() >= 0)
                    {
                        break label0;
                    }
                    j1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw fdn.c();
    }

    public int l()
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

    public int m()
    {
        return e - b;
    }
}
