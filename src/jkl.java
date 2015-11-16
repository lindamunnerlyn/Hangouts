// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jkl extends kwm
{

    public jif a;
    public jiz b[];
    public jie c[];
    public jie d;

    public jkl()
    {
        a = null;
        b = jiz.a();
        c = jie.a();
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
                    jiz jiz1 = b[j];
                    int k = i;
                    if (jiz1 != null)
                    {
                        k = i + kwk.d(2, jiz1);
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
                    jie jie1 = c[l];
                    j = i;
                    if (jie1 != null)
                    {
                        j = i + kwk.d(3, jie1);
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
                jiz ajiz[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajiz = new jiz[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajiz, 0, j);
                    l = j;
                }
                for (; l < ajiz.length - 1; l++)
                {
                    ajiz[l] = new jiz();
                    kwj1.a(ajiz[l]);
                    kwj1.a();
                }

                ajiz[l] = new jiz();
                kwj1.a(ajiz[l]);
                b = ajiz;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                jie ajie[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajie = new jie[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ajie, 0, k);
                    i1 = k;
                }
                for (; i1 < ajie.length - 1; i1++)
                {
                    ajie[i1] = new jie();
                    kwj1.a(ajie[i1]);
                    kwj1.a();
                }

                ajie[i1] = new jie();
                kwj1.a(ajie[i1]);
                c = ajie;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jie();
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
                jiz jiz1 = b[i];
                if (jiz1 != null)
                {
                    kwk1.b(2, jiz1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                jie jie1 = c[j];
                if (jie1 != null)
                {
                    kwk1.b(3, jie1);
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
