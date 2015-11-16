// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwx extends kwm
{

    private static volatile iwx f[];
    public lcv a[];
    public jbl b;
    public jbg c;
    public izn d;
    public jfd e;

    public iwx()
    {
        a = lcv.a();
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iwx[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new iwx[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    lcv lcv1 = a[k];
                    j = i;
                    if (lcv1 != null)
                    {
                        j = i + kwk.d(1, lcv1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(5, e);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = kwx.a(kwj1, 10);
                lcv alcv[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alcv = new lcv[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alcv, 0, j);
                    k = j;
                }
                for (; k < alcv.length - 1; k++)
                {
                    alcv[k] = new lcv();
                    kwj1.a(alcv[k]);
                    kwj1.a();
                }

                alcv[k] = new lcv();
                kwj1.a(alcv[k]);
                a = alcv;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new jbl();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new jbg();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new izn();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new jfd();
                }
                kwj1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                lcv lcv1 = a[i];
                if (lcv1 != null)
                {
                    kwk1.b(1, lcv1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        super.writeTo(kwk1);
    }
}
