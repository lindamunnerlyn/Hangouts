// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jgs extends kwm
{

    public String a;
    public String b;
    public jif c;
    public String d;
    public String e[];
    public jic f[];
    public jdk requestHeader;

    public jgs()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = kwx.f;
        f = jic.a();
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
        int l = i;
        if (c != null)
        {
            l = i + kwk.d(4, c);
        }
        j = l;
        if (d != null)
        {
            j = l + kwk.b(5, d);
        }
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                i = 0;
                l = 0;
                int i1;
                int j1;
                for (i1 = 0; i < e.length; i1 = j1)
                {
                    String s = e[i];
                    int k1 = l;
                    j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + kwk.a(s);
                    }
                    i++;
                    l = k1;
                }

                i = j + l + i1 * 1;
            }
        }
        l = i;
        if (f != null)
        {
            l = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    l = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    jic jic1 = f[k];
                    l = i;
                    if (jic1 != null)
                    {
                        l = i + kwk.d(7, jic1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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
                if (c == null)
                {
                    c = new jif();
                }
                kwj1.a(c);
                break;

            case 42: // '*'
                d = kwj1.j();
                break;

            case 50: // '2'
                int l = kwx.a(kwj1, 50);
                String as[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kwj1.j();
                    kwj1.a();
                }

                as[l] = kwj1.j();
                e = as;
                break;

            case 58: // ':'
                int i1 = kwx.a(kwj1, 58);
                jic ajic[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                ajic = new jic[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, ajic, 0, k);
                    i1 = k;
                }
                for (; i1 < ajic.length - 1; i1++)
                {
                    ajic[i1] = new jic();
                    kwj1.a(ajic[i1]);
                    kwj1.a();
                }

                ajic[i1] = new jic();
                kwj1.a(ajic[i1]);
                f = ajic;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
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
            kwk1.b(4, c);
        }
        if (d != null)
        {
            kwk1.a(5, d);
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
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                jic jic1 = f[j];
                if (jic1 != null)
                {
                    kwk1.b(7, jic1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
