// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jlj extends kwm
{

    public Long a;
    public String b[];
    public jmg c[];
    public Boolean d;
    public String e;
    public Boolean f;

    public jlj()
    {
        a = null;
        b = kwx.f;
        c = jmg.a();
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                j = 0;
                int l = 0;
                int j1;
                int k1;
                for (j1 = 0; j < b.length; j1 = k1)
                {
                    String s = b[j];
                    int l1 = l;
                    k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = l + kwk.a(s);
                    }
                    j++;
                    l = l1;
                }

                j = i + l + j1 * 1;
            }
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (kwk.f(3) + 1);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.b(4, e);
        }
        i = j;
        if (f != null)
        {
            f.booleanValue();
            i = j + (kwk.f(5) + 1);
        }
        int i1 = i;
        if (c != null)
        {
            i1 = i;
            if (c.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= c.length)
                    {
                        break;
                    }
                    jmg jmg1 = c[k];
                    i1 = i;
                    if (jmg1 != null)
                    {
                        i1 = i + kwk.d(6, jmg1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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

            case 8: // '\b'
                a = Long.valueOf(kwj1.e());
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                String as[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kwj1.j();
                    kwj1.a();
                }

                as[l] = kwj1.j();
                b = as;
                break;

            case 24: // '\030'
                d = Boolean.valueOf(kwj1.i());
                break;

            case 34: // '"'
                e = kwj1.j();
                break;

            case 40: // '('
                f = Boolean.valueOf(kwj1.i());
                break;

            case 50: // '2'
                int i1 = kwx.a(kwj1, 50);
                jmg ajmg[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajmg = new jmg[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ajmg, 0, k);
                    i1 = k;
                }
                for (; i1 < ajmg.length - 1; i1++)
                {
                    ajmg[i1] = new jmg();
                    kwj1.a(ajmg[i1]);
                    kwj1.a();
                }

                ajmg[i1] = new jmg();
                kwj1.a(ajmg[i1]);
                c = ajmg;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    kwk1.a(2, s);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(3, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.a(5, f.booleanValue());
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                jmg jmg1 = c[j];
                if (jmg1 != null)
                {
                    kwk1.b(6, jmg1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
