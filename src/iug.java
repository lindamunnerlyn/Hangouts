// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iug extends kwm
{

    public String a;
    public String b;
    public Integer c;
    public Integer d;
    public iuh e[];

    public iug()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = iuh.a();
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
            j = i + kwk.b(2, b);
        }
        int k = j;
        if (c != null)
        {
            k = j + kwk.e(3, c.intValue());
        }
        i = k;
        if (d != null)
        {
            i = k + kwk.e(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    iuh iuh1 = e[j];
                    int l = i;
                    if (iuh1 != null)
                    {
                        l = i + kwk.c(5, iuh1);
                    }
                    j++;
                    i = l;
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
                b = kwj1.j();
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.f());
                break;

            case 43: // '+'
                int k = kwx.a(kwj1, 43);
                iuh aiuh[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                aiuh = new iuh[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, aiuh, 0, j);
                    k = j;
                }
                for (; k < aiuh.length - 1; k++)
                {
                    aiuh[k] = new iuh();
                    kwj1.a(aiuh[k], 5);
                    kwj1.a();
                }

                aiuh[k] = new iuh();
                kwj1.a(aiuh[k], 5);
                e = aiuh;
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
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                iuh iuh1 = e[i];
                if (iuh1 != null)
                {
                    kwk1.a(5, iuh1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
