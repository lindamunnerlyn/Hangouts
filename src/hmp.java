// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class hmp
{

    private final int a = 3;
    public final byte b = 61;
    public final int c;
    public byte d[];
    public int e;
    public boolean f;
    public int g;
    public int h;
    private final int i = 4;
    private final int j;
    private int k;

    protected hmp(int l, int i1)
    {
        if (l > 0 && i1 > 0)
        {
            l = l / 4 << 2;
        } else
        {
            l = 0;
        }
        c = l;
        j = i1;
    }

    int a()
    {
        if (d != null)
        {
            return e - k;
        } else
        {
            return 0;
        }
    }

    int a(byte abyte0[], int l)
    {
        if (d != null)
        {
            l = Math.min(a(), l);
            System.arraycopy(d, k, abyte0, 0, l);
            k = k + l;
            if (k >= e)
            {
                d = null;
            }
            return l;
        }
        return !f ? 0 : -1;
    }

    protected void a(int l)
    {
label0:
        {
            if (d == null || d.length < e + l)
            {
                if (d != null)
                {
                    break label0;
                }
                d = new byte[8192];
                e = 0;
                k = 0;
            }
            return;
        }
        byte abyte0[] = new byte[d.length << 1];
        System.arraycopy(d, 0, abyte0, 0, d.length);
        d = abyte0;
    }

    abstract void a(byte abyte0[], int l, int i1);

    protected abstract boolean a(byte byte0);

    public byte[] c(byte abyte0[])
    {
        d = null;
        e = 0;
        k = 0;
        g = 0;
        h = 0;
        f = false;
        if (abyte0 == null || abyte0.length == 0)
        {
            return abyte0;
        } else
        {
            a(abyte0, 0, abyte0.length);
            a(abyte0, 0, -1);
            abyte0 = new byte[e - k];
            a(abyte0, abyte0.length);
            return abyte0;
        }
    }

    protected boolean d(byte abyte0[])
    {
        if (abyte0 != null)
        {
            int i1 = abyte0.length;
            int l = 0;
            while (l < i1) 
            {
                byte byte0 = abyte0[l];
                if (61 == byte0 || a(byte0))
                {
                    return true;
                }
                l++;
            }
        }
        return false;
    }

    public long e(byte abyte0[])
    {
        long l1 = (long)(((abyte0.length + a) - 1) / a) * (long)i;
        long l = l1;
        if (c > 0)
        {
            l = l1 + ((((long)c + l1) - 1L) / (long)c) * (long)j;
        }
        return l;
    }
}
