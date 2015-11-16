// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jak extends kwm
{

    public Boolean a;
    public byte b[];
    public jaj c[];

    public jak()
    {
        a = null;
        b = null;
        c = jaj.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            a.booleanValue();
            j = i + (kwk.f(1) + 1);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    jaj jaj1 = c[j];
                    int k = i;
                    if (jaj1 != null)
                    {
                        k = i + kwk.d(3, jaj1);
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

            case 8: // '\b'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 18: // '\022'
                b = kwj1.k();
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                jaj ajaj[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ajaj = new jaj[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ajaj, 0, j);
                    k = j;
                }
                for (; k < ajaj.length - 1; k++)
                {
                    ajaj[k] = new jaj();
                    kwj1.a(ajaj[k]);
                    kwj1.a();
                }

                ajaj[k] = new jaj();
                kwj1.a(ajaj[k]);
                c = ajaj;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jaj jaj1 = c[i];
                if (jaj1 != null)
                {
                    kwk1.b(3, jaj1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
