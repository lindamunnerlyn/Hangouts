// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jju extends kwm
{

    public jif a;
    public jgc b[];
    public jic c[];
    public jic d;

    public jju()
    {
        a = null;
        b = jgc.a();
        c = jic.a();
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
                    jgc jgc1 = b[j];
                    int k = i;
                    if (jgc1 != null)
                    {
                        k = i + kwk.d(2, jgc1);
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
                    jic jic1 = c[l];
                    j = i;
                    if (jic1 != null)
                    {
                        j = i + kwk.d(3, jic1);
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
                jgc ajgc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajgc = new jgc[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajgc, 0, j);
                    l = j;
                }
                for (; l < ajgc.length - 1; l++)
                {
                    ajgc[l] = new jgc();
                    kwj1.a(ajgc[l]);
                    kwj1.a();
                }

                ajgc[l] = new jgc();
                kwj1.a(ajgc[l]);
                b = ajgc;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                jic ajic[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajic = new jic[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ajic, 0, k);
                    i1 = k;
                }
                for (; i1 < ajic.length - 1; i1++)
                {
                    ajic[i1] = new jic();
                    kwj1.a(ajic[i1]);
                    kwj1.a();
                }

                ajic[i1] = new jic();
                kwj1.a(ajic[i1]);
                c = ajic;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jic();
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
                jgc jgc1 = b[i];
                if (jgc1 != null)
                {
                    kwk1.b(2, jgc1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                jic jic1 = c[j];
                if (jic1 != null)
                {
                    kwk1.b(3, jic1);
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
