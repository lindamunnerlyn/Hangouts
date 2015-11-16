// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class liw extends kwm
{

    public String a[];
    public Boolean b;

    public liw()
    {
        a = kwx.f;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = 0;
        int k1 = super.computeSerializedSize();
        int k;
        if (a != null && a.length > 0)
        {
            int j = 0;
            int l;
            int i1;
            for (l = 0; i < a.length; l = i1)
            {
                String s = a[i];
                int j1 = j;
                i1 = l;
                if (s != null)
                {
                    i1 = l + 1;
                    j1 = j + kwk.a(s);
                }
                i++;
                j = j1;
            }

            i = k1 + j + l * 1;
        } else
        {
            i = k1;
        }
        k = i;
        if (b != null)
        {
            b.booleanValue();
            k = i + (kwk.f(2) + 1);
        }
        return k;
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
                int k = kwx.a(kwj1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = kwj1.j();
                    kwj1.a();
                }

                as[k] = kwj1.j();
                a = as;
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    kwk1.a(1, s);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
