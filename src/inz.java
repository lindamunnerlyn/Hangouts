// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class inz extends kwm
{

    public String a;
    public String b;
    public String c;
    public String d;
    public igw e[];
    public String f[];

    public inz()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = igw.a();
        f = kwx.f;
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        j += kwk.b(3, c);
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                i = j;
                for (j = 0; j < e.length;)
                {
                    igw igw1 = e[j];
                    int k = i;
                    if (igw1 != null)
                    {
                        k = i + kwk.d(4, igw1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < f.length;)
                {
                    String s = f[j];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + kwk.a(s);
                    }
                    j++;
                    l = k1;
                    i1 = j1;
                }

                j = i + l + i1 * 1;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(6, d);
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
                int l = kwx.a(kwj1, 34);
                igw aigw[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                aigw = new igw[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, aigw, 0, j);
                    l = j;
                }
                for (; l < aigw.length - 1; l++)
                {
                    aigw[l] = new igw();
                    kwj1.a(aigw[l]);
                    kwj1.a();
                }

                aigw[l] = new igw();
                kwj1.a(aigw[l]);
                e = aigw;
                break;

            case 42: // '*'
                int i1 = kwx.a(kwj1, 42);
                String as[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                as = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, as, 0, k);
                    i1 = k;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = kwj1.j();
                    kwj1.a();
                }

                as[i1] = kwj1.j();
                f = as;
                break;

            case 50: // '2'
                d = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        kwk1.a(3, c);
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                igw igw1 = e[i];
                if (igw1 != null)
                {
                    kwk1.b(4, igw1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                String s = f[j];
                if (s != null)
                {
                    kwk1.a(5, s);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(6, d);
        }
        super.writeTo(kwk1);
    }
}
