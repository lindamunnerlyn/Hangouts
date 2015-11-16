// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jjj extends kwm
{

    public String a;
    public String b;
    public String c;
    public jif d;
    public String e[];
    public jdk requestHeader;

    public jjj()
    {
        requestHeader = null;
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
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.b(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.b(4, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(5, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < e.length;)
                {
                    String s = e[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + kwk.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
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
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 18: // '\022'
                a = kwj1.j();
                break;

            case 26: // '\032'
                b = kwj1.j();
                break;

            case 34: // '"'
                c = kwj1.j();
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new jif();
                }
                kwj1.a(d);
                break;

            case 50: // '2'
                int k = kwx.a(kwj1, 50);
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
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.a(2, a);
        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        if (d != null)
        {
            kwk1.b(5, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    kwk1.a(6, s);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
