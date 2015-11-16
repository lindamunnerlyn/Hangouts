// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iht extends kwm
{

    public igw a;
    public ihu b;
    public igw c[];

    public iht()
    {
        a = null;
        b = null;
        c = igw.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.d(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    igw igw1 = c[j];
                    int k = i;
                    if (igw1 != null)
                    {
                        k = i + kwk.d(3, igw1);
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
                if (a == null)
                {
                    a = new igw();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ihu();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                igw aigw[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aigw = new igw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aigw, 0, j);
                    k = j;
                }
                for (; k < aigw.length - 1; k++)
                {
                    aigw[k] = new igw();
                    kwj1.a(aigw[k]);
                    kwj1.a();
                }

                aigw[k] = new igw();
                kwj1.a(aigw[k]);
                c = aigw;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                igw igw1 = c[i];
                if (igw1 != null)
                {
                    kwk1.b(3, igw1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
