// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihy extends kwm
{

    public igw a;
    public igw b[];
    public ihu c;

    public ihy()
    {
        a = null;
        b = igw.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(4, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    igw igw1 = b[j];
                    int k = i;
                    if (igw1 != null)
                    {
                        k = i + kwk.d(5, igw1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(6, c);
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

            case 34: // '"'
                if (a == null)
                {
                    a = new igw();
                }
                kwj1.a(a);
                break;

            case 42: // '*'
                int k = kwx.a(kwj1, 42);
                igw aigw[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aigw = new igw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aigw, 0, j);
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
                b = aigw;
                break;

            case 50: // '2'
                if (c == null)
                {
                    c = new ihu();
                }
                kwj1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(4, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                igw igw1 = b[i];
                if (igw1 != null)
                {
                    kwk1.b(5, igw1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(6, c);
        }
        super.writeTo(kwk1);
    }
}
