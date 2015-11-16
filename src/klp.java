// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;

public abstract class klp
    implements Serializable, Iterable
{

    public static final klp a = new kmw(new byte[0]);

    klp()
    {
    }

    public static klp a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return new kmw(abyte1);
    }

    public abstract int a();

    protected abstract int a(int i, int j, int k);

    void a(OutputStream outputstream, int i, int j)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(30)).append("Source offset < 0: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(23)).append("Length < 0: ").append(j).toString());
        }
        if (i + j > a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder(39)).append("Source end offset exceeded: ").append(i + j).toString());
        }
        if (j > 0)
        {
            b(outputstream, i, j);
        }
    }

    protected abstract void a(byte abyte0[], int i, int j, int k);

    abstract void b(OutputStream outputstream, int i, int j);

    public void b(byte abyte0[], int i, int j, int k)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(30)).append("Source offset < 0: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(30)).append("Target offset < 0: ").append(j).toString());
        }
        if (k < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(23)).append("Length < 0: ").append(k).toString());
        }
        if (i + k > a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder(34)).append("Source end offset < 0: ").append(i + k).toString());
        }
        if (j + k > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(34)).append("Target end offset < 0: ").append(j + k).toString());
        }
        if (k > 0)
        {
            a(abyte0, i, j, k);
        }
    }

    public abstract klq c();

    public boolean d()
    {
        return a() == 0;
    }

    public byte[] e()
    {
        int i = a();
        if (i == 0)
        {
            return kmn.c;
        } else
        {
            byte abyte0[] = new byte[i];
            a(abyte0, 0, 0, i);
            return abyte0;
        }
    }

    public abstract klr f();

    protected abstract int g();

    public Iterator iterator()
    {
        return c();
    }

    public String toString()
    {
        return String.format("<ByteString@%s size=%d>", new Object[] {
            Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a())
        });
    }

}
