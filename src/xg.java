// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class xg
{

    long a;
    xg b;

    xg()
    {
        a = 0L;
    }

    private void b()
    {
        if (b == null)
        {
            b = new xg();
        }
    }

    private void e(int i)
    {
label0:
        {
            xg xg1 = this;
            for (; i >= 64; i -= 64)
            {
                if (xg1.b == null)
                {
                    break label0;
                }
                xg1 = xg1.b;
            }

            xg1.a = xg1.a & ~(1L << i);
        }
    }

    void a()
    {
        a = 0L;
        if (b != null)
        {
            b.a();
        }
    }

    void a(int i)
    {
        if (i >= 64)
        {
            b();
            b.a(i - 64);
            return;
        } else
        {
            a = a | 1L << i;
            return;
        }
    }

    void a(int i, boolean flag)
    {
        if (i >= 64)
        {
            b();
            b.a(i - 64, flag);
        } else
        {
            long l;
            long l1;
            boolean flag1;
            if ((a & 0x8000000000000000L) != 0L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            l = (1L << i) - 1L;
            l1 = a;
            a = (~l & a) << 1 | l1 & l;
            if (flag)
            {
                a(i);
            } else
            {
                e(i);
            }
            if (flag1 || b != null)
            {
                b();
                b.a(0, flag1);
                return;
            }
        }
    }

    boolean b(int i)
    {
        if (i >= 64)
        {
            b();
            return b.b(i - 64);
        }
        return (a & 1L << i) != 0L;
    }

    boolean c(int i)
    {
        boolean flag1;
        if (i >= 64)
        {
            b();
            flag1 = b.c(i - 64);
        } else
        {
            long l = 1L << i;
            long l1;
            boolean flag;
            if ((a & l) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = a & ~l;
            l--;
            l1 = a;
            a = Long.rotateRight(~l & a, 1) | l1 & l;
            flag1 = flag;
            if (b != null)
            {
                if (b.b(0))
                {
                    a(63);
                }
                b.c(0);
                return flag;
            }
        }
        return flag1;
    }

    int d(int i)
    {
        if (b == null)
        {
            if (i >= 64)
            {
                return Long.bitCount(a);
            } else
            {
                return Long.bitCount(a & (1L << i) - 1L);
            }
        }
        if (i < 64)
        {
            return Long.bitCount(a & (1L << i) - 1L);
        } else
        {
            return b.d(i - 64) + Long.bitCount(a);
        }
    }

    public String toString()
    {
        if (b == null)
        {
            return Long.toBinaryString(a);
        } else
        {
            return (new StringBuilder()).append(b.toString()).append("xx").append(Long.toBinaryString(a)).toString();
        }
    }
}
