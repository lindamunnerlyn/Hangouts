// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksc extends kwm
{

    public kqb a;
    public String b;
    public krc c;
    public krc d[];
    public krc e[];

    public ksc()
    {
        a = null;
        b = null;
        c = null;
        d = krc.a();
        e = krc.a();
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
            i = j + kwk.d(1, a);
        }
        int i1 = i;
        if (b != null)
        {
            i1 = i + kwk.b(2, b);
        }
        j = i1;
        if (c != null)
        {
            j = i1 + kwk.d(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (int k = 0; k < d.length;)
                {
                    krc krc1 = d[k];
                    i1 = i;
                    if (krc1 != null)
                    {
                        i1 = i + kwk.d(5, krc1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        i1 = i;
        if (e != null)
        {
            i1 = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    krc krc2 = e[l];
                    i1 = i;
                    if (krc2 != null)
                    {
                        i1 = i + kwk.d(6, krc2);
                    }
                    l++;
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new kqb();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new krc();
                }
                kwj1.a(c);
                break;

            case 42: // '*'
                int l = kwx.a(kwj1, 42);
                krc akrc[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                akrc = new krc[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, akrc, 0, j);
                    l = j;
                }
                for (; l < akrc.length - 1; l++)
                {
                    akrc[l] = new krc();
                    kwj1.a(akrc[l]);
                    kwj1.a();
                }

                akrc[l] = new krc();
                kwj1.a(akrc[l]);
                d = akrc;
                break;

            case 50: // '2'
                int i1 = kwx.a(kwj1, 50);
                krc akrc1[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                akrc1 = new krc[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, akrc1, 0, k);
                    i1 = k;
                }
                for (; i1 < akrc1.length - 1; i1++)
                {
                    akrc1[i1] = new krc();
                    kwj1.a(akrc1[i1]);
                    kwj1.a();
                }

                akrc1[i1] = new krc();
                kwj1.a(akrc1[i1]);
                e = akrc1;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                krc krc1 = d[i];
                if (krc1 != null)
                {
                    kwk1.b(5, krc1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                krc krc2 = e[j];
                if (krc2 != null)
                {
                    kwk1.b(6, krc2);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
