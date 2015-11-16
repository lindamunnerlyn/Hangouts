// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihn extends kwm
{

    public ijl a;
    public ijl b[];
    public ihj c;

    public ihn()
    {
        a = null;
        b = ijl.a();
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
                    ijl ijl1 = b[j];
                    int k = i;
                    if (ijl1 != null)
                    {
                        k = i + kwk.d(5, ijl1);
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
                    a = new ijl();
                }
                kwj1.a(a);
                break;

            case 42: // '*'
                int k = kwx.a(kwj1, 42);
                ijl aijl[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aijl = new ijl[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aijl, 0, j);
                    k = j;
                }
                for (; k < aijl.length - 1; k++)
                {
                    aijl[k] = new ijl();
                    kwj1.a(aijl[k]);
                    kwj1.a();
                }

                aijl[k] = new ijl();
                kwj1.a(aijl[k]);
                b = aijl;
                break;

            case 50: // '2'
                if (c == null)
                {
                    c = new ihj();
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
                ijl ijl1 = b[i];
                if (ijl1 != null)
                {
                    kwk1.b(5, ijl1);
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
