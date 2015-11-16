// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;

final class kvk extends InputStream
{

    final kvh a;
    private kvi b;
    private kuz c;
    private int d;
    private int e;
    private int f;
    private int g;

    public kvk(kvh kvh1)
    {
        a = kvh1;
        super();
        a();
    }

    private int a(byte abyte0[], int i, int j)
    {
        int k = j;
        int i1 = i;
        i = k;
        for (int l = i1; i > 0; l = i1)
        {
            b();
            if (c == null)
            {
                if (i == j)
                {
                    return -1;
                }
                break;
            }
            int j1 = Math.min(d - e, i);
            i1 = l;
            if (abyte0 != null)
            {
                c.b(abyte0, e, l, j1);
                i1 = l + j1;
            }
            e = e + j1;
            i -= j1;
        }

        return j - i;
    }

    private void a()
    {
        b = new kvi(a);
        c = b.a();
        d = c.a();
        e = 0;
        f = 0;
    }

    private void b()
    {
label0:
        {
            if (c != null && e == d)
            {
                f = f + d;
                e = 0;
                if (!b.hasNext())
                {
                    break label0;
                }
                c = b.a();
                d = c.a();
            }
            return;
        }
        c = null;
        d = 0;
    }

    public int available()
    {
        int i = f;
        int j = e;
        return a.a() - (i + j);
    }

    public void mark(int i)
    {
        g = f + e;
    }

    public boolean markSupported()
    {
        return true;
    }

    public int read()
    {
        b();
        if (c == null)
        {
            return -1;
        } else
        {
            kuz kuz1 = c;
            int i = e;
            e = i + 1;
            return kuz1.a(i) & 0xff;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException();
        }
        if (i < 0 || j < 0 || j > abyte0.length - i)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return a(abyte0, i, j);
        }
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        a();
        a(null, 0, g);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long skip(long l)
    {
        if (l < 0L)
        {
            throw new IndexOutOfBoundsException();
        }
        long l1 = l;
        if (l > 0x7fffffffL)
        {
            l1 = 0x7fffffffL;
        }
        return (long)a(null, 0, (int)l1);
    }
}
