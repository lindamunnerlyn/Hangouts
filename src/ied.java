// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ied extends kwm
{

    public String a;
    public lay b;
    public Boolean c;
    public kec d;
    public String e[];

    public ied()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kwx.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + kwk.d(1, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(2) + 1);
        }
        int k = j;
        if (d != null)
        {
            k = j + kwk.d(3, d);
        }
        i = k;
        if (a != null)
        {
            i = k + kwk.b(4, a);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < e.length;)
                {
                    String s = e[j];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + kwk.a(s);
                    }
                    j++;
                    l = k1;
                    i1 = j1;
                }

                j = i + l + i1 * 1;
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
                if (b == null)
                {
                    b = new lay();
                }
                kwj1.a(b);
                break;

            case 16: // '\020'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new kec();
                }
                kwj1.a(d);
                break;

            case 34: // '"'
                a = kwj1.j();
                break;

            case 42: // '*'
                int k = kwx.a(kwj1, 42);
                String as[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = kwj1.j();
                    kwj1.a();
                }

                as[k] = kwj1.j();
                e = as;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.b(1, b);
        }
        if (c != null)
        {
            kwk1.a(2, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.b(3, d);
        }
        if (a != null)
        {
            kwk1.a(4, a);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    kwk1.a(5, s);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
