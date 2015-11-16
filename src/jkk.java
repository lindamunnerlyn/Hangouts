// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jkk extends kwm
{

    public jif a;
    public jiw b[];
    public jkj c[];
    public jkj d;

    public jkk()
    {
        a = null;
        b = jiw.a();
        c = jkj.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.d(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (j = 0; j < b.length;)
                {
                    jiw jiw1 = b[j];
                    int k = i;
                    if (jiw1 != null)
                    {
                        k = i + kwk.d(2, jiw1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    jkj jkj1 = c[l];
                    j = i;
                    if (jkj1 != null)
                    {
                        j = i + kwk.d(3, jkj1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
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
                    a = new jif();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                jiw ajiw[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajiw = new jiw[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajiw, 0, j);
                    l = j;
                }
                for (; l < ajiw.length - 1; l++)
                {
                    ajiw[l] = new jiw();
                    kwj1.a(ajiw[l]);
                    kwj1.a();
                }

                ajiw[l] = new jiw();
                kwj1.a(ajiw[l]);
                b = ajiw;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                jkj ajkj[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajkj = new jkj[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ajkj, 0, k);
                    i1 = k;
                }
                for (; i1 < ajkj.length - 1; i1++)
                {
                    ajkj[i1] = new jkj();
                    kwj1.a(ajkj[i1]);
                    kwj1.a();
                }

                ajkj[i1] = new jkj();
                kwj1.a(ajkj[i1]);
                c = ajkj;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jkj();
                }
                kwj1.a(d);
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jiw jiw1 = b[i];
                if (jiw1 != null)
                {
                    kwk1.b(2, jiw1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                jkj jkj1 = c[j];
                if (jkj1 != null)
                {
                    kwk1.b(3, jkj1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        super.writeTo(kwk1);
    }
}
