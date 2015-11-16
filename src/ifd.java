// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifd extends kwm
{

    public String a;
    public ife b[];

    public ifd()
    {
        a = null;
        b = ife.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ife ife1 = b[j];
                    int k = i;
                    if (ife1 != null)
                    {
                        k = i + kwk.d(2, ife1);
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

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                ife aife[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aife = new ife[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aife, 0, j);
                    k = j;
                }
                for (; k < aife.length - 1; k++)
                {
                    aife[k] = new ife();
                    kwj1.a(aife[k]);
                    kwj1.a();
                }

                aife[k] = new ife();
                kwj1.a(aife[k]);
                b = aife;
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ife ife1 = b[i];
                if (ife1 != null)
                {
                    kwk1.b(2, ife1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
