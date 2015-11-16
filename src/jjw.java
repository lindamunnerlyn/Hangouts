// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jjw extends kwm
{

    public jkx a[];
    public jjv b[];

    public jjw()
    {
        a = jkx.a();
        b = jjv.a();
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
                for (int k = 0; k < a.length;)
                {
                    jkx jkx1 = a[k];
                    int i1 = i;
                    if (jkx1 != null)
                    {
                        i1 = i + kwk.d(2, jkx1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (b != null)
        {
            j1 = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    jjv jjv1 = b[l];
                    j1 = i;
                    if (jjv1 != null)
                    {
                        j1 = i + kwk.d(3, jjv1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                jkx ajkx[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajkx = new jkx[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajkx, 0, j);
                    l = j;
                }
                for (; l < ajkx.length - 1; l++)
                {
                    ajkx[l] = new jkx();
                    kwj1.a(ajkx[l]);
                    kwj1.a();
                }

                ajkx[l] = new jkx();
                kwj1.a(ajkx[l]);
                a = ajkx;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                jjv ajjv[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ajjv = new jjv[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ajjv, 0, k);
                    i1 = k;
                }
                for (; i1 < ajjv.length - 1; i1++)
                {
                    ajjv[i1] = new jjv();
                    kwj1.a(ajjv[i1]);
                    kwj1.a();
                }

                ajjv[i1] = new jjv();
                kwj1.a(ajjv[i1]);
                b = ajjv;
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
                jkx jkx1 = a[i];
                if (jkx1 != null)
                {
                    kwk1.b(2, jkx1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                jjv jjv1 = b[j];
                if (jjv1 != null)
                {
                    kwk1.b(3, jjv1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
