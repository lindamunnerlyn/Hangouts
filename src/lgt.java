// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lgt extends kwm
{

    public lgs a;
    public Long b;
    public String c;
    public String d;
    public lhe e[];
    public lkr f;

    public lgt()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = lhe.a();
        f = null;
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
            j = i + kwk.e(2, b.longValue());
        }
        int k = j;
        if (c != null)
        {
            k = j + kwk.b(3, c);
        }
        i = k;
        if (d != null)
        {
            i = k + kwk.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    lhe lhe1 = e[j];
                    int l = i;
                    if (lhe1 != null)
                    {
                        l = i + kwk.d(5, lhe1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.d(6, f);
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
                    a = new lgs();
                }
                kwj1.a(a);
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.e());
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                int k = kwx.a(kwj1, 42);
                lhe alhe[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                alhe = new lhe[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, alhe, 0, j);
                    k = j;
                }
                for (; k < alhe.length - 1; k++)
                {
                    alhe[k] = new lhe();
                    kwj1.a(alhe[k]);
                    kwj1.a();
                }

                alhe[k] = new lhe();
                kwj1.a(alhe[k]);
                e = alhe;
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new lkr();
                }
                kwj1.a(f);
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
            kwk1.b(2, b.longValue());
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                lhe lhe1 = e[i];
                if (lhe1 != null)
                {
                    kwk1.b(5, lhe1);
                }
            }

        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        super.writeTo(kwk1);
    }
}
