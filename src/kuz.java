// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import java.util.Iterator;

class kuz extends kts
{

    private static final long serialVersionUID = 1L;
    public final byte b[];
    private int c;

    kuz(byte abyte0[])
    {
        c = 0;
        b = abyte0;
    }

    public byte a(int i)
    {
        return b[i];
    }

    public int a()
    {
        return b.length;
    }

    protected int a(int i, int j, int k)
    {
        byte abyte0[] = b;
        int l = b() + j;
        for (j = l; j < l + k; j++)
        {
            i = i * 31 + abyte0[j];
        }

        return i;
    }

    protected void a(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(b, i, abyte0, j, k);
    }

    boolean a(kuz kuz1, int i, int j)
    {
        if (j > kuz1.a())
        {
            i = a();
            throw new IllegalArgumentException((new StringBuilder(40)).append("Length too large: ").append(j).append(i).toString());
        }
        if (i + j > kuz1.a())
        {
            int k = kuz1.a();
            throw new IllegalArgumentException((new StringBuilder(59)).append("Ran off end of other: ").append(i).append(", ").append(j).append(", ").append(k).toString());
        }
        byte abyte0[] = b;
        byte abyte1[] = kuz1.b;
        int i1 = b();
        int l = b();
        for (i = kuz1.b() + i; l < i1 + j; i++)
        {
            if (abyte0[l] != abyte1[i])
            {
                return false;
            }
            l++;
        }

        return true;
    }

    protected int b()
    {
        return 0;
    }

    void b(OutputStream outputstream, int i, int j)
    {
        outputstream.write(b, b() + i, j);
    }

    public ktt c()
    {
        return new kva(this);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof kts))
        {
            return false;
        }
        if (a() != ((kts)obj).a())
        {
            return false;
        }
        if (a() == 0)
        {
            return true;
        }
        if (obj instanceof kuz)
        {
            kuz kuz1 = (kuz)obj;
            if (c != 0 && kuz1.c != 0 && c != kuz1.c)
            {
                return false;
            } else
            {
                return a((kuz)obj, 0, a());
            }
        }
        if (obj instanceof kvh)
        {
            return obj.equals(this);
        } else
        {
            obj = String.valueOf(obj.getClass());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 49)).append("Has a new type of ByteString been created? Found ").append(((String) (obj))).toString());
        }
    }

    public ktu f()
    {
        return ktu.a(this);
    }

    protected int g()
    {
        return c;
    }

    public int hashCode()
    {
        int j = c;
        int i = j;
        if (j == 0)
        {
            i = a();
            int k = a(i, 0, i);
            i = k;
            if (k == 0)
            {
                i = 1;
            }
            c = i;
        }
        return i;
    }

    public Iterator iterator()
    {
        return c();
    }
}
