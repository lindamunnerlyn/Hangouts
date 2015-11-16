// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwj extends kwm
{

    public izg a;
    public jax b[];
    public byte c[];
    public Long d;
    public jdk requestHeader;

    public iwj()
    {
        requestHeader = null;
        a = null;
        b = jax.a();
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (requestHeader != null)
        {
            j = i + kwk.d(1, requestHeader);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(2, c);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    jax jax1 = b[j];
                    int k = i;
                    if (jax1 != null)
                    {
                        k = i + kwk.d(3, jax1);
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
            i = j + kwk.d(4, d.longValue());
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(5, a);
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
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 18: // '\022'
                c = kwj1.k();
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                jax ajax[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajax = new jax[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajax, 0, j);
                    k = j;
                }
                for (; k < ajax.length - 1; k++)
                {
                    ajax[k] = new jax();
                    kwj1.a(ajax[k]);
                    kwj1.a();
                }

                ajax[k] = new jax();
                kwj1.a(ajax[k]);
                b = ajax;
                break;

            case 32: // ' '
                d = Long.valueOf(kwj1.d());
                break;

            case 42: // '*'
                if (a == null)
                {
                    a = new izg();
                }
                kwj1.a(a);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jax jax1 = b[i];
                if (jax1 != null)
                {
                    kwk1.b(3, jax1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d.longValue());
        }
        if (a != null)
        {
            kwk1.b(5, a);
        }
        super.writeTo(kwk1);
    }
}
