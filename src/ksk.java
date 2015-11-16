// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksk extends kwm
{

    public kkc a;
    public String b;
    public ksi c;
    public ksi d[];
    public ksi e[];

    public ksk()
    {
        a = null;
        b = null;
        c = null;
        d = ksi.a();
        e = ksi.a();
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
                    ksi ksi1 = d[k];
                    i1 = i;
                    if (ksi1 != null)
                    {
                        i1 = i + kwk.d(5, ksi1);
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
                    ksi ksi2 = e[l];
                    i1 = i;
                    if (ksi2 != null)
                    {
                        i1 = i + kwk.d(6, ksi2);
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
                    a = new kkc();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ksi();
                }
                kwj1.a(c);
                break;

            case 42: // '*'
                int l = kwx.a(kwj1, 42);
                ksi aksi[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                aksi = new ksi[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, aksi, 0, j);
                    l = j;
                }
                for (; l < aksi.length - 1; l++)
                {
                    aksi[l] = new ksi();
                    kwj1.a(aksi[l]);
                    kwj1.a();
                }

                aksi[l] = new ksi();
                kwj1.a(aksi[l]);
                d = aksi;
                break;

            case 50: // '2'
                int i1 = kwx.a(kwj1, 50);
                ksi aksi1[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aksi1 = new ksi[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, aksi1, 0, k);
                    i1 = k;
                }
                for (; i1 < aksi1.length - 1; i1++)
                {
                    aksi1[i1] = new ksi();
                    kwj1.a(aksi1[i1]);
                    kwj1.a();
                }

                aksi1[i1] = new ksi();
                kwj1.a(aksi1[i1]);
                e = aksi1;
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
                ksi ksi1 = d[i];
                if (ksi1 != null)
                {
                    kwk1.b(5, ksi1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                ksi ksi2 = e[j];
                if (ksi2 != null)
                {
                    kwk1.b(6, ksi2);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
