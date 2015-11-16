// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksa extends kwm
{

    public krw a[];
    public krw b[];

    public ksa()
    {
        a = krw.a();
        b = krw.a();
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
                    krw krw1 = a[k];
                    int i1 = i;
                    if (krw1 != null)
                    {
                        i1 = i + kwk.d(4, krw1);
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
                    krw krw2 = b[l];
                    j1 = i;
                    if (krw2 != null)
                    {
                        j1 = i + kwk.d(5, krw2);
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

            case 34: // '"'
                int l = kwx.a(kwj1, 34);
                krw akrw[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akrw = new krw[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akrw, 0, j);
                    l = j;
                }
                for (; l < akrw.length - 1; l++)
                {
                    akrw[l] = new krw();
                    kwj1.a(akrw[l]);
                    kwj1.a();
                }

                akrw[l] = new krw();
                kwj1.a(akrw[l]);
                a = akrw;
                break;

            case 42: // '*'
                int i1 = kwx.a(kwj1, 42);
                krw akrw1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                akrw1 = new krw[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, akrw1, 0, k);
                    i1 = k;
                }
                for (; i1 < akrw1.length - 1; i1++)
                {
                    akrw1[i1] = new krw();
                    kwj1.a(akrw1[i1]);
                    kwj1.a();
                }

                akrw1[i1] = new krw();
                kwj1.a(akrw1[i1]);
                b = akrw1;
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
                krw krw1 = a[i];
                if (krw1 != null)
                {
                    kwk1.b(4, krw1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                krw krw2 = b[j];
                if (krw2 != null)
                {
                    kwk1.b(5, krw2);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
