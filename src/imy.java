// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class imy extends kwm
{

    public String a;
    public imz b[];

    public imy()
    {
        a = null;
        b = imz.a();
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
                    imz imz1 = b[j];
                    int k = i;
                    if (imz1 != null)
                    {
                        k = i + kwk.d(2, imz1);
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
                imz aimz[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aimz = new imz[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aimz, 0, j);
                    k = j;
                }
                for (; k < aimz.length - 1; k++)
                {
                    aimz[k] = new imz();
                    kwj1.a(aimz[k]);
                    kwj1.a();
                }

                aimz[k] = new imz();
                kwj1.a(aimz[k]);
                b = aimz;
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
                imz imz1 = b[i];
                if (imz1 != null)
                {
                    kwk1.b(2, imz1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
