// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibr extends kwm
{

    public ibg a;
    public ibs b[];
    public String c;
    public String d;
    public ibs e;
    public String f;
    public String g;

    public ibr()
    {
        a = null;
        b = ibs.a();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ibs ibs1 = b[j];
                    int k = i;
                    if (ibs1 != null)
                    {
                        k = i + kwk.d(2, ibs1);
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
            i = j + kwk.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.b(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.b(7, g);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new ibg();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                ibs aibs[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aibs = new ibs[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aibs, 0, j);
                    k = j;
                }
                for (; k < aibs.length - 1; k++)
                {
                    aibs[k] = new ibs();
                    kwj1.a(aibs[k]);
                    kwj1.a();
                }

                aibs[k] = new ibs();
                kwj1.a(aibs[k]);
                b = aibs;
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new ibs();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                f = kwj1.j();
                break;

            case 58: // ':'
                g = kwj1.j();
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ibs ibs1 = b[i];
                if (ibs1 != null)
                {
                    kwk1.b(2, ibs1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        super.writeTo(kwk1);
    }
}
