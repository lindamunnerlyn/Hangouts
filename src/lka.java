// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lka extends kwm
{

    public String a;
    public Integer b;
    public lkb c[];

    public lka()
    {
        a = null;
        b = null;
        c = lkb.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    lkb lkb1 = c[j];
                    int k = i;
                    if (lkb1 != null)
                    {
                        k = i + kwk.d(3, lkb1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
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

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                lkb alkb[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                alkb = new lkb[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, alkb, 0, j);
                    k = j;
                }
                for (; k < alkb.length - 1; k++)
                {
                    alkb[k] = new lkb();
                    kwj1.a(alkb[k]);
                    kwj1.a();
                }

                alkb[k] = new lkb();
                kwj1.a(alkb[k]);
                c = alkb;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                lkb lkb1 = c[i];
                if (lkb1 != null)
                {
                    kwk1.b(3, lkb1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
