// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iov extends kwm
{

    public String a;
    public ijl b[];
    public lcf c;
    public Long d;
    public String e;

    public iov()
    {
        a = null;
        b = ijl.a();
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
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
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ijl ijl1 = b[j];
                    int k = i;
                    if (ijl1 != null)
                    {
                        k = i + kwk.d(2, ijl1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.e(4, d.longValue());
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.b(5, e);
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
                int k = kwx.a(kwj1, 18);
                ijl aijl[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aijl = new ijl[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aijl, 0, j);
                    k = j;
                }
                for (; k < aijl.length - 1; k++)
                {
                    aijl[k] = new ijl();
                    kwj1.a(aijl[k]);
                    kwj1.a();
                }

                aijl[k] = new ijl();
                kwj1.a(aijl[k]);
                b = aijl;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new lcf();
                }
                kwj1.a(c);
                break;

            case 32: // ' '
                d = Long.valueOf(kwj1.e());
                break;

            case 42: // '*'
                e = kwj1.j();
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ijl ijl1 = b[i];
                if (ijl1 != null)
                {
                    kwk1.b(2, ijl1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        super.writeTo(kwk1);
    }
}
