// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jis extends kwm
{

    private static volatile jis f[];
    public Long a;
    public String b;
    public String c;
    public String d[];
    public jit e[];

    public jis()
    {
        a = null;
        b = null;
        c = null;
        d = kwx.f;
        e = jit.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jis[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new jis[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.longValue());
        }
        int l = i;
        if (b != null)
        {
            l = i + kwk.b(2, b);
        }
        j = l;
        if (c != null)
        {
            j = l + kwk.b(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = 0;
                l = 0;
                int i1;
                int j1;
                for (i1 = 0; i < d.length; i1 = j1)
                {
                    String s = d[i];
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
        if (e != null)
        {
            l = i;
            if (e.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    l = i;
                    if (k >= e.length)
                    {
                        break;
                    }
                    jit jit1 = e[k];
                    l = i;
                    if (jit1 != null)
                    {
                        l = i + kwk.d(5, jit1);
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

            case 8: // '\b'
                a = Long.valueOf(kwj1.e());
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                int l = kwx.a(kwj1, 34);
                String as[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kwj1.j();
                    kwj1.a();
                }

                as[l] = kwj1.j();
                d = as;
                break;

            case 42: // '*'
                int i1 = kwx.a(kwj1, 42);
                jit ajit[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                ajit = new jit[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, ajit, 0, k);
                    i1 = k;
                }
                for (; i1 < ajit.length - 1; i1++)
                {
                    ajit[i1] = new jit();
                    kwj1.a(ajit[i1]);
                    kwj1.a();
                }

                ajit[i1] = new jit();
                kwj1.a(ajit[i1]);
                e = ajit;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a.longValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                String s = d[i];
                if (s != null)
                {
                    kwk1.a(4, s);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                jit jit1 = e[j];
                if (jit1 != null)
                {
                    kwk1.b(5, jit1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
