// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jar extends kwm
{

    public Integer a;
    public Long b;
    public iya c[];

    public jar()
    {
        a = null;
        b = null;
        c = iya.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.f(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    iya iya1 = c[j];
                    int k = i;
                    if (iya1 != null)
                    {
                        k = i + kwk.d(3, iya1);
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
                a = Integer.valueOf(kwj1.l());
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.d());
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                iya aiya[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aiya = new iya[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aiya, 0, j);
                    k = j;
                }
                for (; k < aiya.length - 1; k++)
                {
                    aiya[k] = new iya();
                    kwj1.a(aiya[k]);
                    kwj1.a();
                }

                aiya[k] = new iya();
                kwj1.a(aiya[k]);
                c = aiya;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.c(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.longValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                iya iya1 = c[i];
                if (iya1 != null)
                {
                    kwk1.b(3, iya1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
