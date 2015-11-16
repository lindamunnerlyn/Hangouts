// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lht extends kwm
{

    public lhc a;
    public lhu b;
    public Long c;
    public Long d;
    public Integer e;
    public lhu f[];
    public lhc g;

    public lht()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = lhu.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.e(4, d.longValue());
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.f(5, e.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    lhu lhu1 = f[j];
                    int k = i;
                    if (lhu1 != null)
                    {
                        k = i + kwk.d(6, lhu1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.d(7, g);
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
                if (a == null)
                {
                    a = new lhc();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new lhu();
                }
                kwj1.a(b);
                break;

            case 24: // '\030'
                c = Long.valueOf(kwj1.e());
                break;

            case 32: // ' '
                d = Long.valueOf(kwj1.e());
                break;

            case 40: // '('
                e = Integer.valueOf(kwj1.l());
                break;

            case 50: // '2'
                int k = kwx.a(kwj1, 50);
                lhu alhu[];
                int j;
                if (f == null)
                {
                    j = 0;
                } else
                {
                    j = f.length;
                }
                alhu = new lhu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(f, 0, alhu, 0, j);
                    k = j;
                }
                for (; k < alhu.length - 1; k++)
                {
                    alhu[k] = new lhu();
                    kwj1.a(alhu[k]);
                    kwj1.a();
                }

                alhu[k] = new lhu();
                kwj1.a(alhu[k]);
                f = alhu;
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new lhc();
                }
                kwj1.a(g);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c.longValue());
        }
        if (d != null)
        {
            kwk1.b(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.c(5, e.intValue());
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                lhu lhu1 = f[i];
                if (lhu1 != null)
                {
                    kwk1.b(6, lhu1);
                }
            }

        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        super.writeTo(kwk1);
    }
}
