// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ios extends kwm
{

    public String a;
    public igw b[];
    public lcd c;
    public Long d;
    public String e;

    public ios()
    {
        a = null;
        b = igw.a();
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
                    igw igw1 = b[j];
                    int k = i;
                    if (igw1 != null)
                    {
                        k = i + kwk.d(2, igw1);
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
                igw aigw[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aigw = new igw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aigw, 0, j);
                    k = j;
                }
                for (; k < aigw.length - 1; k++)
                {
                    aigw[k] = new igw();
                    kwj1.a(aigw[k]);
                    kwj1.a();
                }

                aigw[k] = new igw();
                kwj1.a(aigw[k]);
                b = aigw;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new lcd();
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
                igw igw1 = b[i];
                if (igw1 != null)
                {
                    kwk1.b(2, igw1);
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
