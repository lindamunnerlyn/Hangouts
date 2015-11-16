// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.SparseArray;

public final class acp
{

    static final byte a[] = "from-data".getBytes();
    static final byte b[] = "attachment".getBytes();
    static final byte c[] = "inline".getBytes();
    private SparseArray d;
    private Uri e;
    private byte f[];

    public acp()
    {
        d = null;
        e = null;
        f = null;
        d = new SparseArray();
    }

    public void a(int k)
    {
        d.put(129, Integer.valueOf(k));
    }

    public void a(Uri uri)
    {
        e = uri;
    }

    public void a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return;
        } else
        {
            f = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, f, 0, abyte0.length);
            return;
        }
    }

    public byte[] a()
    {
        if (f == null)
        {
            return null;
        } else
        {
            byte abyte0[] = new byte[f.length];
            System.arraycopy(f, 0, abyte0, 0, f.length);
            return abyte0;
        }
    }

    public Uri b()
    {
        return e;
    }

    public void b(byte abyte0[])
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            throw new IllegalArgumentException("Content-Id may not be null or empty.");
        }
        if (abyte0.length > 1 && (char)abyte0[0] == '<' && (char)abyte0[abyte0.length - 1] == '>')
        {
            d.put(192, abyte0);
            return;
        } else
        {
            byte abyte1[] = new byte[abyte0.length + 2];
            abyte1[0] = 60;
            abyte1[abyte1.length - 1] = 62;
            System.arraycopy(abyte0, 0, abyte1, 1, abyte0.length);
            d.put(192, abyte1);
            return;
        }
    }

    public void c(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-location");
        } else
        {
            d.put(142, abyte0);
            return;
        }
    }

    public byte[] c()
    {
        return (byte[])d.get(192);
    }

    public int d()
    {
        Integer integer = (Integer)d.get(129);
        if (integer == null)
        {
            return 0;
        } else
        {
            return integer.intValue();
        }
    }

    public void d(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-disposition");
        } else
        {
            d.put(197, abyte0);
            return;
        }
    }

    public void e(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-type");
        } else
        {
            d.put(145, abyte0);
            return;
        }
    }

    public byte[] e()
    {
        return (byte[])d.get(142);
    }

    public void f(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-transfer-encoding");
        } else
        {
            d.put(200, abyte0);
            return;
        }
    }

    public byte[] f()
    {
        return (byte[])d.get(197);
    }

    public void g(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-id");
        } else
        {
            d.put(151, abyte0);
            return;
        }
    }

    public byte[] g()
    {
        return (byte[])d.get(145);
    }

    public void h(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-id");
        } else
        {
            d.put(152, abyte0);
            return;
        }
    }

    public byte[] h()
    {
        return (byte[])d.get(200);
    }

    public byte[] i()
    {
        return (byte[])d.get(151);
    }

    public byte[] j()
    {
        return (byte[])d.get(152);
    }

}
