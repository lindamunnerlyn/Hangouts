// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jax extends kwm
{

    private static volatile jax h[];
    public String a;
    public String b;
    public String c;
    public kbm d;
    public String e;
    public jay f[];
    public byte g[];

    public jax()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = jay.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jax[] a()
    {
        if (h == null)
        {
            synchronized (kwq.a)
            {
                if (h == null)
                {
                    h = new jax[0];
                }
            }
        }
        return h;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(3, c);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.b(4, e);
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.b(5, g);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    jay jay1 = f[j];
                    int k = i;
                    if (jay1 != null)
                    {
                        k = i + kwk.d(6, jay1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(7, d);
        }
        return i;
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                e = kwj1.j();
                break;

            case 42: // '*'
                g = kwj1.k();
                break;

            case 50: // '2'
                int k = kwx.a(kwj1, 50);
                jay ajay[];
                int j;
                if (f == null)
                {
                    j = 0;
                } else
                {
                    j = f.length;
                }
                ajay = new jay[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(f, 0, ajay, 0, j);
                    k = j;
                }
                for (; k < ajay.length - 1; k++)
                {
                    ajay[k] = new jay();
                    kwj1.a(ajay[k]);
                    kwj1.a();
                }

                ajay[k] = new jay();
                kwj1.a(ajay[k]);
                f = ajay;
                break;

            case 58: // ':'
                if (d == null)
                {
                    d = new kbm();
                }
                kwj1.a(d);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (g != null)
        {
            kwk1.a(5, g);
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                jay jay1 = f[i];
                if (jay1 != null)
                {
                    kwk1.b(6, jay1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(7, d);
        }
        super.writeTo(kwk1);
    }
}
