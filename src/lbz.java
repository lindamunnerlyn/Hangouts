// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbz extends kwm
{

    public lao a[];
    public lao b[];
    public boolean c[];

    public lbz()
    {
        a = lao.a();
        b = lao.a();
        c = kwx.e;
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    lao lao1 = a[j];
                    int k = i;
                    if (lao1 != null)
                    {
                        k = i + kwk.d(1, lao1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    lao lao2 = b[l];
                    j = i;
                    if (lao2 != null)
                    {
                        j = i + kwk.d(2, lao2);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j + c.length * 1 + c.length * 1;
            }
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
                int j1 = kwx.a(kwj1, 10);
                lao alao[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alao = new lao[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alao, 0, j);
                    j1 = j;
                }
                for (; j1 < alao.length - 1; j1++)
                {
                    alao[j1] = new lao();
                    kwj1.a(alao[j1]);
                    kwj1.a();
                }

                alao[j1] = new lao();
                kwj1.a(alao[j1]);
                a = alao;
                break;

            case 18: // '\022'
                int k1 = kwx.a(kwj1, 18);
                lao alao1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                alao1 = new lao[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, alao1, 0, k);
                    k1 = k;
                }
                for (; k1 < alao1.length - 1; k1++)
                {
                    alao1[k1] = new lao();
                    kwj1.a(alao1[k1]);
                    kwj1.a();
                }

                alao1[k1] = new lao();
                kwj1.a(alao1[k1]);
                b = alao1;
                break;

            case 24: // '\030'
                int l1 = kwx.a(kwj1, 24);
                boolean aflag[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aflag = new boolean[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aflag, 0, l);
                    l1 = l;
                }
                for (; l1 < aflag.length - 1; l1++)
                {
                    aflag[l1] = kwj1.i();
                    kwj1.a();
                }

                aflag[l1] = kwj1.i();
                c = aflag;
                break;

            case 26: // '\032'
                int j2 = kwj1.c(kwj1.p());
                int i1 = kwj1.r();
                int i2;
                for (i2 = 0; kwj1.q() > 0; i2++)
                {
                    kwj1.i();
                }

                kwj1.e(i1);
                boolean aflag1[];
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                aflag1 = new boolean[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, aflag1, 0, i1);
                    i2 = i1;
                }
                for (; i2 < aflag1.length; i2++)
                {
                    aflag1[i2] = kwj1.i();
                }

                c = aflag1;
                kwj1.d(j2);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                lao lao1 = a[i];
                if (lao1 != null)
                {
                    kwk1.b(1, lao1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                lao lao2 = b[j];
                if (lao2 != null)
                {
                    kwk1.b(2, lao2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                kwk1.a(3, c[k]);
            }

        }
        super.writeTo(kwk1);
    }
}
